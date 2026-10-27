package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class U4 implements Mm {
    public final /* synthetic */ int a;
    public final N9 b;

    public /* synthetic */ U4(N9 n9, int i) {
        this.a = i;
        this.b = n9;
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                N9 n9 = this.b;
                return n9.a(new K2((ByteBuffer) obj, (ArrayList) n9.d, n9.c, 13), i, i2, c0544rk, N9.j);
            default:
                N9 n10 = this.b;
                return n10.a(new K2((ParcelFileDescriptor) obj, (ArrayList) n10.d, n10.c), i, i2, c0544rk, N9.j);
        }
    }

    @Override // defpackage.Mm
    public final boolean b(Object obj, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    this.b.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
