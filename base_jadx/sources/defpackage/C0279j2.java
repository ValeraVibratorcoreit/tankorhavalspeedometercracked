package defpackage;

import android.view.View;

/* JADX INFO: renamed from: j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0279j2 extends AbstractViewOnTouchListenerC0598tc {
    public final /* synthetic */ C0496q2 j;
    public final /* synthetic */ C0588t2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279j2(C0588t2 c0588t2, View view, C0496q2 c0496q2) {
        super(view);
        this.k = c0588t2;
        this.j = c0496q2;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0598tc
    public final Co b() {
        return this.j;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0598tc
    public final boolean c() {
        C0588t2 c0588t2 = this.k;
        if (c0588t2.getInternalPopup().a()) {
            return true;
        }
        c0588t2.f.d(c0588t2.getTextDirection(), c0588t2.getTextAlignment());
        return true;
    }
}
