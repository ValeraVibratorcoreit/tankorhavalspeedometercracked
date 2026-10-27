package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E4 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ L7 e;

    public E4(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new RunnableC0591t5(this, 19);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        L7 l7 = this.e;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) l7;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        WeakHashMap weakHashMap = Gs.a;
                        view.postOnAnimation((RunnableC0524r0) runnable);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) l7;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view2 = (View) sideSheetBehavior.p.get();
                        WeakHashMap weakHashMap2 = Gs.a;
                        view2.postOnAnimation((RunnableC0591t5) runnable);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public E4(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new RunnableC0524r0(this, 3);
    }
}
