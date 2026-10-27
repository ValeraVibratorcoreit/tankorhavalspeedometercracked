package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.Aa;
import defpackage.AbstractC0695wg;
import defpackage.C0198gc;
import defpackage.C0782za;
import defpackage.Cf;
import defpackage.Dg;
import defpackage.K2;
import defpackage.S3;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements Cf {
    @Override // defpackage.Cf
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.Cf
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objK;
        C0198gc c0198gc = new C0198gc(new S3(context));
        c0198gc.a = 1;
        if (C0782za.k == null) {
            synchronized (C0782za.j) {
                try {
                    if (C0782za.k == null) {
                        C0782za.k = new C0782za(c0198gc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        K2 k2V = K2.v(context);
        k2V.getClass();
        synchronized (K2.f) {
            try {
                objK = ((HashMap) k2V.b).get(ProcessLifecycleInitializer.class);
                if (objK == null) {
                    objK = k2V.k(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC0695wg lifecycle = ((Dg) objK).getLifecycle();
        lifecycle.a(new Aa(this, lifecycle));
    }
}
