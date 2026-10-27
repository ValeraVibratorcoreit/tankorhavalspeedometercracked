package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0590t4 implements InterfaceC0212gq {
    public final View a;
    public final C0061bt b;
    public Animatable c;
    public final /* synthetic */ int d;

    public C0590t4(ImageView imageView, int i) {
        this.d = i;
        this.a = imageView;
        this.b = new C0061bt(imageView);
    }

    @Override // defpackage.InterfaceC0212gq
    public final void a(Qo qo) {
        C0061bt c0061bt = this.b;
        View view = c0061bt.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = c0061bt.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = c0061bt.a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = c0061bt.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((Ho) qo).m(iA, iA2);
            return;
        }
        ArrayList arrayList = c0061bt.b;
        if (!arrayList.contains(qo)) {
            arrayList.add(qo);
        }
        if (c0061bt.c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            P7 p7 = new P7(c0061bt);
            c0061bt.c = p7;
            viewTreeObserver.addOnPreDrawListener(p7);
        }
    }

    @Override // defpackage.InterfaceC0212gq
    public final void b(InterfaceC0732xm interfaceC0732xm) {
        this.a.setTag(R.id.glide_custom_view_target_tag, interfaceC0732xm);
    }

    @Override // defpackage.InterfaceC0212gq
    public final void c(Drawable drawable) {
        l(null);
        this.c = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.InterfaceC0212gq
    public final void d(Qo qo) {
        this.b.b.remove(qo);
    }

    @Override // defpackage.InterfaceC0212gq
    public final void e(Drawable drawable) {
        l(null);
        this.c = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.Bg
    public final void f() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.InterfaceC0212gq
    public final InterfaceC0732xm g() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC0732xm) {
            return (InterfaceC0732xm) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.InterfaceC0212gq
    public final void h(Drawable drawable) {
        C0061bt c0061bt = this.b;
        ViewTreeObserver viewTreeObserver = c0061bt.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c0061bt.c);
        }
        c0061bt.c = null;
        c0061bt.b.clear();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.c = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.InterfaceC0212gq
    public final void i(Object obj) {
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.Bg
    public final void j() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.Bg
    public final void k() {
    }

    public final void l(Object obj) {
        switch (this.d) {
            case 0:
                ((ImageView) this.a).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) this.a).setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.a;
    }
}
