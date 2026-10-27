package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0462p {
    public static final C0462p b;
    public static final C0462p c;
    public final Throwable a;

    static {
        if (AbstractFutureC0647v.d) {
            c = null;
            b = null;
        } else {
            c = new C0462p(false, null);
            b = new C0462p(true, null);
        }
    }

    public C0462p(boolean z, CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
