package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0490pr {
    public static final C0466p3 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        C0466p3 c0466p3 = new C0466p3();
        c0466p3.A = new ArrayList();
        c0466p3.B = true;
        c0466p3.D = false;
        c0466p3.E = 0;
        c0466p3.B = false;
        c0466p3.I(new Kb(2));
        c0466p3.I(new K5());
        c0466p3.I(new Kb(1));
        a = c0466p3;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, AbstractC0366lr abstractC0366lr) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC0366lr == null) {
            abstractC0366lr = a;
        }
        AbstractC0366lr abstractC0366lrClone = abstractC0366lr.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0366lr) it.next()).w(viewGroup);
            }
        }
        abstractC0366lrClone.h(viewGroup, true);
        Vo.l(viewGroup.getTag(R.id.transition_current_scene));
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0459or viewTreeObserverOnPreDrawListenerC0459or = new ViewTreeObserverOnPreDrawListenerC0459or();
        viewTreeObserverOnPreDrawListenerC0459or.a = abstractC0366lrClone;
        viewTreeObserverOnPreDrawListenerC0459or.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0459or);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0459or);
    }

    public static C0066c3 b() {
        C0066c3 c0066c3;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0066c3 = (C0066c3) weakReference.get()) != null) {
            return c0066c3;
        }
        C0066c3 c0066c4 = new C0066c3();
        threadLocal.set(new WeakReference(c0066c4));
        return c0066c4;
    }
}
