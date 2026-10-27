package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0496q2 extends C0018ah implements InterfaceC0557s2 {
    public CharSequence C;
    public ListAdapter D;
    public final Rect E;
    public int F;
    public final /* synthetic */ C0588t2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0496q2(C0588t2 c0588t2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.G = c0588t2;
        this.E = new Rect();
        this.o = c0588t2;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new C0434o2(this, 0);
    }

    @Override // defpackage.InterfaceC0557s2
    public final void d(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0065c2 c0065c2 = this.z;
        boolean zIsShowing = c0065c2.isShowing();
        q();
        this.z.setInputMethodMode(2);
        e();
        C0073ca c0073ca = this.c;
        c0073ca.setChoiceMode(1);
        c0073ca.setTextDirection(i);
        c0073ca.setTextAlignment(i2);
        C0588t2 c0588t2 = this.G;
        int selectedItemPosition = c0588t2.getSelectedItemPosition();
        C0073ca c0073ca2 = this.c;
        if (c0065c2.isShowing() && c0073ca2 != null) {
            c0073ca2.setListSelectionHidden(false);
            c0073ca2.setSelection(selectedItemPosition);
            if (c0073ca2.getChoiceMode() != 0) {
                c0073ca2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0588t2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0310k2 viewTreeObserverOnGlobalLayoutListenerC0310k2 = new ViewTreeObserverOnGlobalLayoutListenerC0310k2(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0310k2);
        this.z.setOnDismissListener(new C0465p2(this, viewTreeObserverOnGlobalLayoutListenerC0310k2));
    }

    @Override // defpackage.InterfaceC0557s2
    public final CharSequence h() {
        return this.C;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void j(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // defpackage.C0018ah, defpackage.InterfaceC0557s2
    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.D = listAdapter;
    }

    @Override // defpackage.InterfaceC0557s2
    public final void n(int i) {
        this.F = i;
    }

    public final void q() {
        int i;
        C0065c2 c0065c2 = this.z;
        Drawable background = c0065c2.getBackground();
        C0588t2 c0588t2 = this.G;
        if (background != null) {
            background.getPadding(c0588t2.h);
            int layoutDirection = c0588t2.getLayoutDirection();
            Rect rect = c0588t2.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0588t2.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0588t2.getPaddingLeft();
        int paddingRight = c0588t2.getPaddingRight();
        int width = c0588t2.getWidth();
        int i2 = c0588t2.g;
        if (i2 == -2) {
            int iA = c0588t2.a((SpinnerAdapter) this.D, c0065c2.getBackground());
            int i3 = c0588t2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0588t2.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (iA > i4) {
                iA = i4;
            }
            p(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i2);
        }
        this.f = c0588t2.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.F) + i : paddingLeft + this.F + i;
    }
}
