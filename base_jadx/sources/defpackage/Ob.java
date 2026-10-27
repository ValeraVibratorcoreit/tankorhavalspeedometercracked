package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Ob extends Zl {
    public final /* synthetic */ Qb a;

    public Ob(Qb qb) {
        this.a = qb;
    }

    @Override // defpackage.Zl
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        Qb qb = this.a;
        int iComputeVerticalScrollRange = qb.s.computeVerticalScrollRange();
        int i3 = qb.r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = qb.a;
        qb.t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = qb.s.computeHorizontalScrollRange();
        int i6 = qb.q;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        qb.u = z;
        boolean z2 = qb.t;
        if (!z2 && !z) {
            if (qb.v != 0) {
                qb.g(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            qb.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            qb.k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (qb.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i6;
            qb.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            qb.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = qb.v;
        if (i7 == 0 || i7 == 1) {
            qb.g(1);
        }
    }
}
