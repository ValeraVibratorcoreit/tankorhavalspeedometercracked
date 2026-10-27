package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: renamed from: fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0171fg {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
