package com.jcraft.jsch;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class ChannelShell extends ChannelSession {
    public ChannelShell() {
        this.pty = true;
    }

    @Override // com.jcraft.jsch.Channel
    public void init() {
        this.io.setInputStream(getSession().in);
        this.io.setOutputStream(getSession().out);
    }

    @Override // com.jcraft.jsch.ChannelSession, com.jcraft.jsch.Channel, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setAgentForwarding(boolean z) {
        super.setAgentForwarding(z);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(String str, String str2) {
        super.setEnv(str, str2);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPty(boolean z) {
        super.setPty(z);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPtySize(int i, int i2, int i3, int i4) {
        super.setPtySize(i, i2, i3, i4);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPtyType(String str) {
        super.setPtyType(str);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setTerminalMode(byte[] bArr) {
        super.setTerminalMode(bArr);
    }

    @Override // com.jcraft.jsch.ChannelSession, com.jcraft.jsch.Channel
    public /* bridge */ /* synthetic */ void setXForwarding(boolean z) {
        super.setXForwarding(z);
    }

    @Override // com.jcraft.jsch.Channel
    public void start() throws JSchException {
        Session session = getSession();
        try {
            sendRequests();
            new RequestShell().request(session, this);
            if (this.io.in != null) {
                Thread thread = new Thread(this);
                this.thread = thread;
                thread.setName("Shell for " + session.host);
                boolean z = session.daemon_thread;
                if (z) {
                    this.thread.setDaemon(z);
                }
                this.thread.start();
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException("ChannelShell", e);
            }
            throw ((JSchException) e);
        }
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(Hashtable hashtable) {
        super.setEnv(hashtable);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setPtyType(String str, int i, int i2, int i3, int i4) {
        super.setPtyType(str, i, i2, i3, i4);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(byte[] bArr, byte[] bArr2) {
        super.setEnv(bArr, bArr2);
    }
}
