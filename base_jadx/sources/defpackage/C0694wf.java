package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: renamed from: wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694wf extends View.AccessibilityDelegate {
    public final /* synthetic */ C0725xf a;

    public C0694wf(C0725xf c0725xf) {
        this.a = c0725xf;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.a.h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
