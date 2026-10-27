package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0372m2 implements InterfaceC0557s2, DialogInterface.OnClickListener {
    public R0 a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ C0588t2 d;

    public DialogInterfaceOnClickListenerC0372m2(C0588t2 c0588t2) {
        this.d = c0588t2;
    }

    @Override // defpackage.InterfaceC0557s2
    public final boolean a() {
        R0 r0 = this.a;
        if (r0 != null) {
            return r0.isShowing();
        }
        return false;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void b(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC0557s2
    public final int c() {
        return 0;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void d(int i, int i2) {
        if (this.b == null) {
            return;
        }
        C0588t2 c0588t2 = this.d;
        Q0 q0 = new Q0(c0588t2.getPopupContext());
        CharSequence charSequence = this.c;
        M0 m0 = (M0) q0.b;
        if (charSequence != null) {
            m0.d = charSequence;
        }
        ListAdapter listAdapter = this.b;
        int selectedItemPosition = c0588t2.getSelectedItemPosition();
        m0.p = listAdapter;
        m0.q = this;
        m0.t = selectedItemPosition;
        m0.s = true;
        R0 r0B = q0.b();
        this.a = r0B;
        AlertController$RecycleListView alertController$RecycleListView = r0B.f.g;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.InterfaceC0557s2
    public final void dismiss() {
        R0 r0 = this.a;
        if (r0 != null) {
            r0.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.InterfaceC0557s2
    public final int f() {
        return 0;
    }

    @Override // defpackage.InterfaceC0557s2
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.InterfaceC0557s2
    public final CharSequence h() {
        return this.c;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void j(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC0557s2
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC0557s2
    public final void m(ListAdapter listAdapter) {
        this.b = listAdapter;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0588t2 c0588t2 = this.d;
        c0588t2.setSelection(i);
        if (c0588t2.getOnItemClickListener() != null) {
            c0588t2.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
