package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Vh extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ Yh F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vh(Yh yh, int i, int i2) {
        super(i);
        this.F = yh;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(C0269im c0269im, int[] iArr) {
        int i = this.E;
        Yh yh = this.F;
        if (i == 0) {
            iArr[0] = yh.a0.getWidth();
            iArr[1] = yh.a0.getWidth();
        } else {
            iArr[0] = yh.a0.getHeight();
            iArr[1] = yh.a0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final void y0(RecyclerView recyclerView, int i) {
        Ro ro = new Ro(recyclerView.getContext());
        ro.a = i;
        z0(ro);
    }
}
