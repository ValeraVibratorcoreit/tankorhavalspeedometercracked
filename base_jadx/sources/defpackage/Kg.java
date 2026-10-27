package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.jcraft.jsch.SftpATTRS;

/* JADX INFO: loaded from: classes.dex */
public abstract class Kg extends ViewGroup {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public int[] i;
    public int[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;

    public Kg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = AbstractC0700wl.n;
        K2 k2G = K2.G(context, attributeSet, iArr, 0, 0);
        Gs.i(this, context, iArr, attributeSet, (TypedArray) k2G.b, 0);
        TypedArray typedArray = (TypedArray) k2G.b;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.g = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.h = typedArray.getBoolean(7, false);
        setDividerDrawable(k2G.q(5));
        this.n = typedArray.getInt(8, 0);
        this.o = typedArray.getDimensionPixelSize(6, 0);
        k2G.J();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Jg;
    }

    public final void d(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Jg generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new Jg(-2, -2);
        }
        if (i == 1) {
            return new Jg(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Jg generateLayoutParams(AttributeSet attributeSet) {
        return new Jg(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((Jg) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Jg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Jg) {
            return new Jg((Jg) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new Jg((ViewGroup.MarginLayoutParams) layoutParams) : new Jg(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.k == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((Jg) childAt.getLayoutParams())).topMargin) - this.m);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((Jg) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                Jg jg = (Jg) childAt3.getLayoutParams();
                e(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) jg).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) jg).leftMargin) - this.l);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                Jg jg2 = (Jg) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) jg2).leftMargin;
                    i = this.l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) jg2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.l;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0174  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14 = 8;
        if (this.d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i15 = i3 - i;
            int paddingRight = i15 - getPaddingRight();
            int paddingRight2 = (i15 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i16 = this.e;
            int i17 = i16 & 112;
            int i18 = 8388615 & i16;
            if (i17 != 16) {
                paddingTop = i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f) / 2);
            }
            int i19 = 0;
            while (i19 < virtualChildCount) {
                View childAt = getChildAt(i19);
                if (childAt != null && childAt.getVisibility() != i14) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    Jg jg = (Jg) childAt.getLayoutParams();
                    int i20 = ((LinearLayout.LayoutParams) jg).gravity;
                    if (i20 < 0) {
                        i20 = i18;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i13 = ((LinearLayout.LayoutParams) jg).leftMargin + paddingLeft2;
                        } else {
                            i11 = paddingRight - measuredWidth;
                            i12 = ((LinearLayout.LayoutParams) jg).rightMargin;
                        }
                        if (i(i19)) {
                            paddingTop += this.m;
                        }
                        int i21 = paddingTop + ((LinearLayout.LayoutParams) jg).topMargin;
                        childAt.layout(i13, i21, measuredWidth + i13, i21 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) jg).bottomMargin + i21;
                    } else {
                        i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) jg).leftMargin;
                        i12 = ((LinearLayout.LayoutParams) jg).rightMargin;
                    }
                    i13 = i11 - i12;
                    if (i(i19)) {
                        paddingTop += this.m;
                    }
                    int i22 = paddingTop + ((LinearLayout.LayoutParams) jg).topMargin;
                    childAt.layout(i13, i22, measuredWidth + i13, i22 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) jg).bottomMargin + i22;
                }
                i19++;
                i14 = 8;
            }
            return;
        }
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.e;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z3 = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f) / 2);
        }
        if (z2) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i27 = 0;
        while (i27 < virtualChildCount2) {
            int i28 = (i5 * i27) + i6;
            View childAt2 = getChildAt(i28);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    Jg jg2 = (Jg) childAt2.getLayoutParams();
                    if (z3) {
                        i8 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) jg2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) jg2).gravity;
                        if (i9 < 0) {
                            i9 = i26;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) jg2).topMargin) - ((LinearLayout.LayoutParams) jg2).bottomMargin;
                        } else if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) jg2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) jg2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i28)) {
                            paddingLeft += this.l;
                        }
                        int i29 = paddingLeft + ((LinearLayout.LayoutParams) jg2).leftMargin;
                        childAt2.layout(i29, measuredHeight, i29 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) jg2).rightMargin + i29;
                    } else {
                        i8 = virtualChildCount2;
                    }
                    i9 = ((LinearLayout.LayoutParams) jg2).gravity;
                    if (i9 < 0) {
                        i9 = i26;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) jg2).topMargin) - ((LinearLayout.LayoutParams) jg2).bottomMargin;
                    } else if (i10 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) jg2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i10 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) jg2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (i(i28)) {
                        paddingLeft += this.l;
                    }
                    int i210 = paddingLeft + ((LinearLayout.LayoutParams) jg2).leftMargin;
                    childAt2.layout(i210, measuredHeight, i210 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) jg2).rightMargin + i210;
                }
                i27++;
                i6 = i7;
                i5 = i5;
                virtualChildCount2 = i8;
                i26 = i26;
            }
            i8 = virtualChildCount2;
            i27++;
            i6 = i7;
            i5 = i5;
            virtualChildCount2 = i8;
            i26 = i26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0486  */
    /* JADX WARN: Code duplicated, block: B:214:0x048b  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x04de  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:240:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0552  */
    /* JADX WARN: Code duplicated, block: B:252:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x055d  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:288:0x0600  */
    /* JADX WARN: Code duplicated, block: B:289:0x060c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0691  */
    /* JADX WARN: Code duplicated, block: B:315:0x0698  */
    /* JADX WARN: Code duplicated, block: B:318:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:373:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:381:0x0806  */
    /* JADX WARN: Code duplicated, block: B:388:0x083d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0860  */
    /* JADX WARN: Code duplicated, block: B:393:0x086e  */
    /* JADX WARN: Code duplicated, block: B:395:0x087a  */
    /* JADX WARN: Code duplicated, block: B:397:0x0886  */
    /* JADX WARN: Code duplicated, block: B:398:0x089b  */
    /* JADX WARN: Code duplicated, block: B:429:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        int iMax;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        char c2;
        int i7;
        View childAt;
        int i8;
        int i9;
        int i10;
        int baseline;
        int i11;
        int iMakeMeasureSpec;
        int i12;
        View childAt2;
        Jg jg;
        int i13;
        View childAt3;
        Jg jg2;
        float f2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z;
        boolean z2;
        Jg jg3;
        int measuredWidth;
        boolean z3;
        int i20;
        boolean z4;
        int i21;
        int measuredHeight;
        boolean z5;
        int baseline2;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        boolean z7;
        Jg jg4;
        boolean z8;
        int i26;
        boolean z9;
        int iMax2;
        int i27 = this.d;
        int i28 = -2;
        int i29 = 1073741824;
        int i30 = 8;
        int i31 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        float f3 = 0.0f;
        boolean z10 = true;
        if (i27 == 1) {
            this.f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i32 = this.b;
            boolean z11 = this.h;
            boolean z12 = true;
            int i33 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z13 = false;
            int iMax5 = 0;
            int i34 = 0;
            int i35 = 0;
            boolean z14 = false;
            float f4 = 0.0f;
            while (i33 < virtualChildCount) {
                View childAt4 = getChildAt(i33);
                if (childAt4 == null) {
                    this.f = this.f;
                } else {
                    if (childAt4.getVisibility() != i30) {
                        if (i(i33)) {
                            this.f += this.m;
                        }
                        Jg jg5 = (Jg) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) jg5).weight;
                        f4 += f5;
                        if (mode2 == i29 && ((LinearLayout.LayoutParams) jg5).height == 0 && f5 > f3) {
                            int i36 = this.f;
                            this.f = Math.max(i36, ((LinearLayout.LayoutParams) jg5).topMargin + i36 + ((LinearLayout.LayoutParams) jg5).bottomMargin);
                            jg4 = jg5;
                            z8 = true;
                            z7 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) jg5).height != 0 || f5 <= f3) {
                                i25 = i31;
                            } else {
                                ((LinearLayout.LayoutParams) jg5).height = i28;
                                i25 = 0;
                            }
                            int i37 = f4 == f3 ? this.f : 0;
                            z7 = true;
                            jg4 = jg5;
                            measureChildWithMargins(childAt4, i, 0, i2, i37);
                            if (i25 != i31) {
                                ((LinearLayout.LayoutParams) jg4).height = i25;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i38 = this.f;
                            this.f = Math.max(i38, i38 + measuredHeight2 + ((LinearLayout.LayoutParams) jg4).topMargin + ((LinearLayout.LayoutParams) jg4).bottomMargin);
                            int i39 = iMax5;
                            if (z11) {
                                iMax5 = Math.max(measuredHeight2, i39);
                            }
                            z8 = z13;
                        }
                        if (i32 >= 0 && i32 == i33 + 1) {
                            this.c = this.f;
                        }
                        if (i33 < i32 && ((LinearLayout.LayoutParams) jg4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i26 = mode;
                        if (i26 == 1073741824 || ((LinearLayout.LayoutParams) jg4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = z7;
                            z14 = z9;
                        }
                        int i40 = ((LinearLayout.LayoutParams) jg4).leftMargin + ((LinearLayout.LayoutParams) jg4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i40;
                        iMax2 = Math.max(i34, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i35, childAt4.getMeasuredState());
                        boolean z15 = (z12 && ((LinearLayout.LayoutParams) jg4).width == -1) ? z7 : false;
                        if (((LinearLayout.LayoutParams) jg4).weight > 0.0f) {
                            if (!z9) {
                                i40 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i40);
                        } else {
                            int i41 = iMax4;
                            if (!z9) {
                                i40 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i40);
                            iMax4 = i41;
                        }
                        z13 = z8;
                        i35 = iCombineMeasuredStates;
                        z12 = z15;
                    }
                    i33++;
                    mode = i26;
                    i34 = iMax2;
                    i32 = i32;
                    z10 = z7;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i28 = -2;
                    i29 = 1073741824;
                    i30 = 8;
                    i31 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                    f3 = 0.0f;
                }
                i32 = i32;
                mode2 = mode2;
                i26 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i34;
                z7 = true;
                i33++;
                mode = i26;
                i34 = iMax2;
                i32 = i32;
                z10 = z7;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i28 = -2;
                i29 = 1073741824;
                i30 = 8;
                i31 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                f3 = 0.0f;
            }
            int i42 = mode2;
            int i43 = mode;
            int i44 = virtualChildCount;
            boolean z16 = z10;
            int iMax6 = iMax3;
            int i45 = iMax4;
            int i46 = iMax5;
            int i47 = i34;
            int iCombineMeasuredStates2 = i35;
            if (this.f > 0 && i(i44)) {
                this.f += this.m;
            }
            int i48 = i42;
            if (z11 && (i48 == Integer.MIN_VALUE || i48 == 0)) {
                this.f = 0;
                for (int i49 = 0; i49 < i44; i49++) {
                    View childAt5 = getChildAt(i49);
                    if (childAt5 == null) {
                        this.f = this.f;
                    } else if (childAt5.getVisibility() != 8) {
                        Jg jg6 = (Jg) childAt5.getLayoutParams();
                        int i50 = this.f;
                        this.f = Math.max(i50, i50 + i46 + ((LinearLayout.LayoutParams) jg6).topMargin + ((LinearLayout.LayoutParams) jg6).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f;
            this.f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i51 = (16777215 & iResolveSizeAndState) - this.f;
            if (z13 || (i51 != 0 && f4 > 0.0f)) {
                float f6 = this.g;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.f = 0;
                int i52 = 0;
                while (i52 < i44) {
                    View childAt6 = getChildAt(i52);
                    if (childAt6.getVisibility() == 8) {
                        i22 = i48;
                    } else {
                        Jg jg7 = (Jg) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) jg7).weight;
                        if (f7 > 0.0f) {
                            int i53 = (int) ((i51 * f7) / f4);
                            f4 -= f7;
                            int i54 = i51 - i53;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) jg7).leftMargin + ((LinearLayout.LayoutParams) jg7).rightMargin, ((LinearLayout.LayoutParams) jg7).width);
                            if (((LinearLayout.LayoutParams) jg7).height == 0) {
                                i24 = 1073741824;
                                if (i48 == 1073741824) {
                                    if (i53 <= 0) {
                                        i53 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i53, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i51 = i54;
                            } else {
                                i24 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i53;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i24));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i51 = i54;
                        }
                        int i55 = ((LinearLayout.LayoutParams) jg7).leftMargin + ((LinearLayout.LayoutParams) jg7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i55;
                        int iMax7 = Math.max(i47, measuredWidth3);
                        if (i43 != 1073741824) {
                            i22 = i48;
                            i23 = -1;
                            if (((LinearLayout.LayoutParams) jg7).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i55);
                            if (z12 || ((LinearLayout.LayoutParams) jg7).width != i23) {
                                z6 = false;
                            } else {
                                z6 = z16;
                            }
                            int i56 = this.f;
                            this.f = Math.max(i56, childAt6.getMeasuredHeight() + i56 + ((LinearLayout.LayoutParams) jg7).topMargin + ((LinearLayout.LayoutParams) jg7).bottomMargin);
                            z12 = z6;
                            i47 = iMax7;
                        } else {
                            i22 = i48;
                            i23 = -1;
                        }
                        i55 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i55);
                        if (z12) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        int i57 = this.f;
                        this.f = Math.max(i57, childAt6.getMeasuredHeight() + i57 + ((LinearLayout.LayoutParams) jg7).topMargin + ((LinearLayout.LayoutParams) jg7).bottomMargin);
                        z12 = z6;
                        i47 = iMax7;
                    }
                    i52++;
                    i48 = i22;
                }
                this.f = getPaddingBottom() + getPaddingTop() + this.f;
            } else {
                iMax6 = Math.max(iMax6, i45);
                if (z11 && i48 != 1073741824) {
                    for (int i58 = 0; i58 < i44; i58++) {
                        View childAt7 = getChildAt(i58);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((Jg) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                        }
                    }
                }
            }
            int i59 = i47;
            if (z12 || i43 == 1073741824) {
                iMax6 = i59;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z14) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i60 = 0; i60 < i44; i60++) {
                    View childAt8 = getChildAt(i60);
                    if (childAt8.getVisibility() != 8) {
                        Jg jg8 = (Jg) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) jg8).width == -1) {
                            int i61 = ((LinearLayout.LayoutParams) jg8).height;
                            ((LinearLayout.LayoutParams) jg8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) jg8).height = i61;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.a;
        boolean z18 = this.h;
        boolean z19 = mode3 == 1073741824;
        boolean z20 = true;
        int iMax8 = 0;
        float f8 = 0.0f;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i63 < virtualChildCount2) {
            View childAt9 = getChildAt(i63);
            if (childAt9 == null) {
                this.f = this.f;
                i19 = i63;
                z = z18;
                z2 = z17;
            } else {
                int i65 = iMax8;
                int i66 = i62;
                if (childAt9.getVisibility() == 8) {
                    z2 = z17;
                    iMax8 = i65;
                    i62 = i66;
                    i19 = i63;
                    z = z18;
                } else {
                    if (i(i63)) {
                        this.f += this.l;
                    }
                    Jg jg9 = (Jg) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) jg9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) jg9).width == 0 && f9 > 0.0f) {
                        if (z19) {
                            this.f = ((LinearLayout.LayoutParams) jg9).leftMargin + ((LinearLayout.LayoutParams) jg9).rightMargin + this.f;
                        } else {
                            int i67 = this.f;
                            this.f = Math.max(i67, ((LinearLayout.LayoutParams) jg9).leftMargin + i67 + ((LinearLayout.LayoutParams) jg9).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            jg3 = jg9;
                            i16 = i65;
                            i17 = i66;
                            i19 = i63;
                            z = z18;
                            z2 = z17;
                        } else {
                            jg3 = jg9;
                            i16 = i65;
                            i17 = i66;
                            i19 = i63;
                            i20 = 1073741824;
                            z = z18;
                            z2 = z17;
                            z3 = true;
                        }
                        if (mode4 == i20 && ((LinearLayout.LayoutParams) jg3).height == -1) {
                            z4 = true;
                            z22 = true;
                        } else {
                            z4 = false;
                        }
                        i21 = ((LinearLayout.LayoutParams) jg3).topMargin + ((LinearLayout.LayoutParams) jg3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i21;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i64, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i68 = ((LinearLayout.LayoutParams) jg3).gravity;
                            if (i68 < 0) {
                                i68 = this.e;
                            }
                            int i69 = (((i68 & 112) >> 4) & (-2)) >> 1;
                            iArr[i69] = Math.max(iArr[i69], baseline2);
                            iArr2[i69] = Math.max(iArr2[i69], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(i17, measuredHeight);
                        if (z20 || ((LinearLayout.LayoutParams) jg3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) jg3).weight > 0.0f) {
                            if (z4) {
                                measuredHeight = i21;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax8 = i16;
                        } else {
                            if (z4) {
                                measuredHeight = i21;
                            }
                            iMax8 = Math.max(i16, measuredHeight);
                        }
                        i62 = iMax11;
                        i64 = iCombineMeasuredStates3;
                        z21 = z3;
                        z20 = z5;
                        f8 = f10;
                    } else {
                        int i70 = i63;
                        if (((LinearLayout.LayoutParams) jg9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((LinearLayout.LayoutParams) jg9).width = -2;
                                i14 = 0;
                            }
                            if (f10 == f2) {
                                i15 = this.f;
                            } else {
                                i15 = 0;
                            }
                            i16 = i65;
                            i17 = i66;
                            i18 = i14;
                            i19 = i70;
                            z = z18;
                            z2 = z17;
                            measureChildWithMargins(childAt9, i, i15, i2, 0);
                            if (i18 != Integer.MIN_VALUE) {
                                jg3 = jg9;
                                ((LinearLayout.LayoutParams) jg3).width = i18;
                            } else {
                                jg3 = jg9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z19) {
                                this.f = ((LinearLayout.LayoutParams) jg3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) jg3).rightMargin + this.f;
                            } else {
                                int i71 = this.f;
                                this.f = Math.max(i71, i71 + measuredWidth + ((LinearLayout.LayoutParams) jg3).leftMargin + ((LinearLayout.LayoutParams) jg3).rightMargin);
                            }
                            if (z) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i14 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                        if (f10 == f2) {
                            i15 = this.f;
                        } else {
                            i15 = 0;
                        }
                        i16 = i65;
                        i17 = i66;
                        i18 = i14;
                        i19 = i70;
                        z = z18;
                        z2 = z17;
                        measureChildWithMargins(childAt9, i, i15, i2, 0);
                        if (i18 != Integer.MIN_VALUE) {
                            jg3 = jg9;
                            ((LinearLayout.LayoutParams) jg3).width = i18;
                        } else {
                            jg3 = jg9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z19) {
                            this.f = ((LinearLayout.LayoutParams) jg3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) jg3).rightMargin + this.f;
                        } else {
                            int i72 = this.f;
                            this.f = Math.max(i72, i72 + measuredWidth + ((LinearLayout.LayoutParams) jg3).leftMargin + ((LinearLayout.LayoutParams) jg3).rightMargin);
                        }
                        if (z) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z3 = z21;
                    i20 = 1073741824;
                    if (mode4 == i20) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i21 = ((LinearLayout.LayoutParams) jg3).topMargin + ((LinearLayout.LayoutParams) jg3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i21;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i64, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax12 = Math.max(i17, measuredHeight);
                    if (z20) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) jg3).weight > 0.0f) {
                        if (z4) {
                            measuredHeight = i21;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax8 = i16;
                    } else {
                        if (z4) {
                            measuredHeight = i21;
                        }
                        iMax8 = Math.max(i16, measuredHeight);
                    }
                    i62 = iMax12;
                    i64 = iCombineMeasuredStates4;
                    z21 = z3;
                    z20 = z5;
                    f8 = f10;
                }
            }
            i63 = i19 + 1;
            z18 = z;
            z17 = z2;
        }
        int i73 = i62;
        boolean z23 = z18;
        boolean z24 = z17;
        if (this.f > 0 && i(virtualChildCount2)) {
            this.f += this.l;
        }
        int i74 = iArr[1];
        if (i74 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] == -1) {
                iMax = i73;
            }
            if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f = 0;
                for (i13 = 0; i13 < virtualChildCount2; i13++) {
                    childAt3 = getChildAt(i13);
                    if (childAt3 == null) {
                        this.f = this.f;
                    } else if (childAt3.getVisibility() == 8) {
                        jg2 = (Jg) childAt3.getLayoutParams();
                        if (z19) {
                            this.f = ((LinearLayout.LayoutParams) jg2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) jg2).rightMargin + this.f;
                        } else {
                            int i75 = this.f;
                            this.f = Math.max(i75, i75 + iMax9 + ((LinearLayout.LayoutParams) jg2).leftMargin + ((LinearLayout.LayoutParams) jg2).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f;
            this.f = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            i3 = (16777215 & iResolveSizeAndState2) - this.f;
            if (!z21 || (i3 != 0 && f8 > 0.0f)) {
                f = this.g;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f = 0;
                int iCombineMeasuredStates5 = i64;
                iMax = -1;
                i4 = 0;
                while (i4 < virtualChildCount2) {
                    childAt = getChildAt(i4);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i8 = i3;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        Jg jg10 = (Jg) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) jg10).weight;
                        if (f11 > 0.0f) {
                            int i76 = (int) ((i3 * f11) / f8);
                            float f12 = f8 - f11;
                            int i77 = i3 - i76;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) jg10).topMargin + ((LinearLayout.LayoutParams) jg10).bottomMargin, ((LinearLayout.LayoutParams) jg10).height);
                            if (((LinearLayout.LayoutParams) jg10).width == 0) {
                                i11 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i76 <= 0) {
                                        i76 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f8 = f12;
                                i9 = i77;
                            } else {
                                i11 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i76;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i11), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f8 = f12;
                            i9 = i77;
                        } else {
                            i9 = i3;
                        }
                        if (z19) {
                            this.f = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) jg10).leftMargin + ((LinearLayout.LayoutParams) jg10).rightMargin + this.f;
                        } else {
                            int i78 = this.f;
                            this.f = Math.max(i78, childAt.getMeasuredWidth() + i78 + ((LinearLayout.LayoutParams) jg10).leftMargin + ((LinearLayout.LayoutParams) jg10).rightMargin);
                        }
                        boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) jg10).height == -1;
                        int i79 = ((LinearLayout.LayoutParams) jg10).topMargin + ((LinearLayout.LayoutParams) jg10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i79;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z25) {
                            i79 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i79);
                        if (z20) {
                            i10 = -1;
                            boolean z26 = ((LinearLayout.LayoutParams) jg10).height == -1;
                            if (!z24 && (baseline = childAt.getBaseline()) != i10) {
                                int i80 = ((LinearLayout.LayoutParams) jg10).gravity;
                                if (i80 < 0) {
                                    i80 = this.e;
                                }
                                int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                                iArr[i81] = Math.max(iArr[i81], baseline);
                                iArr2[i81] = Math.max(iArr2[i81], measuredHeight4 - baseline);
                            }
                            z20 = z26;
                            i8 = i9;
                            f8 = f8;
                        } else {
                            i10 = -1;
                        }
                        if (!z24) {
                        }
                        z20 = z26;
                        i8 = i9;
                        f8 = f8;
                    }
                    i4++;
                    i3 = i8;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5 = virtualChildCount2;
                this.f = getPaddingRight() + getPaddingLeft() + this.f;
                i6 = iArr[1];
                if (i6 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c2 = 3;
                    if (iArr[3] == -1) {
                        i7 = 0;
                    }
                    i64 = iCombineMeasuredStates5;
                } else {
                    c2 = 3;
                }
                i7 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
                i64 = iCombineMeasuredStates5;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z23 && mode3 != 1073741824) {
                    for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                        View childAt10 = getChildAt(i82);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((Jg) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i5 = virtualChildCount2;
                i7 = 0;
            }
            if (z20 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i64 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i2, i64 << 16));
            if (z22) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i12 = i5;
                while (i7 < i12) {
                    childAt2 = getChildAt(i7);
                    if (childAt2.getVisibility() != 8) {
                        jg = (Jg) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) jg).height == -1) {
                            int i83 = ((LinearLayout.LayoutParams) jg).width;
                            ((LinearLayout.LayoutParams) jg).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) jg).width = i83;
                        }
                    }
                    i7++;
                }
            }
        }
        c = 3;
        iMax = Math.max(i73, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i74, iArr[2]))));
        if (z23) {
            this.f = 0;
            while (i13 < virtualChildCount2) {
                childAt3 = getChildAt(i13);
                if (childAt3 == null) {
                    this.f = this.f;
                } else if (childAt3.getVisibility() == 8) {
                    jg2 = (Jg) childAt3.getLayoutParams();
                    if (z19) {
                        this.f = ((LinearLayout.LayoutParams) jg2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) jg2).rightMargin + this.f;
                    } else {
                        int i710 = this.f;
                        this.f = Math.max(i710, i710 + iMax9 + ((LinearLayout.LayoutParams) jg2).leftMargin + ((LinearLayout.LayoutParams) jg2).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f;
        this.f = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i3 = (16777215 & iResolveSizeAndState3) - this.f;
        if (z21) {
            f = this.g;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            int iCombineMeasuredStates6 = i64;
            iMax = -1;
            i4 = 0;
            while (i4 < virtualChildCount2) {
                childAt = getChildAt(i4);
                if (childAt != null) {
                    i8 = i3;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i8 = i3;
                    virtualChildCount2 = virtualChildCount2;
                }
                i4++;
                i3 = i8;
                virtualChildCount2 = virtualChildCount2;
            }
            i5 = virtualChildCount2;
            this.f = getPaddingRight() + getPaddingLeft() + this.f;
            i6 = iArr[1];
            if (i6 != -1) {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            } else {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            }
            i64 = iCombineMeasuredStates6;
        } else {
            f = this.g;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            int iCombineMeasuredStates7 = i64;
            iMax = -1;
            i4 = 0;
            while (i4 < virtualChildCount2) {
                childAt = getChildAt(i4);
                if (childAt != null) {
                    i8 = i3;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i8 = i3;
                    virtualChildCount2 = virtualChildCount2;
                }
                i4++;
                i3 = i8;
                virtualChildCount2 = virtualChildCount2;
            }
            i5 = virtualChildCount2;
            this.f = getPaddingRight() + getPaddingLeft() + this.f;
            i6 = iArr[1];
            if (i6 != -1) {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            } else {
                c2 = 3;
                i7 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i6, iArr[2]))));
            }
            i64 = iCombineMeasuredStates7;
        }
        if (z20) {
            iMax8 = iMax;
        } else {
            iMax8 = iMax;
        }
        setMeasuredDimension((i64 & (-16777216)) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i2, i64 << 16));
        if (z22) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i12 = i5;
            while (i7 < i12) {
                childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() != 8) {
                    jg = (Jg) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) jg).height == -1) {
                        int i84 = ((LinearLayout.LayoutParams) jg).width;
                        ((LinearLayout.LayoutParams) jg).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) jg).width = i84;
                    }
                }
                i7++;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
