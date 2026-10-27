package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                Q3 q3 = (Q3) this.b;
                if (q3.f() != null) {
                    q3.f().recreate();
                }
                break;
            default:
                Rn rn = (Rn) this.b;
                String string = rn.j[i].toString();
                rn.setValue(string);
                Qn qn = rn.h;
                if (qn != null) {
                    qn.a(string);
                }
                dialogInterface.dismiss();
                break;
        }
    }
}
