package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends Q6 implements DialogInterface, InterfaceC0618u1 {
    public R1 d;
    public final S1 e;
    public final P0 f;

    public R0(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iH = h(contextThemeWrapper, i);
        if (iH == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iH;
        }
        super(contextThemeWrapper, i2);
        this.e = new S1(this);
        E1 e1E = e();
        if (iH == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iH = typedValue2.resourceId;
        }
        ((R1) e1E).U = iH;
        e1E.d();
        this.f = new P0(getContext(), this, getWindow());
    }

    public static int h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.Q6, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        R1 r1 = (R1) e();
        r1.w();
        ((ViewGroup) r1.B.findViewById(android.R.id.content)).addView(view, layoutParams);
        r1.m.a(r1.l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        S1 s1 = this.e;
        if (s1 == null) {
            return false;
        }
        return s1.a.j(keyEvent);
    }

    public final E1 e() {
        if (this.d == null) {
            C1 c1 = E1.a;
            this.d = new R1(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    public final void f() {
        F4.X(getWindow().getDecorView(), this);
        Ud.f0(getWindow().getDecorView(), this);
        Td.D(getWindow().getDecorView(), this);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        R1 r1 = (R1) e();
        r1.w();
        return r1.l.findViewById(i);
    }

    public final void g(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().d();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().b();
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.Q6, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        g(bundle);
        P0 p0 = this.f;
        p0.b.setContentView(p0.F);
        Window window = p0.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = p0.h;
        Context context = p0.a;
        if (viewInflate == null) {
            viewInflate = p0.i != 0 ? LayoutInflater.from(context).inflate(p0.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !P0.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (p0.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (p0.g != null) {
                ((LinearLayout.LayoutParams) ((Jg) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = P0.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = P0.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = P0.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        p0.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        p0.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        p0.B = textView;
        if (textView != null) {
            CharSequence charSequence = p0.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                p0.w.removeView(p0.B);
                if (p0.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) p0.w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(p0.w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(p0.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        p0.k = button;
        X x = p0.L;
        button.setOnClickListener(x);
        boolean zIsEmpty = TextUtils.isEmpty(p0.l);
        int i3 = p0.d;
        if (zIsEmpty && p0.n == null) {
            p0.k.setVisibility(8);
            i = 0;
        } else {
            p0.k.setText(p0.l);
            Drawable drawable = p0.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                p0.k.setCompoundDrawables(p0.n, null, null, null);
            }
            p0.k.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        p0.o = button2;
        button2.setOnClickListener(x);
        if (TextUtils.isEmpty(p0.p) && p0.r == null) {
            p0.o.setVisibility(8);
        } else {
            p0.o.setText(p0.p);
            Drawable drawable2 = p0.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                p0.o.setCompoundDrawables(p0.r, null, null, null);
            }
            p0.o.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        p0.s = button3;
        button3.setOnClickListener(x);
        if (TextUtils.isEmpty(p0.t) && p0.v == null) {
            p0.s.setVisibility(8);
            view = null;
        } else {
            p0.s.setText(p0.t);
            Drawable drawable3 = p0.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                p0.s.setCompoundDrawables(p0.v, null, null, null);
            } else {
                view = null;
            }
            p0.s.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i2 = 2;
        } else if (i == 1) {
            Button button4 = p0.k;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i2 = 2;
        } else {
            i2 = 2;
            if (i == 2) {
                Button button5 = p0.o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = p0.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (p0.C != null) {
            viewGroupB.addView(p0.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            p0.z = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(p0.e)) && p0.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                p0.A = textView2;
                textView2.setText(p0.e);
                int i4 = p0.x;
                if (i4 != 0) {
                    p0.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = p0.y;
                    if (drawable4 != null) {
                        p0.z.setImageDrawable(drawable4);
                    } else {
                        p0.A.setPadding(p0.z.getPaddingLeft(), p0.z.getPaddingTop(), p0.z.getPaddingRight(), p0.z.getPaddingBottom());
                        p0.z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                p0.z.setVisibility(8);
                viewGroupB.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = p0.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (p0.f == null && p0.g == null) ? view : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = p0.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z2) {
            View view2 = p0.g;
            if (view2 == null) {
                view2 = p0.w;
            }
            if (view2 != null) {
                int i6 = i5 | (z3 ? i2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = Gs.a;
                AbstractC0707ws.d(view2, i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = p0.g;
        if (alertController$RecycleListView2 == null || (listAdapter = p0.D) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = p0.E;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.w;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.w;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.Q6, android.app.Dialog
    public final void onStop() {
        super.onStop();
        R1 r1 = (R1) e();
        r1.A();
        Br br = r1.o;
        if (br != null) {
            br.l0(false);
        }
    }

    @Override // defpackage.Q6, android.app.Dialog
    public final void setContentView(int i) {
        f();
        e().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().l(getContext().getString(i));
    }

    @Override // defpackage.Q6, android.app.Dialog
    public final void setContentView(View view) {
        f();
        e().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        P0 p0 = this.f;
        p0.e = charSequence;
        TextView textView = p0.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.Q6, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        e().j(view, layoutParams);
    }
}
