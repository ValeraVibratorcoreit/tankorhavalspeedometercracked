package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class X1 {
    public final TextView a;
    public final C0308k0 b;

    public X1(TextView textView) {
        this.a = textView;
        this.b = new C0308k0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((AbstractC0390mk) this.b.b).m(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, AbstractC0700wl.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((AbstractC0390mk) this.b.b).H(z);
    }

    public final void d(boolean z) {
        ((AbstractC0390mk) this.b.b).I(z);
    }
}
