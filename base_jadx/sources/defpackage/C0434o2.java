package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0434o2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0434o2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.a) {
            case 0:
                C0496q2 c0496q2 = (C0496q2) this.b;
                c0496q2.G.setSelection(i);
                if (c0496q2.G.getOnItemClickListener() != null) {
                    c0496q2.G.performItemClick(view, i, c0496q2.D.getItemId(i));
                }
                c0496q2.dismiss();
                break;
            default:
                Nh nh = (Nh) this.b;
                if (i < 0) {
                    C0018ah c0018ah = nh.e;
                    item = !c0018ah.z.isShowing() ? null : c0018ah.c.getSelectedItem();
                } else {
                    item = nh.getAdapter().getItem(i);
                }
                Nh.a(nh, item);
                AdapterView.OnItemClickListener onItemClickListener = nh.getOnItemClickListener();
                C0018ah c0018ah2 = nh.e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c0018ah2.z.isShowing() ? c0018ah2.c.getSelectedView() : null;
                        i = !c0018ah2.z.isShowing() ? -1 : c0018ah2.c.getSelectedItemPosition();
                        j = !c0018ah2.z.isShowing() ? Long.MIN_VALUE : c0018ah2.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0018ah2.c, view, i, j);
                }
                c0018ah2.dismiss();
                break;
        }
    }
}
