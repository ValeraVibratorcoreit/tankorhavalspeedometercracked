package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0519qp extends AbstractC0494q0 implements InterfaceC0542ri {
    public Context c;
    public ActionBarContextView d;
    public InterfaceC0463p0 e;
    public WeakReference f;
    public boolean g;
    public MenuC0604ti h;

    @Override // defpackage.AbstractC0494q0
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.n(this);
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
        return this.h;
    }

    @Override // defpackage.AbstractC0494q0
    public final MenuInflater d() {
        return new Sp(this.d.getContext());
    }

    @Override // defpackage.AbstractC0494q0
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.AbstractC0494q0
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // defpackage.AbstractC0494q0
    public final void g() {
        this.e.j(this, this.h);
    }

    @Override // defpackage.AbstractC0494q0
    public final boolean h() {
        return this.d.s;
    }

    @Override // defpackage.AbstractC0494q0
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.AbstractC0494q0
    public final void j(int i) {
        l(this.c.getString(i));
    }

    @Override // defpackage.InterfaceC0542ri
    public final void k(MenuC0604ti menuC0604ti) {
        g();
        C0339l0 c0339l0 = this.d.d;
        if (c0339l0 != null) {
            c0339l0.l();
        }
    }

    @Override // defpackage.AbstractC0494q0
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.AbstractC0494q0
    public final void m(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.InterfaceC0542ri
    public final boolean n(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // defpackage.AbstractC0494q0
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.AbstractC0494q0
    public final void p(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
