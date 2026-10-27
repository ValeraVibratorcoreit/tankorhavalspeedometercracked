package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Uq extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public Uq(Uq uq) {
        super((ViewGroup.MarginLayoutParams) uq);
        this.a = 0;
        this.a = uq.a;
    }

    public Uq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
