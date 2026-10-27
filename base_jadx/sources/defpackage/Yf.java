package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Yf implements InvocationHandler {
    public boolean a;
    public String b;
    public final List c;

    public Yf(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Tf.j("proxy", obj);
        Tf.j("method", method);
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Tf.b(name, "supports") && Tf.b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Tf.b(name, "unsupported") && Tf.b(Void.TYPE, returnType)) {
            this.a = true;
            return null;
        }
        boolean zB = Tf.b(name, "protocols");
        List list = this.c;
        if (zB && objArr.length == 0) {
            return list;
        }
        if ((Tf.b(name, "selectProtocol") || Tf.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list2.get(i);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.b = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.b = str2;
                return str2;
            }
        }
        if ((!Tf.b(name, "protocolSelected") && !Tf.b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.b = (String) obj4;
        return null;
    }
}
