package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y4 implements Mm {
    public static final C0473pa f = new C0473pa(24);
    public static final X4 g = new X4(0);
    public final Context a;
    public final List b;
    public final X4 c;
    public final C0473pa d;
    public final C0096d2 e;

    public Y4(Context context, ArrayList arrayList, InterfaceC0621u4 interfaceC0621u4, C0634uh c0634uh) {
        C0473pa c0473pa = f;
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = c0473pa;
        this.e = new C0096d2(interfaceC0621u4, 17, c0634uh);
        this.c = g;
    }

    public static int d(Qd qd, int i, int i2) {
        int iMin = Math.min(qd.g / i2, qd.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + qd.f + "x" + qd.g + "]");
        }
        return iMax;
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        Rd rd;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        X4 x4 = this.c;
        synchronized (x4) {
            try {
                Rd rd2 = (Rd) x4.a.poll();
                if (rd2 == null) {
                    rd2 = new Rd();
                }
                rd = rd2;
                rd.b = null;
                Arrays.fill(rd.a, (byte) 0);
                rd.c = new Qd();
                rd.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                rd.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                rd.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, rd, c0544rk);
        } finally {
            this.c.a(rd);
        }
    }

    @Override // defpackage.Mm
    public final boolean b(Object obj, C0544rk c0544rk) {
        return !((Boolean) c0544rk.c(Sd.b)).booleanValue() && Td.u(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final Jd c(ByteBuffer byteBuffer, int i, int i2, Rd rd, C0544rk c0544rk) throws Throwable {
        Bitmap.Config config;
        int i3 = AbstractC0449oh.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i4 = 2;
        try {
            Qd qdB = rd.b();
            if (qdB.c > 0 && qdB.b == 0) {
                if (c0544rk.c(Sd.a) == EnumC0378m8.b) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int iD = d(qdB, i, i2);
                C0473pa c0473pa = this.d;
                C0096d2 c0096d2 = this.e;
                c0473pa.getClass();
                C0580sp c0580sp = new C0580sp(c0096d2, qdB, byteBuffer, iD);
                c0580sp.c(config);
                c0580sp.k = (c0580sp.k + 1) % c0580sp.l.c;
                Bitmap bitmapB = c0580sp.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC0449oh.a(jElapsedRealtimeNanos));
                    }
                    return null;
                }
                Jd jd = new Jd(new Id(new C0278j1(new Pd(a.a(this.a), c0580sp, i, i2, bitmapB), 1)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC0449oh.a(jElapsedRealtimeNanos));
                }
                return jd;
                if (Log.isLoggable("BufferGifDecoder", i4)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC0449oh.a(jElapsedRealtimeNanos));
                }
                throw th;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC0449oh.a(jElapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i4 = 2;
        }
    }
}
