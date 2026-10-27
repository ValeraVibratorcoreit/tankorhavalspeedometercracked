package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class Ai extends FrameLayout implements InterfaceC0254i6 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public Ai(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }
}
