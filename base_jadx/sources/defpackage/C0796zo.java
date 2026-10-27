package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0796zo {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public C0796zo() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        C0672vo c0672vo = new C0672vo(f4, f5, f4, f5);
        c0672vo.f = this.e;
        c0672vo.g = f3;
        this.h.add(new C0610to(c0672vo));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0734xo) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        C0703wo c0703wo = new C0703wo();
        c0703wo.b = f;
        c0703wo.c = f2;
        this.g.add(c0703wo);
        C0641uo c0641uo = new C0641uo(c0703wo, this.c, this.d);
        float fB = c0641uo.b() + 270.0f;
        float fB2 = c0641uo.b() + 270.0f;
        a(fB);
        this.h.add(c0641uo);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = 0.0f;
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
