package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class Tg implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ C0018ah a;

    public Tg(C0018ah c0018ah) {
        this.a = c0018ah;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0073ca c0073ca;
        if (i == -1 || (c0073ca = this.a.c) == null) {
            return;
        }
        c0073ca.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
