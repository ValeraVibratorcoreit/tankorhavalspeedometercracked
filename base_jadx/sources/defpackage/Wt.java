package defpackage;

import android.view.View;
import android.view.Window;
import com.jcraft.jsch.SftpATTRS;

/* JADX INFO: loaded from: classes.dex */
public final class Wt extends Td {
    public final Window h;
    public final Vi i;

    public Wt(Window window, Vi vi) {
        this.h = window;
        this.i = vi;
    }

    @Override // defpackage.Td
    public final void E(boolean z) {
        if (!z) {
            R(16);
            return;
        }
        Window window = this.h;
        window.clearFlags(134217728);
        window.addFlags(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // defpackage.Td
    public final void F(boolean z) {
        if (!z) {
            R(8192);
            return;
        }
        Window window = this.h;
        window.clearFlags(67108864);
        window.addFlags(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    @Override // defpackage.Td
    public final void H() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((8 & i) != 0) {
                if (i == 1) {
                    R(4);
                    this.h.clearFlags(1024);
                } else if (i == 2) {
                    R(2);
                } else if (i == 8) {
                    ((Vi) this.i.a).f();
                }
            }
        }
    }

    public final void R(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
