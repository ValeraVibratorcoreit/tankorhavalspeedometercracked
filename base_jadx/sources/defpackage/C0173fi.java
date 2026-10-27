package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0173fi extends Drawable.ConstantState {
    public C0487po a;
    public C0565sa b;
    public ColorStateList c;
    public ColorStateList d;
    public final ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public final float o;
    public final int p;
    public int q;
    public int r;
    public final int s;
    public final boolean t;
    public final Paint.Style u;

    public C0173fi(C0487po c0487po) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = c0487po;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0204gi c0204gi = new C0204gi(this);
        c0204gi.e = true;
        return c0204gi;
    }

    public C0173fi(C0173fi c0173fi) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = c0173fi.a;
        this.b = c0173fi.b;
        this.k = c0173fi.k;
        this.c = c0173fi.c;
        this.d = c0173fi.d;
        this.g = c0173fi.g;
        this.f = c0173fi.f;
        this.l = c0173fi.l;
        this.i = c0173fi.i;
        this.r = c0173fi.r;
        this.p = c0173fi.p;
        this.t = c0173fi.t;
        this.j = c0173fi.j;
        this.m = c0173fi.m;
        this.n = c0173fi.n;
        this.o = c0173fi.o;
        this.q = c0173fi.q;
        this.s = c0173fi.s;
        this.e = c0173fi.e;
        this.u = c0173fi.u;
        if (c0173fi.h != null) {
            this.h = new Rect(c0173fi.h);
        }
    }
}
