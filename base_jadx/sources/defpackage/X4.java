package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class X4 {
    public final ArrayDeque a;

    public X4(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque();
                break;
            default:
                char[] cArr = Qr.a;
                this.a = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void a(Rd rd) {
        rd.b = null;
        rd.c = null;
        this.a.offer(rd);
    }
}
