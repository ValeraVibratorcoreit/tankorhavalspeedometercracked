package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Fm implements Handler.Callback {
    public static final C0387mh e = new C0387mh(11);
    public volatile Em a;
    public final C0387mh b;
    public final InterfaceC0045bd c;
    public final C0096d2 d;

    public Fm() {
        C0387mh c0387mh = e;
        this.b = c0387mh;
        this.d = new C0096d2(c0387mh);
        this.c = (C0477pe.f && C0477pe.e) ? new Yb() : new C0225h8(3);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final Em b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = Qr.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0495q1) {
                AbstractActivityC0495q1 abstractActivityC0495q1 = (AbstractActivityC0495q1) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(abstractActivityC0495q1.getApplicationContext());
                }
                if (abstractActivityC0495q1.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.c.a(abstractActivityC0495q1);
                Activity activityA = a(abstractActivityC0495q1);
                boolean z = activityA == null || !activityA.isFinishing();
                a aVarA = a.a(abstractActivityC0495q1.getApplicationContext());
                Oc ocV = abstractActivityC0495q1.v();
                C0096d2 c0096d2 = this.d;
                c0096d2.getClass();
                Qr.a();
                Fg fg = abstractActivityC0495q1.a;
                Qr.a();
                Em em = (Em) ((HashMap) c0096d2.b).get(fg);
                if (em != null) {
                    return em;
                }
                Ag ag = new Ag(fg);
                C0225h8 c0225h8 = new C0225h8(c0096d2, ocV);
                ((C0387mh) c0096d2.c).getClass();
                Em em2 = new Em(aVarA, ag, c0225h8, abstractActivityC0495q1);
                ((HashMap) c0096d2.b).put(fg, em2);
                ag.g(new Gg(c0096d2, fg));
                if (z) {
                    em2.j();
                }
                return em2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        a aVarA2 = a.a(context.getApplicationContext());
                        C0387mh c0387mh = this.b;
                        C0473pa c0473pa = new C0473pa(15);
                        C0225h8 c0225h9 = new C0225h8(9);
                        Context applicationContext = context.getApplicationContext();
                        c0387mh.getClass();
                        this.a = new Em(aVarA2, c0473pa, c0225h9, applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
