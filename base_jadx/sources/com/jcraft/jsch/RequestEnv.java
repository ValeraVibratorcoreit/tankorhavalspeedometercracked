package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
class RequestEnv extends Request {
    byte[] name = new byte[0];
    byte[] value = new byte[0];

    @Override // com.jcraft.jsch.Request
    public void request(Session session, Channel channel) {
        super.request(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 98);
        buffer.putInt(channel.getRecipient());
        buffer.putString(Util.str2byte("env"));
        buffer.putByte(waitForReply() ? (byte) 1 : (byte) 0);
        buffer.putString(this.name);
        buffer.putString(this.value);
        write(packet);
    }

    public void setEnv(byte[] bArr, byte[] bArr2) {
        this.name = bArr;
        this.value = bArr2;
    }
}
