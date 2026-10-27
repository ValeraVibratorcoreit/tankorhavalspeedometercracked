package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Jl implements Closeable {
    public final /* synthetic */ int a = 1;
    public final P4 b;
    public final long c;
    public final Object d;

    public Jl(L4 l4, C0388mi c0388mi, long j) {
        this.b = l4;
        this.d = c0388mi;
        this.c = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Rr.d(x());
    }

    public final long n() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final C0388mi w() {
        Object obj = this.d;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C0388mi.c;
                try {
                    return Tf.r(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (C0388mi) obj;
        }
    }

    public final P4 x() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final String y() throws IOException {
        Charset charsetA;
        P4 p4X = x();
        try {
            C0388mi c0388miW = w();
            if (c0388miW == null || (charsetA = c0388miW.a(L5.a)) == null) {
                charsetA = L5.a;
            }
            String strT = p4X.t(Rr.r(p4X, charsetA));
            Td.g(p4X, null);
            return strT;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Td.g(p4X, th);
                throw th2;
            }
        }
    }

    public Jl(String str, long j, Bl bl) {
        this.d = str;
        this.c = j;
        this.b = bl;
    }
}
