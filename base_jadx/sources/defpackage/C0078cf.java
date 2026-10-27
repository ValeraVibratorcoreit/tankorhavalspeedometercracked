package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0078cf extends IOException {
    public C0078cf(String str, int i, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
