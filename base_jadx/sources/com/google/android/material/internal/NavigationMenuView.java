package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.MenuC0604ti;
import defpackage.Ni;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements Ni {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // defpackage.Ni
    public final void b(MenuC0604ti menuC0604ti) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
