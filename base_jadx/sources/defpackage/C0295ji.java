package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0295ji extends LinearLayout {
    public int a;

    public C0295ji(Context context) {
        super(context);
        this.a = getResources().getDimensionPixelSize(R.dimen.ts_content_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        if (i3 > 0 && size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxWidth(int i) {
        this.a = i;
        requestLayout();
    }
}
