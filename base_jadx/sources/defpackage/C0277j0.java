package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0277j0 extends C0003a2 implements InterfaceC0370m0 {
    public final /* synthetic */ C0339l0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0277j0(C0339l0 c0339l0, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c0339l0;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0059br.a(this, getContentDescription());
        setOnTouchListener(new C0124e0(this, this));
    }

    @Override // defpackage.InterfaceC0370m0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.InterfaceC0370m0
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            O9.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
