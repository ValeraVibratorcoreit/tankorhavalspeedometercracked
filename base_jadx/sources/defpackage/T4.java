package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class T4 implements Xi {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ T4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new Wi(new Lj(bArr), new C0326ki(bArr, 1, (S4) this.b));
            case 1:
                return new Wi(new Lj(obj), new C0194g8(0, obj.toString(), (C0225h8) this.b));
            default:
                File file = (File) obj;
                return new Wi(new Lj(file), new C0194g8(1, file, (C0225h8) this.b));
        }
    }
}
