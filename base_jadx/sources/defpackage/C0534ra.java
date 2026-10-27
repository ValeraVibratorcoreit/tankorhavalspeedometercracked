package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0534ra extends C0387mh {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0534ra(int i) {
        super(22);
        this.c = i;
    }

    @Override // defpackage.C0387mh
    public final void q(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fCos;
        float fCos2;
        switch (this.c) {
            case 0:
                RectF rectFH = C0387mh.h(tabLayout, view);
                RectF rectFH2 = C0387mh.h(tabLayout, view2);
                if (rectFH.left < rectFH2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    fCos2 = (float) (1.0d - Math.cos(d));
                    fCos = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    float fSin = (float) Math.sin(d2);
                    fCos = (float) (1.0d - Math.cos(d2));
                    fCos2 = fSin;
                }
                drawable.setBounds(AbstractC0340l1.c((int) rectFH.left, (int) rectFH2.left, fCos2), drawable.getBounds().top, AbstractC0340l1.c((int) rectFH.right, (int) rectFH2.right, fCos), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF rectFH3 = C0387mh.h(tabLayout, view);
                float fB = f < 0.5f ? AbstractC0340l1.b(1.0f, 0.0f, 0.0f, 0.5f, f) : AbstractC0340l1.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) rectFH3.left, drawable.getBounds().top, (int) rectFH3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
