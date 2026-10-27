package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface O4 extends Mo, WritableByteChannel {
    O4 c(byte[] bArr);

    O4 e(long j);

    @Override // defpackage.Mo, java.io.Flushable
    void flush();

    O4 i(int i);

    O4 j(int i);

    O4 m(String str);

    O4 q(int i);

    O4 r(C0129e5 c0129e5);
}
