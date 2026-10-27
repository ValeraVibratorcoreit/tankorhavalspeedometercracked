package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128e4 implements Handler.Callback {
    public final /* synthetic */ int a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    Vo.l(message.obj);
                    throw null;
                }
                if (i != 1) {
                    return false;
                }
                Vo.l(message.obj);
                throw null;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((Im) message.obj).e();
                return true;
        }
    }
}
