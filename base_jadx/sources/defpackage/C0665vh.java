package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665vh implements InterfaceC0621u4 {
    public static final Bitmap.Config j = Bitmap.Config.ARGB_8888;
    public final InterfaceC0789zh a;
    public final Set b;
    public final C0387mh c;
    public final long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;

    public C0665vh(long j2) {
        Po po = new Po();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j2;
        this.a = po;
        this.b = setUnmodifiableSet;
        this.c = new C0387mh(1);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + this.a);
    }

    public final synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = ((Po) this.a).b(i, i2, config != null ? config : j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((Po) this.a).getClass();
                    sb.append(Po.c(Qr.d(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.g++;
            } else {
                this.f++;
                long j2 = this.e;
                ((Po) this.a).getClass();
                this.e = j2 - ((long) Qr.c(bitmapB));
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((Po) this.a).getClass();
                sb2.append(Po.c(Qr.d(config) * i * i2, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void c(long j2) {
        while (this.e > j2) {
            try {
                Po po = (Po) this.a;
                Bitmap bitmap = (Bitmap) po.b.V();
                if (bitmap != null) {
                    po.a(Integer.valueOf(Qr.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.e = 0L;
                    return;
                }
                this.c.getClass();
                long j3 = this.e;
                ((Po) this.a).getClass();
                this.e = j3 - ((long) Qr.c(bitmap));
                this.i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    ((Po) this.a).getClass();
                    sb.append(Po.c(Qr.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0621u4
    public final void e(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            l();
        } else if (i >= 20 || i == 15) {
            c(this.d / 2);
        }
    }

    @Override // defpackage.InterfaceC0621u4
    public final Bitmap h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC0621u4
    public final Bitmap j(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC0621u4
    public final synchronized void k(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((Po) this.a).getClass();
                if (Qr.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    ((Po) this.a).getClass();
                    int iC = Qr.c(bitmap);
                    ((Po) this.a).e(bitmap);
                    this.c.getClass();
                    this.h++;
                    this.e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        ((Po) this.a).getClass();
                        sb.append(Po.c(Qr.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    c(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                ((Po) this.a).getClass();
                sb2.append(Po.c(Qr.c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0621u4
    public final void l() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        c(0L);
    }
}
