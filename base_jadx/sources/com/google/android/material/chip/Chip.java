package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.jcraft.jsch.SftpATTRS;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0638ul;
import defpackage.AbstractC0676vs;
import defpackage.Ao;
import defpackage.B4;
import defpackage.Br;
import defpackage.C0113dj;
import defpackage.C0436o4;
import defpackage.C0458oq;
import defpackage.C0487po;
import defpackage.C0550rq;
import defpackage.C0649v1;
import defpackage.F4;
import defpackage.Gs;
import defpackage.InterfaceC0081ci;
import defpackage.P9;
import defpackage.Q5;
import defpackage.R5;
import defpackage.S5;
import defpackage.T5;
import defpackage.Td;
import defpackage.Tf;
import defpackage.U5;
import defpackage.au;
import defpackage.bu;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0649v1 implements T5, Ao, Checkable {
    public static final Rect w = new Rect();
    public static final int[] x = {R.attr.state_selected};
    public static final int[] y = {R.attr.state_checkable};
    public U5 e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public final S5 r;
    public boolean s;
    public final Rect t;
    public final RectF u;
    public final Q5 v;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(Td.Q(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, ru.zinovin.tankspeedometer.R.attr.chipStyle);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new Q5(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        U5 u5 = new U5(context2, attributeSet);
        int[] iArr = AbstractC0638ul.d;
        TypedArray typedArrayZ = AbstractC0390mk.z(u5.e0, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        u5.F0 = typedArrayZ.hasValue(37);
        Context context3 = u5.e0;
        ColorStateList colorStateListU = Br.u(context3, typedArrayZ, 24);
        if (u5.x != colorStateListU) {
            u5.x = colorStateListU;
            u5.onStateChange(u5.getState());
        }
        ColorStateList colorStateListU2 = Br.u(context3, typedArrayZ, 11);
        if (u5.y != colorStateListU2) {
            u5.y = colorStateListU2;
            u5.onStateChange(u5.getState());
        }
        float dimension = typedArrayZ.getDimension(19, 0.0f);
        if (u5.z != dimension) {
            u5.z = dimension;
            u5.invalidateSelf();
            u5.w();
        }
        if (typedArrayZ.hasValue(12)) {
            u5.C(typedArrayZ.getDimension(12, 0.0f));
        }
        u5.H(Br.u(context3, typedArrayZ, 22));
        u5.I(typedArrayZ.getDimension(23, 0.0f));
        u5.R(Br.u(context3, typedArrayZ, 36));
        String text = typedArrayZ.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(u5.E, text);
        C0550rq c0550rq = u5.k0;
        if (!zEquals) {
            u5.E = text;
            c0550rq.e = true;
            u5.invalidateSelf();
            u5.w();
        }
        C0458oq c0458oq = (!typedArrayZ.hasValue(0) || (resourceId3 = typedArrayZ.getResourceId(0, 0)) == 0) ? null : new C0458oq(context3, resourceId3);
        c0458oq.k = typedArrayZ.getDimension(1, c0458oq.k);
        c0550rq.b(c0458oq, context3);
        int i = typedArrayZ.getInt(3, 0);
        if (i == 1) {
            u5.C0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            u5.C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            u5.C0 = TextUtils.TruncateAt.END;
        }
        u5.G(typedArrayZ.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            u5.G(typedArrayZ.getBoolean(15, false));
        }
        u5.D(Br.x(context3, typedArrayZ, 14));
        if (typedArrayZ.hasValue(17)) {
            u5.F(Br.u(context3, typedArrayZ, 17));
        }
        u5.E(typedArrayZ.getDimension(16, -1.0f));
        u5.O(typedArrayZ.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            u5.O(typedArrayZ.getBoolean(26, false));
        }
        u5.J(Br.x(context3, typedArrayZ, 25));
        u5.N(Br.u(context3, typedArrayZ, 30));
        u5.L(typedArrayZ.getDimension(28, 0.0f));
        u5.y(typedArrayZ.getBoolean(6, false));
        u5.B(typedArrayZ.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            u5.B(typedArrayZ.getBoolean(8, false));
        }
        u5.z(Br.x(context3, typedArrayZ, 7));
        if (typedArrayZ.hasValue(9)) {
            u5.A(Br.u(context3, typedArrayZ, 9));
        }
        u5.U = (!typedArrayZ.hasValue(39) || (resourceId2 = typedArrayZ.getResourceId(39, 0)) == 0) ? null : C0113dj.a(context3, resourceId2);
        u5.V = (!typedArrayZ.hasValue(33) || (resourceId = typedArrayZ.getResourceId(33, 0)) == 0) ? null : C0113dj.a(context3, resourceId);
        float dimension2 = typedArrayZ.getDimension(21, 0.0f);
        if (u5.W != dimension2) {
            u5.W = dimension2;
            u5.invalidateSelf();
            u5.w();
        }
        u5.Q(typedArrayZ.getDimension(35, 0.0f));
        u5.P(typedArrayZ.getDimension(34, 0.0f));
        float dimension3 = typedArrayZ.getDimension(41, 0.0f);
        if (u5.Z != dimension3) {
            u5.Z = dimension3;
            u5.invalidateSelf();
            u5.w();
        }
        float dimension4 = typedArrayZ.getDimension(40, 0.0f);
        if (u5.a0 != dimension4) {
            u5.a0 = dimension4;
            u5.invalidateSelf();
            u5.w();
        }
        u5.M(typedArrayZ.getDimension(29, 0.0f));
        u5.K(typedArrayZ.getDimension(27, 0.0f));
        float dimension5 = typedArrayZ.getDimension(13, 0.0f);
        if (u5.d0 != dimension5) {
            u5.d0 = dimension5;
            u5.invalidateSelf();
            u5.w();
        }
        u5.E0 = typedArrayZ.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayZ.recycle();
        AbstractC0390mk.b(context2, attributeSet, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0390mk.c(context2, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action);
        this.n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.p = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(Tf.n(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(u5);
        u5.k(AbstractC0676vs.i(this));
        AbstractC0390mk.b(context2, attributeSet, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0390mk.c(context2, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.r = new S5(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new R5(this));
        }
        setChecked(this.j);
        setText(u5.E);
        setEllipsize(u5.C0);
        h();
        if (!this.e.D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.n) {
            setMinHeight(this.p);
        }
        this.o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: P5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            U5 u5 = this.e;
            Rect bounds = u5.getBounds();
            rectF.setEmpty();
            if (u5.U()) {
                float f = u5.d0 + u5.c0 + u5.O + u5.b0 + u5.a0;
                if (P9.a(u5) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C0458oq getTextAppearance() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.k0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.p = i;
        if (!this.n) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.z));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        f();
    }

    public final boolean c() {
        U5 u5 = this.e;
        if (u5 != null) {
            Object obj = u5.L;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof au) {
                ((bu) ((au) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        U5 u5 = this.e;
        return u5 != null && u5.Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        S5 s5 = this.r;
        AccessibilityManager accessibilityManager = s5.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = s5.n;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = s5.m;
                if (i3 != i2) {
                    s5.m = i2;
                    s5.q(i2, 128);
                    s5.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = s5.m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                s5.m = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                s5.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        S5 s5 = this.r;
        s5.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && s5.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = s5.l;
                                if (i != Integer.MIN_VALUE) {
                                    chip = s5.n;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.s) {
                                            chip.r.q(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = s5.l;
                    if (i != Integer.MIN_VALUE) {
                        chip = s5.n;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.s) {
                                chip.r.q(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = s5.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = s5.m(1, null);
            }
        }
        if (!zM || s5.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.C0649v1, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        U5 u5 = this.e;
        boolean zX = false;
        if (u5 != null && U5.v(u5.L)) {
            U5 u6 = this.e;
            ?? IsEnabled = isEnabled();
            if (this.m) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.l) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(u6.y0, iArr)) {
                u6.y0 = iArr;
                if (u6.U()) {
                    zX = u6.x(u6.getState(), iArr);
                }
            }
        }
        if (zX) {
            invalidate();
        }
    }

    public final void e() {
        U5 u5;
        if (!c() || (u5 = this.e) == null || !u5.K || this.h == null) {
            Gs.j(this, null);
            this.s = false;
        } else {
            Gs.j(this, this.r);
            this.s = true;
        }
    }

    public final void f() {
        ColorStateList colorStateListValueOf = this.e.D;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.g = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        U5 u5 = this.e;
        if (u5.z0) {
            u5.z0 = false;
            u5.A0 = null;
            u5.onStateChange(u5.getState());
        }
        RippleDrawable rippleDrawable = this.g;
        WeakHashMap weakHashMap = Gs.a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        U5 u5;
        if (TextUtils.isEmpty(getText()) || (u5 = this.e) == null) {
            return;
        }
        int iS = (int) (u5.s() + u5.d0 + u5.a0);
        U5 u6 = this.e;
        int iR = (int) (u6.r() + u6.W + u6.Z);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iR += rect.left;
            iS += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = Gs.a;
        setPaddingRelative(iR, paddingTop, iS, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        U5 u5 = this.e;
        if (u5 != null) {
            return Math.max(0.0f, u5.t());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        U5 u5 = this.e;
        if (u5 == null || (drawable = u5.G) == 0) {
            return null;
        }
        if (!(drawable instanceof au)) {
            return drawable;
        }
        ((bu) ((au) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        U5 u5 = this.e;
        if (u5 == null || (drawable = u5.L) == 0) {
            return null;
        }
        if (!(drawable instanceof au)) {
            return drawable;
        }
        ((bu) ((au) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.s) {
            S5 s5 = this.r;
            if (s5.l == 1 || s5.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0113dj getHideMotionSpec() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.V;
        }
        return null;
    }

    public float getIconEndPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.D;
        }
        return null;
    }

    public C0487po getShapeAppearanceModel() {
        return this.e.a.a;
    }

    public C0113dj getShowMotionSpec() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.U;
        }
        return null;
    }

    public float getTextEndPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        U5 u5 = this.e;
        if (u5 != null) {
            return u5.Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        U5 u5 = this.e;
        if (u5 != null) {
            paint.drawableState = u5.getState();
        }
        C0458oq textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F4.a0(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.s) {
            S5 s5 = this.r;
            int i2 = s5.l;
            if (i2 != Integer.MIN_VALUE) {
                s5.j(i2);
            }
            if (z) {
                s5.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.k) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.s) {
                        this.r.q(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.C0649v1, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.C0649v1, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.y(z);
        }
    }

    public void setCheckableResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.y(u5.e0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        U5 u5 = this.e;
        if (u5 == null) {
            this.j = z;
        } else if (u5.Q) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.z(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.z(F4.F(u5.e0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.A(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.A(F4.C(u5.e0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.B(u5.e0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        U5 u5 = this.e;
        if (u5 == null || u5.y == colorStateList) {
            return;
        }
        u5.y = colorStateList;
        u5.onStateChange(u5.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListC;
        U5 u5 = this.e;
        if (u5 == null || u5.y == (colorStateListC = F4.C(u5.e0, i))) {
            return;
        }
        u5.y = colorStateListC;
        u5.onStateChange(u5.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.C(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.C(u5.e0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(U5 u5) {
        U5 u6 = this.e;
        if (u6 != u5) {
            if (u6 != null) {
                u6.B0 = new WeakReference(null);
            }
            this.e = u5;
            u5.D0 = false;
            u5.B0 = new WeakReference(this);
            b(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        U5 u5 = this.e;
        if (u5 == null || u5.d0 == f) {
            return;
        }
        u5.d0 = f;
        u5.invalidateSelf();
        u5.w();
    }

    public void setChipEndPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            float dimension = u5.e0.getResources().getDimension(i);
            if (u5.d0 != dimension) {
                u5.d0 = dimension;
                u5.invalidateSelf();
                u5.w();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.D(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.D(F4.F(u5.e0, i));
        }
    }

    public void setChipIconSize(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.E(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.E(u5.e0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.F(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.F(F4.C(u5.e0, i));
        }
    }

    public void setChipIconVisible(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.G(u5.e0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        U5 u5 = this.e;
        if (u5 == null || u5.z == f) {
            return;
        }
        u5.z = f;
        u5.invalidateSelf();
        u5.w();
    }

    public void setChipMinHeightResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            float dimension = u5.e0.getResources().getDimension(i);
            if (u5.z != dimension) {
                u5.z = dimension;
                u5.invalidateSelf();
                u5.w();
            }
        }
    }

    public void setChipStartPadding(float f) {
        U5 u5 = this.e;
        if (u5 == null || u5.W == f) {
            return;
        }
        u5.W = f;
        u5.invalidateSelf();
        u5.w();
    }

    public void setChipStartPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            float dimension = u5.e0.getResources().getDimension(i);
            if (u5.W != dimension) {
                u5.W = dimension;
                u5.invalidateSelf();
                u5.w();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.H(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.H(F4.C(u5.e0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.I(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.I(u5.e0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.J(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        U5 u5 = this.e;
        if (u5 == null || u5.P == charSequence) {
            return;
        }
        String str = C0436o4.d;
        C0436o4 c0436o4 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0436o4.g : C0436o4.f;
        B4 b4 = c0436o4.c;
        u5.P = c0436o4.c(charSequence);
        u5.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.K(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.K(u5.e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.J(F4.F(u5.e0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.L(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.L(u5.e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.M(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.M(u5.e0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.N(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.N(F4.C(u5.e0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.C0649v1, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // defpackage.C0649v1, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        U5 u5 = this.e;
        if (u5 != null) {
            u5.k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        U5 u5 = this.e;
        if (u5 != null) {
            u5.C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        b(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0113dj c0113dj) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.V = c0113dj;
        }
    }

    public void setHideMotionSpecResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.V = C0113dj.a(u5.e0, i);
        }
    }

    public void setIconEndPadding(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.P(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.P(u5.e0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.Q(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.Q(u5.e0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0081ci interfaceC0081ci) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        U5 u5 = this.e;
        if (u5 != null) {
            u5.E0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.R(colorStateList);
        }
        if (this.e.z0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.R(F4.C(u5.e0, i));
            if (this.e.z0) {
                return;
            }
            f();
        }
    }

    @Override // defpackage.Ao
    public void setShapeAppearanceModel(C0487po c0487po) {
        this.e.setShapeAppearanceModel(c0487po);
    }

    public void setShowMotionSpec(C0113dj c0113dj) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.U = c0113dj;
        }
    }

    public void setShowMotionSpecResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.U = C0113dj.a(u5.e0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        U5 u5 = this.e;
        if (u5 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(u5.D0 ? null : charSequence, bufferType);
        U5 u6 = this.e;
        if (u6 == null || TextUtils.equals(u6.E, charSequence)) {
            return;
        }
        u6.E = charSequence;
        u6.k0.e = true;
        u6.invalidateSelf();
        u6.w();
    }

    public void setTextAppearance(C0458oq c0458oq) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.k0.b(c0458oq, u5.e0);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        U5 u5 = this.e;
        if (u5 == null || u5.a0 == f) {
            return;
        }
        u5.a0 = f;
        u5.invalidateSelf();
        u5.w();
    }

    public void setTextEndPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            float dimension = u5.e0.getResources().getDimension(i);
            if (u5.a0 != dimension) {
                u5.a0 = dimension;
                u5.invalidateSelf();
                u5.w();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        U5 u5 = this.e;
        if (u5 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C0550rq c0550rq = u5.k0;
            C0458oq c0458oq = c0550rq.g;
            if (c0458oq != null) {
                c0458oq.k = fApplyDimension;
                c0550rq.a.setTextSize(fApplyDimension);
                u5.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        U5 u5 = this.e;
        if (u5 == null || u5.Z == f) {
            return;
        }
        u5.Z = f;
        u5.invalidateSelf();
        u5.w();
    }

    public void setTextStartPaddingResource(int i) {
        U5 u5 = this.e;
        if (u5 != null) {
            float dimension = u5.e0.getResources().getDimension(i);
            if (u5.Z != dimension) {
                u5.Z = dimension;
                u5.invalidateSelf();
                u5.w();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.O(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.B(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        U5 u5 = this.e;
        if (u5 != null) {
            u5.G(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        U5 u5 = this.e;
        if (u5 != null) {
            Context context2 = u5.e0;
            u5.k0.b(new C0458oq(context2, i), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        U5 u5 = this.e;
        if (u5 != null) {
            Context context = u5.e0;
            u5.k0.b(new C0458oq(context, i), context);
        }
        h();
    }
}
