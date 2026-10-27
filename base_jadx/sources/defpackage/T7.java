package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class T7 extends AbstractC0105db {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T7(C0074cb c0074cb, int i) {
        super(c0074cb);
        this.e = i;
    }

    @Override // defpackage.AbstractC0105db
    public void r() {
        switch (this.e) {
            case 0:
                C0074cb c0074cb = this.b;
                c0074cb.o = null;
                CheckableImageButton checkableImageButton = c0074cb.g;
                checkableImageButton.setOnLongClickListener(null);
                F4.Z(checkableImageButton, null);
                break;
        }
    }
}
