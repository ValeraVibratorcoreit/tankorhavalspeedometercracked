package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: so, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0579so extends AbstractC0765yo {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public C0579so(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.AbstractC0765yo
    public final void a(Matrix matrix, C0425no c0425no, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((AbstractC0765yo) it.next()).a(this.d, c0425no, i, canvas);
        }
    }
}
