package defpackage;

import android.content.res.AssetManager;

/* JADX INFO: renamed from: i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251i3 implements Yi {
    public final /* synthetic */ int a;
    public final AssetManager b;

    public /* synthetic */ C0251i3(AssetManager assetManager, int i) {
        this.a = i;
        this.b = assetManager;
    }

    public final InterfaceC0009a8 a(AssetManager assetManager, String str) {
        switch (this.a) {
            case 0:
                return new Tb(assetManager, str, 0);
            default:
                return new Tb(assetManager, str, 1);
        }
    }

    @Override // defpackage.Yi
    public final Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 0:
                break;
        }
        return new C0280j3(this.b, 0, this);
    }
}
