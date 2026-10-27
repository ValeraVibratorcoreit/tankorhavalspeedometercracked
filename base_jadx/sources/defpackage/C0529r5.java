package defpackage;

/* JADX INFO: renamed from: r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529r5 {
    public boolean a;
    public InterfaceC0499q5 b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                InterfaceC0499q5 interfaceC0499q5 = this.b;
                if (interfaceC0499q5 != null) {
                    try {
                        interfaceC0499q5.k();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(InterfaceC0499q5 interfaceC0499q5) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b == interfaceC0499q5) {
                return;
            }
            this.b = interfaceC0499q5;
            if (this.a) {
                interfaceC0499q5.k();
            }
        }
    }
}
