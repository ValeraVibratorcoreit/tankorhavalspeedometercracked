package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class Bc extends Br implements InterfaceC0083ck, InterfaceC0297jk, InterfaceC0175fk, InterfaceC0206gk, Ss, InterfaceC0052bk, D0, InterfaceC0733xn, Sc, InterfaceC0666vi {
    public final Activity j;
    public final Context k;
    public final Handler l;
    public final Oc m;
    public final /* synthetic */ AbstractActivityC0495q1 n;

    public Bc(AbstractActivityC0495q1 abstractActivityC0495q1) {
        this.n = abstractActivityC0495q1;
        Handler handler = new Handler();
        this.m = new Oc();
        this.j = abstractActivityC0495q1;
        this.k = abstractActivityC0495q1;
        this.l = handler;
    }

    public final void B0(Ic ic) {
        this.n.f(ic);
    }

    public final void C0(InterfaceC0748y7 interfaceC0748y7) {
        this.n.g(interfaceC0748y7);
    }

    public final void D0(Fc fc) {
        this.n.i(fc);
    }

    public final void E0(Fc fc) {
        this.n.j(fc);
    }

    public final void F0(Fc fc) {
        this.n.k(fc);
    }

    public final void G0(Ic ic) {
        this.n.o(ic);
    }

    public final void H0(Fc fc) {
        this.n.p(fc);
    }

    public final void I0(Fc fc) {
        this.n.q(fc);
    }

    public final void J0(Fc fc) {
        this.n.r(fc);
    }

    public final void K0(Fc fc) {
        this.n.s(fc);
    }

    @Override // defpackage.Br
    public final View N(int i) {
        return this.n.findViewById(i);
    }

    @Override // defpackage.Br
    public final boolean Q() {
        Window window = this.n.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.Sc
    public final void a() {
        this.n.getClass();
    }

    @Override // defpackage.InterfaceC0733xn
    public final C0711x1 b() {
        return (C0711x1) this.n.d.d;
    }

    @Override // defpackage.Ss
    public final Rs d() {
        return this.n.d();
    }

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        return this.n.t;
    }
}
