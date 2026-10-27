package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0533r9 implements InterfaceC0286j9 {
    public final File b;
    public C0503q9 e;
    public final C0096d2 d = new C0096d2(12);
    public final long c = 262144000;
    public final C0096d2 a = new C0096d2(28);

    public C0533r9(File file) {
        this.b = file;
    }

    public final synchronized C0503q9 a() {
        try {
            if (this.e == null) {
                this.e = C0503q9.C(this.b, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    @Override // defpackage.InterfaceC0286j9
    public final void b(InterfaceC0171fg interfaceC0171fg, K2 k2) {
        C0348l9 c0348l9;
        String strL = this.a.L(interfaceC0171fg);
        C0096d2 c0096d2 = this.d;
        synchronized (c0096d2) {
            c0348l9 = (C0348l9) ((HashMap) c0096d2.b).get(strL);
            if (c0348l9 == null) {
                X4 x4 = (X4) c0096d2.c;
                synchronized (x4.a) {
                    c0348l9 = (C0348l9) x4.a.poll();
                }
                if (c0348l9 == null) {
                    c0348l9 = new C0348l9();
                }
                ((HashMap) c0096d2.b).put(strL, c0348l9);
            }
            c0348l9.b++;
        }
        c0348l9.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strL + " for for Key: " + interfaceC0171fg);
            }
            try {
                C0503q9 c0503q9A = a();
                if (c0503q9A.A(strL) != null) {
                    this.d.U(strL);
                    return;
                }
                C0441o9 c0441o9Y = c0503q9A.y(strL);
                if (c0441o9Y == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strL));
                }
                try {
                    if (((Wa) k2.b).d(k2.c, c0441o9Y.b(), (C0544rk) k2.d)) {
                        C0503q9.n((C0503q9) c0441o9Y.d, c0441o9Y, true);
                        c0441o9Y.a = true;
                    }
                    if (!c0441o9Y.a) {
                        try {
                            c0441o9Y.a();
                        } catch (IOException unused) {
                        }
                    }
                    this.d.U(strL);
                } catch (Throwable th) {
                    if (!c0441o9Y.a) {
                        try {
                            c0441o9Y.a();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } catch (Throwable th2) {
            this.d.U(strL);
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC0286j9
    public final File c(InterfaceC0171fg interfaceC0171fg) {
        String strL = this.a.L(interfaceC0171fg);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strL + " for for Key: " + interfaceC0171fg);
        }
        try {
            C0308k0 c0308k0A = a().A(strL);
            if (c0308k0A != null) {
                return ((File[]) c0308k0A.b)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
