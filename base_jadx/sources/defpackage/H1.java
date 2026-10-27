package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H1 extends Zs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.Ys
    public final void a() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                F1 f1 = (F1) obj;
                f1.b.v.setAlpha(1.0f);
                R1 r1 = f1.b;
                r1.y.d(null);
                r1.y = null;
                break;
            case 1:
                R1 r2 = (R1) obj;
                r2.v.setAlpha(1.0f);
                r2.y.d(null);
                r2.y = null;
                break;
            default:
                C0096d2 c0096d2 = (C0096d2) obj;
                ((R1) c0096d2.c).v.setVisibility(8);
                R1 r3 = (R1) c0096d2.c;
                PopupWindow popupWindow = r3.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (r3.v.getParent() instanceof View) {
                    View view = (View) r3.v.getParent();
                    WeakHashMap weakHashMap = Gs.a;
                    AbstractC0614ts.c(view);
                }
                r3.v.e();
                r3.y.d(null);
                r3.y = null;
                ViewGroup viewGroup = r3.B;
                WeakHashMap weakHashMap2 = Gs.a;
                AbstractC0614ts.c(viewGroup);
                break;
        }
    }

    @Override // defpackage.Zs, defpackage.Ys
    public void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((F1) obj).b.v.setVisibility(0);
                break;
            case 1:
                R1 r1 = (R1) obj;
                r1.v.setVisibility(0);
                if (r1.v.getParent() instanceof View) {
                    View view = (View) r1.v.getParent();
                    WeakHashMap weakHashMap = Gs.a;
                    AbstractC0614ts.c(view);
                }
                break;
        }
    }
}
