package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0375m5 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ RunnableC0375m5(int i, Object obj, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Br br = (Br) ((Vi) this.c).a;
                if (br != null) {
                    br.O(this.b);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i = 0;
                if (this.b == 1) {
                    while (i < size) {
                        ((AbstractC0720xa) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((AbstractC0720xa) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            default:
                RecyclerView recyclerView = ((Yh) this.c).a0;
                if (!recyclerView.u) {
                    Wl wl = recyclerView.l;
                    if (wl != null) {
                        wl.y0(recyclerView, this.b);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
        }
    }

    public RunnableC0375m5(List list, int i, Throwable th) {
        this.a = 1;
        Tf.h("initCallbacks cannot be null", list);
        this.c = new ArrayList(list);
        this.b = i;
    }
}
