package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0357li implements Xi {
    public final /* synthetic */ int a;
    public final Context b;

    public C0357li(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return Ud.O((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return Ud.O(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return Ud.O(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        Long l;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return new Wi(new Lj(uri), new C0326ki(this.b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                Lj lj = new Lj(uri2);
                Context context = this.b;
                return new Wi(lj, C0194g8.b(context, uri2, new Eq(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c0544rk.c(C0460os.d)) == null || l.longValue() != -1) {
                    return null;
                }
                Lj lj2 = new Lj(uri3);
                Context context2 = this.b;
                return new Wi(lj2, C0194g8.b(context2, uri3, new Eq(context2.getContentResolver(), 1)));
        }
    }
}
