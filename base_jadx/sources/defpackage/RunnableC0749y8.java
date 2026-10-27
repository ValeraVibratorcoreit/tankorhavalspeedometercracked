package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0749y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ E8 c;

    public /* synthetic */ RunnableC0749y8(E8 e8, ArrayList arrayList, int i) {
        this.a = i;
        this.c = e8;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    E8 e8 = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        e8.m.remove(arrayList);
                    } else {
                        D8 d8 = (D8) it.next();
                        AbstractC0361lm abstractC0361lm = d8.a;
                        e8.getClass();
                        View view = abstractC0361lm.a;
                        int i = d8.d - d8.b;
                        int i2 = d8.e - d8.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        e8.p.add(abstractC0361lm);
                        viewPropertyAnimatorAnimate.setDuration(e8.e).setListener(new A8(e8, abstractC0361lm, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    E8 e9 = this.c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        e9.n.remove(arrayList2);
                    } else {
                        C8 c8 = (C8) it2.next();
                        e9.getClass();
                        AbstractC0361lm abstractC0361lm2 = c8.a;
                        View view2 = abstractC0361lm2 == null ? null : abstractC0361lm2.a;
                        AbstractC0361lm abstractC0361lm3 = c8.b;
                        View view3 = abstractC0361lm3 != null ? abstractC0361lm3.a : null;
                        ArrayList arrayList3 = e9.r;
                        long j = e9.f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c8.a);
                            duration.translationX(c8.e - c8.c);
                            duration.translationY(c8.f - c8.d);
                            duration.alpha(0.0f).setListener(new B8(e9, c8, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c8.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new B8(e9, c8, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it2 = it2;
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = this.b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    E8 e10 = this.c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        e10.l.remove(arrayList4);
                    } else {
                        AbstractC0361lm abstractC0361lm4 = (AbstractC0361lm) it3.next();
                        e10.getClass();
                        View view4 = abstractC0361lm4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        e10.o.add(abstractC0361lm4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(e10.c).setListener(new C0780z8(e10, abstractC0361lm4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
