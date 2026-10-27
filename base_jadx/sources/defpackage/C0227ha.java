package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0227ha extends AbstractC0105db {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final ViewOnClickListenerC0069c6 i;
    public final ViewOnFocusChangeListenerC0100d6 j;
    public final C0098d4 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public C0227ha(C0074cb c0074cb) {
        super(c0074cb);
        this.i = new ViewOnClickListenerC0069c6(this, 3);
        int i = 1;
        this.j = new ViewOnFocusChangeListenerC0100d6(this, i);
        this.k = new C0098d4(this, i);
        this.o = Long.MAX_VALUE;
        this.f = Br.h0(c0074cb.getContext(), R.attr.motionDurationShort3, 67);
        this.e = Br.h0(c0074cb.getContext(), R.attr.motionDurationShort3, 50);
        this.g = Br.i0(c0074cb.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0340l1.a);
    }

    @Override // defpackage.AbstractC0105db
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && F4.S(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new RunnableC0591t5(this, 6));
    }

    @Override // defpackage.AbstractC0105db
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.AbstractC0105db
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.AbstractC0105db
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.AbstractC0105db
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.AbstractC0105db
    public final C0098d4 h() {
        return this.k;
    }

    @Override // defpackage.AbstractC0105db
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.AbstractC0105db
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.AbstractC0105db
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.AbstractC0105db
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: fa
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0227ha c0227ha = this.a;
                c0227ha.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0227ha.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c0227ha.m = false;
                    }
                    c0227ha.u();
                    c0227ha.m = true;
                    c0227ha.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ga
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0227ha c0227ha = this.a;
                c0227ha.m = true;
                c0227ha.o = System.currentTimeMillis();
                c0227ha.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!F4.S(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = Gs.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.AbstractC0105db
    public final void n(J j) {
        boolean zS = F4.S(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = j.a;
        if (!zS) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // defpackage.AbstractC0105db
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || F4.S(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // defpackage.AbstractC0105db
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new C0134ea(this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new C0134ea(this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new Y(this, 2));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.AbstractC0105db
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
