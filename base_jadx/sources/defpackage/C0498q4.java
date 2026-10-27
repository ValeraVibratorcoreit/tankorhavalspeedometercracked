package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498q4 implements Um, Yi {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ C0498q4(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.Um
    public Im m(Im im, C0544rk c0544rk) {
        if (im == null) {
            return null;
        }
        return new C0652v4(this.b, im);
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 1:
                return new C0280j3(this.b, c0296jj.e(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new C0280j3(this.b, c0296jj.e(Uri.class, InputStream.class));
            default:
                return new C0280j3(this.b, Hr.b);
        }
    }
}
