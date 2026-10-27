package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0515ql;
import defpackage.AbstractC0614ts;
import defpackage.AbstractComponentCallbacksC0784zc;
import defpackage.Bc;
import defpackage.C0558s3;
import defpackage.Gs;
import defpackage.Jc;
import defpackage.Oc;
import defpackage.Tf;
import defpackage.Vc;
import defpackage.Vo;
import defpackage.Vt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        Tf.j("context", context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515ql.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Tf.j("child", view);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0784zc ? (AbstractComponentCallbacksC0784zc) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        Vt vtG;
        Tf.j("insets", windowInsets);
        Vt vtG2 = Vt.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            Tf.i("onApplyWindowInsetsListe…lyWindowInsets(v, insets)", windowInsetsOnApplyWindowInsets);
            vtG = Vt.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = Gs.a;
            WindowInsets windowInsetsF = vtG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = AbstractC0614ts.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    vtG2 = Vt.g(this, windowInsetsB);
                }
            }
            vtG = vtG2;
        }
        if (!vtG.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = Gs.a;
                WindowInsets windowInsetsF2 = vtG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = AbstractC0614ts.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        Vt.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Tf.j("canvas", canvas);
        if (this.d) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Tf.j("canvas", canvas);
        Tf.j("child", view);
        if (this.d) {
            ArrayList arrayList = this.a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Tf.j("view", view);
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0784zc> F getFragment() {
        AbstractActivityC0495q1 abstractActivityC0495q1;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc;
        Oc ocV;
        View view = this;
        while (true) {
            abstractActivityC0495q1 = null;
            if (view == null) {
                abstractComponentCallbacksC0784zc = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0784zc = tag instanceof AbstractComponentCallbacksC0784zc ? (AbstractComponentCallbacksC0784zc) tag : null;
            if (abstractComponentCallbacksC0784zc != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0784zc == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof AbstractActivityC0495q1) {
                    abstractActivityC0495q1 = (AbstractActivityC0495q1) context;
                    break;
                }
            }
            if (abstractActivityC0495q1 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            ocV = abstractActivityC0495q1.v();
        } else {
            if (!abstractComponentCallbacksC0784zc.p()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0784zc + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            ocV = abstractComponentCallbacksC0784zc.g();
        }
        return (F) ocV.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Tf.j("insets", windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                Tf.i("view", childAt);
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Tf.j("view", view);
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        Tf.i("view", childAt);
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Tf.j("view", view);
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            Tf.i("view", childAt);
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            Tf.i("view", childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Tf.j("listener", onApplyWindowInsetsListener);
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Tf.j("view", view);
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, Oc oc) {
        View view;
        super(context, attributeSet);
        Tf.j("context", context);
        Tf.j("attrs", attributeSet);
        Tf.j("fm", oc);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515ql.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcB = oc.B(id);
        if (classAttribute != null && abstractComponentCallbacksC0784zcB == null) {
            if (id == -1) {
                throw new IllegalStateException(Vo.g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Jc jcD = oc.D();
            context.getClassLoader();
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcA = jcD.a(classAttribute);
            Tf.i("fm.fragmentFactory.insta…ontext.classLoader, name)", abstractComponentCallbacksC0784zcA);
            abstractComponentCallbacksC0784zcA.C = true;
            Bc bc = abstractComponentCallbacksC0784zcA.s;
            if ((bc == null ? null : bc.j) != null) {
                abstractComponentCallbacksC0784zcA.C = true;
            }
            C0558s3 c0558s3 = new C0558s3(oc);
            c0558s3.o = true;
            abstractComponentCallbacksC0784zcA.D = this;
            c0558s3.e(getId(), abstractComponentCallbacksC0784zcA, string, 1);
            if (!c0558s3.g) {
                c0558s3.p.z(c0558s3, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (Vc vc : oc.c.o()) {
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
            if (abstractComponentCallbacksC0784zc.w == getId() && (view = abstractComponentCallbacksC0784zc.E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0784zc.D = this;
                vc.b();
            }
        }
    }
}
