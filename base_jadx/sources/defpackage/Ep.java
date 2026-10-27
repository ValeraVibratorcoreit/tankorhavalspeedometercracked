package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class Ep implements Xi {
    public final /* synthetic */ int a;
    public final Xi b;

    public /* synthetic */ Ep(Xi xi, int i) {
        this.a = i;
        this.b = xi;
    }

    @Override // defpackage.Xi
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        Uri uriFromFile;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                Xi xi = this.b;
                if (xi.a(uriFromFile)) {
                    return xi.b(uriFromFile, i, i2, c0544rk);
                }
                return null;
            default:
                return this.b.b(new C0046be((URL) obj), i, i2, c0544rk);
        }
    }
}
