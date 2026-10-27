package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class Q5 extends Tf {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ Q5(Object obj, int i) {
        this.j = i;
        this.k = obj;
    }

    private final void c0(int i) {
    }

    @Override // defpackage.Tf
    public final void M(int i) {
        switch (this.j) {
            case 0:
                break;
            default:
                C0550rq c0550rq = (C0550rq) this.k;
                c0550rq.e = true;
                InterfaceC0520qq interfaceC0520qq = (InterfaceC0520qq) c0550rq.f.get();
                if (interfaceC0520qq != null) {
                    interfaceC0520qq.a();
                }
                break;
        }
    }

    @Override // defpackage.Tf
    public final void N(Typeface typeface, boolean z) {
        switch (this.j) {
            case 0:
                Chip chip = (Chip) this.k;
                U5 u5 = chip.e;
                chip.setText(u5.D0 ? u5.E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    C0550rq c0550rq = (C0550rq) this.k;
                    c0550rq.e = true;
                    InterfaceC0520qq interfaceC0520qq = (InterfaceC0520qq) c0550rq.f.get();
                    if (interfaceC0520qq != null) {
                        interfaceC0520qq.a();
                    }
                    break;
                }
                break;
        }
    }
}
