package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class M1 implements Window.Callback {
    public final Window.Callback a;
    public Xq b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ R1 f;

    public M1(R1 r1, Window.Callback callback) {
        this.f = r1;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC0708wt.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        R1 r1 = this.f;
        r1.A();
        Br br = r1.o;
        if (br != null && br.R(keyCode, keyEvent)) {
            return true;
        }
        Q1 q1 = r1.N;
        if (q1 != null && r1.F(q1, keyEvent.getKeyCode(), keyEvent)) {
            Q1 q2 = r1.N;
            if (q2 == null) {
                return true;
            }
            q2.l = true;
            return true;
        }
        if (r1.N == null) {
            Q1 q1Z = r1.z(0);
            r1.G(q1Z, keyEvent);
            boolean zF = r1.F(q1Z, keyEvent.getKeyCode(), keyEvent);
            q1Z.k = false;
            if (zF) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0604ti)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        Xq xq = this.b;
        if (xq != null) {
            View view = i == 0 ? new View(xq.a.j.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        R1 r1 = this.f;
        if (i == 108) {
            r1.A();
            Br br = r1.o;
            if (br != null) {
                br.p(true);
            }
        } else {
            r1.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        R1 r1 = this.f;
        if (i == 108) {
            r1.A();
            Br br = r1.o;
            if (br != null) {
                br.p(false);
                return;
            }
            return;
        }
        if (i != 0) {
            r1.getClass();
            return;
        }
        Q1 q1Z = r1.z(i);
        if (q1Z.m) {
            r1.s(q1Z, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC0739xt.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0604ti menuC0604ti = menu instanceof MenuC0604ti ? (MenuC0604ti) menu : null;
        if (i == 0 && menuC0604ti == null) {
            return false;
        }
        if (menuC0604ti != null) {
            menuC0604ti.x = true;
        }
        Xq xq = this.b;
        if (xq != null && i == 0) {
            Yq yq = xq.a;
            if (!yq.m) {
                yq.j.l = true;
                yq.m = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (menuC0604ti != null) {
            menuC0604ti.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0604ti menuC0604ti = this.f.z(0).h;
        if (menuC0604ti != null) {
            d(list, menuC0604ti, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0677vt.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        boolean z = false;
        int i2 = 2;
        int i3 = 1;
        R1 r1 = this.f;
        if (!r1.z || i != 0) {
            return AbstractC0677vt.b(this.a, callback, i);
        }
        C0296jj c0296jj = new C0296jj(r1.k, callback);
        AbstractC0494q0 abstractC0494q0 = r1.u;
        if (abstractC0494q0 != null) {
            abstractC0494q0.a();
        }
        C0096d2 c0096d2 = new C0096d2(i2, r1, c0296jj, z);
        r1.A();
        Br br = r1.o;
        if (br != null) {
            r1.u = br.q0(c0096d2);
        }
        if (r1.u == null) {
            Ws ws = r1.y;
            if (ws != null) {
                ws.b();
            }
            AbstractC0494q0 abstractC0494q1 = r1.u;
            if (abstractC0494q1 != null) {
                abstractC0494q1.a();
            }
            if (r1.n != null) {
                boolean z2 = r1.R;
            }
            if (r1.v == null) {
                boolean z3 = r1.J;
                Context context = r1.k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        J7 j7 = new J7(context, 0);
                        j7.getTheme().setTo(themeNewTheme);
                        context = j7;
                    }
                    r1.v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    r1.w = popupWindow;
                    Qk.d(popupWindow, 2);
                    r1.w.setContentView(r1.v);
                    r1.w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    r1.v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    r1.w.setHeight(-2);
                    r1.x = new F1(r1, i3);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) r1.B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        r1.A();
                        Br br2 = r1.o;
                        Context contextC = br2 != null ? br2.C() : null;
                        if (contextC != null) {
                            context = contextC;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        r1.v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (r1.v != null) {
                Ws ws2 = r1.y;
                if (ws2 != null) {
                    ws2.b();
                }
                r1.v.e();
                Context context2 = r1.v.getContext();
                ActionBarContextView actionBarContextView = r1.v;
                C0519qp c0519qp = new C0519qp();
                c0519qp.c = context2;
                c0519qp.d = actionBarContextView;
                c0519qp.e = c0096d2;
                MenuC0604ti menuC0604ti = new MenuC0604ti(actionBarContextView.getContext());
                menuC0604ti.l = 1;
                c0519qp.h = menuC0604ti;
                menuC0604ti.e = c0519qp;
                if (((InterfaceC0463p0) c0096d2.b).c(c0519qp, menuC0604ti)) {
                    c0519qp.g();
                    r1.v.c(c0519qp);
                    r1.u = c0519qp;
                    if (r1.A && (viewGroup = r1.B) != null && viewGroup.isLaidOut()) {
                        r1.v.setAlpha(0.0f);
                        Ws wsA = Gs.a(r1.v);
                        wsA.a(1.0f);
                        r1.y = wsA;
                        wsA.d(new H1(r1, i3));
                    } else {
                        r1.v.setAlpha(1.0f);
                        r1.v.setVisibility(0);
                        if (r1.v.getParent() instanceof View) {
                            View view = (View) r1.v.getParent();
                            WeakHashMap weakHashMap = Gs.a;
                            AbstractC0614ts.c(view);
                        }
                    }
                    if (r1.w != null) {
                        r1.l.getDecorView().post(r1.x);
                    }
                } else {
                    r1.u = null;
                }
            }
            r1.I();
            r1.u = r1.u;
        }
        r1.I();
        AbstractC0494q0 abstractC0494q2 = r1.u;
        if (abstractC0494q2 != null) {
            return c0296jj.m(abstractC0494q2);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
