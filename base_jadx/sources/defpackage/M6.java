package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ M6(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                N6 n6 = (N6) this.b;
                Tf.j("this$0", n6);
                Object obj = ((L) this.d).a;
                String str = (String) n6.a.get(Integer.valueOf(this.c));
                if (str != null) {
                    B0 b0 = (B0) n6.e.get(str);
                    if ((b0 != null ? b0.a : null) != null) {
                        Gc gc = b0.a;
                        Tf.g("null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>", gc);
                        if (n6.d.remove(str)) {
                            gc.a(obj);
                        }
                    } else {
                        n6.g.remove(str);
                        n6.f.put(str, obj);
                    }
                    break;
                }
                break;
            case 1:
                N6 n7 = (N6) this.b;
                Tf.j("this$0", n7);
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.d;
                Tf.j("$e", sendIntentException);
                n7.a(this.c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((Z8) this.b).b.b(this.c, (Serializable) this.d);
                break;
        }
    }
}
