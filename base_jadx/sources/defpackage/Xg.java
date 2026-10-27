package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class Xg extends DataSetObserver {
    public final /* synthetic */ C0018ah a;

    public Xg(C0018ah c0018ah) {
        this.a = c0018ah;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0018ah c0018ah = this.a;
        if (c0018ah.z.isShowing()) {
            c0018ah.e();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
