package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class Eq implements Fq, Yi, Kr {
    public static final String[] c = {"_data"};
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final ContentResolver b;

    public /* synthetic */ Eq(ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = contentResolver;
    }

    @Override // defpackage.Fq
    public Cursor a(Uri uri) {
        switch (this.a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }

    @Override // defpackage.Kr
    public InterfaceC0009a8 b(Uri uri) {
        switch (this.a) {
            case 2:
                return new C0189g3(this.b, uri, 0);
            case 3:
                return new C0189g3(this.b, uri, 1);
            default:
                return new Ap(1, uri, this.b);
        }
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 2:
                break;
            case 3:
                break;
        }
        return new Lr(this);
    }
}
