package defpackage;

import android.net.wifi.WifiConfiguration;
import android.widget.Toast;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ B9(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                DownloadActivity downloadActivity = (DownloadActivity) this.b;
                P2 p2 = (P2) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                C0388mi c0388mi = DownloadActivity.O;
                downloadActivity.getClass();
                boolean zF = downloadActivity.F(p2.a, Tf.H("password"), Tf.H("authcode"));
                synchronized (downloadActivity.N) {
                    try {
                        if (!zF) {
                            downloadActivity.M.add(p2.a);
                        } else if (downloadActivity.J()) {
                            downloadActivity.G.post(new RunnableC0719x9(downloadActivity, 2));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                countDownLatch.countDown();
                return;
            case 1:
                C0388mi c0388mi2 = DownloadActivity.O;
                DownloadActivity downloadActivity2 = (DownloadActivity) this.b;
                downloadActivity2.getClass();
                String string = ((JSONObject) this.d).toString();
                Pj pj = new Pj();
                C0043bb c0043bbA = C0043bb.a(DownloadActivity.O, string);
                H0 h0 = new H0();
                h0.q((String) this.c);
                h0.j("POST", c0043bbA);
                try {
                    C0117dn c0117dnC = new Dl(pj, h0.a()).c();
                    try {
                        boolean zW = c0117dnC.w();
                        Jl jl = c0117dnC.g;
                        if (zW) {
                            try {
                                InputStream inputStreamV = jl.x().v();
                                try {
                                    FileOutputStream fileOutputStreamOpenFileOutput = downloadActivity2.openFileOutput("TankSpeedometer.apk", 0);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        long jN = jl.n();
                                        long j = 0;
                                        while (true) {
                                            int i3 = inputStreamV.read(bArr);
                                            if (i3 != -1) {
                                                fileOutputStreamOpenFileOutput.write(bArr, 0, i3);
                                                j += (long) i3;
                                                downloadActivity2.G.post(new F9((int) ((100 * j) / jN), downloadActivity2, i));
                                            } else {
                                                downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 4));
                                                if (fileOutputStreamOpenFileOutput != null) {
                                                    fileOutputStreamOpenFileOutput.close();
                                                }
                                                inputStreamV.close();
                                            }
                                            try {
                                                inputStreamV.close();
                                                break;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        if (fileOutputStreamOpenFileOutput != null) {
                                            try {
                                                fileOutputStreamOpenFileOutput.close();
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            break;
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th5) {
                                    inputStreamV.close();
                                    throw th5;
                                }
                            } catch (Exception e) {
                                downloadActivity2.H(e, "sendDownloadRequest()");
                                downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, i2));
                            }
                        } else {
                            downloadActivity2.G.post(new E9(downloadActivity2, jl.y(), 0));
                        }
                        c0117dnC.close();
                        return;
                    } catch (Throwable th6) {
                        try {
                            c0117dnC.close();
                            break;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Exception e2) {
                    downloadActivity2.H(e2, "sendDownloadRequest()");
                    downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, i2));
                    return;
                }
            case 2:
                S3 s3 = (S3) this.b;
                Ud ud = (Ud) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                s3.getClass();
                try {
                    C0198gc c0198gcL = Td.l(s3.b);
                    if (c0198gcL == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0167fc c0167fc = (C0167fc) ((InterfaceC0751ya) c0198gcL.b);
                    synchronized (c0167fc.d) {
                        c0167fc.f = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC0751ya) c0198gcL.b).a(new Ba(ud, threadPoolExecutor));
                    return;
                } catch (Throwable th8) {
                    ud.X(th8);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                C0646ut c0646ut = (C0646ut) this.b;
                c0646ut.getClass();
                String value = ((Pn) this.c).getValue();
                String value2 = ((Pn) this.d).getValue();
                if (value.isEmpty() || value2.isEmpty()) {
                    Toast.makeText(c0646ut.I(), R.string.text_empty_pass_name_warn, 1).show();
                    return;
                }
                if (c0646ut.U == null) {
                    return;
                }
                WifiConfiguration wifiConfiguration = new WifiConfiguration();
                wifiConfiguration.SSID = Vo.g("\"", value, "\"");
                wifiConfiguration.preSharedKey = Vo.g("\"", value2, "\"");
                int iAddNetwork = c0646ut.U.addNetwork(wifiConfiguration);
                c0646ut.U.disconnect();
                c0646ut.U.enableNetwork(iAddNetwork, true);
                c0646ut.U.reconnect();
                Toast.makeText(c0646ut.I(), c0646ut.m(R.string.text_wifi_added_msg, value), 1).show();
                return;
        }
    }
}
