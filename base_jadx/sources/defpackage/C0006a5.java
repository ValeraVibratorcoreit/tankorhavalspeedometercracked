package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a5 implements InterfaceC0132e8, InterfaceC0687w8, InterfaceC0452ok {
    public final /* synthetic */ int a;
    public final ByteBuffer b;

    public C0006a5(ByteBuffer byteBuffer, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.b = byteBuffer;
                break;
        }
    }

    @Override // defpackage.InterfaceC0687w8
    public long a(long j) {
        ByteBuffer byteBuffer = this.b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public short b(int i) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    @Override // defpackage.InterfaceC0132e8
    public void c() {
    }

    @Override // defpackage.InterfaceC0687w8
    public int d() {
        return (r() << 8) | r();
    }

    @Override // defpackage.InterfaceC0452ok
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.a) {
            case 3:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.b) {
                    this.b.position(0);
                    messageDigest.update(this.b.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.b) {
                    this.b.position(0);
                    messageDigest.update(this.b.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC0132e8
    public Object f() {
        ByteBuffer byteBuffer = this.b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC0687w8
    public int q(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.b;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // defpackage.InterfaceC0687w8
    public short r() throws C0656v8 {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0656v8();
    }

    public C0006a5(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = ByteBuffer.allocate(4);
                break;
            default:
                this.b = ByteBuffer.allocate(8);
                break;
        }
    }

    public C0006a5(byte[] bArr, int i) {
        this.a = 2;
        this.b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }
}
