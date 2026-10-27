package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.jcraft.jsch.SftpATTRS;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Gb extends L {
    public final /* synthetic */ S5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(S5 s5) {
        super(0);
        this.c = s5;
    }

    @Override // defpackage.L
    public final J a(int i) {
        return new J(AccessibilityNodeInfo.obtain(this.c.n(i).a));
    }

    @Override // defpackage.L
    public final J b(int i) {
        S5 s5 = this.c;
        int i2 = i == 2 ? s5.k : s5.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    @Override // defpackage.L
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        S5 s5 = this.c;
        View view = s5.i;
        if (i == -1) {
            WeakHashMap weakHashMap = Gs.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        boolean z = true;
        if (i2 == 1) {
            return s5.p(i);
        }
        if (i2 == 2) {
            return s5.j(i);
        }
        boolean z2 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = s5.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = s5.k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    s5.k = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                    s5.i.invalidate();
                    s5.q(i3, 65536);
                }
                s5.k = i;
                view.invalidate();
                s5.q(i, 32768);
            } else {
                z = false;
            }
        } else {
            if (i2 != 128) {
                if (i2 != 16) {
                    return false;
                }
                Chip chip = s5.n;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z2 = true;
                }
                if (!chip.s) {
                    return z2;
                }
                chip.r.q(1, 1);
                return z2;
            }
            if (s5.k == i) {
                s5.k = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                view.invalidate();
                s5.q(i, 65536);
            } else {
                z = false;
            }
        }
        return z;
    }
}
