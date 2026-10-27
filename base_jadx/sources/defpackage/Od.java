package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class Od implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Od(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                Pd pd = (Pd) this.b;
                if (i == 1) {
                    pd.b((Md) message.obj);
                    return true;
                }
                if (i == 2) {
                    pd.d.l((Md) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                L l = (L) this.b;
                Vo.l(message.obj);
                synchronized (l.a) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
