package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ProgressBar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;
import ru.zinovin.tankspeedometer.SpedometerPanel;

/* JADX INFO: renamed from: d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0096d2 implements InterfaceC0463p0, A2, Qm, InterfaceC0499q5, Ja, Z7 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ C0096d2(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public static float G(String str) {
        if (str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static int H(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int M(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static void P(boolean z) {
        Log.i("T500.GwmReader", "Connected: " + z);
    }

    public static C0156f1 p(ImageDecoder.Source source, int i, int i2, C0544rk c0544rk) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new I8(i, i2, c0544rk));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C0156f1((AnimatedImageDrawable) drawableDecodeDrawable, 0);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public void A(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.A(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void B(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.B(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void C(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.C(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void D(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.D(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public Object E(Mk mk) {
        HashMap map = (HashMap) this.c;
        C0108de c0108de = (C0108de) map.get(mk);
        if (c0108de == null) {
            c0108de = new C0108de(mk);
            map.put(mk, c0108de);
        } else {
            mk.a();
        }
        C0108de c0108de2 = c0108de.d;
        c0108de2.c = c0108de.c;
        c0108de.c.d = c0108de2;
        C0108de c0108de3 = (C0108de) this.b;
        c0108de.d = c0108de3;
        C0108de c0108de4 = c0108de3.c;
        c0108de.c = c0108de4;
        c0108de4.d = c0108de;
        c0108de.d.c = c0108de;
        ArrayList arrayList = c0108de.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c0108de.b.remove(size - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public Drawable F(String e, boolean z) throws Throwable {
        Drawable drawableCreateFromStream = null;
        drawableCreateFromStream = null;
        drawableCreateFromStream = null;
        ?? r1 = 0;
        if (e == 0) {
            return null;
        }
        SpedometerPanel spedometerPanel = (SpedometerPanel) this.c;
        File file = new File(spedometerPanel.getFilesDir(), (String) e);
        try {
            try {
                if (!file.exists()) {
                    C0768yr.b("T500.THEMEACTION", "В стиле " + spedometerPanel.X + " не найден ресурс " + ((String) e));
                    if (z) {
                        return Tf.z(ru.zinovin.tankspeedometer.R.drawable.transparent_background);
                    }
                    return null;
                }
                try {
                    e = AbstractC0402n1.a().getContentResolver().openInputStream(Uri.fromFile(file));
                    try {
                        drawableCreateFromStream = Drawable.createFromStream(e, null);
                        if (e != 0) {
                            e.close();
                            e = e;
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        C0768yr.c("T500.THEMEACTION", "ERROR in getDrawableFromFile()", e);
                        if (e != 0) {
                            e.close();
                            e = e;
                        }
                        return drawableCreateFromStream;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    e = 0;
                } catch (Throwable th) {
                    th = th;
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e4) {
                            C0768yr.c("T500.THEMEACTION", "ERROR closing input stream", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                C0768yr.c("T500.THEMEACTION", "ERROR closing input stream", e);
            }
            return drawableCreateFromStream;
        } catch (Throwable th2) {
            th = th2;
            r1 = e;
        }
    }

    public KeyListener I(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((C0096d2) ((C0308k0) this.c).b).getClass();
        if (keyListener instanceof Ia) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new Ia(keyListener);
    }

    public synchronized List J(String str) {
        List arrayList;
        if (!((ArrayList) this.b).contains(str)) {
            ((ArrayList) this.b).add(str);
        }
        arrayList = (List) ((HashMap) this.c).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.c).put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized ArrayList K(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            List<Nm> list = (List) ((HashMap) this.c).get((String) it.next());
            if (list != null) {
                for (Nm nm : list) {
                    if (nm.a.isAssignableFrom(cls) && cls2.isAssignableFrom(nm.b) && !arrayList.contains(nm.b)) {
                        arrayList.add(nm.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String L(InterfaceC0171fg interfaceC0171fg) {
        String str;
        synchronized (((C0727xh) this.b)) {
            str = (String) ((C0727xh) this.b).a(interfaceC0171fg);
        }
        if (str == null) {
            C0486pn c0486pn = (C0486pn) ((K2) this.c).b();
            try {
                interfaceC0171fg.a(c0486pn.a);
                byte[] bArrDigest = c0486pn.a.digest();
                char[] cArr = Qr.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = Qr.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((K2) this.c).a(c0486pn);
            } catch (Throwable th) {
                ((K2) this.c).a(c0486pn);
                throw th;
            }
        }
        synchronized (((C0727xh) this.b)) {
            ((C0727xh) this.b).d(interfaceC0171fg, str);
        }
        return str;
    }

    public void N() {
        ((SparseIntArray) this.b).clear();
    }

    public void O(AttributeSet attributeSet, int i) {
        switch (this.a) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.b;
                K2 k2G = K2.G(progressBar.getContext(), attributeSet, d, i, 0);
                Drawable drawableR = k2G.r(0);
                if (drawableR != null) {
                    if (drawableR instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableR;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableY = Y(animationDrawable.getFrame(i2), true);
                            drawableY.setLevel(10000);
                            animationDrawable2.addFrame(drawableY, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableR = animationDrawable2;
                    }
                    progressBar.setIndeterminateDrawable(drawableR);
                }
                Drawable drawableR2 = k2G.r(1);
                if (drawableR2 != null) {
                    progressBar.setProgressDrawable(Y(drawableR2, false));
                }
                k2G.J();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, AbstractC0700wl.i, i, 0);
                try {
                    boolean z = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    W(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public Fa Q(InputConnection inputConnection, EditorInfo editorInfo) {
        C0308k0 c0308k0 = (C0308k0) this.c;
        if (inputConnection == null) {
            c0308k0.getClass();
            inputConnection = null;
        } else {
            C0096d2 c0096d2 = (C0096d2) c0308k0.b;
            c0096d2.getClass();
            if (!(inputConnection instanceof Fa)) {
                inputConnection = new Fa((EditText) c0096d2.b, inputConnection, editorInfo);
            }
        }
        return (Fa) inputConnection;
    }

    public void R(C0289jc c0289jc) {
        int i = c0289jc.b;
        Handler handler = (Handler) this.c;
        Vi vi = (Vi) this.b;
        if (i != 0) {
            handler.post(new RunnableC0375m5(i, vi, 0));
        } else {
            handler.post(new RunnableC0248i0(1, vi, c0289jc.a, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void S(Context context, XmlResourceParser xmlResourceParser) {
        byte b;
        C0624u7 c0624u7 = new C0624u7();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    C0470p7 c0470p7F = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlResourceParser.getName()) {
                                case "Constraint":
                                    c0470p7F = C0624u7.f(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case "ConstraintOverride":
                                    c0470p7F = C0624u7.f(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case "Guideline":
                                    c0470p7F = C0624u7.f(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0470p7F.d.a = true;
                                    break;
                                case "Barrier":
                                    c0470p7F = C0624u7.f(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0470p7F.d.h0 = 1;
                                    break;
                                case "PropertySet":
                                    if (c0470p7F == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0470p7F.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Transform":
                                    if (c0470p7F == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0470p7F.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Layout":
                                    if (c0470p7F == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0470p7F.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Motion":
                                    if (c0470p7F == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0470p7F.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "CustomAttribute":
                                case "CustomMethod":
                                    if (c0470p7F == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0255i7.a(context, xmlResourceParser, c0470p7F.f);
                                    break;
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0) {
                                ((SparseArray) this.c).put(identifier, c0624u7);
                                return;
                            } else if (b == 1 || b == 2 || b == 3) {
                                c0624u7.c.put(Integer.valueOf(c0470p7F.a), c0470p7F);
                                c0470p7F = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.c).put(identifier, c0624u7);
                return;
            }
        }
    }

    public void T(Mk mk, Object obj) {
        HashMap map = (HashMap) this.c;
        C0108de c0108de = (C0108de) map.get(mk);
        if (c0108de == null) {
            c0108de = new C0108de(mk);
            c0108de.c = c0108de;
            c0108de.d = c0108de;
            C0108de c0108de2 = (C0108de) this.b;
            c0108de.d = c0108de2.d;
            c0108de.c = c0108de2;
            c0108de2.d = c0108de;
            c0108de.d.c = c0108de;
            map.put(mk, c0108de);
        } else {
            mk.a();
        }
        if (c0108de.b == null) {
            c0108de.b = new ArrayList();
        }
        c0108de.b.add(obj);
    }

    public void U(String str) {
        C0348l9 c0348l9;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.b).get(str);
                Ud.l("Argument must not be null", obj);
                c0348l9 = (C0348l9) obj;
                int i = c0348l9.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0348l9.b);
                }
                int i2 = i - 1;
                c0348l9.b = i2;
                if (i2 == 0) {
                    C0348l9 c0348l10 = (C0348l9) ((HashMap) this.b).remove(str);
                    if (!c0348l10.equals(c0348l9)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0348l9 + ", but actually removed: " + c0348l10 + ", safeKey: " + str);
                    }
                    X4 x4 = (X4) this.c;
                    synchronized (x4.a) {
                        try {
                            if (x4.a.size() < 10) {
                                x4.a.offer(c0348l10);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c0348l9.a.unlock();
    }

    public Object V() {
        C0108de c0108de = (C0108de) this.b;
        C0108de c0108de2 = c0108de.d;
        while (true) {
            if (c0108de2.equals(c0108de)) {
                return null;
            }
            ArrayList arrayList = c0108de2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c0108de2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C0108de c0108de3 = c0108de2.d;
            c0108de3.c = c0108de2.c;
            c0108de2.c.d = c0108de3;
            HashMap map = (HashMap) this.c;
            Object obj = c0108de2.a;
            map.remove(obj);
            ((Mk) obj).a();
            c0108de2 = c0108de2.d;
        }
    }

    public void W(boolean z) {
        Oa oa = (Oa) ((C0096d2) ((C0308k0) this.c).b).c;
        if (oa.d != z) {
            if (oa.c != null) {
                C0782za c0782zaA = C0782za.a();
                Na na = oa.c;
                c0782zaA.getClass();
                Tf.h("initCallback cannot be null", na);
                ReentrantReadWriteLock reentrantReadWriteLock = c0782zaA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0782zaA.b.remove(na);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            oa.d = z;
            if (z) {
                Oa.a(oa.a, C0782za.a().b());
            }
        }
    }

    public void X(Boolean bool) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable Y(Drawable drawable, boolean z) {
        if (drawable instanceof au) {
            ((bu) ((au) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = Y(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    @Override // defpackage.InterfaceC0463p0
    public boolean a(AbstractC0494q0 abstractC0494q0, MenuItem menuItem) {
        return ((InterfaceC0463p0) this.b).a(abstractC0494q0, menuItem);
    }

    @Override // defpackage.Ja
    public Object b() {
        return (Jr) this.b;
    }

    @Override // defpackage.InterfaceC0463p0
    public boolean c(AbstractC0494q0 abstractC0494q0, MenuC0604ti menuC0604ti) {
        return ((InterfaceC0463p0) this.b).c(abstractC0494q0, menuC0604ti);
    }

    @Override // defpackage.Wa
    public boolean d(Object obj, File file, C0544rk c0544rk) {
        return ((Qm) this.c).d(new C0652v4((InterfaceC0621u4) this.b, ((BitmapDrawable) ((Im) obj).get()).getBitmap()), file, c0544rk);
    }

    @Override // defpackage.A2
    public void e(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // defpackage.Ja
    public boolean f(CharSequence charSequence, int i, int i2, Fr fr) {
        if ((fr.c & 4) > 0) {
            return true;
        }
        if (((Jr) this.b) == null) {
            this.b = new Jr(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0225h8) this.c).getClass();
        ((Jr) this.b).setSpan(new Gr(fr), i, i2, 33);
        return true;
    }

    @Override // defpackage.A2
    public void g(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.Z7
    public void h(Exception exc) {
        Yo yo = (Yo) this.c;
        Wi wi = (Wi) this.b;
        Wi wi2 = yo.f;
        if (wi2 == null || wi2 != wi) {
            return;
        }
        Yo yo2 = (Yo) this.c;
        Wi wi3 = (Wi) this.b;
        InterfaceC0040b8 interfaceC0040b8 = yo2.b;
        Y7 y7 = yo2.g;
        InterfaceC0009a8 interfaceC0009a8 = wi3.c;
        interfaceC0040b8.a(y7, exc, interfaceC0009a8, interfaceC0009a8.e());
    }

    @Override // defpackage.Qm
    public int i(C0544rk c0544rk) {
        return ((Qm) this.c).i(c0544rk);
    }

    @Override // defpackage.InterfaceC0463p0
    public boolean j(AbstractC0494q0 abstractC0494q0, Menu menu) {
        ViewGroup viewGroup = ((R1) this.c).B;
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0614ts.c(viewGroup);
        return ((InterfaceC0463p0) this.b).j(abstractC0494q0, menu);
    }

    @Override // defpackage.InterfaceC0499q5
    public void k() {
        ((Animator) this.b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((C0118dp) this.c) + " has been canceled.");
        }
    }

    public void l(int i, float f) {
    }

    @Override // defpackage.Z7
    public void m(Object obj) {
        Yo yo = (Yo) this.c;
        Wi wi = (Wi) this.b;
        Wi wi2 = yo.f;
        if (wi2 == null || wi2 != wi) {
            return;
        }
        Yo yo2 = (Yo) this.c;
        Wi wi3 = (Wi) this.b;
        C0317k9 c0317k9 = yo2.a.p;
        if (obj != null && c0317k9.c(wi3.c.e())) {
            yo2.e = obj;
            yo2.b.d();
        } else {
            InterfaceC0040b8 interfaceC0040b8 = yo2.b;
            InterfaceC0171fg interfaceC0171fg = wi3.a;
            InterfaceC0009a8 interfaceC0009a8 = wi3.c;
            interfaceC0040b8.c(interfaceC0171fg, obj, interfaceC0009a8, interfaceC0009a8.e(), yo2.g);
        }
    }

    @Override // defpackage.InterfaceC0463p0
    public void n(AbstractC0494q0 abstractC0494q0) {
        ((InterfaceC0463p0) this.b).n(abstractC0494q0);
        R1 r1 = (R1) this.c;
        if (r1.w != null) {
            r1.l.getDecorView().removeCallbacks(r1.x);
        }
        if (r1.v != null) {
            Ws ws = r1.y;
            if (ws != null) {
                ws.b();
            }
            Ws wsA = Gs.a(r1.v);
            wsA.a(0.0f);
            r1.y = wsA;
            wsA.d(new H1(this, 2));
        }
        r1.u = null;
        ViewGroup viewGroup = r1.B;
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0614ts.c(viewGroup);
        r1.I();
    }

    public void o() {
        SpedometerPanel spedometerPanel = (SpedometerPanel) this.c;
        spedometerPanel.C = (AbstractC0510qg) spedometerPanel.c(ru.zinovin.tankspeedometer.R.id.fuelLevelIndicator);
        spedometerPanel.D = (AbstractC0510qg) spedometerPanel.c(ru.zinovin.tankspeedometer.R.id.fuelLevelIndicator2);
        spedometerPanel.E = (AbstractC0510qg) spedometerPanel.c(ru.zinovin.tankspeedometer.R.id.coolantIndicator);
    }

    public void q(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z) {
        Oc oc = (Oc) this.c;
        Context context = oc.t.k;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = oc.v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void t(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 20:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C0108de c0108de = (C0108de) this.b;
                C0108de c0108de2 = c0108de.c;
                boolean z = false;
                while (!c0108de2.equals(c0108de)) {
                    sb.append('{');
                    sb.append(c0108de2.a);
                    sb.append(':');
                    ArrayList arrayList = c0108de2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c0108de2 = c0108de2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 26:
                String str = "[ ";
                if (((Wo) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((Wo) this.b).h[i] + " ";
                    }
                }
                return str + "] " + ((Wo) this.b);
            default:
                return super.toString();
        }
    }

    public void u(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void v(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void w(boolean z) {
        Oc oc = (Oc) this.c;
        Context context = oc.t.k;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = oc.v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void x(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void y(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void z(boolean z) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = ((Oc) this.c).v;
        if (abstractComponentCallbacksC0784zc != null) {
            abstractComponentCallbacksC0784zc.j().l.z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ C0096d2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public C0096d2(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = new HashMap();
                this.c = new X4(1);
                break;
            case 19:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
            case 20:
                this.b = new C0108de(null);
                this.c = new HashMap();
                break;
            case 21:
                this.b = Lf.a();
                this.c = AbstractC0390mk.l(AbstractC0402n1.a());
                break;
            case 25:
                this.b = new AtomicReference();
                this.c = new C0066c3();
                break;
            case 27:
                this.b = new ArrayList();
                this.c = new HashMap();
                break;
            case 28:
                this.b = new C0727xh(1000L);
                this.c = Br.s0(10, new C0387mh(12));
                break;
        }
    }

    public C0096d2(C0387mh c0387mh) {
        this.a = 23;
        this.b = new HashMap();
        this.c = c0387mh;
    }

    public C0096d2(K2 k2) {
        this.a = 24;
        C0296jj c0296jj = new C0296jj(k2);
        this.c = new C0163f8(2);
        this.b = c0296jj;
    }

    public C0096d2(Vk vk) {
        this.a = 26;
        this.c = vk;
    }

    public C0096d2(EditText editText, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = editText;
                Oa oa = new Oa(editText);
                this.c = oa;
                editText.addTextChangedListener(oa);
                if (Da.b == null) {
                    synchronized (Da.a) {
                        try {
                            if (Da.b == null) {
                                Da da = new Da();
                                try {
                                    Da.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, Da.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                Da.b = da;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(Da.b);
                return;
            default:
                this.b = editText;
                this.c = new C0308k0(editText);
                return;
        }
    }

    public C0096d2(ProgressBar progressBar) {
        this.a = 0;
        this.b = progressBar;
    }

    public C0096d2(Oc oc) {
        this.a = 16;
        this.b = new CopyOnWriteArrayList();
        this.c = oc;
    }

    public C0096d2(Context context, int i) {
        this.a = i;
        switch (i) {
            case 22:
                this.b = context;
                this.c = "image_manager_disk_cache";
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Tf.T(ru.zinovin.tankspeedometer.R.attr.materialCalendarStyle, context, Yh.class.getCanonicalName()).data, AbstractC0638ul.n);
                C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
                C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
                C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
                C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
                ColorStateList colorStateListU = Br.u(context, typedArrayObtainStyledAttributes, 7);
                this.b = C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
                C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
                this.c = C0473pa.r(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(colorStateListU.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
        }
    }

    public C0096d2(Animation animation) {
        this.a = 15;
        this.b = animation;
        this.c = null;
    }

    public C0096d2(Animator animator) {
        this.a = 15;
        this.b = null;
        this.c = animator;
    }

    public C0096d2(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 18;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0096d2(int i, int i2) {
        this.a = 18;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public C0096d2(int i, int i2, int i3) {
        this.a = 18;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0096d2(C2 c2) {
        this.a = 4;
        this.c = c2;
        this.a = 4;
        this.b = c2;
    }
}
