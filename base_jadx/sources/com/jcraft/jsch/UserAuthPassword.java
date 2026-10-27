package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
class UserAuthPassword extends UserAuth {
    private final int SSH_MSG_USERAUTH_PASSWD_CHANGEREQ = 60;

    @Override // com.jcraft.jsch.UserAuth
    public boolean start(Session session) {
        int command;
        super.start(session);
        byte[] bArrStr2byte = session.password;
        String str = this.username + "@" + session.host;
        if (session.port != 22) {
            str = str + ":" + session.port;
        }
        String str2 = str;
        while (session.auth_failures < session.max_auth_tries) {
            try {
                if (bArrStr2byte == null) {
                    UserInfo userInfo = this.userinfo;
                    if (userInfo == null) {
                        if (bArrStr2byte != null) {
                            Util.bzero(bArrStr2byte);
                        }
                        return false;
                    }
                    if (!userInfo.promptPassword("Password for " + str2)) {
                        throw new JSchAuthCancelException("password");
                    }
                    String password = this.userinfo.getPassword();
                    if (password == null) {
                        throw new JSchAuthCancelException("password");
                    }
                    bArrStr2byte = Util.str2byte(password);
                }
                byte[] bArrStr2byte2 = Util.str2byte(this.username);
                this.packet.reset();
                this.buf.putByte((byte) 50);
                this.buf.putString(bArrStr2byte2);
                this.buf.putString(Util.str2byte("ssh-connection"));
                this.buf.putString(Util.str2byte("password"));
                this.buf.putByte((byte) 0);
                this.buf.putString(bArrStr2byte);
                session.write(this.packet);
                while (true) {
                    Buffer buffer = session.read(this.buf);
                    this.buf = buffer;
                    command = buffer.getCommand() & 255;
                    if (command == 52) {
                        if (bArrStr2byte != null) {
                            Util.bzero(bArrStr2byte);
                        }
                        return true;
                    }
                    if (command == 53) {
                        this.buf.getInt();
                        this.buf.getByte();
                        this.buf.getByte();
                        byte[] string = this.buf.getString();
                        this.buf.getString();
                        String strByte2str = Util.byte2str(string);
                        UserInfo userInfo2 = this.userinfo;
                        if (userInfo2 != null) {
                            userInfo2.showMessage(strByte2str);
                        }
                    } else if (command == 60) {
                        this.buf.getInt();
                        this.buf.getByte();
                        this.buf.getByte();
                        byte[] string2 = this.buf.getString();
                        this.buf.getString();
                        UserInfo userInfo3 = this.userinfo;
                        if (userInfo3 != null && (userInfo3 instanceof UIKeyboardInteractive)) {
                            String[] strArrPromptKeyboardInteractive = ((UIKeyboardInteractive) userInfo3).promptKeyboardInteractive(str2, "Password Change Required", Util.byte2str(string2), new String[]{"New Password: "}, new boolean[]{false});
                            if (strArrPromptKeyboardInteractive == null) {
                                throw new JSchAuthCancelException("password");
                            }
                            byte[] bArrStr2byte3 = Util.str2byte(strArrPromptKeyboardInteractive[0]);
                            this.packet.reset();
                            this.buf.putByte((byte) 50);
                            this.buf.putString(bArrStr2byte2);
                            this.buf.putString(Util.str2byte("ssh-connection"));
                            this.buf.putString(Util.str2byte("password"));
                            this.buf.putByte((byte) 1);
                            this.buf.putString(bArrStr2byte);
                            this.buf.putString(bArrStr2byte3);
                            Util.bzero(bArrStr2byte3);
                            session.write(this.packet);
                        }
                        if (userInfo3 != null) {
                            userInfo3.showMessage("Password must be changed.");
                        }
                        if (bArrStr2byte != null) {
                            Util.bzero(bArrStr2byte);
                        }
                        return false;
                    }
                }
                if (command != 51) {
                    if (bArrStr2byte != null) {
                        Util.bzero(bArrStr2byte);
                    }
                    return false;
                }
                this.buf.getInt();
                this.buf.getByte();
                this.buf.getByte();
                byte[] string3 = this.buf.getString();
                if (this.buf.getByte() != 0) {
                    throw new JSchPartialAuthException(Util.byte2str(string3));
                }
                session.auth_failures++;
                if (bArrStr2byte != null) {
                    Util.bzero(bArrStr2byte);
                    bArrStr2byte = null;
                }
            } catch (Throwable th) {
                if (bArrStr2byte != null) {
                    Util.bzero(bArrStr2byte);
                }
                throw th;
            }
        }
        if (bArrStr2byte != null) {
            Util.bzero(bArrStr2byte);
        }
        return false;
    }
}
