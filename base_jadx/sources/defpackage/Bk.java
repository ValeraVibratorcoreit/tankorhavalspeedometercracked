package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Bk extends AbstractC0105db {
    public final int e;
    public EditText f;
    public final ViewOnClickListenerC0069c6 g;

    public Bk(C0074cb c0074cb, int i) {
        super(c0074cb);
        this.e = R.drawable.design_password_eye;
        this.g = new ViewOnClickListenerC0069c6(this, 5);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.AbstractC0105db
    public final void b() {
        q();
    }

    @Override // defpackage.AbstractC0105db
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.AbstractC0105db
    public final int d() {
        return this.e;
    }

    @Override // defpackage.AbstractC0105db
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.AbstractC0105db
    public final boolean k() {
        return true;
    }

    @Override // defpackage.AbstractC0105db
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.AbstractC0105db
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.AbstractC0105db
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.AbstractC0105db
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
