package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0703wo extends AbstractC0734xo {
    public float b;
    public float c;

    @Override // defpackage.AbstractC0734xo
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
