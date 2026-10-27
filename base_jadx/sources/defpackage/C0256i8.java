package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0256i8 implements Parcelable {
    public static final Parcelable.Creator<C0256i8> CREATOR = new C0741y0(6);
    public final long a;

    public C0256i8(long j) {
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0256i8) && this.a == ((C0256i8) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
