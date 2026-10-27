package defpackage;

import android.content.DialogInterface;

/* JADX INFO: renamed from: t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0592t6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0098d4 a;
    public final /* synthetic */ C0623u6 b;

    public DialogInterfaceOnClickListenerC0592t6(C0623u6 c0623u6, C0098d4 c0098d4) {
        this.b = c0623u6;
        this.a = c0098d4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0685w6 c0685w6 = this.b.a;
        int selectedColor = c0685w6.getSelectedColor();
        c0685w6.getAllColors();
        Kn kn = (Kn) this.a.b;
        kn.setColor(selectedColor);
        Jn jn = kn.i;
        if (jn != null) {
            C0478pf c0478pf = (C0478pf) jn;
            C0509qf c0509qf = (C0509qf) c0478pf.b;
            c0509qf.I().getSharedPreferences("prefs_" + c0509qf.T.z, 0).edit().putInt((String) c0478pf.c, selectedColor).apply();
            c0509qf.d0();
        }
    }
}
