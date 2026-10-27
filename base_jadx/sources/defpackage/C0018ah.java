package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.jcraft.jsch.SftpATTRS;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0018ah implements Co {
    public static final Method A;
    public static final Method B;
    public final Context a;
    public ListAdapter b;
    public C0073ca c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public Xg n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final C0065c2 z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final Wg r = new Wg(this, 1);
    public final Zg s = new Zg(this, 0);
    public final Yg t = new Yg(this);
    public final Wg u = new Wg(this, 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0018ah(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0700wl.o, i, i2);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0065c2 c0065c2 = new C0065c2(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0700wl.s, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            Qk.c(c0065c2, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0065c2.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : F4.F(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.z = c0065c2;
        c0065c2.setInputMethodMode(1);
    }

    @Override // defpackage.Co
    public final boolean a() {
        return this.z.isShowing();
    }

    public final void b(int i) {
        this.f = i;
    }

    public final int c() {
        return this.f;
    }

    @Override // defpackage.Co
    public final void dismiss() {
        C0065c2 c0065c2 = this.z;
        c0065c2.dismiss();
        c0065c2.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    @Override // defpackage.Co
    public final void e() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        C0073ca c0073ca;
        C0073ca c0073ca2 = this.c;
        C0065c2 c0065c2 = this.z;
        Context context = this.a;
        if (c0073ca2 == null) {
            C0073ca c0073caO = o(context, !this.y);
            this.c = c0073caO;
            c0073caO.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new Tg(this));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0065c2.setContentView(this.c);
        }
        Drawable background = c0065c2.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = Ug.a(c0065c2, this.o, this.g, c0065c2.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
            }
            int iA2 = this.c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = this.z.getInputMethodMode() == 2;
        Qk.d(c0065c2, this.h);
        if (c0065c2.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        c0065c2.setWidth(this.e == -1 ? -1 : 0);
                        c0065c2.setHeight(0);
                    } else {
                        c0065c2.setWidth(this.e == -1 ? -1 : 0);
                        c0065c2.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0065c2.setOutsideTouchable(true);
                View view = this.o;
                int i5 = this.f;
                int i6 = this.g;
                if (width < 0) {
                    width = -1;
                }
                c0065c2.update(view, i5, i6, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0065c2.setWidth(width2);
        c0065c2.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(c0065c2, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Vg.b(c0065c2, true);
        }
        c0065c2.setOutsideTouchable(true);
        c0065c2.setTouchInterceptor(this.s);
        if (this.k) {
            Qk.c(c0065c2, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(c0065c2, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            Vg.a(c0065c2, this.x);
        }
        c0065c2.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (c0073ca = this.c) != null) {
            c0073ca.setListSelectionHidden(true);
            c0073ca.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    public final int f() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public final Drawable g() {
        return this.z.getBackground();
    }

    @Override // defpackage.Co
    public final C0073ca i() {
        return this.c;
    }

    public final void k(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.g = i;
        this.i = true;
    }

    public void m(ListAdapter listAdapter) {
        Xg xg = this.n;
        if (xg == null) {
            this.n = new Xg(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(xg);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        C0073ca c0073ca = this.c;
        if (c0073ca != null) {
            c0073ca.setAdapter(this.b);
        }
    }

    public C0073ca o(Context context, boolean z) {
        return new C0073ca(context, z);
    }

    public final void p(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
