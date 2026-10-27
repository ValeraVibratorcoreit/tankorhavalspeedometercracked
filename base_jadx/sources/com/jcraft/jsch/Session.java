package com.jcraft.jsch;

import defpackage.Vo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class Session implements Runnable {
    private static final int PACKET_MAX_SIZE = 262144;
    static final int SSH_MSG_CHANNEL_CLOSE = 97;
    static final int SSH_MSG_CHANNEL_DATA = 94;
    static final int SSH_MSG_CHANNEL_EOF = 96;
    static final int SSH_MSG_CHANNEL_EXTENDED_DATA = 95;
    static final int SSH_MSG_CHANNEL_FAILURE = 100;
    static final int SSH_MSG_CHANNEL_OPEN = 90;
    static final int SSH_MSG_CHANNEL_OPEN_CONFIRMATION = 91;
    static final int SSH_MSG_CHANNEL_OPEN_FAILURE = 92;
    static final int SSH_MSG_CHANNEL_REQUEST = 98;
    static final int SSH_MSG_CHANNEL_SUCCESS = 99;
    static final int SSH_MSG_CHANNEL_WINDOW_ADJUST = 93;
    static final int SSH_MSG_DEBUG = 4;
    static final int SSH_MSG_DISCONNECT = 1;
    static final int SSH_MSG_GLOBAL_REQUEST = 80;
    static final int SSH_MSG_IGNORE = 2;
    static final int SSH_MSG_KEXDH_INIT = 30;
    static final int SSH_MSG_KEXDH_REPLY = 31;
    static final int SSH_MSG_KEXINIT = 20;
    static final int SSH_MSG_KEX_DH_GEX_GROUP = 31;
    static final int SSH_MSG_KEX_DH_GEX_INIT = 32;
    static final int SSH_MSG_KEX_DH_GEX_REPLY = 33;
    static final int SSH_MSG_KEX_DH_GEX_REQUEST = 34;
    static final int SSH_MSG_NEWKEYS = 21;
    static final int SSH_MSG_REQUEST_FAILURE = 82;
    static final int SSH_MSG_REQUEST_SUCCESS = 81;
    static final int SSH_MSG_SERVICE_ACCEPT = 6;
    static final int SSH_MSG_SERVICE_REQUEST = 5;
    static final int SSH_MSG_UNIMPLEMENTED = 3;
    static final int buffer_margin = 128;
    private static final byte[] keepalivemsg = Util.str2byte("keepalive@jcraft.com");
    private static final byte[] nomoresessions = Util.str2byte("no-more-sessions@openssh.com");
    static Random random;
    private byte[] Ec2s;
    private byte[] Es2c;
    private byte[] IVc2s;
    private byte[] IVs2c;
    private byte[] I_C;
    private byte[] I_S;
    private byte[] K_S;
    private byte[] MACc2s;
    private byte[] MACs2c;
    private byte[] V_S;
    Buffer buf;
    private Cipher c2scipher;
    private MAC c2smac;
    private Compression deflater;
    String host;
    private Compression inflater;
    private IO io;
    JSch jsch;
    String org_host;
    Packet packet;
    int port;
    private Cipher s2ccipher;
    private MAC s2cmac;
    private byte[] s2cmac_result1;
    private byte[] s2cmac_result2;
    private byte[] session_id;
    private Socket socket;
    Runnable thread;
    private UserInfo userinfo;
    String username;
    private byte[] V_C = Util.str2byte("SSH-2.0-JSCH-0.1.54");
    private int seqi = 0;
    private int seqo = 0;
    String[] guess = null;
    private int timeout = 0;
    private volatile boolean isConnected = false;
    private boolean isAuthed = false;
    private Thread connectThread = null;
    private Object lock = new Object();
    boolean x11_forwarding = false;
    boolean agent_forwarding = false;
    InputStream in = null;
    OutputStream out = null;
    SocketFactory socket_factory = null;
    private Hashtable config = null;
    private Proxy proxy = null;
    private String hostKeyAlias = null;
    private int serverAliveInterval = 0;
    private int serverAliveCountMax = 1;
    private IdentityRepository identityRepository = null;
    private HostKeyRepository hostkeyRepository = null;
    protected boolean daemon_thread = false;
    private long kex_start_time = 0;
    int max_auth_tries = 6;
    int auth_failures = 0;
    byte[] password = null;
    private volatile boolean in_kex = false;
    private volatile boolean in_prompt = false;
    int[] uncompress_len = new int[1];
    int[] compress_len = new int[1];
    private int s2ccipher_size = 8;
    private int c2scipher_size = 8;
    private GlobalRequestReply grr = new GlobalRequestReply();
    private HostKey hostkey = null;

    public class Forwarding {
        String bind_address;
        String host;
        int hostport;
        int port;

        private Forwarding() {
            this.bind_address = null;
            this.port = -1;
            this.host = null;
            this.hostport = -1;
        }
    }

    public class GlobalRequestReply {
        private int port;
        private int reply;
        private Thread thread;

        private GlobalRequestReply() {
            this.thread = null;
            this.reply = -1;
            this.port = 0;
        }

        public int getPort() {
            return this.port;
        }

        public int getReply() {
            return this.reply;
        }

        public Thread getThread() {
            return this.thread;
        }

        public void setPort(int i) {
            this.port = i;
        }

        public void setReply(int i) {
            this.reply = i;
        }

        public void setThread(Thread thread) {
            this.thread = thread;
            this.reply = -1;
        }
    }

    public Session(JSch jSch, String str, String str2, int i) throws Throwable {
        this.host = "127.0.0.1";
        this.org_host = "127.0.0.1";
        this.port = 22;
        this.username = null;
        this.jsch = jSch;
        Buffer buffer = new Buffer();
        this.buf = buffer;
        this.packet = new Packet(buffer);
        this.username = str;
        this.host = str2;
        this.org_host = str2;
        this.port = i;
        applyConfig();
        if (this.username == null) {
            try {
                this.username = (String) System.getProperties().get("user.name");
            } catch (SecurityException unused) {
            }
        }
        if (this.username == null) {
            throw new JSchException("username is not given.");
        }
    }

    private int _setPortForwardingR(String str, int i) {
        int port;
        synchronized (this.grr) {
            Buffer buffer = new Buffer(SSH_MSG_CHANNEL_FAILURE);
            Packet packet = new Packet(buffer);
            String strNormalize = ChannelForwardedTCPIP.normalize(str);
            this.grr.setThread(Thread.currentThread());
            this.grr.setPort(i);
            try {
                packet.reset();
                buffer.putByte((byte) 80);
                buffer.putString(Util.str2byte("tcpip-forward"));
                buffer.putByte((byte) 1);
                buffer.putString(Util.str2byte(strNormalize));
                buffer.putInt(i);
                write(packet);
                int reply = this.grr.getReply();
                int i2 = 0;
                while (i2 < 10 && reply == -1) {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception unused) {
                    }
                    i2++;
                    reply = this.grr.getReply();
                }
                this.grr.setThread(null);
                if (reply != 1) {
                    throw new JSchException("remote port forwarding failed for listen port " + i);
                }
                port = this.grr.getPort();
            } catch (Exception e) {
                this.grr.setThread(null);
                throw new JSchException(e.toString(), e);
            }
        }
        return port;
    }

    private void _write(Packet packet) {
        synchronized (this.lock) {
            try {
                encode(packet);
                IO io = this.io;
                if (io != null) {
                    io.put(packet);
                    this.seqo++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void applyConfig() throws Throwable {
        String user;
        ConfigRepository configRepository = this.jsch.getConfigRepository();
        if (configRepository == null) {
            return;
        }
        ConfigRepository.Config config = configRepository.getConfig(this.org_host);
        if (this.username == null && (user = config.getUser()) != null) {
            this.username = user;
        }
        String hostname = config.getHostname();
        if (hostname != null) {
            this.host = hostname;
        }
        int port = config.getPort();
        if (port != -1) {
            this.port = port;
        }
        checkConfig(config, "kex");
        checkConfig(config, "server_host_key");
        checkConfig(config, "cipher.c2s");
        checkConfig(config, "cipher.s2c");
        checkConfig(config, "mac.c2s");
        checkConfig(config, "mac.s2c");
        checkConfig(config, "compression.c2s");
        checkConfig(config, "compression.s2c");
        checkConfig(config, "compression_level");
        checkConfig(config, "StrictHostKeyChecking");
        checkConfig(config, "HashKnownHosts");
        checkConfig(config, "PreferredAuthentications");
        checkConfig(config, "MaxAuthTries");
        checkConfig(config, "ClearAllForwardings");
        String value = config.getValue("HostKeyAlias");
        if (value != null) {
            setHostKeyAlias(value);
        }
        String value2 = config.getValue("UserKnownHostsFile");
        if (value2 != null) {
            KnownHosts knownHosts = new KnownHosts(this.jsch);
            knownHosts.setKnownHosts(value2);
            setHostKeyRepository(knownHosts);
        }
        String[] values = config.getValues("IdentityFile");
        if (values != null) {
            String[] values2 = configRepository.getConfig("").getValues("IdentityFile");
            if (values2 != null) {
                for (String str : values2) {
                    this.jsch.addIdentity(str);
                }
            } else {
                values2 = new String[0];
            }
            if (values.length - values2.length > 0) {
                IdentityRepository.Wrapper wrapper = new IdentityRepository.Wrapper(this.jsch.getIdentityRepository(), true);
                for (String str2 : values) {
                    for (String str3 : values2) {
                        if (str2.equals(str3)) {
                            str2 = null;
                            break;
                        }
                    }
                    if (str2 != null) {
                        wrapper.add(IdentityFile.newInstance(str2, null, this.jsch));
                    }
                }
                setIdentityRepository(wrapper);
            }
        }
        String value3 = config.getValue("ServerAliveInterval");
        if (value3 != null) {
            try {
                setServerAliveInterval(Integer.parseInt(value3));
            } catch (NumberFormatException unused) {
            }
        }
        String value4 = config.getValue("ConnectTimeout");
        if (value4 != null) {
            try {
                setTimeout(Integer.parseInt(value4));
            } catch (NumberFormatException unused2) {
            }
        }
        String value5 = config.getValue("MaxAuthTries");
        if (value5 != null) {
            setConfig("MaxAuthTries", value5);
        }
        String value6 = config.getValue("ClearAllForwardings");
        if (value6 != null) {
            setConfig("ClearAllForwardings", value6);
        }
    }

    private void applyConfigChannel(ChannelSession channelSession) {
        ConfigRepository configRepository = this.jsch.getConfigRepository();
        if (configRepository == null) {
            return;
        }
        ConfigRepository.Config config = configRepository.getConfig(this.org_host);
        String value = config.getValue("ForwardAgent");
        if (value != null) {
            channelSession.setAgentForwarding(value.equals("yes"));
        }
        String value2 = config.getValue("RequestTTY");
        if (value2 != null) {
            channelSession.setPty(value2.equals("yes"));
        }
    }

    public static boolean checkCipher(String str) {
        try {
            Cipher cipher = (Cipher) Class.forName(str).newInstance();
            cipher.init(0, new byte[cipher.getBlockSize()], new byte[cipher.getIVSize()]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String[] checkCiphers(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "CheckCiphers: ".concat(str));
            }
            String config = getConfig("cipher.c2s");
            String config2 = getConfig("cipher.s2c");
            Vector vector = new Vector();
            for (String str2 : Util.split(str, ",")) {
                if ((config2.indexOf(str2) != -1 || config.indexOf(str2) != -1) && !checkCipher(getConfig(str2))) {
                    vector.addElement(str2);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (JSch.getLogger().isEnabled(1)) {
                for (int i = 0; i < size; i++) {
                    JSch.getLogger().log(1, strArr[i] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private void checkConfig(ConfigRepository.Config config, String str) {
        String value = config.getValue(str);
        if (value != null) {
            setConfig(str, value);
        }
    }

    private void checkHost(String str, int i, KeyExchange keyExchange) throws JSchException {
        int iCheck;
        String knownHostsRepositoryID;
        boolean zPromptYesNo;
        boolean z;
        String config = getConfig("StrictHostKeyChecking");
        String str2 = this.hostKeyAlias;
        if (str2 != null) {
            str = str2;
        }
        byte[] hostKey = keyExchange.getHostKey();
        String keyType = keyExchange.getKeyType();
        String fingerPrint = keyExchange.getFingerPrint();
        if (this.hostKeyAlias == null && i != 22) {
            str = "[" + str + "]:" + i;
        }
        HostKeyRepository hostKeyRepository = getHostKeyRepository();
        if (getConfig("HashKnownHosts").equals("yes") && (hostKeyRepository instanceof KnownHosts)) {
            this.hostkey = ((KnownHosts) hostKeyRepository).createHashedHostKey(str, hostKey);
        } else {
            this.hostkey = new HostKey(str, hostKey);
        }
        synchronized (hostKeyRepository) {
            iCheck = hostKeyRepository.check(str, hostKey);
        }
        if ((config.equals("ask") || config.equals("yes")) && iCheck == 2) {
            synchronized (hostKeyRepository) {
                knownHostsRepositoryID = hostKeyRepository.getKnownHostsRepositoryID();
            }
            if (knownHostsRepositoryID == null) {
                knownHostsRepositoryID = "known_hosts";
            }
            if (this.userinfo != null) {
                StringBuilder sb = new StringBuilder("WARNING: REMOTE HOST IDENTIFICATION HAS CHANGED!\nIT IS POSSIBLE THAT SOMEONE IS DOING SOMETHING NASTY!\nSomeone could be eavesdropping on you right now (man-in-the-middle attack)!\nIt is also possible that the ");
                sb.append(keyType);
                sb.append(" host key has just been changed.\nThe fingerprint for the ");
                sb.append(keyType);
                sb.append(" key sent by the remote host ");
                sb.append(str);
                sb.append(" is\n");
                sb.append(fingerPrint);
                sb.append(".\nPlease contact your system administrator.\nAdd correct host key in ");
                String strH = Vo.h(sb, knownHostsRepositoryID, " to get rid of this message.");
                if (config.equals("ask")) {
                    zPromptYesNo = this.userinfo.promptYesNo(strH + "\nDo you want to delete the old key and insert the new key?");
                } else {
                    this.userinfo.showMessage(strH);
                    zPromptYesNo = false;
                }
            } else {
                zPromptYesNo = false;
            }
            if (!zPromptYesNo) {
                throw new JSchException("HostKey has been changed: " + str);
            }
            synchronized (hostKeyRepository) {
                hostKeyRepository.remove(str, keyExchange.getKeyAlgorithName(), null);
            }
            z = true;
        } else {
            z = false;
        }
        if ((config.equals("ask") || config.equals("yes")) && iCheck != 0 && !z) {
            if (config.equals("yes")) {
                throw new JSchException("reject HostKey: " + this.host);
            }
            UserInfo userInfo = this.userinfo;
            if (userInfo == null) {
                if (iCheck != 1) {
                    throw new JSchException("HostKey has been changed: " + this.host);
                }
                throw new JSchException("UnknownHostKey: " + this.host + ". " + keyType + " key fingerprint is " + fingerPrint);
            }
            if (!userInfo.promptYesNo("The authenticity of host '" + this.host + "' can't be established.\n" + keyType + " key fingerprint is " + fingerPrint + ".\nAre you sure you want to continue connecting?")) {
                throw new JSchException("reject HostKey: " + this.host);
            }
            z = true;
        }
        if (config.equals("no") && 1 == iCheck) {
            z = true;
        }
        if (iCheck == 0) {
            HostKey[] hostKey2 = hostKeyRepository.getHostKey(str, keyExchange.getKeyAlgorithName());
            String strByte2str = Util.byte2str(Util.toBase64(hostKey, 0, hostKey.length));
            for (HostKey hostKey3 : hostKey2) {
                if (hostKey2[iCheck].getKey().equals(strByte2str) && hostKey3.getMarker().equals("@revoked")) {
                    UserInfo userInfo2 = this.userinfo;
                    if (userInfo2 != null) {
                        userInfo2.showMessage("The " + keyType + " host key for " + this.host + " is marked as revoked.\nThis could mean that a stolen key is being used to impersonate this host.");
                    }
                    if (JSch.getLogger().isEnabled(1)) {
                        JSch.getLogger().log(1, "Host '" + this.host + "' has provided revoked key.");
                    }
                    throw new JSchException("revoked HostKey: " + this.host);
                }
            }
        }
        if (iCheck == 0 && JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "Host '" + this.host + "' is known and matches the " + keyType + " host key");
        }
        if (z && JSch.getLogger().isEnabled(2)) {
            JSch.getLogger().log(2, "Permanently added '" + this.host + "' (" + keyType + ") to the list of known hosts.");
        }
        if (z) {
            synchronized (hostKeyRepository) {
                hostKeyRepository.add(this.hostkey, this.userinfo);
            }
        }
    }

    public static boolean checkKex(Session session, String str) {
        try {
            ((KeyExchange) Class.forName(str).newInstance()).init(session, null, null, null, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private String[] checkKexes(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "CheckKexes: ".concat(str));
            }
            Vector vector = new Vector();
            String[] strArrSplit = Util.split(str, ",");
            for (int i = 0; i < strArrSplit.length; i++) {
                if (!checkKex(this, getConfig(strArrSplit[i]))) {
                    vector.addElement(strArrSplit[i]);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (JSch.getLogger().isEnabled(1)) {
                for (int i2 = 0; i2 < size; i2++) {
                    JSch.getLogger().log(1, strArr[i2] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private String[] checkSignatures(String str) {
        String[] strArr = null;
        if (str != null && str.length() != 0) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "CheckSignatures: ".concat(str));
            }
            Vector vector = new Vector();
            String[] strArrSplit = Util.split(str, ",");
            for (int i = 0; i < strArrSplit.length; i++) {
                try {
                    ((Signature) Class.forName(JSch.getConfig(strArrSplit[i])).newInstance()).init();
                } catch (Exception unused) {
                    vector.addElement(strArrSplit[i]);
                }
            }
            if (vector.size() == 0) {
                return null;
            }
            int size = vector.size();
            strArr = new String[size];
            System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
            if (JSch.getLogger().isEnabled(1)) {
                for (int i2 = 0; i2 < size; i2++) {
                    JSch.getLogger().log(1, strArr[i2] + " is not available.");
                }
            }
        }
        return strArr;
    }

    private byte[] expandKey(Buffer buffer, byte[] bArr, byte[] bArr2, byte[] bArr3, HASH hash, int i) {
        int blockSize = hash.getBlockSize();
        while (bArr3.length < i) {
            buffer.reset();
            buffer.putMPInt(bArr);
            buffer.putByte(bArr2);
            buffer.putByte(bArr3);
            hash.update(buffer.buffer, 0, buffer.index);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(hash.digest(), 0, bArr4, bArr3.length, blockSize);
            Util.bzero(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    private void initDeflater(String str) throws JSchException {
        int i;
        if (str.equals("none")) {
            this.deflater = null;
            return;
        }
        String config = getConfig(str);
        if (config != null) {
            if (str.equals("zlib") || (this.isAuthed && str.equals("zlib@openssh.com"))) {
                try {
                    try {
                        this.deflater = (Compression) Class.forName(config).newInstance();
                        try {
                            i = Integer.parseInt(getConfig("compression_level"));
                        } catch (Exception unused) {
                            i = 6;
                        }
                        this.deflater.init(1, i);
                    } catch (NoClassDefFoundError e) {
                        throw new JSchException(e.toString(), e);
                    }
                } catch (Exception e2) {
                    throw new JSchException(e2.toString(), e2);
                }
            }
        }
    }

    private void initInflater(String str) throws JSchException {
        if (str.equals("none")) {
            this.inflater = null;
            return;
        }
        String config = getConfig(str);
        if (config != null) {
            if (str.equals("zlib") || (this.isAuthed && str.equals("zlib@openssh.com"))) {
                try {
                    Compression compression = (Compression) Class.forName(config).newInstance();
                    this.inflater = compression;
                    compression.init(0, 0);
                } catch (Exception e) {
                    throw new JSchException(e.toString(), e);
                }
            }
        }
    }

    private Forwarding parseForwarding(String str) throws JSchException {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length > 1) {
            Vector vector = new Vector();
            for (int i = 0; i < strArrSplit.length; i++) {
                if (strArrSplit[i].length() != 0) {
                    vector.addElement(strArrSplit[i].trim());
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = 0;
            while (i2 < vector.size()) {
                stringBuffer.append((String) vector.elementAt(i2));
                i2++;
                if (i2 < vector.size()) {
                    stringBuffer.append(":");
                }
            }
            str = stringBuffer.toString();
        }
        Forwarding forwarding = new Forwarding();
        try {
            if (str.lastIndexOf(":") == -1) {
                throw new JSchException("parseForwarding: " + str);
            }
            forwarding.hostport = Integer.parseInt(str.substring(str.lastIndexOf(":") + 1));
            String strSubstring = str.substring(0, str.lastIndexOf(":"));
            if (strSubstring.lastIndexOf(":") == -1) {
                throw new JSchException("parseForwarding: " + str);
            }
            forwarding.host = strSubstring.substring(strSubstring.lastIndexOf(":") + 1);
            String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf(":"));
            String str2 = "127.0.0.1";
            if (strSubstring2.lastIndexOf(":") != -1) {
                forwarding.port = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf(":") + 1));
                String strSubstring3 = strSubstring2.substring(0, strSubstring2.lastIndexOf(":"));
                if (strSubstring3.length() == 0 || strSubstring3.equals("*")) {
                    strSubstring3 = "0.0.0.0";
                }
                if (!strSubstring3.equals("localhost")) {
                    str2 = strSubstring3;
                }
                forwarding.bind_address = str2;
            } else {
                forwarding.port = Integer.parseInt(strSubstring2);
                forwarding.bind_address = "127.0.0.1";
            }
            return forwarding;
        } catch (NumberFormatException e) {
            throw new JSchException("parseForwarding: " + e.toString());
        }
    }

    private KeyExchange receive_kexinit(Buffer buffer) throws InterruptedException, JSchException {
        int i = buffer.getInt();
        if (i != buffer.getLength()) {
            buffer.getByte();
            this.I_S = new byte[buffer.index - 5];
        } else {
            this.I_S = new byte[(i - 1) - buffer.getByte()];
        }
        byte[] bArr = buffer.buffer;
        int i2 = buffer.s;
        byte[] bArr2 = this.I_S;
        System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
        if (!this.in_kex) {
            send_kexinit();
        }
        String[] strArrGuess = KeyExchange.guess(this.I_S, this.I_C);
        this.guess = strArrGuess;
        if (strArrGuess == null) {
            throw new JSchException("Algorithm negotiation fail");
        }
        if (!this.isAuthed && (strArrGuess[2].equals("none") || this.guess[3].equals("none"))) {
            throw new JSchException("NONE Cipher should not be chosen before authentification is successed.");
        }
        try {
            KeyExchange keyExchange = (KeyExchange) Class.forName(getConfig(this.guess[0])).newInstance();
            keyExchange.init(this, this.V_S, this.V_C, this.I_S, this.I_C);
            return keyExchange;
        } catch (Exception e) {
            throw new JSchException(e.toString(), e);
        }
    }

    private void receive_newkeys(Buffer buffer, KeyExchange keyExchange) throws Exception {
        updateKeys(keyExchange);
        this.in_kex = false;
    }

    private void requestPortForwarding() throws JSchException {
        ConfigRepository configRepository;
        if (getConfig("ClearAllForwardings").equals("yes") || (configRepository = this.jsch.getConfigRepository()) == null) {
            return;
        }
        ConfigRepository.Config config = configRepository.getConfig(this.org_host);
        String[] values = config.getValues("LocalForward");
        if (values != null) {
            for (String str : values) {
                setPortForwardingL(str);
            }
        }
        String[] values2 = config.getValues("RemoteForward");
        if (values2 != null) {
            for (String str2 : values2) {
                setPortForwardingR(str2);
            }
        }
    }

    private void send_kexinit() throws InterruptedException, JSchException {
        if (this.in_kex) {
            return;
        }
        String config = getConfig("cipher.c2s");
        String config2 = getConfig("cipher.s2c");
        String[] strArrCheckCiphers = checkCiphers(getConfig("CheckCiphers"));
        if (strArrCheckCiphers != null && strArrCheckCiphers.length > 0) {
            config = Util.diffString(config, strArrCheckCiphers);
            config2 = Util.diffString(config2, strArrCheckCiphers);
            if (config == null || config2 == null) {
                throw new JSchException("There are not any available ciphers.");
            }
        }
        String config3 = getConfig("kex");
        String[] strArrCheckKexes = checkKexes(getConfig("CheckKexes"));
        if (strArrCheckKexes != null && strArrCheckKexes.length > 0 && (config3 = Util.diffString(config3, strArrCheckKexes)) == null) {
            throw new JSchException("There are not any available kexes.");
        }
        String config4 = getConfig("server_host_key");
        String[] strArrCheckSignatures = checkSignatures(getConfig("CheckSignatures"));
        if (strArrCheckSignatures != null && strArrCheckSignatures.length > 0 && (config4 = Util.diffString(config4, strArrCheckSignatures)) == null) {
            throw new JSchException("There are not any available sig algorithm.");
        }
        this.in_kex = true;
        this.kex_start_time = System.currentTimeMillis();
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 20);
        synchronized (random) {
            random.fill(buffer.buffer, buffer.index, 16);
            buffer.skip(16);
        }
        buffer.putString(Util.str2byte(config3));
        buffer.putString(Util.str2byte(config4));
        buffer.putString(Util.str2byte(config));
        buffer.putString(Util.str2byte(config2));
        buffer.putString(Util.str2byte(getConfig("mac.c2s")));
        buffer.putString(Util.str2byte(getConfig("mac.s2c")));
        buffer.putString(Util.str2byte(getConfig("compression.c2s")));
        buffer.putString(Util.str2byte(getConfig("compression.s2c")));
        buffer.putString(Util.str2byte(getConfig("lang.c2s")));
        buffer.putString(Util.str2byte(getConfig("lang.s2c")));
        buffer.putByte((byte) 0);
        buffer.putInt(0);
        buffer.setOffSet(5);
        byte[] bArr = new byte[buffer.getLength()];
        this.I_C = bArr;
        buffer.getByte(bArr);
        write(packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_KEXINIT sent");
        }
    }

    private void send_newkeys() throws InterruptedException {
        this.packet.reset();
        this.buf.putByte((byte) 21);
        write(this.packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_NEWKEYS sent");
        }
    }

    private void start_discard(Buffer buffer, Cipher cipher, MAC mac, int i, int i2) throws IOException, JSchException {
        if (!cipher.isCBC()) {
            throw new JSchException("Packet corrupt");
        }
        if (i == PACKET_MAX_SIZE || mac == null) {
            mac = null;
        }
        int i3 = i2 - buffer.index;
        while (i3 > 0) {
            buffer.reset();
            byte[] bArr = buffer.buffer;
            int length = i3 > bArr.length ? bArr.length : i3;
            this.io.getByte(bArr, 0, length);
            if (mac != null) {
                mac.update(buffer.buffer, 0, length);
            }
            i3 -= length;
        }
        if (mac != null) {
            mac.doFinal(buffer.buffer, 0);
        }
        throw new JSchException("Packet corrupt");
    }

    private void updateKeys(KeyExchange keyExchange) throws Exception {
        byte[] bArr;
        byte[] k = keyExchange.getK();
        byte[] h = keyExchange.getH();
        HASH hash = keyExchange.getHash();
        if (this.session_id == null) {
            byte[] bArr2 = new byte[h.length];
            this.session_id = bArr2;
            System.arraycopy(h, 0, bArr2, 0, h.length);
        }
        this.buf.reset();
        this.buf.putMPInt(k);
        this.buf.putByte(h);
        this.buf.putByte((byte) 65);
        this.buf.putByte(this.session_id);
        Buffer buffer = this.buf;
        hash.update(buffer.buffer, 0, buffer.index);
        this.IVc2s = hash.digest();
        Buffer buffer2 = this.buf;
        int i = buffer2.index;
        int length = (i - this.session_id.length) - 1;
        byte[] bArr3 = buffer2.buffer;
        bArr3[length] = (byte) (bArr3[length] + 1);
        hash.update(bArr3, 0, i);
        this.IVs2c = hash.digest();
        Buffer buffer3 = this.buf;
        byte[] bArr4 = buffer3.buffer;
        bArr4[length] = (byte) (bArr4[length] + 1);
        hash.update(bArr4, 0, buffer3.index);
        this.Ec2s = hash.digest();
        Buffer buffer4 = this.buf;
        byte[] bArr5 = buffer4.buffer;
        bArr5[length] = (byte) (bArr5[length] + 1);
        hash.update(bArr5, 0, buffer4.index);
        this.Es2c = hash.digest();
        Buffer buffer5 = this.buf;
        byte[] bArr6 = buffer5.buffer;
        bArr6[length] = (byte) (bArr6[length] + 1);
        hash.update(bArr6, 0, buffer5.index);
        this.MACc2s = hash.digest();
        Buffer buffer6 = this.buf;
        byte[] bArr7 = buffer6.buffer;
        bArr7[length] = (byte) (bArr7[length] + 1);
        hash.update(bArr7, 0, buffer6.index);
        this.MACs2c = hash.digest();
        try {
            this.s2ccipher = (Cipher) Class.forName(getConfig(this.guess[3])).newInstance();
            while (true) {
                int blockSize = this.s2ccipher.getBlockSize();
                bArr = this.Es2c;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.buf.reset();
                this.buf.putMPInt(k);
                this.buf.putByte(h);
                this.buf.putByte(this.Es2c);
                Buffer buffer7 = this.buf;
                hash.update(buffer7.buffer, 0, buffer7.index);
                byte[] bArrDigest = hash.digest();
                byte[] bArr8 = this.Es2c;
                byte[] bArr9 = new byte[bArr8.length + bArrDigest.length];
                System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                System.arraycopy(bArrDigest, 0, bArr9, this.Es2c.length, bArrDigest.length);
                this.Es2c = bArr9;
            }
            this.s2ccipher.init(1, bArr, this.IVs2c);
            this.s2ccipher_size = this.s2ccipher.getIVSize();
            MAC mac = (MAC) Class.forName(getConfig(this.guess[5])).newInstance();
            this.s2cmac = mac;
            byte[] bArrExpandKey = expandKey(this.buf, k, h, this.MACs2c, hash, mac.getBlockSize());
            this.MACs2c = bArrExpandKey;
            this.s2cmac.init(bArrExpandKey);
            this.s2cmac_result1 = new byte[this.s2cmac.getBlockSize()];
            this.s2cmac_result2 = new byte[this.s2cmac.getBlockSize()];
            this.c2scipher = (Cipher) Class.forName(getConfig(this.guess[2])).newInstance();
            while (true) {
                int blockSize2 = this.c2scipher.getBlockSize();
                byte[] bArr10 = this.Ec2s;
                if (blockSize2 <= bArr10.length) {
                    this.c2scipher.init(0, bArr10, this.IVc2s);
                    this.c2scipher_size = this.c2scipher.getIVSize();
                    MAC mac2 = (MAC) Class.forName(getConfig(this.guess[4])).newInstance();
                    this.c2smac = mac2;
                    byte[] bArrExpandKey2 = expandKey(this.buf, k, h, this.MACc2s, hash, mac2.getBlockSize());
                    this.MACc2s = bArrExpandKey2;
                    this.c2smac.init(bArrExpandKey2);
                    initDeflater(this.guess[6]);
                    initInflater(this.guess[7]);
                    return;
                }
                this.buf.reset();
                this.buf.putMPInt(k);
                this.buf.putByte(h);
                this.buf.putByte(this.Ec2s);
                Buffer buffer8 = this.buf;
                hash.update(buffer8.buffer, 0, buffer8.index);
                byte[] bArrDigest2 = hash.digest();
                byte[] bArr11 = this.Ec2s;
                byte[] bArr12 = new byte[bArr11.length + bArrDigest2.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(bArrDigest2, 0, bArr12, this.Ec2s.length, bArrDigest2.length);
                this.Ec2s = bArr12;
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw e;
        }
    }

    public void addChannel(Channel channel) {
        channel.setSession(this);
    }

    public void connect() throws JSchException {
        connect(this.timeout);
    }

    public void delPortForwardingL(int i) throws IOException {
        delPortForwardingL("127.0.0.1", i);
    }

    public void delPortForwardingR(int i) {
        delPortForwardingR(null, i);
    }

    public void disconnect() {
        if (this.isConnected) {
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "Disconnecting from " + this.host + " port " + this.port);
            }
            Channel.disconnect(this);
            this.isConnected = false;
            PortWatcher.delPort(this);
            ChannelForwardedTCPIP.delPort(this);
            ChannelX11.removeFakedCookie(this);
            synchronized (this.lock) {
                try {
                    if (this.connectThread != null) {
                        Thread.yield();
                        this.connectThread.interrupt();
                        this.connectThread = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.thread = null;
            try {
                IO io = this.io;
                if (io != null) {
                    InputStream inputStream = io.in;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    OutputStream outputStream = this.io.out;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    OutputStream outputStream2 = this.io.out_ext;
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                }
                Proxy proxy = this.proxy;
                if (proxy == null) {
                    Socket socket = this.socket;
                    if (socket != null) {
                        socket.close();
                    }
                } else {
                    synchronized (proxy) {
                        this.proxy.close();
                    }
                    this.proxy = null;
                }
            } catch (Exception unused) {
            }
            this.io = null;
            this.socket = null;
            this.jsch.removeSession(this);
        }
    }

    public void encode(Packet packet) {
        Compression compression = this.deflater;
        if (compression != null) {
            int[] iArr = this.compress_len;
            Buffer buffer = packet.buffer;
            iArr[0] = buffer.index;
            buffer.buffer = compression.compress(buffer.buffer, 5, iArr);
            packet.buffer.index = this.compress_len[0];
        }
        if (this.c2scipher != null) {
            packet.padding(this.c2scipher_size);
            byte b = packet.buffer.buffer[4];
            synchronized (random) {
                Random random2 = random;
                Buffer buffer2 = packet.buffer;
                random2.fill(buffer2.buffer, buffer2.index - b, b);
            }
        } else {
            packet.padding(8);
        }
        MAC mac = this.c2smac;
        if (mac != null) {
            mac.update(this.seqo);
            MAC mac2 = this.c2smac;
            Buffer buffer3 = packet.buffer;
            mac2.update(buffer3.buffer, 0, buffer3.index);
            MAC mac3 = this.c2smac;
            Buffer buffer4 = packet.buffer;
            mac3.doFinal(buffer4.buffer, buffer4.index);
        }
        Cipher cipher = this.c2scipher;
        if (cipher != null) {
            Buffer buffer5 = packet.buffer;
            byte[] bArr = buffer5.buffer;
            cipher.update(bArr, 0, buffer5.index, bArr, 0);
        }
        MAC mac4 = this.c2smac;
        if (mac4 != null) {
            packet.buffer.skip(mac4.getBlockSize());
        }
    }

    public String getClientVersion() {
        return Util.byte2str(this.V_C);
    }

    public String getConfig(String str) {
        Hashtable hashtable = this.config;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String config = JSch.getConfig(str);
        if (config instanceof String) {
            return config;
        }
        return null;
    }

    public String getHost() {
        return this.host;
    }

    public HostKey getHostKey() {
        return this.hostkey;
    }

    public String getHostKeyAlias() {
        return this.hostKeyAlias;
    }

    public HostKeyRepository getHostKeyRepository() {
        HostKeyRepository hostKeyRepository = this.hostkeyRepository;
        return hostKeyRepository == null ? this.jsch.getHostKeyRepository() : hostKeyRepository;
    }

    public IdentityRepository getIdentityRepository() {
        IdentityRepository identityRepository = this.identityRepository;
        return identityRepository == null ? this.jsch.getIdentityRepository() : identityRepository;
    }

    public int getPort() {
        return this.port;
    }

    public String[] getPortForwardingL() {
        return PortWatcher.getPortForwarding(this);
    }

    public String[] getPortForwardingR() {
        return ChannelForwardedTCPIP.getPortForwarding(this);
    }

    public int getServerAliveCountMax() {
        return this.serverAliveCountMax;
    }

    public int getServerAliveInterval() {
        return this.serverAliveInterval;
    }

    public String getServerVersion() {
        return Util.byte2str(this.V_S);
    }

    public byte[] getSessionId() {
        return this.session_id;
    }

    public Channel getStreamForwarder(String str, int i) {
        ChannelDirectTCPIP channelDirectTCPIP = new ChannelDirectTCPIP();
        channelDirectTCPIP.init();
        addChannel(channelDirectTCPIP);
        channelDirectTCPIP.setHost(str);
        channelDirectTCPIP.setPort(i);
        return channelDirectTCPIP;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public UserInfo getUserInfo() {
        return this.userinfo;
    }

    public String getUserName() {
        return this.username;
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public void noMoreSessionChannels() throws InterruptedException {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 80);
        buffer.putString(nomoresessions);
        buffer.putByte((byte) 0);
        write(packet);
    }

    public Channel openChannel(String str) throws JSchException {
        if (!this.isConnected) {
            throw new JSchException("session is down");
        }
        try {
            Channel channel = Channel.getChannel(str);
            addChannel(channel);
            channel.init();
            if (channel instanceof ChannelSession) {
                applyConfigChannel((ChannelSession) channel);
            }
            return channel;
        } catch (Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v16 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public com.jcraft.jsch.Buffer read(com.jcraft.jsch.Buffer r22) throws java.io.IOException, com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.read(com.jcraft.jsch.Buffer):com.jcraft.jsch.Buffer");
    }

    public void rekey() throws InterruptedException, JSchException {
        send_kexinit();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        byte b;
        this.thread = this;
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            KeyExchange keyExchangeReceive_kexinit = null;
            while (true) {
                int i3 = 0;
                while (true) {
                    try {
                        if (this.isConnected && this.thread != null) {
                            try {
                                buffer = read(buffer);
                                int command = buffer.getCommand() & 255;
                                if (keyExchangeReceive_kexinit != null && keyExchangeReceive_kexinit.getState() == command) {
                                    this.kex_start_time = System.currentTimeMillis();
                                    boolean next = keyExchangeReceive_kexinit.next(buffer);
                                    if (!next) {
                                        throw new JSchException("verify: " + next);
                                    }
                                } else if (command == SSH_MSG_KEXINIT) {
                                    keyExchangeReceive_kexinit = receive_kexinit(buffer);
                                } else if (command != SSH_MSG_NEWKEYS) {
                                    switch (command) {
                                        case SSH_MSG_GLOBAL_REQUEST /* 80 */:
                                            buffer.getInt();
                                            buffer.getShort();
                                            buffer.getString();
                                            if (buffer.getByte() != 0) {
                                                packet.reset();
                                                buffer.putByte((byte) 82);
                                                write(packet);
                                            }
                                            break;
                                        case SSH_MSG_REQUEST_SUCCESS /* 81 */:
                                        case SSH_MSG_REQUEST_FAILURE /* 82 */:
                                            Thread thread = this.grr.getThread();
                                            if (thread != null) {
                                                this.grr.setReply(command == SSH_MSG_REQUEST_SUCCESS ? 1 : 0);
                                                if (command == SSH_MSG_REQUEST_SUCCESS && this.grr.getPort() == 0) {
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    this.grr.setPort(buffer.getInt());
                                                }
                                                thread.interrupt();
                                            }
                                            break;
                                        default:
                                            switch (command) {
                                                case SSH_MSG_CHANNEL_OPEN /* 90 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    String strByte2str = Util.byte2str(buffer.getString());
                                                    if ("forwarded-tcpip".equals(strByte2str) || (("x11".equals(strByte2str) && this.x11_forwarding) || ("auth-agent@openssh.com".equals(strByte2str) && this.agent_forwarding))) {
                                                        Channel channel = Channel.getChannel(strByte2str);
                                                        addChannel(channel);
                                                        channel.getData(buffer);
                                                        channel.init();
                                                        Thread thread2 = new Thread(channel);
                                                        thread2.setName("Channel " + strByte2str + " " + this.host);
                                                        boolean z = this.daemon_thread;
                                                        if (z) {
                                                            thread2.setDaemon(z);
                                                        }
                                                        thread2.start();
                                                    } else {
                                                        packet.reset();
                                                        buffer.putByte((byte) 92);
                                                        buffer.putInt(buffer.getInt());
                                                        buffer.putInt(1);
                                                        byte[] bArr = Util.empty;
                                                        buffer.putString(bArr);
                                                        buffer.putString(bArr);
                                                        write(packet);
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_OPEN_CONFIRMATION /* 91 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel2 = Channel.getChannel(buffer.getInt(), this);
                                                    int i4 = buffer.getInt();
                                                    long uInt = buffer.getUInt();
                                                    int i5 = buffer.getInt();
                                                    if (channel2 != null) {
                                                        channel2.setRemoteWindowSize(uInt);
                                                        channel2.setRemotePacketSize(i5);
                                                        channel2.open_confirmation = true;
                                                        channel2.setRecipient(i4);
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_OPEN_FAILURE /* 92 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel3 = Channel.getChannel(buffer.getInt(), this);
                                                    if (channel3 != null) {
                                                        channel3.setExitStatus(buffer.getInt());
                                                        channel3.close = true;
                                                        channel3.eof_remote = true;
                                                        channel3.setRecipient(0);
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_WINDOW_ADJUST /* 93 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel4 = Channel.getChannel(buffer.getInt(), this);
                                                    if (channel4 != null) {
                                                        channel4.addRemoteWindowSize(buffer.getUInt());
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_DATA /* 94 */:
                                                    buffer.getInt();
                                                    buffer.getByte();
                                                    buffer.getByte();
                                                    Channel channel5 = Channel.getChannel(buffer.getInt(), this);
                                                    byte[] string = buffer.getString(iArr, iArr2);
                                                    if (channel5 != null && (i = iArr2[0]) != 0) {
                                                        try {
                                                            try {
                                                                channel5.write(string, iArr[0], i);
                                                                channel5.setLocalWindowSize(channel5.lwsize - iArr2[0]);
                                                                if (channel5.lwsize >= channel5.lwsize_max / 2) {
                                                                    continue;
                                                                } else {
                                                                    packet.reset();
                                                                    buffer.putByte((byte) 93);
                                                                    buffer.putInt(channel5.getRecipient());
                                                                    buffer.putInt(channel5.lwsize_max - channel5.lwsize);
                                                                    synchronized (channel5) {
                                                                        try {
                                                                            if (!channel5.close) {
                                                                                write(packet);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    channel5.setLocalWindowSize(channel5.lwsize_max);
                                                                }
                                                            } catch (Exception unused) {
                                                                channel5.disconnect();
                                                            }
                                                        } catch (Exception unused2) {
                                                            continue;
                                                        }
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_EXTENDED_DATA /* 95 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel6 = Channel.getChannel(buffer.getInt(), this);
                                                    buffer.getInt();
                                                    byte[] string2 = buffer.getString(iArr, iArr2);
                                                    if (channel6 != null && (i2 = iArr2[0]) != 0) {
                                                        channel6.write_ext(string2, iArr[0], i2);
                                                        channel6.setLocalWindowSize(channel6.lwsize - iArr2[0]);
                                                        if (channel6.lwsize >= channel6.lwsize_max / 2) {
                                                            continue;
                                                        } else {
                                                            packet.reset();
                                                            buffer.putByte((byte) 93);
                                                            buffer.putInt(channel6.getRecipient());
                                                            buffer.putInt(channel6.lwsize_max - channel6.lwsize);
                                                            synchronized (channel6) {
                                                                try {
                                                                    if (!channel6.close) {
                                                                        write(packet);
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    throw th2;
                                                                }
                                                            }
                                                            channel6.setLocalWindowSize(channel6.lwsize_max);
                                                        }
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_EOF /* 96 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel7 = Channel.getChannel(buffer.getInt(), this);
                                                    if (channel7 != null) {
                                                        channel7.eof_remote();
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_CLOSE /* 97 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel8 = Channel.getChannel(buffer.getInt(), this);
                                                    if (channel8 != null) {
                                                        channel8.disconnect();
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_REQUEST /* 98 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    int i6 = buffer.getInt();
                                                    byte[] string3 = buffer.getString();
                                                    boolean z2 = buffer.getByte() != 0;
                                                    Channel channel9 = Channel.getChannel(i6, this);
                                                    if (channel9 != null) {
                                                        if (Util.byte2str(string3).equals("exit-status")) {
                                                            channel9.setExitStatus(buffer.getInt());
                                                            b = 99;
                                                        } else {
                                                            b = 100;
                                                        }
                                                        if (z2) {
                                                            packet.reset();
                                                            buffer.putByte(b);
                                                            buffer.putInt(channel9.getRecipient());
                                                            write(packet);
                                                        }
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_SUCCESS /* 99 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel10 = Channel.getChannel(buffer.getInt(), this);
                                                    if (channel10 != null) {
                                                        channel10.reply = 1;
                                                    }
                                                    break;
                                                case SSH_MSG_CHANNEL_FAILURE /* 100 */:
                                                    buffer.getInt();
                                                    buffer.getShort();
                                                    Channel channel11 = Channel.getChannel(buffer.getInt(), this);
                                                    if (channel11 != null) {
                                                        channel11.reply = 0;
                                                    }
                                                    break;
                                                default:
                                                    throw new IOException("Unknown SSH message type " + command);
                                            }
                                            break;
                                    }
                                } else {
                                    send_newkeys();
                                    receive_newkeys(buffer, keyExchangeReceive_kexinit);
                                }
                            } catch (InterruptedIOException e) {
                                if (!this.in_kex && i3 < this.serverAliveCountMax) {
                                    sendKeepAliveMsg();
                                } else if (!this.in_kex || i3 >= this.serverAliveCountMax) {
                                    throw e;
                                }
                                i3++;
                            }
                        }
                    } catch (Exception e2) {
                        this.in_kex = false;
                        if (JSch.getLogger().isEnabled(1)) {
                            JSch.getLogger().log(1, "Caught an exception, leaving main loop due to " + e2.getMessage());
                        }
                    }
                }
            }
        }
        try {
            disconnect();
        } catch (NullPointerException | Exception unused3) {
        }
        this.isConnected = false;
    }

    public void sendIgnore() throws InterruptedException {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 2);
        write(packet);
    }

    public void sendKeepAliveMsg() throws InterruptedException {
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 80);
        buffer.putString(keepalivemsg);
        buffer.putByte((byte) 1);
        write(packet);
    }

    public void setClientVersion(String str) {
        this.V_C = Util.str2byte(str);
    }

    public void setConfig(Properties properties) {
        setConfig((Hashtable) properties);
    }

    public void setDaemonThread(boolean z) {
        this.daemon_thread = z;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setHostKeyAlias(String str) {
        this.hostKeyAlias = str;
    }

    public void setHostKeyRepository(HostKeyRepository hostKeyRepository) {
        this.hostkeyRepository = hostKeyRepository;
    }

    public void setIdentityRepository(IdentityRepository identityRepository) {
        this.identityRepository = identityRepository;
    }

    public void setInputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public void setPassword(String str) {
        if (str != null) {
            this.password = Util.str2byte(str);
        }
    }

    public void setPort(int i) {
        this.port = i;
    }

    public int setPortForwardingL(int i, String str, int i2) {
        return setPortForwardingL("127.0.0.1", i, str, i2);
    }

    public void setPortForwardingR(int i, String str, int i2) {
        setPortForwardingR(null, i, str, i2, null);
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public void setServerAliveCountMax(int i) {
        this.serverAliveCountMax = i;
    }

    public void setServerAliveInterval(int i) throws JSchException {
        setTimeout(i);
        this.serverAliveInterval = i;
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.socket_factory = socketFactory;
    }

    public void setTimeout(int i) throws JSchException {
        Socket socket = this.socket;
        if (socket == null) {
            if (i < 0) {
                throw new JSchException("invalid timeout value");
            }
            this.timeout = i;
        } else {
            try {
                socket.setSoTimeout(i);
                this.timeout = i;
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        }
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userinfo = userInfo;
    }

    public void setUserName(String str) {
        this.username = str;
    }

    public void setX11Cookie(String str) {
        ChannelX11.setCookie(str);
    }

    public void setX11Host(String str) {
        ChannelX11.setHost(str);
    }

    public void setX11Port(int i) {
        ChannelX11.setPort(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r14.close != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        if (r14.isConnected() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        monitor-enter(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        r3 = 0;
        r3 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        if (r14.rwsize <= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        r9 = r14.rwsize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
    
        if (r9 <= r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007c, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007f, code lost:
    
        if (r9 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        r15 = (int) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0084, code lost:
    
        if (r12.c2scipher == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        r2 = r12.c2scipher_size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0089, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        r4 = r12.c2smac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:
    
        if (r4 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:
    
        r3 = r4.getBlockSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        r3 = r13.shift(r15, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        r15 = r13.buffer.getCommand();
        r2 = r14.getRecipient();
        r14.rwsize -= r9;
        r11 = r3;
        r3 = r15;
        r15 = (int) (r7 - r9);
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
    
        r2 = -1;
        r4 = 0;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b3, code lost:
    
        if (r5 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
    
        _write(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b8, code lost:
    
        if (r15 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bb, code lost:
    
        r13.unshift(r3, r2, r4, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        monitor-enter(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c1, code lost:
    
        if (r12.in_kex == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c3, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c6, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cd, code lost:
    
        if (r14.rwsize < r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cf, code lost:
    
        r14.rwsize -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d4, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d9, code lost:
    
        monitor-exit(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00dd, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00df, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e7, code lost:
    
        throw new java.io.IOException("channel is broken");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(com.jcraft.jsch.Packet r13, com.jcraft.jsch.Channel r14, int r15) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.write(com.jcraft.jsch.Packet, com.jcraft.jsch.Channel, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x04ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04ee, code lost:
    
        r16.in_kex = false;
        r16.in_prompt = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04f4, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect(int r17) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instruction units count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.Session.connect(int):void");
    }

    public void delPortForwardingL(String str, int i) throws IOException {
        PortWatcher.delPort(this, str, i);
    }

    public void delPortForwardingR(String str, int i) {
        ChannelForwardedTCPIP.delPort(this, str, i);
    }

    public void setConfig(Hashtable hashtable) {
        synchronized (this.lock) {
            try {
                if (this.config == null) {
                    this.config = new Hashtable();
                }
                Enumeration enumerationKeys = hashtable.keys();
                while (enumerationKeys.hasMoreElements()) {
                    String str = (String) enumerationKeys.nextElement();
                    this.config.put(str, (String) hashtable.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPassword(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.password = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public int setPortForwardingL(String str, int i, String str2, int i2) {
        return setPortForwardingL(str, i, str2, i2, null);
    }

    public void setPortForwardingR(String str, int i, String str2, int i2) {
        setPortForwardingR(str, i, str2, i2, null);
    }

    public int setPortForwardingL(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) {
        return setPortForwardingL(str, i, str2, i2, serverSocketFactory, 0);
    }

    public void setPortForwardingR(int i, String str, int i2, SocketFactory socketFactory) {
        setPortForwardingR(null, i, str, i2, socketFactory);
    }

    public int setPortForwardingL(String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory, int i3) throws UnknownHostException {
        PortWatcher portWatcherAddPort = PortWatcher.addPort(this, str, i, str2, i2, serverSocketFactory);
        portWatcherAddPort.setConnectTimeout(i3);
        Thread thread = new Thread(portWatcherAddPort);
        thread.setName("PortWatcher Thread for " + str2);
        boolean z = this.daemon_thread;
        if (z) {
            thread.setDaemon(z);
        }
        thread.start();
        return portWatcherAddPort.lport;
    }

    public void setPortForwardingR(String str, int i, String str2, int i2, SocketFactory socketFactory) {
        ChannelForwardedTCPIP.addPort(this, str, i, _setPortForwardingR(str, i), str2, i2, socketFactory);
    }

    public void setPortForwardingR(int i, String str) {
        setPortForwardingR((String) null, i, str, (Object[]) null);
    }

    public void setPortForwardingR(int i, String str, Object[] objArr) {
        setPortForwardingR((String) null, i, str, objArr);
    }

    public void setPortForwardingR(String str, int i, String str2, Object[] objArr) {
        ChannelForwardedTCPIP.addPort(this, str, i, _setPortForwardingR(str, i), str2, objArr);
    }

    public void setConfig(String str, String str2) {
        synchronized (this.lock) {
            try {
                if (this.config == null) {
                    this.config = new Hashtable();
                }
                this.config.put(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int setPortForwardingR(String str) throws JSchException {
        Forwarding forwarding = parseForwarding(str);
        int i_setPortForwardingR = _setPortForwardingR(forwarding.bind_address, forwarding.port);
        ChannelForwardedTCPIP.addPort(this, forwarding.bind_address, forwarding.port, i_setPortForwardingR, forwarding.host, forwarding.hostport, null);
        return i_setPortForwardingR;
    }

    public int setPortForwardingL(String str) throws JSchException {
        Forwarding forwarding = parseForwarding(str);
        return setPortForwardingL(forwarding.bind_address, forwarding.port, forwarding.host, forwarding.hostport);
    }

    public void write(Packet packet) throws InterruptedException {
        long timeout = getTimeout();
        while (this.in_kex) {
            if (timeout > 0 && System.currentTimeMillis() - this.kex_start_time > timeout && !this.in_prompt) {
                throw new JSchException("timeout in waiting for rekeying process.");
            }
            byte command = packet.buffer.getCommand();
            if (command == SSH_MSG_KEXINIT || command == SSH_MSG_NEWKEYS || command == SSH_MSG_KEXDH_INIT || command == 31 || command == 31 || command == SSH_MSG_KEX_DH_GEX_INIT || command == SSH_MSG_KEX_DH_GEX_REPLY || command == SSH_MSG_KEX_DH_GEX_REQUEST || command == 1) {
                break;
            } else {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            }
        }
        _write(packet);
    }
}
