package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X7 implements InterfaceC0071c8, Z7 {
    public final List a;
    public final C0409n8 b;
    public final InterfaceC0040b8 c;
    public int d = -1;
    public InterfaceC0171fg e;
    public List f;
    public int g;
    public volatile Wi h;
    public File i;

    public X7(List list, C0409n8 c0409n8, InterfaceC0040b8 interfaceC0040b8) {
        this.a = list;
        this.b = c0409n8;
        this.c = interfaceC0040b8;
    }

    @Override // defpackage.InterfaceC0071c8
    public final boolean b() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    Xi xi = (Xi) list2.get(i);
                    File file = this.i;
                    C0409n8 c0409n8 = this.b;
                    this.h = xi.b(file, c0409n8.e, c0409n8.f, c0409n8.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.d(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            InterfaceC0171fg interfaceC0171fg = (InterfaceC0171fg) this.a.get(this.d);
            C0409n8 c0409n9 = this.b;
            File fileC = c0409n9.h.a().c(new Y7(interfaceC0171fg, c0409n9.n));
            this.i = fileC;
            if (fileC != null) {
                this.e = interfaceC0171fg;
                this.f = this.b.c.a().f(fileC);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC0071c8
    public final void cancel() {
        Wi wi = this.h;
        if (wi != null) {
            wi.c.cancel();
        }
    }

    @Override // defpackage.Z7
    public final void h(Exception exc) {
        this.c.a(this.e, exc, this.h.c, 3);
    }

    @Override // defpackage.Z7
    public final void m(Object obj) {
        this.c.c(this.e, obj, this.h.c, 3, this.e);
    }
}
