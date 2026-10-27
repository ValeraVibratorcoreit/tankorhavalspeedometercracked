package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Oc {
    public K2 A;
    public K2 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public Rc L;
    public final RunnableC0524r0 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public C0021ak g;
    public final C0096d2 l;
    public final CopyOnWriteArrayList m;
    public final Fc n;
    public final Fc o;
    public final Fc p;
    public final Fc q;
    public final Ic r;
    public int s;
    public Bc t;
    public Br u;
    public AbstractComponentCallbacksC0784zc v;
    public AbstractComponentCallbacksC0784zc w;
    public final Jc x;
    public final C0225h8 y;
    public K2 z;
    public final ArrayList a = new ArrayList();
    public final C0296jj c = new C0296jj(5);
    public final Ec f = new Ec(this);
    public final Hc h = new Hc(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Fc] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Fc] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Fc] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Fc] */
    public Oc() {
        Collections.synchronizedMap(new HashMap());
        this.l = new C0096d2(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new InterfaceC0748y7(this) { // from class: Fc
            public final /* synthetic */ Oc b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0748y7
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Oc oc = this.b;
                        if (oc.H()) {
                            oc.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Oc oc2 = this.b;
                        if (oc2.H() && num.intValue() == 80) {
                            oc2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0327kj c0327kj = (C0327kj) obj;
                        Oc oc3 = this.b;
                        if (oc3.H()) {
                            oc3.m(c0327kj.a, false);
                        }
                        break;
                    default:
                        Fk fk = (Fk) obj;
                        Oc oc4 = this.b;
                        if (oc4.H()) {
                            oc4.r(fk.a, false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new InterfaceC0748y7(this) { // from class: Fc
            public final /* synthetic */ Oc b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0748y7
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Oc oc = this.b;
                        if (oc.H()) {
                            oc.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Oc oc2 = this.b;
                        if (oc2.H() && num.intValue() == 80) {
                            oc2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0327kj c0327kj = (C0327kj) obj;
                        Oc oc3 = this.b;
                        if (oc3.H()) {
                            oc3.m(c0327kj.a, false);
                        }
                        break;
                    default:
                        Fk fk = (Fk) obj;
                        Oc oc4 = this.b;
                        if (oc4.H()) {
                            oc4.r(fk.a, false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new InterfaceC0748y7(this) { // from class: Fc
            public final /* synthetic */ Oc b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0748y7
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Oc oc = this.b;
                        if (oc.H()) {
                            oc.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Oc oc2 = this.b;
                        if (oc2.H() && num.intValue() == 80) {
                            oc2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0327kj c0327kj = (C0327kj) obj;
                        Oc oc3 = this.b;
                        if (oc3.H()) {
                            oc3.m(c0327kj.a, false);
                        }
                        break;
                    default:
                        Fk fk = (Fk) obj;
                        Oc oc4 = this.b;
                        if (oc4.H()) {
                            oc4.r(fk.a, false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new InterfaceC0748y7(this) { // from class: Fc
            public final /* synthetic */ Oc b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0748y7
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Oc oc = this.b;
                        if (oc.H()) {
                            oc.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Oc oc2 = this.b;
                        if (oc2.H() && num.intValue() == 80) {
                            oc2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0327kj c0327kj = (C0327kj) obj;
                        Oc oc3 = this.b;
                        if (oc3.H()) {
                            oc3.m(c0327kj.a, false);
                        }
                        break;
                    default:
                        Fk fk = (Fk) obj;
                        Oc oc4 = this.b;
                        if (oc4.H()) {
                            oc4.r(fk.a, false);
                        }
                        break;
                }
            }
        };
        this.r = new Ic(this);
        this.s = -1;
        this.x = new Jc(this);
        this.y = new C0225h8(21);
        this.C = new ArrayDeque();
        this.M = new RunnableC0524r0(this, 8);
    }

    public static boolean G(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        abstractComponentCallbacksC0784zc.getClass();
        boolean zG = false;
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 : abstractComponentCallbacksC0784zc.t.c.p()) {
            if (abstractComponentCallbacksC0784zc2 != null) {
                zG = G(abstractComponentCallbacksC0784zc2);
            }
            if (zG) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (abstractComponentCallbacksC0784zc == null) {
            return true;
        }
        return abstractComponentCallbacksC0784zc.B && (abstractComponentCallbacksC0784zc.r == null || I(abstractComponentCallbacksC0784zc.u));
    }

    public static boolean J(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (abstractComponentCallbacksC0784zc == null) {
            return true;
        }
        Oc oc = abstractComponentCallbacksC0784zc.r;
        return abstractComponentCallbacksC0784zc.equals(oc.w) && J(oc.v);
    }

    public static void Y(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0784zc);
        }
        if (abstractComponentCallbacksC0784zc.y) {
            abstractComponentCallbacksC0784zc.y = false;
            abstractComponentCallbacksC0784zc.I = !abstractComponentCallbacksC0784zc.I;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0229 A[PHI: r13
      0x0229: PHI (r13v11 int) = (r13v10 int), (r13v12 int) binds: [B:107:0x0219, B:112:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    public final void A(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C0296jj c0296jj;
        C0296jj c0296jj2;
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList;
        boolean z = ((C0558s3) arrayList3.get(i)).o;
        ArrayList arrayList4 = this.K;
        if (arrayList4 == null) {
            this.K = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.K;
        C0296jj c0296jj3 = this.c;
        arrayList5.addAll(c0296jj3.r());
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.w;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 >= i2) {
                C0296jj c0296jj4 = c0296jj3;
                this.K.clear();
                if (!z && this.s >= 1) {
                    for (int i7 = i; i7 < i2; i7++) {
                        Iterator it = ((C0558s3) arrayList.get(i7)).a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = ((Zc) it.next()).b;
                            if (abstractComponentCallbacksC0784zc2 == null || abstractComponentCallbacksC0784zc2.r == null) {
                                c0296jj = c0296jj4;
                            } else {
                                c0296jj = c0296jj4;
                                c0296jj.s(f(abstractComponentCallbacksC0784zc2));
                            }
                            c0296jj4 = c0296jj;
                        }
                    }
                }
                for (int i8 = i; i8 < i2; i8++) {
                    C0558s3 c0558s3 = (C0558s3) arrayList.get(i8);
                    if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                        c0558s3.c(-1);
                        ArrayList arrayList6 = c0558s3.a;
                        boolean z3 = true;
                        for (int size = arrayList6.size() - 1; size >= 0; size--) {
                            Zc zc = (Zc) arrayList6.get(size);
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 = zc.b;
                            if (abstractComponentCallbacksC0784zc3 != null) {
                                if (abstractComponentCallbacksC0784zc3.H != null) {
                                    abstractComponentCallbacksC0784zc3.e().a = z3;
                                }
                                int i9 = c0558s3.f;
                                int i10 = 8194;
                                int i11 = 4097;
                                if (i9 != 4097) {
                                    if (i9 != 8194) {
                                        i10 = 4100;
                                        i11 = 8197;
                                        if (i9 != 8197) {
                                            if (i9 == 4099) {
                                                i10 = 4099;
                                            } else if (i9 != 4100) {
                                                i10 = 0;
                                            } else {
                                                i10 = i11;
                                            }
                                        }
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                if (abstractComponentCallbacksC0784zc3.H != null || i10 != 0) {
                                    abstractComponentCallbacksC0784zc3.e();
                                    abstractComponentCallbacksC0784zc3.H.f = i10;
                                }
                                abstractComponentCallbacksC0784zc3.e();
                                abstractComponentCallbacksC0784zc3.H.getClass();
                            }
                            int i12 = zc.a;
                            Oc oc = c0558s3.p;
                            switch (i12) {
                                case 1:
                                    abstractComponentCallbacksC0784zc3.K(zc.d, zc.e, zc.f, zc.g);
                                    z3 = true;
                                    oc.U(abstractComponentCallbacksC0784zc3, true);
                                    oc.P(abstractComponentCallbacksC0784zc3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + zc.a);
                                case 3:
                                    abstractComponentCallbacksC0784zc3.K(zc.d, zc.e, zc.f, zc.g);
                                    oc.a(abstractComponentCallbacksC0784zc3);
                                    z3 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0784zc3.K(zc.d, zc.e, zc.f, zc.g);
                                    oc.getClass();
                                    Y(abstractComponentCallbacksC0784zc3);
                                    z3 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0784zc3.K(zc.d, zc.e, zc.f, zc.g);
                                    oc.U(abstractComponentCallbacksC0784zc3, true);
                                    oc.F(abstractComponentCallbacksC0784zc3);
                                    z3 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0784zc3.K(zc.d, zc.e, zc.f, zc.g);
                                    oc.c(abstractComponentCallbacksC0784zc3);
                                    z3 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0784zc3.K(zc.d, zc.e, zc.f, zc.g);
                                    oc.U(abstractComponentCallbacksC0784zc3, true);
                                    oc.g(abstractComponentCallbacksC0784zc3);
                                    z3 = true;
                                    break;
                                case 8:
                                    oc.W(null);
                                    z3 = true;
                                    break;
                                case 9:
                                    oc.W(abstractComponentCallbacksC0784zc3);
                                    z3 = true;
                                    break;
                                case 10:
                                    oc.V(abstractComponentCallbacksC0784zc3, zc.h);
                                    z3 = true;
                                    break;
                            }
                        }
                    } else {
                        c0558s3.c(1);
                        ArrayList arrayList7 = c0558s3.a;
                        int size2 = arrayList7.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            Zc zc2 = (Zc) arrayList7.get(i13);
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc4 = zc2.b;
                            if (abstractComponentCallbacksC0784zc4 != null) {
                                if (abstractComponentCallbacksC0784zc4.H != null) {
                                    abstractComponentCallbacksC0784zc4.e().a = false;
                                }
                                int i14 = c0558s3.f;
                                if (abstractComponentCallbacksC0784zc4.H != null || i14 != 0) {
                                    abstractComponentCallbacksC0784zc4.e();
                                    abstractComponentCallbacksC0784zc4.H.f = i14;
                                }
                                abstractComponentCallbacksC0784zc4.e();
                                abstractComponentCallbacksC0784zc4.H.getClass();
                            }
                            int i15 = zc2.a;
                            Oc oc2 = c0558s3.p;
                            switch (i15) {
                                case 1:
                                    abstractComponentCallbacksC0784zc4.K(zc2.d, zc2.e, zc2.f, zc2.g);
                                    oc2.U(abstractComponentCallbacksC0784zc4, false);
                                    oc2.a(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + zc2.a);
                                case 3:
                                    abstractComponentCallbacksC0784zc4.K(zc2.d, zc2.e, zc2.f, zc2.g);
                                    oc2.P(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0784zc4.K(zc2.d, zc2.e, zc2.f, zc2.g);
                                    oc2.F(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0784zc4.K(zc2.d, zc2.e, zc2.f, zc2.g);
                                    oc2.U(abstractComponentCallbacksC0784zc4, false);
                                    Y(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0784zc4.K(zc2.d, zc2.e, zc2.f, zc2.g);
                                    oc2.g(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0784zc4.K(zc2.d, zc2.e, zc2.f, zc2.g);
                                    oc2.U(abstractComponentCallbacksC0784zc4, false);
                                    oc2.c(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 8:
                                    oc2.W(abstractComponentCallbacksC0784zc4);
                                    break;
                                case 9:
                                    oc2.W(null);
                                    break;
                                case 10:
                                    oc2.V(abstractComponentCallbacksC0784zc4, zc2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i16 = i; i16 < i2; i16++) {
                    C0558s3 c0558s4 = (C0558s3) arrayList.get(i16);
                    if (zBooleanValue) {
                        for (int size3 = c0558s4.a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc5 = ((Zc) c0558s4.a.get(size3)).b;
                            if (abstractComponentCallbacksC0784zc5 != null) {
                                f(abstractComponentCallbacksC0784zc5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0558s4.a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc6 = ((Zc) it2.next()).b;
                            if (abstractComponentCallbacksC0784zc6 != null) {
                                f(abstractComponentCallbacksC0784zc6).k();
                            }
                        }
                    }
                }
                K(this.s, true);
                HashSet<O8> hashSet = new HashSet();
                for (int i17 = i; i17 < i2; i17++) {
                    Iterator it3 = ((C0558s3) arrayList.get(i17)).a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc7 = ((Zc) it3.next()).b;
                        if (abstractComponentCallbacksC0784zc7 != null && (viewGroup = abstractComponentCallbacksC0784zc7.D) != null) {
                            hashSet.add(O8.f(viewGroup, E()));
                        }
                    }
                }
                for (O8 o8 : hashSet) {
                    o8.d = zBooleanValue;
                    o8.g();
                    o8.c();
                }
                for (int i18 = i; i18 < i2; i18++) {
                    C0558s3 c0558s5 = (C0558s3) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue() && c0558s5.r >= 0) {
                        c0558s5.r = -1;
                    }
                    c0558s5.getClass();
                }
                return;
            }
            C0558s3 c0558s6 = (C0558s3) arrayList3.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                c0296jj2 = c0296jj3;
                int i19 = 1;
                ArrayList arrayList8 = this.K;
                ArrayList arrayList9 = c0558s6.a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    Zc zc3 = (Zc) arrayList9.get(size4);
                    int i20 = zc3.a;
                    if (i20 != i19) {
                        if (i20 != 3) {
                            switch (i20) {
                                case 6:
                                    arrayList8.add(zc3.b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0784zc = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0784zc = zc3.b;
                                    break;
                                case 10:
                                    zc3.i = zc3.h;
                                    break;
                            }
                        } else {
                            arrayList8.add(zc3.b);
                        }
                        size4--;
                        i19 = 1;
                    }
                    arrayList8.remove(zc3.b);
                    size4--;
                    i19 = 1;
                }
            } else {
                ArrayList arrayList10 = this.K;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList11 = c0558s6.a;
                    if (i21 < arrayList11.size()) {
                        Zc zc4 = (Zc) arrayList11.get(i21);
                        int i22 = zc4.a;
                        if (i22 != i6) {
                            if (i22 != 2) {
                                if (i22 == 3 || i22 == 6) {
                                    arrayList10.remove(zc4.b);
                                    AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc8 = zc4.b;
                                    if (abstractComponentCallbacksC0784zc8 == abstractComponentCallbacksC0784zc) {
                                        arrayList11.add(i21, new Zc(9, abstractComponentCallbacksC0784zc8));
                                        i21++;
                                        c0296jj3 = c0296jj3;
                                        i3 = 1;
                                        abstractComponentCallbacksC0784zc = null;
                                    }
                                } else if (i22 == 7) {
                                    i3 = 1;
                                } else if (i22 == 8) {
                                    arrayList11.add(i21, new Zc(9, abstractComponentCallbacksC0784zc, 0));
                                    zc4.c = true;
                                    i21++;
                                    abstractComponentCallbacksC0784zc = zc4.b;
                                }
                                c0296jj3 = c0296jj3;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc9 = zc4.b;
                                int i23 = abstractComponentCallbacksC0784zc9.w;
                                int size5 = arrayList10.size() - 1;
                                boolean z4 = false;
                                while (size5 >= 0) {
                                    C0296jj c0296jj5 = c0296jj3;
                                    AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc10 = (AbstractComponentCallbacksC0784zc) arrayList10.get(size5);
                                    if (abstractComponentCallbacksC0784zc10.w != i23) {
                                        i23 = i23;
                                    } else if (abstractComponentCallbacksC0784zc10 == abstractComponentCallbacksC0784zc9) {
                                        i23 = i23;
                                        z4 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0784zc10 == abstractComponentCallbacksC0784zc) {
                                            arrayList11.add(i21, new Zc(9, abstractComponentCallbacksC0784zc10, 0));
                                            i21++;
                                            i4 = 0;
                                            abstractComponentCallbacksC0784zc = null;
                                        } else {
                                            i4 = 0;
                                        }
                                        Zc zc5 = new Zc(3, abstractComponentCallbacksC0784zc10, i4);
                                        zc5.d = zc4.d;
                                        zc5.f = zc4.f;
                                        zc5.e = zc4.e;
                                        zc5.g = zc4.g;
                                        arrayList11.add(i21, zc5);
                                        arrayList10.remove(abstractComponentCallbacksC0784zc10);
                                        i21++;
                                        abstractComponentCallbacksC0784zc = abstractComponentCallbacksC0784zc;
                                    }
                                    size5--;
                                    i23 = i23;
                                    c0296jj3 = c0296jj5;
                                }
                                c0296jj3 = c0296jj3;
                                i3 = 1;
                                if (z4) {
                                    arrayList11.remove(i21);
                                    i21--;
                                } else {
                                    zc4.a = 1;
                                    zc4.c = true;
                                    arrayList10.add(abstractComponentCallbacksC0784zc9);
                                }
                            }
                            i21 += i3;
                            i6 = i3;
                            c0296jj3 = c0296jj3;
                        } else {
                            i3 = i6;
                        }
                        arrayList10.add(zc4.b);
                        i21 += i3;
                        i6 = i3;
                        c0296jj3 = c0296jj3;
                    } else {
                        c0296jj2 = c0296jj3;
                    }
                }
            }
            z2 = z2 || c0558s6.g;
            i5++;
            arrayList3 = arrayList;
            c0296jj3 = c0296jj2;
        }
    }

    public final AbstractComponentCallbacksC0784zc B(int i) {
        C0296jj c0296jj = this.c;
        ArrayList arrayList = (ArrayList) c0296jj.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = (AbstractComponentCallbacksC0784zc) arrayList.get(size);
            if (abstractComponentCallbacksC0784zc != null && abstractComponentCallbacksC0784zc.v == i) {
                return abstractComponentCallbacksC0784zc;
            }
        }
        for (Vc vc : ((HashMap) c0296jj.b).values()) {
            if (vc != null) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = vc.c;
                if (abstractComponentCallbacksC0784zc2.v == i) {
                    return abstractComponentCallbacksC0784zc2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        ViewGroup viewGroup = abstractComponentCallbacksC0784zc.D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0784zc.w > 0 && this.u.Q()) {
            View viewN = this.u.N(abstractComponentCallbacksC0784zc.w);
            if (viewN instanceof ViewGroup) {
                return (ViewGroup) viewN;
            }
        }
        return null;
    }

    public final Jc D() {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.v;
        return abstractComponentCallbacksC0784zc != null ? abstractComponentCallbacksC0784zc.r.D() : this.x;
    }

    public final C0225h8 E() {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.v;
        return abstractComponentCallbacksC0784zc != null ? abstractComponentCallbacksC0784zc.r.E() : this.y;
    }

    public final void F(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0784zc);
        }
        if (abstractComponentCallbacksC0784zc.y) {
            return;
        }
        abstractComponentCallbacksC0784zc.y = true;
        abstractComponentCallbacksC0784zc.I = true ^ abstractComponentCallbacksC0784zc.I;
        X(abstractComponentCallbacksC0784zc);
    }

    public final boolean H() {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.v;
        if (abstractComponentCallbacksC0784zc == null) {
            return true;
        }
        return abstractComponentCallbacksC0784zc.p() && this.v.j().H();
    }

    public final void K(int i, boolean z) {
        HashMap map;
        Bc bc;
        if (this.t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.s) {
            this.s = i;
            C0296jj c0296jj = this.c;
            Iterator it = ((ArrayList) c0296jj.a).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) c0296jj.b;
                if (!zHasNext) {
                    break;
                }
                Vc vc = (Vc) map.get(((AbstractComponentCallbacksC0784zc) it.next()).e);
                if (vc != null) {
                    vc.k();
                }
            }
            for (Vc vc2 : map.values()) {
                if (vc2 != null) {
                    vc2.k();
                    AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc2.c;
                    if (abstractComponentCallbacksC0784zc.l && !abstractComponentCallbacksC0784zc.r()) {
                        c0296jj.t(vc2);
                    }
                }
            }
            Z();
            if (this.D && (bc = this.t) != null && this.s == 7) {
                bc.n.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void L() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.g = false;
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null) {
                abstractComponentCallbacksC0784zc.t.L();
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i, int i2) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.w;
        if (abstractComponentCallbacksC0784zc != null && i < 0 && abstractComponentCallbacksC0784zc.g().M()) {
            return true;
        }
        boolean zO = O(this.I, this.J, i, i2);
        if (zO) {
            this.b = true;
            try {
                Q(this.I, this.J);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        b0();
        u();
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return zO;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    C0558s3 c0558s3 = (C0558s3) this.d.get(size2);
                    if (i >= 0 && i == c0558s3.r) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            C0558s3 c0558s4 = (C0558s3) this.d.get(size2 - 1);
                            if (i < 0 || i != c0558s4.r) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0558s3) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0784zc + " nesting=" + abstractComponentCallbacksC0784zc.q);
        }
        boolean z = !abstractComponentCallbacksC0784zc.r();
        if (!abstractComponentCallbacksC0784zc.z || z) {
            C0296jj c0296jj = this.c;
            synchronized (((ArrayList) c0296jj.a)) {
                ((ArrayList) c0296jj.a).remove(abstractComponentCallbacksC0784zc);
            }
            abstractComponentCallbacksC0784zc.k = false;
            if (G(abstractComponentCallbacksC0784zc)) {
                this.D = true;
            }
            abstractComponentCallbacksC0784zc.l = true;
            X(abstractComponentCallbacksC0784zc);
        }
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0558s3) arrayList.get(i)).o) {
                if (i2 != i) {
                    A(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0558s3) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                A(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            A(arrayList, arrayList2, i2, size);
        }
    }

    public final void R(Parcelable parcelable) {
        int i;
        C0096d2 c0096d2;
        int i2;
        Vc vc;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.k.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<Uc> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.k.getClassLoader());
                arrayList.add((Uc) bundle.getParcelable("state"));
            }
        }
        C0296jj c0296jj = this.c;
        HashMap map = (HashMap) c0296jj.c;
        map.clear();
        for (Uc uc : arrayList) {
            map.put(uc.b, uc);
        }
        Pc pc = (Pc) bundle3.getParcelable("state");
        if (pc == null) {
            return;
        }
        HashMap map2 = (HashMap) c0296jj.b;
        map2.clear();
        Iterator it = pc.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = 2;
            c0096d2 = this.l;
            if (!zHasNext) {
                break;
            }
            Uc uc2 = (Uc) ((HashMap) c0296jj.c).remove((String) it.next());
            if (uc2 != null) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = (AbstractComponentCallbacksC0784zc) this.L.b.get(uc2.b);
                if (abstractComponentCallbacksC0784zc != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0784zc);
                    }
                    vc = new Vc(c0096d2, c0296jj, abstractComponentCallbacksC0784zc, uc2);
                } else {
                    vc = new Vc(this.l, this.c, this.t.k.getClassLoader(), D(), uc2);
                }
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = vc.c;
                abstractComponentCallbacksC0784zc2.r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0784zc2.e + "): " + abstractComponentCallbacksC0784zc2);
                }
                vc.m(this.t.k.getClassLoader());
                c0296jj.s(vc);
                vc.e = this.s;
            }
        }
        Rc rc = this.L;
        rc.getClass();
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 : new ArrayList(rc.b.values())) {
            if (map2.get(abstractComponentCallbacksC0784zc3.e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0784zc3 + " that was not found in the set of active Fragments " + pc.a);
                }
                this.L.e(abstractComponentCallbacksC0784zc3);
                abstractComponentCallbacksC0784zc3.r = this;
                Vc vc2 = new Vc(c0096d2, c0296jj, abstractComponentCallbacksC0784zc3);
                vc2.e = 1;
                vc2.k();
                abstractComponentCallbacksC0784zc3.l = true;
                vc2.k();
            }
        }
        ArrayList<String> arrayList2 = pc.b;
        ((ArrayList) c0296jj.a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcH = c0296jj.h(str3);
                if (abstractComponentCallbacksC0784zcH == null) {
                    throw new IllegalStateException(Vo.g("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0784zcH);
                }
                c0296jj.b(abstractComponentCallbacksC0784zcH);
            }
        }
        if (pc.c != null) {
            this.d = new ArrayList(pc.c.length);
            int i3 = 0;
            while (true) {
                C0589t3[] c0589t3Arr = pc.c;
                if (i3 >= c0589t3Arr.length) {
                    break;
                }
                C0589t3 c0589t3 = c0589t3Arr[i3];
                c0589t3.getClass();
                C0558s3 c0558s3 = new C0558s3(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0589t3.a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    Zc zc = new Zc();
                    int i6 = i4 + 1;
                    zc.a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0558s3 + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    zc.h = EnumC0633ug.values()[c0589t3.c[i5]];
                    zc.i = EnumC0633ug.values()[c0589t3.d[i5]];
                    int i7 = i4 + 2;
                    zc.c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    zc.d = i8;
                    int i9 = iArr[i4 + 3];
                    zc.e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    zc.f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    zc.g = i12;
                    c0558s3.b = i8;
                    c0558s3.c = i9;
                    c0558s3.d = i11;
                    c0558s3.e = i12;
                    c0558s3.b(zc);
                    i5++;
                    i = 2;
                }
                c0558s3.f = c0589t3.e;
                c0558s3.h = c0589t3.f;
                c0558s3.g = true;
                c0558s3.i = c0589t3.h;
                c0558s3.j = c0589t3.i;
                c0558s3.k = c0589t3.j;
                c0558s3.l = c0589t3.k;
                c0558s3.m = c0589t3.l;
                c0558s3.n = c0589t3.m;
                c0558s3.o = c0589t3.n;
                c0558s3.r = c0589t3.g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = c0589t3.b;
                    if (i13 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = (String) arrayList3.get(i13);
                    if (str4 != null) {
                        ((Zc) c0558s3.a.get(i13)).b = c0296jj.h(str4);
                    }
                    i13++;
                }
                c0558s3.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0558s3.r + "): " + c0558s3);
                    PrintWriter printWriter = new PrintWriter(new C0480ph());
                    c0558s3.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(c0558s3);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(pc.d);
        String str5 = pc.e;
        if (str5 != null) {
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcH2 = c0296jj.h(str5);
            this.w = abstractComponentCallbacksC0784zcH2;
            q(abstractComponentCallbacksC0784zcH2);
        }
        ArrayList arrayList4 = pc.f;
        if (arrayList4 != null) {
            for (int i14 = i2; i14 < arrayList4.size(); i14++) {
                this.j.put((String) arrayList4.get(i14), (C0620u3) pc.g.get(i14));
            }
        }
        this.C = new ArrayDeque(pc.h);
    }

    public final Bundle S() {
        int i;
        ArrayList arrayList;
        C0589t3[] c0589t3Arr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            O8 o8 = (O8) it.next();
            if (o8.e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                o8.e = false;
                o8.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((O8) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.g = true;
        C0296jj c0296jj = this.c;
        c0296jj.getClass();
        HashMap map = (HashMap) c0296jj.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Vc vc : map.values()) {
            if (vc != null) {
                vc.o();
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
                arrayList2.add(abstractComponentCallbacksC0784zc.e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0784zc + ": " + abstractComponentCallbacksC0784zc.b);
                }
            }
        }
        C0296jj c0296jj2 = this.c;
        c0296jj2.getClass();
        ArrayList<Uc> arrayList3 = new ArrayList(((HashMap) c0296jj2.c).values());
        if (!arrayList3.isEmpty()) {
            C0296jj c0296jj3 = this.c;
            synchronized (((ArrayList) c0296jj3.a)) {
                try {
                    if (((ArrayList) c0296jj3.a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0296jj3.a).size());
                        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 : (ArrayList) c0296jj3.a) {
                            arrayList.add(abstractComponentCallbacksC0784zc2.e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0784zc2.e + "): " + abstractComponentCallbacksC0784zc2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0589t3Arr = null;
            } else {
                c0589t3Arr = new C0589t3[size];
                for (i = 0; i < size; i++) {
                    c0589t3Arr[i] = new C0589t3((C0558s3) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.d.get(i));
                    }
                }
            }
            Pc pc = new Pc();
            pc.e = null;
            ArrayList arrayList5 = new ArrayList();
            pc.f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            pc.g = arrayList6;
            pc.a = arrayList2;
            pc.b = arrayList;
            pc.c = c0589t3Arr;
            pc.d = this.i.get();
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 = this.w;
            if (abstractComponentCallbacksC0784zc3 != null) {
                pc.e = abstractComponentCallbacksC0784zc3.e;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            pc.h = new ArrayList(this.C);
            bundle.putParcelable("state", pc);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
            }
            for (Uc uc : arrayList3) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", uc);
                bundle.putBundle("fragment_" + uc.b, bundle2);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.l.removeCallbacks(this.M);
                    this.t.l.post(this.M);
                    b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, boolean z) {
        ViewGroup viewGroupC = C(abstractComponentCallbacksC0784zc);
        if (viewGroupC == null || !(viewGroupC instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupC).setDrawDisappearingViewsLast(!z);
    }

    public final void V(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, EnumC0633ug enumC0633ug) {
        if (abstractComponentCallbacksC0784zc.equals(this.c.h(abstractComponentCallbacksC0784zc.e)) && (abstractComponentCallbacksC0784zc.s == null || abstractComponentCallbacksC0784zc.r == this)) {
            abstractComponentCallbacksC0784zc.L = enumC0633ug;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0784zc + " is not an active fragment of FragmentManager " + this);
    }

    public final void W(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (abstractComponentCallbacksC0784zc != null) {
            if (!abstractComponentCallbacksC0784zc.equals(this.c.h(abstractComponentCallbacksC0784zc.e)) || (abstractComponentCallbacksC0784zc.s != null && abstractComponentCallbacksC0784zc.r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0784zc + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = this.w;
        this.w = abstractComponentCallbacksC0784zc;
        q(abstractComponentCallbacksC0784zc2);
        q(this.w);
    }

    public final void X(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        ViewGroup viewGroupC = C(abstractComponentCallbacksC0784zc);
        if (viewGroupC != null) {
            C0722xc c0722xc = abstractComponentCallbacksC0784zc.H;
            if ((c0722xc == null ? 0 : c0722xc.e) + (c0722xc == null ? 0 : c0722xc.d) + (c0722xc == null ? 0 : c0722xc.c) + (c0722xc == null ? 0 : c0722xc.b) > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0784zc);
                }
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = (AbstractComponentCallbacksC0784zc) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag);
                C0722xc c0722xc2 = abstractComponentCallbacksC0784zc.H;
                boolean z = c0722xc2 != null ? c0722xc2.a : false;
                if (abstractComponentCallbacksC0784zc2.H == null) {
                    return;
                }
                abstractComponentCallbacksC0784zc2.e().a = z;
            }
        }
    }

    public final void Z() {
        for (Vc vc : this.c.o()) {
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
            if (abstractComponentCallbacksC0784zc.F) {
                if (this.b) {
                    this.H = true;
                } else {
                    abstractComponentCallbacksC0784zc.F = false;
                    vc.k();
                }
            }
        }
    }

    public final Vc a(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        String str = abstractComponentCallbacksC0784zc.K;
        if (str != null) {
            Yc.c(abstractComponentCallbacksC0784zc, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0784zc);
        }
        Vc vcF = f(abstractComponentCallbacksC0784zc);
        abstractComponentCallbacksC0784zc.r = this;
        C0296jj c0296jj = this.c;
        c0296jj.s(vcF);
        if (!abstractComponentCallbacksC0784zc.z) {
            c0296jj.b(abstractComponentCallbacksC0784zc);
            abstractComponentCallbacksC0784zc.l = false;
            if (abstractComponentCallbacksC0784zc.E == null) {
                abstractComponentCallbacksC0784zc.I = false;
            }
            if (G(abstractComponentCallbacksC0784zc)) {
                this.D = true;
            }
        }
        return vcF;
    }

    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0480ph());
        Bc bc = this.t;
        if (bc == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            bc.n.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void b(Bc bc, Br br, AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (this.t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.t = bc;
        this.u = br;
        this.v = abstractComponentCallbacksC0784zc;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (abstractComponentCallbacksC0784zc != null) {
            copyOnWriteArrayList.add(new Kc(abstractComponentCallbacksC0784zc));
        } else if (bc instanceof Sc) {
            copyOnWriteArrayList.add(bc);
        }
        if (this.v != null) {
            b0();
        }
        if (bc instanceof InterfaceC0052bk) {
            C0021ak c0021akL = bc.n.l();
            this.g = c0021akL;
            Dg dg = abstractComponentCallbacksC0784zc != null ? abstractComponentCallbacksC0784zc : bc;
            c0021akL.getClass();
            Hc hc = this.h;
            Tf.j("onBackPressedCallback", hc);
            AbstractC0695wg lifecycle = dg.getLifecycle();
            if (((Fg) lifecycle).c != EnumC0633ug.a) {
                hc.b.add(new Xj(c0021akL, lifecycle, hc));
                c0021akL.d();
                hc.c = new Zj(c0021akL, 0);
            }
        }
        if (abstractComponentCallbacksC0784zc != null) {
            Rc rc = abstractComponentCallbacksC0784zc.r.L;
            HashMap map = rc.c;
            Rc rc2 = (Rc) map.get(abstractComponentCallbacksC0784zc.e);
            if (rc2 == null) {
                rc2 = new Rc(rc.e);
                map.put(abstractComponentCallbacksC0784zc.e, rc2);
            }
            this.L = rc2;
        } else if (bc instanceof Ss) {
            this.L = (Rc) new Vi(bc.n.d(), Rc.h).e(Rc.class);
        } else {
            this.L = new Rc(false);
        }
        Rc rc3 = this.L;
        rc3.g = this.E || this.F;
        this.c.d = rc3;
        Bc bc2 = this.t;
        if ((bc2 instanceof InterfaceC0733xn) && abstractComponentCallbacksC0784zc == null) {
            C0711x1 c0711x1B = bc2.b();
            c0711x1B.f("android:support:fragments", new G6(this, 2));
            Bundle bundleC = c0711x1B.c("android:support:fragments");
            if (bundleC != null) {
                R(bundleC);
            }
        }
        Bc bc3 = this.t;
        if (bc3 instanceof D0) {
            N6 n6 = bc3.n.h;
            String str = "FragmentManager:" + (abstractComponentCallbacksC0784zc != null ? Vo.h(new StringBuilder(), abstractComponentCallbacksC0784zc.e, ":") : "");
            this.z = n6.c(Vo.f(str, "StartActivityForResult"), new A0(1), new Gc(this, 1));
            this.A = n6.c(Vo.f(str, "StartIntentSenderForResult"), new A0(2), new Gc(this, 2));
            this.B = n6.c(Vo.f(str, "RequestPermissions"), new A0(0), new Gc(this, 0));
        }
        Bc bc4 = this.t;
        if (bc4 instanceof InterfaceC0083ck) {
            bc4.C0(this.n);
        }
        Bc bc5 = this.t;
        if (bc5 instanceof InterfaceC0297jk) {
            bc5.F0(this.o);
        }
        Bc bc6 = this.t;
        if (bc6 instanceof InterfaceC0175fk) {
            bc6.D0(this.p);
        }
        Bc bc7 = this.t;
        if (bc7 instanceof InterfaceC0206gk) {
            bc7.E0(this.q);
        }
        Bc bc8 = this.t;
        if ((bc8 instanceof InterfaceC0666vi) && abstractComponentCallbacksC0784zc == null) {
            bc8.B0(this.r);
        }
    }

    public final void b0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    Hc hc = this.h;
                    hc.a = true;
                    InterfaceC0107dd interfaceC0107dd = hc.c;
                    if (interfaceC0107dd != null) {
                        interfaceC0107dd.a();
                    }
                    return;
                }
                Hc hc2 = this.h;
                ArrayList arrayList = this.d;
                hc2.a = (arrayList != null ? arrayList.size() : 0) > 0 && J(this.v);
                InterfaceC0107dd interfaceC0107dd2 = hc2.c;
                if (interfaceC0107dd2 != null) {
                    interfaceC0107dd2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0784zc);
        }
        if (abstractComponentCallbacksC0784zc.z) {
            abstractComponentCallbacksC0784zc.z = false;
            if (abstractComponentCallbacksC0784zc.k) {
                return;
            }
            this.c.b(abstractComponentCallbacksC0784zc);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0784zc);
            }
            if (G(abstractComponentCallbacksC0784zc)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.o().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((Vc) it.next()).c.D;
            if (viewGroup != null) {
                hashSet.add(O8.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final Vc f(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        String str = abstractComponentCallbacksC0784zc.e;
        C0296jj c0296jj = this.c;
        Vc vc = (Vc) ((HashMap) c0296jj.b).get(str);
        if (vc != null) {
            return vc;
        }
        Vc vc2 = new Vc(this.l, c0296jj, abstractComponentCallbacksC0784zc);
        vc2.m(this.t.k.getClassLoader());
        vc2.e = this.s;
        return vc2;
    }

    public final void g(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0784zc);
        }
        if (abstractComponentCallbacksC0784zc.z) {
            return;
        }
        abstractComponentCallbacksC0784zc.z = true;
        if (abstractComponentCallbacksC0784zc.k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0784zc);
            }
            C0296jj c0296jj = this.c;
            synchronized (((ArrayList) c0296jj.a)) {
                ((ArrayList) c0296jj.a).remove(abstractComponentCallbacksC0784zc);
            }
            abstractComponentCallbacksC0784zc.k = false;
            if (G(abstractComponentCallbacksC0784zc)) {
                this.D = true;
            }
            X(abstractComponentCallbacksC0784zc);
        }
    }

    public final void h(boolean z) {
        if (z && (this.t instanceof InterfaceC0083ck)) {
            a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null) {
                abstractComponentCallbacksC0784zc.C = true;
                if (z) {
                    abstractComponentCallbacksC0784zc.t.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null) {
                if (!abstractComponentCallbacksC0784zc.y ? abstractComponentCallbacksC0784zc.t.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null && I(abstractComponentCallbacksC0784zc)) {
                if (!abstractComponentCallbacksC0784zc.y ? abstractComponentCallbacksC0784zc.t.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0784zc);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = (AbstractComponentCallbacksC0784zc) this.e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0784zc2)) {
                    abstractComponentCallbacksC0784zc2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((O8) it.next()).e();
        }
        Bc bc = this.t;
        boolean z = bc instanceof Ss;
        C0296jj c0296jj = this.c;
        if (z) {
            zIsChangingConfigurations = ((Rc) c0296jj.d).f;
        } else {
            Context context = bc.k;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0620u3) it2.next()).a) {
                    Rc rc = (Rc) c0296jj.d;
                    rc.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    rc.d(str);
                }
            }
        }
        t(-1);
        Bc bc2 = this.t;
        if (bc2 instanceof InterfaceC0297jk) {
            bc2.K0(this.o);
        }
        Bc bc3 = this.t;
        if (bc3 instanceof InterfaceC0083ck) {
            bc3.H0(this.n);
        }
        Bc bc4 = this.t;
        if (bc4 instanceof InterfaceC0175fk) {
            bc4.I0(this.p);
        }
        Bc bc5 = this.t;
        if (bc5 instanceof InterfaceC0206gk) {
            bc5.J0(this.q);
        }
        Bc bc6 = this.t;
        if (bc6 instanceof InterfaceC0666vi) {
            bc6.G0(this.r);
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0468p5) it3.next()).cancel();
            }
            this.g = null;
        }
        K2 k2 = this.z;
        if (k2 != null) {
            k2.P();
            this.A.P();
            this.B.P();
        }
    }

    public final void l(boolean z) {
        if (z && (this.t instanceof InterfaceC0297jk)) {
            a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null) {
                abstractComponentCallbacksC0784zc.C = true;
                if (z) {
                    abstractComponentCallbacksC0784zc.t.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.t instanceof InterfaceC0175fk)) {
            a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null && z2) {
                abstractComponentCallbacksC0784zc.t.m(z, true);
            }
        }
    }

    public final void n() {
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.p()) {
            if (abstractComponentCallbacksC0784zc != null) {
                abstractComponentCallbacksC0784zc.q();
                abstractComponentCallbacksC0784zc.t.n();
            }
        }
    }

    public final boolean o() {
        if (this.s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null) {
                if (!abstractComponentCallbacksC0784zc.y ? abstractComponentCallbacksC0784zc.t.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null && !abstractComponentCallbacksC0784zc.y) {
                abstractComponentCallbacksC0784zc.t.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (abstractComponentCallbacksC0784zc != null) {
            if (abstractComponentCallbacksC0784zc.equals(this.c.h(abstractComponentCallbacksC0784zc.e))) {
                abstractComponentCallbacksC0784zc.r.getClass();
                boolean zJ = J(abstractComponentCallbacksC0784zc);
                Boolean bool = abstractComponentCallbacksC0784zc.j;
                if (bool == null || bool.booleanValue() != zJ) {
                    abstractComponentCallbacksC0784zc.j = Boolean.valueOf(zJ);
                    Oc oc = abstractComponentCallbacksC0784zc.t;
                    oc.b0();
                    oc.q(oc.w);
                }
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.t instanceof InterfaceC0206gk)) {
            a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null && z2) {
                abstractComponentCallbacksC0784zc.t.r(z, true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : this.c.r()) {
            if (abstractComponentCallbacksC0784zc != null && I(abstractComponentCallbacksC0784zc)) {
                if (!abstractComponentCallbacksC0784zc.y ? abstractComponentCallbacksC0784zc.t.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (Vc vc : ((HashMap) this.c.b).values()) {
                if (vc != null) {
                    vc.e = i;
                }
            }
            K(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((O8) it.next()).e();
            }
            this.b = false;
            y(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.v;
        if (abstractComponentCallbacksC0784zc != null) {
            sb.append(abstractComponentCallbacksC0784zc.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            Bc bc = this.t;
            if (bc != null) {
                sb.append(bc.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            Z();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strF = Vo.f(str, "    ");
        C0296jj c0296jj = this.c;
        c0296jj.getClass();
        String str3 = str + "    ";
        HashMap map = (HashMap) c0296jj.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Vc vc : map.values()) {
                printWriter.print(str);
                if (vc != null) {
                    AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
                    printWriter.println(abstractComponentCallbacksC0784zc);
                    abstractComponentCallbacksC0784zc.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0784zc.v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0784zc.w));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0784zc.x);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0784zc.a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0784zc.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0784zc.q);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0784zc.k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0784zc.l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0784zc.m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0784zc.n);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0784zc.y);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0784zc.z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0784zc.B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0784zc.A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0784zc.G);
                    if (abstractComponentCallbacksC0784zc.r != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0784zc.r);
                    }
                    if (abstractComponentCallbacksC0784zc.s != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0784zc.s);
                    }
                    if (abstractComponentCallbacksC0784zc.u != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0784zc.u);
                    }
                    if (abstractComponentCallbacksC0784zc.f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0784zc.f);
                    }
                    if (abstractComponentCallbacksC0784zc.b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0784zc.b);
                    }
                    if (abstractComponentCallbacksC0784zc.c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0784zc.c);
                    }
                    if (abstractComponentCallbacksC0784zc.d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0784zc.d);
                    }
                    Object objH = abstractComponentCallbacksC0784zc.g;
                    if (objH == null) {
                        Oc oc = abstractComponentCallbacksC0784zc.r;
                        objH = (oc == null || (str2 = abstractComponentCallbacksC0784zc.h) == null) ? null : oc.c.h(str2);
                    }
                    if (objH != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(objH);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0784zc.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0722xc c0722xc = abstractComponentCallbacksC0784zc.H;
                    printWriter.println(c0722xc == null ? false : c0722xc.a);
                    C0722xc c0722xc2 = abstractComponentCallbacksC0784zc.H;
                    if ((c0722xc2 == null ? 0 : c0722xc2.b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0722xc c0722xc3 = abstractComponentCallbacksC0784zc.H;
                        printWriter.println(c0722xc3 == null ? 0 : c0722xc3.b);
                    }
                    C0722xc c0722xc4 = abstractComponentCallbacksC0784zc.H;
                    if ((c0722xc4 == null ? 0 : c0722xc4.c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0722xc c0722xc5 = abstractComponentCallbacksC0784zc.H;
                        printWriter.println(c0722xc5 == null ? 0 : c0722xc5.c);
                    }
                    C0722xc c0722xc6 = abstractComponentCallbacksC0784zc.H;
                    if ((c0722xc6 == null ? 0 : c0722xc6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0722xc c0722xc7 = abstractComponentCallbacksC0784zc.H;
                        printWriter.println(c0722xc7 == null ? 0 : c0722xc7.d);
                    }
                    C0722xc c0722xc8 = abstractComponentCallbacksC0784zc.H;
                    if ((c0722xc8 == null ? 0 : c0722xc8.e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0722xc c0722xc9 = abstractComponentCallbacksC0784zc.H;
                        printWriter.println(c0722xc9 == null ? 0 : c0722xc9.e);
                    }
                    if (abstractComponentCallbacksC0784zc.D != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0784zc.D);
                    }
                    if (abstractComponentCallbacksC0784zc.E != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0784zc.E);
                    }
                    if (abstractComponentCallbacksC0784zc.h() != null) {
                        C0057bp c0057bp = ((C0234hh) new Vi(abstractComponentCallbacksC0784zc.d(), C0234hh.c).e(C0234hh.class)).b;
                        if (c0057bp.c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (c0057bp.c > 0) {
                                Vo.l(c0057bp.b[0]);
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(c0057bp.a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0784zc.t + ":");
                    abstractComponentCallbacksC0784zc.t.v(Vo.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0296jj.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = (AbstractComponentCallbacksC0784zc) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0784zc2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 = (AbstractComponentCallbacksC0784zc) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0784zc3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0558s3 c0558s3 = (C0558s3) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0558s3.toString());
                c0558s3.f(strF, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (Mc) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(Mc mc, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(mc);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.t.l.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z) {
        boolean zA;
        x(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((Mc) this.a.get(i)).a(arrayList, arrayList2);
                        }
                        this.a.clear();
                        this.t.l.removeCallbacks(this.M);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.t.l.removeCallbacks(this.M);
                        throw th;
                    }
                }
            }
            if (!zA) {
                b0();
                u();
                ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                Q(this.I, this.J);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    public final void z(Mc mc, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        x(z);
        if (mc.a(this.I, this.J)) {
            this.b = true;
            try {
                Q(this.I, this.J);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        b0();
        u();
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
    }
}
