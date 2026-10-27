package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Pn extends Sn {
    public TextView g;
    public On h;
    public String i;
    public int j;
    public CharSequence k;

    public Pn(Context context) {
        super(context);
        this.i = "";
        this.j = 1;
        setup(null);
    }

    private void setup(AttributeSet attributeSet) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.g = textView;
        textView.setTextColor(getResources().getColor(R.color.ts_color_text_secondary));
        this.g.setTextSize(27.0f);
        this.g.setGravity(8388613);
        this.g.setMaxWidth((int) (getResources().getDisplayMetrics().density * 360.0f));
        int i = 1;
        this.g.setSingleLine(true);
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(this.g);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ts_ic_edit);
        int i2 = (int) (getResources().getDisplayMetrics().density * 28.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.setMarginStart((int) (getResources().getDisplayMetrics().density * 8.0f));
        linearLayout.addView(imageView, layoutParams);
        this.d.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0669vl.b);
            int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
            if (i3 == 1) {
                i = 2;
            } else if (i3 == 2) {
                i = 8194;
            } else if (i3 == 3) {
                i = 4098;
            } else if (i3 == 4) {
                i = 129;
            }
            this.j = i;
            typedArrayObtainStyledAttributes.recycle();
        }
        setOnClickListener(new ViewOnClickListenerC0069c6(this, 7));
    }

    public String getValue() {
        return this.i;
    }

    public void setHint(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setInputTypeFlags(int i) {
        this.j = i;
    }

    public void setOnValueChanged(On on) {
        this.h = on;
    }

    public void setValue(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
        this.g.setText(str);
    }
}
