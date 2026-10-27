package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Ka {
    public int a = 1;
    public final Ri b;
    public Ri c;
    public Ri d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public Ka(Ri ri, boolean z, int[] iArr) {
        this.b = ri;
        this.c = ri;
        this.g = z;
        this.h = iArr;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        int[] iArr;
        Pi piC = this.c.b.c();
        int iA = piC.a(6);
        if ((iA == 0 || ((ByteBuffer) piC.d).get(iA + piC.a) == 0) && this.e != 65039) {
            return this.g && ((iArr = this.h) == null || Arrays.binarySearch(iArr, this.c.b.a(0)) < 0);
        }
        return true;
    }
}
