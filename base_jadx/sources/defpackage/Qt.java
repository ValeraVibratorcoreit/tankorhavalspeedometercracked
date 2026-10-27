package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Qt extends Pt {
    public Qt(Vt vt, WindowInsets windowInsets) {
        super(vt, windowInsets);
    }

    @Override // defpackage.Tt
    public Vt a() {
        return Vt.g(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.Tt
    public C0595t9 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0595t9(displayCutout);
    }

    @Override // defpackage.Tt
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qt)) {
            return false;
        }
        Qt qt = (Qt) obj;
        return Objects.equals(this.c, qt.c) && Objects.equals(this.g, qt.g);
    }

    @Override // defpackage.Tt
    public int hashCode() {
        return this.c.hashCode();
    }
}
