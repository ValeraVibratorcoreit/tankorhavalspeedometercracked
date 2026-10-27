package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Fr {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final C0296jj b;
    public volatile int c = 0;

    public Fr(C0296jj c0296jj, int i) {
        this.b = c0296jj;
        this.a = i;
    }

    public final int a(int i) {
        Pi piC = c();
        int iA = piC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) piC.d;
        int i2 = iA + piC.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        Pi piC = c();
        int iA = piC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i = iA + piC.a;
        return ((ByteBuffer) piC.d).getInt(((ByteBuffer) piC.d).getInt(i) + i);
    }

    public final Pi c() {
        ThreadLocal threadLocal = d;
        Pi pi = (Pi) threadLocal.get();
        if (pi == null) {
            pi = new Pi();
            threadLocal.set(pi);
        }
        Qi qi = (Qi) this.b.a;
        int iA = qi.a(6);
        if (iA != 0) {
            int i = iA + qi.a;
            int i2 = (this.a * 4) + ((ByteBuffer) qi.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) qi.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) qi.d;
            pi.d = byteBuffer;
            if (byteBuffer != null) {
                pi.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                pi.b = i4;
                pi.c = ((ByteBuffer) pi.d).getShort(i4);
            } else {
                pi.a = 0;
                pi.b = 0;
                pi.c = 0;
            }
        }
        return pi;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        Pi piC = c();
        int iA = piC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) piC.d).getInt(iA + piC.a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
