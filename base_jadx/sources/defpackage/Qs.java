package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface Qs {
    default Os a(Class cls, C0420nj c0420nj) {
        return b(cls);
    }

    default Os b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default Os c(Y5 y5, C0420nj c0420nj) {
        return a(Tf.D(y5), c0420nj);
    }
}
