package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0731xl extends ConstraintLayout {
    public final RunnableC0591t5 s;
    public int t;
    public final C0204gi u;

    public AbstractC0731xl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0204gi c0204gi = new C0204gi();
        this.u = c0204gi;
        C0608tm c0608tm = new C0608tm(0.5f);
        C0456oo c0456ooE = c0204gi.a.a.e();
        c0456ooE.e = c0608tm;
        c0456ooE.f = c0608tm;
        c0456ooE.g = c0608tm;
        c0456ooE.h = c0608tm;
        c0204gi.setShapeAppearanceModel(c0456ooE.a());
        this.u.l(ColorStateList.valueOf(-1));
        C0204gi c0204gi2 = this.u;
        WeakHashMap weakHashMap = Gs.a;
        setBackground(c0204gi2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.v, R.attr.materialClockStyle, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.s = new RunnableC0591t5(this, 17);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = Gs.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0591t5 runnableC0591t5 = this.s;
            handler.removeCallbacks(runnableC0591t5);
            handler.post(runnableC0591t5);
        }
    }

    public abstract void l();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0591t5 runnableC0591t5 = this.s;
            handler.removeCallbacks(runnableC0591t5);
            handler.post(runnableC0591t5);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.u.l(ColorStateList.valueOf(i));
    }
}
