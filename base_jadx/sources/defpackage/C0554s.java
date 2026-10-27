package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0554s extends Ud {
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;

    public C0554s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.h = atomicReferenceFieldUpdater;
        this.i = atomicReferenceFieldUpdater2;
        this.j = atomicReferenceFieldUpdater3;
        this.k = atomicReferenceFieldUpdater4;
        this.l = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.Ud
    public final void a0(C0616u c0616u, C0616u c0616u2) {
        this.i.lazySet(c0616u, c0616u2);
    }

    @Override // defpackage.Ud
    public final void b0(C0616u c0616u, Thread thread) {
        this.h.lazySet(c0616u, thread);
    }

    @Override // defpackage.Ud
    public final boolean f(AbstractFutureC0647v abstractFutureC0647v, r rVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r rVar2 = r.b;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0647v, rVar, rVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0647v) == rVar);
        return false;
    }

    @Override // defpackage.Ud
    public final boolean g(AbstractFutureC0647v abstractFutureC0647v, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0647v, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0647v) == obj);
        return false;
    }

    @Override // defpackage.Ud
    public final boolean h(AbstractFutureC0647v abstractFutureC0647v, C0616u c0616u, C0616u c0616u2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0647v, c0616u, c0616u2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0647v) == c0616u);
        return false;
    }
}
