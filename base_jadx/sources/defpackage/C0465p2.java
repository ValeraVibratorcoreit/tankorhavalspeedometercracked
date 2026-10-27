package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0465p2 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    public final /* synthetic */ C0496q2 b;

    public C0465p2(C0496q2 c0496q2, ViewTreeObserverOnGlobalLayoutListenerC0310k2 viewTreeObserverOnGlobalLayoutListenerC0310k2) {
        this.b = c0496q2;
        this.a = viewTreeObserverOnGlobalLayoutListenerC0310k2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
