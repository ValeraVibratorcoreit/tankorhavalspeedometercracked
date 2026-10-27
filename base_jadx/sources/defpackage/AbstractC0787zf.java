package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0787zf extends FrameLayout implements Dg {
    public final Fg a;
    public final Context b;
    public int c;
    public int d;

    public AbstractC0787zf(Context context, Dg dg, int i) {
        super(context);
        this.c = 1;
        this.b = context;
        this.d = i;
        Fg fg = new Fg(this);
        this.a = fg;
        if (dg != null) {
            fg.g(((Fg) dg.getLifecycle()).c);
        }
    }

    public int getLayout() {
        return this.d;
    }

    @Override // defpackage.Dg
    public AbstractC0695wg getLifecycle() {
        return this.a;
    }

    public int getNeedleMode() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e(EnumC0602tg.ON_START);
        C0768yr.e("T500.INFO_FR", "onAttachedToWindow()-".concat(getClass().getName()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.e(EnumC0602tg.ON_STOP);
        C0768yr.e("T500.INFO_FR", "onDetachedFromWindow()-".concat(getClass().getName()));
    }
}
