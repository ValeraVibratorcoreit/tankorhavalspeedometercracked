package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class Wn extends Sn {
    public final C0353le g;
    public Vn h;
    public boolean i;

    public Wn(Context context) {
        super(context);
        this.i = false;
        C0353le c0353le = new C0353le(getContext());
        this.g = c0353le;
        c0353le.setClickable(false);
        this.g.setFocusable(false);
        this.d.addView(this.g, new FrameLayout.LayoutParams(-2, -2));
        this.g.setOnCheckedChange(new C0098d4(this, 8));
        setOnClickListener(new ViewOnClickListenerC0069c6(this, 9));
    }

    public void setChecked(boolean z) {
        this.i = true;
        this.g.setChecked(z);
        this.i = false;
    }

    public void setOnCheckedChange(Vn vn) {
        this.h = vn;
    }
}
