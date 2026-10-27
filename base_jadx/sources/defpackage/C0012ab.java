package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0012ab {
    public final /* synthetic */ C0074cb a;

    public C0012ab(C0074cb c0074cb) {
        this.a = c0074cb;
    }

    public final void a(TextInputLayout textInputLayout) {
        C0074cb c0074cb = this.a;
        if (c0074cb.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0074cb.s;
        Za za = c0074cb.v;
        if (editText != null) {
            editText.removeTextChangedListener(za);
            if (c0074cb.s.getOnFocusChangeListener() == c0074cb.b().e()) {
                c0074cb.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0074cb.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(za);
        }
        c0074cb.b().m(c0074cb.s);
        c0074cb.j(c0074cb.b());
    }
}
