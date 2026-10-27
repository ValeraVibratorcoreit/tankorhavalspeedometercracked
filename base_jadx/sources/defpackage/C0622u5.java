package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0622u5 extends Pg {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0622u5(Object obj, Context context, int i) {
        super(context);
        this.q = i;
        this.r = obj;
    }

    @Override // defpackage.Pg
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                ((CarouselLayoutManager) this.r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.Pg
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                ((CarouselLayoutManager) this.r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.Pg
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.Pg
    public int e(int i) {
        switch (this.q) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // defpackage.Pg
    public PointF f(int i) {
        switch (this.q) {
            case 0:
                return ((CarouselLayoutManager) this.r).a(i);
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.Pg
    public void h(View view, C0208gm c0208gm) {
        switch (this.q) {
            case 1:
                C0668vk c0668vk = (C0668vk) this.r;
                int[] iArrA = c0668vk.a(c0668vk.a.getLayoutManager(), view);
                int i = iArrA[0];
                int i2 = iArrA[1];
                int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    c0208gm.a = i;
                    c0208gm.b = i2;
                    c0208gm.c = iCeil;
                    c0208gm.e = decelerateInterpolator;
                    c0208gm.f = true;
                }
                break;
            default:
                super.h(view, c0208gm);
                break;
        }
    }
}
