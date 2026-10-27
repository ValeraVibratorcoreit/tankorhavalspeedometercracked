package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements R7 {
    public final R7 a;
    public final float b;

    public J0(float f, R7 r7) {
        while (r7 instanceof J0) {
            r7 = ((J0) r7).a;
            f += ((J0) r7).b;
        }
        this.a = r7;
        this.b = f;
    }

    @Override // defpackage.R7
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j0 = (J0) obj;
        return this.a.equals(j0.a) && this.b == j0.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
