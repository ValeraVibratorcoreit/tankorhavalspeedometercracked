package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
class RequestSignal extends Request {
    private String signal = "KILL";

    @Override // com.jcraft.jsch.Request
    public void request(Session session, Channel channel) {
        super.request(session, channel);
        Buffer buffer = new Buffer();
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 98);
        buffer.putInt(channel.getRecipient());
        buffer.putString(Util.str2byte("signal"));
        buffer.putByte(waitForReply() ? (byte) 1 : (byte) 0);
        buffer.putString(Util.str2byte(this.signal));
        write(packet);
    }

    public void setSignal(String str) {
        this.signal = str;
    }
}
