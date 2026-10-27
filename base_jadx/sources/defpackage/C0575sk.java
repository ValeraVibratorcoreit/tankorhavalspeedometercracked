package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0575sk extends AbstractC0658va {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0575sk(Wl wl, int i) {
        super(wl);
        this.d = i;
    }

    @Override // defpackage.AbstractC0658va
    public final int b(View view) {
        switch (this.d) {
            case 0:
                Xl xl = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return view.getRight() + ((Xl) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) xl).rightMargin;
            default:
                Xl xl2 = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return view.getBottom() + ((Xl) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) xl2).bottomMargin;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int c(View view) {
        switch (this.d) {
            case 0:
                Xl xl = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return Wl.A(view) + ((ViewGroup.MarginLayoutParams) xl).leftMargin + ((ViewGroup.MarginLayoutParams) xl).rightMargin;
            default:
                Xl xl2 = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return Wl.z(view) + ((ViewGroup.MarginLayoutParams) xl2).topMargin + ((ViewGroup.MarginLayoutParams) xl2).bottomMargin;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int d(View view) {
        switch (this.d) {
            case 0:
                Xl xl = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return Wl.z(view) + ((ViewGroup.MarginLayoutParams) xl).topMargin + ((ViewGroup.MarginLayoutParams) xl).bottomMargin;
            default:
                Xl xl2 = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return Wl.A(view) + ((ViewGroup.MarginLayoutParams) xl2).leftMargin + ((ViewGroup.MarginLayoutParams) xl2).rightMargin;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int e(View view) {
        switch (this.d) {
            case 0:
                Xl xl = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return (view.getLeft() - ((Xl) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) xl).leftMargin;
            default:
                Xl xl2 = (Xl) view.getLayoutParams();
                ((Wl) this.b).getClass();
                return (view.getTop() - ((Xl) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) xl2).topMargin;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int f() {
        switch (this.d) {
            case 0:
                return ((Wl) this.b).n;
            default:
                return ((Wl) this.b).o;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int g() {
        switch (this.d) {
            case 0:
                Wl wl = (Wl) this.b;
                return wl.n - wl.F();
            default:
                Wl wl2 = (Wl) this.b;
                return wl2.o - wl2.D();
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int h() {
        switch (this.d) {
            case 0:
                return ((Wl) this.b).F();
            default:
                return ((Wl) this.b).D();
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int i() {
        switch (this.d) {
            case 0:
                return ((Wl) this.b).l;
            default:
                return ((Wl) this.b).m;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int j() {
        switch (this.d) {
            case 0:
                return ((Wl) this.b).m;
            default:
                return ((Wl) this.b).l;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int k() {
        switch (this.d) {
            case 0:
                return ((Wl) this.b).E();
            default:
                return ((Wl) this.b).G();
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int l() {
        switch (this.d) {
            case 0:
                Wl wl = (Wl) this.b;
                return (wl.n - wl.E()) - wl.F();
            default:
                Wl wl2 = (Wl) this.b;
                return (wl2.o - wl2.G()) - wl2.D();
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int n(View view) {
        switch (this.d) {
            case 0:
                Wl wl = (Wl) this.b;
                Rect rect = (Rect) this.c;
                wl.K(rect, view);
                return rect.right;
            default:
                Wl wl2 = (Wl) this.b;
                Rect rect2 = (Rect) this.c;
                wl2.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final int o(View view) {
        switch (this.d) {
            case 0:
                Wl wl = (Wl) this.b;
                Rect rect = (Rect) this.c;
                wl.K(rect, view);
                return rect.left;
            default:
                Wl wl2 = (Wl) this.b;
                Rect rect2 = (Rect) this.c;
                wl2.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.AbstractC0658va
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((Wl) this.b).O(i);
                break;
            default:
                ((Wl) this.b).P(i);
                break;
        }
    }
}
