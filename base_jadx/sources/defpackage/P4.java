package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface P4 extends Xo, ReadableByteChannel {
    void a(long j);

    C0129e5 g(long j);

    String h(long j);

    String k();

    void l(long j);

    L4 o();

    boolean p();

    byte readByte();

    int readInt();

    short readShort();

    long s();

    String t(Charset charset);

    int u(C0514qk c0514qk);

    InputStream v();
}
