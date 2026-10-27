package com.jcraft.jsch;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class UserAuthKeyboardInteractive extends UserAuth {
    @Override // com.jcraft.jsch.UserAuth
    public boolean start(Session session) throws InterruptedException, IOException, JSchException {
        UserInfo userInfo;
        String[] strArrPromptKeyboardInteractive;
        byte[][] bArr;
        super.start(session);
        UserInfo userInfo2 = this.userinfo;
        if (userInfo2 != null && !(userInfo2 instanceof UIKeyboardInteractive)) {
            return false;
        }
        String str = this.username + "@" + session.host;
        if (session.port != 22) {
            str = str + ":" + session.port;
        }
        byte[] bArr2 = session.password;
        byte[] bArrStr2byte = Util.str2byte(this.username);
        boolean z = false;
        while (session.auth_failures < session.max_auth_tries) {
            this.packet.reset();
            this.buf.putByte((byte) 50);
            this.buf.putString(bArrStr2byte);
            this.buf.putString(Util.str2byte("ssh-connection"));
            this.buf.putString(Util.str2byte("keyboard-interactive"));
            Buffer buffer = this.buf;
            byte[] bArr3 = Util.empty;
            buffer.putString(bArr3);
            this.buf.putString(bArr3);
            session.write(this.packet);
            byte[] bArr4 = bArr2;
            boolean z2 = z;
            boolean z3 = true;
            while (true) {
                Buffer buffer2 = session.read(this.buf);
                this.buf = buffer2;
                int command = buffer2.getCommand() & 255;
                if (command == 52) {
                    return true;
                }
                if (command == 53) {
                    this.buf.getInt();
                    this.buf.getByte();
                    this.buf.getByte();
                    byte[] string = this.buf.getString();
                    this.buf.getString();
                    String strByte2str = Util.byte2str(string);
                    UserInfo userInfo3 = this.userinfo;
                    if (userInfo3 != null) {
                        userInfo3.showMessage(strByte2str);
                    }
                } else {
                    if (command == 51) {
                        break;
                    }
                    if (command != 60) {
                        return false;
                    }
                    this.buf.getInt();
                    this.buf.getByte();
                    this.buf.getByte();
                    String strByte2str2 = Util.byte2str(this.buf.getString());
                    String strByte2str3 = Util.byte2str(this.buf.getString());
                    Util.byte2str(this.buf.getString());
                    int i = this.buf.getInt();
                    String[] strArr = new String[i];
                    boolean[] zArr = new boolean[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        strArr[i2] = Util.byte2str(this.buf.getString());
                        zArr[i2] = this.buf.getByte() != 0;
                    }
                    if (bArr4 != null && i == 1 && !zArr[0] && strArr[0].toLowerCase().indexOf("password:") >= 0) {
                        bArr = new byte[][]{bArr4};
                        bArr4 = null;
                    } else if ((i <= 0 && strByte2str2.length() <= 0 && strByte2str3.length() <= 0) || (userInfo = this.userinfo) == null || (strArrPromptKeyboardInteractive = ((UIKeyboardInteractive) userInfo).promptKeyboardInteractive(str, strByte2str2, strByte2str3, strArr, zArr)) == null) {
                        bArr = null;
                    } else {
                        byte[][] bArr5 = new byte[strArrPromptKeyboardInteractive.length][];
                        for (int i3 = 0; i3 < strArrPromptKeyboardInteractive.length; i3++) {
                            bArr5[i3] = Util.str2byte(strArrPromptKeyboardInteractive[i3]);
                        }
                        bArr = bArr5;
                    }
                    this.packet.reset();
                    this.buf.putByte((byte) 61);
                    if (i <= 0 || (bArr != null && i == bArr.length)) {
                        this.buf.putInt(i);
                        for (int i4 = 0; i4 < i; i4++) {
                            this.buf.putString(bArr[i4]);
                        }
                    } else {
                        if (bArr == null) {
                            this.buf.putInt(i);
                            for (int i5 = 0; i5 < i; i5++) {
                                this.buf.putString(Util.empty);
                            }
                        } else {
                            this.buf.putInt(0);
                        }
                        if (bArr == null) {
                            z2 = true;
                        }
                    }
                    session.write(this.packet);
                    z3 = false;
                }
            }
            this.buf.getInt();
            this.buf.getByte();
            this.buf.getByte();
            byte[] string2 = this.buf.getString();
            if (this.buf.getByte() != 0) {
                throw new JSchPartialAuthException(Util.byte2str(string2));
            }
            if (z3) {
                return false;
            }
            session.auth_failures++;
            if (z2) {
                throw new JSchAuthCancelException("keyboard-interactive");
            }
            bArr2 = bArr4;
            z = z2;
        }
        return false;
    }
}
