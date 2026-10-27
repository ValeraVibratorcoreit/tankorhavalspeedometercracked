package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0125e1 extends Animatable2.AnimationCallback {
    public final /* synthetic */ Zh a;

    public C0125e1(Zh zh) {
        this.a = zh;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.o;
        if (colorStateList != null) {
            O9.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0050bi c0050bi = this.a.b;
        ColorStateList colorStateList = c0050bi.o;
        if (colorStateList != null) {
            O9.g(drawable, colorStateList.getColorForState(c0050bi.s, colorStateList.getDefaultColor()));
        }
    }
}
