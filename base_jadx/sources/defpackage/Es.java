package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Es implements OnReceiveContentListener {
    public final InterfaceC0237hk a;

    public Es(InterfaceC0237hk interfaceC0237hk) {
        this.a = interfaceC0237hk;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        E7 e7 = new E7(new C0308k0(contentInfo));
        E7 e7A = ((C0798zq) this.a).a(view, e7);
        if (e7A == null) {
            return null;
        }
        if (e7A == e7) {
            return contentInfo;
        }
        ContentInfo contentInfoJ = e7A.a.j();
        Objects.requireNonNull(contentInfoJ);
        return AbstractC0776z4.g(contentInfoJ);
    }
}
