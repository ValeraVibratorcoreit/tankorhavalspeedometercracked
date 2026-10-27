package defpackage;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G8 implements InterfaceC0788zg {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public G8(Aa aa, InterfaceC0788zg interfaceC0788zg) {
        Tf.j("defaultLifecycleObserver", aa);
        this.b = aa;
        this.c = interfaceC0788zg;
    }

    @Override // defpackage.InterfaceC0788zg
    public final void n(Dg dg, EnumC0602tg enumC0602tg) {
        switch (this.a) {
            case 0:
                int i = F8.a[enumC0602tg.ordinal()];
                Aa aa = (Aa) this.b;
                switch (i) {
                    case 1:
                        aa.getClass();
                        break;
                    case 2:
                        aa.getClass();
                        break;
                    case 3:
                        aa.b.getClass();
                        U6.a(Looper.getMainLooper()).postDelayed(new Ca(), 500L);
                        aa.a.b(aa);
                        break;
                    case 4:
                        aa.getClass();
                        break;
                    case 5:
                        aa.getClass();
                        break;
                    case 6:
                        aa.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0788zg interfaceC0788zg = (InterfaceC0788zg) this.c;
                if (interfaceC0788zg != null) {
                    interfaceC0788zg.n(dg, enumC0602tg);
                    return;
                }
                return;
            case 1:
                if (enumC0602tg == EnumC0602tg.ON_START) {
                    ((AbstractC0695wg) this.b).b(this);
                    ((C0711x1) this.c).g();
                    return;
                }
                return;
            default:
                HashMap map = ((Z5) this.c).a;
                List list = (List) map.get(enumC0602tg);
                Object obj = this.b;
                Z5.a(list, dg, enumC0602tg, obj);
                Z5.a((List) map.get(EnumC0602tg.ON_ANY), dg, enumC0602tg, obj);
                return;
        }
    }

    public G8(Object obj) {
        this.b = obj;
        C0038b6 c0038b6 = C0038b6.c;
        Class<?> cls = obj.getClass();
        Z5 z5 = (Z5) c0038b6.a.get(cls);
        this.c = z5 == null ? c0038b6.a(cls, null) : z5;
    }

    public G8(C0711x1 c0711x1, AbstractC0695wg abstractC0695wg) {
        this.b = abstractC0695wg;
        this.c = c0711x1;
    }
}
