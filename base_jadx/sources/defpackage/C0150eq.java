package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.jcraft.jsch.SftpATTRS;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150eq extends LinearLayout {
    public static final /* synthetic */ int l = 0;
    public C0089cq a;
    public TextView b;
    public ImageView c;
    public View d;
    public T3 e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int j;
    public final /* synthetic */ TabLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150eq(TabLayout tabLayout, Context context) {
        super(context);
        this.k = tabLayout;
        this.j = 2;
        f(context);
        int i = tabLayout.e;
        WeakHashMap weakHashMap = Gs.a;
        setPaddingRelative(i, tabLayout.f, tabLayout.g, tabLayout.h);
        setGravity(17);
        setOrientation(!tabLayout.D ? 1 : 0);
        setClickable(true);
        AbstractC0738xs.d(this, Lk.b(getContext(), 1002));
    }

    private T3 getBadge() {
        return this.e;
    }

    private T3 getOrCreateBadge() {
        if (this.e == null) {
            this.e = new T3(getContext());
        }
        c();
        T3 t3 = this.e;
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.e == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        T3 t3 = this.e;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        t3.setBounds(rect);
        t3.h(view, null);
        if (t3.c() != null) {
            t3.c().setForeground(t3);
        } else {
            view.getOverlay().add(t3);
        }
        this.d = view;
    }

    public final void b() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                T3 t3 = this.e;
                if (t3 != null) {
                    if (t3.c() != null) {
                        t3.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(t3);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void c() {
        C0089cq c0089cq;
        if (this.e != null) {
            if (this.f != null) {
                b();
                return;
            }
            ImageView imageView = this.c;
            if (imageView != null && (c0089cq = this.a) != null && c0089cq.a != null) {
                if (this.d == imageView) {
                    d(imageView);
                    return;
                } else {
                    b();
                    a(this.c);
                    return;
                }
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                b();
            } else if (this.d == textView) {
                d(textView);
            } else {
                b();
                a(this.b);
            }
        }
    }

    public final void d(View view) {
        T3 t3 = this.e;
        if (t3 == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        t3.setBounds(rect);
        t3.h(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.k.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public final void e() {
        boolean z;
        g();
        C0089cq c0089cq = this.a;
        if (c0089cq == null) {
            z = false;
        } else {
            TabLayout tabLayout = c0089cq.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != c0089cq.d) {
                z = false;
            } else {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void f(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.k;
        int i = tabLayout.t;
        if (i != 0) {
            Drawable drawableF = F4.F(context, i);
            this.i = drawableF;
            if (drawableF != null && drawableF.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.n != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.n;
            int[] iArr = Ud.g;
            int iR = Ud.r(colorStateList, Ud.f);
            int[] iArr2 = Ud.e;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iR, Ud.r(colorStateList, iArr2), Ud.r(colorStateList, Ud.d)});
            boolean z = tabLayout.H;
            if (z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = Gs.a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void g() {
        int i;
        ViewParent parent;
        C0089cq c0089cq = this.a;
        View view = c0089cq != null ? c0089cq.e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f;
            if (view3 != null) {
                removeView(view3);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ru.zinovin.tankspeedometer.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ru.zinovin.tankspeedometer.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.j = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.k;
            textView4.setTextAppearance(tabLayout.i);
            if (!isSelected() || (i = tabLayout.k) == -1) {
                this.b.setTextAppearance(tabLayout.j);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.l;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            h(this.b, this.c, true);
            c();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0119dq(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0119dq(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                h(textView6, this.h, false);
            }
        }
        if (c0089cq == null || TextUtils.isEmpty(c0089cq.c)) {
            return;
        }
        setContentDescription(c0089cq.c);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public C0089cq getTab() {
        return this.a;
    }

    public final void h(TextView textView, ImageView imageView, boolean z) {
        Drawable drawable;
        C0089cq c0089cq = this.a;
        Drawable drawableMutate = (c0089cq == null || (drawable = c0089cq.a) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.k;
        if (drawableMutate != null) {
            O9.h(drawableMutate, tabLayout.m);
            PorterDuff.Mode mode = tabLayout.q;
            if (mode != null) {
                O9.i(drawableMutate, mode);
            }
        }
        C0089cq c0089cq2 = this.a;
        CharSequence charSequence = c0089cq2 != null ? c0089cq2.b : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z3) {
                this.a.getClass();
            } else {
                z2 = false;
            }
            textView.setText(z3 ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (z3) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iN = (z2 && imageView.getVisibility() == 0) ? (int) Tf.n(getContext(), 8) : 0;
            if (tabLayout.D) {
                if (iN != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iN);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iN != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iN;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C0089cq c0089cq3 = this.a;
        CharSequence charSequence2 = c0089cq3 != null ? c0089cq3.c : null;
        if (!z3) {
            charSequence = charSequence2;
        }
        AbstractC0059br.a(this, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        T3 t3 = this.e;
        if (t3 != null && t3.isVisible()) {
            T3 t4 = this.e;
            CharSequence quantityString = null;
            if (t4.isVisible()) {
                U3 u3 = t4.e.b;
                String str = u3.j;
                if (str != null) {
                    CharSequence charSequence = u3.o;
                    quantityString = charSequence != null ? charSequence : str;
                } else if (!t4.f()) {
                    quantityString = u3.p;
                } else if (u3.q != 0 && (context = (Context) t4.a.get()) != null) {
                    if (t4.h != -2) {
                        int iD = t4.d();
                        int i = t4.h;
                        if (iD <= i) {
                            quantityString = context.getResources().getQuantityString(u3.q, t4.d(), Integer.valueOf(t4.d()));
                        } else {
                            quantityString = context.getString(u3.r, Integer.valueOf(i));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(u3.q, t4.d(), Integer.valueOf(t4.d()));
                    }
                }
            }
            accessibilityNodeInfo.setContentDescription(quantityString);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) I.a(isSelected(), 0, 1, this.a.d, 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) E.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ru.zinovin.tankspeedometer.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.u, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.r;
            int i3 = this.j;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.s;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.C == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.a.a();
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C0089cq c0089cq) {
        if (c0089cq != this.a) {
            this.a = c0089cq;
            e();
        }
    }
}
