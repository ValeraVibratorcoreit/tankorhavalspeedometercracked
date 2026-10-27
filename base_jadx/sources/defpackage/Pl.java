package defpackage;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Pl extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0146em) ((Observable) this).mObservers.get(size)).a;
            recyclerView.i(null);
            recyclerView.c0.f = true;
            recyclerView.V(true);
            if (!recyclerView.d.h()) {
                recyclerView.requestLayout();
            }
        }
    }
}
