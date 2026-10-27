package defpackage;

/* JADX INFO: renamed from: vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0667vj implements Vn, InterfaceC0394mo {
    public final /* synthetic */ C0729xj a;

    public /* synthetic */ C0667vj(C0729xj c0729xj) {
        this.a = c0729xj;
    }

    @Override // defpackage.InterfaceC0394mo
    public void b(String str) {
        C0729xj c0729xj = this.a;
        c0729xj.T.z = str;
        c0729xj.U.setRowEnabled(!str.equals("Default"));
        c0729xj.c0(str);
        c0729xj.h0();
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        this.a.h0();
    }
}
