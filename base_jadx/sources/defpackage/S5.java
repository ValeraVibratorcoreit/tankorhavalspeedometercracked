package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class S5 extends C0740y {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
    public static final C0225h8 p = new C0225h8(12);
    public static final C0225h8 q = new C0225h8(13);
    public final AccessibilityManager h;
    public final View i;
    public Gb j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    public int l = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    public int m = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    public S5(Chip chip, Chip chip2) {
        this.n = chip;
        if (chip2 == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = Gs.a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.C0740y
    public final L b(View view) {
        if (this.j == null) {
            this.j = new Gb(this);
        }
        return this.j;
    }

    @Override // defpackage.C0740y
    public final void d(View view, J j) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = j.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        if (i == 1) {
            Chip chip = this.n;
            chip.m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final J k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        J j = new J(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        j.b = -1;
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        o(i, j);
        if (j.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        j.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        j.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            j.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            j.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            j.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            j.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            j.f(rect3);
            if (j.b != -1) {
                J j2 = new J(AccessibilityNodeInfo.obtain());
                for (int i2 = j.b; i2 != -1; i2 = j2.b) {
                    j2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = j2.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i2, j2);
                    j2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                j.a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return j;
    }

    public final void l(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.w;
        Chip chip = this.n;
        if (chip.c()) {
            U5 u5 = chip.e;
            if (u5 != null && u5.K) {
                z = true;
            }
            if (!z || chip.h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    public final boolean m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        J j;
        int i4;
        Rect rect2;
        int i5;
        Rect rect3;
        int i6;
        J j2;
        int i7;
        int iS;
        int iV;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        C0057bp c0057bp = new C0057bp();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c0057bp.d(((Integer) arrayList.get(i8)).intValue(), k(((Integer) arrayList.get(i8)).intValue()));
        }
        int i9 = this.l;
        int i10 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        J j3 = i9 == Integer.MIN_VALUE ? null : (J) c0057bp.c(i9, null);
        C0225h8 c0225h8 = p;
        C0225h8 c0225h9 = q;
        View view = this.i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap weakHashMap = Gs.a;
            boolean z = view.getLayoutDirection() == 1;
            c0225h9.getClass();
            int i11 = c0057bp.c;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList2.add((J) c0057bp.b[i12]);
            }
            Collections.sort(arrayList2, new C0136ec(z, c0225h8));
            if (i == 1) {
                int size = arrayList2.size();
                if (j3 != null) {
                    size = arrayList2.indexOf(j3);
                }
                int i13 = size - 1;
                if (i13 >= 0) {
                    obj = arrayList2.get(i13);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (j3 == null ? -1 : arrayList2.lastIndexOf(j3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            j = (J) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i14 = this.l;
            if (i14 != Integer.MIN_VALUE) {
                n(i14).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i == 17) {
                        i3 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        i3 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        rect4.set(-1, 0, -1, height);
                        i3 = -1;
                    } else {
                        if (i != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i3 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    i2 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i != 33) {
                    i2 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i != 66) {
                    i2 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                c0225h9.getClass();
                i5 = c0057bp.c;
                rect3 = new Rect();
                j = null;
                for (i6 = i2; i6 < i5; i6++) {
                    j2 = (J) c0057bp.b[i6];
                    if (j2 == j3) {
                        c0225h8.getClass();
                        j2.f(rect3);
                        if (Ud.K(i, rect4, rect3)) {
                            if (Ud.K(i, rect4, rect2) || Ud.b(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                j = j2;
                            } else if (Ud.b(i, rect4, rect2, rect3)) {
                                int iS2 = Ud.S(i, rect4, rect3);
                                int iV2 = Ud.V(i, rect4, rect3);
                                i7 = (iV2 * iV2) + (iS2 * 13 * iS2);
                                iS = Ud.S(i, rect4, rect2);
                                iV = Ud.V(i, rect4, rect2);
                                if (i7 < (iV * iV) + (iS * 13 * iS)) {
                                    rect2.set(rect3);
                                    j = j2;
                                }
                            }
                        }
                    }
                }
            }
            i3 = -1;
            rect2 = new Rect(rect4);
            if (i != 17) {
                i2 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i != 33) {
                i2 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i != 66) {
                i2 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i2 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            c0225h9.getClass();
            i5 = c0057bp.c;
            rect3 = new Rect();
            j = null;
            while (i6 < i5) {
                j2 = (J) c0057bp.b[i6];
                if (j2 == j3) {
                    c0225h8.getClass();
                    j2.f(rect3);
                    if (Ud.K(i, rect4, rect3)) {
                        if (Ud.K(i, rect4, rect2)) {
                            rect2.set(rect3);
                            j = j2;
                        } else if (Ud.b(i, rect4, rect2, rect3)) {
                            int iS3 = Ud.S(i, rect4, rect3);
                            int iV3 = Ud.V(i, rect4, rect3);
                            i7 = (iV3 * iV3) + (iS3 * 13 * iS3);
                            iS = Ud.S(i, rect4, rect2);
                            iV = Ud.V(i, rect4, rect2);
                            if (i7 < (iV * iV) + (iS * 13 * iS)) {
                                rect2.set(rect3);
                                j = j2;
                            }
                        }
                    }
                }
            }
        }
        J j4 = j;
        if (j4 != null) {
            int i15 = i2;
            while (true) {
                if (i15 >= c0057bp.c) {
                    i4 = i3;
                    break;
                }
                if (c0057bp.b[i15] == j4) {
                    i4 = i15;
                    break;
                }
                i15++;
            }
            i10 = c0057bp.a[i4];
        }
        return p(i10);
    }

    public final J n(int i) {
        if (i != -1) {
            return k(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        J j = new J(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = Gs.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            j.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return j;
    }

    public final void o(int i, J j) {
        AccessibilityNodeInfo accessibilityNodeInfo = j.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.w);
            return;
        }
        Chip chip = this.n;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        j.b(E.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    public final boolean p(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        if (i == 1) {
            Chip chip = this.n;
            chip.m = true;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            J jN = n(i);
            accessibilityEventObtain.getText().add(jN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = jN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
