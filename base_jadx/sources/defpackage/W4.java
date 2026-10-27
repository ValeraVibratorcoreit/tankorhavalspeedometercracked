package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class W4 implements InterfaceC0009a8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ W4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.InterfaceC0009a8
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        int i = this.a;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) {
        switch (this.a) {
            case 0:
                try {
                    z7.m(AbstractC0099d5.a((File) this.b));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    z7.h(e);
                    return;
                }
                break;
            default:
                z7.m(this.b);
                break;
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }
}
