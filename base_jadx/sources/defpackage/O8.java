package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class O8 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public O8(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static O8 f(ViewGroup viewGroup, C0225h8 c0225h8) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof O8) {
            return (O8) tag;
        }
        c0225h8.getClass();
        O8 o8 = new O8(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, o8);
        return o8;
    }

    public final void a(int i, int i2, Vc vc) {
        synchronized (this.b) {
            try {
                C0529r5 c0529r5 = new C0529r5();
                C0118dp c0118dpD = d(vc.c);
                if (c0118dpD != null) {
                    c0118dpD.c(i, i2);
                    return;
                }
                C0118dp c0118dp = new C0118dp(i, i2, vc, c0529r5);
                this.b.add(c0118dp);
                c0118dp.d.add(new RunnableC0088cp(this, c0118dp, 0));
                c0118dp.d.add(new RunnableC0088cp(this, c0118dp, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Iterator it;
        String str;
        Iterator it2 = arrayList.iterator();
        C0118dp c0118dp = null;
        C0118dp c0118dp2 = null;
        while (it2.hasNext()) {
            C0118dp c0118dp3 = (C0118dp) it2.next();
            int iC = Vo.c(c0118dp3.c.E);
            int iO = Vo.o(c0118dp3.a);
            if (iO != 0) {
                if (iO != 1) {
                    if (iO == 2 || iO == 3) {
                    }
                } else if (iC != 2) {
                    c0118dp2 = c0118dp3;
                }
            }
            if (iC == 2 && c0118dp == null) {
                c0118dp = c0118dp3;
            }
        }
        String str2 = " to ";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + c0118dp + " to " + c0118dp2);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<N8> arrayList3 = new ArrayList();
        ArrayList<C0118dp> arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((C0118dp) arrayList.get(arrayList.size() - 1)).c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0722xc c0722xc = ((C0118dp) it3.next()).c.H;
            C0722xc c0722xc2 = abstractComponentCallbacksC0784zc.H;
            c0722xc.b = c0722xc2.b;
            c0722xc.c = c0722xc2.c;
            c0722xc.d = c0722xc2.d;
            c0722xc.e = c0722xc2.e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it4.hasNext()) {
                break;
            }
            C0118dp c0118dp4 = (C0118dp) it4.next();
            C0529r5 c0529r5 = new C0529r5();
            c0118dp4.d();
            HashSet hashSet = c0118dp4.e;
            hashSet.add(c0529r5);
            M8 m8 = new M8(c0118dp4, c0529r5);
            m8.d = false;
            m8.c = z;
            arrayList2.add(m8);
            C0529r5 c0529r6 = new C0529r5();
            c0118dp4.d();
            hashSet.add(c0529r6);
            if (!z ? c0118dp4 == c0118dp2 : c0118dp4 == c0118dp) {
                z2 = true;
            }
            N8 n8 = new N8(c0118dp4, c0529r6);
            int i = c0118dp4.a;
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = c0118dp4.c;
            if (i == 2) {
                if (z) {
                    C0722xc c0722xc3 = abstractComponentCallbacksC0784zc2.H;
                } else {
                    abstractComponentCallbacksC0784zc2.getClass();
                }
                if (z) {
                    C0722xc c0722xc4 = abstractComponentCallbacksC0784zc2.H;
                } else {
                    C0722xc c0722xc5 = abstractComponentCallbacksC0784zc2.H;
                }
            } else if (z) {
                C0722xc c0722xc6 = abstractComponentCallbacksC0784zc2.H;
            } else {
                abstractComponentCallbacksC0784zc2.getClass();
            }
            if (z2) {
                if (z) {
                    C0722xc c0722xc7 = abstractComponentCallbacksC0784zc2.H;
                } else {
                    abstractComponentCallbacksC0784zc2.getClass();
                }
            }
            arrayList3.add(n8);
            c0118dp4.d.add(new J8(this, arrayList4, c0118dp4));
        }
        HashMap map = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            C0118dp c0118dp5 = (C0118dp) ((N8) it5.next()).a;
            if (Vo.c(c0118dp5.c.E) != c0118dp5.a) {
            }
        }
        for (N8 n9 : arrayList3) {
            map.put((C0118dp) n9.a, Boolean.FALSE);
            n9.e();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.a;
        Context context = viewGroup.getContext();
        ArrayList<M8> arrayList5 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        boolean z3 = false;
        while (it6.hasNext()) {
            M8 m9 = (M8) it6.next();
            C0118dp c0118dp6 = (C0118dp) m9.a;
            int iC2 = Vo.c(c0118dp6.c.E);
            int i2 = c0118dp6.a;
            if (iC2 != i2) {
                it = it6;
                if (iC2 == 2 || i2 == 2) {
                    C0096d2 c0096d2K = m9.k(context);
                    if (c0096d2K == null) {
                        m9.e();
                    } else {
                        Animator animator = (Animator) c0096d2K.c;
                        if (animator == null) {
                            arrayList5.add(m9);
                        } else {
                            C0118dp c0118dp7 = (C0118dp) m9.a;
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 = c0118dp7.c;
                            c0118dp2 = c0118dp2;
                            str = str2;
                            if (Boolean.TRUE.equals(map.get(c0118dp7))) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0784zc3 + " as this Fragment was involved in a Transition.");
                                }
                                m9.e();
                                it6 = it;
                                c0118dp2 = c0118dp2;
                                str2 = str;
                            } else {
                                boolean z4 = c0118dp7.a == 3;
                                if (z4) {
                                    arrayList4.remove(c0118dp7);
                                }
                                View view = abstractComponentCallbacksC0784zc3.E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new K8(viewGroup, view, z4, c0118dp7, m9));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + c0118dp7 + " has started.");
                                }
                                ((C0529r5) m9.b).b(new C0096d2(animator, 10, c0118dp7));
                                it6 = it;
                                c0118dp2 = c0118dp2;
                                str2 = str;
                                z3 = true;
                            }
                        }
                    }
                    c0118dp2 = c0118dp2;
                    str = str2;
                    it6 = it;
                    c0118dp2 = c0118dp2;
                    str2 = str;
                }
            } else {
                it = it6;
            }
            str = str2;
            m9.e();
            it6 = it;
            c0118dp2 = c0118dp2;
            str2 = str;
        }
        C0118dp c0118dp8 = c0118dp2;
        String str3 = str2;
        for (M8 m10 : arrayList5) {
            C0118dp c0118dp9 = (C0118dp) m10.a;
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc4 = c0118dp9.c;
            if (zContainsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0784zc4 + " as Animations cannot run alongside Transitions.");
                }
                m10.e();
            } else if (z3) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0784zc4 + " as Animations cannot run alongside Animators.");
                }
                m10.e();
            } else {
                View view2 = abstractComponentCallbacksC0784zc4.E;
                C0096d2 c0096d2K2 = m10.k(context);
                c0096d2K2.getClass();
                Animation animation = (Animation) c0096d2K2.b;
                animation.getClass();
                if (c0118dp9.a != 1) {
                    view2.startAnimation(animation);
                    m10.e();
                } else {
                    viewGroup.startViewTransition(view2);
                    Cc cc = new Cc(animation, viewGroup, view2);
                    cc.setAnimationListener(new L8(m10, c0118dp9, view2, viewGroup));
                    view2.startAnimation(cc);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + c0118dp9 + " has started.");
                    }
                }
                ((C0529r5) m10.b).b(new C0296jj(m10, c0118dp9, view2, viewGroup));
            }
        }
        for (C0118dp c0118dp10 : arrayList4) {
            Vo.a(c0118dp10.c.E, c0118dp10.a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c0118dp + str3 + c0118dp8);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = Gs.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList<C0118dp> arrayList = new ArrayList(this.c);
                    this.c.clear();
                    for (C0118dp c0118dp : arrayList) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0118dp);
                        }
                        c0118dp.a();
                        if (!c0118dp.g) {
                            this.c.add(c0118dp);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((C0118dp) it.next()).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0118dp d(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        for (C0118dp c0118dp : this.b) {
            if (c0118dp.c.equals(abstractComponentCallbacksC0784zc) && !c0118dp.f) {
                return c0118dp;
            }
        }
        return null;
    }

    public final void e() {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = Gs.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                h();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((C0118dp) it.next()).d();
                }
                for (C0118dp c0118dp : new ArrayList(this.c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(c0118dp);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0118dp.a();
                }
                for (C0118dp c0118dp2 : new ArrayList(this.b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zIsAttachedToWindow ? "" : "Container " + this.a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0118dp2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0118dp2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.b) {
            try {
                h();
                this.e = false;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    C0118dp c0118dp = (C0118dp) this.b.get(size);
                    int iC = Vo.c(c0118dp.c.E);
                    if (c0118dp.a == 2 && iC != 2) {
                        C0722xc c0722xc = c0118dp.c.H;
                        this.e = false;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        for (C0118dp c0118dp : this.b) {
            if (c0118dp.b == 2) {
                c0118dp.c(Vo.b(c0118dp.c.J().getVisibility()), 1);
            }
        }
    }
}
