package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;

/* JADX INFO: renamed from: np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0426np implements M9, Rj {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ C0426np(int i) {
        this.a = i;
    }

    public static Mf g(String str) {
        str.getClass();
        switch (str) {
            case "Tank 300 El":
                return (Mf) F4.P().b;
            case "Mustang GT":
                Mf mf = (Mf) F4.E().b;
                mf.g = R.drawable.ford_speed;
                mf.h = R.drawable.ford_rpm;
                mf.i = R.drawable.needle_mib2p;
                return mf;
            case "Digital_big":
            case "Digital":
                Mf mf2 = (Mf) F4.E().b;
                mf2.a = "digital_instrumental_panel";
                mf2.A = "digital_instrumental_panel_micro";
                return mf2;
            case "Night center_big":
                return (Mf) F4.K().b;
            case "Tank 300_big":
                Mf mf3 = (Mf) F4.Q().b;
                mf3.a = "speedometer_t300_big";
                return mf3;
            case "Moon Eclipse_big":
                Mf mf4 = (Mf) F4.E().b;
                mf4.a = "speedometer_t300";
                mf4.b = true;
                mf4.n = "t300_needle.png";
                mf4.c = true;
                mf4.a = "speedometer_t300_big";
                return mf4;
            case "Tank 300":
                return (Mf) F4.Q().b;
            case "Tank 500":
                return (Mf) F4.R().b;
            case "KIA mini_big":
                Mf mf5 = (Mf) F4.H().b;
                mf5.a = "speedometer_default_big";
                return mf5;
            case "KIA mini":
                return (Mf) F4.H().b;
            case "KIA_big":
                return (Mf) F4.I().b;
            case "BMW":
                Mf mf6 = (Mf) F4.E().b;
                mf6.g = R.drawable.bmw_speed;
                mf6.h = R.drawable.bmw_rpm;
                mf6.i = R.drawable.needle_bmw;
                return mf6;
            case "KIA":
                return (Mf) F4.I().b;
            case "Mustang GT_big":
                Mf mf7 = (Mf) F4.E().b;
                mf7.g = R.drawable.ford_speed;
                mf7.h = R.drawable.ford_rpm;
                mf7.i = R.drawable.needle_mib2p;
                mf7.a = "speedometer_default_big";
                return mf7;
            case "Tank 500_big":
                Mf mf8 = (Mf) F4.R().b;
                mf8.a = "speedometer_t500_big";
                return mf8;
            case "Audi Virtual Cockpit":
                return (Mf) F4.B().b;
            case "Audi Virtual Cockpit_big":
                Mf mf9 = (Mf) F4.B().b;
                mf9.a = "speedometer_default_big";
                return mf9;
            case "BMW_big":
                Mf mf10 = (Mf) F4.E().b;
                mf10.g = R.drawable.bmw_speed;
                mf10.h = R.drawable.bmw_rpm;
                mf10.i = R.drawable.needle_bmw;
                mf10.a = "speedometer_default_big";
                return mf10;
            case "Night center":
                return (Mf) F4.K().b;
            case "Tank 300 El_big":
                Mf mf11 = (Mf) F4.P().b;
                mf11.a = "speedometer_t300_el_big";
                return mf11;
            case "Moon Eclipse":
                Mf mf12 = (Mf) F4.E().b;
                mf12.a = "speedometer_t300";
                mf12.b = true;
                mf12.n = "t300_needle.png";
                mf12.c = true;
                return mf12;
            default:
                return null;
        }
    }

    public void a(AbstractC0361lm abstractC0361lm, Ej ej) {
        Fo fo = (Fo) this.b;
        Ns nsA = (Ns) fo.getOrDefault(abstractC0361lm, null);
        if (nsA == null) {
            nsA = Ns.a();
            fo.put(abstractC0361lm, nsA);
        }
        nsA.c = ej;
        nsA.a |= 8;
    }

    public void b(String str, boolean z) {
        C0096d2 c0096d2;
        Mf mf;
        int i = 1;
        int i2 = 0;
        int i3 = 11;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z ? "_big" : "");
        String string = sb.toString();
        Mf mfG = g(string);
        if (mfG == null) {
            if (z) {
                mf = (Mf) F4.B().b;
                mf.a = "speedometer_default_big";
            } else {
                mf = (Mf) F4.B().b;
            }
            mfG = mf;
        }
        SpedometerPanel spedometerPanel = (SpedometerPanel) this.b;
        switch (string) {
            case "Tank 300 El":
            case "Tank 300 El_big":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "Mustang GT":
            case "Mustang GT_big":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "Digital_big":
            case "Digital":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "Night center_big":
            case "Night center":
                c0096d2 = new C0263ig(mfG, spedometerPanel, i);
                break;
            case "Tank 300_big":
            case "Tank 300":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "Moon Eclipse_big":
            case "Moon Eclipse":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "Tank 500":
            case "Tank 500_big":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "KIA mini_big":
            case "KIA mini":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "KIA_big":
            case "KIA":
                c0096d2 = new C0263ig(mfG, spedometerPanel, i2);
                break;
            case "BMW":
            case "BMW_big":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            case "Audi Virtual Cockpit":
            case "Audi Virtual Cockpit_big":
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
            default:
                c0096d2 = new C0096d2(mfG, i3, spedometerPanel);
                break;
        }
        this.c = c0096d2;
        Mf mf2 = (Mf) c0096d2.b;
        spedometerPanel.e = mf2.B;
        spedometerPanel.d = mf2.C;
    }

    public void c(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View d(int i, int i2, int i3, int i4) {
        Ul ul = (Ul) this.b;
        int iE = ul.e();
        int iD = ul.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewA = ul.a(i);
            int iC = ul.c(viewA);
            int iB = ul.b(viewA);
            C0491ps c0491ps = (C0491ps) this.c;
            c0491ps.b = iE;
            c0491ps.c = iD;
            c0491ps.d = iC;
            c0491ps.e = iB;
            if (i3 != 0) {
                c0491ps.a = i3;
                if (c0491ps.a()) {
                    return viewA;
                }
            }
            if (i4 != 0) {
                c0491ps.a = i4;
                if (c0491ps.a()) {
                    view = viewA;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // defpackage.M9
    public void e(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap) throws IOException {
        IOException iOException = ((C0474pb) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0621u4.k(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.M9
    public void f() {
        Ll ll = (Ll) this.b;
        synchronized (ll) {
            ll.c = ll.a.length;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    @Override // defpackage.Rj
    public Vt h(View view, Vt vt) {
        boolean z;
        C0481pi c0481pi = (C0481pi) this.c;
        int i = c0481pi.a;
        B4 b4 = (B4) this.b;
        b4.getClass();
        Tt tt = vt.a;
        Hf hfF = tt.f(7);
        Hf hfF2 = tt.f(32);
        int i2 = hfF.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) b4.b;
        bottomSheetBehavior.w = i2;
        boolean zK = Tf.K(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.o;
        if (z2) {
            int iA = vt.a();
            bottomSheetBehavior.v = iA;
            paddingBottom = iA + c0481pi.c;
        }
        int i3 = c0481pi.b;
        boolean z3 = bottomSheetBehavior.p;
        int i4 = hfF.a;
        if (z3) {
            paddingLeft = (zK ? i3 : i) + i4;
        }
        boolean z4 = bottomSheetBehavior.q;
        int i5 = hfF.c;
        if (z4) {
            if (!zK) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z5 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i4) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = hfF.b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
            } else {
                z5 = z;
            }
        } else {
            z5 = z;
        }
        if (z5) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z6 = b4.a;
        if (z6) {
            bottomSheetBehavior.m = hfF2.d;
        }
        if (z2 || z6) {
            bottomSheetBehavior.I();
        }
        return vt;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    public int i(int i) {
        int i2;
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        List list = (List) this.c;
        if (list == null) {
            i2 = -1;
        } else {
            C0395mp c0395mp = null;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0395mp c0395mp2 = (C0395mp) ((List) this.c).get(size);
                    if (c0395mp2.a == i) {
                        c0395mp = c0395mp2;
                        break;
                    }
                }
            }
            if (c0395mp != null) {
                ((List) this.c).remove(c0395mp);
            }
            int size2 = ((List) this.c).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = -1;
                    break;
                }
                if (((C0395mp) ((List) this.c).get(i3)).a >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                C0395mp c0395mp3 = (C0395mp) ((List) this.c).get(i3);
                ((List) this.c).remove(i3);
                i2 = c0395mp3.a;
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            int[] iArr2 = (int[]) this.b;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return ((int[]) this.b).length;
        }
        int i4 = i2 + 1;
        Arrays.fill((int[]) this.b, i, i4, -1);
        return i4;
    }

    public boolean j(View view) {
        Ul ul = (Ul) this.b;
        int iE = ul.e();
        int iD = ul.d();
        int iC = ul.c(view);
        int iB = ul.b(view);
        C0491ps c0491ps = (C0491ps) this.c;
        c0491ps.b = iE;
        c0491ps.c = iD;
        c0491ps.d = iC;
        c0491ps.e = iB;
        c0491ps.a = 24579;
        return c0491ps.a();
    }

    public void k(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        c(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        List list = (List) this.c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C0395mp c0395mp = (C0395mp) ((List) this.c).get(size);
            int i4 = c0395mp.a;
            if (i4 >= i) {
                c0395mp.a = i4 + i2;
            }
        }
    }

    public void l(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        c(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        List list = (List) this.c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C0395mp c0395mp = (C0395mp) ((List) this.c).get(size);
            int i4 = c0395mp.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((List) this.c).remove(size);
                } else {
                    c0395mp.a = i4 - i2;
                }
            }
        }
    }

    public Ej m(AbstractC0361lm abstractC0361lm, int i) {
        Ns ns;
        Ej ej;
        Fo fo = (Fo) this.b;
        int iE = fo.e(abstractC0361lm);
        if (iE >= 0 && (ns = (Ns) fo.l(iE)) != null) {
            int i2 = ns.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                ns.a = i3;
                if (i == 4) {
                    ej = ns.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    ej = ns.c;
                }
                if ((i3 & 12) == 0) {
                    fo.j(iE);
                    ns.a = 0;
                    ns.b = null;
                    ns.c = null;
                    Ns.d.a(ns);
                }
                return ej;
            }
        }
        return null;
    }

    public void n(AbstractC0361lm abstractC0361lm) {
        Ns ns = (Ns) ((Fo) this.b).getOrDefault(abstractC0361lm, null);
        if (ns == null) {
            return;
        }
        ns.a &= -2;
    }

    public void o(AbstractC0361lm abstractC0361lm) {
        C0511qh c0511qh = (C0511qh) this.c;
        for (int iF = c0511qh.f() - 1; iF >= 0; iF--) {
            if (abstractC0361lm == c0511qh.g(iF)) {
                Object[] objArr = c0511qh.c;
                Object obj = objArr[iF];
                Object obj2 = C0511qh.e;
                if (obj == obj2) {
                    break;
                }
                objArr[iF] = obj2;
                c0511qh.a = true;
                break;
            }
        }
        Ns ns = (Ns) ((Fo) this.b).remove(abstractC0361lm);
        if (ns != null) {
            ns.a = 0;
            ns.b = null;
            ns.c = null;
            Ns.d.a(ns);
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "Bounds{lower=" + ((Hf) this.b) + " upper=" + ((Hf) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0426np(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public C0426np() {
        this.a = 4;
        this.b = new Fo();
        this.c = new C0511qh();
    }

    public C0426np(Ul ul) {
        this.a = 3;
        this.b = ul;
        C0491ps c0491ps = new C0491ps();
        c0491ps.a = 0;
        this.c = c0491ps;
    }
}
