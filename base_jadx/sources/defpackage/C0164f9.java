package defpackage;

import android.view.View;
import ru.zinovin.tankspeedometer.MainActivity;

/* JADX INFO: renamed from: f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0164f9 implements Rj, On, InterfaceC0643uq {
    public static final C0164f9 b = new C0164f9(4);
    public static final C0164f9 c = new C0164f9(5);
    public static final C0164f9 d = new C0164f9(6);
    public static final C0164f9 e = new C0164f9(7);
    public static final C0164f9 f = new C0164f9(8);
    public final /* synthetic */ int a;

    public /* synthetic */ C0164f9(int i) {
        this.a = i;
    }

    @Override // defpackage.On
    public void a(String str) {
    }

    public void b(InterfaceC0335kr interfaceC0335kr, AbstractC0366lr abstractC0366lr) {
        switch (this.a) {
            case 4:
                interfaceC0335kr.a(abstractC0366lr);
                break;
            case 5:
                interfaceC0335kr.f(abstractC0366lr);
                break;
            case 6:
                interfaceC0335kr.d(abstractC0366lr);
                break;
            case 7:
                interfaceC0335kr.c();
                break;
            default:
                interfaceC0335kr.e();
                break;
        }
    }

    @Override // defpackage.Rj
    public Vt h(View view, Vt vt) {
        int i = MainActivity.M;
        Hf hfF = vt.a.f(7);
        view.setPadding(hfF.a, hfF.b, hfF.c, hfF.d);
        return Vt.b;
    }
}
