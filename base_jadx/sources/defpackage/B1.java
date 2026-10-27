package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.jni.JniUtils;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ B1(E3 e3, String[] strArr, String str) {
        this.a = 2;
        this.b = e3;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        String str2;
        String str3;
        String strY;
        Throwable th;
        String str4 = "lang";
        String str5 = "digits";
        String str6 = "";
        String str7 = "token";
        int i = 0;
        int i2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) obj;
                C1 c1 = (C1) obj2;
                c1.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    c1.a();
                }
            case 1:
                E3 e3 = (E3) obj2;
                new Handler(Looper.getMainLooper()).post(new RunnableC0744y3(0, e3, (Button) obj, F4.x(e3.I(), e3.T())));
                return;
            case 2:
                String[] strArr = Ud.a;
                String str8 = " ";
                E3 e4 = (E3) obj2;
                File filesDir = e4.I().getFilesDir();
                boolean z = true;
                int i3 = 0;
                while (i3 < 4) {
                    String str9 = strArr[i3];
                    String str10 = str6;
                    String[] strArr2 = strArr;
                    String strG = Vo.g("image_", str9, ".png");
                    boolean z2 = z;
                    StringBuilder sb = new StringBuilder();
                    int i4 = i3;
                    String str11 = (String) obj;
                    sb.append(str11);
                    Object obj3 = obj;
                    sb.append("_");
                    sb.append(str9);
                    sb.append(".png");
                    String string = sb.toString();
                    File file = new File(filesDir, strG);
                    Context contextI = e4.I();
                    C0388mi c0388mi = Om.a;
                    File file2 = filesDir;
                    String str12 = str8;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("vin", Tf.F(null, "persist.gwm.vehicle.vin"));
                        jSONObject.put("version", Tf.x());
                        jSONObject.put("password", Tf.H("password"));
                        jSONObject.put(str7, Tf.H("authcode"));
                        jSONObject.put("resource", string);
                        jSONObject.put(str5, JniUtils.getData(contextI));
                        jSONObject.put(str4, Locale.getDefault().getLanguage());
                        String string2 = jSONObject.toString();
                        Oj oj = new Oj();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        Tf.j("unit", timeUnit);
                        str = str4;
                        str2 = str5;
                        str3 = str7;
                        try {
                            oj.r = Rr.b(30L, timeUnit);
                            oj.s = Rr.b(30L, timeUnit);
                            Pj pj = new Pj(oj);
                            C0043bb c0043bbA = C0043bb.a(Om.a, string2);
                            H0 h0 = new H0();
                            h0.q("https://tankspeedometer.ru:9443/api/v3/cars/resource");
                            h0.j("POST", c0043bbA);
                            C0117dn c0117dnC = new Dl(pj, h0.a()).c();
                            try {
                                boolean zW = c0117dnC.w();
                                Jl jl = c0117dnC.g;
                                if (zW) {
                                    InputStream inputStreamV = jl.x().v();
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            byte[] bArr = new byte[8192];
                                            while (true) {
                                                int i5 = inputStreamV.read(bArr);
                                                if (i5 == -1) {
                                                    fileOutputStream.close();
                                                    inputStreamV.close();
                                                    C0768yr.e("T500.ResourceDL", string + " was downloaded to " + file.getName());
                                                    c0117dnC.close();
                                                    e4.T().edit().putString("bg_time_" + str9 + "_img", strG).apply();
                                                    try {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append(str11);
                                                        str12 = str12;
                                                        try {
                                                            sb2.append(str12);
                                                            sb2.append(str9);
                                                            jSONObject2.put("shortDesc", sb2.toString());
                                                            jSONObject2.put("longDesc", str11 + str12 + str9);
                                                            jSONObject2.put("imageFileName", strG);
                                                            jSONObject2.put("protected", true);
                                                            file2 = file2;
                                                            try {
                                                                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file2, Ud.u(strG)));
                                                                fileOutputStream2.write(jSONObject2.toString().getBytes());
                                                                fileOutputStream2.close();
                                                            } catch (Exception e) {
                                                                e = e;
                                                                C0768yr.c("T500.Images", "Error saving JSON for " + strG, e);
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            file2 = file2;
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        file2 = file2;
                                                        str12 = str12;
                                                    }
                                                    z = z2;
                                                    i3 = i4 + 1;
                                                    filesDir = file2;
                                                    str5 = str2;
                                                    strArr = strArr2;
                                                    obj = obj3;
                                                    str4 = str;
                                                    str7 = str3;
                                                    str8 = str12;
                                                    str6 = str10;
                                                    break;
                                                } else {
                                                    try {
                                                        fileOutputStream.write(bArr, 0, i5);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        try {
                                                            try {
                                                                fileOutputStream.close();
                                                                break;
                                                            } catch (Throwable th3) {
                                                                th.addSuppressed(th3);
                                                            }
                                                            throw th;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                    }
                                                }
                                                Throwable th5 = th;
                                                try {
                                                    inputStreamV.close();
                                                    break;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                }
                                                throw th5;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        file2 = file2;
                                        str12 = str12;
                                    }
                                } else {
                                    file2 = file2;
                                    str12 = str12;
                                    if (jl != null) {
                                        try {
                                            strY = jl.y();
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } else {
                                        strY = str10;
                                    }
                                    C0768yr.e("T500.ResourceDL", "Server answer: " + strY);
                                    try {
                                        c0117dnC.close();
                                    } catch (Exception e6) {
                                        e = e6;
                                        C0768yr.c("T500.ResourceDL", "Error downloading to file: " + string, e);
                                        z = false;
                                        i3 = i4 + 1;
                                        filesDir = file2;
                                        str5 = str2;
                                        strArr = strArr2;
                                        obj = obj3;
                                        str4 = str;
                                        str7 = str3;
                                        str8 = str12;
                                        str6 = str10;
                                    }
                                    z = false;
                                    i3 = i4 + 1;
                                    filesDir = file2;
                                    str5 = str2;
                                    strArr = strArr2;
                                    obj = obj3;
                                    str4 = str;
                                    str7 = str3;
                                    str8 = str12;
                                    str6 = str10;
                                }
                                th = th9;
                            } catch (Throwable th10) {
                                th = th10;
                                file2 = file2;
                                str12 = str12;
                            }
                            Throwable th11 = th;
                            try {
                                c0117dnC.close();
                                break;
                            } catch (Throwable th12) {
                                th11.addSuppressed(th12);
                            }
                            throw th11;
                        } catch (Exception e7) {
                            e = e7;
                            file2 = file2;
                            str12 = str12;
                            C0768yr.c("T500.ResourceDL", "Error downloading to file: " + string, e);
                            z = false;
                            i3 = i4 + 1;
                            filesDir = file2;
                            str5 = str2;
                            strArr = strArr2;
                            obj = obj3;
                            str4 = str;
                            str7 = str3;
                            str8 = str12;
                            str6 = str10;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        str = str4;
                        str2 = str5;
                        str3 = str7;
                    }
                }
                new Handler(Looper.getMainLooper()).post(new F0(e4, z));
                return;
            case 3:
                Uri uri = (Uri) obj;
                Q3 q3 = (Q3) obj2;
                q3.getClass();
                try {
                    if (q3.U.n(uri)) {
                        q3.U.r(uri);
                        q3.c0(new O3(q3, 3));
                    } else {
                        q3.c0(new O3(q3, 2));
                    }
                    return;
                } catch (Exception e9) {
                    C0768yr.c("T500.Backup", "Restore from URI failed", e9);
                    q3.c0(new P3(q3, e9, i));
                    return;
                }
            case 4:
                Q3 q4 = (Q3) obj2;
                Q0 q0 = new Q0(q4.I());
                q0.f(R.string.ts_backup_success_title);
                ((M0) q0.b).f = q4.m(R.string.ts_backup_success_msg, ((File) obj).getAbsolutePath());
                q0.e(R.string.text_ok_btn_text, null);
                q0.g();
                return;
            case 5:
                Toast.makeText(((Activity) obj2).getApplicationContext(), (String) obj, 1).show();
                return;
            case 6:
                P6 p6 = (P6) obj2;
                Tf.j("this$0", p6);
                C0021ak c0021ak = (C0021ak) obj;
                Tf.j("$dispatcher", c0021ak);
                int i6 = P6.r;
                p6.a.a(new I6(c0021ak, p6));
                return;
            case 7:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                C0388mi c0388mi2 = DownloadActivity.O;
                DownloadActivity downloadActivity = (DownloadActivity) obj2;
                downloadActivity.getClass();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("vin", Tf.F(downloadActivity, "persist.gwm.vehicle.vin"));
                    jSONObject3.put("password", Tf.H("password"));
                    jSONObject3.put("token", "");
                    jSONObject3.put("verification", "true");
                    jSONObject3.put("digits", JniUtils.getData(downloadActivity));
                    jSONObject3.put("lang", downloadActivity.getResources().getConfiguration().locale.getLanguage());
                } catch (JSONException e10) {
                    downloadActivity.H(e10, "isCarValid()");
                }
                C0043bb c0043bbA2 = C0043bb.a(DownloadActivity.O, jSONObject3.toString());
                Pj pj2 = new Pj();
                H0 h1 = new H0();
                h1.q("https://tankspeedometer.ru:9443/api/v2/cars/check-update");
                h1.j("POST", c0043bbA2);
                try {
                    C0117dn c0117dnC2 = new Dl(pj2, h1.a()).c();
                    try {
                        if (c0117dnC2.w()) {
                            Jl jl2 = c0117dnC2.g;
                            if (jl2 != null) {
                                downloadActivity.G.post(new RunnableC0781z9(new JSONObject(jl2.y()).getString("init_date"), i));
                            }
                            atomicBoolean.set(c0117dnC2.w());
                            break;
                        }
                        c0117dnC2.close();
                        return;
                    } catch (Throwable th13) {
                        try {
                            c0117dnC2.close();
                            throw th13;
                        } catch (Throwable th14) {
                            th13.addSuppressed(th14);
                            throw th13;
                        }
                    }
                } catch (Exception e11) {
                    downloadActivity.H(e11, "isCarValid()");
                    return;
                }
                break;
            case 8:
                C0388mi c0388mi3 = K9.d0;
                K9 k9 = (K9) obj2;
                if (!k9.p() || k9.h() == null) {
                    return;
                }
                ((Runnable) obj).run();
                return;
            case 9:
                ((ProfileInstallerInitializer) obj2).getClass();
                AbstractC0145el.a(Looper.getMainLooper()).postDelayed(new RunnableC0742y1((Context) obj, i2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                ((Br) obj2).P((Typeface) obj);
                return;
        }
    }

    public /* synthetic */ B1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
