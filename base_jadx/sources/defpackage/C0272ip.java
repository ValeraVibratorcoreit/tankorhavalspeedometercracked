package defpackage;

import java.util.function.Supplier;

/* JADX INFO: renamed from: ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0272ip implements Supplier {
    public final /* synthetic */ String a;

    public /* synthetic */ C0272ip(String str) {
        this.a = str;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Tf.U(this.a);
    }
}
