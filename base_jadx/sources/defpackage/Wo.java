package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Wo implements Comparable {
    public boolean a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public C0097d3[] i = new C0097d3[16];
    public int j = 0;
    public int k = 0;

    public Wo(int i) {
        this.l = i;
    }

    public final void a(C0097d3 c0097d3) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            if (i >= i2) {
                C0097d3[] c0097d3Arr = this.i;
                if (i2 >= c0097d3Arr.length) {
                    this.i = (C0097d3[]) Arrays.copyOf(c0097d3Arr, c0097d3Arr.length * 2);
                }
                C0097d3[] c0097d3Arr2 = this.i;
                int i3 = this.j;
                c0097d3Arr2[i3] = c0097d3;
                this.j = i3 + 1;
                return;
            }
            if (this.i[i] == c0097d3) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0097d3 c0097d3) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == c0097d3) {
                while (i2 < i - 1) {
                    C0097d3[] c0097d3Arr = this.i;
                    int i3 = i2 + 1;
                    c0097d3Arr[i2] = c0097d3Arr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((Wo) obj).b;
    }

    public final void d(Qg qg, float f) {
        this.e = f;
        this.f = true;
        int i = this.j;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(qg, this, false);
        }
        this.j = 0;
    }

    public final void e(Qg qg, C0097d3 c0097d3) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(qg, c0097d3, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
