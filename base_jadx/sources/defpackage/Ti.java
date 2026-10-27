package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class Ti extends C0727xh {
    @Override // defpackage.C0727xh
    public final void c(Object obj, Object obj2) {
        Ui ui = (Ui) obj;
        ui.getClass();
        ArrayDeque arrayDeque = Ui.d;
        synchronized (arrayDeque) {
            arrayDeque.offer(ui);
        }
    }
}
