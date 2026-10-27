package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0018ah b;

    public /* synthetic */ Wg(C0018ah c0018ah, int i) {
        this.a = i;
        this.b = c0018ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0073ca c0073ca = this.b.c;
                if (c0073ca != null) {
                    c0073ca.setListSelectionHidden(true);
                    c0073ca.requestLayout();
                }
                break;
            default:
                C0018ah c0018ah = this.b;
                C0073ca c0073ca2 = c0018ah.c;
                if (c0073ca2 != null && c0073ca2.isAttachedToWindow() && c0018ah.c.getCount() > c0018ah.c.getChildCount() && c0018ah.c.getChildCount() <= c0018ah.m) {
                    c0018ah.z.setInputMethodMode(2);
                    c0018ah.e();
                    break;
                }
                break;
        }
    }
}
