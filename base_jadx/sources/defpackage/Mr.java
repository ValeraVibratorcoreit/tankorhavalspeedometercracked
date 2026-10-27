package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Mr implements Xi {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final Xi a;

    public Mr(Xi xi) {
        this.a = xi;
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        return this.a.b(new C0046be(((Uri) obj).toString()), i, i2, c0544rk);
    }
}
