package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: renamed from: i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0257i9 implements InterfaceC0009a8 {
    public final Resources.Theme a;
    public final Resources b;
    public final S3 c;
    public final int d;
    public Object e;

    public C0257i9(Resources.Theme theme, Resources resources, S3 s3, int i) {
        this.a = theme;
        this.b = resources;
        this.c = s3;
        this.d = i;
    }

    @Override // defpackage.InterfaceC0009a8
    public final Class a() {
        return this.c.l();
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.h(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) {
        try {
            Object objP = this.c.p(this.b, this.d, this.a);
            this.e = objP;
            z7.m(objP);
        } catch (Resources.NotFoundException e) {
            z7.h(e);
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        return 1;
    }
}
