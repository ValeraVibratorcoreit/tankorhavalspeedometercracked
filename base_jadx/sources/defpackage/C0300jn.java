package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0300jn {
    public AbstractC0615tt a;
    public ArrayList b;

    public static long a(X8 x8, long j) {
        AbstractC0615tt abstractC0615tt = x8.d;
        if (abstractC0615tt instanceof C0631ue) {
            return j;
        }
        ArrayList arrayList = x8.k;
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            V8 v8 = (V8) arrayList.get(i);
            if (v8 instanceof X8) {
                X8 x9 = (X8) v8;
                if (x9.d != abstractC0615tt) {
                    jMin = Math.min(jMin, a(x9, ((long) x9.f) + j));
                }
            }
        }
        if (x8 != abstractC0615tt.i) {
            return jMin;
        }
        long j2 = abstractC0615tt.j();
        X8 x10 = abstractC0615tt.h;
        long j3 = j - j2;
        return Math.min(Math.min(jMin, a(x10, j3)), j3 - ((long) x10.f));
    }

    public static long b(X8 x8, long j) {
        AbstractC0615tt abstractC0615tt = x8.d;
        if (abstractC0615tt instanceof C0631ue) {
            return j;
        }
        ArrayList arrayList = x8.k;
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            V8 v8 = (V8) arrayList.get(i);
            if (v8 instanceof X8) {
                X8 x9 = (X8) v8;
                if (x9.d != abstractC0615tt) {
                    jMax = Math.max(jMax, b(x9, ((long) x9.f) + j));
                }
            }
        }
        if (x8 != abstractC0615tt.h) {
            return jMax;
        }
        long j2 = abstractC0615tt.j();
        X8 x10 = abstractC0615tt.i;
        long j3 = j + j2;
        return Math.max(Math.max(jMax, b(x10, j3)), j3 - ((long) x10.f));
    }
}
