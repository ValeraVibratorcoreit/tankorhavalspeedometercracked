package defpackage;

import android.view.View;
import java.util.Objects;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class As {
    public static void a(View view, Fs fs) {
        Fo fo = (Fo) view.getTag(R.id.tag_unhandled_key_listeners);
        if (fo == null) {
            fo = new Fo();
            view.setTag(R.id.tag_unhandled_key_listeners, fo);
        }
        Objects.requireNonNull(fs);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0800zs = new ViewOnUnhandledKeyEventListenerC0800zs();
        fo.put(fs, viewOnUnhandledKeyEventListenerC0800zs);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0800zs);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, Fs fs) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        Fo fo = (Fo) view.getTag(R.id.tag_unhandled_key_listeners);
        if (fo == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) fo.getOrDefault(fs, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC0497q3 abstractC0497q3) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
