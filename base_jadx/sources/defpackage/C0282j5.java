package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0282j5 implements Parcelable {
    public static final Parcelable.Creator<C0282j5> CREATOR = new C0741y0(5);
    public final C0020aj a;
    public final C0020aj b;
    public final C0256i8 c;
    public final C0020aj d;
    public final int e;
    public final int f;
    public final int g;

    public C0282j5(C0020aj c0020aj, C0020aj c0020aj2, C0256i8 c0256i8, C0020aj c0020aj3, int i) {
        Objects.requireNonNull(c0020aj, "start cannot be null");
        Objects.requireNonNull(c0020aj2, "end cannot be null");
        Objects.requireNonNull(c0256i8, "validator cannot be null");
        this.a = c0020aj;
        this.b = c0020aj2;
        this.d = c0020aj3;
        this.e = i;
        this.c = c0256i8;
        if (c0020aj3 != null && c0020aj.a.compareTo(c0020aj3.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0020aj3 != null && c0020aj3.a.compareTo(c0020aj2.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > Nr.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = c0020aj.d(c0020aj2) + 1;
        this.f = (c0020aj2.c - c0020aj.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0282j5)) {
            return false;
        }
        C0282j5 c0282j5 = (C0282j5) obj;
        return this.a.equals(c0282j5.a) && this.b.equals(c0282j5.b) && Objects.equals(this.d, c0282j5.d) && this.e == c0282j5.e && this.c.equals(c0282j5.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
