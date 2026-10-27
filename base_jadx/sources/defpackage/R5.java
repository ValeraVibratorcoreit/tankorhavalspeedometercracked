package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class R5 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public R5(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        U5 u5 = this.a.e;
        if (u5 != null) {
            u5.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
