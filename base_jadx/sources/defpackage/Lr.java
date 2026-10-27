package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Lr implements Xi {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final Kr a;

    public Lr(Kr kr) {
        this.a = kr;
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        Uri uri = (Uri) obj;
        return new Wi(new Lj(uri), this.a.b(uri));
    }
}
