package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0569se implements Iterable, InterfaceC0110dg {
    public final String[] a;

    public C0569se(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        Tf.j("name", str);
        String[] strArr = this.a;
        Nf nfM = Td.M(new Nf(strArr.length - 2, 0, -1), 2);
        int i = nfM.a;
        int i2 = nfM.b;
        int i3 = nfM.c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!str.equalsIgnoreCase(strArr[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final Ya c() {
        Ya ya = new Ya(1);
        ArrayList arrayList = ya.a;
        Tf.j("<this>", arrayList);
        String[] strArr = this.a;
        Tf.j("elements", strArr);
        List listAsList = Arrays.asList(strArr);
        Tf.i("asList(this)", listAsList);
        arrayList.addAll(listAsList);
        return ya;
    }

    public final String d(int i) {
        return this.a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0569se) {
            if (Arrays.equals(this.a, ((C0569se) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0761yk[] c0761ykArr = new C0761yk[size];
        for (int i = 0; i < size; i++) {
            c0761ykArr[i] = new C0761yk(b(i), d(i));
        }
        return new C0307k(c0761ykArr, 1);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(b(i));
            sb.append(": ");
            sb.append(d(i));
            sb.append("\n");
        }
        String string = sb.toString();
        Tf.i("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
