package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0296jj implements InterfaceC0499q5, InterfaceC0463p0 {
    public static final C0387mh e = new C0387mh(2);
    public static final Hr f = new Hr(2);
    public Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public C0296jj(K2 k2) {
        C0387mh c0387mh = e;
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = k2;
        this.b = c0387mh;
    }

    @Override // defpackage.InterfaceC0463p0
    public boolean a(AbstractC0494q0 abstractC0494q0, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(m(abstractC0494q0), new Ci((Context) this.c, (Tp) menuItem));
    }

    public void b(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        if (((ArrayList) this.a).contains(abstractComponentCallbacksC0784zc)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0784zc);
        }
        synchronized (((ArrayList) this.a)) {
            ((ArrayList) this.a).add(abstractComponentCallbacksC0784zc);
        }
        abstractComponentCallbacksC0784zc.k = true;
    }

    @Override // defpackage.InterfaceC0463p0
    public boolean c(AbstractC0494q0 abstractC0494q0, MenuC0604ti menuC0604ti) {
        Pp ppM = m(abstractC0494q0);
        Fo fo = (Fo) this.d;
        Menu oi = (Menu) fo.getOrDefault(menuC0604ti, null);
        if (oi == null) {
            oi = new Oi((Context) this.c, menuC0604ti);
            fo.put(menuC0604ti, oi);
        }
        return ((ActionMode.Callback) this.b).onCreateActionMode(ppM, oi);
    }

    public Xi d(C0266ij c0266ij) {
        return c0266ij.c.o(this);
    }

    public synchronized Xi e(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C0266ij c0266ij : (ArrayList) this.a) {
                if (((HashSet) this.c).contains(c0266ij)) {
                    z = true;
                } else if (c0266ij.a.isAssignableFrom(cls) && c0266ij.b.isAssignableFrom(cls2)) {
                    ((HashSet) this.c).add(c0266ij);
                    arrayList.add(d(c0266ij));
                    ((HashSet) this.c).remove(c0266ij);
                }
            }
            if (arrayList.size() > 1) {
                C0387mh c0387mh = (C0387mh) this.b;
                Nk nk = (Nk) this.d;
                c0387mh.getClass();
                return new C0280j3(arrayList, 2, nk);
            }
            if (arrayList.size() == 1) {
                return (Xi) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new C0546rm("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.c).clear();
            throw th;
        }
    }

    public synchronized ArrayList f(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C0266ij c0266ij : (ArrayList) this.a) {
                if (!((HashSet) this.c).contains(c0266ij) && c0266ij.a.isAssignableFrom(cls)) {
                    ((HashSet) this.c).add(c0266ij);
                    arrayList.add(c0266ij.c.o(this));
                    ((HashSet) this.c).remove(c0266ij);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.c).clear();
            throw th;
        }
        return arrayList;
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((Fo) this.d).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                g(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0784zc h(String str) {
        Vc vc = (Vc) ((HashMap) this.b).get(str);
        if (vc != null) {
            return vc.c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0784zc i(String str) {
        for (Vc vc : ((HashMap) this.b).values()) {
            if (vc != null) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcI = vc.c;
                if (!str.equals(abstractComponentCallbacksC0784zcI.e)) {
                    abstractComponentCallbacksC0784zcI = abstractComponentCallbacksC0784zcI.t.c.i(str);
                }
                if (abstractComponentCallbacksC0784zcI != null) {
                    return abstractComponentCallbacksC0784zcI;
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC0463p0
    public boolean j(AbstractC0494q0 abstractC0494q0, Menu menu) {
        Pp ppM = m(abstractC0494q0);
        Fo fo = (Fo) this.d;
        Menu oi = (Menu) fo.getOrDefault(menu, null);
        if (oi == null) {
            oi = new Oi((Context) this.c, (MenuC0604ti) menu);
            fo.put(menu, oi);
        }
        return ((ActionMode.Callback) this.b).onPrepareActionMode(ppM, oi);
    }

    @Override // defpackage.InterfaceC0499q5
    public void k() {
        View view = (View) this.a;
        view.clearAnimation();
        ((ViewGroup) this.b).endViewTransition(view);
        ((M8) this.c).e();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((C0118dp) this.d) + " has been cancelled.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:25:0x0064, B:27:0x006a, B:30:0x009f), top: B:51:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x006a, please report this as an issue */
    public void l(Dl dl) {
        Tf.j("call", dl);
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        synchronized (this) {
            if (!arrayDeque.remove(dl)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = Rr.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.b).iterator();
                Tf.i("readyAsyncCalls.iterator()", it);
                if (it.hasNext()) {
                    Vo.l(it.next());
                    if (((ArrayDeque) this.c).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.c).size();
                    ((ArrayDeque) this.d).size();
                }
                if (arrayList.size() > 0) {
                    Vo.l(arrayList.get(0));
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = Rr.g + " Dispatcher";
                                Tf.j("name", str);
                                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Pr(str, false));
                            }
                            Tf.f((ThreadPoolExecutor) this.a);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList.size() > 0) {
            Vo.l(arrayList.get(0));
            synchronized (this) {
                if (((ThreadPoolExecutor) this.a) == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String str2 = Rr.g + " Dispatcher";
                    Tf.j("name", str2);
                    this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new Pr(str2, false));
                }
                Tf.f((ThreadPoolExecutor) this.a);
                throw null;
            }
        }
    }

    public Pp m(AbstractC0494q0 abstractC0494q0) {
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pp pp = (Pp) arrayList.get(i);
            if (pp != null && pp.b == abstractC0494q0) {
                return pp;
            }
        }
        Pp pp2 = new Pp((Context) this.c, abstractC0494q0);
        arrayList.add(pp2);
        return pp2;
    }

    @Override // defpackage.InterfaceC0463p0
    public void n(AbstractC0494q0 abstractC0494q0) {
        ((ActionMode.Callback) this.b).onDestroyActionMode(m(abstractC0494q0));
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (Vc vc : ((HashMap) this.b).values()) {
            if (vc != null) {
                arrayList.add(vc);
            }
        }
        return arrayList;
    }

    public ArrayList p() {
        ArrayList arrayList = new ArrayList();
        for (Vc vc : ((HashMap) this.b).values()) {
            if (vc != null) {
                arrayList.add(vc.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList q(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C0266ij c0266ij : (ArrayList) this.a) {
            if (!arrayList.contains(c0266ij.b) && c0266ij.a.isAssignableFrom(cls)) {
                arrayList.add(c0266ij.b);
            }
        }
        return arrayList;
    }

    public List r() {
        ArrayList arrayList;
        if (((ArrayList) this.a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.a)) {
            arrayList = new ArrayList((ArrayList) this.a);
        }
        return arrayList;
    }

    public void s(Vc vc) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
        String str = abstractComponentCallbacksC0784zc.e;
        HashMap map = (HashMap) this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0784zc.e, vc);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0784zc);
        }
    }

    public void t(Vc vc) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
        if (abstractComponentCallbacksC0784zc.A) {
            ((Rc) this.d).e(abstractComponentCallbacksC0784zc);
        }
        if (((Vc) ((HashMap) this.b).put(abstractComponentCallbacksC0784zc.e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0784zc);
        }
    }

    public C0296jj(int i) {
        switch (i) {
            case 4:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 5:
                this.a = new ArrayList();
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 6:
            case 7:
            default:
                this.b = new Ok(10);
                this.d = new Fo();
                this.a = new ArrayList();
                this.c = new HashSet();
                break;
            case 8:
                this.a = new C0066c3();
                this.b = new SparseArray();
                this.c = new C0511qh();
                this.d = new C0066c3();
                break;
        }
    }

    public C0296jj(ArrayList arrayList, Fq fq, C0634uh c0634uh, ContentResolver contentResolver) {
        this.a = fq;
        this.b = c0634uh;
        this.c = contentResolver;
        this.d = arrayList;
    }

    public C0296jj(Typeface typeface, Qi qi) {
        int i;
        int i2;
        this.d = typeface;
        this.a = qi;
        this.c = new Ri(1024);
        int iA = qi.a(6);
        if (iA != 0) {
            int i3 = iA + qi.a;
            i = ((ByteBuffer) qi.d).getInt(((ByteBuffer) qi.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = qi.a(6);
        if (iA2 != 0) {
            int i4 = iA2 + qi.a;
            i2 = ((ByteBuffer) qi.d).getInt(((ByteBuffer) qi.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            Fr fr = new Fr(this, i5);
            Pi piC = fr.c();
            int iA3 = piC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) piC.d).getInt(iA3 + piC.a) : 0, (char[]) this.b, i5 * 2);
            Tf.c("invalid metadata codepoint length", fr.b() > 0);
            ((Ri) this.c).a(fr, 0, fr.b() - 1);
        }
    }

    public C0296jj(Context context, ActionMode.Callback callback) {
        this.c = context;
        this.b = callback;
        this.a = new ArrayList();
        this.d = new Fo();
    }

    public C0296jj(M8 m8, C0118dp c0118dp, View view, ViewGroup viewGroup) {
        this.a = view;
        this.b = viewGroup;
        this.c = m8;
        this.d = c0118dp;
    }
}
