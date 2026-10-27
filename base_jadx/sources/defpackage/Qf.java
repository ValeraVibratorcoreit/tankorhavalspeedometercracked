package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Qf implements Parcelable {
    public static final Parcelable.Creator<Qf> CREATOR = new C0741y0(10);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public Qf(IntentSender intentSender, Intent intent, int i, int i2) {
        Tf.j("intentSender", intentSender);
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Tf.j("dest", parcel);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
