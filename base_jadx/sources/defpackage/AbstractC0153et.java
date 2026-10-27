package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153et {
    public static final C0368lt a;
    public static final G5 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new C0399mt();
        } else {
            a = new C0368lt();
        }
        b = new G5(Float.class, "translationAlpha", 6);
        new G5(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.B0(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.o0(view, i);
    }
}
