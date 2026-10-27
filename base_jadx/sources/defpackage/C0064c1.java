package defpackage;

import android.text.TextUtils;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0064c1 implements R8, Ja {
    public final String a;

    public C0064c1() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    @Override // defpackage.R8
    public boolean a(SSLSocket sSLSocket) {
        return Mp.U0(sSLSocket.getClass().getName(), this.a + '.', false);
    }

    @Override // defpackage.Ja
    public Object b() {
        return this;
    }

    @Override // defpackage.R8
    public To c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0095d1(superclass);
    }

    @Override // defpackage.Ja
    public boolean f(CharSequence charSequence, int i, int i2, Fr fr) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        fr.c = (fr.c & 3) | 4;
        return false;
    }

    public C0064c1(String str) {
        this.a = str;
    }
}
