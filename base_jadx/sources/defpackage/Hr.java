package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class Hr implements Xi {
    public static final Hr b = new Hr(0);
    public final /* synthetic */ int a;

    public /* synthetic */ Hr(int i) {
        this.a = i;
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                return new Wi(new Lj(obj), new W4(obj, 1));
            case 1:
                File file = (File) obj;
                return new Wi(new Lj(file), new W4(file, 0));
            default:
                return null;
        }
    }
}
