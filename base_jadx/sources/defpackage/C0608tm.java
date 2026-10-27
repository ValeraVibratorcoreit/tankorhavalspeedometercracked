package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0608tm implements R7 {
    public final float a;

    public C0608tm(float f) {
        this.a = f;
    }

    @Override // defpackage.R7
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0608tm) && this.a == ((C0608tm) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
