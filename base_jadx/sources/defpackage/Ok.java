package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class Ok implements Nk {
    public final Object[] a;
    public int b;

    public Ok(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.a = new Object[i];
    }

    @Override // defpackage.Nk
    public boolean a(Object obj) {
        Object[] objArr;
        boolean z;
        Tf.j("instance", obj);
        int i = this.b;
        int i2 = 0;
        while (true) {
            objArr = this.a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (!(!z)) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i3 = this.b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }

    @Override // defpackage.Nk
    public Object b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        Tf.g("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void c(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public Ok() {
        this.a = new Object[256];
    }
}
