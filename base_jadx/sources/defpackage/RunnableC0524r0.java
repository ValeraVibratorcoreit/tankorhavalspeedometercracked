package defpackage;

import android.animation.ValueAnimator;
import android.os.Process;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;

/* JADX INFO: renamed from: r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0524r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0524r0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        View viewFindViewById;
        Object obj;
        boolean z;
        AbstractC0273iq abstractC0273iqC;
        long jNanoTime;
        switch (this.a) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.b).run();
                return;
            case 1:
                K2 k2 = (K2) this.b;
                k2.getClass();
                while (true) {
                    try {
                        k2.f((C0586t0) ((ReferenceQueue) k2.c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewOnTouchListenerC0049bh viewOnTouchListenerC0049bh = (ViewOnTouchListenerC0049bh) this.b;
                if (viewOnTouchListenerC0049bh.o) {
                    boolean z2 = viewOnTouchListenerC0049bh.m;
                    C0435o3 c0435o3 = viewOnTouchListenerC0049bh.a;
                    if (z2) {
                        viewOnTouchListenerC0049bh.m = false;
                        c0435o3.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0435o3.e = jCurrentAnimationTimeMillis;
                        c0435o3.g = -1L;
                        c0435o3.f = jCurrentAnimationTimeMillis;
                        c0435o3.h = 0.5f;
                    }
                    if ((c0435o3.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0435o3.g + ((long) c0435o3.i)) || !viewOnTouchListenerC0049bh.e()) {
                        viewOnTouchListenerC0049bh.o = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC0049bh.n;
                    View view = viewOnTouchListenerC0049bh.c;
                    if (z3) {
                        viewOnTouchListenerC0049bh.n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0435o3.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = c0435o3.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c0435o3.f;
                    c0435o3.f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0049bh.q.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c0435o3.d));
                    WeakHashMap weakHashMap = Gs.a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                E4 e4 = (E4) this.b;
                e4.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) e4.e;
                Ks ks = bottomSheetBehavior.M;
                if (ks != null && ks.f()) {
                    e4.a(e4.b);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.C(e4.b);
                        return;
                    }
                    return;
                }
            case 4:
                L8 l8 = (L8) this.b;
                l8.b.endViewTransition(l8.c);
                l8.d.e();
                return;
            case 5:
                DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9 = (DialogInterfaceOnCancelListenerC0133e9) this.b;
                dialogInterfaceOnCancelListenerC0133e9.W.onDismiss(dialogInterfaceOnCancelListenerC0133e9.e0);
                return;
            case 6:
                C0073ca c0073ca = (C0073ca) this.b;
                c0073ca.l = null;
                c0073ca.drawableStateChanged();
                return;
            case 7:
                Qb qb = (Qb) this.b;
                int i2 = qb.A;
                ValueAnimator valueAnimator = qb.z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                qb.A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                ((Oc) this.b).y(true);
                return;
            case 9:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0353le c0353le = (C0353le) this.b;
                float f = (jCurrentTimeMillis - c0353le.i) / 220.0f;
                if (f >= 1.0f) {
                    c0353le.f = c0353le.k;
                    c0353le.h = false;
                } else {
                    float f2 = c0353le.j;
                    c0353le.f = (c0353le.d.getInterpolation(f) * (c0353le.k - f2)) + f2;
                }
                c0353le.invalidate();
                if (c0353le.h) {
                    c0353le.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                View view2 = (View) ((K2) this.b).d;
                if (view2 == null || (viewFindViewById = view2.findViewById(R.id.logoRight)) == null) {
                    return;
                }
                viewFindViewById.animate().alpha(0.0f).setDuration(2000L).setListener(new Y(viewFindViewById, 4));
                return;
            case 11:
                synchronized (((C0451oj) this.b).a) {
                    obj = ((C0451oj) this.b).f;
                    ((C0451oj) this.b).f = C0451oj.k;
                    break;
                }
                ((C0451oj) this.b).e(obj);
                return;
            case 12:
                RecyclerView recyclerView = (RecyclerView) this.b;
                Sl sl = recyclerView.H;
                if (sl != null) {
                    E8 e8 = (E8) sl;
                    ArrayList arrayList = e8.h;
                    boolean z4 = !arrayList.isEmpty();
                    ArrayList arrayList2 = e8.j;
                    boolean z5 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = e8.k;
                    boolean z6 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = e8.i;
                    boolean z7 = !arrayList4.isEmpty();
                    if (z4 || z5 || z7 || z6) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j2 = e8.d;
                            if (zHasNext) {
                                AbstractC0361lm abstractC0361lm = (AbstractC0361lm) it.next();
                                View view3 = abstractC0361lm.a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                                e8.q.add(abstractC0361lm);
                                viewPropertyAnimatorAnimate.setDuration(j2).alpha(0.0f).setListener(new C0780z8(e8, abstractC0361lm, viewPropertyAnimatorAnimate, view3)).start();
                            } else {
                                arrayList.clear();
                                if (z5) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    e8.m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0749y8 runnableC0749y8 = new RunnableC0749y8(e8, arrayList5, 0);
                                    if (z4) {
                                        View view4 = ((D8) arrayList5.get(0)).a.a;
                                        WeakHashMap weakHashMap2 = Gs.a;
                                        view4.postOnAnimationDelayed(runnableC0749y8, j2);
                                    } else {
                                        runnableC0749y8.run();
                                    }
                                }
                                if (z6) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    e8.n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0749y8 runnableC0749y9 = new RunnableC0749y8(e8, arrayList6, 1);
                                    if (z4) {
                                        View view5 = ((C8) arrayList6.get(0)).a.a;
                                        WeakHashMap weakHashMap3 = Gs.a;
                                        view5.postOnAnimationDelayed(runnableC0749y9, j2);
                                    } else {
                                        runnableC0749y9.run();
                                    }
                                }
                                if (z7) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    e8.l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0749y8 runnableC0749y10 = new RunnableC0749y8(e8, arrayList7, 2);
                                    if (z4 || z5 || z6) {
                                        if (!z4) {
                                            j2 = 0;
                                        }
                                        long jMax = Math.max(z5 ? e8.e : 0L, z6 ? e8.f : 0L) + j2;
                                        View view6 = ((AbstractC0361lm) arrayList7.get(0)).a;
                                        WeakHashMap weakHashMap4 = Gs.a;
                                        view6.postOnAnimationDelayed(runnableC0749y10, jMax);
                                    } else {
                                        runnableC0749y10.run();
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                recyclerView.i0 = z;
                return;
            case 13:
                Em em = (Em) this.b;
                em.c.g(em);
                return;
            case 14:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f = false;
                    return;
                }
                return;
            case 15:
                String strO = F4.O();
                SpedometerPanel spedometerPanel = (SpedometerPanel) this.b;
                spedometerPanel.Y = strO;
                spedometerPanel.r();
                spedometerPanel.G();
                return;
            case 16:
                ((StaggeredGridLayoutManager) this.b).C0();
                return;
            case 17:
                break;
            case 18:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 19:
                ((Toolbar) this.b).v();
                return;
            case 20:
                Yq yq = (Yq) this.b;
                Window.Callback callback = yq.k;
                Menu menuB0 = yq.B0();
                MenuC0604ti menuC0604ti = menuB0 instanceof MenuC0604ti ? (MenuC0604ti) menuB0 : null;
                if (menuC0604ti != null) {
                    menuC0604ti.w();
                }
                try {
                    menuB0.clear();
                    if (!callback.onCreatePanelMenu(0, menuB0) || !callback.onPreparePanel(0, null, menuB0)) {
                        menuB0.clear();
                    }
                    if (menuC0604ti != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (menuC0604ti != null) {
                        menuC0604ti.v();
                    }
                }
                break;
            default:
                ((Ks) this.b).n(0);
                return;
        }
        while (true) {
            synchronized (((C0334kq) this.b)) {
                abstractC0273iqC = ((C0334kq) this.b).c();
            }
            if (abstractC0273iqC == null) {
                return;
            }
            C0303jq c0303jq = abstractC0273iqC.a;
            Tf.f(c0303jq);
            boolean zIsLoggable = C0334kq.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                c0303jq.e.g.getClass();
                jNanoTime = System.nanoTime();
                Ud.a(abstractC0273iqC, c0303jq, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C0334kq.a((C0334kq) this.b, abstractC0273iqC);
                if (zIsLoggable) {
                    c0303jq.e.g.getClass();
                    Ud.a(abstractC0273iqC, c0303jq, "finished run in ".concat(Ud.q(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    Vi vi = ((C0334kq) this.b).g;
                    vi.getClass();
                    ((ThreadPoolExecutor) vi.a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        c0303jq.e.g.getClass();
                        Ud.a(abstractC0273iqC, c0303jq, "failed a run in ".concat(Ud.q(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
