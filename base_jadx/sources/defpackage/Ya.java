package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Ya {
    public final ArrayList a;

    public Ya(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList(20);
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = new ArrayList();
                break;
            case 4:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a(String str, String str2) {
        Tf.j("name", str);
        Tf.j("value", str2);
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(Mp.W0(str2).toString());
    }

    public C0569se b() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new C0569se((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public synchronized Qm c(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Rm rm = (Rm) this.a.get(i);
            if (rm.a.isAssignableFrom(cls)) {
                return rm.b;
            }
        }
        return null;
    }

    public synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C0151er c0151er : this.a) {
            if (c0151er.a.isAssignableFrom(cls) && cls2.isAssignableFrom(c0151er.b) && !arrayList.contains(c0151er.b)) {
                arrayList.add(c0151er.b);
            }
        }
        return arrayList;
    }

    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
