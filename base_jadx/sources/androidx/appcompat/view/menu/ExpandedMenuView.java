package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.C0759yi;
import defpackage.InterfaceC0573si;
import defpackage.K2;
import defpackage.MenuC0604ti;
import defpackage.Ni;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0573si, Ni, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public MenuC0604ti a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        K2 k2G = K2.G(context, attributeSet, b, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) k2G.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(k2G.q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(k2G.q(1));
        }
        k2G.J();
    }

    @Override // defpackage.InterfaceC0573si
    public final boolean a(C0759yi c0759yi) {
        return this.a.q(c0759yi, null, 0);
    }

    @Override // defpackage.Ni
    public final void b(MenuC0604ti menuC0604ti) {
        this.a = menuC0604ti;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((C0759yi) getAdapter().getItem(i));
    }
}
