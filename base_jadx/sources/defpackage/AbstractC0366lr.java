package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0366lr implements Cloneable {
    public static final Animator[] w = new Animator[0];
    public static final int[] x = {2, 1, 3, 4};
    public static final C0387mh y = new C0387mh(23);
    public static final ThreadLocal z = new ThreadLocal();
    public ArrayList k;
    public ArrayList l;
    public InterfaceC0335kr[] m;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public C0296jj g = new C0296jj(8);
    public C0296jj h = new C0296jj(8);
    public C0466p3 i = null;
    public final int[] j = x;
    public final ArrayList n = new ArrayList();
    public Animator[] o = w;
    public int p = 0;
    public boolean q = false;
    public boolean r = false;
    public AbstractC0366lr s = null;
    public ArrayList t = null;
    public ArrayList u = new ArrayList();
    public C0387mh v = y;

    public static void b(C0296jj c0296jj, View view, C0582sr c0582sr) {
        ((C0066c3) c0296jj.a).put(view, c0582sr);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0296jj.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = Gs.a;
        String strK = AbstractC0676vs.k(view);
        if (strK != null) {
            C0066c3 c0066c3 = (C0066c3) c0296jj.d;
            if (c0066c3.containsKey(strK)) {
                c0066c3.put(strK, null);
            } else {
                c0066c3.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0511qh c0511qh = (C0511qh) c0296jj.c;
                if (c0511qh.a) {
                    c0511qh.c();
                }
                if (F4.g(c0511qh.b, c0511qh.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0511qh.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0511qh.d(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0511qh.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C0066c3 p() {
        ThreadLocal threadLocal = z;
        C0066c3 c0066c3 = (C0066c3) threadLocal.get();
        if (c0066c3 != null) {
            return c0066c3;
        }
        C0066c3 c0066c4 = new C0066c3();
        threadLocal.set(c0066c4);
        return c0066c4;
    }

    public static boolean u(C0582sr c0582sr, C0582sr c0582sr2, String str) {
        Object obj = c0582sr.a.get(str);
        Object obj2 = c0582sr2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.c = j;
    }

    public void B(AbstractC0390mk abstractC0390mk) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(C0387mh c0387mh) {
        if (c0387mh == null) {
            this.v = y;
        } else {
            this.v = c0387mh;
        }
    }

    public void E() {
    }

    public void F(long j) {
        this.b = j;
    }

    public final void G() {
        if (this.p == 0) {
            v(this, C0164f9.b);
            this.r = false;
        }
        this.p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(InterfaceC0335kr interfaceC0335kr) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(interfaceC0335kr);
    }

    public void c() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.o = animatorArr;
        v(this, C0164f9.d);
    }

    public abstract void d(C0582sr c0582sr);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0582sr c0582sr = new C0582sr(view);
            if (z2) {
                g(c0582sr);
            } else {
                d(c0582sr);
            }
            c0582sr.c.add(this);
            f(c0582sr);
            if (z2) {
                b(this.g, view, c0582sr);
            } else {
                b(this.h, view, c0582sr);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(C0582sr c0582sr) {
    }

    public abstract void g(C0582sr c0582sr);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C0582sr c0582sr = new C0582sr(viewFindViewById);
                if (z2) {
                    g(c0582sr);
                } else {
                    d(c0582sr);
                }
                c0582sr.c.add(this);
                f(c0582sr);
                if (z2) {
                    b(this.g, viewFindViewById, c0582sr);
                } else {
                    b(this.h, viewFindViewById, c0582sr);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C0582sr c0582sr2 = new C0582sr(view);
            if (z2) {
                g(c0582sr2);
            } else {
                d(c0582sr2);
            }
            c0582sr2.c.add(this);
            f(c0582sr2);
            if (z2) {
                b(this.g, view, c0582sr2);
            } else {
                b(this.h, view, c0582sr2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((C0066c3) this.g.a).clear();
            ((SparseArray) this.g.b).clear();
            ((C0511qh) this.g.c).a();
        } else {
            ((C0066c3) this.h.a).clear();
            ((SparseArray) this.h.b).clear();
            ((C0511qh) this.h.c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public AbstractC0366lr clone() {
        try {
            AbstractC0366lr abstractC0366lr = (AbstractC0366lr) super.clone();
            abstractC0366lr.u = new ArrayList();
            abstractC0366lr.g = new C0296jj(8);
            abstractC0366lr.h = new C0296jj(8);
            abstractC0366lr.k = null;
            abstractC0366lr.l = null;
            abstractC0366lr.s = this;
            abstractC0366lr.t = null;
            return abstractC0366lr;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, C0582sr c0582sr, C0582sr c0582sr2) {
        return null;
    }

    public void l(ViewGroup viewGroup, C0296jj c0296jj, C0296jj c0296jj2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C0582sr c0582sr;
        Animator animator;
        C0582sr c0582sr2;
        C0066c3 c0066c3P = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            C0582sr c0582sr3 = (C0582sr) arrayList.get(i2);
            C0582sr c0582sr4 = (C0582sr) arrayList2.get(i2);
            if (c0582sr3 != null && !c0582sr3.c.contains(this)) {
                c0582sr3 = null;
            }
            if (c0582sr4 != null && !c0582sr4.c.contains(this)) {
                c0582sr4 = null;
            }
            if ((c0582sr3 != null || c0582sr4 != null) && (c0582sr3 == null || c0582sr4 == null || s(c0582sr3, c0582sr4))) {
                Animator animatorK = k(viewGroup, c0582sr3, c0582sr4);
                if (animatorK != null) {
                    String str = this.a;
                    if (c0582sr4 != null) {
                        String[] strArrQ = q();
                        view = c0582sr4.b;
                        if (strArrQ != null && strArrQ.length > 0) {
                            c0582sr2 = new C0582sr(view);
                            C0582sr c0582sr5 = (C0582sr) ((C0066c3) c0296jj2.a).getOrDefault(view, null);
                            i = size;
                            if (c0582sr5 != null) {
                                int i3 = 0;
                                while (i3 < strArrQ.length) {
                                    HashMap map = c0582sr2.a;
                                    String str2 = strArrQ[i3];
                                    map.put(str2, c0582sr5.a.get(str2));
                                    i3++;
                                    strArrQ = strArrQ;
                                }
                            }
                            int i4 = c0066c3P.c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = animatorK;
                                    break;
                                }
                                C0304jr c0304jr = (C0304jr) c0066c3P.getOrDefault((Animator) c0066c3P.h(i5), null);
                                if (c0304jr.c != null && c0304jr.a == view && c0304jr.b.equals(str) && c0304jr.c.equals(c0582sr2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = animatorK;
                            c0582sr2 = null;
                        }
                        animatorK = animator;
                        c0582sr = c0582sr2;
                    } else {
                        i = size;
                        view = c0582sr3.b;
                        c0582sr = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0304jr c0304jr2 = new C0304jr();
                        c0304jr2.a = view;
                        c0304jr2.b = str;
                        c0304jr2.c = c0582sr;
                        c0304jr2.d = windowId;
                        c0304jr2.e = this;
                        c0304jr2.f = animatorK;
                        c0066c3P.put(animatorK, c0304jr2);
                        this.u.add(animatorK);
                    }
                }
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C0304jr c0304jr3 = (C0304jr) c0066c3P.getOrDefault((Animator) this.u.get(sparseIntArray.keyAt(i6)), null);
                c0304jr3.f.setStartDelay(c0304jr3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            v(this, C0164f9.c);
            for (int i2 = 0; i2 < ((C0511qh) this.g.c).f(); i2++) {
                View view = (View) ((C0511qh) this.g.c).g(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0511qh) this.h.c).f(); i3++) {
                View view2 = (View) ((C0511qh) this.h.c).g(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r = true;
        }
    }

    public final C0582sr n(View view, boolean z2) {
        C0466p3 c0466p3 = this.i;
        if (c0466p3 != null) {
            return c0466p3.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0582sr c0582sr = (C0582sr) arrayList.get(i);
            if (c0582sr == null) {
                return null;
            }
            if (c0582sr.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C0582sr) (z2 ? this.l : this.k).get(i);
        }
        return null;
    }

    public final AbstractC0366lr o() {
        C0466p3 c0466p3 = this.i;
        return c0466p3 != null ? c0466p3.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final C0582sr r(View view, boolean z2) {
        C0466p3 c0466p3 = this.i;
        if (c0466p3 != null) {
            return c0466p3.r(view, z2);
        }
        return (C0582sr) ((C0066c3) (z2 ? this.g : this.h).a).getOrDefault(view, null);
    }

    public boolean s(C0582sr c0582sr, C0582sr c0582sr2) {
        if (c0582sr == null || c0582sr2 == null) {
            return false;
        }
        String[] strArrQ = q();
        if (strArrQ == null) {
            Iterator it = c0582sr.a.keySet().iterator();
            while (it.hasNext()) {
                if (u(c0582sr, c0582sr2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrQ) {
            if (!u(c0582sr, c0582sr2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(AbstractC0366lr abstractC0366lr, C0164f9 c0164f9) {
        AbstractC0366lr abstractC0366lr2 = this.s;
        if (abstractC0366lr2 != null) {
            abstractC0366lr2.v(abstractC0366lr, c0164f9);
        }
        ArrayList arrayList = this.t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.t.size();
        InterfaceC0335kr[] interfaceC0335krArr = this.m;
        if (interfaceC0335krArr == null) {
            interfaceC0335krArr = new InterfaceC0335kr[size];
        }
        this.m = null;
        InterfaceC0335kr[] interfaceC0335krArr2 = (InterfaceC0335kr[]) this.t.toArray(interfaceC0335krArr);
        for (int i = 0; i < size; i++) {
            c0164f9.b(interfaceC0335krArr2[i], abstractC0366lr);
            interfaceC0335krArr2[i] = null;
        }
        this.m = interfaceC0335krArr2;
    }

    public void w(View view) {
        if (this.r) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
        this.o = w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.o = animatorArr;
        v(this, C0164f9.e);
        this.q = true;
    }

    public AbstractC0366lr x(InterfaceC0335kr interfaceC0335kr) {
        AbstractC0366lr abstractC0366lr;
        ArrayList arrayList = this.t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0335kr) && (abstractC0366lr = this.s) != null) {
            abstractC0366lr.x(interfaceC0335kr);
        }
        if (this.t.size() == 0) {
            this.t = null;
        }
        return this;
    }

    public void y(View view) {
        if (this.q) {
            if (!this.r) {
                ArrayList arrayList = this.n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.o);
                this.o = w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.o = animatorArr;
                v(this, C0164f9.f);
            }
            this.q = false;
        }
    }

    public void z() {
        G();
        C0066c3 c0066c3P = p();
        for (Animator animator : this.u) {
            if (c0066c3P.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new C0274ir(this, c0066c3P));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Y(this, 5));
                    animator.start();
                }
            }
        }
        this.u.clear();
        m();
    }
}
