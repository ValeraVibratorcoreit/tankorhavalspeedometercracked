package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.AbstractC0361lm;
import defpackage.C0020aj;
import defpackage.C0051bj;
import defpackage.C0112di;
import defpackage.C0282j5;
import defpackage.C0308k0;
import defpackage.Nr;
import defpackage.Ol;
import defpackage.Xl;
import java.util.Calendar;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Ol {
    public final C0282j5 c;
    public final C0308k0 d;
    public final int e;

    public c(ContextThemeWrapper contextThemeWrapper, C0282j5 c0282j5, C0308k0 c0308k0) {
        C0020aj c0020aj = c0282j5.a;
        C0020aj c0020aj2 = c0282j5.d;
        if (c0020aj.a.compareTo(c0020aj2.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0020aj2.a.compareTo(c0282j5.b.a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0051bj.d) + (C0112di.S(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.c = c0282j5;
        this.d = c0308k0;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    @Override // defpackage.Ol
    public final int a() {
        return this.c.g;
    }

    @Override // defpackage.Ol
    public final long b(int i) {
        Calendar calendarB = Nr.b(this.c.a.a);
        calendarB.add(2, i);
        return new C0020aj(calendarB).a.getTimeInMillis();
    }

    @Override // defpackage.Ol
    public final void c(AbstractC0361lm abstractC0361lm, int i) {
        b bVar = (b) abstractC0361lm;
        C0282j5 c0282j5 = this.c;
        Calendar calendarB = Nr.b(c0282j5.a.a);
        calendarB.add(2, i);
        C0020aj c0020aj = new C0020aj(calendarB);
        bVar.t.setText(c0020aj.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !c0020aj.equals(materialCalendarGridView.a().a)) {
            new C0051bj(c0020aj, c0282j5);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // defpackage.Ol
    public final AbstractC0361lm d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0112di.S(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new Xl(-1, this.e));
        return new b(linearLayout, true);
    }
}
