package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class Fi {
    public final Context a;
    public final MenuC0604ti b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public Ki i;
    public Di j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final Ei l = new Ei(this);

    public Fi(int i, int i2, MenuC0604ti menuC0604ti, Context context, View view, boolean z) {
        this.a = context;
        this.b = menuC0604ti;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final Di a() {
        Di viewOnKeyListenerC0611tp;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0611tp = new A5(this.a, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                int i = this.e;
                boolean z = this.c;
                Context context2 = this.a;
                viewOnKeyListenerC0611tp = new ViewOnKeyListenerC0611tp(this.d, i, this.b, context2, view, z);
            }
            viewOnKeyListenerC0611tp.l(this.b);
            viewOnKeyListenerC0611tp.r(this.l);
            viewOnKeyListenerC0611tp.n(this.f);
            viewOnKeyListenerC0611tp.f(this.i);
            viewOnKeyListenerC0611tp.o(this.h);
            viewOnKeyListenerC0611tp.p(this.g);
            this.j = viewOnKeyListenerC0611tp;
        }
        return this.j;
    }

    public final boolean b() {
        Di di = this.j;
        return di != null && di.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        Di diA = a();
        diA.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            diA.q(i);
            diA.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            diA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        diA.e();
    }
}
