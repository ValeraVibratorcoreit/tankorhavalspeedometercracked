package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
class RequestShell extends Request {
    @Override // com.jcraft.jsch.Request
    public void request(Session session, Channel channel) {
        super.request(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 98);
        buffer.putInt(channel.getRecipient());
        buffer.putString(Util.str2byte("shell"));
        buffer.putByte(waitForReply() ? (byte) 1 : (byte) 0);
        write(packet);
    }
}
