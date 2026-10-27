package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: renamed from: x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711x1 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ C0711x1(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable drawableA = S6.a(compoundButton);
        if (drawableA != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.c) {
                    O9.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    O9.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.c) {
                    O9.h(drawableMutate, (ColorStateList) this.a);
                }
                if (this.d) {
                    O9.i(drawableMutate, (PorterDuff.Mode) this.b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = (Bundle) this.a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.a;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.a = null;
        }
        return bundle2;
    }

    public InterfaceC0702wn d() {
        String str;
        InterfaceC0702wn interfaceC0702wn;
        Iterator it = ((C0455on) this.f).iterator();
        do {
            C0331kn c0331kn = (C0331kn) it;
            if (!c0331kn.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0331kn.next();
            Tf.i("components", entry);
            str = (String) entry.getKey();
            interfaceC0702wn = (InterfaceC0702wn) entry.getValue();
        } while (!Tf.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0702wn;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0700wl.m;
        K2 k2G = K2.G(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) k2G.b;
        Gs.i(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) k2G.b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(F4.F(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(F4.F(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(F4.F(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                R6.c(compoundButton, k2G.p(2));
            }
            if (typedArray.hasValue(3)) {
                R6.d(compoundButton, W9.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            k2G.J();
        }
    }

    public void f(String str, InterfaceC0702wn interfaceC0702wn) {
        Object obj;
        Tf.j("key", str);
        Tf.j("provider", interfaceC0702wn);
        C0455on c0455on = (C0455on) this.f;
        C0362ln c0362lnA = c0455on.a(str);
        if (c0362lnA != null) {
            obj = c0362lnA.b;
        } else {
            C0362ln c0362ln = new C0362ln(str, interfaceC0702wn);
            c0455on.d++;
            C0362ln c0362ln2 = c0455on.b;
            if (c0362ln2 == null) {
                c0455on.a = c0362ln;
                c0455on.b = c0362ln;
            } else {
                c0362ln2.c = c0362ln;
                c0362ln.d = c0362ln2;
                c0455on.b = c0362ln;
            }
            obj = null;
        }
        if (((InterfaceC0702wn) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public void g() {
        if (!this.e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C0433o1 c0433o1 = (C0433o1) this.b;
        if (c0433o1 == null) {
            c0433o1 = new C0433o1(this);
        }
        this.b = c0433o1;
        try {
            C0479pg.class.getDeclaredConstructor(null);
            C0433o1 c0433o2 = (C0433o1) this.b;
            if (c0433o2 != null) {
                ((LinkedHashSet) c0433o2.b).add(C0479pg.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0479pg.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public C0711x1() {
        this.f = new C0455on();
        this.e = true;
    }
}
