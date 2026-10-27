package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class Oa implements TextWatcher {
    public final EditText a;
    public Na c;
    public final boolean b = false;
    public boolean d = true;

    public Oa(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0782za c0782zaA = C0782za.a();
            if (editableText == null) {
                length = 0;
            } else {
                c0782zaA.getClass();
                length = editableText.length();
            }
            c0782zaA.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.d) {
            return;
        }
        if ((this.b || C0782za.k != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = C0782za.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    C0782za.a().f((Spannable) charSequence, i, i3 + i);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            C0782za c0782zaA = C0782za.a();
            if (this.c == null) {
                this.c = new Na(editText);
            }
            c0782zaA.g(this.c);
        }
    }
}
