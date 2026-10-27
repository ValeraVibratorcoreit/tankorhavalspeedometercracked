package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ng {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0361lm) this.k.get(i2)).a;
            Xl xl = (Xl) view3.getLayoutParams();
            if (view3 != view && !xl.a.i() && (iB = (xl.a.b() - this.d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((Xl) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(C0085cm c0085cm) {
        List list = this.k;
        if (list == null) {
            View view = c0085cm.i(Long.MAX_VALUE, this.d).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC0361lm) this.k.get(i)).a;
            Xl xl = (Xl) view2.getLayoutParams();
            if (!xl.a.i() && this.d == xl.a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
