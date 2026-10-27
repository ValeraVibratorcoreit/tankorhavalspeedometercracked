package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public abstract class DHECN extends KeyExchange {
    private static final int SSH_MSG_KEX_ECDH_INIT = 30;
    private static final int SSH_MSG_KEX_ECDH_REPLY = 31;
    byte[] I_C;
    byte[] I_S;
    byte[] Q_C;
    byte[] V_C;
    byte[] V_S;
    private Buffer buf;
    byte[] e;
    private ECDH ecdh;
    protected int key_size;
    private Packet packet;
    protected String sha_name;
    private int state;

    @Override // com.jcraft.jsch.KeyExchange
    public int getState() {
        return this.state;
    }

    @Override // com.jcraft.jsch.KeyExchange
    public void init(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InterruptedException, JSchException {
        this.session = session;
        this.V_S = bArr;
        this.V_C = bArr2;
        this.I_S = bArr3;
        this.I_C = bArr4;
        try {
            HASH hash = (HASH) Class.forName(session.getConfig(this.sha_name)).newInstance();
            this.sha = hash;
            hash.init();
        } catch (Exception e) {
            System.err.println(e);
        }
        Buffer buffer = new Buffer();
        this.buf = buffer;
        Packet packet = new Packet(buffer);
        this.packet = packet;
        packet.reset();
        this.buf.putByte((byte) 30);
        try {
            ECDH ecdh = (ECDH) Class.forName(session.getConfig("ecdh-sha2-nistp")).newInstance();
            this.ecdh = ecdh;
            ecdh.init(this.key_size);
            byte[] q = this.ecdh.getQ();
            this.Q_C = q;
            this.buf.putString(q);
            if (bArr == null) {
                return;
            }
            session.write(this.packet);
            if (JSch.getLogger().isEnabled(1)) {
                JSch.getLogger().log(1, "SSH_MSG_KEX_ECDH_INIT sent");
                JSch.getLogger().log(1, "expecting SSH_MSG_KEX_ECDH_REPLY");
            }
            this.state = SSH_MSG_KEX_ECDH_REPLY;
        } catch (Exception e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    @Override // com.jcraft.jsch.KeyExchange
    public boolean next(Buffer buffer) {
        if (this.state != SSH_MSG_KEX_ECDH_REPLY) {
            return false;
        }
        buffer.getInt();
        buffer.getByte();
        int i = buffer.getByte();
        if (i != SSH_MSG_KEX_ECDH_REPLY) {
            System.err.println("type: must be 31 " + i);
            return false;
        }
        this.K_S = buffer.getString();
        byte[] string = buffer.getString();
        byte[][] bArrFromPoint = KeyPairECDSA.fromPoint(string);
        if (!this.ecdh.validate(bArrFromPoint[0], bArrFromPoint[1])) {
            return false;
        }
        byte[] secret = this.ecdh.getSecret(bArrFromPoint[0], bArrFromPoint[1]);
        this.K = secret;
        this.K = normalize(secret);
        byte[] string2 = buffer.getString();
        this.buf.reset();
        this.buf.putString(this.V_C);
        this.buf.putString(this.V_S);
        this.buf.putString(this.I_C);
        this.buf.putString(this.I_S);
        this.buf.putString(this.K_S);
        this.buf.putString(this.Q_C);
        this.buf.putString(string);
        this.buf.putMPInt(this.K);
        int length = this.buf.getLength();
        byte[] bArr = new byte[length];
        this.buf.getByte(bArr);
        this.sha.update(bArr, 0, length);
        this.H = this.sha.digest();
        byte[] bArr2 = this.K_S;
        int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean zVerify = verify(Util.byte2str(bArr2, 4, i2), this.K_S, 4 + i2, string2);
        this.state = 0;
        return zVerify;
    }
}
