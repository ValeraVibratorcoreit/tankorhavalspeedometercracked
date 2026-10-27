package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0062c implements Ys {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public C0062c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.Ys
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.Ys
    public final void b() {
        this.a = true;
    }

    @Override // defpackage.Ys
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
