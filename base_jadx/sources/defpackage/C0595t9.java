package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0595t9 {
    public final DisplayCutout a;

    public C0595t9(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0595t9.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C0595t9) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
