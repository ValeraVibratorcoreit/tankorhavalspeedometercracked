package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0033b1 implements InterfaceC0171fg {
    public final int b;
    public final InterfaceC0171fg c;

    public C0033b1(int i, InterfaceC0171fg interfaceC0171fg) {
        this.b = i;
        this.c = interfaceC0171fg;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0033b1)) {
            return false;
        }
        C0033b1 c0033b1 = (C0033b1) obj;
        return this.b == c0033b1.b && this.c.equals(c0033b1.c);
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return Qr.h(this.b, this.c);
    }
}
