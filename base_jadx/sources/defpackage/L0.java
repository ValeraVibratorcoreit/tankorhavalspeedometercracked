package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ P0 a;
    public final /* synthetic */ M0 b;

    public L0(M0 m0, P0 p0) {
        this.b = m0;
        this.a = p0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        M0 m0 = this.b;
        DialogInterface.OnClickListener onClickListener = m0.q;
        P0 p0 = this.a;
        onClickListener.onClick(p0.b, i);
        if (m0.s) {
            return;
        }
        p0.b.dismiss();
    }
}
