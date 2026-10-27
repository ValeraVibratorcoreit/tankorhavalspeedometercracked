package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Np extends MenuC0604ti implements SubMenu {
    public final C0759yi A;
    public final MenuC0604ti z;

    public Np(Context context, MenuC0604ti menuC0604ti, C0759yi c0759yi) {
        super(context);
        this.z = menuC0604ti;
        this.A = c0759yi;
    }

    @Override // defpackage.MenuC0604ti
    public final boolean d(C0759yi c0759yi) {
        return this.z.d(c0759yi);
    }

    @Override // defpackage.MenuC0604ti
    public final boolean e(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        return super.e(menuC0604ti, menuItem) || this.z.e(menuC0604ti, menuItem);
    }

    @Override // defpackage.MenuC0604ti
    public final boolean f(C0759yi c0759yi) {
        return this.z.f(c0759yi);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.MenuC0604ti
    public final String j() {
        C0759yi c0759yi = this.A;
        int i = c0759yi != null ? c0759yi.a : 0;
        if (i == 0) {
            return null;
        }
        return Vo.e(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.MenuC0604ti
    public final MenuC0604ti k() {
        return this.z.k();
    }

    @Override // defpackage.MenuC0604ti
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.MenuC0604ti
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.MenuC0604ti
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.MenuC0604ti, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.MenuC0604ti, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
