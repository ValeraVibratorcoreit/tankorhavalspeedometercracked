package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class Yo implements InterfaceC0071c8, InterfaceC0040b8 {
    public final C0409n8 a;
    public final InterfaceC0040b8 b;
    public volatile int c;
    public volatile X7 d;
    public volatile Object e;
    public volatile Wi f;
    public volatile Y7 g;

    public Yo(C0409n8 c0409n8, InterfaceC0040b8 interfaceC0040b8) {
        this.a = c0409n8;
        this.b = interfaceC0040b8;
    }

    @Override // defpackage.InterfaceC0040b8
    public final void a(InterfaceC0171fg interfaceC0171fg, Exception exc, InterfaceC0009a8 interfaceC0009a8, int i) {
        this.b.a(interfaceC0171fg, exc, interfaceC0009a8, this.f.c.e());
    }

    @Override // defpackage.InterfaceC0071c8
    public final boolean b() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.d != null && this.d.b()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && this.c < this.a.b().size()) {
            ArrayList arrayListB = this.a.b();
            int i = this.c;
            this.c = i + 1;
            this.f = (Wi) arrayListB.get(i);
            if (this.f != null && (this.a.p.c(this.f.c.e()) || this.a.c(this.f.c.a()) != null)) {
                this.f.c.d(this.a.o, new C0096d2(29, this, this.f, false));
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0040b8
    public final void c(InterfaceC0171fg interfaceC0171fg, Object obj, InterfaceC0009a8 interfaceC0009a8, int i, InterfaceC0171fg interfaceC0171fg2) {
        this.b.c(interfaceC0171fg, obj, interfaceC0009a8, this.f.c.e(), interfaceC0171fg);
    }

    @Override // defpackage.InterfaceC0071c8
    public final void cancel() {
        Wi wi = this.f;
        if (wi != null) {
            wi.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC0040b8
    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) throws Throwable {
        int i = AbstractC0449oh.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC0132e8 interfaceC0132e8G = this.a.c.a().g(obj);
            Object objF = interfaceC0132e8G.f();
            Wa waE = this.a.e(objF);
            K2 k2 = new K2(waE, objF, this.a.i, 7);
            InterfaceC0171fg interfaceC0171fg = this.f.a;
            C0409n8 c0409n8 = this.a;
            Y7 y7 = new Y7(interfaceC0171fg, c0409n8.n);
            InterfaceC0286j9 interfaceC0286j9A = c0409n8.h.a();
            interfaceC0286j9A.b(y7, k2);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + y7 + ", data: " + obj + ", encoder: " + waE + ", duration: " + AbstractC0449oh.a(jElapsedRealtimeNanos));
            }
            if (interfaceC0286j9A.c(y7) != null) {
                this.g = y7;
                this.d = new X7(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.c(this.f.a, interfaceC0132e8G.f(), this.f.c, this.f.c.e(), this.f.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f.c.c();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
