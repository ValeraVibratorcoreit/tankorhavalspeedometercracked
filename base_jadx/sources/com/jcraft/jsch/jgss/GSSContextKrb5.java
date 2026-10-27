package com.jcraft.jsch.jgss;

import com.jcraft.jsch.GSSContext;
import com.jcraft.jsch.JSchException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.MessageProp;
import org.ietf.jgss.Oid;

/* JADX INFO: loaded from: classes.dex */
public class GSSContextKrb5 implements GSSContext {
    private static final String pUseSubjectCredsOnly = "javax.security.auth.useSubjectCredsOnly";
    private static String useSubjectCredsOnly = getSystemProperty(pUseSubjectCredsOnly);
    private org.ietf.jgss.GSSContext context = null;

    private static String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void setSystemProperty(String str, String str2) {
        try {
            System.setProperty(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public void create(String str, String str2) throws JSchException {
        try {
            Oid oid = new Oid("1.2.840.113554.1.2.2");
            Oid oid2 = new Oid("1.2.840.113554.1.2.2.1");
            GSSManager gSSManager = GSSManager.getInstance();
            try {
                str2 = InetAddress.getByName(str2).getCanonicalHostName();
            } catch (UnknownHostException unused) {
            }
            org.ietf.jgss.GSSContext gSSContextCreateContext = gSSManager.createContext(gSSManager.createName("host/" + str2, oid2), oid, (GSSCredential) null, 0);
            this.context = gSSContextCreateContext;
            gSSContextCreateContext.requestMutualAuth(true);
            this.context.requestConf(true);
            this.context.requestInteg(true);
            this.context.requestCredDeleg(true);
            this.context.requestAnonymity(false);
        } catch (GSSException e) {
            throw new JSchException(e.toString());
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public void dispose() {
        try {
            this.context.dispose();
        } catch (GSSException unused) {
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public byte[] getMIC(byte[] bArr, int i, int i2) {
        try {
            return this.context.getMIC(bArr, i, i2, new MessageProp(0, true));
        } catch (GSSException unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public byte[] init(byte[] bArr, int i, int i2) {
        try {
            try {
                if (useSubjectCredsOnly == null) {
                    setSystemProperty(pUseSubjectCredsOnly, "false");
                }
                byte[] bArrInitSecContext = this.context.initSecContext(bArr, 0, i2);
                if (useSubjectCredsOnly == null) {
                    setSystemProperty(pUseSubjectCredsOnly, "true");
                }
                return bArrInitSecContext;
            } catch (GSSException e) {
                throw new JSchException(e.toString());
            } catch (SecurityException e2) {
                throw new JSchException(e2.toString());
            }
        } catch (Throwable th) {
            if (useSubjectCredsOnly == null) {
                setSystemProperty(pUseSubjectCredsOnly, "true");
            }
            throw th;
        }
    }

    @Override // com.jcraft.jsch.GSSContext
    public boolean isEstablished() {
        return this.context.isEstablished();
    }
}
