package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.DownloadActivity2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    public /* synthetic */ H9(Kf kf, Context context, String str, String str2) {
        this.a = 2;
        this.e = kf;
        this.c = context;
        this.b = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = 100;
        int i = -1;
        String strY = "";
        int i2 = 2;
        Object obj = this.e;
        String str = this.d;
        String str2 = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity2.G;
                DownloadActivity2 downloadActivity2 = (DownloadActivity2) obj;
                downloadActivity2.getClass();
                String string = ((JSONObject) obj2).toString();
                Pj pj = new Pj();
                C0043bb c0043bbA = C0043bb.a(DownloadActivity2.G, string);
                H0 h0 = new H0();
                h0.q(str2);
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
                                    FileOutputStream fileOutputStreamOpenFileOutput = downloadActivity2.openFileOutput(str, 0);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        long jN = jl.n();
                                        long j2 = 0;
                                        while (true) {
                                            int i3 = inputStreamV.read(bArr);
                                            if (i3 != -1) {
                                                fileOutputStreamOpenFileOutput.write(bArr, 0, i3);
                                                j2 += (long) i3;
                                                downloadActivity2.E.post(new F9((int) ((j2 * j) / jN), downloadActivity2, 1));
                                                j = 100;
                                            } else {
                                                downloadActivity2.E.post(new I9(downloadActivity2, str, 1));
                                                if (fileOutputStreamOpenFileOutput != null) {
                                                    fileOutputStreamOpenFileOutput.close();
                                                }
                                                inputStreamV.close();
                                            }
                                            try {
                                                inputStreamV.close();
                                                throw th;
                                            } catch (Throwable th) {
                                                th.addSuppressed(th);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        if (fileOutputStreamOpenFileOutput == null) {
                                            throw th2;
                                        }
                                        try {
                                            fileOutputStreamOpenFileOutput.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    inputStreamV.close();
                                    throw th4;
                                }
                            } catch (Exception e) {
                                downloadActivity2.F(e, "sendDownloadRequest()");
                                downloadActivity2.E.post(new RunnableC0591t5(downloadActivity2, 4));
                            }
                        } else {
                            downloadActivity2.E.post(new I9(downloadActivity2, jl.y(), 2));
                        }
                        c0117dnC.close();
                        return;
                    } catch (Throwable th5) {
                        try {
                            c0117dnC.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Exception e2) {
                    downloadActivity2.F(e2, "sendDownloadRequest()");
                    downloadActivity2.E.post(new RunnableC0591t5(downloadActivity2, 4));
                    return;
                }
            case 1:
                C0388mi c0388mi2 = K9.d0;
                K9 k9 = (K9) obj;
                k9.getClass();
                String string2 = ((JSONObject) obj2).toString();
                Pj pj2 = new Pj();
                C0043bb c0043bbA2 = C0043bb.a(K9.d0, string2);
                H0 h1 = new H0();
                h1.q(str2);
                h1.j("POST", c0043bbA2);
                try {
                    C0117dn c0117dnC2 = new Dl(pj2, h1.a()).c();
                    try {
                        boolean zW2 = c0117dnC2.w();
                        Jl jl2 = c0117dnC2.g;
                        if (!zW2) {
                            if (jl2 != null) {
                                try {
                                    strY = jl2.y();
                                } catch (Exception e3) {
                                    k9.P(e3, "processErrorResponse()");
                                }
                            }
                            k9.Q(new J9(k9, strY, i2));
                            break;
                        } else {
                            try {
                                InputStream inputStreamV2 = jl2.x().v();
                                try {
                                    FileOutputStream fileOutputStreamOpenFileOutput2 = k9.c0.openFileOutput(str, 0);
                                    try {
                                        byte[] bArr2 = new byte[4096];
                                        long jN2 = jl2.n();
                                        long j3 = 0;
                                        while (true) {
                                            int i4 = inputStreamV2.read(bArr2);
                                            if (i4 != i) {
                                                fileOutputStreamOpenFileOutput2.write(bArr2, 0, i4);
                                                j3 += (long) i4;
                                                k9.Q(new F9((int) ((j3 * 100) / jN2), k9, 2));
                                                i = -1;
                                            } else {
                                                k9.Q(new J9(k9, str, 1));
                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                    fileOutputStreamOpenFileOutput2.close();
                                                }
                                                inputStreamV2.close();
                                            }
                                            try {
                                                inputStreamV2.close();
                                                throw th;
                                            } catch (Throwable th7) {
                                                th.addSuppressed(th7);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        if (fileOutputStreamOpenFileOutput2 == null) {
                                            throw th8;
                                        }
                                        try {
                                            fileOutputStreamOpenFileOutput2.close();
                                            throw th8;
                                        } catch (Throwable th9) {
                                            th8.addSuppressed(th9);
                                            throw th8;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    inputStreamV2.close();
                                    throw th10;
                                }
                            } catch (Exception e4) {
                                k9.P(e4, "sendDownloadRequest()");
                                k9.Q(new RunnableC0591t5(k9, 5));
                            }
                        }
                        c0117dnC2.close();
                        return;
                    } catch (Throwable th11) {
                        try {
                            c0117dnC2.close();
                            throw th11;
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                            throw th11;
                        }
                    }
                } catch (Exception e5) {
                    k9.P(e5, "sendDownloadRequest()");
                    k9.Q(new RunnableC0591t5(k9, 5));
                    return;
                }
            default:
                Context context = (Context) obj2;
                Kf kf = (Kf) obj;
                kf.getClass();
                String strReplace = "yandexmusic://playlist/daily?play=1";
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
                    if (launchIntentForPackage == null) {
                        C0768yr.e("T500.ACTIVITY", str2 + " is not installed");
                        return;
                    }
                    if (str.equals("ym")) {
                        String string3 = kf.b.getString("ymUser", "");
                        String string4 = kf.b.getString("ymPlayMode", "yandexmusic://playlist/daily?play=1");
                        String string5 = kf.b.getString("ymListId", "3");
                        if (!string4.contains("{ВашЛогин}") || !string3.isEmpty()) {
                            strReplace = string4.replace("{ВашЛогин}", string3).replace("{list_id}", string5);
                        }
                        launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(strReplace));
                        C0768yr.e("T500.ACTIVITY", "Yandex Music user=" + string3);
                        C0768yr.e("T500.ACTIVITY", "Yandex Music uri=" + strReplace);
                    }
                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                    activityOptionsMakeBasic.setLaunchDisplayId(0);
                    launchIntentForPackage.addFlags(268435460);
                    context.startActivity(launchIntentForPackage, activityOptionsMakeBasic.toBundle());
                    str.equals("ym.auto");
                    return;
                } catch (Exception e6) {
                    Toast.makeText(context, "ERROR " + e6, 1).show();
                    C0768yr.c("T500.ERROR", "ERROR in startMusicPlay()", e6);
                    return;
                }
        }
    }

    public /* synthetic */ H9(Object obj, JSONObject jSONObject, String str, int i) {
        this.a = i;
        this.e = obj;
        this.b = "https://tankspeedometer.ru:9443/api/v3/cars/download-app";
        this.c = jSONObject;
        this.d = str;
    }
}
