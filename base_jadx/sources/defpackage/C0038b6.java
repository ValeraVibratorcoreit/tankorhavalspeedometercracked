package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038b6 {
    public static final C0038b6 c = new C0038b6();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, C0007a6 c0007a6, EnumC0602tg enumC0602tg, Class cls) {
        EnumC0602tg enumC0602tg2 = (EnumC0602tg) map.get(c0007a6);
        if (enumC0602tg2 == null || enumC0602tg == enumC0602tg2) {
            if (enumC0602tg2 == null) {
                map.put(c0007a6, enumC0602tg);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0007a6.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0602tg2 + ", new value " + enumC0602tg);
    }

    public final Z5 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            Z5 z5A = (Z5) map2.get(superclass);
            if (z5A == null) {
                z5A = a(superclass, null);
            }
            map.putAll(z5A.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            Z5 z5A2 = (Z5) map2.get(cls2);
            if (z5A2 == null) {
                z5A2 = a(cls2, null);
            }
            for (Map.Entry entry : z5A2.b.entrySet()) {
                b(map, (C0007a6) entry.getKey(), (EnumC0602tg) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0144ek interfaceC0144ek = (InterfaceC0144ek) method.getAnnotation(InterfaceC0144ek.class);
            if (interfaceC0144ek != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!Dg.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0602tg enumC0602tgValue = interfaceC0144ek.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0602tg.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0602tgValue != EnumC0602tg.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0007a6(i, method), enumC0602tgValue, cls);
                z = true;
            }
        }
        Z5 z5 = new Z5(map);
        map2.put(cls, z5);
        this.b.put(cls, Boolean.valueOf(z));
        return z5;
    }
}
