package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class Ab extends C0690wb {
    public Ab(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void w(long j) throws IOException {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= (long) i;
        }
        n((int) j);
    }

    public Ab(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
