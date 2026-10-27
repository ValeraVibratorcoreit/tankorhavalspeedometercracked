package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class In extends LinearLayout {
    public In(Context context) {
        super(context);
        setOrientation(1);
    }

    public final void a() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Sn) {
                i++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof Sn) {
                Sn sn = (Sn) childAt;
                if (i == 1) {
                    sn.setPosition(3);
                } else if (i3 == 0) {
                    sn.setPosition(0);
                } else if (i3 == i - 1) {
                    sn.setPosition(2);
                } else {
                    sn.setPosition(1);
                }
                i3++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        a();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        a();
    }
}
