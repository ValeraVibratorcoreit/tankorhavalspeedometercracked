package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class Ma extends AbstractC0390mk {
    public final La l;

    public Ma(TextView textView) {
        this.l = new La(textView);
    }

    @Override // defpackage.AbstractC0390mk
    public final void H(boolean z) {
        if (!(C0782za.k != null)) {
            return;
        }
        this.l.H(z);
    }

    @Override // defpackage.AbstractC0390mk
    public final void I(boolean z) {
        boolean z2 = !(C0782za.k != null);
        La la = this.l;
        if (z2) {
            la.n = z;
        } else {
            la.I(z);
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final TransformationMethod M(TransformationMethod transformationMethod) {
        return (C0782za.k != null) ^ true ? transformationMethod : this.l.M(transformationMethod);
    }

    @Override // defpackage.AbstractC0390mk
    public final InputFilter[] m(InputFilter[] inputFilterArr) {
        return (C0782za.k != null) ^ true ? inputFilterArr : this.l.m(inputFilterArr);
    }

    @Override // defpackage.AbstractC0390mk
    public final boolean t() {
        return this.l.n;
    }
}
