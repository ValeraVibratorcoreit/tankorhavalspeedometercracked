package defpackage;

import java.io.File;

/* JADX INFO: renamed from: p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472p9 {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public C0441o9 f;
    public final /* synthetic */ C0503q9 g;

    public C0472p9(C0503q9 c0503q9, String str) {
        this.g = c0503q9;
        this.a = str;
        int i = c0503q9.g;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c0503q9.g; i2++) {
            sb.append(i2);
            File[] fileArr = this.c;
            String string = sb.toString();
            File file = c0503q9.a;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
