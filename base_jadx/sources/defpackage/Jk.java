package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class Jk {
    public static final Ik a;

    static {
        Ik ik;
        try {
            Object objNewInstance = Xf.class.newInstance();
            Tf.i("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance);
            try {
                try {
                    ik = (Ik) objNewInstance;
                } catch (ClassCastException e) {
                    ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = Ik.class.getClassLoader();
                    if (Tf.b(classLoader, classLoader2)) {
                        throw e;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
            } catch (ClassNotFoundException unused) {
                Object objNewInstance2 = Vf.class.newInstance();
                Tf.i("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance2);
                try {
                    try {
                        ik = (Ik) objNewInstance2;
                    } catch (ClassNotFoundException unused2) {
                        ik = new Ik();
                    }
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = Ik.class.getClassLoader();
                    if (Tf.b(classLoader3, classLoader4)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object objNewInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            Tf.i("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance3);
            try {
                try {
                    ik = (Ik) objNewInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    Tf.i("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance4);
                    try {
                        ik = (Ik) objNewInstance4;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = Ik.class.getClassLoader();
                        if (Tf.b(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                }
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = objNewInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = Ik.class.getClassLoader();
                if (Tf.b(classLoader7, classLoader8)) {
                    throw e4;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
            }
        }
        a = ik;
    }
}
