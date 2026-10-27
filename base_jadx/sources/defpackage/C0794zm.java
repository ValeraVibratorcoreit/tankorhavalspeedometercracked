package defpackage;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0794zm extends Z3 {
    public final Context A;
    public final Em B;
    public final Class C;
    public final Vd D;
    public Hd E;
    public Object F;
    public ArrayList G;
    public C0794zm H;
    public C0794zm I;
    public final boolean J = true;
    public boolean K;
    public boolean L;

    static {
    }

    public C0794zm(a aVar, Em em, Class cls, Context context) {
        Gm gm;
        this.B = em;
        this.C = cls;
        this.A = context;
        Map map = em.a.c.f;
        Hd hd = (Hd) map.get(cls);
        if (hd == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    hd = (Hd) entry.getValue();
                }
            }
        }
        this.E = hd == null ? Vd.k : hd;
        this.D = aVar.c;
        Iterator it = em.i.iterator();
        while (it.hasNext()) {
            Vo.l(it.next());
            s();
        }
        synchronized (em) {
            gm = em.j;
        }
        a(gm);
    }

    @Override // defpackage.Z3
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0794zm)) {
            return false;
        }
        C0794zm c0794zm = (C0794zm) obj;
        if (super.equals(c0794zm)) {
            return Objects.equals(this.C, c0794zm.C) && this.E.equals(c0794zm.E) && Objects.equals(this.F, c0794zm.F) && Objects.equals(this.G, c0794zm.G) && Objects.equals(this.H, c0794zm.H) && Objects.equals(this.I, c0794zm.I) && this.J == c0794zm.J && this.K == c0794zm.K;
        }
        return false;
    }

    @Override // defpackage.Z3
    public final int hashCode() {
        return Qr.g(this.K ? 1 : 0, Qr.g(this.J ? 1 : 0, Qr.h(Qr.h(Qr.h(Qr.h(Qr.h(Qr.h(Qr.h(super.hashCode(), this.C), this.E), this.F), this.G), this.H), this.I), null)));
    }

    public final C0794zm s() {
        if (this.v) {
            return clone().s();
        }
        k();
        return this;
    }

    @Override // defpackage.Z3
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final C0794zm a(Z3 z3) {
        Ud.k(z3);
        return (C0794zm) super.a(z3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InterfaceC0732xm u(Object obj, InterfaceC0212gq interfaceC0212gq, Am am, Hd hd, Uk uk, int i, int i2, Z3 z3) {
        Am am2;
        Am c0443ob;
        InterfaceC0732xm ho;
        int i3;
        int i4;
        Uk uk2;
        int i5;
        int i6;
        if (this.I != null) {
            c0443ob = new C0443ob(obj, am);
            am2 = c0443ob;
        } else {
            am2 = null;
            c0443ob = am;
        }
        C0794zm c0794zm = this.H;
        if (c0794zm == null) {
            Object obj2 = this.F;
            ArrayList arrayList = this.G;
            Vd vd = this.D;
            ho = new Ho(this.A, vd, obj, obj2, this.C, z3, i, i2, uk, interfaceC0212gq, arrayList, c0443ob, vd.g, hd.a);
        } else {
            if (this.L) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            Hd hd2 = c0794zm.J ? hd : c0794zm.E;
            if (Z3.f(c0794zm.a, 8)) {
                uk2 = this.H.d;
            } else {
                int iOrdinal = uk.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    uk2 = Uk.a;
                } else if (iOrdinal == 2) {
                    uk2 = Uk.b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.d);
                    }
                    uk2 = Uk.c;
                }
            }
            Uk uk3 = uk2;
            C0794zm c0794zm2 = this.H;
            int i7 = c0794zm2.k;
            int i8 = c0794zm2.j;
            if (Qr.i(i, i2)) {
                C0794zm c0794zm3 = this.H;
                if (Qr.i(c0794zm3.k, c0794zm3.j)) {
                    i5 = i8;
                    i6 = i7;
                } else {
                    i6 = z3.k;
                    i5 = z3.j;
                }
            } else {
                i5 = i8;
                i6 = i7;
            }
            Gq gq = new Gq(obj, c0443ob);
            Object obj3 = this.F;
            ArrayList arrayList2 = this.G;
            Vd vd2 = this.D;
            Ho ho2 = new Ho(this.A, vd2, obj, obj3, this.C, z3, i, i2, uk, interfaceC0212gq, arrayList2, gq, vd2.g, hd.a);
            this.L = true;
            C0794zm c0794zm4 = this.H;
            InterfaceC0732xm interfaceC0732xmU = c0794zm4.u(obj, interfaceC0212gq, gq, hd2, uk3, i6, i5, c0794zm4);
            this.L = false;
            gq.c = ho2;
            gq.d = interfaceC0732xmU;
            ho = gq;
        }
        C0443ob c0443ob2 = am2;
        if (c0443ob2 == 0) {
            return ho;
        }
        C0794zm c0794zm5 = this.I;
        int i9 = c0794zm5.k;
        int i10 = c0794zm5.j;
        if (Qr.i(i, i2)) {
            C0794zm c0794zm6 = this.I;
            if (Qr.i(c0794zm6.k, c0794zm6.j)) {
                i3 = i10;
                i4 = i9;
            } else {
                i4 = z3.k;
                i3 = z3.j;
            }
        } else {
            i3 = i10;
            i4 = i9;
        }
        C0794zm c0794zm7 = this.I;
        InterfaceC0732xm interfaceC0732xmU2 = c0794zm7.u(obj, interfaceC0212gq, c0443ob2, c0794zm7.E, c0794zm7.d, i4, i3, c0794zm7);
        c0443ob2.c = ho;
        c0443ob2.d = interfaceC0732xmU2;
        return c0443ob2;
    }

    @Override // defpackage.Z3
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C0794zm clone() {
        C0794zm c0794zm = (C0794zm) super.clone();
        c0794zm.E = c0794zm.E.clone();
        if (c0794zm.G != null) {
            c0794zm.G = new ArrayList(c0794zm.G);
        }
        C0794zm c0794zm2 = c0794zm.H;
        if (c0794zm2 != null) {
            c0794zm.H = c0794zm2.clone();
        }
        C0794zm c0794zm3 = c0794zm.I;
        if (c0794zm3 != null) {
            c0794zm.I = c0794zm3.clone();
        }
        return c0794zm;
    }

    public final void w(InterfaceC0212gq interfaceC0212gq, Z3 z3) {
        Ud.k(interfaceC0212gq);
        if (!this.K) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC0732xm interfaceC0732xmU = u(new Object(), interfaceC0212gq, null, this.E, z3.d, z3.k, z3.j, z3);
        InterfaceC0732xm interfaceC0732xmG = interfaceC0212gq.g();
        if (interfaceC0732xmU.b(interfaceC0732xmG) && (z3.i || !interfaceC0732xmG.j())) {
            Ud.l("Argument must not be null", interfaceC0732xmG);
            if (interfaceC0732xmG.isRunning()) {
                return;
            }
            interfaceC0732xmG.f();
            return;
        }
        this.B.l(interfaceC0212gq);
        interfaceC0212gq.b(interfaceC0732xmU);
        Em em = this.B;
        synchronized (em) {
            em.f.a.add(interfaceC0212gq);
            Lo lo = em.d;
            ((Set) lo.c).add(interfaceC0732xmU);
            if (lo.b) {
                interfaceC0732xmU.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) lo.d).add(interfaceC0732xmU);
            } else {
                interfaceC0732xmU.f();
            }
        }
    }

    public final C0794zm x(Object obj) {
        if (this.v) {
            return clone().x(obj);
        }
        this.F = obj;
        this.K = true;
        k();
        return this;
    }
}
