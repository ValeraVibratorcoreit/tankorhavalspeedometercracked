package com.jcraft.jsch;

import java.io.IOException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
class ChannelAgentForwarding extends Channel {
    private static final int LOCAL_MAXIMUM_PACKET_SIZE = 16384;
    private static final int LOCAL_WINDOW_SIZE_MAX = 131072;
    private Buffer mbuf;
    private Buffer rbuf;
    private final byte SSH_AGENTC_REQUEST_RSA_IDENTITIES = 1;
    private final byte SSH_AGENT_RSA_IDENTITIES_ANSWER = 2;
    private final byte SSH_AGENTC_RSA_CHALLENGE = 3;
    private final byte SSH_AGENT_RSA_RESPONSE = 4;
    private final byte SSH_AGENT_FAILURE = 5;
    private final byte SSH_AGENT_SUCCESS = 6;
    private final byte SSH_AGENTC_ADD_RSA_IDENTITY = 7;
    private final byte SSH_AGENTC_REMOVE_RSA_IDENTITY = 8;
    private final byte SSH_AGENTC_REMOVE_ALL_RSA_IDENTITIES = 9;
    private final byte SSH2_AGENTC_REQUEST_IDENTITIES = 11;
    private final byte SSH2_AGENT_IDENTITIES_ANSWER = 12;
    private final byte SSH2_AGENTC_SIGN_REQUEST = 13;
    private final byte SSH2_AGENT_SIGN_RESPONSE = 14;
    private final byte SSH2_AGENTC_ADD_IDENTITY = 17;
    private final byte SSH2_AGENTC_REMOVE_IDENTITY = 18;
    private final byte SSH2_AGENTC_REMOVE_ALL_IDENTITIES = 19;
    private final byte SSH2_AGENT_FAILURE = 30;
    boolean init = true;
    private Buffer wbuf = null;
    private Packet packet = null;

    public ChannelAgentForwarding() {
        this.rbuf = null;
        this.mbuf = null;
        setLocalWindowSizeMax(LOCAL_WINDOW_SIZE_MAX);
        setLocalWindowSize(LOCAL_WINDOW_SIZE_MAX);
        setLocalPacketSize(LOCAL_MAXIMUM_PACKET_SIZE);
        this.type = Util.str2byte("auth-agent@openssh.com");
        Buffer buffer = new Buffer();
        this.rbuf = buffer;
        buffer.reset();
        this.mbuf = new Buffer();
        this.connected = true;
    }

    private void send(byte[] bArr) {
        this.packet.reset();
        this.wbuf.putByte((byte) 94);
        this.wbuf.putInt(this.recipient);
        this.wbuf.putInt(bArr.length + 4);
        this.wbuf.putString(bArr);
        try {
            getSession().write(this.packet, this, bArr.length + 4);
        } catch (Exception unused) {
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void eof_remote() {
        super.eof_remote();
        eof();
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() {
        try {
            sendOpenConfirmation();
        } catch (Exception unused) {
            this.close = true;
            disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x014a A[SYNTHETIC] */
    @Override // com.jcraft.jsch.Channel
    public void write(byte[] bArr, int i, int i2) throws IOException {
        Identity identity;
        String passphrase;
        if (this.packet == null) {
            Buffer buffer = new Buffer(this.rmpsize);
            this.wbuf = buffer;
            this.packet = new Packet(buffer);
        }
        this.rbuf.shift();
        Buffer buffer2 = this.rbuf;
        byte[] bArr2 = buffer2.buffer;
        int i3 = 0;
        if (bArr2.length < buffer2.index + i2) {
            byte[] bArr3 = new byte[buffer2.s + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.rbuf.buffer = bArr3;
        }
        this.rbuf.putByte(bArr, i, i2);
        if (this.rbuf.getInt() > this.rbuf.getLength()) {
            this.rbuf.s -= 4;
            return;
        }
        int i4 = this.rbuf.getByte();
        try {
            Session session = getSession();
            IdentityRepository identityRepository = session.getIdentityRepository();
            UserInfo userInfo = session.getUserInfo();
            this.mbuf.reset();
            if (i4 == 11) {
                this.mbuf.putByte((byte) 12);
                Vector identities = identityRepository.getIdentities();
                synchronized (identities) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < identities.size(); i6++) {
                        try {
                            if (((Identity) identities.elementAt(i6)).getPublicKeyBlob() != null) {
                                i5++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.mbuf.putInt(i5);
                    while (i3 < identities.size()) {
                        byte[] publicKeyBlob = ((Identity) identities.elementAt(i3)).getPublicKeyBlob();
                        if (publicKeyBlob != null) {
                            this.mbuf.putString(publicKeyBlob);
                            this.mbuf.putString(Util.empty);
                        }
                        i3++;
                    }
                }
            } else if (i4 == 1) {
                this.mbuf.putByte((byte) 2);
                this.mbuf.putInt(0);
            } else if (i4 == 13) {
                byte[] string = this.rbuf.getString();
                byte[] string2 = this.rbuf.getString();
                this.rbuf.getInt();
                Vector identities2 = identityRepository.getIdentities();
                synchronized (identities2) {
                    while (true) {
                        if (i3 >= identities2.size()) {
                            identity = null;
                            break;
                        }
                        identity = (Identity) identities2.elementAt(i3);
                        if (identity.getPublicKeyBlob() != null && Util.array_equals(string, identity.getPublicKeyBlob())) {
                            if (!identity.isEncrypted()) {
                                if (!identity.isEncrypted()) {
                                    break;
                                }
                            } else if (userInfo != null) {
                                while (identity.isEncrypted()) {
                                    if (!userInfo.promptPassphrase("Passphrase for " + identity.getName()) || (passphrase = userInfo.getPassphrase()) == null) {
                                        break;
                                        break;
                                    } else {
                                        try {
                                            if (identity.setPassphrase(Util.str2byte(passphrase))) {
                                                break;
                                            }
                                        } catch (JSchException unused) {
                                        }
                                    }
                                }
                                if (!identity.isEncrypted()) {
                                    break;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                }
                byte[] signature = identity != null ? identity.getSignature(string2) : null;
                if (signature == null) {
                    this.mbuf.putByte((byte) 30);
                } else {
                    this.mbuf.putByte((byte) 14);
                    this.mbuf.putString(signature);
                }
            } else if (i4 == 18) {
                identityRepository.remove(this.rbuf.getString());
                this.mbuf.putByte((byte) 6);
            } else if (i4 == 9) {
                this.mbuf.putByte((byte) 6);
            } else if (i4 == 19) {
                identityRepository.removeAll();
                this.mbuf.putByte((byte) 6);
            } else if (i4 == 17) {
                byte[] bArr4 = new byte[this.rbuf.getLength()];
                this.rbuf.getByte(bArr4);
                this.mbuf.putByte(identityRepository.add(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                Buffer buffer3 = this.rbuf;
                buffer3.skip(buffer3.getLength() - 1);
                this.mbuf.putByte((byte) 5);
            }
            byte[] bArr5 = new byte[this.mbuf.getLength()];
            this.mbuf.getByte(bArr5);
            send(bArr5);
        } catch (JSchException e) {
            throw new IOException(e.toString());
        }
    }
}
