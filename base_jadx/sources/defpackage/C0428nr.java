package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0428nr extends AbstractC0397mr {
    public final /* synthetic */ C0066c3 a;
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0459or b;

    public C0428nr(ViewTreeObserverOnPreDrawListenerC0459or viewTreeObserverOnPreDrawListenerC0459or, C0066c3 c0066c3) {
        this.b = viewTreeObserverOnPreDrawListenerC0459or;
        this.a = c0066c3;
    }

    @Override // defpackage.InterfaceC0335kr
    public final void f(AbstractC0366lr abstractC0366lr) {
        ((ArrayList) this.a.getOrDefault(this.b.b, null)).remove(abstractC0366lr);
        abstractC0366lr.x(this);
    }
}
