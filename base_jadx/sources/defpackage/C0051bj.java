package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0051bj extends BaseAdapter {
    public static final int d = Nr.d(null).getMaximum(4);
    public static final int e = (Nr.d(null).getMaximum(7) + Nr.d(null).getMaximum(5)) - 1;
    public final C0020aj a;
    public C0096d2 b;
    public final C0282j5 c;

    public C0051bj(C0020aj c0020aj, C0282j5 c0282j5) {
        this.a = c0020aj;
        this.c = c0282j5;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.c.e;
        C0020aj c0020aj = this.a;
        Calendar calendar = c0020aj.a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c0020aj.d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarB = Nr.b(this.a.a);
        calendarB.set(5, iA);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new C0096d2(context, 7);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i - a();
        if (iA >= 0) {
            C0020aj c0020aj = this.a;
            if (iA >= c0020aj.e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c0020aj);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        Nr.c().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
