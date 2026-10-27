package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0673vp extends Tf {
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C0673vp.class, Object.class, "_state");
    private volatile Object _state;
    public int j;

    public C0673vp(Object obj) {
        this._state = obj;
    }

    public final void c0(Object obj) {
        int i;
        if (obj == null) {
            obj = Ud.c;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            if (Tf.b(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.j;
            if ((i2 & 1) != 0) {
                this.j = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.j = i3;
            while (true) {
                synchronized (this) {
                    i = this.j;
                    if (i == i3) {
                        this.j = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
