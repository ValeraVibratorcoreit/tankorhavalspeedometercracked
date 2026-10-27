package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0797zp implements Mm {
    public final List a;
    public final Mm b;
    public final C0634uh c;

    public C0797zp(ArrayList arrayList, Y4 y4, C0634uh c0634uh) {
        this.a = arrayList;
        this.b = y4;
        this.c = c0634uh;
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, c0544rk);
    }

    @Override // defpackage.Mm
    public final boolean b(Object obj, C0544rk c0544rk) {
        return !((Boolean) c0544rk.c(Sd.b)).booleanValue() && Td.t(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
