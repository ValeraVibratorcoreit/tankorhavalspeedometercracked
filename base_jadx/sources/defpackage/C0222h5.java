package defpackage;

/* JADX INFO: renamed from: h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222h5 extends C0066c3 {
    public int i;

    @Override // defpackage.Fo, java.util.Map
    public final void clear() {
        this.i = 0;
        super.clear();
    }

    @Override // defpackage.Fo, java.util.Map
    public final int hashCode() {
        if (this.i == 0) {
            this.i = super.hashCode();
        }
        return this.i;
    }

    @Override // defpackage.Fo
    public final void i(Fo fo) {
        this.i = 0;
        super.i(fo);
    }

    @Override // defpackage.Fo
    public final Object j(int i) {
        this.i = 0;
        return super.j(i);
    }

    @Override // defpackage.Fo
    public final Object k(int i, Object obj) {
        this.i = 0;
        return super.k(i, obj);
    }

    @Override // defpackage.Fo, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.i = 0;
        return super.put(obj, obj2);
    }
}
