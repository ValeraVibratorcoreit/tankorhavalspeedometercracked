package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class Y1 extends ImageButton {
    public final C0556s1 a;
    public final Z1 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Kq.a(context);
        this.c = false;
        Cq.a(this, getContext());
        C0556s1 c0556s1 = new C0556s1(this);
        this.a = c0556s1;
        c0556s1.d(attributeSet, i);
        Z1 z1 = new Z1(this);
        this.b = z1;
        z1.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.a();
        }
        Z1 z1 = this.b;
        if (z1 != null) {
            z1.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            return c0556s1.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            return c0556s1.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        W6 w6;
        Z1 z1 = this.b;
        if (z1 == null || (w6 = (W6) z1.d) == null) {
            return null;
        }
        return (ColorStateList) w6.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        W6 w6;
        Z1 z1 = this.b;
        if (z1 == null || (w6 = (W6) z1.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) w6.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.b.c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Z1 z1 = this.b;
        if (z1 != null) {
            z1.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Z1 z1 = this.b;
        if (z1 != null && drawable != null && !this.c) {
            z1.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (z1 != null) {
            z1.a();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) z1.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(z1.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Z1 z1 = this.b;
        ImageView imageView = (ImageView) z1.c;
        if (i != 0) {
            Drawable drawableF = F4.F(imageView.getContext(), i);
            if (drawableF != null) {
                W9.a(drawableF);
            }
            imageView.setImageDrawable(drawableF);
        } else {
            imageView.setImageDrawable(null);
        }
        z1.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Z1 z1 = this.b;
        if (z1 != null) {
            z1.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        Z1 z1 = this.b;
        if (z1 != null) {
            if (((W6) z1.d) == null) {
                z1.d = new W6();
            }
            W6 w6 = (W6) z1.d;
            w6.c = colorStateList;
            w6.b = true;
            z1.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        Z1 z1 = this.b;
        if (z1 != null) {
            if (((W6) z1.d) == null) {
                z1.d = new W6();
            }
            W6 w6 = (W6) z1.d;
            w6.d = mode;
            w6.a = true;
            z1.a();
        }
    }
}
