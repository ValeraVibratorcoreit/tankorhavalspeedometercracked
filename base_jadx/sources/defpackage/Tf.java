package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParserException;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public abstract class Tf implements InterfaceC0791zj {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final String[] b = {"standard", "accelerate", "decelerate", "linear"};
    public static final boolean[] c = new boolean[3];
    public static final C0387mh d = new C0387mh(14);
    public static final C0387mh e = new C0387mh(15);
    public static final C0387mh f = new C0387mh(13);
    public static volatile boolean g = true;
    public static long h;
    public static Method i;

    public static Drawable A(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (g) {
                return L(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return H7.b(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            g = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC0024an.a;
        return Vm.a(resources, i2, theme);
    }

    public static Set B() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static String C(int i2, boolean z) {
        return String.format(z ? "#%08X" : "#%06X", Integer.valueOf(i2 & (z ? -1 : 16777215))).toUpperCase();
    }

    public static final Class D(Y5 y5) {
        Class clsA = y5.a();
        g("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsA);
        return clsA;
    }

    public static final Class E(InterfaceC0079cg interfaceC0079cg) {
        j("<this>", interfaceC0079cg);
        Class clsA = ((X5) interfaceC0079cg).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static String F(Activity activity, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            if (activity != null) {
                activity.runOnUiThread(new B1(activity, 5, "ERROR" + e2));
            }
            C0768yr.c("T500.ERROR", "ERROR in getPropSystem()", e2);
            return "1234567890";
        }
    }

    public static final C0640un G(Ss ss) {
        j("<this>", ss);
        C0578sn c0578sn = new C0578sn();
        Rs rsD = ss.d();
        Y3 y3A = ss instanceof InterfaceC0508qe ? ((InterfaceC0508qe) ss).a() : S7.b;
        j("store", rsD);
        j("defaultCreationExtras", y3A);
        return (C0640un) new K2(rsD, c0578sn, y3A).B(AbstractC0485pm.a(C0640un.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static String H(String str) {
        return AbstractC0390mk.l(AbstractC0402n1.a()).getString(str, "");
    }

    public static final boolean I(AssertionError assertionError) {
        Logger logger = Qj.a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? Mp.D0(message, "getsockname failed") : false;
    }

    public static boolean J() {
        try {
            if (i == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (i == null) {
                h = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                i = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) i.invoke(null, Long.valueOf(h))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean K(View view) {
        WeakHashMap weakHashMap = Gs.a;
        return view.getLayoutDirection() == 1;
    }

    public static Drawable L(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            J7 j7 = new J7(context);
            j7.b = theme;
            j7.a(theme.getResources().getConfiguration());
            context = j7;
        }
        return F4.F(context, i2);
    }

    public static InterfaceC0382mc O(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0484pl.b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    Y(xmlResourceParser);
                }
                return new C0475pc(new H0(string, string2, string3, Q(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0484pl.c);
                        int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i5);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            Y(xmlResourceParser);
                        }
                        arrayList.add(new C0444oc(i2, i4, resourceId2, string6, string5, z));
                    } else {
                        Y(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0413nc((C0444oc[]) arrayList.toArray(new C0444oc[0]));
            }
        } else {
            Y(xmlResourceParser);
        }
        return null;
    }

    public static PorterDuff.Mode P(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static List Q(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0351lc.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static TypedValue R(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean S(Context context, int i2, boolean z) {
        TypedValue typedValueR = R(context, i2);
        if (typedValueR == null || typedValueR.type != 18) {
            return z;
        }
        return typedValueR.data != 0;
    }

    public static TypedValue T(int i2, Context context, String str) {
        TypedValue typedValueR = R(context, i2);
        if (typedValueR != null) {
            return typedValueR;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static C0302jp U(String str) throws Throwable {
        Session session;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        ChannelExec channelExec = null;
        try {
            session = new JSch().getSession("root", "172.16.2.97", 22);
            try {
                try {
                    session.setPassword("oelinux123");
                    Properties properties = new Properties();
                    properties.put("StrictHostKeyChecking", "no");
                    properties.put("PreferredAuthentications", "password");
                    session.setConfig(properties);
                    session.setTimeout(15000);
                    session.connect(10000);
                    ChannelExec channelExec2 = (ChannelExec) session.openChannel("exec");
                    try {
                        channelExec2.setCommand(str);
                        channelExec2.setOutputStream(byteArrayOutputStream);
                        channelExec2.setErrStream(byteArrayOutputStream2);
                        channelExec2.connect(10000);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        while (!channelExec2.isClosed()) {
                            if (System.currentTimeMillis() - jCurrentTimeMillis > 20000) {
                                throw new TimeoutException("Command execution timeout");
                            }
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                throw new RuntimeException("Interrupted while waiting for command completion", e2);
                            }
                        }
                        int exitStatus = channelExec2.getExitStatus();
                        Charset charset = StandardCharsets.UTF_8;
                        C0302jp c0302jp = new C0302jp(byteArrayOutputStream.toString(charset.name()), byteArrayOutputStream2.toString(charset.name()), exitStatus == 0);
                        try {
                            channelExec2.disconnect();
                        } catch (Exception unused) {
                        }
                        try {
                            session.disconnect();
                        } catch (Exception unused2) {
                        }
                        return c0302jp;
                    } catch (Exception e3) {
                        e = e3;
                        channelExec = channelExec2;
                        String string = "";
                        C0768yr.c("T500.TBOX", "SSH error", e);
                        String message = e.getMessage() != null ? e.getMessage() : "SSH error";
                        try {
                            string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } catch (IOException unused3) {
                        }
                        C0302jp c0302jp2 = new C0302jp(string, message, false);
                        if (channelExec != null) {
                            try {
                                channelExec.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        if (session != null) {
                            try {
                                session.disconnect();
                            } catch (Exception unused5) {
                            }
                        }
                        return c0302jp2;
                    } catch (Throwable th) {
                        th = th;
                        channelExec = channelExec2;
                        if (channelExec != null) {
                            try {
                                channelExec.disconnect();
                            } catch (Exception unused6) {
                            }
                        }
                        if (session == null) {
                            throw th;
                        }
                        try {
                            session.disconnect();
                            throw th;
                        } catch (Exception unused7) {
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
            session = null;
        } catch (Throwable th3) {
            th = th3;
            session = null;
        }
    }

    public static void V(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void W(String str, String str2) {
        SharedPreferences.Editor editorEdit = AbstractC0390mk.l(AbstractC0402n1.a()).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static final C0342l3 X(Socket socket) throws IOException {
        Logger logger = Qj.a;
        Ze ze = new Ze(socket, 2);
        OutputStream outputStream = socket.getOutputStream();
        i("getOutputStream()", outputStream);
        return new C0342l3(ze, 0, new C0342l3(outputStream, 1, ze));
    }

    public static void Y(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final C0373m3 Z(Socket socket) throws IOException {
        Logger logger = Qj.a;
        Ze ze = new Ze(socket, 2);
        InputStream inputStream = socket.getInputStream();
        i("getInputStream()", inputStream);
        return new C0373m3(ze, 0, new C0373m3(inputStream, 1, ze));
    }

    public static final int a(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static void a0(String str) {
        C0753yc c0753yc = new C0753yc(Vo.g("lateinit property ", str, " has not been initialized"));
        V(c0753yc, Tf.class.getName());
        throw c0753yc;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final String b0(String str) {
        j("$this$toCanonicalHost", str);
        int i2 = 0;
        int i3 = -1;
        if (!Mp.D0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                i("IDN.toASCII(host)", ascii);
                Locale locale = Locale.US;
                i("Locale.US", locale);
                String lowerCase = ascii.toLowerCase(locale);
                i("(this as java.lang.String).toLowerCase(locale)", lowerCase);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = lowerCase.charAt(i4);
                    if (k(cCharAt, 31) <= 0 || k(cCharAt, 127) >= 0 || Mp.I0(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM = (Mp.U0(str, "[", false) && str.endsWith("]")) ? m(str, 1, str.length() - 1) : m(str, 0, str.length());
        if (inetAddressM == null) {
            return null;
        }
        byte[] address = inetAddressM.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        L4 l4 = new L4();
        while (i2 < address.length) {
            if (i2 == i3) {
                l4.G(58);
                i2 += i6;
                if (i2 == 16) {
                    l4.G(58);
                }
            } else {
                if (i2 > 0) {
                    l4.G(58);
                }
                byte b2 = address[i2];
                byte[] bArr = Rr.a;
                l4.H(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return l4.A(l4.b, L5.a);
    }

    public static void c(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(C0686w7 c0686w7, Qg qg, C0655v7 c0655v7) {
        c0655v7.o = -1;
        c0655v7.p = -1;
        int i2 = c0686w7.p0[0];
        int[] iArr = c0655v7.p0;
        if (i2 != 2 && iArr[0] == 4) {
            C0224h7 c0224h7 = c0655v7.I;
            int i3 = c0224h7.g;
            int iQ = c0686w7.q();
            C0224h7 c0224h8 = c0655v7.K;
            int i4 = iQ - c0224h8.g;
            c0224h7.i = qg.k(c0224h7);
            c0224h8.i = qg.k(c0224h8);
            qg.d(c0224h7.i, i3);
            qg.d(c0224h8.i, i4);
            c0655v7.o = 2;
            c0655v7.Y = i3;
            int i5 = i4 - i3;
            c0655v7.U = i5;
            int i6 = c0655v7.b0;
            if (i5 < i6) {
                c0655v7.U = i6;
            }
        }
        if (c0686w7.p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0224h7 c0224h9 = c0655v7.J;
        int i7 = c0224h9.g;
        int iK = c0686w7.k();
        C0224h7 c0224h10 = c0655v7.L;
        int i8 = iK - c0224h10.g;
        c0224h9.i = qg.k(c0224h9);
        c0224h10.i = qg.k(c0224h10);
        qg.d(c0224h9.i, i7);
        qg.d(c0224h10.i, i8);
        if (c0655v7.a0 > 0 || c0655v7.g0 == 8) {
            C0224h7 c0224h11 = c0655v7.M;
            Wo woK = qg.k(c0224h11);
            c0224h11.i = woK;
            qg.d(woK, c0655v7.a0 + i7);
        }
        c0655v7.p = 2;
        c0655v7.Z = i7;
        int i9 = i8 - i7;
        c0655v7.V = i9;
        int i10 = c0655v7.c0;
        if (i9 < i10) {
            c0655v7.V = i10;
        }
    }

    public static void f(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        V(nullPointerException, Tf.class.getName());
        throw nullPointerException;
    }

    public static void g(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        V(nullPointerException, Tf.class.getName());
        throw nullPointerException;
    }

    public static void h(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        V(nullPointerException, Tf.class.getName());
        throw nullPointerException;
    }

    public static void j(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = Tf.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            V(nullPointerException, Tf.class.getName());
            throw nullPointerException;
        }
    }

    public static int k(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int l(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i2 = 0;
        while (i2 < iMax) {
            int i3 = i2 < strArrSplit.length ? Integer.parseInt(strArrSplit[i2]) : 0;
            int i4 = i2 < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i2]) : 0;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4) {
                return 1;
            }
            i2++;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2 A[LOOP:1: B:56:0x00a5->B:60:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b8 A[EDGE_INSN: B:83:0x00b8->B:61:0x00b8 BREAK  A[LOOP:1: B:56:0x00a5->B:60:0x00b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public static final InetAddress m(String str, int i2, int i3) {
        int i4;
        ?? r14;
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int i8;
        int iQ;
        int i9 = 16;
        byte[] bArr = new byte[16];
        boolean z = false;
        int i10 = i2;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i10 >= i3) {
                i4 = i9;
                break;
            }
            if (i11 == i9) {
                return null;
            }
            int i14 = i10 + 2;
            if (i14 <= i3 && Mp.T0(str, "::", i10, z)) {
                if (i12 != -1) {
                    return null;
                }
                i11 += 2;
                if (i14 == i3) {
                    i4 = i9;
                    i12 = i11;
                    break;
                }
                i12 = i11;
                i13 = i14;
                i10 = i13;
                i7 = 0;
                while (i10 < i3) {
                    iQ = Rr.q(str.charAt(i10));
                    if (iQ == -1) {
                        break;
                        break;
                    }
                    i7 = (i7 << 4) + iQ;
                    i10++;
                }
                i8 = i10 - i13;
                if (i8 != 0) {
                }
                return null;
            }
            if (i11 != 0) {
                if (!Mp.T0(str, ":", i10, z)) {
                    if (Mp.T0(str, ".", i10, z)) {
                        int i15 = i11 - 2;
                        int i16 = i15;
                        while (i13 < i3) {
                            if (i16 != i9) {
                                if (i16 == i15) {
                                    r14 = z;
                                    i5 = i13;
                                    while (i5 < i3) {
                                        cCharAt = str.charAt(i5);
                                        if (k(cCharAt, 48) < 0 || k(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 != 0 || i13 == i5) && (i6 = ((r14 * 10) + cCharAt) - 48) <= 255) {
                                            i5++;
                                            r14 = i6;
                                        }
                                    }
                                    if (i5 - i13 == 0) {
                                        bArr[i16] = (byte) r14;
                                        i16++;
                                        i13 = i5;
                                        i9 = 16;
                                        z = false;
                                    }
                                } else if (str.charAt(i13) == '.') {
                                    i13++;
                                    r14 = z;
                                    i5 = i13;
                                    while (i5 < i3) {
                                        cCharAt = str.charAt(i5);
                                        if (k(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i5 - i13 == 0) {
                                        bArr[i16] = (byte) r14;
                                        i16++;
                                        i13 = i5;
                                        i9 = 16;
                                        z = false;
                                    }
                                }
                            }
                        }
                        if (i16 == i11 + 2) {
                            i11 += 2;
                            i4 = 16;
                            break;
                        }
                    }
                    return null;
                }
                i10++;
            }
            i13 = i10;
            i10 = i13;
            i7 = 0;
            while (i10 < i3) {
                iQ = Rr.q(str.charAt(i10));
                if (iQ == -1) {
                    break;
                }
                i7 = (i7 << 4) + iQ;
                i10++;
            }
            i8 = i10 - i13;
            if (i8 != 0 || i8 > 4) {
                return null;
            }
            int i17 = i11 + 1;
            bArr[i11] = (byte) ((i7 >>> 8) & 255);
            i11 += 2;
            bArr[i17] = (byte) (i7 & 255);
            i9 = 16;
            z = false;
        }
        if (i11 != i4) {
            if (i12 == -1) {
                return null;
            }
            int i18 = i11 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static float n(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static final void o(InterfaceC0733xn interfaceC0733xn) {
        j("<this>", interfaceC0733xn);
        EnumC0633ug enumC0633ug = ((Fg) interfaceC0733xn.getLifecycle()).c;
        if (enumC0633ug != EnumC0633ug.b && enumC0633ug != EnumC0633ug.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (interfaceC0733xn.b().d() == null) {
            C0609tn c0609tn = new C0609tn(interfaceC0733xn.b(), (Ss) interfaceC0733xn);
            interfaceC0733xn.b().f("androidx.lifecycle.internal.SavedStateHandlesProvider", c0609tn);
            interfaceC0733xn.getLifecycle().a(new Kl(c0609tn, 4));
        }
    }

    public static final boolean p(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static L q(String str, Object... objArr) {
        String strTrim;
        Exception e2;
        L l = new L();
        l.a = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(AbstractC0402n1.a().getFilesDir(), str)));
            try {
                strTrim = bufferedReader.readLine().trim();
                bufferedReader.close();
                try {
                    Object objNewInstance = Class.forName(strTrim).newInstance();
                    if (objNewInstance instanceof RemotePlugin) {
                        l.a = ((RemotePlugin) objNewInstance).execute("lalala", objArr);
                    } else {
                        C0768yr.e("T500.REMOTE", "Class '" + strTrim + "' does not implement RemotePlugin");
                    }
                    return l;
                } catch (Exception e3) {
                    e2 = e3;
                    e2.getMessage();
                    C0768yr.c("T500.REMOTE", "Error class '" + strTrim + "' calling", e2);
                    return l;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e4) {
            strTrim = str;
            e2 = e4;
            e2.getMessage();
            C0768yr.c("T500.REMOTE", "Error class '" + strTrim + "' calling", e2);
            return l;
        }
    }

    public static C0388mi r(String str) {
        j("$this$toMediaType", str);
        Matcher matcher = C0388mi.c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        i("typeSubtype.group(1)", strGroup);
        Locale locale = Locale.US;
        i("Locale.US", locale);
        i("(this as java.lang.String).toLowerCase(locale)", strGroup.toLowerCase(locale));
        String strGroup2 = matcher.group(2);
        i("typeSubtype.group(2)", strGroup2);
        i("(this as java.lang.String).toLowerCase(locale)", strGroup2.toLowerCase(locale));
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C0388mi.d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                i("(this as java.lang.String).substring(startIndex)", strSubstring);
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (Mp.U0(strGroup4, "'", false) && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    i("(this as java.lang.Strin…ing(startIndex, endIndex)", strGroup4);
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C0388mi(str, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static String s() {
        return AbstractC0390mk.l(AbstractC0402n1.a()).getString("VERSION", "0.0.0");
    }

    public static float t() {
        float f2;
        String strF = F(null, "persist.vendor.gwm.cfg.project.code");
        strF.getClass();
        switch (strF) {
            case "126":
                f2 = 70.0f;
                break;
            case "134":
                f2 = 100.0f;
                break;
            case "138":
            case "215":
                f2 = 60.0f;
                break;
            case "189":
            case "190":
            case "241":
                f2 = 61.0f;
                break;
            case "193":
            case "203":
            case "245":
                f2 = 55.0f;
                break;
            case "195":
                f2 = 79.0f;
                break;
            case "211":
                f2 = 58.0f;
                break;
            case "213":
            case "220":
                f2 = 85.0f;
                break;
            default:
                f2 = 80.0f;
                break;
        }
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(AbstractC0402n1.a());
        if (sharedPreferencesL.getBoolean("fuel_custom_tank_enabled", false)) {
            String string = sharedPreferencesL.getString("fuel_tank_capacity", "");
            if (!string.isEmpty()) {
                try {
                    float f3 = Float.parseFloat(string);
                    if (f3 > 0.0f) {
                        return f3;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return f2;
    }

    public static float u() {
        float f2;
        String strF = F(null, "persist.vendor.gwm.cfg.project.code");
        strF.getClass();
        switch (strF) {
            case "126":
                f2 = 0.616f;
                break;
            case "134":
                f2 = 0.865f;
                break;
            case "138":
            case "215":
                f2 = 0.528f;
                break;
            case "189":
            case "190":
            case "241":
                f2 = 0.53f;
                break;
            case "193":
            case "203":
            case "245":
                f2 = 0.51f;
                break;
            case "195":
                f2 = 0.69f;
                break;
            case "211":
                f2 = 0.514f;
                break;
            case "213":
            case "220":
                f2 = 0.76f;
                break;
            default:
                f2 = 0.71f;
                break;
        }
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(AbstractC0402n1.a());
        if (sharedPreferencesL.getBoolean("fuel_custom_tank_enabled", false)) {
            String string = sharedPreferencesL.getString("fuel_conversion_coef", "");
            if (!string.isEmpty()) {
                try {
                    float f3 = Float.parseFloat(string);
                    if (f3 > 0.0f) {
                        return f3;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return f2;
    }

    public static String v(Activity activity) {
        String strF = F(activity, "persist.vendor.gwm.cfg.project.code");
        strF.getClass();
        switch (strF) {
            case "112":
            case "250":
                return Vo.g("Tank 500(", strF, ")");
            case "126":
                return Vo.g("Tank 300(", strF, ")");
            case "128":
                return Vo.g("Tank 400(", strF, ")");
            case "134":
            case "213":
            case "220":
                return Vo.g("Tank 700(", strF, ")");
            case "138":
            case "215":
                return Vo.g("Haval H7(", strF, ")");
            case "175":
                return Vo.g("Haval H9(", strF, ")");
            case "189":
            case "190":
            case "241":
                return Vo.g("Haval F7(", strF, ")");
            case "193":
            case "203":
            case "245":
                return Vo.g("Haval H3(", strF, ")");
            case "195":
                return Vo.g("Wey 07(", strF, ")");
            case "211":
                return Vo.g("Wey 80(", strF, ")");
            default:
                return strF;
        }
    }

    public static int w(String str) {
        int iY = y(str, AbstractC0390mk.l(AbstractC0402n1.a()).getString("selectedTheme", "Audi Virtual Cockpit"));
        Context contextA = AbstractC0402n1.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
        if (sharedPreferences.getBoolean("useDefaultSwitch", false)) {
            sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
        }
        return sharedPreferences.getInt(str, iY);
    }

    public static String x() {
        try {
            return AbstractC0402n1.a().getPackageManager().getPackageInfo(AbstractC0402n1.a().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "0.0";
        }
    }

    public static int y(String str, String str2) {
        str.getClass();
        switch (str) {
            case "battery_background_color":
                return -12303292;
            case "coolant_color":
                str2.getClass();
                switch (str2) {
                    case "AMG":
                    case "KIA":
                    case "Brabus":
                        return -10079251;
                    case "TRX":
                        return -16527361;
                    case "Aurus":
                        return -32717;
                    case "Night":
                    case "Night center":
                        return -16715341;
                    case "Range":
                        return -10985625;
                    default:
                        return -7829368;
                }
            case "battery_color":
                return -16715341;
            case "battery_low_color":
                return -256;
            case "coolant_background_color":
                return -12303292;
            case "coolant_warn_color":
                return -256;
            case "battery_critical_color":
                return -65536;
            case "fuel_color":
                str2.getClass();
                switch (str2) {
                    case "AMG":
                    case "KIA":
                    case "Brabus":
                        return -10079251;
                    case "TRX":
                        return -16527361;
                    case "Aurus":
                        return -32717;
                    case "Night":
                    case "Night center":
                        return -16715341;
                    case "Range":
                        return -10985625;
                    default:
                        return -7829368;
                }
            case "fuel_critical_color":
                return -65536;
            case "fuel_low_color":
                return -256;
            case "fuel_background_color":
                return -12303292;
            case "coolant_critical_color":
                return -65536;
            default:
                return -1;
        }
    }

    public static Drawable z(int i2) {
        if (i2 == 0) {
            return null;
        }
        return F4.F(AbstractC0402n1.a(), i2);
    }

    public abstract void M(int i2);

    public abstract void N(Typeface typeface, boolean z);
}
