package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0179fo extends AbstractC0361lm {
    public final ImageView t;
    public final TextView u;

    public C0179fo(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.ts_item_icon);
        this.u = (TextView) view.findViewById(R.id.ts_item_title);
    }
}
