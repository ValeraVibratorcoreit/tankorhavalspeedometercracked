package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hk {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Tf.i("throwableMethods", methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (Tf.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Tf.i("it.parameterTypes", parameterTypes);
                if (Tf.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !Tf.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
