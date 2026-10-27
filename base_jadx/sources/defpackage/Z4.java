package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Z4 implements InterfaceC0102d8 {
    public final /* synthetic */ int a;

    @Override // defpackage.InterfaceC0102d8
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.InterfaceC0102d8
    public final InterfaceC0132e8 b(Object obj) {
        switch (this.a) {
            case 0:
                return new C0006a5((ByteBuffer) obj, 0);
            case 1:
                return new L(obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }
}
