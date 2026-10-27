package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0265ii extends C2 {
    public final /* synthetic */ int g = 1;

    public /* synthetic */ C0265ii(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // defpackage.C2, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        switch (this.g) {
            case 0:
                super.setTextAppearance(context, i);
                if (Tf.S(context, R.attr.textAppearanceLineHeightEnabled, true)) {
                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC0638ul.s);
                    int iH = h(getContext(), typedArrayObtainStyledAttributes, 1, 2);
                    typedArrayObtainStyledAttributes.recycle();
                    if (iH >= 0) {
                        setLineHeight(iH);
                    }
                }
                break;
            default:
                super.setTextAppearance(context, i);
                break;
        }
    }

    public /* synthetic */ C0265ii(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
