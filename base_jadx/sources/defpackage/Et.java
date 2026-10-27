package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Et extends Ht {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Mb f = new Mb(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        C7 c7J = j(view);
        if (c7J != null) {
            ((View) c7J.e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z) {
        C7 c7J = j(view);
        if (c7J != null) {
            c7J.b = windowInsets;
            if (!z) {
                View view2 = (View) c7J.e;
                int[] iArr = (int[]) c7J.f;
                view2.getLocationOnScreen(iArr);
                z = true;
                c7J.c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(View view, Vt vt, List list) {
        C7 c7J = j(view);
        if (c7J != null) {
            c7J.a(vt, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), vt, list);
            }
        }
    }

    public static void h(View view, C0426np c0426np) {
        C7 c7J = j(view);
        if (c7J != null) {
            View view2 = (View) c7J.e;
            int[] iArr = (int[]) c7J.f;
            view2.getLocationOnScreen(iArr);
            int i = c7J.c - iArr[1];
            c7J.d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), c0426np);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C7 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof Dt) {
            return ((Dt) tag).a;
        }
        return null;
    }
}
