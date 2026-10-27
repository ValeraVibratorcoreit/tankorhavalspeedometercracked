package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0742y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ RunnableC0742y1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C0325kh c0325kh;
        Object systemService;
        Context context;
        switch (this.a) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            Iterator it = E1.g.iterator();
                            while (true) {
                                Fh fh = (Fh) it;
                                if (fh.hasNext()) {
                                    E1 e1 = (E1) ((WeakReference) fh.next()).get();
                                    if (e1 != null && (context = ((R1) e1).k) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                c0325kh = new C0325kh(new C0356lh(A1.a(systemService)));
                            } else {
                                c0325kh = C0325kh.b;
                            }
                        } else {
                            c0325kh = E1.c;
                            if (c0325kh == null) {
                                c0325kh = C0325kh.b;
                            }
                        }
                        if (c0325kh.a.a.isEmpty()) {
                            String strB = Td.B(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                A1.b(systemService2, AbstractC0773z1.a(strB));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                E1.f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0742y1(this.b, 2));
                break;
            default:
                AbstractC0390mk.N(this.b, new ExecutorC0022al(), AbstractC0390mk.g, false);
                break;
        }
    }
}
