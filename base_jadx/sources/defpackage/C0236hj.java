package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236hj implements InterfaceC0009a8, Z7 {
    public final List a;
    public final Nk b;
    public int c;
    public Uk d;
    public Z7 e;
    public List f;
    public boolean g;

    public C0236hj(ArrayList arrayList, Nk nk) {
        this.b = nk;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.InterfaceC0009a8
    public final Class a() {
        return ((InterfaceC0009a8) this.a.get(0)).a();
    }

    public final void b() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            d(this.d, this.e);
        } else {
            Ud.k(this.f);
            this.e.h(new Xd("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        List list = this.f;
        if (list != null) {
            this.b.a(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0009a8) it.next()).c();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0009a8) it.next()).cancel();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) {
        this.d = uk;
        this.e = z7;
        this.f = (List) this.b.b();
        ((InterfaceC0009a8) this.a.get(this.c)).d(uk, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        return ((InterfaceC0009a8) this.a.get(0)).e();
    }

    @Override // defpackage.Z7
    public final void h(Exception exc) {
        List list = this.f;
        Ud.l("Argument must not be null", list);
        list.add(exc);
        b();
    }

    @Override // defpackage.Z7
    public final void m(Object obj) {
        if (obj != null) {
            this.e.m(obj);
        } else {
            b();
        }
    }
}
