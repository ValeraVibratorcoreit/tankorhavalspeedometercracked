package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Ym {
    public final Resources a;
    public final Resources.Theme b;

    public Ym(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ym.class != obj.getClass()) {
            return false;
        }
        Ym ym = (Ym) obj;
        return this.a.equals(ym.a) && Objects.equals(this.b, ym.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
