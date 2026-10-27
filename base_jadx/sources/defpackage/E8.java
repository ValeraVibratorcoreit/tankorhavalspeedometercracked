package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E8 extends Sl {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void i(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0361lm) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.Sl
    public final boolean a(AbstractC0361lm abstractC0361lm, AbstractC0361lm abstractC0361lm2, Ej ej, Ej ej2) {
        int i;
        int i2;
        int i3 = ej.a;
        int i4 = ej.b;
        if (abstractC0361lm2.p()) {
            int i5 = ej.a;
            i2 = ej.b;
            i = i5;
        } else {
            i = ej2.a;
            i2 = ej2.b;
        }
        if (abstractC0361lm == abstractC0361lm2) {
            return h(abstractC0361lm, i3, i4, i, i2);
        }
        View view = abstractC0361lm.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m(abstractC0361lm);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m(abstractC0361lm2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = abstractC0361lm2.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        C8 c8 = new C8();
        c8.a = abstractC0361lm;
        c8.b = abstractC0361lm2;
        c8.c = i3;
        c8.d = i4;
        c8.e = i;
        c8.f = i2;
        arrayList.add(c8);
        return true;
    }

    @Override // defpackage.Sl
    public final void e(AbstractC0361lm abstractC0361lm) {
        View view = abstractC0361lm.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((D8) arrayList.get(size)).a == abstractC0361lm) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d(abstractC0361lm);
                arrayList.remove(size);
            }
        }
        k(this.k, abstractC0361lm);
        if (this.h.remove(abstractC0361lm)) {
            view.setAlpha(1.0f);
            d(abstractC0361lm);
        }
        if (this.i.remove(abstractC0361lm)) {
            view.setAlpha(1.0f);
            c(abstractC0361lm);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            k(arrayList3, abstractC0361lm);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((D8) arrayList5.get(size4)).a == abstractC0361lm) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(abstractC0361lm);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0361lm)) {
                view.setAlpha(1.0f);
                c(abstractC0361lm);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(abstractC0361lm);
        this.o.remove(abstractC0361lm);
        this.r.remove(abstractC0361lm);
        this.p.remove(abstractC0361lm);
        j();
    }

    @Override // defpackage.Sl
    public final void f() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            D8 d8 = (D8) arrayList.get(size);
            View view = d8.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d(d8.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((AbstractC0361lm) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList3.get(size3);
            abstractC0361lm.a.setAlpha(1.0f);
            d(abstractC0361lm);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C8 c8 = (C8) arrayList4.get(size4);
            AbstractC0361lm abstractC0361lm2 = c8.a;
            if (abstractC0361lm2 != null) {
                l(c8, abstractC0361lm2);
            }
            AbstractC0361lm abstractC0361lm3 = c8.b;
            if (abstractC0361lm3 != null) {
                l(c8, abstractC0361lm3);
            }
        }
        arrayList4.clear();
        if (g()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    D8 d9 = (D8) arrayList6.get(size6);
                    View view2 = d9.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d(d9.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0361lm abstractC0361lm4 = (AbstractC0361lm) arrayList8.get(size8);
                    abstractC0361lm4.a.setAlpha(1.0f);
                    d(abstractC0361lm4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C8 c9 = (C8) arrayList10.get(size10);
                    AbstractC0361lm abstractC0361lm5 = c9.a;
                    if (abstractC0361lm5 != null) {
                        l(c9, abstractC0361lm5);
                    }
                    AbstractC0361lm abstractC0361lm6 = c9.b;
                    if (abstractC0361lm6 != null) {
                        l(c9, abstractC0361lm6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            i(this.q);
            i(this.p);
            i(this.o);
            i(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                Vo.l(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // defpackage.Sl
    public final boolean g() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean h(AbstractC0361lm abstractC0361lm, int i, int i2, int i3, int i4) {
        View view = abstractC0361lm.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0361lm.a.getTranslationY());
        m(abstractC0361lm);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            d(abstractC0361lm);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        D8 d8 = new D8();
        d8.a = abstractC0361lm;
        d8.b = translationX;
        d8.c = translationY;
        d8.d = i3;
        d8.e = i4;
        arrayList.add(d8);
        return true;
    }

    public final void j() {
        if (g()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            Vo.l(arrayList.get(0));
            throw null;
        }
    }

    public final void k(List list, AbstractC0361lm abstractC0361lm) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C8 c8 = (C8) list.get(size);
            if (l(c8, abstractC0361lm) && c8.a == null && c8.b == null) {
                list.remove(c8);
            }
        }
    }

    public final boolean l(C8 c8, AbstractC0361lm abstractC0361lm) {
        if (c8.b == abstractC0361lm) {
            c8.b = null;
        } else {
            if (c8.a != abstractC0361lm) {
                return false;
            }
            c8.a = null;
        }
        abstractC0361lm.a.setAlpha(1.0f);
        View view = abstractC0361lm.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(abstractC0361lm);
        return true;
    }

    public final void m(AbstractC0361lm abstractC0361lm) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        abstractC0361lm.a.animate().setInterpolator(s);
        e(abstractC0361lm);
    }
}
