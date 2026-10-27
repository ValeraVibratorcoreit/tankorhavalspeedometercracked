package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Ik {
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Tf.j("cause", th);
        Tf.j("exception", th2);
        Method method = Hk.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public AbstractC0793zl b() {
        return new Lb();
    }
}
