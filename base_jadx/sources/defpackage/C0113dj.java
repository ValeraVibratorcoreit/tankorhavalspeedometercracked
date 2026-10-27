package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113dj {
    public final Fo a = new Fo();
    public final Fo b = new Fo();

    public static C0113dj a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static C0113dj b(ArrayList arrayList) {
        C0113dj c0113dj = new C0113dj();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0113dj.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0340l1.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0340l1.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0340l1.d;
            }
            C0143ej c0143ej = new C0143ej();
            c0143ej.d = 0;
            c0143ej.e = 1;
            c0143ej.a = startDelay;
            c0143ej.b = duration;
            c0143ej.c = interpolator;
            c0143ej.d = objectAnimator.getRepeatCount();
            c0143ej.e = objectAnimator.getRepeatMode();
            c0113dj.a.put(propertyName, c0143ej);
        }
        return c0113dj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0113dj) {
            return this.a.equals(((C0113dj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + C0113dj.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
