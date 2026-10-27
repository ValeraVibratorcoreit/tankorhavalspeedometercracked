package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class Yt extends Td {
    public final WindowInsetsController h;
    public final Vi i;
    public Window j;

    public Yt(WindowInsetsController windowInsetsController, Vi vi) {
        this.h = windowInsetsController;
        this.i = vi;
    }

    @Override // defpackage.Td
    public final void E(boolean z) {
        Window window = this.j;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.h.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.h.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.Td
    public final void F(boolean z) {
        Window window = this.j;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.h.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.h.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.Td
    public final void H() {
        ((Vi) this.i.a).f();
        this.h.show(0);
    }
}
