package defpackage;

import java.util.Collection;

/* JADX INFO: renamed from: m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376m6 extends AbstractC0345l6 {
    public static int u0(Iterable iterable) {
        Tf.j("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
