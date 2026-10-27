package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
class JSchAuthCancelException extends JSchException {
    String method;

    public JSchAuthCancelException() {
    }

    public String getMethod() {
        return this.method;
    }

    public JSchAuthCancelException(String str) {
        super(str);
        this.method = str;
    }
}
