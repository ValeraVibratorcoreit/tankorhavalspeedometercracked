package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074cb extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final C0043bb h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final C2 q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public C0098d4 u;
    public final Za v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074cb(TextInputLayout textInputLayout, K2 k2) {
        CharSequence text;
        super(textInputLayout.getContext());
        int i = 1;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new Za(this);
        C0012ab c0012ab = new C0012ab(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.g = checkableImageButtonA2;
        this.h = new C0043bb(this, k2);
        C2 c2 = new C2(getContext(), null);
        this.q = c2;
        TypedArray typedArray = (TypedArray) k2.b;
        if (typedArray.hasValue(38)) {
            this.d = Br.t(getContext(), k2, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = Tf.P(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(k2.q(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = Gs.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.k = Br.t(getContext(), k2, 32);
            }
            if (typedArray.hasValue(33)) {
                this.l = Tf.P(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.k = Br.t(getContext(), k2, 54);
            }
            if (typedArray.hasValue(55)) {
                this.l = Tf.P(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeN = F4.n(typedArray.getInt(31, -1));
            this.n = scaleTypeN;
            checkableImageButtonA2.setScaleType(scaleTypeN);
            checkableImageButtonA.setScaleType(scaleTypeN);
        }
        c2.setVisibility(8);
        c2.setId(R.id.textinput_suffix_text);
        c2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c2.setAccessibilityLiveRegion(1);
        c2.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c2.setTextColor(k2.p(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.p = TextUtils.isEmpty(text3) ? null : text3;
        c2.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(c2);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.e0.add(c0012ab);
        if (textInputLayout.d != null) {
            c0012ab.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0715x5(this, i));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (Br.G(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC0105db b() {
        AbstractC0105db t7;
        int i = this.i;
        C0043bb c0043bb = this.h;
        SparseArray sparseArray = (SparseArray) c0043bb.c;
        AbstractC0105db bk = (AbstractC0105db) sparseArray.get(i);
        if (bk == null) {
            C0074cb c0074cb = (C0074cb) c0043bb.d;
            if (i == -1) {
                t7 = new T7(c0074cb, 0);
            } else if (i != 0) {
                if (i == 1) {
                    bk = new Bk(c0074cb, c0043bb.b);
                } else if (i == 2) {
                    t7 = new C0192g6(c0074cb);
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException(Vo.e(i, "Invalid end icon mode: "));
                    }
                    t7 = new C0227ha(c0074cb);
                }
                sparseArray.append(i, bk);
            } else {
                t7 = new T7(c0074cb, 1);
            }
            bk = t7;
            sparseArray.append(i, bk);
        }
        return bk;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = Gs.a;
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC0105db abstractC0105dbB = b();
        boolean zK = abstractC0105dbB.k();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.d) == abstractC0105dbB.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC0105dbB instanceof C0227ha) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0105dbB.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            F4.V(this.a, checkableImageButton, this.k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        AbstractC0105db abstractC0105dbB = b();
        C0098d4 c0098d4 = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (c0098d4 != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0771z(c0098d4));
        }
        this.u = null;
        abstractC0105dbB.s();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            throw null;
        }
        h(i != 0);
        AbstractC0105db abstractC0105dbB2 = b();
        int iD = this.h.a;
        if (iD == 0) {
            iD = abstractC0105dbB2.d();
        }
        Drawable drawableF = iD != 0 ? F4.F(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawableF);
        TextInputLayout textInputLayout = this.a;
        if (drawableF != null) {
            F4.e(textInputLayout, checkableImageButton, this.k, this.l);
            F4.V(textInputLayout, checkableImageButton, this.k);
        }
        int iC = abstractC0105dbB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0105dbB2.k());
        if (!abstractC0105dbB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0105dbB2.r();
        C0098d4 c0098d4H = abstractC0105dbB2.h();
        this.u = c0098d4H;
        if (c0098d4H != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = Gs.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0771z(this.u));
            }
        }
        View.OnClickListener onClickListenerF = abstractC0105dbB2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        F4.Z(checkableImageButton, onLongClickListener);
        EditText editText = this.s;
        if (editText != null) {
            abstractC0105dbB2.m(editText);
            j(abstractC0105dbB2);
        }
        F4.e(textInputLayout, checkableImageButton, this.k, this.l);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.g.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        F4.e(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(AbstractC0105db abstractC0105db) {
        if (this.s == null) {
            return;
        }
        if (abstractC0105db.e() != null) {
            this.s.setOnFocusChangeListener(abstractC0105db.e());
        }
        if (abstractC0105db.g() != null) {
            this.g.setOnFocusChangeListener(abstractC0105db.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.p == null || this.r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.j.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = Gs.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = Gs.a;
        this.q.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        C2 c2 = this.q;
        int visibility = c2.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c2.setVisibility(i);
        this.a.q();
    }
}
