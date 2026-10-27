package defpackage;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class Th implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Th(Yh yh, c cVar, int i) {
        this.a = i;
        this.c = yh;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Yh yh = (Yh) this.c;
                int iL0 = ((LinearLayoutManager) yh.a0.getLayoutManager()).L0() - 1;
                if (iL0 >= 0) {
                    Calendar calendarB = Nr.b(((c) this.b).c.a.a);
                    calendarB.add(2, iL0);
                    yh.O(new C0020aj(calendarB));
                }
                break;
            case 1:
                Yh yh2 = (Yh) this.c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) yh2.a0.getLayoutManager();
                View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int iH = (viewN0 == null ? -1 : Wl.H(viewN0)) + 1;
                if (iH < yh2.a0.getAdapter().a()) {
                    Calendar calendarB2 = Nr.b(((c) this.b).c.a.a);
                    calendarB2.add(2, iH);
                    yh2.O(new C0020aj(calendarB2));
                }
                break;
            default:
                C0028ar c0028ar = (C0028ar) this.c;
                Window.Callback callback = c0028ar.k;
                if (callback != null && c0028ar.l) {
                    callback.onMenuItemSelected(0, (C0094d0) this.b);
                    break;
                }
                break;
        }
    }

    public Th(C0028ar c0028ar) {
        this.a = 2;
        this.c = c0028ar;
        this.b = new C0094d0(c0028ar.a.getContext(), c0028ar.h);
    }
}
