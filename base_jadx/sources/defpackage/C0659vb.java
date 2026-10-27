package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0659vb extends MediaDataSource {
    public long a;
    public final /* synthetic */ Ab b;

    public C0659vb(Ab ab) {
        this.b = ab;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            Ab ab = this.b;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) ab.a.available())) {
                    return -1;
                }
                ab.w(j);
                this.a = j;
            }
            if (i2 > ab.a.available()) {
                i2 = ab.a.available();
            }
            int i3 = ab.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }
}
