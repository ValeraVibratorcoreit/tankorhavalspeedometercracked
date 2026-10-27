package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0368lt extends Br {
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;

    public void B0(View view, int i, int i2, int i3, int i4) {
        if (l) {
            try {
                AbstractC0246ht.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }

    public void C0(View view, Matrix matrix) {
        if (j) {
            try {
                AbstractC0215gt.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void D0(View view, Matrix matrix) {
        if (k) {
            try {
                AbstractC0215gt.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    @Override // defpackage.Br
    public void o0(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.o0(view, i);
        } else if (m) {
            try {
                AbstractC0337kt.a(view, i);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}
