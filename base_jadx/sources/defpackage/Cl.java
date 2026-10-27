package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Cl extends WeakReference {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cl(Dl dl, Object obj) {
        super(dl);
        Tf.j("referent", dl);
        this.a = obj;
    }
}
