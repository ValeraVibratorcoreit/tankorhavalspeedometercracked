package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: renamed from: e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124e0 extends AbstractViewOnTouchListenerC0598tc {
    public final /* synthetic */ int j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124e0(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0598tc
    public final Co b() {
        C0186g0 c0186g0;
        switch (this.j) {
            case 0:
                AbstractC0155f0 abstractC0155f0 = ((ActionMenuItemView) this.k).l;
                if (abstractC0155f0 == null || (c0186g0 = ((C0217h0) abstractC0155f0).a.t) == null) {
                    return null;
                }
                return c0186g0.a();
            default:
                C0186g0 c0186g1 = ((C0277j0) this.k).d.s;
                if (c0186g1 == null) {
                    return null;
                }
                return c0186g1.a();
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0598tc
    public final boolean c() {
        Co coB;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.k;
                InterfaceC0573si interfaceC0573si = actionMenuItemView.j;
                return interfaceC0573si != null && interfaceC0573si.a(actionMenuItemView.g) && (coB = b()) != null && coB.a();
            default:
                ((C0277j0) this.k).d.l();
                return true;
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0598tc
    public boolean d() {
        switch (this.j) {
            case 1:
                C0339l0 c0339l0 = ((C0277j0) this.k).d;
                if (c0339l0.u != null) {
                    return false;
                }
                c0339l0.e();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124e0(C0277j0 c0277j0, View view) {
        super(view);
        this.k = c0277j0;
    }
}
