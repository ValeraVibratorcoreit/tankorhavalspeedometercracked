package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0771z implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C0098d4 a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0771z(C0098d4 c0098d4) {
        this.a = c0098d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0771z) {
            return this.a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0771z) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C0227ha c0227ha = (C0227ha) this.a.b;
        AutoCompleteTextView autoCompleteTextView = c0227ha.h;
        if (autoCompleteTextView == null || F4.S(autoCompleteTextView)) {
            return;
        }
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = Gs.a;
        c0227ha.d.setImportantForAccessibility(i);
    }
}
