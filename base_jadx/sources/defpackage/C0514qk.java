package defpackage;

import java.util.RandomAccess;

/* JADX INFO: renamed from: qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0514qk extends AbstractC0400n implements RandomAccess {
    public final C0129e5[] a;
    public final int[] b;

    public C0514qk(C0129e5[] c0129e5Arr, int[] iArr) {
        this.a = c0129e5Arr;
        this.b = iArr;
    }

    @Override // defpackage.AbstractC0400n
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.AbstractC0400n, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0129e5) {
            return super.contains((C0129e5) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.AbstractC0400n, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0129e5) {
            return super.indexOf((C0129e5) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC0400n, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0129e5) {
            return super.lastIndexOf((C0129e5) obj);
        }
        return -1;
    }
}
