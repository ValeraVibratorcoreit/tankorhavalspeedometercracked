package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060bs extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C0060bs(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0091cs c0091cs = new C0091cs();
        c0091cs.a = (VectorDrawable) this.a.newDrawable();
        return c0091cs;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0091cs c0091cs = new C0091cs();
        c0091cs.a = (VectorDrawable) this.a.newDrawable(resources);
        return c0091cs;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0091cs c0091cs = new C0091cs();
        c0091cs.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c0091cs;
    }
}
