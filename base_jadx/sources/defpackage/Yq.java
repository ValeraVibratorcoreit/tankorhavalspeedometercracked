package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Yq extends Br {
    public final C0028ar j;
    public final Window.Callback k;
    public final Xq l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final ArrayList p = new ArrayList();
    public final RunnableC0524r0 q = new RunnableC0524r0(this, 20);

    public Yq(MaterialToolbar materialToolbar, CharSequence charSequence, Window.Callback callback) {
        Xq xq = new Xq(this);
        materialToolbar.getClass();
        C0028ar c0028ar = new C0028ar(materialToolbar, false);
        this.j = c0028ar;
        callback.getClass();
        this.k = callback;
        c0028ar.k = callback;
        materialToolbar.setOnMenuItemClickListener(xq);
        if (!c0028ar.g) {
            c0028ar.h = charSequence;
            if ((c0028ar.b & 8) != 0) {
                Toolbar toolbar = c0028ar.a;
                toolbar.setTitle(charSequence);
                if (c0028ar.g) {
                    Gs.k(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.l = new Xq(this);
    }

    public final Menu B0() {
        boolean z = this.n;
        C0028ar c0028ar = this.j;
        if (!z) {
            B4 b4 = new B4(this);
            Xq xq = new Xq(this);
            Toolbar toolbar = c0028ar.a;
            toolbar.N = b4;
            toolbar.O = xq;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.u = b4;
                actionMenuView.v = xq;
            }
            this.n = true;
        }
        return c0028ar.a.getMenu();
    }

    @Override // defpackage.Br
    public final Context C() {
        return this.j.a.getContext();
    }

    @Override // defpackage.Br
    public final boolean F() {
        C0028ar c0028ar = this.j;
        Toolbar toolbar = c0028ar.a;
        RunnableC0524r0 runnableC0524r0 = this.q;
        toolbar.removeCallbacks(runnableC0524r0);
        Toolbar toolbar2 = c0028ar.a;
        WeakHashMap weakHashMap = Gs.a;
        toolbar2.postOnAnimation(runnableC0524r0);
        return true;
    }

    @Override // defpackage.Br
    public final void K() {
    }

    @Override // defpackage.Br
    public final void M() {
        this.j.a.removeCallbacks(this.q);
    }

    @Override // defpackage.Br
    public final boolean R(int i, KeyEvent keyEvent) {
        Menu menuB0 = B0();
        if (menuB0 == null) {
            return false;
        }
        menuB0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuB0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.Br
    public final boolean S(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            U();
        }
        return true;
    }

    @Override // defpackage.Br
    public final boolean U() {
        return this.j.a.v();
    }

    @Override // defpackage.Br
    public final boolean j() {
        C0339l0 c0339l0;
        ActionMenuView actionMenuView = this.j.a.a;
        return (actionMenuView == null || (c0339l0 = actionMenuView.t) == null || !c0339l0.e()) ? false : true;
    }

    @Override // defpackage.Br
    public final void j0(boolean z) {
    }

    @Override // defpackage.Br
    public final boolean k() {
        C0759yi c0759yi;
        Tq tq = this.j.a.M;
        if (tq == null || (c0759yi = tq.b) == null) {
            return false;
        }
        if (tq == null) {
            c0759yi = null;
        }
        if (c0759yi == null) {
            return true;
        }
        c0759yi.collapseActionView();
        return true;
    }

    @Override // defpackage.Br
    public final void k0(boolean z) {
        C0028ar c0028ar = this.j;
        c0028ar.a((c0028ar.b & (-5)) | 4);
    }

    @Override // defpackage.Br
    public final void l0(boolean z) {
    }

    @Override // defpackage.Br
    public final void m0(String str) {
        C0028ar c0028ar = this.j;
        c0028ar.g = true;
        c0028ar.h = str;
        if ((c0028ar.b & 8) != 0) {
            Toolbar toolbar = c0028ar.a;
            toolbar.setTitle(str);
            if (c0028ar.g) {
                Gs.k(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.Br
    public final void p(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        ArrayList arrayList = this.p;
        if (arrayList.size() <= 0) {
            return;
        }
        Vo.l(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.Br
    public final void p0(CharSequence charSequence) {
        C0028ar c0028ar = this.j;
        if (c0028ar.g) {
            return;
        }
        c0028ar.h = charSequence;
        if ((c0028ar.b & 8) != 0) {
            Toolbar toolbar = c0028ar.a;
            toolbar.setTitle(charSequence);
            if (c0028ar.g) {
                Gs.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.Br
    public final int v() {
        return this.j.b;
    }
}
