package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import defpackage.C0051bj;
import defpackage.Yh;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ c b;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = cVar;
        this.a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        C0051bj c0051bjA = materialCalendarGridView.a();
        if (i < c0051bjA.a() || i > c0051bjA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((Yh) this.b.d.b).V.c.a) {
            throw null;
        }
    }
}
