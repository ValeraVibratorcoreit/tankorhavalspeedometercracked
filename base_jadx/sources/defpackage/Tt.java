package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Tt {
    public static final Vt b;
    public final Vt a;

    static {
        Nt lt;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            lt = new Mt();
        } else {
            lt = i >= 29 ? new Lt() : new Kt();
        }
        b = lt.b().a.a().a.b().a.c();
    }

    public Tt(Vt vt) {
        this.a = vt;
    }

    public Vt a() {
        return this.a;
    }

    public Vt b() {
        return this.a;
    }

    public Vt c() {
        return this.a;
    }

    public void d(View view) {
    }

    public C0595t9 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tt)) {
            return false;
        }
        Tt tt = (Tt) obj;
        return n() == tt.n() && m() == tt.m() && Objects.equals(j(), tt.j()) && Objects.equals(h(), tt.h()) && Objects.equals(e(), tt.e());
    }

    public Hf f(int i) {
        return Hf.e;
    }

    public Hf g() {
        return j();
    }

    public Hf h() {
        return Hf.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public Hf i() {
        return j();
    }

    public Hf j() {
        return Hf.e;
    }

    public Hf k() {
        return j();
    }

    public Vt l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(Hf[] hfArr) {
    }

    public void p(Vt vt) {
    }

    public void q(Hf hf) {
    }
}
