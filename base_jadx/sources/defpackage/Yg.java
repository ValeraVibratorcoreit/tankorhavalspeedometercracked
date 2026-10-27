package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class Yg implements AbsListView.OnScrollListener {
    public final /* synthetic */ C0018ah a;

    public Yg(C0018ah c0018ah) {
        this.a = c0018ah;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C0018ah c0018ah = this.a;
            if (c0018ah.z.getInputMethodMode() == 2 || c0018ah.z.getContentView() == null) {
                return;
            }
            Handler handler = c0018ah.v;
            Wg wg = c0018ah.r;
            handler.removeCallbacks(wg);
            wg.run();
        }
    }
}
