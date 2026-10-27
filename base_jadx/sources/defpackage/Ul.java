package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Ul {
    public final /* synthetic */ int a;
    public final /* synthetic */ Wl b;

    public /* synthetic */ Ul(Wl wl, int i) {
        this.a = i;
        this.b = wl;
    }

    public final View a(int i) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.u(i);
    }

    public final int b(View view) {
        switch (this.a) {
            case 0:
                Xl xl = (Xl) view.getLayoutParams();
                this.b.getClass();
                return view.getRight() + ((Xl) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) xl).rightMargin;
            default:
                Xl xl2 = (Xl) view.getLayoutParams();
                this.b.getClass();
                return view.getBottom() + ((Xl) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) xl2).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.a) {
            case 0:
                Xl xl = (Xl) view.getLayoutParams();
                this.b.getClass();
                return (view.getLeft() - ((Xl) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) xl).leftMargin;
            default:
                Xl xl2 = (Xl) view.getLayoutParams();
                this.b.getClass();
                return (view.getTop() - ((Xl) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) xl2).topMargin;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                Wl wl = this.b;
                return wl.n - wl.F();
            default:
                Wl wl2 = this.b;
                return wl2.o - wl2.D();
        }
    }

    public final int e() {
        switch (this.a) {
            case 0:
                return this.b.E();
            default:
                return this.b.G();
        }
    }
}
