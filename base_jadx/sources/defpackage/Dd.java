package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Dd implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final V5 f = new V5(2);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static AbstractC0361lm c(RecyclerView recyclerView, int i, long j) {
        int iA = recyclerView.e.A();
        for (int i2 = 0; i2 < iA; i2++) {
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(recyclerView.e.z(i2));
            if (abstractC0361lmI.c == i && !abstractC0361lmI.g()) {
                return null;
            }
        }
        C0085cm c0085cm = recyclerView.b;
        try {
            recyclerView.Q();
            AbstractC0361lm abstractC0361lmI2 = c0085cm.i(j, i);
            if (abstractC0361lmI2 != null) {
                if (!abstractC0361lmI2.f() || abstractC0361lmI2.g()) {
                    c0085cm.a(abstractC0361lmI2, false);
                } else {
                    c0085cm.f(abstractC0361lmI2.a);
                }
            }
            return abstractC0361lmI2;
        } finally {
            recyclerView.R(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.p && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        Bd bd = recyclerView.b0;
        bd.a = i;
        bd.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    public final void b(long j) {
        Cd cd;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Cd cd2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                Bd bd = recyclerView3.b0;
                bd.c(recyclerView3, false);
                i += bd.c;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                Bd bd2 = recyclerView4.b0;
                int iAbs = Math.abs(bd2.b) + Math.abs(bd2.a);
                for (int i5 = 0; i5 < bd2.c * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        cd2 = new Cd();
                        arrayList2.add(cd2);
                    } else {
                        cd2 = (Cd) arrayList2.get(i3);
                    }
                    int[] iArr = (int[]) bd2.d;
                    int i6 = iArr[i5 + 1];
                    cd2.a = i6 <= iAbs;
                    cd2.b = iAbs;
                    cd2.c = i6;
                    cd2.d = recyclerView4;
                    cd2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (cd = (Cd) arrayList2.get(i7)).d) != null; i7++) {
            AbstractC0361lm abstractC0361lmC = c(recyclerView, cd.e, cd.a ? Long.MAX_VALUE : j);
            if (abstractC0361lmC != null && abstractC0361lmC.b != null && abstractC0361lmC.f() && !abstractC0361lmC.g() && (recyclerView2 = (RecyclerView) abstractC0361lmC.b.get()) != null) {
                if (recyclerView2.y && recyclerView2.e.A() != 0) {
                    Sl sl = recyclerView2.H;
                    if (sl != null) {
                        sl.f();
                    }
                    Wl wl = recyclerView2.l;
                    C0085cm c0085cm = recyclerView2.b;
                    if (wl != null) {
                        wl.h0(c0085cm);
                        recyclerView2.l.i0(c0085cm);
                    }
                    c0085cm.a.clear();
                    c0085cm.d();
                }
                Bd bd3 = recyclerView2.b0;
                bd3.c(recyclerView2, true);
                if (bd3.c != 0) {
                    try {
                        int i8 = AbstractC0090cr.a;
                        Trace.beginSection("RV Nested Prefetch");
                        C0269im c0269im = recyclerView2.c0;
                        Ol ol = recyclerView2.k;
                        c0269im.d = 1;
                        c0269im.e = ol.a();
                        c0269im.g = false;
                        c0269im.h = false;
                        c0269im.i = false;
                        for (int i9 = 0; i9 < bd3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) bd3.d)[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = AbstractC0090cr.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cd.a = false;
            cd.b = 0;
            cd.c = 0;
            cd.d = null;
            cd.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC0090cr.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                this.b = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.b = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                this.b = 0L;
            }
        } finally {
            this.b = 0L;
            int i3 = AbstractC0090cr.a;
            Trace.endSection();
        }
    }
}
