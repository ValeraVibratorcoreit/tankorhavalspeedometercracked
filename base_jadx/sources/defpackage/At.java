package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class At extends AbstractC0494q0 implements InterfaceC0542ri {
    public final Context c;
    public final MenuC0604ti d;
    public InterfaceC0463p0 e;
    public WeakReference f;
    public final /* synthetic */ Bt g;

    public At(Bt bt, Context context, C0096d2 c0096d2) {
        this.g = bt;
        this.c = context;
        this.e = c0096d2;
        MenuC0604ti menuC0604ti = new MenuC0604ti(context);
        menuC0604ti.l = 1;
        this.d = menuC0604ti;
        menuC0604ti.e = this;
    }

    @Override // defpackage.AbstractC0494q0
    public final void a() {
        Bt bt = this.g;
        if (bt.r != this) {
            return;
        }
        if (bt.y) {
            bt.s = this;
            bt.t = this.e;
        } else {
            this.e.n(this);
        }
        this.e = null;
        bt.B0(false);
        ActionBarContextView actionBarContextView = bt.o;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        bt.l.setHideOnContentScrollEnabled(bt.D);
        bt.r = null;
    }

    @Override // defpackage.AbstractC0494q0
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.AbstractC0494q0
    public final MenuC0604ti c() {
        return this.d;
    }

    @Override // defpackage.AbstractC0494q0
    public final MenuInflater d() {
        return new Sp(this.c);
    }

    @Override // defpackage.AbstractC0494q0
    public final CharSequence e() {
        return this.g.o.getSubtitle();
    }

    @Override // defpackage.AbstractC0494q0
    public final CharSequence f() {
        return this.g.o.getTitle();
    }

    @Override // defpackage.AbstractC0494q0
    public final void g() {
        if (this.g.r != this) {
            return;
        }
        MenuC0604ti menuC0604ti = this.d;
        menuC0604ti.w();
        try {
            this.e.j(this, menuC0604ti);
        } finally {
            menuC0604ti.v();
        }
    }

    @Override // defpackage.AbstractC0494q0
    public final boolean h() {
        return this.g.o.s;
    }

    @Override // defpackage.AbstractC0494q0
    public final void i(View view) {
        this.g.o.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.AbstractC0494q0
    public final void j(int i) {
        l(this.g.j.getResources().getString(i));
    }

    @Override // defpackage.InterfaceC0542ri
    public final void k(MenuC0604ti menuC0604ti) {
        if (this.e == null) {
            return;
        }
        g();
        C0339l0 c0339l0 = this.g.o.d;
        if (c0339l0 != null) {
            c0339l0.l();
        }
    }

    @Override // defpackage.AbstractC0494q0
    public final void l(CharSequence charSequence) {
        this.g.o.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC0494q0
    public final void m(int i) {
        o(this.g.j.getResources().getString(i));
    }

    @Override // defpackage.InterfaceC0542ri
    public final boolean n(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        InterfaceC0463p0 interfaceC0463p0 = this.e;
        if (interfaceC0463p0 != null) {
            return interfaceC0463p0.a(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.AbstractC0494q0
    public final void o(CharSequence charSequence) {
        this.g.o.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC0494q0
    public final void p(boolean z) {
        this.b = z;
        this.g.o.setTitleOptional(z);
    }
}
