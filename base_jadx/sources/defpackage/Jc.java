package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class Jc {
    public static final Fo b = new Fo();
    public final /* synthetic */ Oc a;

    public Jc(Oc oc) {
        this.a = oc;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Fo fo = b;
        Fo fo2 = (Fo) fo.getOrDefault(classLoader, null);
        if (fo2 == null) {
            fo2 = new Fo();
            fo.put(classLoader, fo2);
        }
        Class cls = (Class) fo2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        fo2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0753yc(Vo.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0753yc(Vo.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final AbstractComponentCallbacksC0784zc a(String str) {
        try {
            return (AbstractComponentCallbacksC0784zc) c(this.a.t.k.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0753yc(Vo.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0753yc(Vo.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0753yc(Vo.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0753yc(Vo.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
