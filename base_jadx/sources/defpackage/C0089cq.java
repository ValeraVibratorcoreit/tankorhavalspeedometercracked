package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089cq {
    public Drawable a;
    public CharSequence b;
    public CharSequence c;
    public int d;
    public View e;
    public TabLayout f;
    public C0150eq g;
    public int h;

    public final void a() {
        TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.h(this);
    }
}
