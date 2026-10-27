package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Kn extends Sn {
    public View g;
    public GradientDrawable h;
    public Jn i;
    public int j;

    public int getColor() {
        return this.j;
    }

    public void setColor(int i) {
        this.j = i;
        this.h.setColor(i);
    }

    public void setOnColorChanged(Jn jn) {
        this.i = jn;
    }
}
