package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Pk extends Ok {
    public final Object c;

    public Pk(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.Ok, defpackage.Nk
    public final boolean a(Object obj) {
        boolean zA;
        Tf.j("instance", obj);
        synchronized (this.c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // defpackage.Ok, defpackage.Nk
    public final Object b() {
        Object objB;
        synchronized (this.c) {
            objB = super.b();
        }
        return objB;
    }
}
