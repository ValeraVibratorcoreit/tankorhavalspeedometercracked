package defpackage;

/* JADX INFO: renamed from: eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148eo {
    public final String a;
    public final int b;
    public final int c;
    public final Class d;
    public final int[] e;
    public final String[] f;

    public C0148eo(String str, int i, int i2, Class cls, int[] iArr, String[] strArr) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = cls;
        this.e = iArr;
        this.f = strArr;
    }

    public static C0148eo a(String str, int i, int i2, Class cls) {
        return new C0148eo(str, i, i2, cls, null, null);
    }
}
