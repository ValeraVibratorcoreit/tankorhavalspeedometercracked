package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.a;
import java.io.FileInputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class K2 implements Um, Nk {
    public static volatile K2 e;
    public static final Object f = new Object();
    public static K2 g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ K2(int i, boolean z) {
        this.a = i;
    }

    public static K2 G(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new K2(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private final void M() {
    }

    private final void N() {
    }

    public static boolean h(Editable editable, KeyEvent keyEvent, boolean z) {
        Gr[] grArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (grArr = (Gr[]) editable.getSpans(selectionStart, selectionEnd, Gr.class)) != null && grArr.length > 0) {
            for (Gr gr : grArr) {
                int spanStart = editable.getSpanStart(gr);
                int spanEnd = editable.getSpanEnd(gr);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static K2 v(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new K2(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public int A() {
        return ((Nl) this.b).a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Os B(Y5 y5, String str) {
        Class clsE;
        boolean zIsInstance;
        Os osB;
        int iB;
        Tf.j("key", str);
        Rs rs = (Rs) this.b;
        rs.getClass();
        LinkedHashMap linkedHashMap = rs.a;
        Os os = (Os) linkedHashMap.get(str);
        Class cls = y5.a;
        Tf.j("jClass", cls);
        Map map = Y5.b;
        Tf.g("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int iIntValue = num.intValue();
            zIsInstance = false;
            if (os instanceof InterfaceC0785zd) {
                if (os instanceof Ad) {
                    iB = ((Ad) os).b();
                } else if (os instanceof InterfaceC0107dd) {
                    iB = 0;
                } else {
                    iB = os instanceof InterfaceC0445od ? 1 : -1;
                }
                if (iB == iIntValue) {
                    zIsInstance = true;
                }
            }
        } else {
            if (cls.isPrimitive()) {
                clsE = cls;
                clsE = Tf.E(AbstractC0485pm.a(cls));
            }
            clsE = cls;
            zIsInstance = clsE.isInstance(os);
        }
        Qs qs = (Qs) this.c;
        if (zIsInstance) {
            if (qs instanceof AbstractC0764yn) {
                AbstractC0764yn abstractC0764yn = (AbstractC0764yn) qs;
                Tf.f(os);
                abstractC0764yn.getClass();
                abstractC0764yn.getClass();
            }
            Tf.g("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel", os);
            return os;
        }
        C0420nj c0420nj = new C0420nj((Y3) this.d);
        ((LinkedHashMap) c0420nj.a).put(C0473pa.p, str);
        Tf.j("factory", qs);
        try {
            try {
                osB = qs.c(y5, c0420nj);
            } catch (AbstractMethodError unused) {
                osB = qs.a(Tf.D(y5), c0420nj);
            }
        } catch (AbstractMethodError unused2) {
            osB = qs.b(Tf.D(y5));
        }
        Tf.j("viewModel", osB);
        Os os2 = (Os) linkedHashMap.put(str, osB);
        if (os2 != null) {
            os2.a();
        }
        return osB;
    }

    public boolean C(CharSequence charSequence, int i, int i2, Fr fr) {
        if ((fr.c & 3) == 0) {
            InterfaceC0689wa interfaceC0689wa = (InterfaceC0689wa) this.d;
            Pi piC = fr.c();
            int iA = piC.a(8);
            if (iA != 0) {
                ((ByteBuffer) piC.d).getShort(iA + piC.a);
            }
            C0625u8 c0625u8 = (C0625u8) interfaceC0689wa;
            c0625u8.getClass();
            ThreadLocal threadLocal = C0625u8.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0625u8.a;
            String string = sb.toString();
            int i3 = AbstractC0730xk.a;
            boolean zA = AbstractC0699wk.a(textPaint, string);
            int i4 = fr.c & 4;
            fr.c = zA ? i4 | 2 : i4 | 1;
        }
        return (fr.c & 3) == 2;
    }

    public void D(View view) {
        ((ArrayList) this.d).add(view);
        Nl nl = (Nl) this.b;
        nl.getClass();
        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
        if (abstractC0361lmI != null) {
            int i = abstractC0361lmI.q;
            View view2 = abstractC0361lmI.a;
            if (i != -1) {
                abstractC0361lmI.p = i;
            } else {
                WeakHashMap weakHashMap = Gs.a;
                abstractC0361lmI.p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = nl.a;
            if (recyclerView.M()) {
                abstractC0361lmI.q = 4;
                recyclerView.p0.add(abstractC0361lmI);
            } else {
                WeakHashMap weakHashMap2 = Gs.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean E(View view) {
        return ((ArrayList) this.d).contains(view);
    }

    public boolean F(int i, C0377m7 c0377m7, C0655v7 c0655v7) {
        int[] iArr = c0655v7.p0;
        int i2 = iArr[0];
        C0343l4 c0343l4 = (C0343l4) this.c;
        c0343l4.a = i2;
        c0343l4.b = iArr[1];
        c0343l4.c = c0655v7.q();
        c0343l4.d = c0655v7.k();
        c0343l4.i = false;
        c0343l4.j = i;
        boolean z = c0343l4.a == 3;
        boolean z2 = c0343l4.b == 3;
        boolean z3 = z && c0655v7.W > 0.0f;
        boolean z4 = z2 && c0655v7.W > 0.0f;
        int[] iArr2 = c0655v7.t;
        if (z3 && iArr2[0] == 4) {
            c0343l4.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0343l4.b = 1;
        }
        c0377m7.b(c0655v7, c0343l4);
        c0655v7.O(c0343l4.e);
        c0655v7.L(c0343l4.f);
        c0655v7.E = c0343l4.h;
        c0655v7.I(c0343l4.g);
        c0343l4.j = 0;
        return c0343l4.i;
    }

    public void H(EnumC0602tg enumC0602tg) {
        Hn hn = (Hn) this.d;
        if (hn != null) {
            hn.run();
        }
        Hn hn2 = new Hn((Fg) this.b, enumC0602tg);
        this.d = hn2;
        ((Handler) this.c).postAtFrontOfQueue(hn2);
    }

    public Object I(CharSequence charSequence, int i, int i2, int i3, boolean z, Ja ja) {
        char c;
        Ri ri = null;
        Ka ka = new Ka((Ri) ((C0296jj) this.c).c, false, null);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i4 = 0;
        boolean zF = true;
        int iCharCount = i;
        int i5 = iCharCount;
        while (iCharCount < i2 && i4 < i3 && zF) {
            SparseArray sparseArray = ka.c.a;
            Ri ri2 = sparseArray == null ? ri : (Ri) sparseArray.get(iCodePointAt);
            if (ka.a == 2) {
                if (ri2 != null) {
                    ka.c = ri2;
                    ka.f++;
                } else {
                    if (iCodePointAt == 65038) {
                        ka.a();
                    } else if (iCodePointAt != 65039) {
                        Ri ri3 = ka.c;
                        if (ri3.b != null) {
                            if (ka.f != 1) {
                                ka.d = ri3;
                                ka.a();
                            } else if (ka.b()) {
                                ka.d = ka.c;
                                ka.a();
                            } else {
                                ka.a();
                            }
                            c = 3;
                        } else {
                            ka.a();
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (ri2 == null) {
                ka.a();
                c = 1;
            } else {
                ka.a = 2;
                ka.c = ri2;
                ka.f = 1;
                c = 2;
            }
            ka.e = iCodePointAt;
            if (c != 1) {
                if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !C(charSequence, i5, iCharCount, ka.d.b)) {
                        zF = ja.f(charSequence, i5, iCharCount, ka.d.b);
                        i4++;
                    }
                }
                ri = null;
            } else {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                if (iCharCount < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            }
            i5 = iCharCount;
            ri = null;
        }
        if (ka.a == 2 && ka.c.b != null && ((ka.f > 1 || ka.b()) && i4 < i3 && zF && (z || !C(charSequence, i5, iCharCount, ka.c.b)))) {
            ja.f(charSequence, i5, iCharCount, ka.c.b);
        }
        return ja.b();
    }

    public void J() {
        ((TypedArray) this.b).recycle();
    }

    public void K(C0686w7 c0686w7, int i, int i2, int i3) {
        int i4 = c0686w7.b0;
        int i5 = c0686w7.c0;
        c0686w7.b0 = 0;
        c0686w7.c0 = 0;
        c0686w7.O(i2);
        c0686w7.L(i3);
        if (i4 < 0) {
            c0686w7.b0 = 0;
        } else {
            c0686w7.b0 = i4;
        }
        if (i5 < 0) {
            c0686w7.c0 = 0;
        } else {
            c0686w7.c0 = i5;
        }
        C0686w7 c0686w8 = (C0686w7) this.d;
        c0686w8.t0 = i;
        c0686w8.U();
    }

    public void L() {
        switch (this.a) {
            case 13:
                return;
            case 14:
                Ll ll = (Ll) ((C0308k0) this.b).b;
                synchronized (ll) {
                    ll.c = ll.a.length;
                }
                return;
            default:
                return;
        }
    }

    public void O(View view) {
        if (((ArrayList) this.d).remove(view)) {
            Nl nl = (Nl) this.b;
            nl.getClass();
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
            if (abstractC0361lmI != null) {
                int i = abstractC0361lmI.p;
                RecyclerView recyclerView = nl.a;
                if (recyclerView.M()) {
                    abstractC0361lmI.q = i;
                    recyclerView.p0.add(abstractC0361lmI);
                } else {
                    WeakHashMap weakHashMap = Gs.a;
                    abstractC0361lmI.a.setImportantForAccessibility(i);
                }
                abstractC0361lmI.p = 0;
            }
        }
    }

    public void P() {
        Object parcelable;
        Integer num;
        N6 n6 = (N6) this.b;
        n6.getClass();
        String str = (String) this.c;
        Tf.j("key", str);
        if (!n6.d.contains(str) && (num = (Integer) n6.b.remove(str)) != null) {
            n6.a.remove(num);
        }
        n6.e.remove(str);
        LinkedHashMap linkedHashMap = n6.f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = n6.g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = Q4.a(bundle, str, C0772z0.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0772z0.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0772z0) parcelable));
            bundle.remove(str);
        }
        Vo.l(n6.c.get(str));
    }

    public void Q(C0686w7 c0686w7) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = c0686w7.q0.size();
        for (int i = 0; i < size; i++) {
            C0655v7 c0655v7 = (C0655v7) c0686w7.q0.get(i);
            int[] iArr = c0655v7.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0655v7);
            }
        }
        c0686w7.s0.b = true;
    }

    @Override // defpackage.Nk
    public boolean a(Object obj) {
        if (obj instanceof Ib) {
            ((Ib) obj).b().a = true;
        }
        ((C0225h8) this.c).t(obj);
        return ((Nk) this.d).a(obj);
    }

    @Override // defpackage.Nk
    public Object b() {
        Object objB = ((Nk) this.d).b();
        if (objB == null) {
            objB = ((Hb) this.b).s();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objB.getClass());
            }
        }
        if (objB instanceof Ib) {
            ((Ib) objB).b().a = false;
        }
        return objB;
    }

    public synchronized void c(InterfaceC0171fg interfaceC0171fg, C0412nb c0412nb) {
        C0586t0 c0586t0 = (C0586t0) ((HashMap) this.b).put(interfaceC0171fg, new C0586t0(interfaceC0171fg, c0412nb, (ReferenceQueue) this.c));
        if (c0586t0 != null) {
            c0586t0.c = null;
            c0586t0.clear();
        }
    }

    public void d(View view, int i, boolean z) {
        Nl nl = (Nl) this.b;
        int childCount = i < 0 ? nl.a.getChildCount() : x(i);
        ((O5) this.c).e(childCount, z);
        if (z) {
            D(view);
        }
        nl.a.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void e(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Nl nl = (Nl) this.b;
        int childCount = i < 0 ? nl.a.getChildCount() : x(i);
        ((O5) this.c).e(childCount, z);
        if (z) {
            D(view);
        }
        nl.getClass();
        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
        RecyclerView recyclerView = nl.a;
        if (abstractC0361lmI != null) {
            if (!abstractC0361lmI.k() && !abstractC0361lmI.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC0361lmI + recyclerView.y());
            }
            abstractC0361lmI.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void f(C0586t0 c0586t0) {
        Im im;
        synchronized (this) {
            ((HashMap) this.b).remove(c0586t0.a);
            if (c0586t0.b && (im = c0586t0.c) != null) {
                ((C0166fb) ((InterfaceC0381mb) this.d)).e(c0586t0.a, new C0412nb(im, true, false, c0586t0.a, (InterfaceC0381mb) this.d));
            }
        }
    }

    public Bitmap g(BitmapFactory.Options options) {
        switch (this.a) {
            case 13:
                return BitmapFactory.decodeStream(new C0037b5(AbstractC0099d5.c((ByteBuffer) this.b)), null, options);
            case 14:
                Ll ll = (Ll) ((C0308k0) this.b).b;
                ll.reset();
                return BitmapFactory.decodeStream(ll, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((a) this.d).a().getFileDescriptor(), null, options);
        }
    }

    public void i(int i) {
        AbstractC0361lm abstractC0361lmI;
        int iX = x(i);
        ((O5) this.c).g(iX);
        RecyclerView recyclerView = ((Nl) this.b).a;
        View childAt = recyclerView.getChildAt(iX);
        if (childAt != null && (abstractC0361lmI = RecyclerView.I(childAt)) != null) {
            if (abstractC0361lmI.k() && !abstractC0361lmI.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC0361lmI + recyclerView.y());
            }
            abstractC0361lmI.a(256);
        }
        recyclerView.detachViewFromParent(iX);
    }

    public void j(Bundle bundle) {
        HashSet hashSet;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = (HashSet) this.c;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (Cf.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    k((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0753yc(e2);
            }
        }
    }

    public Object k(Class cls, HashSet hashSet) {
        Object objB;
        if (Tf.J()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = (HashMap) this.b;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Cf cf = (Cf) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = cf.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            k(cls2, hashSet);
                        }
                    }
                }
                objB = cf.b((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0753yc(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public AbstractC0787zf[] l() {
        return (AbstractC0787zf[]) ((ArrayList) this.d).toArray(new AbstractC0787zf[0]);
    }

    @Override // defpackage.Um
    public Im m(Im im, C0544rk c0544rk) {
        Drawable drawable = (Drawable) im.get();
        if (drawable instanceof BitmapDrawable) {
            return ((Um) this.c).m(C0652v4.b((InterfaceC0621u4) this.b, ((BitmapDrawable) drawable).getBitmap()), c0544rk);
        }
        if (drawable instanceof Id) {
            return ((Um) this.d).m(im, c0544rk);
        }
        return null;
    }

    public View n(int i) {
        return ((Nl) this.b).a.getChildAt(x(i));
    }

    public int o() {
        return ((Nl) this.b).a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList p(int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = F4.C((Context) this.d, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public Drawable q(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : F4.F((Context) this.d, resourceId);
    }

    public Drawable r(int i) {
        int resourceId;
        Drawable drawableF;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        U1 u1A = U1.a();
        Context context = (Context) this.d;
        synchronized (u1A) {
            drawableF = u1A.a.f(context, resourceId, true);
        }
        return drawableF;
    }

    public Typeface s(int i, int i2, C0619u2 c0619u2) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = AbstractC0024an.a;
        Context context = (Context) this.d;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0024an.b(context, resourceId, typedValue, i2, c0619u2, true, false);
    }

    public int t() throws Throwable {
        switch (this.a) {
            case 13:
                ByteBuffer byteBufferC = AbstractC0099d5.c((ByteBuffer) this.b);
                C0634uh c0634uh = (C0634uh) this.d;
                if (byteBufferC == null) {
                    return -1;
                }
                List list = (List) this.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iC = ((InterfaceC0416nf) list.get(i)).c(byteBufferC, c0634uh);
                        AbstractC0099d5.c(byteBufferC);
                        if (iC != -1) {
                            return iC;
                        }
                    } catch (Throwable th) {
                        AbstractC0099d5.c(byteBufferC);
                        throw th;
                    }
                }
                return -1;
            case 14:
                Ll ll = (Ll) ((C0308k0) this.b).b;
                ll.reset();
                return Td.q((ArrayList) ((List) this.d), ll, (C0634uh) this.c);
            default:
                a aVar = (a) this.d;
                C0634uh c0634uh2 = (C0634uh) this.b;
                ArrayList arrayList = (ArrayList) ((List) this.c);
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    InterfaceC0416nf interfaceC0416nf = (InterfaceC0416nf) arrayList.get(i2);
                    Ll ll2 = null;
                    try {
                        Ll ll3 = new Ll(new FileInputStream(aVar.a().getFileDescriptor()), c0634uh2);
                        try {
                            int iB = interfaceC0416nf.b(ll3, c0634uh2);
                            ll3.w();
                            aVar.a();
                            if (iB != -1) {
                                return iB;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ll2 = ll3;
                            if (ll2 != null) {
                                ll2.w();
                            }
                            aVar.a();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return -1;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return ((O5) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public ImageHeaderParser$ImageType u() throws Throwable {
        switch (this.a) {
            case 13:
                return Td.u((List) this.c, AbstractC0099d5.c((ByteBuffer) this.b));
            case 14:
                Ll ll = (Ll) ((C0308k0) this.b).b;
                ll.reset();
                return Td.t((List) this.d, ll, (C0634uh) this.c);
            default:
                a aVar = (a) this.d;
                C0634uh c0634uh = (C0634uh) this.b;
                List list = (List) this.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC0416nf interfaceC0416nf = (InterfaceC0416nf) list.get(i);
                    Ll ll2 = null;
                    try {
                        Ll ll3 = new Ll(new FileInputStream(aVar.a().getFileDescriptor()), c0634uh);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = interfaceC0416nf.d(ll3);
                            ll3.w();
                            aVar.a();
                            if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeD;
                            }
                        } catch (Throwable th) {
                            th = th;
                            ll2 = ll3;
                            if (ll2 != null) {
                                ll2.w();
                            }
                            aVar.a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public AbstractC0787zf[] w() {
        return (AbstractC0787zf[]) ((ArrayList) this.b).toArray(new AbstractC0787zf[0]);
    }

    public int x(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((Nl) this.b).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            O5 o5 = (O5) this.c;
            int iB = i - (i2 - o5.b(i2));
            if (iB == 0) {
                while (o5.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public AbstractC0787zf[] y() {
        return (AbstractC0787zf[]) ((ArrayList) this.c).toArray(new AbstractC0787zf[0]);
    }

    public View z(int i) {
        return ((Nl) this.b).a.getChildAt(i);
    }

    public /* synthetic */ K2(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public K2(Dg dg) {
        this.a = 19;
        Tf.j("provider", dg);
        this.b = new Fg(dg);
        this.c = new Handler();
    }

    public K2(int i) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = new Handler();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0555s0(0));
                this.b = new HashMap();
                this.c = new ReferenceQueue();
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0524r0(this, 1));
                break;
        }
    }

    public K2(Rs rs, Qs qs, Y3 y3) {
        this.a = 22;
        Tf.j("store", rs);
        Tf.j("extras", y3);
        this.b = rs;
        this.c = qs;
        this.d = y3;
    }

    public K2(Nl nl) {
        this.a = 5;
        this.b = nl;
        this.c = new O5();
        this.d = new ArrayList();
    }

    public K2(Runnable runnable) {
        this.a = 18;
        this.d = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.c = runnable;
    }

    public K2(Context context, TypedArray typedArray) {
        this.a = 20;
        this.d = context;
        this.b = typedArray;
    }

    public K2(Context context, LocationManager locationManager) {
        this.a = 21;
        this.c = new Ar();
        this.d = context;
        this.b = locationManager;
    }

    public K2(C0686w7 c0686w7) {
        this.a = 3;
        this.b = new ArrayList();
        this.c = new C0343l4();
        this.d = c0686w7;
    }

    public K2(Context context) {
        this.a = 0;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public K2(C0296jj c0296jj, C0225h8 c0225h8, InterfaceC0689wa interfaceC0689wa, Set set) {
        this.a = 10;
        this.b = c0225h8;
        this.c = c0296jj;
        this.d = interfaceC0689wa;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            I(str, 0, str.length(), 1, true, new C0064c1(str));
        }
    }

    public K2(Pk pk, Hb hb, C0225h8 c0225h8) {
        this.a = 12;
        this.d = pk;
        this.b = hb;
        this.c = c0225h8;
    }

    public K2(Kh kh, ArrayList arrayList, C0634uh c0634uh) {
        this.a = 14;
        Ud.l("Argument must not be null", c0634uh);
        this.c = c0634uh;
        Ud.l("Argument must not be null", arrayList);
        this.d = arrayList;
        this.b = new C0308k0(kh, c0634uh);
    }

    public K2(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C0634uh c0634uh) {
        this.a = 15;
        Ud.l("Argument must not be null", c0634uh);
        this.b = c0634uh;
        Ud.l("Argument must not be null", arrayList);
        this.c = arrayList;
        this.d = new a(parcelFileDescriptor);
    }

    public K2(C0166fb c0166fb, Lm lm, C0288jb c0288jb) {
        this.a = 11;
        this.d = c0166fb;
        this.c = lm;
        this.b = c0288jb;
    }
}
