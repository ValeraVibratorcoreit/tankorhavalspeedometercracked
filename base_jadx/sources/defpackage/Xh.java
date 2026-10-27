package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Xh extends Zl {
    public final /* synthetic */ c a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Yh c;

    public Xh(Yh yh, c cVar, MaterialButton materialButton) {
        this.c = yh;
        this.a = cVar;
        this.b = materialButton;
    }

    @Override // defpackage.Zl
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // defpackage.Zl
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iL0;
        Yh yh = this.c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) yh.a0.getLayoutManager();
            View viewN0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
            iL0 = viewN0 == null ? -1 : Wl.H(viewN0);
        } else {
            iL0 = ((LinearLayoutManager) yh.a0.getLayoutManager()).L0();
        }
        c cVar = this.a;
        Calendar calendarB = Nr.b(cVar.c.a.a);
        calendarB.add(2, iL0);
        yh.W = new C0020aj(calendarB);
        Calendar calendarB2 = Nr.b(cVar.c.a.a);
        calendarB2.add(2, iL0);
        calendarB2.set(5, 1);
        Calendar calendarB3 = Nr.b(calendarB2);
        calendarB3.get(2);
        calendarB3.get(1);
        calendarB3.getMaximum(7);
        calendarB3.getActualMaximum(5);
        calendarB3.getTimeInMillis();
        this.b.setText(Nr.a("yMMMM", Locale.getDefault()).format(new Date(calendarB3.getTimeInMillis())));
    }
}
