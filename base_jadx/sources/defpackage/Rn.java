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
public final class Rn extends Sn {
    public TextView g;
    public Qn h;
    public CharSequence[] i;
    public CharSequence[] j;
    public String k;

    public Rn(Context context) {
        super(context);
        this.k = "";
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
        this.g.setSingleLine(true);
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(this.g);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ts_ic_dropdown);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (getResources().getDisplayMetrics().density * 28.0f), (int) (getResources().getDisplayMetrics().density * 28.0f));
        layoutParams.setMarginStart((int) (getResources().getDisplayMetrics().density * 4.0f));
        linearLayout.addView(imageView, layoutParams);
        this.d.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0669vl.b);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0 && resourceId2 != 0) {
                this.i = getResources().getTextArray(resourceId);
                this.j = getResources().getTextArray(resourceId2);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setOnClickListener(new ViewOnClickListenerC0069c6(this, 8));
    }

    public String getValue() {
        return this.k;
    }

    public void setOnValueChanged(Qn qn) {
        this.h = qn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public void setValue(String str) {
        ?? r5 = str;
        if (str == null) {
            r5 = "";
        }
        this.k = r5;
        ?? r0 = this.g;
        if (this.i != null && this.j != null) {
            int i = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.j;
                if (i >= charSequenceArr.length || i >= this.i.length) {
                    break;
                }
                if (charSequenceArr[i].toString().equals(r5)) {
                    r5 = this.i[i];
                    break;
                }
                i++;
            }
        }
        r0.setText(r5);
    }
}
