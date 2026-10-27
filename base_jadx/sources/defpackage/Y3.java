package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y3 implements Yi {
    public final Object a;

    public Y3(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                char[] cArr = Qr.a;
                this.a = new ArrayDeque(20);
                break;
        }
    }

    public void a(Mk mk) {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(mk);
        }
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        return new T4((C0225h8) this.a, 2);
    }

    public Y3(C0225h8 c0225h8) {
        this.a = c0225h8;
    }
}
