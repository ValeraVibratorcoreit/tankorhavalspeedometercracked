package defpackage;

/* JADX INFO: renamed from: en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0147en extends F4 {
    @Override // defpackage.F4
    public final void D(C0796zo c0796zo, float f, float f2) {
        c0796zo.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C0672vo c0672vo = new C0672vo(0.0f, 0.0f, f3, f3);
        c0672vo.f = 180.0f;
        c0672vo.g = 90.0f;
        c0796zo.g.add(c0672vo);
        C0610to c0610to = new C0610to(c0672vo);
        c0796zo.a(180.0f);
        c0796zo.h.add(c0610to);
        c0796zo.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c0796zo.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c0796zo.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
