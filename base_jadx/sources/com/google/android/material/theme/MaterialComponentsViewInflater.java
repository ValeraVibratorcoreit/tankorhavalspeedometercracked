package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0638ul;
import defpackage.Br;
import defpackage.C0050bi;
import defpackage.C0126e2;
import defpackage.C0142ei;
import defpackage.C0265ii;
import defpackage.C0525r1;
import defpackage.C0587t1;
import defpackage.C0649v1;
import defpackage.C2;
import defpackage.J2;
import defpackage.Nh;
import defpackage.R6;
import defpackage.Td;
import defpackage.Tf;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends J2 {
    @Override // defpackage.J2
    public final C0525r1 a(Context context, AttributeSet attributeSet) {
        return new Nh(context, attributeSet);
    }

    @Override // defpackage.J2
    public final C0587t1 b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.J2
    public final C0649v1 c(Context context, AttributeSet attributeSet) {
        return new C0050bi(context, attributeSet);
    }

    @Override // defpackage.J2
    public final C0126e2 d(Context context, AttributeSet attributeSet) {
        C0142ei c0142ei = new C0142ei(Td.Q(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0142ei.getContext();
        TypedArray typedArrayZ = AbstractC0390mk.z(context2, attributeSet, AbstractC0638ul.q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayZ.hasValue(0)) {
            R6.c(c0142ei, Br.u(context2, typedArrayZ, 0));
        }
        c0142ei.f = typedArrayZ.getBoolean(1, false);
        typedArrayZ.recycle();
        return c0142ei;
    }

    @Override // defpackage.J2
    public final C2 e(Context context, AttributeSet attributeSet) {
        C0265ii c0265ii = new C0265ii(Td.Q(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0265ii.getContext();
        if (Tf.S(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0638ul.t;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iH = C0265ii.h(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iH == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0638ul.s);
                    int iH2 = C0265ii.h(c0265ii.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iH2 >= 0) {
                        c0265ii.setLineHeight(iH2);
                    }
                }
            }
        }
        return c0265ii;
    }
}
