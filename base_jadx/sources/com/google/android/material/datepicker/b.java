package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.AbstractC0361lm;
import defpackage.C0552rs;
import defpackage.Gs;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0361lm {
    public final TextView t;
    public final MaterialCalendarGridView u;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.t = textView;
        WeakHashMap weakHashMap = Gs.a;
        new C0552rs(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).e(textView, Boolean.TRUE);
        this.u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
