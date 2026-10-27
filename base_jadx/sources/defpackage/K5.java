package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class K5 extends AbstractC0366lr {
    public static final String[] A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final G5 B = new G5(PointF.class, "topLeft", 0);
    public static final G5 C = new G5(PointF.class, "bottomRight", 1);
    public static final G5 D = new G5(PointF.class, "bottomRight", 2);
    public static final G5 E = new G5(PointF.class, "topLeft", 3);
    public static final G5 F = new G5(PointF.class, "position", 4);

    public static void I(C0582sr c0582sr) {
        View view = c0582sr.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c0582sr.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c0582sr.b.getParent());
    }

    @Override // defpackage.AbstractC0366lr
    public final void d(C0582sr c0582sr) {
        I(c0582sr);
    }

    @Override // defpackage.AbstractC0366lr
    public final void g(C0582sr c0582sr) {
        I(c0582sr);
    }

    @Override // defpackage.AbstractC0366lr
    public final Animator k(ViewGroup viewGroup, C0582sr c0582sr, C0582sr c0582sr2) {
        int i;
        Animator animatorA;
        if (c0582sr == null || c0582sr2 == null) {
            return null;
        }
        HashMap map = c0582sr.a;
        HashMap map2 = c0582sr2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        View view = c0582sr2.b;
        AbstractC0153et.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.v.getClass();
                animatorA = Kj.a(view, F, C0387mh.j(i2, i4, i3, i5));
            } else {
                J5 j5 = new J5(view);
                this.v.getClass();
                ObjectAnimator objectAnimatorA = Kj.a(j5, B, C0387mh.j(i2, i4, i3, i5));
                this.v.getClass();
                ObjectAnimator objectAnimatorA2 = Kj.a(j5, C, C0387mh.j(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                animatorSet.addListener(new H5(j5));
                animatorA = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.v.getClass();
            animatorA = Kj.a(view, D, C0387mh.j(i6, i8, i7, i9));
        } else {
            this.v.getClass();
            animatorA = Kj.a(view, E, C0387mh.j(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            Br.r0(viewGroup4, true);
            o().a(new I5(viewGroup4));
        }
        return animatorA;
    }

    @Override // defpackage.AbstractC0366lr
    public final String[] q() {
        return A;
    }
}
