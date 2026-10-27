package defpackage;

/* JADX INFO: renamed from: pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0485pm {
    public static final C0516qm a;

    static {
        C0516qm c0516qm = null;
        try {
            c0516qm = (C0516qm) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0516qm == null) {
            c0516qm = new C0516qm();
        }
        a = c0516qm;
    }

    public static Y5 a(Class cls) {
        a.getClass();
        return new Y5(cls);
    }
}
