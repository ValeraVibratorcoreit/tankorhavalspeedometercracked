package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class Vf extends Ik {
    @Override // defpackage.Ik
    public final void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Tf.j("cause", th);
        Tf.j("exception", th2);
        Integer num = Uf.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
