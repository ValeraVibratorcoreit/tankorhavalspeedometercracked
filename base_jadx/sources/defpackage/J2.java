package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class J2 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final Fo h = new Fo();
    public final Object[] a = new Object[2];

    public C0525r1 a(Context context, AttributeSet attributeSet) {
        return new C0525r1(context, attributeSet);
    }

    public C0587t1 b(Context context, AttributeSet attributeSet) {
        return new C0587t1(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.buttonStyle);
    }

    public C0649v1 c(Context context, AttributeSet attributeSet) {
        return new C0649v1(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.checkboxStyle);
    }

    public C0126e2 d(Context context, AttributeSet attributeSet) {
        return new C0126e2(context, attributeSet);
    }

    public C2 e(Context context, AttributeSet attributeSet) {
        return new C2(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        Fo fo = h;
        Constructor constructor = (Constructor) fo.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            fo.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
