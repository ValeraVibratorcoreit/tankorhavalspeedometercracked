package defpackage;

/* JADX INFO: renamed from: co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087co {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(C0087co c0087co) {
        Tf.j("other", c0087co);
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & c0087co.a) != 0) {
                c(i, c0087co.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
