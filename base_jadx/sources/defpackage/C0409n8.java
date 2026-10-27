package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0409n8 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public Vd c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public G7 h;
    public C0544rk i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public InterfaceC0171fg n;
    public Uk o;
    public C0317k9 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                Wi wi = (Wi) arrayListB.get(i);
                if (!arrayList.contains(wi.a)) {
                    arrayList.add(wi.a);
                }
                int i2 = 0;
                while (true) {
                    List list = wi.b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                Wi wiB = ((Xi) listF.get(i)).b(this.d, this.e, this.f, this.i);
                if (wiB != null) {
                    arrayList.add(wiB);
                }
            }
        }
        return arrayList;
    }

    public final C0172fh c(Class cls) {
        C0172fh c0172fh;
        ArrayList arrayList;
        Um um;
        C0577sm c0577smA = this.c.a();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C0203gh c0203gh = c0577smA.i;
        C0205gj c0205gj = (C0205gj) c0203gh.b.getAndSet(null);
        if (c0205gj == null) {
            c0205gj = new C0205gj();
        }
        c0205gj.a = cls;
        c0205gj.b = cls2;
        c0205gj.c = cls3;
        synchronized (c0203gh.a) {
            c0172fh = (C0172fh) c0203gh.a.getOrDefault(c0205gj, null);
        }
        c0203gh.b.set(c0205gj);
        c0577smA.i.getClass();
        if (C0203gh.c.equals(c0172fh)) {
            return null;
        }
        if (c0172fh != null) {
            return c0172fh;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : c0577smA.c.K(cls, cls2)) {
            for (Class cls5 : c0577smA.f.d(cls4, cls3)) {
                C0096d2 c0096d2 = c0577smA.c;
                synchronized (c0096d2) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c0096d2.b).iterator();
                    while (it.hasNext()) {
                        List<Nm> list = (List) ((HashMap) c0096d2.c).get((String) it.next());
                        if (list != null) {
                            for (Nm nm : list) {
                                if (nm.a.isAssignableFrom(cls) && cls4.isAssignableFrom(nm.b)) {
                                    arrayList.add(nm.c);
                                }
                            }
                        }
                    }
                }
                Ya ya = c0577smA.f;
                synchronized (ya) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        Iterator it2 = ya.a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                            }
                            C0151er c0151er = (C0151er) it2.next();
                            if (c0151er.a.isAssignableFrom(cls4) && cls5.isAssignableFrom(c0151er.b)) {
                                um = c0151er.c;
                                break;
                            }
                        }
                    } else {
                        um = C0473pa.o;
                    }
                }
                arrayList2.add(new C0502q8(cls, cls4, cls5, arrayList, um, c0577smA.j));
            }
        }
        C0172fh c0172fh2 = arrayList2.isEmpty() ? null : new C0172fh(cls, cls2, cls3, arrayList2, c0577smA.j);
        C0203gh c0203gh2 = c0577smA.i;
        synchronized (c0203gh2.a) {
            c0203gh2.a.put(new C0205gj(cls, cls2, cls3), c0172fh2 != null ? c0172fh2 : C0203gh.c);
        }
        return c0172fh2;
    }

    public final List d() {
        List list;
        ArrayList arrayListQ;
        C0577sm c0577smA = this.c.a();
        Class<?> cls = this.d.getClass();
        Class cls2 = this.g;
        Class cls3 = this.k;
        C0096d2 c0096d2 = c0577smA.h;
        C0205gj c0205gj = (C0205gj) ((AtomicReference) c0096d2.b).getAndSet(null);
        if (c0205gj == null) {
            c0205gj = new C0205gj(cls, cls2, cls3);
        } else {
            c0205gj.a = cls;
            c0205gj.b = cls2;
            c0205gj.c = cls3;
        }
        synchronized (((C0066c3) c0096d2.c)) {
            list = (List) ((C0066c3) c0096d2.c).getOrDefault(c0205gj, null);
        }
        ((AtomicReference) c0096d2.b).set(c0205gj);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            C0096d2 c0096d3 = c0577smA.a;
            synchronized (c0096d3) {
                arrayListQ = ((C0296jj) c0096d3.b).q(cls);
            }
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                for (Class cls4 : c0577smA.c.K((Class) it.next(), cls2)) {
                    if (!c0577smA.f.d(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            C0096d2 c0096d4 = c0577smA.h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C0066c3) c0096d4.c)) {
                ((C0066c3) c0096d4.c).put(new C0205gj(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    public final Wa e(Object obj) {
        Wa wa;
        Ya ya = this.c.a().b;
        Class<?> cls = obj.getClass();
        synchronized (ya) {
            Iterator it = ya.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wa = null;
                    break;
                }
                Xa xa = (Xa) it.next();
                if (xa.a.isAssignableFrom(cls)) {
                    wa = xa.b;
                    break;
                }
            }
        }
        if (wa != null) {
            return wa;
        }
        throw new C0546rm("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final InterfaceC0182fr f(Class cls) {
        InterfaceC0182fr interfaceC0182fr = (InterfaceC0182fr) this.j.get(cls);
        if (interfaceC0182fr == null) {
            for (Map.Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC0182fr = (InterfaceC0182fr) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC0182fr != null) {
            return interfaceC0182fr;
        }
        if (!this.j.isEmpty() || !this.q) {
            return Ir.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
