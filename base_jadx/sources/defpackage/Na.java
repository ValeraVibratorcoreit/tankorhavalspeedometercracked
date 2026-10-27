package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Na extends AbstractC0720xa {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public Na(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // defpackage.AbstractC0720xa
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0720xa
    public final void b() {
        switch (this.a) {
            case 0:
                Oa.a((EditText) this.b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public Na(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
