package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0177fm extends AbstractC0216h {
    public static final Parcelable.Creator<C0177fm> CREATOR = new C0185g(5);
    public Parcelable c;

    public C0177fm(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? Wl.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.AbstractC0216h, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
