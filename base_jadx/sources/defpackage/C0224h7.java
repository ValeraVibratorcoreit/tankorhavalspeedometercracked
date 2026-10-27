package defpackage;

import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0224h7 {
    public int b;
    public boolean c;
    public final C0655v7 d;
    public final int e;
    public C0224h7 f;
    public Wo i;
    public HashSet a = null;
    public int g = 0;
    public int h = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    public C0224h7(C0655v7 c0655v7, int i) {
        this.d = c0655v7;
        this.e = i;
    }

    public final void a(C0224h7 c0224h7, int i) {
        b(c0224h7, i, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, false);
    }

    public final boolean b(C0224h7 c0224h7, int i, int i2, boolean z) {
        if (c0224h7 == null) {
            j();
            return true;
        }
        if (!z && !i(c0224h7)) {
            return false;
        }
        this.f = c0224h7;
        if (c0224h7.a == null) {
            c0224h7.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, C0584st c0584st, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                F4.z(((C0224h7) it.next()).d, i, arrayList, c0584st);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        C0224h7 c0224h7;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0224h7 = this.f) == null || c0224h7.d.g0 != 8) ? this.g : i;
    }

    public final C0224h7 f() {
        int i = this.e;
        int iO = Vo.o(i);
        C0655v7 c0655v7 = this.d;
        switch (iO) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0655v7.K;
            case 2:
                return c0655v7.L;
            case 3:
                return c0655v7.I;
            case 4:
                return c0655v7.J;
            default:
                throw new AssertionError(Vo.n(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0224h7) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(C0224h7 c0224h7) {
        if (c0224h7 == null) {
            return false;
        }
        int i = this.e;
        C0655v7 c0655v7 = c0224h7.d;
        int i2 = c0224h7.e;
        if (i2 == i) {
            return i != 6 || (c0655v7.E && this.d.E);
        }
        switch (Vo.o(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (c0655v7 instanceof C0138ee) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (c0655v7 instanceof C0138ee) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(Vo.n(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0224h7 c0224h7 = this.f;
        if (c0224h7 != null && (hashSet = c0224h7.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        Wo wo = this.i;
        if (wo == null) {
            this.i = new Wo(1);
        } else {
            wo.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + Vo.n(this.e);
    }
}
