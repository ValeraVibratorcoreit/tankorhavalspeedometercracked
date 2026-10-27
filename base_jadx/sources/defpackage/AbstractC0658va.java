package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.jcraft.jsch.SftpATTRS;

/* JADX INFO: renamed from: va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658va {
    public int a;
    public final Object b;
    public final Object c;

    public AbstractC0658va(Wl wl) {
        this.a = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.c = new Rect();
        this.b = wl;
    }

    public static AbstractC0658va a(Wl wl, int i) {
        if (i == 0) {
            return new C0575sk(wl, 0);
        }
        if (i == 1) {
            return new C0575sk(wl, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return l() - this.a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public AbstractC0658va(InterfaceC0751ya interfaceC0751ya) {
        this.a = 0;
        this.c = new C0625u8();
        this.b = interfaceC0751ya;
    }
}
