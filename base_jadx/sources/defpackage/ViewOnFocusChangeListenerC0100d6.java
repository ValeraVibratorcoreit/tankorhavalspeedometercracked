package defpackage;

import android.view.View;

/* JADX INFO: renamed from: d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0100d6 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC0105db b;

    public /* synthetic */ ViewOnFocusChangeListenerC0100d6(AbstractC0105db abstractC0105db, int i) {
        this.a = i;
        this.b = abstractC0105db;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                C0192g6 c0192g6 = (C0192g6) this.b;
                c0192g6.t(c0192g6.u());
                break;
            default:
                C0227ha c0227ha = (C0227ha) this.b;
                c0227ha.l = z;
                c0227ha.q();
                if (!z) {
                    c0227ha.t(false);
                    c0227ha.m = false;
                }
                break;
        }
    }
}
