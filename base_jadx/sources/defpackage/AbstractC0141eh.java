package defpackage;

/* JADX INFO: renamed from: eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0141eh {
    public final Mj a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ C0451oj d;

    public AbstractC0141eh(C0451oj c0451oj, Mj mj) {
        this.d = c0451oj;
        this.a = mj;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        C0451oj c0451oj = this.d;
        int i2 = c0451oj.c;
        c0451oj.c = i + i2;
        if (!c0451oj.d) {
            c0451oj.d = true;
            while (true) {
                try {
                    int i3 = c0451oj.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    c0451oj.d = false;
                    throw th;
                }
            }
            c0451oj.d = false;
        }
        if (this.b) {
            c0451oj.c(this);
        }
    }

    public void b() {
    }

    public boolean c(Dg dg) {
        return false;
    }

    public abstract boolean d();
}
