package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Fg extends AbstractC0695wg {
    public final boolean a;
    public Nb b;
    public EnumC0633ug c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final C0673vp i;

    public Fg(Dg dg) {
        Tf.j("provider", dg);
        new AtomicReference(null);
        this.a = true;
        this.b = new Nb();
        EnumC0633ug enumC0633ug = EnumC0633ug.b;
        this.c = enumC0633ug;
        this.h = new ArrayList();
        this.d = new WeakReference(dg);
        this.i = new C0673vp(enumC0633ug);
    }

    @Override // defpackage.AbstractC0695wg
    public final void a(Cg cg) {
        InterfaceC0788zg g8;
        Dg dg;
        ArrayList arrayList = this.h;
        int i = 2;
        Tf.j("observer", cg);
        d("addObserver");
        EnumC0633ug enumC0633ug = this.c;
        EnumC0633ug enumC0633ug2 = EnumC0633ug.a;
        if (enumC0633ug != enumC0633ug2) {
            enumC0633ug2 = EnumC0633ug.b;
        }
        Eg eg = new Eg();
        HashMap map = Hg.a;
        boolean z = cg instanceof InterfaceC0788zg;
        boolean z2 = cg instanceof Aa;
        if (z && z2) {
            g8 = new G8((Aa) cg, (InterfaceC0788zg) cg);
        } else if (z2) {
            g8 = new G8((Aa) cg, (InterfaceC0788zg) null);
        } else if (z) {
            g8 = (InterfaceC0788zg) cg;
        } else {
            Class<?> cls = cg.getClass();
            if (Hg.b(cls) == 2) {
                Object obj = Hg.b.get(cls);
                Tf.f(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    Hg.a((Constructor) list.get(0), cg);
                    throw null;
                }
                int size = list.size();
                Ed[] edArr = new Ed[size];
                if (size > 0) {
                    Hg.a((Constructor) list.get(0), cg);
                    throw null;
                }
                g8 = new Kl(edArr, i);
            } else {
                g8 = new G8(cg);
            }
        }
        eg.b = g8;
        eg.a = enumC0633ug2;
        if (((Eg) this.b.c(cg, eg)) == null && (dg = (Dg) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            EnumC0633ug enumC0633ugC = c(cg);
            this.e++;
            while (eg.a.compareTo(enumC0633ugC) < 0 && this.b.e.containsKey(cg)) {
                arrayList.add(eg.a);
                C0540rg c0540rg = EnumC0602tg.Companion;
                EnumC0633ug enumC0633ug3 = eg.a;
                c0540rg.getClass();
                EnumC0602tg enumC0602tgA = C0540rg.a(enumC0633ug3);
                if (enumC0602tgA == null) {
                    throw new IllegalStateException("no event up from " + eg.a);
                }
                eg.a(dg, enumC0602tgA);
                arrayList.remove(arrayList.size() - 1);
                enumC0633ugC = c(cg);
            }
            if (!z3) {
                h();
            }
            this.e--;
        }
    }

    @Override // defpackage.AbstractC0695wg
    public final void b(Cg cg) {
        Tf.j("observer", cg);
        d("removeObserver");
        this.b.b(cg);
    }

    public final EnumC0633ug c(Cg cg) {
        Eg eg;
        HashMap map = this.b.e;
        C0362ln c0362ln = map.containsKey(cg) ? ((C0362ln) map.get(cg)).d : null;
        EnumC0633ug enumC0633ug = (c0362ln == null || (eg = (Eg) c0362ln.b) == null) ? null : eg.a;
        ArrayList arrayList = this.h;
        EnumC0633ug enumC0633ug2 = arrayList.isEmpty() ^ true ? (EnumC0633ug) arrayList.get(arrayList.size() - 1) : null;
        EnumC0633ug enumC0633ug3 = this.c;
        Tf.j("state1", enumC0633ug3);
        if (enumC0633ug == null || enumC0633ug.compareTo(enumC0633ug3) >= 0) {
            enumC0633ug = enumC0633ug3;
        }
        return (enumC0633ug2 == null || enumC0633ug2.compareTo(enumC0633ug) >= 0) ? enumC0633ug : enumC0633ug2;
    }

    public final void d(String str) {
        if (this.a) {
            X2.R().h.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(Vo.g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0602tg enumC0602tg) {
        Tf.j("event", enumC0602tg);
        d("handleLifecycleEvent");
        f(enumC0602tg.a());
    }

    public final void f(EnumC0633ug enumC0633ug) {
        EnumC0633ug enumC0633ug2 = this.c;
        if (enumC0633ug2 == enumC0633ug) {
            return;
        }
        EnumC0633ug enumC0633ug3 = EnumC0633ug.b;
        EnumC0633ug enumC0633ug4 = EnumC0633ug.a;
        if (enumC0633ug2 == enumC0633ug3 && enumC0633ug == enumC0633ug4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0633ug + ", but was " + this.c + " in component " + this.d.get()).toString());
        }
        this.c = enumC0633ug;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.c == enumC0633ug4) {
            this.b = new Nb();
        }
    }

    public final void g(EnumC0633ug enumC0633ug) {
        Tf.j("state", enumC0633ug);
        d("setCurrentState");
        f(enumC0633ug);
    }

    public final void h() {
        EnumC0602tg enumC0602tg;
        Dg dg = (Dg) this.d.get();
        if (dg == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            Nb nb = this.b;
            if (nb.d != 0) {
                C0362ln c0362ln = nb.a;
                Tf.f(c0362ln);
                EnumC0633ug enumC0633ug = ((Eg) c0362ln.b).a;
                C0362ln c0362ln2 = this.b.b;
                Tf.f(c0362ln2);
                EnumC0633ug enumC0633ug2 = ((Eg) c0362ln2.b).a;
                if (enumC0633ug == enumC0633ug2 && this.c == enumC0633ug2) {
                    break;
                }
                this.g = false;
                EnumC0633ug enumC0633ug3 = this.c;
                C0362ln c0362ln3 = this.b.a;
                Tf.f(c0362ln3);
                if (enumC0633ug3.compareTo(((Eg) c0362ln3.b).a) < 0) {
                    Nb nb2 = this.b;
                    C0331kn c0331kn = new C0331kn(nb2.b, nb2.a, 1);
                    nb2.c.put(c0331kn, Boolean.FALSE);
                    while (c0331kn.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) c0331kn.next();
                        Tf.i("next()", entry);
                        Cg cg = (Cg) entry.getKey();
                        Eg eg = (Eg) entry.getValue();
                        while (eg.a.compareTo(this.c) > 0 && !this.g && this.b.e.containsKey(cg)) {
                            C0540rg c0540rg = EnumC0602tg.Companion;
                            EnumC0633ug enumC0633ug4 = eg.a;
                            c0540rg.getClass();
                            Tf.j("state", enumC0633ug4);
                            int iOrdinal = enumC0633ug4.ordinal();
                            if (iOrdinal == 2) {
                                enumC0602tg = EnumC0602tg.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC0602tg = iOrdinal != 4 ? null : EnumC0602tg.ON_PAUSE;
                            } else {
                                enumC0602tg = EnumC0602tg.ON_STOP;
                            }
                            if (enumC0602tg == null) {
                                throw new IllegalStateException("no event down from " + eg.a);
                            }
                            this.h.add(enumC0602tg.a());
                            eg.a(dg, enumC0602tg);
                            ArrayList arrayList = this.h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C0362ln c0362ln4 = this.b.b;
                if (!this.g && c0362ln4 != null && this.c.compareTo(((Eg) c0362ln4.b).a) > 0) {
                    Nb nb3 = this.b;
                    nb3.getClass();
                    C0393mn c0393mn = new C0393mn(nb3);
                    nb3.c.put(c0393mn, Boolean.FALSE);
                    while (c0393mn.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) c0393mn.next();
                        Cg cg2 = (Cg) entry2.getKey();
                        Eg eg2 = (Eg) entry2.getValue();
                        while (eg2.a.compareTo(this.c) < 0 && !this.g && this.b.e.containsKey(cg2)) {
                            this.h.add(eg2.a);
                            C0540rg c0540rg2 = EnumC0602tg.Companion;
                            EnumC0633ug enumC0633ug5 = eg2.a;
                            c0540rg2.getClass();
                            EnumC0602tg enumC0602tgA = C0540rg.a(enumC0633ug5);
                            if (enumC0602tgA == null) {
                                throw new IllegalStateException("no event up from " + eg2.a);
                            }
                            eg2.a(dg, enumC0602tgA);
                            ArrayList arrayList2 = this.h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.g = false;
        this.i.c0(this.c);
    }
}
