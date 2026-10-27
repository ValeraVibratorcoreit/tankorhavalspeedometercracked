package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class X implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.a) {
            case 0:
                ((AbstractC0494q0) this.b).a();
                break;
            case 1:
                P0 p0 = (P0) this.b;
                if (view == p0.k && (message3 = p0.m) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != p0.o || (message2 = p0.q) == null) {
                    messageObtain = (view != p0.s || (message = p0.u) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                p0.K.obtainMessage(1, p0.b).sendToTarget();
                break;
            case 2:
                Yh yh = (Yh) this.b;
                int i = yh.X;
                if (i == 2) {
                    yh.P(1);
                } else if (i == 1) {
                    yh.P(2);
                }
                break;
            default:
                Tq tq = ((Toolbar) this.b).M;
                C0759yi c0759yi = tq == null ? null : tq.b;
                if (c0759yi != null) {
                    c0759yi.collapseActionView();
                }
                break;
        }
    }
}
