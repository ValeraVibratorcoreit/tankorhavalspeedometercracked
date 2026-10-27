package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0088cp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0118dp b;
    public final /* synthetic */ O8 c;

    public /* synthetic */ RunnableC0088cp(O8 o8, C0118dp c0118dp, int i) {
        this.a = i;
        this.c = o8;
        this.b = c0118dp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c.b;
                C0118dp c0118dp = this.b;
                if (arrayList.contains(c0118dp)) {
                    Vo.a(c0118dp.c.E, c0118dp.a);
                }
                break;
            default:
                O8 o8 = this.c;
                ArrayList arrayList2 = o8.b;
                C0118dp c0118dp2 = this.b;
                arrayList2.remove(c0118dp2);
                o8.c.remove(c0118dp2);
                break;
        }
    }
}
