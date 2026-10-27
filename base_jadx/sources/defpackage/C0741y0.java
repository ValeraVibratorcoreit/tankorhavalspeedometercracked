package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0741y0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0741y0(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                Tf.j("parcel", parcel);
                return new C0772z0(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                C0526r2 c0526r2 = new C0526r2(parcel);
                c0526r2.a = parcel.readByte() != 0;
                return c0526r2;
            case 2:
                return new C0589t3(parcel);
            case 3:
                return new C0620u3(parcel);
            case 4:
                U3 u3 = new U3();
                u3.i = 255;
                u3.k = -2;
                u3.l = -2;
                u3.m = -2;
                u3.t = Boolean.TRUE;
                u3.a = parcel.readInt();
                u3.b = (Integer) parcel.readSerializable();
                u3.c = (Integer) parcel.readSerializable();
                u3.d = (Integer) parcel.readSerializable();
                u3.e = (Integer) parcel.readSerializable();
                u3.f = (Integer) parcel.readSerializable();
                u3.g = (Integer) parcel.readSerializable();
                u3.h = (Integer) parcel.readSerializable();
                u3.i = parcel.readInt();
                u3.j = parcel.readString();
                u3.k = parcel.readInt();
                u3.l = parcel.readInt();
                u3.m = parcel.readInt();
                u3.o = parcel.readString();
                u3.p = parcel.readString();
                u3.q = parcel.readInt();
                u3.s = (Integer) parcel.readSerializable();
                u3.u = (Integer) parcel.readSerializable();
                u3.v = (Integer) parcel.readSerializable();
                u3.w = (Integer) parcel.readSerializable();
                u3.x = (Integer) parcel.readSerializable();
                u3.y = (Integer) parcel.readSerializable();
                u3.z = (Integer) parcel.readSerializable();
                u3.C = (Integer) parcel.readSerializable();
                u3.A = (Integer) parcel.readSerializable();
                u3.B = (Integer) parcel.readSerializable();
                u3.t = (Boolean) parcel.readSerializable();
                u3.n = (Locale) parcel.readSerializable();
                u3.D = (Boolean) parcel.readSerializable();
                return u3;
            case 5:
                return new C0282j5((C0020aj) parcel.readParcelable(C0020aj.class.getClassLoader()), (C0020aj) parcel.readParcelable(C0020aj.class.getClassLoader()), (C0256i8) parcel.readParcelable(C0256i8.class.getClassLoader()), (C0020aj) parcel.readParcelable(C0020aj.class.getClassLoader()), parcel.readInt());
            case 6:
                return new C0256i8(parcel.readLong());
            case 7:
                Lc lc = new Lc();
                lc.a = parcel.readString();
                lc.b = parcel.readInt();
                return lc;
            case 8:
                Pc pc = new Pc();
                pc.e = null;
                pc.f = new ArrayList();
                pc.g = new ArrayList();
                pc.a = parcel.createStringArrayList();
                pc.b = parcel.createStringArrayList();
                pc.c = (C0589t3[]) parcel.createTypedArray(C0589t3.CREATOR);
                pc.d = parcel.readInt();
                pc.e = parcel.readString();
                pc.f = parcel.createStringArrayList();
                pc.g = parcel.createTypedArrayList(C0620u3.CREATOR);
                pc.h = parcel.createTypedArrayList(Lc.CREATOR);
                return pc;
            case 9:
                return new Uc(parcel);
            case 10:
                Tf.j("inParcel", parcel);
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Tf.f(parcelable);
                return new Qf((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                Og og = new Og();
                og.a = parcel.readInt();
                og.b = parcel.readInt();
                og.c = parcel.readInt() == 1;
                return og;
            case 12:
                C0019ai c0019ai = new C0019ai(parcel);
                c0019ai.a = ((Integer) parcel.readValue(C0019ai.class.getClassLoader())).intValue();
                return c0019ai;
            case 13:
                return C0020aj.a(parcel.readInt(), parcel.readInt());
            case 14:
                Aj aj = new Aj(parcel);
                aj.a = parcel.readInt();
                return aj;
            case 15:
                return new ParcelImpl(parcel);
            case 16:
                C0395mp c0395mp = new C0395mp();
                c0395mp.a = parcel.readInt();
                c0395mp.b = parcel.readInt();
                c0395mp.d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    c0395mp.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0395mp;
            default:
                C0457op c0457op = new C0457op();
                c0457op.a = parcel.readInt();
                c0457op.b = parcel.readInt();
                int i2 = parcel.readInt();
                c0457op.c = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c0457op.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                c0457op.e = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    c0457op.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0457op.h = parcel.readInt() == 1;
                c0457op.i = parcel.readInt() == 1;
                c0457op.j = parcel.readInt() == 1;
                c0457op.g = parcel.readArrayList(C0395mp.class.getClassLoader());
                return c0457op;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C0772z0[i];
            case 1:
                return new C0526r2[i];
            case 2:
                return new C0589t3[i];
            case 3:
                return new C0620u3[i];
            case 4:
                return new U3[i];
            case 5:
                return new C0282j5[i];
            case 6:
                return new C0256i8[i];
            case 7:
                return new Lc[i];
            case 8:
                return new Pc[i];
            case 9:
                return new Uc[i];
            case 10:
                return new Qf[i];
            case 11:
                return new Og[i];
            case 12:
                return new C0019ai[i];
            case 13:
                return new C0020aj[i];
            case 14:
                return new Aj[i];
            case 15:
                return new ParcelImpl[i];
            case 16:
                return new C0395mp[i];
            default:
                return new C0457op[i];
        }
    }
}
