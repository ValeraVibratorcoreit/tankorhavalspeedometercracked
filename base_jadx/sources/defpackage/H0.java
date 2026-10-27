package defpackage;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {
    public final /* synthetic */ int a;
    public Object b;
    public Serializable c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ H0(boolean z) {
        this.a = 2;
    }

    public T1 a() {
        Map mapUnmodifiableMap;
        C0201gf c0201gf = (C0201gf) this.b;
        if (c0201gf == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = (String) this.c;
        C0569se c0569seB = ((Ya) this.d).b();
        C0043bb c0043bb = (C0043bb) this.e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
        byte[] bArr = Rr.a;
        Tf.j("$this$toImmutableMap", linkedHashMap);
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = Ta.a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Tf.i("Collections.unmodifiableMap(LinkedHashMap(this))", mapUnmodifiableMap);
        }
        return new T1(c0201gf, str, c0569seB, c0043bb, mapUnmodifiableMap);
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            G0 g0 = (G0) arrayList.get(i2);
            int i3 = g0.a;
            if (i3 == 8) {
                if (g(g0.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = g0.b;
                int i5 = g0.d + i4;
                while (i4 < i5) {
                    if (g(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Nl) this.e).a((G0) arrayList.get(i));
        }
        o(arrayList);
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            G0 g0 = (G0) arrayList.get(i);
            int i2 = g0.a;
            Nl nl = (Nl) this.e;
            if (i2 == 1) {
                nl.a(g0);
                nl.d(g0.b, g0.d);
            } else if (i2 == 2) {
                nl.a(g0);
                int i3 = g0.b;
                int i4 = g0.d;
                RecyclerView recyclerView = nl.a;
                recyclerView.P(i3, i4, true);
                recyclerView.f0 = true;
                recyclerView.c0.c += i4;
            } else if (i2 == 4) {
                nl.a(g0);
                nl.c(g0.b, g0.d);
            } else if (i2 == 8) {
                nl.a(g0);
                nl.e(g0.b, g0.d);
            }
        }
        o(arrayList);
    }

    public void e(G0 g0) {
        int i;
        int i2 = g0.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iP = p(g0.b, i2);
        int i3 = g0.b;
        int i4 = g0.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + g0);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < g0.d; i6++) {
            int iP2 = p((i * i6) + g0.b, g0.a);
            int i7 = g0.a;
            if (i7 == 2 ? iP2 != iP : !(i7 == 4 && iP2 == iP + 1)) {
                G0 g0K = k(i7, iP, i5);
                f(g0K, i3);
                g0K.c = null;
                ((Ok) this.b).a(g0K);
                if (g0.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iP = iP2;
            } else {
                i5++;
            }
        }
        g0.c = null;
        ((Ok) this.b).a(g0);
        if (i5 > 0) {
            G0 g0K2 = k(g0.a, iP, i5);
            f(g0K2, i3);
            g0K2.c = null;
            ((Ok) this.b).a(g0K2);
        }
    }

    public void f(G0 g0, int i) {
        Nl nl = (Nl) this.e;
        nl.a(g0);
        int i2 = g0.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            nl.c(i, g0.d);
        } else {
            int i3 = g0.d;
            RecyclerView recyclerView = nl.a;
            recyclerView.P(i, i3, true);
            recyclerView.f0 = true;
            recyclerView.c0.c += i3;
        }
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            G0 g0 = (G0) arrayList.get(i2);
            int i3 = g0.a;
            if (i3 == 8) {
                int i4 = g0.b;
                if (i4 == i) {
                    i = g0.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (g0.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = g0.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = g0.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += g0.d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean h() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void i(String str, String str2) {
        Tf.j("value", str2);
        Ya ya = (Ya) this.d;
        ya.getClass();
        Ud.j(str);
        Ud.m(str2, str);
        ya.e(str);
        ya.a(str, str2);
    }

    public void j(String str, C0043bb c0043bb) {
        Tf.j("method", str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (c0043bb == null) {
            if (!(!(str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")))) {
                throw new IllegalArgumentException(Vo.g("method ", str, " must have a request body.").toString());
            }
        } else if (!Br.W(str)) {
            throw new IllegalArgumentException(Vo.g("method ", str, " must not have a request body.").toString());
        }
        this.c = str;
        this.e = c0043bb;
    }

    public G0 k(int i, int i2, int i3) {
        G0 g0 = (G0) ((Ok) this.b).b();
        if (g0 != null) {
            g0.a = i;
            g0.b = i2;
            g0.d = i3;
            g0.c = null;
            return g0;
        }
        G0 g1 = new G0();
        g1.a = i;
        g1.b = i2;
        g1.d = i3;
        g1.c = null;
        return g1;
    }

    public void l(G0 g0) {
        ((ArrayList) this.d).add(g0);
        int i = g0.a;
        Nl nl = (Nl) this.e;
        if (i == 1) {
            nl.d(g0.b, g0.d);
            return;
        }
        if (i == 2) {
            int i2 = g0.b;
            int i3 = g0.d;
            RecyclerView recyclerView = nl.a;
            recyclerView.P(i2, i3, false);
            recyclerView.f0 = true;
            return;
        }
        if (i == 4) {
            nl.c(g0.b, g0.d);
        } else if (i == 8) {
            nl.e(g0.b, g0.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + g0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0199  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:184:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164  */
    /* JADX WARN: Code duplicated, block: B:92:0x016a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0175  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public void m() {
        byte b;
        boolean z;
        byte b2;
        G0 g0K;
        int i;
        int i2;
        int i3;
        G0 g0K2;
        boolean z2;
        boolean z3;
        G0 g0K3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList = (ArrayList) this.c;
        Vi vi = (Vi) this.f;
        vi.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                b = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((G0) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            G0 g0 = (G0) arrayList.get(size);
            G0 g1 = (G0) arrayList.get(i12);
            int i13 = g1.a;
            if (i13 != 1) {
                H0 h0 = (H0) vi.a;
                if (i13 == 2) {
                    int i14 = g0.b;
                    int i15 = g0.d;
                    if (i14 < i15) {
                        z3 = g1.b == i14 && g1.d == i15 - i14;
                        z2 = false;
                    } else if (g1.b == i15 + 1 && g1.d == i14 - i15) {
                        z3 = true;
                        z2 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    int i16 = g1.b;
                    if (i15 < i16) {
                        g1.b = i16 - 1;
                    } else {
                        int i17 = g1.d;
                        if (i15 < i16 + i17) {
                            g1.d = i17 - 1;
                            g0.a = 2;
                            g0.d = 1;
                            if (g1.d == 0) {
                                arrayList.remove(i12);
                                h0.getClass();
                                g1.c = null;
                                ((Ok) h0.b).a(g1);
                            }
                        }
                    }
                    int i18 = g0.b;
                    int i19 = g1.b;
                    if (i18 <= i19) {
                        g1.b = i19 + 1;
                    } else {
                        int i20 = i19 + g1.d;
                        if (i18 < i20) {
                            g0K3 = h0.k(2, i18 + 1, i20 - i18);
                            g1.d = g0.b - g1.b;
                        }
                        if (z3) {
                            arrayList.set(size, g1);
                            arrayList.remove(i12);
                            h0.getClass();
                            g0.c = null;
                            ((Ok) h0.b).a(g0);
                        } else {
                            if (z2) {
                                if (g0K3 != null) {
                                    i10 = g0.b;
                                    if (i10 > g0K3.b) {
                                        g0.b = i10 - g0K3.d;
                                    }
                                    i11 = g0.d;
                                    if (i11 > g0K3.b) {
                                        g0.d = i11 - g0K3.d;
                                    }
                                }
                                i8 = g0.b;
                                if (i8 > g1.b) {
                                    g0.b = i8 - g1.d;
                                }
                                i9 = g0.d;
                                if (i9 > g1.b) {
                                    g0.d = i9 - g1.d;
                                }
                            } else {
                                if (g0K3 != null) {
                                    i6 = g0.b;
                                    if (i6 >= g0K3.b) {
                                        g0.b = i6 - g0K3.d;
                                    }
                                    i7 = g0.d;
                                    if (i7 >= g0K3.b) {
                                        g0.d = i7 - g0K3.d;
                                    }
                                }
                                i4 = g0.b;
                                if (i4 >= g1.b) {
                                    g0.b = i4 - g1.d;
                                }
                                i5 = g0.d;
                                if (i5 >= g1.b) {
                                    g0.d = i5 - g1.d;
                                }
                            }
                            arrayList.set(size, g1);
                            if (g0.b != g0.d) {
                                arrayList.set(i12, g0);
                            } else {
                                arrayList.remove(i12);
                            }
                            if (g0K3 != null) {
                                arrayList.add(size, g0K3);
                            }
                        }
                    }
                    g0K3 = null;
                    if (z3) {
                        arrayList.set(size, g1);
                        arrayList.remove(i12);
                        h0.getClass();
                        g0.c = null;
                        ((Ok) h0.b).a(g0);
                    } else {
                        if (z2) {
                            if (g0K3 != null) {
                                i10 = g0.b;
                                if (i10 > g0K3.b) {
                                    g0.b = i10 - g0K3.d;
                                }
                                i11 = g0.d;
                                if (i11 > g0K3.b) {
                                    g0.d = i11 - g0K3.d;
                                }
                            }
                            i8 = g0.b;
                            if (i8 > g1.b) {
                                g0.b = i8 - g1.d;
                            }
                            i9 = g0.d;
                            if (i9 > g1.b) {
                                g0.d = i9 - g1.d;
                            }
                        } else {
                            if (g0K3 != null) {
                                i6 = g0.b;
                                if (i6 >= g0K3.b) {
                                    g0.b = i6 - g0K3.d;
                                }
                                i7 = g0.d;
                                if (i7 >= g0K3.b) {
                                    g0.d = i7 - g0K3.d;
                                }
                            }
                            i4 = g0.b;
                            if (i4 >= g1.b) {
                                g0.b = i4 - g1.d;
                            }
                            i5 = g0.d;
                            if (i5 >= g1.b) {
                                g0.d = i5 - g1.d;
                            }
                        }
                        arrayList.set(size, g1);
                        if (g0.b != g0.d) {
                            arrayList.set(i12, g0);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (g0K3 != null) {
                            arrayList.add(size, g0K3);
                        }
                    }
                } else if (i13 == 4) {
                    int i21 = g0.d;
                    int i22 = g1.b;
                    if (i21 < i22) {
                        g1.b = i22 - 1;
                    } else {
                        int i23 = g1.d;
                        if (i21 < i22 + i23) {
                            g1.d = i23 - 1;
                            g0K = h0.k(4, g0.b, 1);
                        }
                        i = g0.b;
                        i2 = g1.b;
                        if (i <= i2) {
                            g1.b = i2 + 1;
                        } else {
                            i3 = i2 + g1.d;
                            if (i < i3) {
                                int i24 = i3 - i;
                                g0K2 = h0.k(4, i + 1, i24);
                                g1.d -= i24;
                            }
                            arrayList.set(i12, g0);
                            if (g1.d > 0) {
                                arrayList.set(size, g1);
                            } else {
                                arrayList.remove(size);
                                h0.getClass();
                                g1.c = null;
                                ((Ok) h0.b).a(g1);
                            }
                            if (g0K != null) {
                                arrayList.add(size, g0K);
                            }
                            if (g0K2 != null) {
                                arrayList.add(size, g0K2);
                            }
                        }
                        g0K2 = null;
                        arrayList.set(i12, g0);
                        if (g1.d > 0) {
                            arrayList.set(size, g1);
                        } else {
                            arrayList.remove(size);
                            h0.getClass();
                            g1.c = null;
                            ((Ok) h0.b).a(g1);
                        }
                        if (g0K != null) {
                            arrayList.add(size, g0K);
                        }
                        if (g0K2 != null) {
                            arrayList.add(size, g0K2);
                        }
                    }
                    g0K = null;
                    i = g0.b;
                    i2 = g1.b;
                    if (i <= i2) {
                        g1.b = i2 + 1;
                    } else {
                        i3 = i2 + g1.d;
                        if (i < i3) {
                            int i25 = i3 - i;
                            g0K2 = h0.k(4, i + 1, i25);
                            g1.d -= i25;
                        }
                        arrayList.set(i12, g0);
                        if (g1.d > 0) {
                            arrayList.set(size, g1);
                        } else {
                            arrayList.remove(size);
                            h0.getClass();
                            g1.c = null;
                            ((Ok) h0.b).a(g1);
                        }
                        if (g0K != null) {
                            arrayList.add(size, g0K);
                        }
                        if (g0K2 != null) {
                            arrayList.add(size, g0K2);
                        }
                    }
                    g0K2 = null;
                    arrayList.set(i12, g0);
                    if (g1.d > 0) {
                        arrayList.set(size, g1);
                    } else {
                        arrayList.remove(size);
                        h0.getClass();
                        g1.c = null;
                        ((Ok) h0.b).a(g1);
                    }
                    if (g0K != null) {
                        arrayList.add(size, g0K);
                    }
                    if (g0K2 != null) {
                        arrayList.add(size, g0K2);
                    }
                }
            } else {
                int i26 = g0.d;
                int i27 = g1.b;
                int i28 = i26 < i27 ? -1 : 0;
                int i29 = g0.b;
                if (i29 < i27) {
                    i28++;
                }
                if (i27 <= i29) {
                    g0.b = i29 + g1.d;
                }
                int i30 = g1.b;
                if (i30 <= i26) {
                    g0.d = i26 + g1.d;
                }
                g1.b = i30 + i28;
                arrayList.set(size, g1);
                arrayList.set(i12, g0);
            }
        }
        int size2 = arrayList.size();
        int i31 = 0;
        while (i31 < size2) {
            G0 g0K4 = (G0) arrayList.get(i31);
            int i32 = g0K4.a;
            if (i32 != 1) {
                Nl nl = (Nl) this.e;
                if (i32 == 2) {
                    int i33 = g0K4.b;
                    int i34 = g0K4.d + i33;
                    int i35 = i33;
                    int i36 = 0;
                    byte b3 = -1;
                    while (i35 < i34) {
                        if (nl.b(i35) != null || b(i35)) {
                            if (b3 == 0) {
                                e(k(2, i33, i36));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                l(k(2, i33, i36));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i35 -= i36;
                            i34 -= i36;
                            i36 = 1;
                        } else {
                            i36++;
                        }
                        i35++;
                        b3 = b2;
                    }
                    if (i36 != g0K4.d) {
                        g0K4.c = null;
                        ((Ok) this.b).a(g0K4);
                        g0K4 = k(2, i33, i36);
                    }
                    if (b3 == 0) {
                        e(g0K4);
                    } else {
                        l(g0K4);
                    }
                } else if (i32 == 4) {
                    int i37 = g0K4.b;
                    int i38 = g0K4.d + i37;
                    int i39 = i37;
                    int i40 = 0;
                    while (i37 < i38) {
                        if (nl.b(i37) != null || b(i37)) {
                            if (b == 0) {
                                e(k(4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                l(k(4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            b = 0;
                        }
                        i40++;
                        i37++;
                    }
                    if (i40 != g0K4.d) {
                        g0K4.c = null;
                        ((Ok) this.b).a(g0K4);
                        g0K4 = k(4, i39, i40);
                    }
                    if (b == 0) {
                        e(g0K4);
                    } else {
                        l(g0K4);
                    }
                } else if (i32 == 8) {
                    l(g0K4);
                }
            } else {
                l(g0K4);
            }
            i31++;
            b = -1;
        }
        arrayList.clear();
    }

    public void n(G0 g0) {
        g0.c = null;
        ((Ok) this.b).a(g0);
    }

    public void o(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n((G0) list.get(i));
        }
        list.clear();
    }

    public int p(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            G0 g0 = (G0) arrayList.get(size);
            int i5 = g0.a;
            if (i5 == 8) {
                int i6 = g0.b;
                int i7 = g0.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            g0.b = i6 + 1;
                            g0.d = i7 + 1;
                        } else if (i2 == 2) {
                            g0.b = i6 - 1;
                            g0.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        g0.d = i7 + 1;
                    } else if (i2 == 2) {
                        g0.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        g0.b = i6 + 1;
                    } else if (i2 == 2) {
                        g0.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = g0.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= g0.d;
                    } else if (i5 == 2) {
                        i += g0.d;
                    }
                } else if (i2 == 1) {
                    g0.b = i8 + 1;
                } else if (i2 == 2) {
                    g0.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            G0 g1 = (G0) arrayList.get(size2);
            if (g1.a == 8) {
                int i9 = g1.d;
                if (i9 == g1.b || i9 < 0) {
                    arrayList.remove(size2);
                    g1.c = null;
                    ((Ok) this.b).a(g1);
                }
            } else if (g1.d <= 0) {
                arrayList.remove(size2);
                g1.c = null;
                ((Ok) this.b).a(g1);
            }
        }
        return i;
    }

    public void q(String str) {
        Tf.j("url", str);
        if (Mp.U0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring);
            str = "http:".concat(strSubstring);
        } else if (Mp.U0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring2);
            str = "https:".concat(strSubstring2);
        }
        Tf.j("$this$toHttpUrl", str);
        C0170ff c0170ff = new C0170ff();
        c0170ff.d(null, str);
        this.b = c0170ff.a();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.b) + ", mProviderPackage: " + ((String) this.c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.e;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public H0(String str, String str2, String str3, List list) {
        this.a = 1;
        str.getClass();
        this.b = str;
        str2.getClass();
        this.c = str2;
        this.d = str3;
        list.getClass();
        this.e = list;
        this.f = str + "-" + str2 + "-" + str3;
    }

    public H0(Nl nl) {
        this.a = 0;
        this.b = new Ok(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = nl;
        this.f = new Vi(this);
    }

    public H0() {
        this.a = 2;
        this.f = new LinkedHashMap();
        this.c = "GET";
        this.d = new Ya(1);
    }
}
