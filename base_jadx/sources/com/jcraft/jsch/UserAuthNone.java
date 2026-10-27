package com.jcraft.jsch;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class UserAuthNone extends UserAuth {
    private static final int SSH_MSG_SERVICE_ACCEPT = 6;
    private String methods = null;

    public String getMethods() {
        return this.methods;
    }

    @Override // com.jcraft.jsch.UserAuth
    public boolean start(Session session) throws InterruptedException, IOException, JSchException {
        super.start(session);
        this.packet.reset();
        this.buf.putByte((byte) 5);
        this.buf.putString(Util.str2byte("ssh-userauth"));
        session.write(this.packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_SERVICE_REQUEST sent");
        }
        Buffer buffer = session.read(this.buf);
        this.buf = buffer;
        boolean z = buffer.getCommand() == 6;
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_SERVICE_ACCEPT received");
        }
        if (!z) {
            return false;
        }
        byte[] bArrStr2byte = Util.str2byte(this.username);
        this.packet.reset();
        this.buf.putByte((byte) 50);
        this.buf.putString(bArrStr2byte);
        this.buf.putString(Util.str2byte("ssh-connection"));
        this.buf.putString(Util.str2byte("none"));
        session.write(this.packet);
        while (true) {
            Buffer buffer2 = session.read(this.buf);
            this.buf = buffer2;
            int command = buffer2.getCommand() & 255;
            if (command == 52) {
                return true;
            }
            if (command != 53) {
                if (command != 51) {
                    throw new JSchException("USERAUTH fail (" + command + ")");
                }
                this.buf.getInt();
                this.buf.getByte();
                this.buf.getByte();
                byte[] string = this.buf.getString();
                this.buf.getByte();
                this.methods = Util.byte2str(string);
                return false;
            }
            this.buf.getInt();
            this.buf.getByte();
            this.buf.getByte();
            byte[] string2 = this.buf.getString();
            this.buf.getString();
            String strByte2str = Util.byte2str(string2);
            UserInfo userInfo = this.userinfo;
            if (userInfo != null) {
                try {
                    userInfo.showMessage(strByte2str);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
