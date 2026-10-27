package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Vd extends ContextWrapper {
    public static final Hd k;
    public final C0634uh a;
    public final G7 b;
    public final C0225h8 c;
    public final C0225h8 d;
    public final List e;
    public final Map f;
    public final C0166fb g;
    public final C0308k0 h;
    public final int i;
    public Gm j;

    static {
        Hd hd = new Hd();
        hd.a = Fj.a;
        k = hd;
    }

    public Vd(Context context, C0634uh c0634uh, Lo lo, C0225h8 c0225h8, C0225h8 c0225h9, C0066c3 c0066c3, List list, C0166fb c0166fb, C0308k0 c0308k0) {
        super(context.getApplicationContext());
        this.a = c0634uh;
        this.c = c0225h8;
        this.d = c0225h9;
        this.e = list;
        this.f = c0066c3;
        this.g = c0166fb;
        this.h = c0308k0;
        this.i = 4;
        this.b = new G7(lo);
    }

    public final C0577sm a() {
        return (C0577sm) this.b.get();
    }
}
