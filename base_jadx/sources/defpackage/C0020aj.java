package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: renamed from: aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0020aj implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0020aj> CREATOR = new C0741y0(13);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public C0020aj(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = Nr.b(calendar);
        this.a = calendarB;
        this.b = calendarB.get(2);
        this.c = calendarB.get(1);
        this.d = calendarB.getMaximum(7);
        this.e = calendarB.getActualMaximum(5);
        this.f = calendarB.getTimeInMillis();
    }

    public static C0020aj a(int i, int i2) {
        Calendar calendarD = Nr.d(null);
        calendarD.set(1, i);
        calendarD.set(2, i2);
        return new C0020aj(calendarD);
    }

    public static C0020aj b(long j) {
        Calendar calendarD = Nr.d(null);
        calendarD.setTimeInMillis(j);
        return new C0020aj(calendarD);
    }

    public final String c() {
        if (this.g == null) {
            this.g = Nr.a("yMMMM", Locale.getDefault()).format(new Date(this.a.getTimeInMillis()));
        }
        return this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((C0020aj) obj).a);
    }

    public final int d(C0020aj c0020aj) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0020aj.b - this.b) + ((c0020aj.c - this.c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0020aj)) {
            return false;
        }
        C0020aj c0020aj = (C0020aj) obj;
        return this.b == c0020aj.b && this.c == c0020aj.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
