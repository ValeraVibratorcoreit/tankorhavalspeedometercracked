package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0085cm {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public C0054bm g;
    public final /* synthetic */ RecyclerView h;

    public C0085cm(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(AbstractC0361lm abstractC0361lm, boolean z) {
        RecyclerView.j(abstractC0361lm);
        RecyclerView recyclerView = this.h;
        C0423nm c0423nm = recyclerView.j0;
        if (c0423nm != null) {
            C0392mm c0392mm = c0423nm.e;
            boolean z2 = c0392mm instanceof C0392mm;
            View view = abstractC0361lm.a;
            Gs.j(view, z2 ? (C0740y) c0392mm.e.remove(view) : null);
        }
        if (z && recyclerView.c0 != null) {
            recyclerView.f.o(abstractC0361lm);
        }
        abstractC0361lm.r = null;
        C0054bm c0054bmC = c();
        c0054bmC.getClass();
        int i = abstractC0361lm.f;
        ArrayList arrayList = c0054bmC.a(i).a;
        if (((C0023am) c0054bmC.a.get(i)).b <= arrayList.size()) {
            return;
        }
        abstractC0361lm.n();
        arrayList.add(abstractC0361lm);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.c0.b()) {
            return !recyclerView.c0.g ? i : recyclerView.d.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.c0.b() + recyclerView.y());
    }

    public final C0054bm c() {
        if (this.g == null) {
            C0054bm c0054bm = new C0054bm();
            c0054bm.a = new SparseArray();
            c0054bm.b = 0;
            this.g = c0054bm;
        }
        return this.g;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.s0;
        Bd bd = this.h.b0;
        int[] iArr2 = (int[]) bd.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        bd.c = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.c;
        a((AbstractC0361lm) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
        boolean zK = abstractC0361lmI.k();
        RecyclerView recyclerView = this.h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0361lmI.j()) {
            abstractC0361lmI.n.j(abstractC0361lmI);
        } else if (abstractC0361lmI.q()) {
            abstractC0361lmI.j &= -33;
        }
        g(abstractC0361lmI);
        if (recyclerView.H == null || abstractC0361lmI.h()) {
            return;
        }
        recyclerView.H.e(abstractC0361lmI);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[LOOP:2: B:42:0x008f->B:46:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x009f A[EDGE_INSN: B:73:0x009f->B:47:0x009f BREAK  A[LOOP:1: B:38:0x0078->B:45:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x009f A[EDGE_INSN: B:74:0x009f->B:47:0x009f BREAK  A[LOOP:1: B:38:0x0078->B:45:0x0099, LOOP_LABEL: LOOP:1: B:38:0x0078->B:45:0x0099], SYNTHETIC] */
    public final void g(AbstractC0361lm abstractC0361lm) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        Bd bd;
        int i3;
        int i4;
        boolean zJ = abstractC0361lm.j();
        boolean z3 = false;
        boolean z4 = true;
        RecyclerView recyclerView = this.h;
        View view = abstractC0361lm.a;
        if (zJ || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC0361lm.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC0361lm.k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0361lm + recyclerView.y());
        }
        if (abstractC0361lm.p()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((abstractC0361lm.j & 16) == 0) {
            WeakHashMap weakHashMap = Gs.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Ol ol = recyclerView.k;
        if (abstractC0361lm.h()) {
            if (this.f <= 0 || abstractC0361lm.d(526)) {
                z2 = false;
            } else {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                if (size >= this.f && size > 0) {
                    e(0);
                    size--;
                }
                int[] iArr = RecyclerView.s0;
                if (size > 0) {
                    Bd bd2 = recyclerView.b0;
                    int i5 = abstractC0361lm.c;
                    if (((int[]) bd2.d) != null) {
                        int i6 = bd2.c * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((AbstractC0361lm) arrayList.get(i)).c;
                                    bd = recyclerView.b0;
                                    if (((int[]) bd.d) != null) {
                                        break;
                                    }
                                    i3 = bd.c * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) bd.d)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) bd2.d)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((AbstractC0361lm) arrayList.get(i)).c;
                            bd = recyclerView.b0;
                            if (((int[]) bd.d) != null) {
                                break;
                                break;
                            }
                            i3 = bd.c * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) bd.d)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC0361lm);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(abstractC0361lm, true);
            }
            z3 = z2;
        } else {
            z4 = false;
        }
        recyclerView.f.o(abstractC0361lm);
        if (z3 || z4 || !z) {
            return;
        }
        abstractC0361lm.r = null;
    }

    public final void h(View view) {
        Sl sl;
        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
        boolean zD = abstractC0361lmI.d(12);
        RecyclerView recyclerView = this.h;
        if (!zD && abstractC0361lmI.l() && (sl = recyclerView.H) != null) {
            E8 e8 = (E8) sl;
            if (abstractC0361lmI.c().isEmpty() && e8.g && !abstractC0361lmI.g()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                abstractC0361lmI.n = this;
                abstractC0361lmI.o = true;
                this.b.add(abstractC0361lmI);
                return;
            }
        }
        if (abstractC0361lmI.g() && !abstractC0361lmI.i() && !recyclerView.k.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        abstractC0361lmI.n = this;
        abstractC0361lmI.o = false;
        this.a.add(abstractC0361lmI);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:177:0x031c A[EDGE_INSN: B:177:0x031c->B:178:0x031d BREAK  A[LOOP:6: B:172:0x0303->B:176:0x0319]] */
    /* JADX WARN: Code duplicated, block: B:239:0x0428  */
    /* JADX WARN: Code duplicated, block: B:241:0x043a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0456  */
    /* JADX WARN: Code duplicated, block: B:250:0x0475  */
    /* JADX WARN: Code duplicated, block: B:253:0x0486  */
    /* JADX WARN: Code duplicated, block: B:257:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:265:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:267:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:268:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:272:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:274:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:276:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:277:0x04de  */
    /* JADX WARN: Code duplicated, block: B:279:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:280:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:285:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:292:0x0508  */
    /* JADX WARN: Code duplicated, block: B:293:0x0512  */
    /* JADX WARN: Code duplicated, block: B:295:0x0518  */
    /* JADX WARN: Code duplicated, block: B:296:0x0522  */
    /* JADX WARN: Code duplicated, block: B:301:0x052d  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[EDGE_INSN: B:35:0x007d->B:36:0x007e BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    public final AbstractC0361lm i(long j, int i) {
        boolean z;
        AbstractC0361lm abstractC0361lmD;
        int iG;
        int i2;
        Ol ol;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long nanoTime;
        long j2;
        AccessibilityManager accessibilityManager;
        boolean z2;
        boolean z3;
        boolean z4;
        C0423nm c0423nm;
        C0392mm c0392mm;
        View.AccessibilityDelegate accessibilityDelegateB;
        C0740y c0740y;
        long j3;
        ViewGroup.LayoutParams layoutParams2;
        Xl xl;
        boolean z5;
        View view;
        int iB;
        Ol ol2;
        boolean z6;
        int size;
        int iG2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.c0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.c0.b() + recyclerView.y());
        }
        C0269im c0269im = recyclerView.c0;
        if (c0269im.g) {
            ArrayList arrayList2 = this.b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        if (recyclerView.k.b && (iG2 = recyclerView.d.g(i, 0)) > 0 && iG2 < recyclerView.k.a()) {
                            long jB = recyclerView.k.b(iG2);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    abstractC0361lmD = null;
                                    break;
                                }
                                AbstractC0361lm abstractC0361lm = (AbstractC0361lm) this.b.get(i4);
                                if (!abstractC0361lm.q() && abstractC0361lm.e == jB) {
                                    abstractC0361lm.a(32);
                                    abstractC0361lmD = abstractC0361lm;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            abstractC0361lmD = null;
                            break;
                        }
                    } else {
                        abstractC0361lmD = (AbstractC0361lm) this.b.get(i3);
                        if (!abstractC0361lmD.q() && abstractC0361lmD.b() == i) {
                            abstractC0361lmD.a(32);
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                abstractC0361lmD = null;
                break;
            }
            z = abstractC0361lmD != null;
        } else {
            z = false;
            abstractC0361lmD = null;
        }
        ArrayList arrayList3 = this.c;
        ArrayList arrayList4 = this.a;
        if (abstractC0361lmD == null) {
            int size2 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    K2 k2 = recyclerView.e;
                    ArrayList arrayList5 = (ArrayList) k2.d;
                    int size3 = arrayList5.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            view = null;
                            break;
                        }
                        View view2 = (View) arrayList5.get(i6);
                        ((Nl) k2.b).getClass();
                        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view2);
                        if (abstractC0361lmI.b() == i && !abstractC0361lmI.g() && !abstractC0361lmI.i()) {
                            view = view2;
                            break;
                        }
                        i6++;
                    }
                    if (view == null) {
                        int size4 = arrayList3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                abstractC0361lmD = null;
                                break;
                            }
                            abstractC0361lmD = (AbstractC0361lm) arrayList3.get(i7);
                            if (!abstractC0361lmD.g() && abstractC0361lmD.b() == i && !abstractC0361lmD.e()) {
                                arrayList3.remove(i7);
                                break;
                            }
                            i7++;
                        }
                    } else {
                        AbstractC0361lm abstractC0361lmI2 = RecyclerView.I(view);
                        K2 k3 = recyclerView.e;
                        int iIndexOfChild = ((Nl) k3.b).a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        O5 o5 = (O5) k3.c;
                        if (!o5.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        o5.a(iIndexOfChild);
                        k3.O(view);
                        K2 k4 = recyclerView.e;
                        int iIndexOfChild2 = ((Nl) k4.b).a.indexOfChild(view);
                        if (iIndexOfChild2 == -1) {
                            iB = -1;
                        } else {
                            O5 o6 = (O5) k4.c;
                            if (o6.d(iIndexOfChild2)) {
                                iB = -1;
                            } else {
                                iB = iIndexOfChild2 - o6.b(iIndexOfChild2);
                            }
                        }
                        if (iB == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC0361lmI2 + recyclerView.y());
                        }
                        recyclerView.e.i(iB);
                        h(view);
                        abstractC0361lmI2.a(8224);
                        abstractC0361lmD = abstractC0361lmI2;
                        break;
                    }
                } else {
                    AbstractC0361lm abstractC0361lm2 = (AbstractC0361lm) arrayList4.get(i5);
                    if (!abstractC0361lm2.q() && abstractC0361lm2.b() == i && !abstractC0361lm2.g() && (c0269im.g || !abstractC0361lm2.i())) {
                        abstractC0361lm2.a(32);
                        abstractC0361lmD = abstractC0361lm2;
                        break;
                    }
                    i5++;
                }
            }
            if (abstractC0361lmD != null) {
                if (abstractC0361lmD.i()) {
                    z6 = c0269im.g;
                } else {
                    int i8 = abstractC0361lmD.c;
                    if (i8 < 0 || i8 >= recyclerView.k.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0361lmD + recyclerView.y());
                    }
                    if (c0269im.g) {
                        ol2 = recyclerView.k;
                        if (ol2.b) {
                        }
                        z6 = true;
                    } else {
                        recyclerView.k.getClass();
                        if (abstractC0361lmD.f != 0) {
                            z6 = false;
                        } else {
                            ol2 = recyclerView.k;
                            if (ol2.b || abstractC0361lmD.e == ol2.b(abstractC0361lmD.c)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                    }
                }
                if (z6) {
                    z = true;
                } else {
                    abstractC0361lmD.a(4);
                    if (abstractC0361lmD.j()) {
                        recyclerView.removeDetachedView(abstractC0361lmD.a, false);
                        abstractC0361lmD.n.j(abstractC0361lmD);
                    } else if (abstractC0361lmD.q()) {
                        abstractC0361lmD.j &= -33;
                    }
                    g(abstractC0361lmD);
                    abstractC0361lmD = null;
                }
            }
        }
        if (abstractC0361lmD == null) {
            int iG3 = recyclerView.d.g(i, 0);
            if (iG3 < 0 || iG3 >= recyclerView.k.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iG3 + ").state:" + c0269im.b() + recyclerView.y());
            }
            recyclerView.k.getClass();
            Ol ol3 = recyclerView.k;
            if (ol3.b) {
                long jB2 = ol3.b(iG3);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                AbstractC0361lm abstractC0361lm3 = (AbstractC0361lm) arrayList3.get(size6);
                                if (abstractC0361lm3.e != jB2 || abstractC0361lm3.e()) {
                                    size6--;
                                } else {
                                    if (abstractC0361lm3.f == 0) {
                                        arrayList3.remove(size6);
                                        abstractC0361lmD = abstractC0361lm3;
                                        break;
                                    }
                                    e(size6);
                                }
                            }
                            abstractC0361lmD = null;
                            break;
                        }
                    }
                    abstractC0361lmD = (AbstractC0361lm) arrayList4.get(size5);
                    if (abstractC0361lmD.e == jB2 && !abstractC0361lmD.q()) {
                        if (abstractC0361lmD.f == 0) {
                            abstractC0361lmD.a(32);
                            if (!abstractC0361lmD.i() || c0269im.g) {
                                break;
                                break;
                            }
                            abstractC0361lmD.j = (abstractC0361lmD.j & (-15)) | 2;
                            break;
                        }
                        arrayList4.remove(size5);
                        View view3 = abstractC0361lmD.a;
                        recyclerView.removeDetachedView(view3, false);
                        AbstractC0361lm abstractC0361lmI3 = RecyclerView.I(view3);
                        abstractC0361lmI3.n = null;
                        abstractC0361lmI3.o = false;
                        abstractC0361lmI3.j &= -33;
                        g(abstractC0361lmI3);
                    }
                    size5--;
                }
                if (abstractC0361lmD != null) {
                    abstractC0361lmD.c = iG3;
                    z = true;
                }
            }
            if (abstractC0361lmD == null) {
                C0023am c0023am = (C0023am) c().a.get(0);
                if (c0023am == null) {
                    abstractC0361lmD = null;
                    break;
                }
                ArrayList arrayList6 = c0023am.a;
                if (!arrayList6.isEmpty()) {
                    int size7 = arrayList6.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            abstractC0361lmD = null;
                            break;
                        }
                        if (!((AbstractC0361lm) arrayList6.get(size7)).e()) {
                            abstractC0361lmD = (AbstractC0361lm) arrayList6.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    abstractC0361lmD = null;
                    break;
                }
                if (abstractC0361lmD != null) {
                    abstractC0361lmD.n();
                    int[] iArr = RecyclerView.s0;
                }
            }
            if (abstractC0361lmD == null) {
                long nanoTime2 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j4 = this.g.a(0).c;
                    if (!(j4 == 0 || j4 + nanoTime2 < j)) {
                        return null;
                    }
                }
                Ol ol4 = recyclerView.k;
                ol4.getClass();
                try {
                    int i9 = AbstractC0090cr.a;
                    Trace.beginSection("RV CreateView");
                    abstractC0361lmD = ol4.d(recyclerView);
                    View view4 = abstractC0361lmD.a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    abstractC0361lmD.f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.s0;
                    RecyclerView recyclerViewD = RecyclerView.D(view4);
                    if (recyclerViewD != null) {
                        abstractC0361lmD.b = new WeakReference(recyclerViewD);
                    }
                    long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                    C0023am c0023amA = this.g.a(0);
                    long j5 = c0023amA.c;
                    if (j5 != 0) {
                        nanoTime3 = (nanoTime3 / 4) + ((j5 / 4) * 3);
                    }
                    c0023amA.c = nanoTime3;
                } catch (Throwable th) {
                    int i10 = AbstractC0090cr.a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        if (z && !c0269im.g && abstractC0361lmD.d(8192)) {
            abstractC0361lmD.j &= -8193;
            if (c0269im.j) {
                Sl.b(abstractC0361lmD);
                Sl sl = recyclerView.H;
                abstractC0361lmD.c();
                sl.getClass();
                Ej ej = new Ej();
                ej.a(abstractC0361lmD);
                recyclerView.W(abstractC0361lmD, ej);
            }
        }
        boolean z7 = c0269im.g;
        View view5 = abstractC0361lmD.a;
        if (!z7 || !abstractC0361lmD.f()) {
            if (abstractC0361lmD.f()) {
                if (((abstractC0361lmD.j & 2) != 0) || abstractC0361lmD.g()) {
                    iG = recyclerView.d.g(i, 0);
                    abstractC0361lmD.r = recyclerView;
                    i2 = abstractC0361lmD.f;
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.g.a(i2).d;
                        if (j3 != 0) {
                        }
                    }
                    ol = recyclerView.k;
                    ol.getClass();
                    abstractC0361lmD.c = iG;
                    if (ol.b) {
                        abstractC0361lmD.e = ol.b(iG);
                    }
                    abstractC0361lmD.j = (abstractC0361lmD.j & (-520)) | 1;
                    int i11 = AbstractC0090cr.a;
                    Trace.beginSection("RV OnBindView");
                    abstractC0361lmD.c();
                    ol.c(abstractC0361lmD, iG);
                    arrayList = abstractC0361lmD.k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    abstractC0361lmD.j &= -1025;
                    layoutParams = view5.getLayoutParams();
                    if (layoutParams instanceof Xl) {
                        ((Xl) layoutParams).c = true;
                    }
                    Trace.endSection();
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    C0023am c0023amA2 = this.g.a(abstractC0361lmD.f);
                    j2 = c0023amA2.d;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    c0023amA2.d = nanoTime;
                    accessibilityManager = recyclerView.x;
                    if (accessibilityManager == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        WeakHashMap weakHashMap = Gs.a;
                        if (view5.getImportantForAccessibility() == 0) {
                            z3 = true;
                            view5.setImportantForAccessibility(1);
                        } else {
                            z3 = true;
                        }
                        c0423nm = recyclerView.j0;
                        if (c0423nm != null) {
                            c0392mm = c0423nm.e;
                            if (c0392mm instanceof C0392mm) {
                                c0392mm.getClass();
                                accessibilityDelegateB = Gs.b(view5);
                                if (accessibilityDelegateB == null) {
                                    c0740y = null;
                                } else if (accessibilityDelegateB instanceof C0709x) {
                                    c0740y = ((C0709x) accessibilityDelegateB).a;
                                } else {
                                    c0740y = new C0740y(accessibilityDelegateB);
                                }
                                if (c0740y != null) {
                                    c0392mm.e.put(view5, c0740y);
                                }
                            }
                            Gs.j(view5, c0392mm);
                        }
                    } else {
                        z3 = true;
                    }
                    if (c0269im.g) {
                        abstractC0361lmD.g = i;
                    }
                    z4 = z3;
                }
            } else {
                iG = recyclerView.d.g(i, 0);
                abstractC0361lmD.r = recyclerView;
                i2 = abstractC0361lmD.f;
                long nanoTime5 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j3 = this.g.a(i2).d;
                    if (j3 != 0 || j3 + nanoTime5 < j) {
                    }
                }
                ol = recyclerView.k;
                ol.getClass();
                abstractC0361lmD.c = iG;
                if (ol.b) {
                    abstractC0361lmD.e = ol.b(iG);
                }
                abstractC0361lmD.j = (abstractC0361lmD.j & (-520)) | 1;
                int i12 = AbstractC0090cr.a;
                Trace.beginSection("RV OnBindView");
                abstractC0361lmD.c();
                ol.c(abstractC0361lmD, iG);
                arrayList = abstractC0361lmD.k;
                if (arrayList != null) {
                    arrayList.clear();
                }
                abstractC0361lmD.j &= -1025;
                layoutParams = view5.getLayoutParams();
                if (layoutParams instanceof Xl) {
                    ((Xl) layoutParams).c = true;
                }
                Trace.endSection();
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                C0023am c0023amA3 = this.g.a(abstractC0361lmD.f);
                j2 = c0023amA3.d;
                if (j2 != 0) {
                    nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                }
                c0023amA3.d = nanoTime;
                accessibilityManager = recyclerView.x;
                if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    WeakHashMap weakHashMap2 = Gs.a;
                    if (view5.getImportantForAccessibility() == 0) {
                        z3 = true;
                        view5.setImportantForAccessibility(1);
                    } else {
                        z3 = true;
                    }
                    c0423nm = recyclerView.j0;
                    if (c0423nm != null) {
                        c0392mm = c0423nm.e;
                        if (c0392mm instanceof C0392mm) {
                            c0392mm.getClass();
                            accessibilityDelegateB = Gs.b(view5);
                            if (accessibilityDelegateB == null) {
                                c0740y = null;
                            } else if (accessibilityDelegateB instanceof C0709x) {
                                c0740y = ((C0709x) accessibilityDelegateB).a;
                            } else {
                                c0740y = new C0740y(accessibilityDelegateB);
                            }
                            if (c0740y != null && c0740y != c0392mm) {
                                c0392mm.e.put(view5, c0740y);
                            }
                        }
                        Gs.j(view5, c0392mm);
                    }
                } else {
                    z3 = true;
                }
                if (c0269im.g) {
                    abstractC0361lmD.g = i;
                }
                z4 = z3;
            }
            layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 == null) {
                xl = (Xl) recyclerView.generateDefaultLayoutParams();
                view5.setLayoutParams(xl);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                xl = (Xl) layoutParams2;
            } else {
                xl = (Xl) recyclerView.generateLayoutParams(layoutParams2);
                view5.setLayoutParams(xl);
            }
            xl.a = abstractC0361lmD;
            if (z || !z4) {
                z5 = false;
            } else {
                z5 = z3;
            }
            xl.d = z5;
            return abstractC0361lmD;
        }
        abstractC0361lmD.g = i;
        z4 = false;
        z3 = true;
        layoutParams2 = view5.getLayoutParams();
        if (layoutParams2 == null) {
            xl = (Xl) recyclerView.generateDefaultLayoutParams();
            view5.setLayoutParams(xl);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            xl = (Xl) recyclerView.generateLayoutParams(layoutParams2);
            view5.setLayoutParams(xl);
        } else {
            xl = (Xl) layoutParams2;
        }
        xl.a = abstractC0361lmD;
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        xl.d = z5;
        return abstractC0361lmD;
    }

    public final void j(AbstractC0361lm abstractC0361lm) {
        if (abstractC0361lm.o) {
            this.b.remove(abstractC0361lm);
        } else {
            this.a.remove(abstractC0361lm);
        }
        abstractC0361lm.n = null;
        abstractC0361lm.o = false;
        abstractC0361lm.j &= -33;
    }

    public final void k() {
        Wl wl = this.h.l;
        this.f = this.e + (wl != null ? wl.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            e(size);
        }
    }
}
