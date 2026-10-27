package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Un extends LinearLayout {
    public final TextView a;
    public final LinearLayout b;
    public final ArrayList c;
    public CharSequence[] d;
    public CharSequence[] e;
    public String f;
    public Tn g;

    public Un(Context context) {
        super(context);
        this.c = new ArrayList();
        this.f = "";
        setOrientation(1);
        setBackgroundResource(R.drawable.ts_bg_card_single);
        int i = (int) (getResources().getDisplayMetrics().density * 16.0f);
        setPadding(i, i, i, i);
        TextView textView = new TextView(getContext());
        this.a = textView;
        textView.setTextColor(getResources().getColor(R.color.ts_color_text_secondary));
        this.a.setTextSize(27.0f);
        addView(this.a, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (getResources().getDisplayMetrics().density * 10.0f);
        addView(this.b, layoutParams);
    }

    public final void a() {
        if (this.e == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size() || i >= this.e.length) {
                return;
            }
            ((TextView) arrayList.get(i)).setSelected(this.e[i].toString().equals(this.f));
            i++;
        }
    }

    public final void b(int i, int i2) {
        this.d = getResources().getTextArray(i);
        this.e = getResources().getTextArray(i2);
        this.b.removeAllViews();
        ArrayList arrayList = this.c;
        arrayList.clear();
        if (this.d == null || this.e == null) {
            return;
        }
        int i3 = (int) (getResources().getDisplayMetrics().density * 6.0f);
        for (int i4 = 0; i4 < this.d.length; i4++) {
            String string = this.e[i4].toString();
            TextView textView = new TextView(getContext());
            textView.setText(this.d[i4]);
            textView.setGravity(17);
            textView.setTextSize(27.0f);
            textView.setTextColor(getResources().getColorStateList(R.color.ts_segment_text_color));
            textView.setBackgroundResource(R.drawable.ts_bg_segment);
            int i5 = (int) (getResources().getDisplayMetrics().density * 12.0f);
            textView.setPadding(i5, i5, i5, i5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            if (i4 > 0) {
                layoutParams.setMarginStart(i3);
            }
            textView.setOnClickListener(new C3(this, 3, string));
            this.b.addView(textView, layoutParams);
            arrayList.add(textView);
        }
        a();
    }

    public String getValue() {
        return this.f;
    }

    public void setOnValueChanged(Tn tn) {
        this.g = tn;
    }

    public void setTitle(int i) {
        this.a.setText(i);
    }

    public void setTitleVisible(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.topMargin = z ? (int) (getResources().getDisplayMetrics().density * 10.0f) : 0;
        this.b.setLayoutParams(layoutParams);
    }

    public void setValue(String str) {
        if (str == null) {
            str = "";
        }
        this.f = str;
        a();
    }
}
