package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043bb {
    public final int a;
    public final int b;
    public final Cloneable c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0043bb(byte[] bArr, C0388mi c0388mi, int i, int i2) {
        this.c = bArr;
        this.d = c0388mi;
        this.a = i;
        this.b = i2;
    }

    public static final C0043bb a(C0388mi c0388mi, String str) {
        Tf.j("content", str);
        Charset charset = L5.a;
        if (c0388mi != null) {
            Pattern pattern = C0388mi.c;
            Charset charsetA = c0388mi.a(null);
            if (charsetA == null) {
                String str2 = c0388mi + "; charset=utf-8";
                Tf.j("$this$toMediaTypeOrNull", str2);
                try {
                    c0388mi = Tf.r(str2);
                } catch (IllegalArgumentException unused) {
                    c0388mi = null;
                }
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        Tf.i("(this as java.lang.String).getBytes(charset)", bytes);
        int length = bytes.length;
        Rr.c(bytes.length, 0, length);
        return new C0043bb(bytes, c0388mi, length, 0);
    }

    public C0043bb(C0074cb c0074cb, K2 k2) {
        this.c = new SparseArray();
        this.d = c0074cb;
        TypedArray typedArray = (TypedArray) k2.b;
        this.a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(52, 0);
    }
}
