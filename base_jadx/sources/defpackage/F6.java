package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F6 implements InterfaceC0788zg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0788zg
    public final void n(Dg dg, EnumC0602tg enumC0602tg) {
        Window window;
        View viewPeekDecorView;
        switch (this.a) {
            case 0:
                P6 p6 = (P6) this.b;
                Tf.j("this$0", p6);
                if (enumC0602tg == EnumC0602tg.ON_STOP && (window = p6.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                P6 p7 = (P6) this.b;
                Tf.j("this$0", p7);
                if (enumC0602tg == EnumC0602tg.ON_DESTROY) {
                    p7.b.b = null;
                    if (!p7.isChangingConfigurations()) {
                        p7.d().a();
                    }
                    L6 l6 = p7.f;
                    P6 p8 = l6.d;
                    p8.getWindow().getDecorView().removeCallbacks(l6);
                    p8.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(l6);
                }
                break;
            default:
                C0711x1 c0711x1 = (C0711x1) this.b;
                Tf.j("this$0", c0711x1);
                if (enumC0602tg == EnumC0602tg.ON_START) {
                    c0711x1.e = true;
                } else if (enumC0602tg == EnumC0602tg.ON_STOP) {
                    c0711x1.e = false;
                }
                break;
        }
    }
}
