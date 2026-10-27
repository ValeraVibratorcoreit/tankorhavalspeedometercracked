package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046be implements InterfaceC0171fg {
    public final InterfaceC0600te b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public C0046be(URL url) {
        C0417ng c0417ng = InterfaceC0600te.a;
        Ud.l("Argument must not be null", url);
        this.c = url;
        this.d = null;
        Ud.l("Argument must not be null", c0417ng);
        this.b = c0417ng;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(InterfaceC0171fg.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        Ud.l("Argument must not be null", url);
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.c;
                    Ud.l("Argument must not be null", url);
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0046be)) {
            return false;
        }
        C0046be c0046be = (C0046be) obj;
        return c().equals(c0046be.c()) && this.b.equals(c0046be.b);
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public C0046be(String str) {
        C0417ng c0417ng = InterfaceC0600te.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            Ud.l("Argument must not be null", c0417ng);
            this.b = c0417ng;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
