package defpackage;

/* JADX INFO: renamed from: gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0197gb implements Runnable {
    public final /* synthetic */ int a;
    public final Lm b;
    public final /* synthetic */ C0288jb c;

    public /* synthetic */ RunnableC0197gb(C0288jb c0288jb, Lm lm, int i) {
        this.a = i;
        this.c = c0288jb;
        this.b = lm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Ho ho = (Ho) this.b;
                ho.b.a();
                synchronized (ho.c) {
                    synchronized (this.c) {
                        try {
                            C0259ib c0259ib = this.c.a;
                            Lm lm = this.b;
                            c0259ib.getClass();
                            if (c0259ib.a.contains(new C0228hb(lm, AbstractC0390mk.f))) {
                                C0288jb c0288jb = this.c;
                                Lm lm2 = this.b;
                                c0288jb.getClass();
                                try {
                                    ((Ho) lm2).h(c0288jb.t, 5);
                                } catch (Throwable th) {
                                    throw new C0344l5(th);
                                }
                            }
                            this.c.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                Ho ho2 = (Ho) this.b;
                ho2.b.a();
                synchronized (ho2.c) {
                    synchronized (this.c) {
                        try {
                            C0259ib c0259ib2 = this.c.a;
                            Lm lm3 = this.b;
                            c0259ib2.getClass();
                            if (c0259ib2.a.contains(new C0228hb(lm3, AbstractC0390mk.f))) {
                                this.c.v.a();
                                C0288jb c0288jb2 = this.c;
                                Lm lm4 = this.b;
                                c0288jb2.getClass();
                                try {
                                    ((Ho) lm4).i(c0288jb2.v, c0288jb2.r, c0288jb2.y);
                                    this.c.h(this.b);
                                } catch (Throwable th3) {
                                    throw new C0344l5(th3);
                                }
                            }
                            this.c.d();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
