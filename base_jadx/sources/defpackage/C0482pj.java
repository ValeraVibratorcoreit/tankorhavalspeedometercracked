package defpackage;

import java.util.Comparator;

/* JADX INFO: renamed from: pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0482pj implements Comparator {
    public static final C0482pj b = new C0482pj(0);
    public static final C0482pj c = new C0482pj(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0482pj(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                Tf.j("a", comparable);
                Tf.j("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                Tf.j("a", comparable3);
                Tf.j("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }
}
