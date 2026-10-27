package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0647v implements Future {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractFutureC0647v.class.getName());
    public static final Ud f;
    public static final Object g;
    public volatile Object a;
    public volatile r b;
    public volatile C0616u c;

    static {
        Ud c0585t;
        try {
            c0585t = new C0554s(AtomicReferenceFieldUpdater.newUpdater(C0616u.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0616u.class, C0616u.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0647v.class, C0616u.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0647v.class, r.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0647v.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0585t = new C0585t();
        }
        f = c0585t;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void b(AbstractFutureC0647v abstractFutureC0647v) {
        C0616u c0616u;
        r rVar;
        do {
            c0616u = abstractFutureC0647v.c;
        } while (!f.h(abstractFutureC0647v, c0616u, C0616u.c));
        while (c0616u != null) {
            Thread thread = c0616u.a;
            if (thread != null) {
                c0616u.a = null;
                LockSupport.unpark(thread);
            }
            c0616u = c0616u.b;
        }
        do {
            rVar = abstractFutureC0647v.b;
        } while (!f.f(abstractFutureC0647v, rVar));
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = rVar.a;
            rVar.a = rVar2;
            rVar2 = rVar;
            rVar = rVar3;
        }
        while (rVar2 != null) {
            rVar2 = rVar2.a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof C0462p) {
            Throwable th = ((C0462p) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0493q) {
            ((AbstractC0493q) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0462p c0462p;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            c0462p = new C0462p(z, new CancellationException("Future.cancel() was called."));
        } else {
            c0462p = z ? C0462p.b : C0462p.c;
        }
        if (!f.g(this, obj, c0462p)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void d(C0616u c0616u) {
        c0616u.a = null;
        while (true) {
            C0616u c0616u2 = this.c;
            if (c0616u2 == C0616u.c) {
                return;
            }
            C0616u c0616u3 = null;
            while (c0616u2 != null) {
                C0616u c0616u4 = c0616u2.b;
                if (c0616u2.a != null) {
                    c0616u3 = c0616u2;
                } else if (c0616u3 != null) {
                    c0616u3.b = c0616u4;
                    if (c0616u3.a == null) {
                    }
                } else if (!f.h(this, c0616u2, c0616u4)) {
                }
                c0616u2 = c0616u4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0616u c0616u = this.c;
            C0616u c0616u2 = C0616u.c;
            if (c0616u != c0616u2) {
                C0616u c0616u3 = new C0616u();
                while (true) {
                    Ud ud = f;
                    ud.a0(c0616u3, c0616u);
                    if (ud.h(this, c0616u, c0616u3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                d(c0616u3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        d(c0616u3);
                        break;
                    }
                    c0616u = this.c;
                    if (c0616u == c0616u2) {
                    }
                }
            }
            return c(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strF = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strF2 = Vo.f(strF, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strF3 = strF2 + jConvert + " " + lowerCase;
                if (z) {
                    strF3 = Vo.f(strF3, ",");
                }
                strF2 = Vo.f(strF3, " ");
            }
            if (z) {
                strF2 = strF2 + nanos2 + " nanoseconds ";
            }
            strF = Vo.f(strF2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(Vo.f(strF, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strF + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof C0462p;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof C0462p) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0616u c0616u = this.c;
            C0616u c0616u2 = C0616u.c;
            if (c0616u != c0616u2) {
                C0616u c0616u3 = new C0616u();
                do {
                    Ud ud = f;
                    ud.a0(c0616u3, c0616u);
                    if (ud.h(this, c0616u, c0616u3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                d(c0616u3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0616u = this.c;
                } while (c0616u != c0616u2);
            }
            return c(this.a);
        }
        throw new InterruptedException();
    }
}
