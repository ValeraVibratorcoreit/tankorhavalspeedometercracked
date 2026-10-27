package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class Km implements InterfaceC0171fg {
    public static final C0727xh j = new C0727xh(50);
    public final C0634uh b;
    public final InterfaceC0171fg c;
    public final InterfaceC0171fg d;
    public final int e;
    public final int f;
    public final Class g;
    public final C0544rk h;
    public final InterfaceC0182fr i;

    public Km(C0634uh c0634uh, InterfaceC0171fg interfaceC0171fg, InterfaceC0171fg interfaceC0171fg2, int i, int i2, InterfaceC0182fr interfaceC0182fr, Class cls, C0544rk c0544rk) {
        this.b = c0634uh;
        this.c = interfaceC0171fg;
        this.d = interfaceC0171fg2;
        this.e = i;
        this.f = i2;
        this.i = interfaceC0182fr;
        this.g = cls;
        this.h = c0544rk;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        Object objE;
        C0634uh c0634uh = this.b;
        synchronized (c0634uh) {
            C0603th c0603th = c0634uh.b;
            Mk mkB = (Mk) ((ArrayDeque) c0603th.a).poll();
            if (mkB == null) {
                mkB = c0603th.b();
            }
            C0572sh c0572sh = (C0572sh) mkB;
            c0572sh.b = 8;
            c0572sh.c = byte[].class;
            objE = c0634uh.e(c0572sh, byte[].class);
        }
        byte[] bArr = (byte[]) objE;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC0182fr interfaceC0182fr = this.i;
        if (interfaceC0182fr != null) {
            interfaceC0182fr.a(messageDigest);
        }
        this.h.a(messageDigest);
        C0727xh c0727xh = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) c0727xh.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC0171fg.a);
            c0727xh.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.g(bArr);
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (!(obj instanceof Km)) {
            return false;
        }
        Km km = (Km) obj;
        return this.f == km.f && this.e == km.e && Qr.b(this.i, km.i) && this.g.equals(km.g) && this.c.equals(km.c) && this.d.equals(km.d) && this.h.equals(km.h);
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        InterfaceC0182fr interfaceC0182fr = this.i;
        if (interfaceC0182fr != null) {
            iHashCode = (iHashCode * 31) + interfaceC0182fr.hashCode();
        }
        return this.h.b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
