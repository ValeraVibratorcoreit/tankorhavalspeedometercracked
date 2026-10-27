package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Cr {
    public static final F4 a;
    public static final C0758yh b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Er();
        } else {
            a = new Dr();
        }
        b = new C0758yh(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, InterfaceC0382mc interfaceC0382mc, Resources resources, int i, String str, int i2, int i3, Br br, boolean z) {
        Typeface typefaceQ;
        Typeface typefaceCreate;
        Typeface typeface;
        int i4 = 10;
        int i5 = 1;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i6 = -3;
        if (interfaceC0382mc instanceof C0475pc) {
            C0475pc c0475pc = (C0475pc) interfaceC0382mc;
            String str2 = c0475pc.d;
            typefaceQ = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (br != null) {
                    new Handler(Looper.getMainLooper()).post(new B1(br, i4, typefaceCreate));
                }
                return typefaceCreate;
            }
            Object[] objArr4 = !z ? br != null : c0475pc.c != 0;
            int i7 = z ? c0475pc.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            Vi vi = new Vi();
            vi.a = br;
            H0 h0 = c0475pc.a;
            C0096d2 c0096d2 = new C0096d2(vi, 8, handler);
            if (objArr4 == true) {
                C0758yh c0758yh = AbstractC0320kc.a;
                String str3 = ((String) h0.f) + "-" + i3;
                typeface = (Typeface) AbstractC0320kc.a.a(str3);
                if (typeface != null) {
                    handler.post(new RunnableC0248i0(i5, vi, typeface, z2));
                    typefaceQ = typeface;
                } else if (i7 == -1) {
                    C0289jc c0289jcA = AbstractC0320kc.a(str3, context, h0, i3);
                    c0096d2.R(c0289jcA);
                    typefaceQ = c0289jcA.a;
                } else {
                    try {
                        try {
                            C0289jc c0289jc = (C0289jc) AbstractC0320kc.b.submit(new CallableC0229hc(str3, context, h0, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                            c0096d2.R(c0289jc);
                            typefaceQ = c0289jc.a;
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0096d2.c).post(new RunnableC0375m5(i6, c0096d2.b, (int) (objArr3 == true ? 1 : 0)));
                    }
                }
            } else {
                C0758yh c0758yh2 = AbstractC0320kc.a;
                String str4 = ((String) h0.f) + "-" + i3;
                typeface = (Typeface) AbstractC0320kc.a.a(str4);
                if (typeface != null) {
                    handler.post(new RunnableC0248i0(i5, vi, typeface, objArr2 == true ? 1 : 0));
                    typefaceQ = typeface;
                } else {
                    C0260ic c0260ic = new C0260ic(c0096d2, objArr == true ? 1 : 0);
                    synchronized (AbstractC0320kc.c) {
                        try {
                            Fo fo = AbstractC0320kc.d;
                            ArrayList arrayList = (ArrayList) fo.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(c0260ic);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c0260ic);
                                fo.put(str4, arrayList2);
                                CallableC0229hc callableC0229hc = new CallableC0229hc(str4, context, h0, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC0320kc.b;
                                C0260ic c0260ic2 = new C0260ic(str4, i5);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                J8 j8 = new J8();
                                j8.b = callableC0229hc;
                                j8.c = c0260ic2;
                                j8.d = handler2;
                                threadPoolExecutor.execute(j8);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceQ = a.q(context, (C0413nc) interfaceC0382mc, resources, i3);
            if (br != null) {
                if (typefaceQ != null) {
                    new Handler(Looper.getMainLooper()).post(new B1(br, i4, typefaceQ));
                } else {
                    br.i(-3);
                }
            }
        }
        if (typefaceQ != null) {
            b.b(b(resources, i, str, i2, i3), typefaceQ);
        }
        return typefaceQ;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
