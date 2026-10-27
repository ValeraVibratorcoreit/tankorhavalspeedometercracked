package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Wh extends Tl {
    public final /* synthetic */ Yh a;

    public Wh(Yh yh) {
        this.a = yh;
        Nr.d(null);
        Nr.d(null);
    }

    @Override // defpackage.Tl
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof eu) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.a.getClass();
            throw null;
        }
    }
}
