package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0459or implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public AbstractC0366lr a;
    public ViewGroup b;

    /* JADX WARN: Code duplicated, block: B:101:0x020c  */
    /* JADX WARN: Code duplicated, block: B:103:0x021a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0236  */
    /* JADX WARN: Code duplicated, block: B:131:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e6 A[EDGE_INSN: B:136:0x01e6->B:91:0x01e6 BREAK  A[LOOP:1: B:19:0x0088->B:90:0x01dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:15:0x0053->B:17:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC0366lr abstractC0366lr;
        int i;
        C0296jj c0296jj;
        C0296jj c0296jj2;
        C0066c3 c0066c3;
        C0066c3 c0066c4;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        C0066c3 c0066c3P;
        int i5;
        Animator animator;
        C0304jr c0304jr;
        View view;
        C0582sr c0582sr;
        C0582sr c0582sr2;
        int i6;
        int i7;
        View view2;
        C0582sr c0582sr3;
        C0066c3 c0066c5;
        int i8;
        int i9;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i10;
        View view5;
        View view6;
        C0511qh c0511qh;
        int iF;
        int i11;
        View view7;
        Iterator it;
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0490pr.c;
        ViewGroup viewGroup2 = this.b;
        int i12 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C0066c3 c0066c3B = AbstractC0490pr.b();
        Long l = null;
        ArrayList arrayList3 = (ArrayList) c0066c3B.getOrDefault(viewGroup2, null);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            abstractC0366lr = this.a;
            arrayList3.add(abstractC0366lr);
            abstractC0366lr.a(new C0428nr(this, c0066c3B));
            i = 0;
            abstractC0366lr.h(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0366lr) it.next()).y(viewGroup2);
                }
            }
            abstractC0366lr.k = new ArrayList();
            abstractC0366lr.l = new ArrayList();
            c0296jj = abstractC0366lr.g;
            c0296jj2 = abstractC0366lr.h;
            c0066c3 = new C0066c3((C0066c3) c0296jj.a);
            c0066c4 = new C0066c3((C0066c3) c0296jj2.a);
            i2 = 0;
            while (true) {
                iArr = abstractC0366lr.j;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != i12) {
                    for (i7 = c0066c3.c - 1; i7 >= 0; i7--) {
                        view2 = (View) c0066c3.h(i7);
                        if (view2 == null && abstractC0366lr.t(view2) && (c0582sr3 = (C0582sr) c0066c4.remove(view2)) != null && abstractC0366lr.t(c0582sr3.b)) {
                            abstractC0366lr.k.add((C0582sr) c0066c3.j(i7));
                            abstractC0366lr.l.add(c0582sr3);
                        }
                    }
                } else if (i6 != 2) {
                    c0066c5 = (C0066c3) c0296jj.d;
                    C0066c3 c0066c6 = (C0066c3) c0296jj2.d;
                    i8 = c0066c5.c;
                    for (i9 = 0; i9 < i8; i9++) {
                        view3 = (View) c0066c5.l(i9);
                        if (view3 == null && abstractC0366lr.t(view3) && (view4 = (View) c0066c6.getOrDefault(c0066c5.h(i9), null)) != null && abstractC0366lr.t(view4)) {
                            C0582sr c0582sr4 = (C0582sr) c0066c3.getOrDefault(view3, null);
                            C0582sr c0582sr5 = (C0582sr) c0066c4.getOrDefault(view4, null);
                            if (c0582sr4 != null && c0582sr5 != null) {
                                abstractC0366lr.k.add(c0582sr4);
                                abstractC0366lr.l.add(c0582sr5);
                                c0066c3.remove(view3);
                                c0066c4.remove(view4);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    sparseArray = (SparseArray) c0296jj.b;
                    SparseArray sparseArray2 = (SparseArray) c0296jj2.b;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view5 = (View) sparseArray.valueAt(i10);
                        if (view5 == null && abstractC0366lr.t(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC0366lr.t(view6)) {
                            C0582sr c0582sr6 = (C0582sr) c0066c3.getOrDefault(view5, null);
                            C0582sr c0582sr7 = (C0582sr) c0066c4.getOrDefault(view6, null);
                            if (c0582sr6 != null && c0582sr7 != null) {
                                abstractC0366lr.k.add(c0582sr6);
                                abstractC0366lr.l.add(c0582sr7);
                                c0066c3.remove(view5);
                                c0066c4.remove(view6);
                            }
                        }
                    }
                } else if (i6 != 4) {
                    c0511qh = (C0511qh) c0296jj.c;
                    iF = c0511qh.f();
                    i11 = i;
                    while (i11 < iF) {
                        view7 = (View) c0511qh.g(i11);
                        if (view7 == null && abstractC0366lr.t(view7)) {
                            if (c0511qh.a) {
                                c0511qh.c();
                            }
                            View view8 = (View) ((C0511qh) c0296jj2.c).d(c0511qh.b[i11], l);
                            abstractC0366lr = abstractC0366lr;
                            if (view8 != null && abstractC0366lr.t(view8)) {
                                C0582sr c0582sr8 = (C0582sr) c0066c3.getOrDefault(view7, l);
                                C0582sr c0582sr9 = (C0582sr) c0066c4.getOrDefault(view8, l);
                                if (c0582sr8 != null && c0582sr9 != null) {
                                    abstractC0366lr.k.add(c0582sr8);
                                    abstractC0366lr.l.add(c0582sr9);
                                    c0066c3.remove(view7);
                                    c0066c4.remove(view8);
                                }
                            }
                        }
                        i11++;
                        l = null;
                    }
                }
                i2++;
                i = 0;
                l = null;
                i12 = 1;
            }
            for (i3 = 0; i3 < c0066c3.c; i3++) {
                c0582sr2 = (C0582sr) c0066c3.l(i3);
                if (abstractC0366lr.t(c0582sr2.b)) {
                    abstractC0366lr.k.add(c0582sr2);
                    abstractC0366lr.l.add(null);
                }
            }
            for (i4 = 0; i4 < c0066c4.c; i4++) {
                c0582sr = (C0582sr) c0066c4.l(i4);
                if (abstractC0366lr.t(c0582sr.b)) {
                    abstractC0366lr.l.add(c0582sr);
                    abstractC0366lr.k.add(null);
                }
            }
            c0066c3P = AbstractC0366lr.p();
            int i13 = c0066c3P.c;
            WindowId windowId = viewGroup2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                animator = (Animator) c0066c3P.h(i5);
                if (animator == null && (c0304jr = (C0304jr) c0066c3P.getOrDefault(animator, null)) != null && (view = c0304jr.a) != null && windowId.equals(c0304jr.d)) {
                    C0582sr c0582srR = abstractC0366lr.r(view, true);
                    C0582sr c0582srN = abstractC0366lr.n(view, true);
                    if (c0582srR == null && c0582srN == null) {
                        c0582srN = (C0582sr) ((C0066c3) abstractC0366lr.h.a).getOrDefault(view, null);
                    }
                    if (c0582srR != null || c0582srN != null) {
                        C0582sr c0582sr10 = c0304jr.c;
                        AbstractC0366lr abstractC0366lr2 = c0304jr.e;
                        if (abstractC0366lr2.s(c0582sr10, c0582srN)) {
                            abstractC0366lr2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c0066c3P.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0366lr.l(viewGroup2, abstractC0366lr.g, abstractC0366lr.h, abstractC0366lr.k, abstractC0366lr.l);
            abstractC0366lr.z();
            return true;
        }
        arrayList3 = new ArrayList();
        c0066c3B.put(viewGroup2, arrayList3);
        abstractC0366lr = this.a;
        arrayList3.add(abstractC0366lr);
        abstractC0366lr.a(new C0428nr(this, c0066c3B));
        i = 0;
        abstractC0366lr.h(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0366lr) it.next()).y(viewGroup2);
            }
        }
        abstractC0366lr.k = new ArrayList();
        abstractC0366lr.l = new ArrayList();
        c0296jj = abstractC0366lr.g;
        c0296jj2 = abstractC0366lr.h;
        c0066c3 = new C0066c3((C0066c3) c0296jj.a);
        c0066c4 = new C0066c3((C0066c3) c0296jj2.a);
        i2 = 0;
        while (true) {
            iArr = abstractC0366lr.j;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != i12) {
                while (i7 >= 0) {
                    view2 = (View) c0066c3.h(i7);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 2) {
                c0066c5 = (C0066c3) c0296jj.d;
                C0066c3 c0066c7 = (C0066c3) c0296jj2.d;
                i8 = c0066c5.c;
                while (i9 < i8) {
                    view3 = (View) c0066c5.l(i9);
                    if (view3 == null) {
                    }
                }
            } else if (i6 != 3) {
                sparseArray = (SparseArray) c0296jj.b;
                SparseArray sparseArray3 = (SparseArray) c0296jj2.b;
                size = sparseArray.size();
                while (i10 < size) {
                    view5 = (View) sparseArray.valueAt(i10);
                    if (view5 == null) {
                    }
                }
            } else if (i6 != 4) {
                c0511qh = (C0511qh) c0296jj.c;
                iF = c0511qh.f();
                i11 = i;
                while (i11 < iF) {
                    view7 = (View) c0511qh.g(i11);
                    if (view7 == null) {
                    }
                    i11++;
                    l = null;
                }
            }
            i2++;
            i = 0;
            l = null;
            i12 = 1;
        }
        while (i3 < c0066c3.c) {
            c0582sr2 = (C0582sr) c0066c3.l(i3);
            if (abstractC0366lr.t(c0582sr2.b)) {
                abstractC0366lr.k.add(c0582sr2);
                abstractC0366lr.l.add(null);
            }
        }
        while (i4 < c0066c4.c) {
            c0582sr = (C0582sr) c0066c4.l(i4);
            if (abstractC0366lr.t(c0582sr.b)) {
                abstractC0366lr.l.add(c0582sr);
                abstractC0366lr.k.add(null);
            }
        }
        c0066c3P = AbstractC0366lr.p();
        int i14 = c0066c3P.c;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i5 >= 0) {
            animator = (Animator) c0066c3P.h(i5);
            if (animator == null) {
            }
        }
        abstractC0366lr.l(viewGroup2, abstractC0366lr.g, abstractC0366lr.h, abstractC0366lr.k, abstractC0366lr.l);
        abstractC0366lr.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0490pr.c;
        ViewGroup viewGroup2 = this.b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) AbstractC0490pr.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0366lr) it.next()).y(viewGroup2);
            }
        }
        this.a.i(true);
    }
}
