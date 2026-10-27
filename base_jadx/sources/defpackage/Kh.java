package defpackage;

import com.jcraft.jsch.SftpATTRS;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Kh extends FilterInputStream {
    public int a;

    public Kh(C0474pb c0474pb) {
        super(c0474pb);
        this.a = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    public final long n(long j) {
        int i = this.a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (n(1L) == -1) {
            return -1;
        }
        int i = super.read();
        w(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.a = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jN = n(j);
        if (jN == -1) {
            return 0L;
        }
        long jSkip = super.skip(jN);
        w(jSkip);
        return jSkip;
    }

    public final void w(long j) {
        int i = this.a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iN = (int) n(i2);
        if (iN == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iN);
        w(i3);
        return i3;
    }
}
