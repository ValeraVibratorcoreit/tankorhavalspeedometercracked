package com.jcraft.jsch;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class UserAuthGSSAPIWithMIC extends UserAuth {
    private static final int SSH_MSG_USERAUTH_GSSAPI_ERROR = 64;
    private static final int SSH_MSG_USERAUTH_GSSAPI_ERRTOK = 65;
    private static final int SSH_MSG_USERAUTH_GSSAPI_EXCHANGE_COMPLETE = 63;
    private static final int SSH_MSG_USERAUTH_GSSAPI_MIC = 66;
    private static final int SSH_MSG_USERAUTH_GSSAPI_RESPONSE = 60;
    private static final int SSH_MSG_USERAUTH_GSSAPI_TOKEN = 61;
    private static final byte[][] supported_oid = {new byte[]{6, 9, 42, -122, 72, -122, -9, 18, 1, 2, 2}};
    private static final String[] supported_method = {"gssapi-with-mic.krb5"};

    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108 A[SYNTHETIC] */
    @Override // com.jcraft.jsch.UserAuth
    public boolean start(Session session) throws InterruptedException, IOException, JSchException {
        String str;
        byte command;
        super.start(session);
        byte[] bArrStr2byte = Util.str2byte(this.username);
        this.packet.reset();
        this.buf.putByte((byte) 50);
        this.buf.putString(bArrStr2byte);
        this.buf.putString(Util.str2byte("ssh-connection"));
        this.buf.putString(Util.str2byte("gssapi-with-mic"));
        this.buf.putInt(supported_oid.length);
        int i = 0;
        while (true) {
            byte[][] bArr = supported_oid;
            if (i >= bArr.length) {
                break;
            }
            this.buf.putString(bArr[i]);
            i++;
        }
        session.write(this.packet);
        while (true) {
            Buffer buffer = session.read(this.buf);
            this.buf = buffer;
            int command2 = buffer.getCommand() & 255;
            if (command2 == 51) {
                return false;
            }
            if (command2 == SSH_MSG_USERAUTH_GSSAPI_RESPONSE) {
                this.buf.getInt();
                this.buf.getByte();
                this.buf.getByte();
                byte[] string = this.buf.getString();
                int i2 = 0;
                while (true) {
                    byte[][] bArr2 = supported_oid;
                    if (i2 >= bArr2.length) {
                        str = null;
                        break;
                    }
                    if (Util.array_equals(string, bArr2[i2])) {
                        str = supported_method[i2];
                        break;
                    }
                    i2++;
                }
                if (str == null) {
                    return false;
                }
                try {
                    GSSContext gSSContext = (GSSContext) Class.forName(session.getConfig(str)).newInstance();
                    gSSContext.create(this.username, session.host);
                    byte[] bArrInit = new byte[0];
                    while (!gSSContext.isEstablished()) {
                        try {
                            bArrInit = gSSContext.init(bArrInit, 0, bArrInit.length);
                            if (bArrInit != null) {
                                this.packet.reset();
                                this.buf.putByte((byte) 61);
                                this.buf.putString(bArrInit);
                                session.write(this.packet);
                            }
                            if (!gSSContext.isEstablished()) {
                                Buffer buffer2 = session.read(this.buf);
                                this.buf = buffer2;
                                int command3 = buffer2.getCommand() & 255;
                                if (command3 == SSH_MSG_USERAUTH_GSSAPI_ERROR) {
                                    Buffer buffer3 = session.read(this.buf);
                                    this.buf = buffer3;
                                    command = buffer3.getCommand();
                                } else {
                                    if (command3 == SSH_MSG_USERAUTH_GSSAPI_ERRTOK) {
                                        Buffer buffer4 = session.read(this.buf);
                                        this.buf = buffer4;
                                        command = buffer4.getCommand();
                                    }
                                    if (command3 == 51) {
                                        return false;
                                    }
                                    this.buf.getInt();
                                    this.buf.getByte();
                                    this.buf.getByte();
                                    bArrInit = this.buf.getString();
                                }
                                command3 = command & 255;
                                if (command3 == 51) {
                                    return false;
                                }
                                this.buf.getInt();
                                this.buf.getByte();
                                this.buf.getByte();
                                bArrInit = this.buf.getString();
                            }
                        } catch (JSchException unused) {
                            return false;
                        }
                    }
                    Buffer buffer5 = new Buffer();
                    buffer5.putString(session.getSessionId());
                    buffer5.putByte((byte) 50);
                    buffer5.putString(bArrStr2byte);
                    buffer5.putString(Util.str2byte("ssh-connection"));
                    buffer5.putString(Util.str2byte("gssapi-with-mic"));
                    byte[] mic = gSSContext.getMIC(buffer5.buffer, 0, buffer5.getLength());
                    if (mic == null) {
                        return false;
                    }
                    this.packet.reset();
                    this.buf.putByte((byte) 66);
                    this.buf.putString(mic);
                    session.write(this.packet);
                    gSSContext.dispose();
                    Buffer buffer6 = session.read(this.buf);
                    this.buf = buffer6;
                    int command4 = buffer6.getCommand() & 255;
                    if (command4 == 52) {
                        return true;
                    }
                    if (command4 == 51) {
                        this.buf.getInt();
                        this.buf.getByte();
                        this.buf.getByte();
                        byte[] string2 = this.buf.getString();
                        if (this.buf.getByte() != 0) {
                            throw new JSchPartialAuthException(Util.byte2str(string2));
                        }
                    }
                    return false;
                } catch (JSchException | Exception unused2) {
                }
            } else {
                if (command2 != 53) {
                    return false;
                }
                this.buf.getInt();
                this.buf.getByte();
                this.buf.getByte();
                byte[] string3 = this.buf.getString();
                this.buf.getString();
                String strByte2str = Util.byte2str(string3);
                UserInfo userInfo = this.userinfo;
                if (userInfo != null) {
                    userInfo.showMessage(strByte2str);
                }
            }
        }
    }
}
