package com.jcraft.jsch;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class JSch {
    private static final Logger DEVNULL;
    public static final String VERSION = "0.1.54";
    static Hashtable config;
    static Logger logger;
    private ConfigRepository configRepository;
    private IdentityRepository defaultIdentityRepository;
    private IdentityRepository identityRepository;
    private HostKeyRepository known_hosts;
    private Vector sessionPool = new Vector();

    static {
        Hashtable hashtable = new Hashtable();
        config = hashtable;
        hashtable.put("kex", "ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1");
        config.put("server_host_key", "ssh-rsa,ssh-dss,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521");
        config.put("cipher.s2c", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc");
        config.put("cipher.c2s", "aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc");
        config.put("mac.s2c", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96");
        config.put("mac.c2s", "hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96");
        config.put("compression.s2c", "none");
        config.put("compression.c2s", "none");
        config.put("lang.s2c", "");
        config.put("lang.c2s", "");
        config.put("compression_level", "6");
        config.put("diffie-hellman-group-exchange-sha1", "com.jcraft.jsch.DHGEX");
        config.put("diffie-hellman-group1-sha1", "com.jcraft.jsch.DHG1");
        config.put("diffie-hellman-group14-sha1", "com.jcraft.jsch.DHG14");
        config.put("diffie-hellman-group-exchange-sha256", "com.jcraft.jsch.DHGEX256");
        config.put("ecdsa-sha2-nistp256", "com.jcraft.jsch.jce.SignatureECDSA256");
        config.put("ecdsa-sha2-nistp384", "com.jcraft.jsch.jce.SignatureECDSA384");
        config.put("ecdsa-sha2-nistp521", "com.jcraft.jsch.jce.SignatureECDSA521");
        config.put("ecdh-sha2-nistp256", "com.jcraft.jsch.DHEC256");
        config.put("ecdh-sha2-nistp384", "com.jcraft.jsch.DHEC384");
        config.put("ecdh-sha2-nistp521", "com.jcraft.jsch.DHEC521");
        config.put("ecdh-sha2-nistp", "com.jcraft.jsch.jce.ECDHN");
        config.put("dh", "com.jcraft.jsch.jce.DH");
        config.put("3des-cbc", "com.jcraft.jsch.jce.TripleDESCBC");
        config.put("blowfish-cbc", "com.jcraft.jsch.jce.BlowfishCBC");
        config.put("hmac-sha1", "com.jcraft.jsch.jce.HMACSHA1");
        config.put("hmac-sha1-96", "com.jcraft.jsch.jce.HMACSHA196");
        config.put("hmac-sha2-256", "com.jcraft.jsch.jce.HMACSHA256");
        config.put("hmac-md5", "com.jcraft.jsch.jce.HMACMD5");
        config.put("hmac-md5-96", "com.jcraft.jsch.jce.HMACMD596");
        config.put("sha-1", "com.jcraft.jsch.jce.SHA1");
        config.put("sha-256", "com.jcraft.jsch.jce.SHA256");
        config.put("sha-384", "com.jcraft.jsch.jce.SHA384");
        config.put("sha-512", "com.jcraft.jsch.jce.SHA512");
        config.put("md5", "com.jcraft.jsch.jce.MD5");
        config.put("signature.dss", "com.jcraft.jsch.jce.SignatureDSA");
        config.put("signature.rsa", "com.jcraft.jsch.jce.SignatureRSA");
        config.put("keypairgen.dsa", "com.jcraft.jsch.jce.KeyPairGenDSA");
        config.put("keypairgen.rsa", "com.jcraft.jsch.jce.KeyPairGenRSA");
        config.put("keypairgen.ecdsa", "com.jcraft.jsch.jce.KeyPairGenECDSA");
        config.put("random", "com.jcraft.jsch.jce.Random");
        config.put("none", "com.jcraft.jsch.CipherNone");
        config.put("aes128-cbc", "com.jcraft.jsch.jce.AES128CBC");
        config.put("aes192-cbc", "com.jcraft.jsch.jce.AES192CBC");
        config.put("aes256-cbc", "com.jcraft.jsch.jce.AES256CBC");
        config.put("aes128-ctr", "com.jcraft.jsch.jce.AES128CTR");
        config.put("aes192-ctr", "com.jcraft.jsch.jce.AES192CTR");
        config.put("aes256-ctr", "com.jcraft.jsch.jce.AES256CTR");
        config.put("3des-ctr", "com.jcraft.jsch.jce.TripleDESCTR");
        config.put("arcfour", "com.jcraft.jsch.jce.ARCFOUR");
        config.put("arcfour128", "com.jcraft.jsch.jce.ARCFOUR128");
        config.put("arcfour256", "com.jcraft.jsch.jce.ARCFOUR256");
        config.put("userauth.none", "com.jcraft.jsch.UserAuthNone");
        config.put("userauth.password", "com.jcraft.jsch.UserAuthPassword");
        config.put("userauth.keyboard-interactive", "com.jcraft.jsch.UserAuthKeyboardInteractive");
        config.put("userauth.publickey", "com.jcraft.jsch.UserAuthPublicKey");
        config.put("userauth.gssapi-with-mic", "com.jcraft.jsch.UserAuthGSSAPIWithMIC");
        config.put("gssapi-with-mic.krb5", "com.jcraft.jsch.jgss.GSSContextKrb5");
        config.put("zlib", "com.jcraft.jsch.jcraft.Compression");
        config.put("zlib@openssh.com", "com.jcraft.jsch.jcraft.Compression");
        config.put("pbkdf", "com.jcraft.jsch.jce.PBKDF");
        config.put("StrictHostKeyChecking", "ask");
        config.put("HashKnownHosts", "no");
        config.put("PreferredAuthentications", "gssapi-with-mic,publickey,keyboard-interactive,password");
        config.put("CheckCiphers", "aes256-ctr,aes192-ctr,aes128-ctr,aes256-cbc,aes192-cbc,aes128-cbc,3des-ctr,arcfour,arcfour128,arcfour256");
        config.put("CheckKexes", "diffie-hellman-group14-sha1,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521");
        config.put("CheckSignatures", "ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521");
        config.put("MaxAuthTries", "6");
        config.put("ClearAllForwardings", "no");
        Logger logger2 = new Logger() { // from class: com.jcraft.jsch.JSch.1
            @Override // com.jcraft.jsch.Logger
            public boolean isEnabled(int i) {
                return false;
            }

            @Override // com.jcraft.jsch.Logger
            public void log(int i, String str) {
            }
        };
        DEVNULL = logger2;
        logger = logger2;
    }

    public JSch() {
        LocalIdentityRepository localIdentityRepository = new LocalIdentityRepository(this);
        this.defaultIdentityRepository = localIdentityRepository;
        this.identityRepository = localIdentityRepository;
        this.configRepository = null;
        this.known_hosts = null;
    }

    public static String getConfig(String str) {
        String str2;
        synchronized (config) {
            str2 = (String) config.get(str);
        }
        return str2;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setConfig(Hashtable hashtable) {
        synchronized (config) {
            try {
                Enumeration enumerationKeys = hashtable.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str = (String) enumerationKeys.nextElement();
                    config.put(str, (String) hashtable.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setLogger(Logger logger2) {
        if (logger2 == null) {
            logger2 = DEVNULL;
        }
        logger = logger2;
    }

    public void addIdentity(String str) throws Throwable {
        addIdentity(str, (byte[]) null);
    }

    public void addSession(Session session) {
        synchronized (this.sessionPool) {
            this.sessionPool.addElement(session);
        }
    }

    public ConfigRepository getConfigRepository() {
        return this.configRepository;
    }

    public HostKeyRepository getHostKeyRepository() {
        if (this.known_hosts == null) {
            this.known_hosts = new KnownHosts(this);
        }
        return this.known_hosts;
    }

    public Vector getIdentityNames() {
        Vector vector = new Vector();
        Vector identities = this.identityRepository.getIdentities();
        for (int i = 0; i < identities.size(); i++) {
            vector.addElement(((Identity) identities.elementAt(i)).getName());
        }
        return vector;
    }

    public synchronized IdentityRepository getIdentityRepository() {
        return this.identityRepository;
    }

    public Session getSession(String str) {
        return getSession(null, str, 22);
    }

    public void removeAllIdentity() {
        this.identityRepository.removeAll();
    }

    public void removeIdentity(String str) {
        Vector identities = this.identityRepository.getIdentities();
        for (int i = 0; i < identities.size(); i++) {
            Identity identity = (Identity) identities.elementAt(i);
            if (identity.getName().equals(str)) {
                IdentityRepository identityRepository = this.identityRepository;
                if (identityRepository instanceof LocalIdentityRepository) {
                    ((LocalIdentityRepository) identityRepository).remove(identity);
                } else {
                    identityRepository.remove(identity.getPublicKeyBlob());
                }
            }
        }
    }

    public boolean removeSession(Session session) {
        boolean zRemove;
        synchronized (this.sessionPool) {
            zRemove = this.sessionPool.remove(session);
        }
        return zRemove;
    }

    public void setConfigRepository(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public void setHostKeyRepository(HostKeyRepository hostKeyRepository) {
        this.known_hosts = hostKeyRepository;
    }

    public synchronized void setIdentityRepository(IdentityRepository identityRepository) {
        try {
            if (identityRepository == null) {
                this.identityRepository = this.defaultIdentityRepository;
            } else {
                this.identityRepository = identityRepository;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setKnownHosts(String str) {
        if (this.known_hosts == null) {
            this.known_hosts = new KnownHosts(this);
        }
        HostKeyRepository hostKeyRepository = this.known_hosts;
        if (hostKeyRepository instanceof KnownHosts) {
            synchronized (hostKeyRepository) {
                ((KnownHosts) this.known_hosts).setKnownHosts(str);
            }
        }
    }

    public void addIdentity(String str, String str2) throws Throwable {
        byte[] bArrStr2byte = str2 != null ? Util.str2byte(str2) : null;
        addIdentity(str, bArrStr2byte);
        if (bArrStr2byte != null) {
            Util.bzero(bArrStr2byte);
        }
    }

    public Session getSession(String str, String str2) {
        return getSession(str, str2, 22);
    }

    public Session getSession(String str, String str2, int i) throws JSchException {
        if (str2 != null) {
            return new Session(this, str, str2, i);
        }
        throw new JSchException("host must not be null.");
    }

    public void addIdentity(String str, byte[] bArr) throws Throwable {
        addIdentity(IdentityFile.newInstance(str, null, this), bArr);
    }

    public static void setConfig(String str, String str2) {
        config.put(str, str2);
    }

    public void setKnownHosts(InputStream inputStream) {
        if (this.known_hosts == null) {
            this.known_hosts = new KnownHosts(this);
        }
        HostKeyRepository hostKeyRepository = this.known_hosts;
        if (hostKeyRepository instanceof KnownHosts) {
            synchronized (hostKeyRepository) {
                ((KnownHosts) this.known_hosts).setKnownHosts(inputStream);
            }
        }
    }

    public void addIdentity(String str, String str2, byte[] bArr) throws Throwable {
        addIdentity(IdentityFile.newInstance(str, str2, this), bArr);
    }

    public void removeIdentity(Identity identity) {
        this.identityRepository.remove(identity.getPublicKeyBlob());
    }

    public void addIdentity(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        addIdentity(IdentityFile.newInstance(str, bArr, bArr2, this), bArr3);
    }

    public void addIdentity(Identity identity, byte[] bArr) throws Throwable {
        if (bArr != null) {
            try {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                try {
                    identity.setPassphrase(bArr2);
                    Util.bzero(bArr2);
                } catch (Throwable th) {
                    th = th;
                    bArr = bArr2;
                    Util.bzero(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        IdentityRepository identityRepository = this.identityRepository;
        if (identityRepository instanceof LocalIdentityRepository) {
            ((LocalIdentityRepository) identityRepository).add(identity);
            return;
        }
        if ((identity instanceof IdentityFile) && !identity.isEncrypted()) {
            this.identityRepository.add(((IdentityFile) identity).getKeyPair().forSSHAgent());
            return;
        }
        synchronized (this) {
            try {
                IdentityRepository identityRepository2 = this.identityRepository;
                if (!(identityRepository2 instanceof IdentityRepository.Wrapper)) {
                    setIdentityRepository(new IdentityRepository.Wrapper(identityRepository2));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ((IdentityRepository.Wrapper) this.identityRepository).add(identity);
    }
}
