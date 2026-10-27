package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class F3 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public F3(Uri uri, String str, String str2, boolean z) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = -1;
        this.e = z;
    }

    public F3(String str, int i, String str2) {
        this.a = null;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = false;
    }
}
