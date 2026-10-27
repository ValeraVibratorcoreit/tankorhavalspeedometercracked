package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0320kc {
    public static final C0758yh a = new C0758yh(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final Fo d;

    static {
        Cm cm = new Cm();
        cm.a = "fonts-androidx";
        cm.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), cm);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new Fo();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static C0289jc a(String str, Context context, H0 h0, int i) {
        C0758yh c0758yh = a;
        Typeface typeface = (Typeface) c0758yh.a(str);
        if (typeface != null) {
            return new C0289jc(typeface);
        }
        try {
            Q0 q0G = F4.G(context, h0);
            int i2 = 1;
            C0506qc[] c0506qcArr = (C0506qc[]) q0G.b;
            int i3 = q0G.a;
            if (i3 != 0) {
                if (i3 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else if (c0506qcArr != null && c0506qcArr.length != 0) {
                i2 = 0;
                for (C0506qc c0506qc : c0506qcArr) {
                    int i4 = c0506qc.e;
                    if (i4 != 0) {
                        if (i4 >= 0) {
                            i2 = i4;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                }
            }
            if (i2 != 0) {
                return new C0289jc(i2);
            }
            Typeface typefaceR = Cr.a.r(context, c0506qcArr, i);
            if (typefaceR == null) {
                return new C0289jc(-3);
            }
            c0758yh.b(str, typefaceR);
            return new C0289jc(typefaceR);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0289jc(-1);
        }
    }
}
