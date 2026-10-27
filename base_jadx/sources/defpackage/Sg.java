package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class Sg implements Li, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public MenuC0604ti c;
    public ExpandedMenuView d;
    public Ki e;
    public Rg f;

    public Sg(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.Li
    public final void b(MenuC0604ti menuC0604ti, boolean z) {
        Ki ki = this.e;
        if (ki != null) {
            ki.b(menuC0604ti, z);
        }
    }

    @Override // defpackage.Li
    public final boolean c() {
        return false;
    }

    @Override // defpackage.Li
    public final boolean d(C0759yi c0759yi) {
        return false;
    }

    @Override // defpackage.Li
    public final void f(Ki ki) {
        this.e = ki;
    }

    @Override // defpackage.Li
    public final boolean g(C0759yi c0759yi) {
        return false;
    }

    @Override // defpackage.Li
    public final void h() {
        Rg rg = this.f;
        if (rg != null) {
            rg.notifyDataSetChanged();
        }
    }

    @Override // defpackage.Li
    public final void j(Context context, MenuC0604ti menuC0604ti) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = menuC0604ti;
        Rg rg = this.f;
        if (rg != null) {
            rg.notifyDataSetChanged();
        }
    }

    @Override // defpackage.Li
    public final boolean k(Np np) {
        if (!np.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0635ui dialogInterfaceOnKeyListenerC0635ui = new DialogInterfaceOnKeyListenerC0635ui();
        dialogInterfaceOnKeyListenerC0635ui.a = np;
        Context context = np.a;
        Q0 q0 = new Q0(context);
        M0 m0 = (M0) q0.b;
        Sg sg = new Sg(m0.a);
        dialogInterfaceOnKeyListenerC0635ui.c = sg;
        sg.e = dialogInterfaceOnKeyListenerC0635ui;
        np.b(sg, context);
        Sg sg2 = dialogInterfaceOnKeyListenerC0635ui.c;
        if (sg2.f == null) {
            sg2.f = new Rg(sg2);
        }
        m0.p = sg2.f;
        m0.q = dialogInterfaceOnKeyListenerC0635ui;
        View view = np.o;
        if (view != null) {
            m0.e = view;
        } else {
            m0.c = np.n;
            m0.d = np.m;
        }
        m0.n = dialogInterfaceOnKeyListenerC0635ui;
        R0 r0B = q0.b();
        dialogInterfaceOnKeyListenerC0635ui.b = r0B;
        r0B.setOnDismissListener(dialogInterfaceOnKeyListenerC0635ui);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0635ui.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0635ui.b.show();
        Ki ki = this.e;
        if (ki == null) {
            return true;
        }
        ki.u(np);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
