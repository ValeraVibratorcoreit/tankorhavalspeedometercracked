package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0310k2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0310k2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                C0588t2 c0588t2 = (C0588t2) this.b;
                if (!c0588t2.getInternalPopup().a()) {
                    c0588t2.f.d(c0588t2.getTextDirection(), c0588t2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c0588t2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C0496q2 c0496q2 = (C0496q2) this.b;
                C0588t2 c0588t3 = c0496q2.G;
                c0496q2.getClass();
                if (c0588t3.isAttachedToWindow() && c0588t3.getGlobalVisibleRect(c0496q2.E)) {
                    c0496q2.q();
                    c0496q2.e();
                } else {
                    c0496q2.dismiss();
                }
                break;
            case 2:
                A5 a5 = (A5) this.b;
                if (a5.a()) {
                    ArrayList arrayList = a5.i;
                    if (arrayList.size() > 0 && !((C0777z5) arrayList.get(0)).a.y) {
                        View view = a5.p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0777z5) it.next()).a.e();
                            }
                        } else {
                            a5.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                ViewOnKeyListenerC0611tp viewOnKeyListenerC0611tp = (ViewOnKeyListenerC0611tp) this.b;
                if (viewOnKeyListenerC0611tp.a() && !viewOnKeyListenerC0611tp.i.y) {
                    View view2 = viewOnKeyListenerC0611tp.n;
                    if (view2 != null && view2.isShown()) {
                        viewOnKeyListenerC0611tp.i.e();
                    } else {
                        viewOnKeyListenerC0611tp.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
