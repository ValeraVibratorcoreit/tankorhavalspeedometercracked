package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class Za extends Aq {
    public final /* synthetic */ C0074cb a;

    public Za(C0074cb c0074cb) {
        this.a = c0074cb;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // defpackage.Aq, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
