package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0473pa implements Yi, Um, Ki, InterfaceC0664vg, InterfaceC0621u4, S4, Wa {
    public static C0473pa i;
    public final /* synthetic */ int a;
    public static final C0473pa b = new C0473pa(1);
    public static final C0473pa c = new C0473pa(2);
    public static final C0473pa d = new C0473pa(3);
    public static final C0473pa e = new C0473pa(4);
    public static final C0473pa f = new C0473pa(5);
    public static final C0636uj g = new C0636uj(new C0605tj(0, 0, 1920, 740), new C0605tj(0, 0, 1920, 740));
    public static final C0636uj h = new C0636uj(new C0605tj(0, 0, 0, 0), new C0605tj(0, 0, 0, 0));
    public static final C0473pa j = new C0473pa(7);
    public static final C0473pa k = new C0473pa(8);
    public static final C0473pa l = new C0473pa(9);
    public static final C0473pa m = new C0473pa(10);
    public static final C0473pa n = new C0473pa(11);
    public static final C0473pa o = new C0473pa(12);
    public static final C0473pa p = new C0473pa(13);

    public /* synthetic */ C0473pa(int i2) {
        this.a = i2;
    }

    public static C0636uj A(int i2, String str) {
        AbstractC0402n1.a();
        String str2 = "navi_config_" + str + ".json";
        File file = new File(AbstractC0402n1.a().getExternalFilesDir(null), "navi");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str2);
        if (!file2.exists()) {
            return w(i2);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString());
            if (!str.equals("Default") && jSONObject.has("useDefault") && jSONObject.getBoolean("useDefault")) {
                return w(i2);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("fullscreen");
            JSONObject jSONObject3 = jSONObject.getJSONObject("windowed");
            return new C0636uj(new C0605tj(jSONObject3.getInt("left"), jSONObject3.getInt("top"), jSONObject3.getInt("right"), jSONObject3.getInt("bottom")), new C0605tj(jSONObject2.getInt("left"), jSONObject2.getInt("top"), jSONObject2.getInt("right"), jSONObject2.getInt("bottom")));
        } catch (IOException e2) {
            C0768yr.c("T500.ERROR", "ERROR in NaviConfigActivity.loadConfiguration() - IO", e2);
            return w(i2 + 1);
        } catch (JSONException e3) {
            C0768yr.c("T500.ERROR", "ERROR in NaviConfigActivity.loadConfiguration() - JSON", e3);
            return w(i2 + 1);
        }
    }

    public static final W5 n(C0473pa c0473pa, String str) {
        W5 w5 = new W5(str);
        W5.c.put(str, w5);
        return w5;
    }

    public static final C0117dn p(C0117dn c0117dn) {
        if ((c0117dn != null ? c0117dn.g : null) == null) {
            return c0117dn;
        }
        C0086cn c0086cnX = c0117dn.x();
        c0086cnX.g = null;
        return c0086cnX.a();
    }

    public static C0473pa r(Context context, int i2) {
        Tf.c("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0638ul.o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListU = Br.u(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListU2 = Br.u(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListU3 = Br.u(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0487po c0487poA = C0487po.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0247i(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0473pa(colorStateListU, colorStateListU2, colorStateListU3, dimensionPixelSize, c0487poA, rect);
    }

    public static C0129e5 s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Tf.a(str.charAt(i3 + 1)) + (Tf.a(str.charAt(i3)) << 4));
        }
        return new C0129e5(bArr);
    }

    public static C0129e5 t(String str) {
        Tf.j("$this$encodeUtf8", str);
        byte[] bytes = str.getBytes(L5.a);
        Tf.i("(this as java.lang.String).getBytes(charset)", bytes);
        C0129e5 c0129e5 = new C0129e5(bytes);
        c0129e5.b = str;
        return c0129e5;
    }

    public static C0636uj w(int i2) {
        File file = new File(AbstractC0402n1.a().getExternalFilesDir(null), "navi");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (new File(file, "navi_config_Default.json").exists() && i2 < 2) {
            return A(i2 + 1, "Default");
        }
        return new C0636uj(new C0605tj(550, 80, 1370, 680), new C0605tj(0, 40, 1920, 740));
    }

    public static C0473pa x() {
        if (i == null) {
            C0473pa c0473pa = new C0473pa(6);
            new HashMap();
            i = c0473pa;
        }
        return i;
    }

    public static boolean z(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public List B(String str) throws UnknownHostException {
        Tf.j("hostname", str);
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            Tf.i("InetAddress.getAllByName(hostname)", allByName);
            int length = allByName.length;
            if (length != 0) {
                return length != 1 ? new ArrayList(new Y2(allByName, false)) : Ud.R(allByName[0]);
            }
            return Sa.a;
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }

    @Override // defpackage.S4
    public Class a() {
        switch (this.a) {
            case 18:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.Ki
    public void b(MenuC0604ti menuC0604ti, boolean z) {
    }

    @Override // defpackage.S4
    public Object c(byte[] bArr) {
        switch (this.a) {
            case 18:
                return ByteBuffer.wrap(bArr);
            default:
                return new ByteArrayInputStream(bArr);
        }
    }

    @Override // defpackage.Wa
    public boolean d(Object obj, File file, C0544rk c0544rk) throws Throwable {
        try {
            AbstractC0099d5.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }

    @Override // defpackage.InterfaceC0621u4
    public void e(int i2) {
    }

    @Override // defpackage.InterfaceC0664vg
    public void f(Bg bg) {
    }

    @Override // defpackage.InterfaceC0664vg
    public void g(Bg bg) {
        bg.j();
    }

    @Override // defpackage.InterfaceC0621u4
    public Bitmap h(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // defpackage.InterfaceC0621u4
    public Bitmap j(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public void k(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.InterfaceC0621u4
    public void l() {
    }

    @Override // defpackage.Um
    public Im m(Im im, C0544rk c0544rk) {
        return im;
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 11:
                return Hr.b;
            case 19:
                return new T4(new C0473pa(18), 0);
            case 21:
                return new T4(new C0473pa(20), 0);
            default:
                return new Hr(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public int q(CharSequence charSequence, int i2) {
        int i3 = 0;
        i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            B4 b4 = AbstractC0489pq.a;
            if (directionality == 0) {
                i3 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        i3 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        i3 = 2;
                        continue;
                }
            }
        }
        return i3;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.Ki
    public boolean u(MenuC0604ti menuC0604ti) {
        return false;
    }

    public synchronized W5 v(String str) {
        W5 w5;
        String strConcat;
        try {
            Tf.j("javaName", str);
            LinkedHashMap linkedHashMap = W5.c;
            w5 = (W5) linkedHashMap.get(str);
            if (w5 == null) {
                if (Mp.U0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring);
                    strConcat = "SSL_".concat(strSubstring);
                } else if (Mp.U0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring2);
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                w5 = (W5) linkedHashMap.get(strConcat);
                if (w5 == null) {
                    w5 = new W5(str);
                }
                linkedHashMap.put(str, w5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return w5;
    }

    public void y(Throwable th) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
        }
    }

    public C0473pa(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, C0487po c0487po, Rect rect) {
        this.a = 27;
        Tf.d(rect.left);
        Tf.d(rect.top);
        Tf.d(rect.right);
        Tf.d(rect.bottom);
    }

    public C0473pa(AbstractC0233hg abstractC0233hg, AbstractC0233hg abstractC0233hg2) {
        this.a = 28;
        abstractC0233hg.getClass();
        abstractC0233hg2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
    }
}
