package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends AbstractC0683w4 {
    public final Bitmap b;
    public Rect c;
    public final Paint d;
    public final Context e;

    public K0(Context context, Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        this.e = context;
        if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        Bitmap bitmapCreateScaledBitmap = (bitmapCreateBitmap.getWidth() == 1920 && bitmapCreateBitmap.getHeight() == 720) ? bitmapCreateBitmap : Bitmap.createScaledBitmap(bitmapCreateBitmap, 1920, 720, true);
        this.b = bitmapCreateScaledBitmap;
        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
            bitmapCreateBitmap.recycle();
        }
        Paint paint = new Paint();
        this.d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        StringBuilder sb = new StringBuilder("advanced_gif_false");
        Bitmap bitmap = this.b;
        sb.append(bitmap != null ? bitmap.toString() : "");
        Rect rect = this.c;
        sb.append(rect != null ? rect.toString() : "");
        String string = sb.toString();
        C0768yr.e("T500.GIF", "updateDiskCacheKey=" + string);
        messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.AbstractC0683w4
    public final Bitmap c(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap, int i, int i2) throws Throwable {
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmap2 = null;
        if (bitmap == null) {
            bitmap = null;
        } else if (bitmap.getWidth() != 1920 || bitmap.getHeight() != 720) {
            try {
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                float fMax = Math.max(1920 / width, 720 / height);
                int iRound = Math.round(width * fMax);
                int iRound2 = Math.round(height * fMax);
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, true);
                try {
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (iRound - 1920) / 2, (iRound2 - 720) / 2, 1920, 720);
                        if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmapCreateBitmap && bitmapCreateScaledBitmap != bitmap) {
                            bitmapCreateScaledBitmap.recycle();
                        }
                        bitmap = bitmapCreateBitmap;
                    } catch (OutOfMemoryError e) {
                        e = e;
                        e.printStackTrace();
                        if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmap) {
                            bitmapCreateScaledBitmap.recycle();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bitmap2 = bitmapCreateScaledBitmap;
                    if (bitmap2 != null && bitmap2 != bitmap) {
                        bitmap2.recycle();
                    }
                    throw th;
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
                bitmapCreateScaledBitmap = null;
            } catch (Throwable th2) {
                th = th2;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                throw th;
            }
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap bitmapJ = interfaceC0621u4.j(1920, 720, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapJ);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(this.b, 0.0f, 0.0f, (Paint) null);
        if (!Lf.a().d().booleanValue()) {
            if (AbstractC0390mk.l(this.e).getBoolean("extFirmware", true)) {
                this.c = new Rect(1420, 200, 1820, 600);
            } else {
                this.c = new Rect(1320, 200, 1820, 600);
            }
            canvas.drawRect(this.c, this.d);
        }
        return bitmapJ;
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K0.class != obj.getClass()) {
            return false;
        }
        K0 k0 = (K0) obj;
        return Objects.equals(this.b, k0.b) && Objects.equals(this.c, k0.c);
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return Objects.hash(this.b, this.c, Boolean.FALSE);
    }
}
