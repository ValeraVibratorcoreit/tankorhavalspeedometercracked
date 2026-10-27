package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class V7 extends C0173fi {
    public final RectF v;

    public V7(C0487po c0487po, RectF rectF) {
        super(c0487po);
        this.v = rectF;
    }

    @Override // defpackage.C0173fi, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        W7 w7 = new W7(this);
        w7.invalidateSelf();
        return w7;
    }

    public V7(V7 v7) {
        super(v7);
        this.v = v7.v;
    }
}
