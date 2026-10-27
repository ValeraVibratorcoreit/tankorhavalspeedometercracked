package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0653v5 extends Tl {
    public final Paint a;
    public final List b;

    public C0653v5() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.Tl
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (AbstractC0233hg abstractC0233hg : this.b) {
            abstractC0233hg.getClass();
            ThreadLocal threadLocal = AbstractC0747y6.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                float fE = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.e();
                float fA = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.a();
                abstractC0233hg.getClass();
                canvas.drawLine(0.0f, fE, 0.0f, fA, paint);
            } else {
                float fB = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.b();
                float fC = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.c();
                abstractC0233hg.getClass();
                canvas.drawLine(fB, 0.0f, fC, 0.0f, paint);
            }
        }
    }
}
