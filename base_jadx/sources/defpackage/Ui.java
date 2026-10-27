package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class Ui {
    public static final ArrayDeque d;
    public int a;
    public int b;
    public Object c;

    static {
        char[] cArr = Qr.a;
        d = new ArrayDeque(0);
    }

    public static Ui a(Object obj) {
        Ui ui;
        ArrayDeque arrayDeque = d;
        synchronized (arrayDeque) {
            ui = (Ui) arrayDeque.poll();
        }
        if (ui == null) {
            ui = new Ui();
        }
        ui.c = obj;
        ui.b = 0;
        ui.a = 0;
        return ui;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ui)) {
            return false;
        }
        Ui ui = (Ui) obj;
        return this.b == ui.b && this.a == ui.a && this.c.equals(ui.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }
}
