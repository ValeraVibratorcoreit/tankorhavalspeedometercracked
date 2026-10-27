package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public class DHG14 extends KeyExchange {
    private static final int SSH_MSG_KEXDH_INIT = 30;
    private static final int SSH_MSG_KEXDH_REPLY = 31;
    static final byte[] g = {2};
    static final byte[] p = {0, -1, -1, -1, -1, -1, -1, -1, -1, -55, 15, -38, -94, 33, 104, -62, 52, -60, -58, 98, -117, -128, -36, 28, -47, 41, 2, 78, 8, -118, 103, -52, 116, 2, 11, -66, -90, 59, 19, -101, 34, 81, 74, 8, 121, -114, 52, 4, -35, -17, -107, 25, -77, -51, 58, 67, 27, 48, 43, 10, 109, -14, 95, 20, 55, 79, -31, 53, 109, 109, 81, -62, 69, -28, -123, -75, 118, 98, 94, 126, -58, -12, 76, 66, -23, -90, 55, -19, 107, 11, -1, 92, -74, -12, 6, -73, -19, -18, 56, 107, -5, 90, -119, -97, -91, -82, -97, 36, 17, 124, 75, 31, -26, 73, 40, 102, 81, -20, -28, 91, 61, -62, 0, 124, -72, -95, 99, -65, 5, -104, -38, 72, 54, 28, 85, -45, -102, 105, 22, 63, -88, -3, 36, -49, 95, -125, 101, 93, 35, -36, -93, -83, -106, 28, 98, -13, 86, 32, -123, 82, -69, -98, -43, 41, 7, 112, -106, -106, 109, 103, 12, 53, 78, 74, -68, -104, 4, -15, 116, 108, 8, -54, 24, 33, 124, 50, -112, 94, 70, 46, 54, -50, 59, -29, -98, 119, 44, 24, 14, -122, 3, -101, 39, -125, -94, -20, 7, -94, -113, -75, -59, 93, -16, 111, 76, 82, -55, -34, 43, -53, -10, -107, 88, 23, 24, 57, -107, 73, 124, -22, -107, 106, -27, 21, -46, 38, 24, -104, -6, 5, 16, 21, 114, -114, 90, -118, -84, -86, 104, -1, -1, -1, -1, -1, -1, -1, -1};
    byte[] I_C;
    byte[] I_S;
    byte[] V_C;
    byte[] V_S;
    private Buffer buf;
    DH dh;
    byte[] e;
    private Packet packet;
    private int state;

    @Override // com.jcraft.jsch.KeyExchange
    public int getState() {
        return this.state;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void init(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InterruptedException {
        this.session = session;
        this.V_S = bArr;
        this.V_C = bArr2;
        this.I_S = bArr3;
        this.I_C = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.getConfig("sha-1")).newInstance();
            this.sha = hash;
            hash.init();
        } catch (Exception e) {
            System.err.println(e);
        }
        Buffer buffer = new Buffer();
        this.buf = buffer;
        this.packet = new Packet(buffer);
        DH dh = (DH) Class.forName(session.getConfig("dh")).newInstance();
        this.dh = dh;
        dh.init();
        this.dh.setP(p);
        this.dh.setG(g);
        this.e = this.dh.getE();
        this.packet.reset();
        this.buf.putByte((byte) 30);
        this.buf.putMPInt(this.e);
        if (bArr == null) {
            return;
        }
        session.write(this.packet);
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "SSH_MSG_KEXDH_INIT sent");
            JSch.getLogger().log(1, "expecting SSH_MSG_KEXDH_REPLY");
        }
        this.state = SSH_MSG_KEXDH_REPLY;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public boolean next(Buffer buffer) {
        if (this.state != SSH_MSG_KEXDH_REPLY) {
            return false;
        }
        buffer.getInt();
        buffer.getByte();
        int i = buffer.getByte();
        if (i != SSH_MSG_KEXDH_REPLY) {
            System.err.println("type: must be 31 " + i);
            return false;
        }
        this.K_S = buffer.getString();
        byte[] mPInt = buffer.getMPInt();
        byte[] string = buffer.getString();
        this.dh.setF(mPInt);
        this.dh.checkRange();
        this.K = normalize(this.dh.getK());
        this.buf.reset();
        this.buf.putString(this.V_C);
        this.buf.putString(this.V_S);
        this.buf.putString(this.I_C);
        this.buf.putString(this.I_S);
        this.buf.putString(this.K_S);
        this.buf.putMPInt(this.e);
        this.buf.putMPInt(mPInt);
        this.buf.putMPInt(this.K);
        int length = this.buf.getLength();
        byte[] bArr = new byte[length];
        this.buf.getByte(bArr);
        this.sha.update(bArr, 0, length);
        this.H = this.sha.digest();
        byte[] bArr2 = this.K_S;
        int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean zVerify = verify(Util.byte2str(bArr2, 4, i2), this.K_S, 4 + i2, string);
        this.state = 0;
        return zVerify;
    }
}
