package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0278j1 extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0278j1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                C0309k1 c0309k1 = new C0309k1(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                c0309k1.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0309k1.f);
                return c0309k1;
            default:
                return new Id(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                C0309k1 c0309k1 = new C0309k1(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                c0309k1.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0309k1.f);
                return c0309k1;
            default:
                return new Id(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                C0309k1 c0309k1 = new C0309k1(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                c0309k1.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(c0309k1.f);
                return c0309k1;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
