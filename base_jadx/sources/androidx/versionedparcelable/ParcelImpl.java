package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C0275is;
import defpackage.C0741y0;
import defpackage.InterfaceC0305js;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0741y0(15);
    public final InterfaceC0305js a;

    public ParcelImpl(Parcel parcel) {
        this.a = new C0275is(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0275is(parcel).i(this.a);
    }
}
