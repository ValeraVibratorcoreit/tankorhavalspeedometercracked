package defpackage;

import android.os.Binder;
import android.os.Parcel;

/* JADX INFO: renamed from: ge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0200ge extends Binder {
    public final /* synthetic */ C0291je a;

    public BinderC0200ge(C0291je c0291je) {
        this.a = c0291je;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            if (parcel2 != null) {
                parcel2.writeString("com.gwm.android.adapter.IDataChangedListener");
            }
            return true;
        }
        try {
            parcel.enforceInterface("com.gwm.android.adapter.IDataChangedListener");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                this.a.b(string, string2);
            }
            return true;
        } catch (Exception e) {
            C0768yr.b("T500.GwmReader", "onTransact error: " + e.getMessage());
            return false;
        }
    }
}
