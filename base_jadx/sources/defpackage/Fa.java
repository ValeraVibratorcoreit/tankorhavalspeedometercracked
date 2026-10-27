package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Fa extends InputConnectionWrapper {
    public final TextView a;
    public final C0225h8 b;

    public Fa(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        C0225h8 c0225h8 = new C0225h8(7);
        super(inputConnection, false);
        this.a = textView;
        this.b = c0225h8;
        if (C0782za.k != null) {
            C0782za c0782zaA = C0782za.a();
            if (c0782zaA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0627ua c0627ua = c0782zaA.e;
            c0627ua.getClass();
            Bundle bundle = editorInfo.extras;
            Qi qi = (Qi) c0627ua.c.a;
            int iA = qi.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) qi.d).getInt(iA + qi.a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0627ua.a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0225h8.n(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0225h8.n(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
