package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0231he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0291je b;

    public /* synthetic */ RunnableC0231he(C0291je c0291je, int i) {
        this.a = i;
        this.b = c0291je;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinder;
        switch (this.a) {
            case 0:
                C0291je c0291je = this.b;
                if (c0291je.d) {
                    return;
                }
                c0291je.a();
                return;
            case 1:
                C0291je c0291je2 = this.b;
                IBinder iBinder2 = c0291je2.b;
                if (iBinder2 != null && c0291je2.c != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        try {
                            parcelObtain.writeInterfaceToken("com.gwm.android.adapter.IGwmAdapterService");
                            parcelObtain.writeString(c0291je2.a.getPackageName());
                            parcelObtain.writeStrongBinder(c0291je2.c);
                            iBinder2.transact(4, parcelObtain, parcelObtain2, 1);
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            parcelObtain2.recycle();
                            throw th;
                        }
                    } catch (Exception e) {
                        C0768yr.b("T500.GwmReader", "transactUnregister error: " + e.getMessage());
                    }
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    break;
                }
                C0262ie c0262ie = c0291je2.h;
                if (c0262ie != null && (iBinder = c0291je2.b) != null) {
                    try {
                        iBinder.unlinkToDeath(c0262ie, 0);
                        break;
                    } catch (Exception unused) {
                    }
                }
                c0291je2.d = false;
                c0291je2.g.clear();
                if (c0291je2.i != null) {
                    C0096d2.P(false);
                }
                c0291je2.b = null;
                c0291je2.c = null;
                c0291je2.h = null;
                c0291je2.e.quitSafely();
                C0768yr.e("T500.GwmReader", "Отключено");
                return;
            default:
                this.b.a();
                return;
        }
    }
}
