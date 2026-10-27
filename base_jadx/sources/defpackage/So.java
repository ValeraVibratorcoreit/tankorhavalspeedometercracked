package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class So extends Zl {
    public boolean a = false;
    public final /* synthetic */ C0668vk b;

    public So(C0668vk c0668vk) {
        this.b = c0668vk;
    }

    @Override // defpackage.Zl
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.Zl
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
