package com.jcraft.jsch;

import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
class UserAuthPublicKey extends UserAuth {
    /* JADX WARN: Code duplicated, block: B:100:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0242 A[EDGE_INSN: B:104:0x0242->B:88:0x0242 BREAK  A[LOOP:3: B:73:0x01d5->B:118:0x01d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0215 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0232 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:4:0x0010, B:6:0x0017, B:10:0x001c, B:11:0x0023, B:13:0x0029, B:15:0x002f, B:17:0x0031, B:19:0x0043, B:20:0x0084, B:88:0x0242, B:26:0x009c, B:28:0x00be, B:32:0x00c8, B:34:0x00ce, B:36:0x00d2, B:38:0x00d8, B:41:0x00f6, B:42:0x00fd, B:43:0x00fe, B:45:0x0106, B:49:0x0114, B:59:0x0137, B:62:0x013f, B:66:0x014c, B:69:0x0154, B:72:0x01cb, B:73:0x01d5, B:75:0x01e7, B:78:0x01eb, B:80:0x020d, B:83:0x0215, B:85:0x0232, B:86:0x0238, B:87:0x0241, B:52:0x011c, B:55:0x0124, B:57:0x012c, B:46:0x010b, B:47:0x0112, B:89:0x0246), top: B:93:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00d8, please report this as an issue */
    @Override // com.jcraft.jsch.UserAuth
    public boolean start(Session session) {
        byte[] bArrStr2byte;
        byte[] bArr;
        byte[] signature;
        int command;
        byte[] string;
        String strByte2str;
        UserInfo userInfo;
        String passphrase;
        int command2;
        super.start(session);
        Vector identities = session.getIdentityRepository().getIdentities();
        synchronized (identities) {
            try {
                if (identities.size() <= 0) {
                    return false;
                }
                byte[] bArrStr2byte2 = Util.str2byte(this.username);
                for (int i = 0; i < identities.size(); i++) {
                    if (session.auth_failures >= session.max_auth_tries) {
                        return false;
                    }
                    Identity identity = (Identity) identities.elementAt(i);
                    byte[] publicKeyBlob = identity.getPublicKeyBlob();
                    if (publicKeyBlob != null) {
                        this.packet.reset();
                        this.buf.putByte((byte) 50);
                        this.buf.putString(bArrStr2byte2);
                        this.buf.putString(Util.str2byte("ssh-connection"));
                        this.buf.putString(Util.str2byte("publickey"));
                        this.buf.putByte((byte) 0);
                        this.buf.putString(Util.str2byte(identity.getAlgName()));
                        this.buf.putString(publicKeyBlob);
                        session.write(this.packet);
                        while (true) {
                            Buffer buffer = session.read(this.buf);
                            this.buf = buffer;
                            command2 = buffer.getCommand() & 255;
                            if (command2 == 60 || command2 == 51 || command2 != 53) {
                                break;
                                break;
                                break;
                            }
                            this.buf.getInt();
                            this.buf.getByte();
                            this.buf.getByte();
                            byte[] string2 = this.buf.getString();
                            this.buf.getString();
                            String strByte2str2 = Util.byte2str(string2);
                            UserInfo userInfo2 = this.userinfo;
                            if (userInfo2 != null) {
                                userInfo2.showMessage(strByte2str2);
                            }
                        }
                        if (command2 == 60) {
                            int i2 = 5;
                            while (true) {
                                if (!identity.isEncrypted()) {
                                    bArrStr2byte = null;
                                } else {
                                    if (this.userinfo != null) {
                                        throw new JSchException("USERAUTH fail");
                                    }
                                    if (identity.isEncrypted()) {
                                        if (this.userinfo.promptPassphrase("Passphrase for " + identity.getName())) {
                                            throw new JSchAuthCancelException("publickey");
                                        }
                                    }
                                    passphrase = this.userinfo.getPassphrase();
                                    if (passphrase != null) {
                                        bArrStr2byte = Util.str2byte(passphrase);
                                    } else {
                                        bArrStr2byte = null;
                                    }
                                }
                                if ((!identity.isEncrypted() || bArrStr2byte != null) && identity.setPassphrase(bArrStr2byte)) {
                                    if (bArrStr2byte != null && (session.getIdentityRepository() instanceof IdentityRepository.Wrapper)) {
                                        ((IdentityRepository.Wrapper) session.getIdentityRepository()).check();
                                    }
                                    bArr = bArrStr2byte;
                                    break;
                                }
                                Util.bzero(bArrStr2byte);
                                i2--;
                                if (i2 == 0) {
                                    bArr = null;
                                    break;
                                }
                            }
                            Util.bzero(bArr);
                            if (!identity.isEncrypted()) {
                                if (publicKeyBlob == null) {
                                    publicKeyBlob = identity.getPublicKeyBlob();
                                }
                                if (publicKeyBlob == null) {
                                    this.packet.reset();
                                    this.buf.putByte((byte) 50);
                                    this.buf.putString(bArrStr2byte2);
                                    this.buf.putString(Util.str2byte("ssh-connection"));
                                    this.buf.putString(Util.str2byte("publickey"));
                                    this.buf.putByte((byte) 1);
                                    this.buf.putString(Util.str2byte(identity.getAlgName()));
                                    this.buf.putString(publicKeyBlob);
                                    byte[] sessionId = session.getSessionId();
                                    int length = sessionId.length;
                                    int i3 = length + 4;
                                    byte[] bArr2 = new byte[(this.buf.index + i3) - 5];
                                    bArr2[0] = (byte) (length >>> 24);
                                    bArr2[1] = (byte) (length >>> 16);
                                    bArr2[2] = (byte) (length >>> 8);
                                    bArr2[3] = (byte) length;
                                    System.arraycopy(sessionId, 0, bArr2, 4, length);
                                    Buffer buffer2 = this.buf;
                                    System.arraycopy(buffer2.buffer, 5, bArr2, i3, buffer2.index - 5);
                                    signature = identity.getSignature(bArr2);
                                    if (signature == null) {
                                        break;
                                    }
                                    this.buf.putString(signature);
                                    session.write(this.packet);
                                    while (true) {
                                        Buffer buffer3 = session.read(this.buf);
                                        this.buf = buffer3;
                                        command = buffer3.getCommand() & 255;
                                        if (command == 52) {
                                            return true;
                                        }
                                        if (command == 53) {
                                            if (command == 51) {
                                                break;
                                            }
                                            this.buf.getInt();
                                            this.buf.getByte();
                                            this.buf.getByte();
                                            string = this.buf.getString();
                                            if (this.buf.getByte() == 0) {
                                                throw new JSchPartialAuthException(Util.byte2str(string));
                                            }
                                            session.auth_failures++;
                                            break;
                                        }
                                        this.buf.getInt();
                                        this.buf.getByte();
                                        this.buf.getByte();
                                        byte[] string3 = this.buf.getString();
                                        this.buf.getString();
                                        strByte2str = Util.byte2str(string3);
                                        userInfo = this.userinfo;
                                        if (userInfo != null) {
                                            userInfo.showMessage(strByte2str);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int i4 = 5;
                        while (true) {
                            if (!identity.isEncrypted()) {
                                bArrStr2byte = null;
                            } else {
                                if (this.userinfo != null) {
                                    throw new JSchException("USERAUTH fail");
                                }
                                if (identity.isEncrypted()) {
                                    if (this.userinfo.promptPassphrase("Passphrase for " + identity.getName())) {
                                        throw new JSchAuthCancelException("publickey");
                                    }
                                }
                                passphrase = this.userinfo.getPassphrase();
                                if (passphrase != null) {
                                    bArrStr2byte = Util.str2byte(passphrase);
                                } else {
                                    bArrStr2byte = null;
                                }
                            }
                            if (!identity.isEncrypted()) {
                                if (bArrStr2byte != null) {
                                    ((IdentityRepository.Wrapper) session.getIdentityRepository()).check();
                                }
                                bArr = bArrStr2byte;
                                break;
                            }
                            if (bArrStr2byte != null) {
                                ((IdentityRepository.Wrapper) session.getIdentityRepository()).check();
                            }
                            bArr = bArrStr2byte;
                            break;
                        }
                        Util.bzero(bArr);
                        if (!identity.isEncrypted()) {
                            if (publicKeyBlob == null) {
                                publicKeyBlob = identity.getPublicKeyBlob();
                            }
                            if (publicKeyBlob == null) {
                                this.packet.reset();
                                this.buf.putByte((byte) 50);
                                this.buf.putString(bArrStr2byte2);
                                this.buf.putString(Util.str2byte("ssh-connection"));
                                this.buf.putString(Util.str2byte("publickey"));
                                this.buf.putByte((byte) 1);
                                this.buf.putString(Util.str2byte(identity.getAlgName()));
                                this.buf.putString(publicKeyBlob);
                                byte[] sessionId2 = session.getSessionId();
                                int length2 = sessionId2.length;
                                int i5 = length2 + 4;
                                byte[] bArr3 = new byte[(this.buf.index + i5) - 5];
                                bArr3[0] = (byte) (length2 >>> 24);
                                bArr3[1] = (byte) (length2 >>> 16);
                                bArr3[2] = (byte) (length2 >>> 8);
                                bArr3[3] = (byte) length2;
                                System.arraycopy(sessionId2, 0, bArr3, 4, length2);
                                Buffer buffer4 = this.buf;
                                System.arraycopy(buffer4.buffer, 5, bArr3, i5, buffer4.index - 5);
                                signature = identity.getSignature(bArr3);
                                if (signature == null) {
                                    break;
                                    break;
                                }
                                this.buf.putString(signature);
                                session.write(this.packet);
                                while (true) {
                                    Buffer buffer5 = session.read(this.buf);
                                    this.buf = buffer5;
                                    command = buffer5.getCommand() & 255;
                                    if (command == 52) {
                                        return true;
                                    }
                                    if (command == 53) {
                                        if (command == 51) {
                                            break;
                                            break;
                                        }
                                        this.buf.getInt();
                                        this.buf.getByte();
                                        this.buf.getByte();
                                        string = this.buf.getString();
                                        if (this.buf.getByte() == 0) {
                                            throw new JSchPartialAuthException(Util.byte2str(string));
                                        }
                                        session.auth_failures++;
                                        break;
                                        break;
                                    }
                                    this.buf.getInt();
                                    this.buf.getByte();
                                    this.buf.getByte();
                                    byte[] string4 = this.buf.getString();
                                    this.buf.getString();
                                    strByte2str = Util.byte2str(string4);
                                    userInfo = this.userinfo;
                                    if (userInfo != null) {
                                        userInfo.showMessage(strByte2str);
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
