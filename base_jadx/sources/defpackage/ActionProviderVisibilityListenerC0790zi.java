package defpackage;

import android.view.ActionProvider;

/* JADX INFO: renamed from: zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0790zi implements ActionProvider.VisibilityListener {
    public C0308k0 a;
    public final ActionProvider b;
    public final /* synthetic */ Ci c;

    public ActionProviderVisibilityListenerC0790zi(Ci ci, ActionProvider actionProvider) {
        this.c = ci;
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C0308k0 c0308k0 = this.a;
        if (c0308k0 != null) {
            MenuC0604ti menuC0604ti = ((C0759yi) c0308k0.b).n;
            menuC0604ti.h = true;
            menuC0604ti.p(true);
        }
    }
}
