package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0014ad implements InterfaceC0508qe, InterfaceC0733xn, Ss {
    public final AbstractComponentCallbacksC0784zc a;
    public final Rs b;
    public Fg c = null;
    public Lo d = null;

    public C0014ad(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, Rs rs) {
        this.a = abstractComponentCallbacksC0784zc;
        this.b = rs;
    }

    @Override // defpackage.InterfaceC0508qe
    public final C0420nj a() {
        Application application;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.a;
        Context applicationContext = abstractComponentCallbacksC0784zc.I().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0420nj c0420nj = new C0420nj(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0420nj.a;
        if (application != null) {
            linkedHashMap.put(F4.q, application);
        }
        linkedHashMap.put(Tf.d, this);
        linkedHashMap.put(Tf.e, this);
        Bundle bundle = abstractComponentCallbacksC0784zc.f;
        if (bundle != null) {
            linkedHashMap.put(Tf.f, bundle);
        }
        return c0420nj;
    }

    @Override // defpackage.InterfaceC0733xn
    public final C0711x1 b() {
        e();
        return (C0711x1) this.d.d;
    }

    public final void c(EnumC0602tg enumC0602tg) {
        this.c.e(enumC0602tg);
    }

    @Override // defpackage.Ss
    public final Rs d() {
        e();
        return this.b;
    }

    public final void e() {
        if (this.c == null) {
            this.c = new Fg(this);
            Lo lo = new Lo(this);
            this.d = lo;
            lo.d();
            Tf.o(this);
        }
    }

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        e();
        return this.c;
    }
}
