package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0112di<S> extends DialogInterfaceOnCancelListenerC0133e9 {
    public TextView A0;
    public CheckableImageButton B0;
    public C0204gi C0;
    public boolean D0;
    public CharSequence E0;
    public CharSequence F0;
    public final LinkedHashSet i0;
    public final LinkedHashSet j0;
    public int k0;
    public Ek l0;
    public C0282j5 m0;
    public Yh n0;
    public int o0;
    public CharSequence p0;
    public boolean q0;
    public int r0;
    public int s0;
    public CharSequence t0;
    public int u0;
    public CharSequence v0;
    public int w0;
    public CharSequence x0;
    public int y0;
    public CharSequence z0;

    public C0112di() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.i0 = new LinkedHashSet();
        this.j0 = new LinkedHashSet();
    }

    public static int R(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarC = Nr.c();
        calendarC.set(5, 1);
        Calendar calendarB = Nr.b(calendarC);
        calendarB.get(2);
        calendarB.get(1);
        int maximum = calendarB.getMaximum(7);
        calendarB.getActualMaximum(5);
        calendarB.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean S(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Tf.T(R.attr.materialCalendarStyle, context, Yh.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9, defpackage.AbstractComponentCallbacksC0784zc
    public final void B(Bundle bundle) {
        super.B(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.k0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0282j5 c0282j5 = this.m0;
        C0253i5 c0253i5 = new C0253i5();
        int i = C0253i5.b;
        int i2 = C0253i5.b;
        long j = c0282j5.a.f;
        long j2 = c0282j5.b.f;
        c0253i5.a = Long.valueOf(c0282j5.d.f);
        Yh yh = this.n0;
        C0020aj c0020aj = yh == null ? null : yh.W;
        if (c0020aj != null) {
            c0253i5.a = Long.valueOf(c0020aj.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0282j5.c);
        C0020aj c0020ajB = C0020aj.b(j);
        C0020aj c0020ajB2 = C0020aj.b(j2);
        C0256i8 c0256i8 = (C0256i8) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0253i5.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0282j5(c0020ajB, c0020ajB2, c0256i8, l == null ? null : C0020aj.b(l.longValue()), c0282j5.e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.o0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.p0);
        bundle.putInt("INPUT_MODE_KEY", this.r0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.s0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.t0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.u0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.v0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.w0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.x0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.y0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.z0);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9, defpackage.AbstractComponentCallbacksC0784zc
    public final void C() {
        Ek ek;
        Td wt;
        Td wt2;
        super.C();
        Dialog dialog = this.e0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.q0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.C0);
            if (!this.D0) {
                View viewFindViewById = J().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListK = AbstractC0390mk.k(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListK != null ? Integer.valueOf(colorStateListK.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int i = AbstractC0390mk.i(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z) {
                    numValueOf = Integer.valueOf(i);
                }
                F4.Y(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z2 = AbstractC0390mk.s(0) || AbstractC0390mk.s(numValueOf.intValue());
                Vi vi = new Vi(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    Yt yt = new Yt(window.getInsetsController(), vi);
                    yt.j = window;
                    wt = yt;
                } else {
                    wt = new Wt(window, vi);
                }
                wt.F(z2);
                boolean z3 = AbstractC0390mk.s(0) || AbstractC0390mk.s(i);
                Vi vi2 = new Vi(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    Yt yt2 = new Yt(window.getInsetsController(), vi2);
                    yt2.j = window;
                    wt2 = yt2;
                } else {
                    wt2 = new Wt(window, vi2);
                }
                wt2.E(z3);
                C0068c5 c0068c5 = new C0068c5(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = Gs.a;
                AbstractC0676vs.u(viewFindViewById, c0068c5);
                this.D0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = k().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.C0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.e0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new Ff(dialog2, rect));
        }
        I();
        int i2 = this.k0;
        if (i2 == 0) {
            Q();
            throw null;
        }
        Q();
        C0282j5 c0282j5 = this.m0;
        Yh yh = new Yh();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0282j5);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0282j5.d);
        yh.L(bundle);
        this.n0 = yh;
        if (this.r0 == 1) {
            ek = yh;
            Q();
            C0282j5 c0282j6 = this.m0;
            C0235hi c0235hi = new C0235hi();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0282j6);
            c0235hi.L(bundle2);
            ek = c0235hi;
        }
        ek = yh;
        this.l0 = ek;
        this.A0.setText((this.r0 == 1 && k().getConfiguration().orientation == 2) ? this.F0 : this.E0);
        Q();
        h();
        throw null;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9, defpackage.AbstractComponentCallbacksC0784zc
    public final void D() {
        this.l0.T.clear();
        super.D();
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9
    public final Dialog P() {
        Context contextI = I();
        I();
        int i = this.k0;
        if (i == 0) {
            Q();
            throw null;
        }
        Dialog dialog = new Dialog(contextI, i);
        Context context = dialog.getContext();
        this.q0 = S(context, android.R.attr.windowFullscreen);
        this.C0 = new C0204gi(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0638ul.n, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C0.j(context);
        this.C0.l(ColorStateList.valueOf(color));
        C0204gi c0204gi = this.C0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = Gs.a;
        c0204gi.k(AbstractC0676vs.i(decorView));
        return dialog;
    }

    public final void Q() {
        Vo.k(this.f.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.j0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0133e9, defpackage.AbstractComponentCallbacksC0784zc
    public final void v(Bundle bundle) {
        super.v(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.k0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        Vo.k(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.m0 = (C0282j5) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        Vo.k(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.p0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.r0 = bundle.getInt("INPUT_MODE_KEY");
        this.s0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.t0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.u0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.v0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.w0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.x0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.y0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.z0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.p0;
        if (text == null) {
            text = I().getResources().getText(this.o0);
        }
        this.E0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.F0 = text;
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.q0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.q0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(R(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(R(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = Gs.a;
        textView.setAccessibilityLiveRegion(1);
        this.B0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.A0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.B0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.B0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, F4.F(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], F4.F(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.B0.setChecked(this.r0 != 0);
        Gs.j(this.B0, null);
        CheckableImageButton checkableImageButton2 = this.B0;
        this.B0.setContentDescription(this.r0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.B0.setOnClickListener(new ViewOnClickListenerC0069c6(this, 4));
        Q();
        throw null;
    }
}
