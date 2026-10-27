package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415ne extends AbstractC0293jg implements InterfaceC0107dd {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0415ne(Object obj, int i) {
        super(0);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.InterfaceC0107dd
    public final Object a() {
        switch (this.b) {
            case 0:
                return (List) this.c;
            case 1:
                try {
                    return (List) ((InterfaceC0107dd) this.c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return Sa.a;
                }
            default:
                return Tf.G((Ss) this.c);
        }
    }
}
