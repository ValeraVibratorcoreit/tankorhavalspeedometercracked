package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Zq extends Zs {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public Zq(C0028ar c0028ar, int i) {
        this.a = 0;
        this.d = c0028ar;
        this.c = i;
        this.b = false;
    }

    @Override // defpackage.Ys
    public final void a() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((C0028ar) this.d).a.setVisibility(this.c);
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                Xs xs = (Xs) this.d;
                if (i == xs.a.size()) {
                    Ys ys = xs.d;
                    if (ys != null) {
                        ys.a();
                    }
                    this.c = 0;
                    this.b = false;
                    xs.e = false;
                }
                break;
        }
    }

    @Override // defpackage.Zs, defpackage.Ys
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.Zs, defpackage.Ys
    public final void c() {
        switch (this.a) {
            case 0:
                ((C0028ar) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    Ys ys = ((Xs) this.d).d;
                    if (ys != null) {
                        ys.c();
                    }
                    break;
                }
                break;
        }
    }

    public Zq(Xs xs) {
        this.a = 1;
        this.d = xs;
        this.b = false;
        this.c = 0;
    }
}
