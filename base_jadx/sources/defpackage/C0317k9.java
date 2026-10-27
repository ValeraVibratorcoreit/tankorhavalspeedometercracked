package defpackage;

/* JADX INFO: renamed from: k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0317k9 {
    public static final C0317k9 b = new C0317k9(0);
    public static final C0317k9 c = new C0317k9(1);
    public static final C0317k9 d = new C0317k9(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C0317k9(int i) {
        this.a = i;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                return true;
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public final boolean c(int i) {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }

    public final boolean d(int i, int i2, boolean z) {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((z && i == 3) || i == 1) && i2 == 2;
        }
    }
}
