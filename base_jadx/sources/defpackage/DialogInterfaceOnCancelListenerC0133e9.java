package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0133e9 extends AbstractComponentCallbacksC0784zc implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler T;
    public boolean c0;
    public Dialog e0;
    public boolean f0;
    public boolean g0;
    public final RunnableC0524r0 U = new RunnableC0524r0(this, 5);
    public final DialogInterfaceOnCancelListenerC0041b9 V = new DialogInterfaceOnCancelListenerC0041b9(this);
    public final DialogInterfaceOnDismissListenerC0072c9 W = new DialogInterfaceOnDismissListenerC0072c9(this);
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;
    public boolean a0 = true;
    public int b0 = -1;
    public final C0308k0 d0 = new C0308k0(this, 11);
    public boolean h0 = false;

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public void B(Bundle bundle) {
        Dialog dialog = this.e0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.X;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Y;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.Z;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.a0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.b0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public void C() {
        this.C = true;
        Dialog dialog = this.e0;
        if (dialog != null) {
            this.f0 = false;
            dialog.show();
            View decorView = this.e0.getWindow().getDecorView();
            F4.X(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            Ud.f0(decorView, this);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public void D() {
        this.C = true;
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void F(Bundle bundle) {
        Bundle bundle2;
        this.C = true;
        if (this.e0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.G(layoutInflater, viewGroup, bundle);
        if (this.E != null || this.e0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e0.onRestoreInstanceState(bundle2);
    }

    public final void O(boolean z, boolean z2) {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.e0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.T.getLooper()) {
                    onDismiss(this.e0);
                } else {
                    this.T.post(this.U);
                }
            }
        }
        this.f0 = true;
        if (this.b0 >= 0) {
            Oc ocJ = j();
            int i = this.b0;
            if (i < 0) {
                throw new IllegalArgumentException(Vo.e(i, "Bad id: "));
            }
            ocJ.w(new Nc(ocJ, i), z);
            this.b0 = -1;
            return;
        }
        C0558s3 c0558s3 = new C0558s3(j());
        c0558s3.o = true;
        c0558s3.g(this);
        if (z) {
            c0558s3.d(true);
        } else {
            c0558s3.d(false);
        }
    }

    public Dialog P() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Q6(I(), this.Y);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final Br c() {
        return new C0103d9(this, new C0691wc(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        O(true, true);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void s() {
        this.C = true;
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void u(Context context) {
        Object obj;
        super.u(context);
        C0451oj c0451oj = this.O;
        C0308k0 c0308k0 = this.d0;
        c0451oj.getClass();
        C0451oj.a("observeForever");
        C0080ch c0080ch = new C0080ch(c0451oj, c0308k0);
        C0455on c0455on = c0451oj.b;
        C0362ln c0362lnA = c0455on.a(c0308k0);
        if (c0362lnA != null) {
            obj = c0362lnA.b;
        } else {
            C0362ln c0362ln = new C0362ln(c0308k0, c0080ch);
            c0455on.d++;
            C0362ln c0362ln2 = c0455on.b;
            if (c0362ln2 == null) {
                c0455on.a = c0362ln;
                c0455on.b = c0362ln;
            } else {
                c0362ln2.c = c0362ln;
                c0362ln.d = c0362ln2;
                c0455on.b = c0362ln;
            }
            obj = null;
        }
        AbstractC0141eh abstractC0141eh = (AbstractC0141eh) obj;
        if (abstractC0141eh instanceof C0111dh) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0141eh == null) {
            c0080ch.a(true);
        }
        this.g0 = false;
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public void v(Bundle bundle) {
        super.v(bundle);
        this.T = new Handler();
        this.a0 = this.w == 0;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.a0 = bundle.getBoolean("android:showsDialog", this.a0);
            this.b0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void x() {
        this.C = true;
        Dialog dialog = this.e0;
        if (dialog != null) {
            this.f0 = true;
            dialog.setOnDismissListener(null);
            this.e0.dismiss();
            if (!this.g0) {
                onDismiss(this.e0);
            }
            this.e0 = null;
            this.h0 = false;
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void y() {
        this.C = true;
        if (!this.g0) {
            this.g0 = true;
        }
        C0451oj c0451oj = this.O;
        C0308k0 c0308k0 = this.d0;
        c0451oj.getClass();
        C0451oj.a("removeObserver");
        AbstractC0141eh abstractC0141eh = (AbstractC0141eh) c0451oj.b.b(c0308k0);
        if (abstractC0141eh == null) {
            return;
        }
        abstractC0141eh.b();
        abstractC0141eh.a(false);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final LayoutInflater z(Bundle bundle) {
        LayoutInflater layoutInflaterZ = super.z(bundle);
        boolean z = this.a0;
        if (!z || this.c0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.a0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return layoutInflaterZ;
        }
        if (z && !this.h0) {
            try {
                this.c0 = true;
                Dialog dialogP = P();
                this.e0 = dialogP;
                if (this.a0) {
                    int i = this.X;
                    if (i == 1 || i == 2) {
                        dialogP.requestWindowFeature(1);
                    } else if (i == 3) {
                        Window window = dialogP.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogP.requestWindowFeature(1);
                    }
                    Context contextH = h();
                    if (contextH instanceof Activity) {
                        this.e0.setOwnerActivity((Activity) contextH);
                    }
                    this.e0.setCancelable(this.Z);
                    this.e0.setOnCancelListener(this.V);
                    this.e0.setOnDismissListener(this.W);
                    this.h0 = true;
                } else {
                    this.e0 = null;
                }
                this.c0 = false;
            } catch (Throwable th) {
                this.c0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.e0;
        return dialog != null ? layoutInflaterZ.cloneInContext(dialog.getContext()) : layoutInflaterZ;
    }
}
