package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class Nt {
    public final Vt a;
    public Hf[] b;

    public Nt() {
        this(new Vt());
    }

    public final void a() {
        Hf[] hfArr = this.b;
        if (hfArr != null) {
            Hf hfF = hfArr[0];
            Hf hfF2 = hfArr[1];
            Vt vt = this.a;
            if (hfF2 == null) {
                hfF2 = vt.a.f(2);
            }
            if (hfF == null) {
                hfF = vt.a.f(1);
            }
            g(Hf.a(hfF, hfF2));
            Hf hf = this.b[4];
            if (hf != null) {
                f(hf);
            }
            Hf hf2 = this.b[5];
            if (hf2 != null) {
                d(hf2);
            }
            Hf hf3 = this.b[6];
            if (hf3 != null) {
                h(hf3);
            }
        }
    }

    public abstract Vt b();

    public void c(int i, Hf hf) {
        char c;
        if (this.b == null) {
            this.b = new Hf[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                Hf[] hfArr = this.b;
                if (i2 != 1) {
                    c = 2;
                    if (i2 == 2) {
                        c = 1;
                    } else if (i2 != 4) {
                        c = '\b';
                        if (i2 == 8) {
                            c = 3;
                        } else if (i2 == 16) {
                            c = 4;
                        } else if (i2 == 32) {
                            c = 5;
                        } else if (i2 == 64) {
                            c = 6;
                        } else if (i2 == 128) {
                            c = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(Vo.e(i2, "type needs to be >= FIRST and <= LAST, type="));
                        }
                    }
                } else {
                    c = 0;
                }
                hfArr[c] = hf;
            }
        }
    }

    public void d(Hf hf) {
    }

    public abstract void e(Hf hf);

    public void f(Hf hf) {
    }

    public abstract void g(Hf hf);

    public void h(Hf hf) {
    }

    public Nt(Vt vt) {
        this.a = vt;
    }
}
