package defpackage;

import java.security.MessageDigest;

/* JADX INFO: renamed from: pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0486pn implements Ib {
    public final MessageDigest a;
    public final C0704wp b = new C0704wp();

    public C0486pn(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.Ib
    public final C0704wp b() {
        return this.b;
    }
}
