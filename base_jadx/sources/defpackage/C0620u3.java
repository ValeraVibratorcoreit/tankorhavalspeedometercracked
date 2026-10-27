package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620u3 implements Parcelable {
    public static final Parcelable.Creator<C0620u3> CREATOR = new C0741y0(3);
    public final ArrayList a;
    public final ArrayList b;

    public C0620u3(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(C0589t3.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
