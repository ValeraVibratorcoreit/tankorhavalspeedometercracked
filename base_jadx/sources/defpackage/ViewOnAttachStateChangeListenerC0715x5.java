package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0715x5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0715x5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                C0074cb c0074cb = (C0074cb) obj;
                if (c0074cb.u != null && (accessibilityManager = c0074cb.t) != null) {
                    WeakHashMap weakHashMap = Gs.a;
                    if (c0074cb.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0771z(c0074cb.u));
                    }
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = Gs.a;
                AbstractC0614ts.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.a) {
            case 0:
                A5 a5 = (A5) this.b;
                ViewTreeObserver viewTreeObserver = a5.y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        a5.y = view.getViewTreeObserver();
                    }
                    a5.y.removeGlobalOnLayoutListener(a5.j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C0074cb c0074cb = (C0074cb) this.b;
                C0098d4 c0098d4 = c0074cb.u;
                if (c0098d4 != null && (accessibilityManager = c0074cb.t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0771z(c0098d4));
                    break;
                }
                break;
            case 2:
                break;
            default:
                ViewOnKeyListenerC0611tp viewOnKeyListenerC0611tp = (ViewOnKeyListenerC0611tp) this.b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0611tp.p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0611tp.p = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0611tp.p.removeGlobalOnLayoutListener(viewOnKeyListenerC0611tp.j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
