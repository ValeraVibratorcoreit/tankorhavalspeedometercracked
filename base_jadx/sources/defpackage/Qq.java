package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Qq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ Qq(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Tq tq = this.b.M;
                C0759yi c0759yi = tq == null ? null : tq.b;
                if (c0759yi != null) {
                    c0759yi.collapseActionView();
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
