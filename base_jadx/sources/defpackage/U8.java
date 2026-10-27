package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class U8 implements Fn {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final Lp d;

    public U8(CharSequence charSequence, int i, int i2, Lp lp) {
        Tf.j("input", charSequence);
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = lp;
    }

    @Override // defpackage.Fn
    public final Iterator iterator() {
        return new T8(this);
    }
}
