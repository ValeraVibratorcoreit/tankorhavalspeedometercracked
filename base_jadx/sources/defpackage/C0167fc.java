package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0167fc implements InterfaceC0751ya {
    public final Context a;
    public final H0 b;
    public final C0225h8 c;
    public final Object d;
    public Handler e;
    public Executor f;
    public ThreadPoolExecutor g;
    public Ud h;

    public C0167fc(Context context, H0 h0) {
        C0225h8 c0225h8 = C0198gc.d;
        this.d = new Object();
        Tf.h("Context cannot be null", context);
        this.a = context.getApplicationContext();
        this.b = h0;
        this.c = c0225h8;
    }

    @Override // defpackage.InterfaceC0751ya
    public final void a(Ud ud) {
        synchronized (this.d) {
            this.h = ud;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new T6("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new RunnableC0591t5(this, 7));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0506qc d() {
        try {
            C0225h8 c0225h8 = this.c;
            Context context = this.a;
            H0 h0 = this.b;
            c0225h8.getClass();
            Q0 q0G = F4.G(context, h0);
            int i = q0G.a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            C0506qc[] c0506qcArr = (C0506qc[]) q0G.b;
            if (c0506qcArr == null || c0506qcArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0506qcArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
