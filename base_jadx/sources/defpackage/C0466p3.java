package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466p3 extends AbstractC0366lr {
    public ArrayList A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;

    @Override // defpackage.AbstractC0366lr
    public final void A(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).A(j);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void B(AbstractC0390mk abstractC0390mk) {
        this.E |= 8;
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).B(abstractC0390mk);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void C(TimeInterpolator timeInterpolator) {
        this.E |= 1;
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0366lr) this.A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.AbstractC0366lr
    public final void D(C0387mh c0387mh) {
        super.D(c0387mh);
        this.E |= 4;
        if (this.A != null) {
            for (int i = 0; i < this.A.size(); i++) {
                ((AbstractC0366lr) this.A.get(i)).D(c0387mh);
            }
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void E() {
        this.E |= 2;
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).E();
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void F(long j) {
        this.b = j;
    }

    @Override // defpackage.AbstractC0366lr
    public final String H(String str) {
        String strH = super.H(str);
        for (int i = 0; i < this.A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH);
            sb.append("\n");
            sb.append(((AbstractC0366lr) this.A.get(i)).H(str + "  "));
            strH = sb.toString();
        }
        return strH;
    }

    public final void I(AbstractC0366lr abstractC0366lr) {
        this.A.add(abstractC0366lr);
        abstractC0366lr.i = this;
        long j = this.c;
        if (j >= 0) {
            abstractC0366lr.A(j);
        }
        if ((this.E & 1) != 0) {
            abstractC0366lr.C(this.d);
        }
        if ((this.E & 2) != 0) {
            abstractC0366lr.E();
        }
        if ((this.E & 4) != 0) {
            abstractC0366lr.D(this.v);
        }
        if ((this.E & 8) != 0) {
            abstractC0366lr.B(null);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void c() {
        super.c();
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).c();
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void d(C0582sr c0582sr) {
        if (t(c0582sr.b)) {
            for (AbstractC0366lr abstractC0366lr : this.A) {
                if (abstractC0366lr.t(c0582sr.b)) {
                    abstractC0366lr.d(c0582sr);
                    c0582sr.c.add(abstractC0366lr);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void f(C0582sr c0582sr) {
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).f(c0582sr);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void g(C0582sr c0582sr) {
        if (t(c0582sr.b)) {
            for (AbstractC0366lr abstractC0366lr : this.A) {
                if (abstractC0366lr.t(c0582sr.b)) {
                    abstractC0366lr.g(c0582sr);
                    c0582sr.c.add(abstractC0366lr);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0366lr
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0366lr clone() {
        C0466p3 c0466p3 = (C0466p3) super.clone();
        c0466p3.A = new ArrayList();
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0366lr abstractC0366lrClone = ((AbstractC0366lr) this.A.get(i)).clone();
            c0466p3.A.add(abstractC0366lrClone);
            abstractC0366lrClone.i = c0466p3;
        }
        return c0466p3;
    }

    @Override // defpackage.AbstractC0366lr
    public final void l(ViewGroup viewGroup, C0296jj c0296jj, C0296jj c0296jj2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0366lr abstractC0366lr = (AbstractC0366lr) this.A.get(i);
            if (j > 0 && (this.B || i == 0)) {
                long j2 = abstractC0366lr.b;
                if (j2 > 0) {
                    abstractC0366lr.F(j2 + j);
                } else {
                    abstractC0366lr.F(j);
                }
            }
            abstractC0366lr.l(viewGroup, c0296jj, c0296jj2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void w(View view) {
        super.w(view);
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).w(view);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final AbstractC0366lr x(InterfaceC0335kr interfaceC0335kr) {
        super.x(interfaceC0335kr);
        return this;
    }

    @Override // defpackage.AbstractC0366lr
    public final void y(View view) {
        super.y(view);
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0366lr) this.A.get(i)).y(view);
        }
    }

    @Override // defpackage.AbstractC0366lr
    public final void z() {
        if (this.A.isEmpty()) {
            G();
            m();
            return;
        }
        C0521qr c0521qr = new C0521qr();
        c0521qr.b = this;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((AbstractC0366lr) it.next()).a(c0521qr);
        }
        this.C = this.A.size();
        if (this.B) {
            Iterator it2 = this.A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0366lr) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.A.size(); i++) {
            ((AbstractC0366lr) this.A.get(i - 1)).a(new C0521qr((AbstractC0366lr) this.A.get(i)));
        }
        AbstractC0366lr abstractC0366lr = (AbstractC0366lr) this.A.get(0);
        if (abstractC0366lr != null) {
            abstractC0366lr.z();
        }
    }
}
