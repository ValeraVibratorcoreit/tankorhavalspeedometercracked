package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0589t3 implements Parcelable {
    public static final Parcelable.Creator<C0589t3> CREATOR = new C0741y0(2);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public C0589t3(C0558s3 c0558s3) {
        int size = c0558s3.a.size();
        this.a = new int[size * 6];
        if (!c0558s3.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Zc zc = (Zc) c0558s3.a.get(i2);
            int i3 = i + 1;
            this.a[i] = zc.a;
            ArrayList arrayList = this.b;
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = zc.b;
            arrayList.add(abstractComponentCallbacksC0784zc != null ? abstractComponentCallbacksC0784zc.e : null);
            int[] iArr = this.a;
            iArr[i3] = zc.c ? 1 : 0;
            iArr[i + 2] = zc.d;
            iArr[i + 3] = zc.e;
            int i4 = i + 5;
            iArr[i + 4] = zc.f;
            i += 6;
            iArr[i4] = zc.g;
            this.c[i2] = zc.h.ordinal();
            this.d[i2] = zc.i.ordinal();
        }
        this.e = c0558s3.f;
        this.f = c0558s3.h;
        this.g = c0558s3.r;
        this.h = c0558s3.i;
        this.i = c0558s3.j;
        this.j = c0558s3.k;
        this.k = c0558s3.l;
        this.l = c0558s3.m;
        this.m = c0558s3.n;
        this.n = c0558s3.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public C0589t3(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
