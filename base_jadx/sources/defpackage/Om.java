package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Om {
    public static final C0388mi a;

    static {
        Pattern pattern = C0388mi.c;
        a = Tf.r("application/json; charset=utf-8");
    }

    public static boolean a(Context context, JSONObject jSONObject, String str) {
        String strY;
        String string = jSONObject.toString();
        Oj oj = new Oj();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Tf.j("unit", timeUnit);
        oj.r = Rr.b(30L, timeUnit);
        oj.s = Rr.b(30L, timeUnit);
        Pj pj = new Pj(oj);
        C0043bb c0043bbA = C0043bb.a(a, string);
        H0 h0 = new H0();
        h0.q("https://tankspeedometer.ru:9443/api/v3/cars/resource");
        h0.j("POST", c0043bbA);
        try {
            C0117dn c0117dnC = new Dl(pj, h0.a()).c();
            try {
                boolean zW = c0117dnC.w();
                Jl jl = c0117dnC.g;
                if (!zW) {
                    if (jl != null) {
                        try {
                            strY = jl.y();
                        } catch (IOException | JSONException unused) {
                        }
                    } else {
                        strY = "";
                    }
                    C0768yr.e("T500.ResourceDL", "Server answer: ".concat(strY));
                    JSONObject jSONObject2 = new JSONObject(strY);
                    if (jSONObject2.has("message")) {
                        String str2 = "Server error: " + jSONObject2.getString("message");
                        Log.w("T500.ResourceDL", str2);
                        C0768yr c0768yr = C0768yr.g;
                        if (c0768yr != null) {
                            c0768yr.g("WARN", "T500.ResourceDL", str2);
                        }
                    }
                    c0117dnC.close();
                    return false;
                }
                InputStream inputStreamV = jl.x().v();
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = inputStreamV.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStreamOpenFileOutput.write(bArr, 0, i);
                            try {
                                inputStreamV.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                        inputStreamV.close();
                        C0768yr.e("T500.ResourceDL", str + " was downloaded successfully");
                        c0117dnC.close();
                        return true;
                    } catch (Throwable th2) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    inputStreamV.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    c0117dnC.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Exception e) {
            C0768yr.c("T500.ResourceDL", "Network error for resource: " + str, e);
            return false;
        }
        C0768yr.c("T500.ResourceDL", "Network error for resource: " + str, e);
        return false;
    }
}
