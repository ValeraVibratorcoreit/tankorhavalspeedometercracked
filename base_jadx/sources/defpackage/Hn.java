package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Hn implements Runnable {
    public final Fg a;
    public final EnumC0602tg b;
    public boolean c;

    public Hn(Fg fg, EnumC0602tg enumC0602tg) {
        Tf.j("registry", fg);
        Tf.j("event", enumC0602tg);
        this.a = fg;
        this.b = enumC0602tg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
