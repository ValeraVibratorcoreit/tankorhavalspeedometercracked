package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0567sc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractViewOnTouchListenerC0598tc b;

    public /* synthetic */ RunnableC0567sc(AbstractViewOnTouchListenerC0598tc abstractViewOnTouchListenerC0598tc, int i) {
        this.a = i;
        this.b = abstractViewOnTouchListenerC0598tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0598tc abstractViewOnTouchListenerC0598tc = this.b;
                abstractViewOnTouchListenerC0598tc.a();
                View view = abstractViewOnTouchListenerC0598tc.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0598tc.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0598tc.g = true;
                    break;
                }
                break;
        }
    }
}
