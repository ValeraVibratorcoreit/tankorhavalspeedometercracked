package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0247i implements R7 {
    public final float a;

    public C0247i(float f) {
        this.a = f;
    }

    @Override // defpackage.R7
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0247i) && this.a == ((C0247i) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
