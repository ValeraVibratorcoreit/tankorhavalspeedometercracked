package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class X8 implements V8 {
    public final AbstractC0615tt d;
    public int f;
    public int g;
    public AbstractC0615tt a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public C0226h9 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public X8(AbstractC0615tt abstractC0615tt) {
        this.d = abstractC0615tt;
    }

    @Override // defpackage.V8
    public final void a(V8 v8) {
        ArrayList<X8> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((X8) it.next()).j) {
                return;
            }
        }
        this.c = true;
        AbstractC0615tt abstractC0615tt = this.a;
        if (abstractC0615tt != null) {
            abstractC0615tt.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        X8 x8 = null;
        int i = 0;
        for (X8 x9 : arrayList) {
            if (!(x9 instanceof C0226h9)) {
                i++;
                x8 = x9;
            }
        }
        if (x8 != null && i == 1 && x8.j) {
            C0226h9 c0226h9 = this.i;
            if (c0226h9 != null) {
                if (!c0226h9.j) {
                    return;
                } else {
                    this.f = this.h * c0226h9.g;
                }
            }
            d(x8.g + this.f);
        }
        AbstractC0615tt abstractC0615tt2 = this.a;
        if (abstractC0615tt2 != null) {
            abstractC0615tt2.a(this);
        }
    }

    public final void b(V8 v8) {
        this.k.add(v8);
        if (this.j) {
            v8.a(v8);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (V8 v8 : this.k) {
            v8.a(v8);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
