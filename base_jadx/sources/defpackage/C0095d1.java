package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0095d1 implements To {
    public static final C0064c1 f = new C0064c1();
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Class e;

    public C0095d1(Class cls) throws NoSuchMethodException {
        this.e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Tf.i("sslSocketClass.getDeclar…:class.javaPrimitiveType)", declaredMethod);
        this.a = declaredMethod;
        this.b = cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.To
    public final boolean a(SSLSocket sSLSocket) {
        return this.e.isInstance(sSLSocket);
    }

    @Override // defpackage.To
    public final String b(SSLSocket sSLSocket) {
        if (!this.e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Tf.i("StandardCharsets.UTF_8", charset);
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (Tf.b(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.To
    public final boolean c() {
        boolean z = C0002a1.e;
        return C0002a1.e;
    }

    @Override // defpackage.To
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Tf.j("protocols", list);
        if (this.e.isInstance(sSLSocket)) {
            try {
                this.a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.b.invoke(sSLSocket, str);
                }
                Method method = this.d;
                Gk gk = Gk.a;
                method.invoke(sSLSocket, C0387mh.i(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
