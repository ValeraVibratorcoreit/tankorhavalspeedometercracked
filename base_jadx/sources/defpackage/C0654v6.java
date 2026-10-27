package defpackage;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0654v6 implements TextWatcher {
    public final /* synthetic */ C0685w6 a;

    public C0654v6(C0685w6 c0685w6) {
        this.a = c0685w6;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            int color = Color.parseColor(charSequence.toString());
            C0685w6 c0685w6 = this.a;
            c0685w6.c(color, false);
            c0685w6.d();
            c0685w6.invalidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
