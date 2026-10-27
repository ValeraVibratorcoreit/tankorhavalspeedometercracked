package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class L9 {
    public static final L9 b = new L9(2);
    public static final L9 c = new L9(0);
    public static final L9 d;
    public static final L9 e;
    public static final L9 f;
    public static final C0483pk g;
    public static final boolean h;
    public final /* synthetic */ int a;

    static {
        L9 l9 = new L9(1);
        d = l9;
        e = new L9(3);
        f = l9;
        g = C0483pk.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", l9);
        h = true;
    }

    public /* synthetic */ L9(int i) {
        this.a = i;
    }

    public final int a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (b(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return b.a(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, b.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                return iMax != 0 ? 1.0f / Integer.highestOneBit(iMax) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
