package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Jm implements InterfaceC0071c8, Z7 {
    public final InterfaceC0040b8 a;
    public final C0409n8 b;
    public int c;
    public int d = -1;
    public InterfaceC0171fg e;
    public List f;
    public int g;
    public volatile Wi h;
    public File i;
    public Km j;

    public Jm(C0409n8 c0409n8, InterfaceC0040b8 interfaceC0040b8) {
        this.b = c0409n8;
        this.a = interfaceC0040b8;
    }

    @Override // defpackage.InterfaceC0071c8
    public final boolean b() {
        ArrayList arrayListA = this.b.a();
        boolean z = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        List listD = this.b.d();
        if (listD.isEmpty()) {
            if (File.class.equals(this.b.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.b.d.getClass() + " to " + this.b.k);
        }
        while (true) {
            List list = this.f;
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
            if (i2 >= listD.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= arrayListA.size()) {
                    return false;
                }
                this.d = 0;
            }
            InterfaceC0171fg interfaceC0171fg = (InterfaceC0171fg) arrayListA.get(this.c);
            Class cls = (Class) listD.get(this.d);
            InterfaceC0182fr interfaceC0182frF = this.b.f(cls);
            C0409n8 c0409n9 = this.b;
            this.j = new Km(c0409n9.c.a, interfaceC0171fg, c0409n9.n, c0409n9.e, c0409n9.f, interfaceC0182frF, cls, c0409n9.i);
            File fileC = c0409n9.h.a().c(this.j);
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
        this.a.a(this.j, exc, this.h.c, 4);
    }

    @Override // defpackage.Z7
    public final void m(Object obj) {
        this.a.c(this.e, obj, this.h.c, 4, this.j);
    }
}
