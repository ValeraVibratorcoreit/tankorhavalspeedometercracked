package defpackage;

import android.util.Log;
import ipc.fdbus.FdbusClient;
import ipc.fdbus.FdbusClientListener;
import ipc.fdbus.FdbusMessage;
import ipc.fdbus.SubscribeItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Rb implements FdbusClientListener {
    public final Lf a = Lf.a();
    public final Object b = new Object();
    public volatile FdbusClient c;
    public volatile boolean d;

    public final void a() {
        this.d = false;
        FdbusClient fdbusClient = this.c;
        this.c = null;
        if (fdbusClient != null) {
            try {
                fdbusClient.disconnect();
            } catch (Throwable th) {
                C0768yr.c("T500.FdbusReader", "Disconnect failed", th);
            }
            try {
                fdbusClient.destroy();
            } catch (Throwable th2) {
                C0768yr.c("T500.FdbusReader", "Destroy failed", th2);
            }
        }
    }

    @Override // ipc.fdbus.FdbusClientListener
    public final void onBroadcast(FdbusMessage fdbusMessage) {
        float f;
        int iRound;
        int i;
        if (this.d && fdbusMessage.code() == 256) {
            byte[] bArrByteArray = fdbusMessage.byteArray();
            Q0 q0 = null;
            if (bArrByteArray != null && bArrByteArray.length >= 10 && bArrByteArray[0] == 10) {
                boolean z = true;
                int i2 = 0;
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    if (i4 >= bArrByteArray.length || i2 > 28) {
                        z = false;
                        break;
                    }
                    int i5 = i4 + 1;
                    int i6 = bArrByteArray[i4];
                    i3 |= (i6 & 127) << i2;
                    if ((i6 & 128) == 0) {
                        i4 = i5;
                        break;
                    } else {
                        i2 += 7;
                        i4 = i5;
                    }
                }
                if (z && i3 >= 7 && i4 + i3 <= bArrByteArray.length && (i = bArrByteArray[i4 + 2] & 255) <= i3 - 7) {
                    int i7 = ((bArrByteArray[i4 + 4] & 255) << 16) | ((bArrByteArray[i4 + 5] & 255) << 8) | (bArrByteArray[i4 + 6] & 255);
                    byte[] bArr = new byte[i];
                    System.arraycopy(bArrByteArray, i4 + 7, bArr, 0, i);
                    q0 = new Q0(i7, bArr);
                }
            }
            if (q0 == null || q0.a != 273) {
                return;
            }
            byte[] bArr2 = (byte[]) q0.b;
            if (bArr2.length < 8) {
                return;
            }
            int i8 = (bArr2[6] & 255) | ((bArr2[5] & 255) << 8);
            if (i8 != 65535 && (iRound = Math.round((f = i8 / 8.0f))) >= 0 && iRound <= 8000) {
                synchronized (this.b) {
                    this.a.b.f(Float.valueOf(f));
                }
            }
        }
    }

    @Override // ipc.fdbus.FdbusClientListener
    public final void onGetEvent(FdbusMessage fdbusMessage) {
    }

    @Override // ipc.fdbus.FdbusClientListener
    public final void onOffline(int i) {
        String str = "Offline sid=" + i + "; Binder fallback will take over";
        C0768yr c0768yr = C0768yr.g;
        Log.w("T500.FdbusReader", str);
        C0768yr c0768yr2 = C0768yr.g;
        if (c0768yr2 != null) {
            c0768yr2.g("WARN", "T500.FdbusReader", str);
        }
    }

    @Override // ipc.fdbus.FdbusClientListener
    public final void onOnline(int i) {
        FdbusClient fdbusClient = this.c;
        if (!this.d || fdbusClient == null) {
            return;
        }
        ArrayList<SubscribeItem> arrayList = new ArrayList<>(1);
        arrayList.add(SubscribeItem.newEvent(256));
        C0768yr.e("T500.FdbusReader", "Online sid=" + i + " subscribeAccepted=" + fdbusClient.subscribe(arrayList));
    }

    @Override // ipc.fdbus.FdbusClientListener
    public final void onReply(FdbusMessage fdbusMessage) {
    }
}
