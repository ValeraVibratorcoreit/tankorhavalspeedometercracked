package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Kb extends AbstractC0366lr {
    public static final String[] B = {"android:visibility:visibility", "android:visibility:parent"};
    public final int A;

    public Kb(int i) {
        this();
        this.A = i;
    }

    public static void I(C0582sr c0582sr) {
        int visibility = c0582sr.b.getVisibility();
        HashMap map = c0582sr.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c0582sr.b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float K(C0582sr c0582sr, float f) {
        Float f2;
        return (c0582sr == null || (f2 = (Float) c0582sr.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static C0553rt L(C0582sr c0582sr, C0582sr c0582sr2) {
        C0553rt c0553rt = new C0553rt();
        c0553rt.a = false;
        c0553rt.b = false;
        if (c0582sr != null) {
            HashMap map = c0582sr.a;
            if (map.containsKey("android:visibility:visibility")) {
                c0553rt.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c0553rt.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c0553rt.c = -1;
                c0553rt.e = null;
            }
        } else {
            c0553rt.c = -1;
            c0553rt.e = null;
        }
        if (c0582sr2 != null) {
            HashMap map2 = c0582sr2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                c0553rt.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c0553rt.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c0553rt.d = -1;
                c0553rt.f = null;
            }
        } else {
            c0553rt.d = -1;
            c0553rt.f = null;
        }
        if (c0582sr != null && c0582sr2 != null) {
            int i = c0553rt.c;
            int i2 = c0553rt.d;
            if (i == i2 && c0553rt.e == c0553rt.f) {
                return c0553rt;
            }
            if (i != i2) {
                if (i == 0) {
                    c0553rt.b = false;
                    c0553rt.a = true;
                } else if (i2 == 0) {
                    c0553rt.b = true;
                    c0553rt.a = true;
                }
            } else if (c0553rt.f == null) {
                c0553rt.b = false;
                c0553rt.a = true;
            } else if (c0553rt.e == null) {
                c0553rt.b = true;
                c0553rt.a = true;
            }
        } else if (c0582sr == null && c0553rt.d == 0) {
            c0553rt.b = true;
            c0553rt.a = true;
        } else if (c0582sr2 == null && c0553rt.c == 0) {
            c0553rt.b = false;
            c0553rt.a = true;
        }
        return c0553rt;
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC0153et.a.n0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC0153et.b, f2);
        Jb jb = new Jb(view);
        objectAnimatorOfFloat.addListener(jb);
        o().a(jb);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.AbstractC0366lr
    public final void d(C0582sr c0582sr) {
        I(c0582sr);
    }

    @Override // defpackage.AbstractC0366lr
    public final void g(C0582sr c0582sr) {
        I(c0582sr);
        View view = c0582sr.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC0153et.a.D(view)) : Float.valueOf(0.0f);
        }
        c0582sr.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (L(n(r3, false), r(r3, false)).a != false) goto L20;
     */
    @Override // defpackage.AbstractC0366lr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r21, defpackage.C0582sr r22, defpackage.C0582sr r23) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Kb.k(android.view.ViewGroup, sr, sr):android.animation.Animator");
    }

    @Override // defpackage.AbstractC0366lr
    public final String[] q() {
        return B;
    }

    @Override // defpackage.AbstractC0366lr
    public final boolean s(C0582sr c0582sr, C0582sr c0582sr2) {
        if (c0582sr == null && c0582sr2 == null) {
            return false;
        }
        if (c0582sr != null && c0582sr2 != null && c0582sr2.a.containsKey("android:visibility:visibility") != c0582sr.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0553rt c0553rtL = L(c0582sr, c0582sr2);
        if (c0553rtL.a) {
            return c0553rtL.c == 0 || c0553rtL.d == 0;
        }
        return false;
    }

    public Kb() {
        this.A = 3;
    }
}
