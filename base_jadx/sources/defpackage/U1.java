package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class U1 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static U1 c;
    public Tm a;

    public static synchronized U1 a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            U1 u1 = new U1();
            c = u1;
            u1.a = Tm.c();
            Tm tm = c.a;
            T1 t1 = new T1();
            synchronized (tm) {
                tm.e = t1;
            }
        }
    }

    public static void d(Drawable drawable, W6 w6, int[] iArr) {
        PorterDuff.Mode mode = Tm.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = w6.b;
        if (!z && !w6.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterG = null;
        ColorStateList colorStateList = z ? (ColorStateList) w6.c : null;
        PorterDuff.Mode mode2 = w6.a ? (PorterDuff.Mode) w6.d : Tm.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterG = Tm.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterG);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.e(context, i);
    }
}
