package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Wi {
    public final InterfaceC0171fg a;
    public final List b;
    public final InterfaceC0009a8 c;

    public Wi(InterfaceC0171fg interfaceC0171fg, InterfaceC0009a8 interfaceC0009a8) {
        List listEmptyList = Collections.emptyList();
        Ud.l("Argument must not be null", interfaceC0171fg);
        this.a = interfaceC0171fg;
        Ud.l("Argument must not be null", listEmptyList);
        this.b = listEmptyList;
        Ud.l("Argument must not be null", interfaceC0009a8);
        this.c = interfaceC0009a8;
    }
}
