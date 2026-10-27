package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0674vq extends AbstractC0216h {
    public static final Parcelable.Creator<C0674vq> CREATOR = new C0185g(7);
    public CharSequence c;
    public boolean d;

    public C0674vq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
    }

    @Override // defpackage.AbstractC0216h, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
