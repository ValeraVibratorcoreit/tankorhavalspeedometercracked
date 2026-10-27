package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class Dn {
    public static final Cn a = new Cn(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(Cn cn) {
        Tf.j("segment", cn);
        if (cn.f != null || cn.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (cn.d) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Tf.i("Thread.currentThread()", threadCurrentThread);
        AtomicReference atomicReference = c[(int) (threadCurrentThread.getId() & (((long) b) - 1))];
        Cn cn2 = (Cn) atomicReference.get();
        if (cn2 == a) {
            return;
        }
        int i = cn2 != null ? cn2.c : 0;
        if (i >= 65536) {
            return;
        }
        cn.f = cn2;
        cn.b = 0;
        cn.c = i + 8192;
        while (!atomicReference.compareAndSet(cn2, cn)) {
            if (atomicReference.get() != cn2) {
                cn.f = null;
                return;
            }
        }
    }

    public static final Cn b() {
        Thread threadCurrentThread = Thread.currentThread();
        Tf.i("Thread.currentThread()", threadCurrentThread);
        AtomicReference atomicReference = c[(int) (threadCurrentThread.getId() & (((long) b) - 1))];
        Cn cn = a;
        Cn cn2 = (Cn) atomicReference.getAndSet(cn);
        if (cn2 == cn) {
            return new Cn();
        }
        if (cn2 == null) {
            atomicReference.set(null);
            return new Cn();
        }
        atomicReference.set(cn2.f);
        cn2.f = null;
        cn2.c = 0;
        return cn2;
    }
}
