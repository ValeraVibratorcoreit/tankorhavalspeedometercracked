package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0577sm {
    public final C0096d2 a;
    public final Ya b;
    public final C0096d2 c;
    public final Ya d;
    public final C0163f8 e;
    public final Ya f;
    public final Ya g;
    public final C0096d2 h = new C0096d2(25);
    public final C0203gh i = new C0203gh();
    public final K2 j;

    public C0577sm() {
        K2 k2 = new K2(new Pk(20), new C0225h8(15), new C0225h8(16));
        this.j = k2;
        this.a = new C0096d2(k2);
        this.b = new Ya(0);
        this.c = new C0096d2(27);
        this.d = new Ya(3);
        this.e = new C0163f8(0);
        this.f = new Ya(4);
        this.g = new Ya(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0096d2 c0096d2 = this.c;
        synchronized (c0096d2) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c0096d2.b);
                ((ArrayList) c0096d2.b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c0096d2.b).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0096d2.b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Wa wa) {
        Ya ya = this.b;
        synchronized (ya) {
            ya.a.add(new Xa(cls, wa));
        }
    }

    public final void b(Class cls, Qm qm) {
        Ya ya = this.d;
        synchronized (ya) {
            ya.a.add(new Rm(cls, qm));
        }
    }

    public final void c(Class cls, Class cls2, Yi yi) {
        C0096d2 c0096d2 = this.a;
        synchronized (c0096d2) {
            C0296jj c0296jj = (C0296jj) c0096d2.b;
            synchronized (c0296jj) {
                C0266ij c0266ij = new C0266ij(cls, cls2, yi);
                ArrayList arrayList = (ArrayList) c0296jj.a;
                arrayList.add(arrayList.size(), c0266ij);
            }
            ((C0163f8) c0096d2.c).a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, Mm mm) {
        C0096d2 c0096d2 = this.c;
        synchronized (c0096d2) {
            c0096d2.J(str).add(new Nm(cls, cls2, mm));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        Ya ya = this.g;
        synchronized (ya) {
            arrayList = ya.a;
        }
        if (arrayList.isEmpty()) {
            throw new C0546rm("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        C0096d2 c0096d2 = this.a;
        c0096d2.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0096d2) {
            Zi zi = (Zi) ((C0163f8) c0096d2.c).a.get(cls);
            listUnmodifiableList = zi == null ? null : zi.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C0296jj) c0096d2.b).f(cls));
                if (((Zi) ((C0163f8) c0096d2.c).a.put(cls, new Zi(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C0546rm("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            Xi xi = (Xi) listUnmodifiableList.get(i);
            if (xi.a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                    z = false;
                }
                listEmptyList.add(xi);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new C0546rm("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final InterfaceC0132e8 g(Object obj) {
        InterfaceC0132e8 interfaceC0132e8B;
        C0163f8 c0163f8 = this.e;
        synchronized (c0163f8) {
            try {
                Ud.k(obj);
                InterfaceC0102d8 interfaceC0102d8 = (InterfaceC0102d8) c0163f8.a.get(obj.getClass());
                if (interfaceC0102d8 == null) {
                    for (InterfaceC0102d8 interfaceC0102d9 : c0163f8.a.values()) {
                        if (interfaceC0102d9.a().isAssignableFrom(obj.getClass())) {
                            interfaceC0102d8 = interfaceC0102d9;
                            break;
                        }
                    }
                }
                if (interfaceC0102d8 == null) {
                    interfaceC0102d8 = C0163f8.b;
                }
                interfaceC0132e8B = interfaceC0102d8.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0132e8B;
    }

    public final void h(InterfaceC0102d8 interfaceC0102d8) {
        C0163f8 c0163f8 = this.e;
        synchronized (c0163f8) {
            c0163f8.a.put(interfaceC0102d8.a(), interfaceC0102d8);
        }
    }

    public final void i(Class cls, Class cls2, Um um) {
        Ya ya = this.f;
        synchronized (ya) {
            ya.a.add(new C0151er(cls, cls2, um));
        }
    }
}
