package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class La extends AbstractC0390mk {
    public final TextView l;
    public final Ha m;
    public boolean n = true;

    public La(TextView textView) {
        this.l = textView;
        this.m = new Ha(textView);
    }

    @Override // defpackage.AbstractC0390mk
    public final void H(boolean z) {
        if (z) {
            TextView textView = this.l;
            textView.setTransformationMethod(M(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final void I(boolean z) {
        this.n = z;
        TextView textView = this.l;
        textView.setTransformationMethod(M(textView.getTransformationMethod()));
        textView.setFilters(m(textView.getFilters()));
    }

    @Override // defpackage.AbstractC0390mk
    public final TransformationMethod M(TransformationMethod transformationMethod) {
        if (this.n) {
            return ((transformationMethod instanceof Pa) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new Pa(transformationMethod);
        }
        return transformationMethod instanceof Pa ? ((Pa) transformationMethod).a : transformationMethod;
    }

    @Override // defpackage.AbstractC0390mk
    public final InputFilter[] m(InputFilter[] inputFilterArr) {
        if (!this.n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof Ha) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            Ha ha = this.m;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ha;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == ha) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final boolean t() {
        return this.n;
    }
}
