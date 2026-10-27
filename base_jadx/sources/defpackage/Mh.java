package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Mh extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ Nh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mh(Nh nh, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = nh;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        Nh nh = this.c;
        ColorStateList colorStateList2 = nh.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (nh.k != 0 && nh.l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0747y6.b(nh.l.getColorForState(iArr3, 0), nh.k), AbstractC0747y6.b(nh.l.getColorForState(iArr2, 0), nh.k), nh.k});
        }
        this.a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            Nh nh = this.c;
            Drawable rippleDrawable = null;
            if (nh.getText().toString().contentEquals(textView.getText()) && nh.k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(nh.k);
                if (this.b != null) {
                    O9.h(colorDrawable, this.a);
                    rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = Gs.a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
