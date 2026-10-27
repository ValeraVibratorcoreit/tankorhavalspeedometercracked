package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0782za {
    public static final Object j = new Object();
    public static volatile C0782za k;
    public final ReentrantReadWriteLock a;
    public final C0127e3 b;
    public volatile int c;
    public final Handler d;
    public final C0627ua e;
    public final InterfaceC0751ya f;
    public final C0225h8 g;
    public final int h;
    public final C0625u8 i;

    public C0782za(C0198gc c0198gc) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        InterfaceC0751ya interfaceC0751ya = (InterfaceC0751ya) c0198gc.b;
        this.f = interfaceC0751ya;
        int i = c0198gc.a;
        this.h = i;
        this.i = (C0625u8) c0198gc.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new C0127e3();
        this.g = new C0225h8(6);
        C0627ua c0627ua = new C0627ua(this);
        this.e = c0627ua;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0751ya.a(new C0596ta(c0627ua));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C0782za a() {
        C0782za c0782za;
        synchronized (j) {
            try {
                c0782za = k;
                if (!(c0782za != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0782za;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            C0627ua c0627ua = this.e;
            C0782za c0782za = c0627ua.a;
            try {
                c0782za.f.a(new C0596ta(c0627ua));
            } catch (Throwable th) {
                c0782za.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC0375m5(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC0375m5(arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(CharSequence charSequence, int i, int i2) {
        Gr[] grArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        Tf.c("start should be <= than end", i <= i2);
        Jr jr = null;
        if (charSequence == null) {
            return null;
        }
        Tf.c("start should be < than charSequence length", i <= charSequence.length());
        Tf.c("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        K2 k2 = this.e.b;
        k2.getClass();
        boolean z = charSequence instanceof C0026ap;
        if (z) {
            ((C0026ap) charSequence).a();
        }
        if (z) {
            jr = new Jr((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    jr = new Jr((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, Gr.class) <= i2) {
                    jr = new Jr();
                    jr.a = false;
                    jr.b = new SpannableString(charSequence);
                }
            } finally {
                if (z) {
                    ((C0026ap) charSequence).b();
                }
            }
        }
        if (jr != null && (grArr = (Gr[]) jr.b.getSpans(i, i2, Gr.class)) != null && grArr.length > 0) {
            for (Gr gr : grArr) {
                int spanStart = jr.b.getSpanStart(gr);
                int spanEnd = jr.b.getSpanEnd(gr);
                if (spanStart != i2) {
                    jr.removeSpan(gr);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            Jr jr2 = (Jr) k2.I(charSequence, i3, i4, Integer.MAX_VALUE, false, new C0096d2(jr, 14, (C0225h8) k2.b));
            if (jr2 != null) {
                return jr2.b;
            }
            if (!z) {
                return charSequence;
            }
        } else if (!z) {
            return charSequence;
        }
        return charSequence;
    }

    public final void g(AbstractC0720xa abstractC0720xa) {
        Tf.h("initCallback cannot be null", abstractC0720xa);
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new RunnableC0375m5(Arrays.asList(abstractC0720xa), this.c, (Throwable) null));
            } else {
                this.b.add(abstractC0720xa);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
