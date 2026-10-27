package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0528r4 implements Qm {
    public static final C0483pk b = C0483pk.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final C0483pk c = new C0483pk("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C0483pk.e);
    public final C0634uh a;

    public C0528r4(C0634uh c0634uh) {
        this.a = c0634uh;
    }

    @Override // defpackage.Wa
    public final boolean d(Object obj, File file, C0544rk c0544rk) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((Im) obj).get();
        C0483pk c0483pk = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c0544rk.c(c0483pk);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = AbstractC0449oh.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c0544rk.c(b)).intValue();
        OutputStream n4 = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C0634uh c0634uh = this.a;
                    if (c0634uh != null) {
                        try {
                            n4 = new N4(fileOutputStream, c0634uh);
                        } catch (IOException e) {
                            e = e;
                            n4 = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (n4 != null) {
                                try {
                                    n4.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            n4 = fileOutputStream;
                            if (n4 != null) {
                                try {
                                    n4.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        n4 = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, n4);
                    n4.close();
                    try {
                        n4.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + Qr.c(bitmap) + " in " + AbstractC0449oh.a(jElapsedRealtimeNanos) + ", options format: " + c0544rk.c(c0483pk) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // defpackage.Qm
    public final int i(C0544rk c0544rk) {
        return 2;
    }
}
