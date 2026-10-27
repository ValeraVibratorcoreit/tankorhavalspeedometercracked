package defpackage;

/* JADX INFO: renamed from: t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585t extends Ud {
    @Override // defpackage.Ud
    public final void a0(C0616u c0616u, C0616u c0616u2) {
        c0616u.b = c0616u2;
    }

    @Override // defpackage.Ud
    public final void b0(C0616u c0616u, Thread thread) {
        c0616u.a = thread;
    }

    @Override // defpackage.Ud
    public final boolean f(AbstractFutureC0647v abstractFutureC0647v, r rVar) {
        r rVar2 = r.b;
        synchronized (abstractFutureC0647v) {
            try {
                if (abstractFutureC0647v.b != rVar) {
                    return false;
                }
                abstractFutureC0647v.b = rVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Ud
    public final boolean g(AbstractFutureC0647v abstractFutureC0647v, Object obj, Object obj2) {
        synchronized (abstractFutureC0647v) {
            try {
                if (abstractFutureC0647v.a != obj) {
                    return false;
                }
                abstractFutureC0647v.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Ud
    public final boolean h(AbstractFutureC0647v abstractFutureC0647v, C0616u c0616u, C0616u c0616u2) {
        synchronized (abstractFutureC0647v) {
            try {
                if (abstractFutureC0647v.c != c0616u) {
                    return false;
                }
                abstractFutureC0647v.c = c0616u2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
