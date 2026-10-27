package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class V5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ V5(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = -1;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                Tf.j("a", str);
                Tf.j("b", str2);
                int iMin = Math.min(str.length(), str2.length());
                int i2 = 4;
                while (true) {
                    if (i2 >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                        }
                    } else {
                        char cCharAt = str.charAt(i2);
                        char cCharAt2 = str2.charAt(i2);
                        if (cCharAt == cCharAt2) {
                            i2++;
                        } else if (Tf.k(cCharAt, cCharAt2) >= 0) {
                        }
                    }
                    return i;
                }
                i = 1;
                return i;
            case 1:
                WeakHashMap weakHashMap = Gs.a;
                float fM = AbstractC0676vs.m((View) obj);
                float fM2 = AbstractC0676vs.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 2:
                Cd cd = (Cd) obj;
                Cd cd2 = (Cd) obj2;
                RecyclerView recyclerView = cd.d;
                if ((recyclerView == null) == (cd2.d == null)) {
                    boolean z = cd.a;
                    if (z == cd2.a) {
                        i = cd2.b - cd.b;
                        if (i == 0) {
                            int i3 = cd.c - cd2.c;
                            if (i3 != 0) {
                                return i3;
                            }
                            return 0;
                        }
                    } else if (!z) {
                        i = 1;
                    }
                } else if (recyclerView == null) {
                    i = 1;
                }
                return i;
            case 3:
                return ((Wo) obj).b - ((Wo) obj2).b;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
