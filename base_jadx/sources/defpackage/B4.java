package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class B4 implements Ki {
    public boolean a;
    public final Object b;

    public /* synthetic */ B4(Object obj) {
        this.b = obj;
    }

    public boolean a() {
        return this.a;
    }

    @Override // defpackage.Ki
    public void b(MenuC0604ti menuC0604ti, boolean z) {
        C0339l0 c0339l0;
        if (this.a) {
            return;
        }
        this.a = true;
        Yq yq = (Yq) this.b;
        ActionMenuView actionMenuView = yq.j.a.a;
        if (actionMenuView != null && (c0339l0 = actionMenuView.t) != null) {
            c0339l0.e();
            C0186g0 c0186g0 = c0339l0.t;
            if (c0186g0 != null && c0186g0.b()) {
                c0186g0.j.dismiss();
            }
        }
        yq.k.onPanelClosed(108, menuC0604ti);
        this.a = false;
    }

    public boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C0473pa c0473pa = (C0473pa) this.b;
        if (c0473pa == null) {
            return a();
        }
        int iQ = c0473pa.q(charSequence, i);
        if (iQ == 0) {
            return true;
        }
        if (iQ != 1) {
            return a();
        }
        return false;
    }

    public synchronized void d(Im im, boolean z) {
        try {
            if (this.a || z) {
                ((Handler) this.b).obtainMessage(1, im).sendToTarget();
            } else {
                this.a = true;
                im.e();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.Ki
    public boolean u(MenuC0604ti menuC0604ti) {
        ((Yq) this.b).k.onMenuOpened(108, menuC0604ti);
        return true;
    }

    public B4() {
        this.b = new Handler(Looper.getMainLooper(), new C0128e4(1));
    }

    public B4(C0473pa c0473pa, boolean z) {
        this(c0473pa);
        this.a = z;
    }

    public B4(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.b = bottomSheetBehavior;
        this.a = z;
    }
}
