package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0235hi<S> extends Ek {
    public int U;
    public C0282j5 V;

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void B(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.V);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void v(Bundle bundle) {
        super.v(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        Vo.k(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.V = (C0282j5) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.U));
        throw null;
    }
}
