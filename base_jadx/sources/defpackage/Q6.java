package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public class Q6 extends Dialog implements Dg, InterfaceC0052bk, InterfaceC0733xn {
    public Fg a;
    public final Lo b;
    public final C0021ak c;

    public Q6(Context context, int i) {
        super(context, i);
        this.b = new Lo(this);
        this.c = new C0021ak(new RunnableC0591t5(this, 3));
    }

    public static void a(Q6 q6) {
        Tf.j("this$0", q6);
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Tf.j("view", view);
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.InterfaceC0733xn
    public final C0711x1 b() {
        return (C0711x1) this.b.d;
    }

    public final Fg c() {
        Fg fg = this.a;
        if (fg != null) {
            return fg;
        }
        Fg fg2 = new Fg(this);
        this.a = fg2;
        return fg2;
    }

    public final void d() {
        Window window = getWindow();
        Tf.f(window);
        View decorView = window.getDecorView();
        Tf.i("window!!.decorView", decorView);
        F4.X(decorView, this);
        Window window2 = getWindow();
        Tf.f(window2);
        View decorView2 = window2.getDecorView();
        Tf.i("window!!.decorView", decorView2);
        Td.D(decorView2, this);
        Window window3 = getWindow();
        Tf.f(window3);
        View decorView3 = window3.getDecorView();
        Tf.i("window!!.decorView", decorView3);
        Ud.f0(decorView3, this);
    }

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Tf.i("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C0021ak c0021ak = this.c;
            c0021ak.getClass();
            c0021ak.e = onBackInvokedDispatcher;
            c0021ak.c(c0021ak.g);
        }
        this.b.e(bundle);
        c().e(EnumC0602tg.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Tf.i("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.b.f(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().e(EnumC0602tg.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().e(EnumC0602tg.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Tf.j("view", view);
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Tf.j("view", view);
        d();
        super.setContentView(view, layoutParams);
    }
}
