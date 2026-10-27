package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ P6 b;

    public /* synthetic */ E6(P6 p6, int i) {
        this.a = i;
        this.b = p6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                P6 p6 = this.b;
                Tf.j("this$0", p6);
                p6.invalidateOptionsMenu();
                return;
            default:
                P6 p7 = this.b;
                Tf.j("this$0", p7);
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!Tf.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!Tf.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
