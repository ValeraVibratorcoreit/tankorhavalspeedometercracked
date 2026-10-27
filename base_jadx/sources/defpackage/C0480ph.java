package defpackage;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0480ph extends Writer {
    public final StringBuilder b = new StringBuilder(128);
    public final String a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        n();
    }

    public final void n() {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            Log.d(this.a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                n();
            } else {
                this.b.append(c);
            }
        }
    }
}
