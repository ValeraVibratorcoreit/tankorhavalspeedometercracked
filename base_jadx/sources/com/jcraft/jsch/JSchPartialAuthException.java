package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
class JSchPartialAuthException extends JSchException {
    String methods;

    public JSchPartialAuthException() {
    }

    public String getMethods() {
        return this.methods;
    }

    public JSchPartialAuthException(String str) {
        super(str);
        this.methods = str;
    }
}
