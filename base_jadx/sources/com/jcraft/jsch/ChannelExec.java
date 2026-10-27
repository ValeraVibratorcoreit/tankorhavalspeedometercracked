package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class ChannelExec extends ChannelSession {
    byte[] command = new byte[0];

    public InputStream getErrStream() {
        return getExtInputStream();
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

    public void setCommand(String str) {
        this.command = Util.str2byte(str);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(String str, String str2) {
        super.setEnv(str, str2);
    }

    public void setErrStream(OutputStream outputStream) {
        setExtOutputStream(outputStream);
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
            new RequestExec(this.command).request(session, this);
            if (this.io.in != null) {
                Thread thread = new Thread(this);
                this.thread = thread;
                thread.setName("Exec thread " + session.getHost());
                boolean z = session.daemon_thread;
                if (z) {
                    this.thread.setDaemon(z);
                }
                this.thread.start();
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException("ChannelExec", e);
            }
            throw ((JSchException) e);
        }
    }

    public void setCommand(byte[] bArr) {
        this.command = bArr;
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void setEnv(Hashtable hashtable) {
        super.setEnv(hashtable);
    }

    public void setErrStream(OutputStream outputStream, boolean z) {
        setExtOutputStream(outputStream, z);
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
