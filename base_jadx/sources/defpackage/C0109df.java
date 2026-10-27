package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0109df implements Xi {
    public static final C0483pk b = C0483pk.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final Vi a;

    public C0109df(Vi vi) {
        this.a = vi;
    }

    @Override // defpackage.Xi
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        C0046be c0046be = (C0046be) obj;
        Vi vi = this.a;
        if (vi != null) {
            Ui uiA = Ui.a(c0046be);
            Ti ti = (Ti) vi.a;
            Object objA = ti.a(uiA);
            ArrayDeque arrayDeque = Ui.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(uiA);
            }
            C0046be c0046be2 = (C0046be) objA;
            if (c0046be2 == null) {
                ti.d(Ui.a(c0046be), c0046be);
            } else {
                c0046be = c0046be2;
            }
        }
        return new Wi(c0046be, new C0232hf(c0046be, ((Integer) c0544rk.c(b)).intValue()));
    }
}
