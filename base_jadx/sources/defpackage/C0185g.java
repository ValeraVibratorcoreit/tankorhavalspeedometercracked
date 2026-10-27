package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0185g implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0185g(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0216h.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new D4(parcel, classLoader);
            case 2:
                return new N5(parcel, classLoader);
            case 3:
                return new Q7(parcel, classLoader);
            case 4:
                return new Ph(parcel, classLoader);
            case 5:
                return new C0177fm(parcel, classLoader);
            case 6:
                return new Eo(parcel, classLoader);
            case 7:
                return new C0674vq(parcel, classLoader);
            default:
                return new Wq(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AbstractC0216h[i];
            case 1:
                return new D4[i];
            case 2:
                return new N5[i];
            case 3:
                return new Q7[i];
            case 4:
                return new Ph[i];
            case 5:
                return new C0177fm[i];
            case 6:
                return new Eo[i];
            case 7:
                return new C0674vq[i];
            default:
                return new Wq[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0216h.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new D4(parcel, (ClassLoader) null);
            case 2:
                return new N5(parcel, null);
            case 3:
                return new Q7(parcel, null);
            case 4:
                return new Ph(parcel, null);
            case 5:
                return new C0177fm(parcel, null);
            case 6:
                return new Eo(parcel, (ClassLoader) null);
            case 7:
                return new C0674vq(parcel, null);
            default:
                return new Wq(parcel, null);
        }
    }
}
