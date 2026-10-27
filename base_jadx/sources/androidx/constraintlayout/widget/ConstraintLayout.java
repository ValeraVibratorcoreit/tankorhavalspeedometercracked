package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.jcraft.jsch.SftpATTRS;
import defpackage.AbstractC0284j7;
import defpackage.AbstractC0315k7;
import defpackage.AbstractC0422nl;
import defpackage.AbstractC0615tt;
import defpackage.AbstractC0662ve;
import defpackage.AbstractC0717x7;
import defpackage.Bo;
import defpackage.C0068c5;
import defpackage.C0075cc;
import defpackage.C0096d2;
import defpackage.C0138ee;
import defpackage.C0169fe;
import defpackage.C0336ks;
import defpackage.C0346l7;
import defpackage.C0377m7;
import defpackage.C0408n7;
import defpackage.C0624u7;
import defpackage.C0655v7;
import defpackage.C0686w7;
import defpackage.C0693we;
import defpackage.F5;
import defpackage.K2;
import defpackage.Qg;
import defpackage.Tf;
import defpackage.W8;
import defpackage.X3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static Bo r;
    public final SparseArray a;
    public final ArrayList b;
    public final C0686w7 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public C0624u7 j;
    public C0096d2 k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final C0377m7 o;
    public int p;
    public int q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new C0686w7();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new C0377m7(this, this);
        this.p = 0;
        this.q = 0;
        h(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static Bo getSharedValues() {
        if (r == null) {
            Bo bo = new Bo();
            new SparseIntArray();
            new HashMap();
            r = bo;
        }
        return r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0346l7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0284j7) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    public final C0655v7 g(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0346l7) {
            return ((C0346l7) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0346l7) {
            return ((C0346l7) view.getLayoutParams()).p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0346l7(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0346l7 c0346l7 = new C0346l7(context, attributeSet);
        c0346l7.a = -1;
        c0346l7.b = -1;
        c0346l7.c = -1.0f;
        c0346l7.d = true;
        c0346l7.e = -1;
        c0346l7.f = -1;
        c0346l7.g = -1;
        c0346l7.h = -1;
        c0346l7.i = -1;
        c0346l7.j = -1;
        c0346l7.k = -1;
        c0346l7.l = -1;
        c0346l7.m = -1;
        c0346l7.n = -1;
        c0346l7.o = -1;
        c0346l7.p = -1;
        c0346l7.q = 0;
        c0346l7.r = 0.0f;
        c0346l7.s = -1;
        c0346l7.t = -1;
        c0346l7.u = -1;
        c0346l7.v = -1;
        c0346l7.w = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.x = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.z = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.B = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.C = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.D = 0;
        c0346l7.E = 0.5f;
        c0346l7.F = 0.5f;
        c0346l7.G = null;
        c0346l7.H = -1.0f;
        c0346l7.I = -1.0f;
        c0346l7.J = 0;
        c0346l7.K = 0;
        c0346l7.L = 0;
        c0346l7.M = 0;
        c0346l7.N = 0;
        c0346l7.O = 0;
        c0346l7.P = 0;
        c0346l7.Q = 0;
        c0346l7.R = 1.0f;
        c0346l7.S = 1.0f;
        c0346l7.T = -1;
        c0346l7.U = -1;
        c0346l7.V = -1;
        c0346l7.W = false;
        c0346l7.X = false;
        c0346l7.Y = null;
        c0346l7.Z = 0;
        c0346l7.a0 = true;
        c0346l7.b0 = true;
        c0346l7.c0 = false;
        c0346l7.d0 = false;
        c0346l7.e0 = false;
        c0346l7.f0 = -1;
        c0346l7.g0 = -1;
        c0346l7.h0 = -1;
        c0346l7.i0 = -1;
        c0346l7.j0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.k0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.l0 = 0.5f;
        c0346l7.p0 = new C0655v7();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0422nl.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0315k7.a.get(index);
            switch (i2) {
                case 1:
                    c0346l7.V = typedArrayObtainStyledAttributes.getInt(index, c0346l7.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.p);
                    c0346l7.p = resourceId;
                    if (resourceId == -1) {
                        c0346l7.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0346l7.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0346l7.r) % 360.0f;
                    c0346l7.r = f;
                    if (f < 0.0f) {
                        c0346l7.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0346l7.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0346l7.a);
                    break;
                case 6:
                    c0346l7.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0346l7.b);
                    break;
                case 7:
                    c0346l7.c = typedArrayObtainStyledAttributes.getFloat(index, c0346l7.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.e);
                    c0346l7.e = resourceId2;
                    if (resourceId2 == -1) {
                        c0346l7.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.f);
                    c0346l7.f = resourceId3;
                    if (resourceId3 == -1) {
                        c0346l7.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.g);
                    c0346l7.g = resourceId4;
                    if (resourceId4 == -1) {
                        c0346l7.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.h);
                    c0346l7.h = resourceId5;
                    if (resourceId5 == -1) {
                        c0346l7.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.i);
                    c0346l7.i = resourceId6;
                    if (resourceId6 == -1) {
                        c0346l7.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.j);
                    c0346l7.j = resourceId7;
                    if (resourceId7 == -1) {
                        c0346l7.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.k);
                    c0346l7.k = resourceId8;
                    if (resourceId8 == -1) {
                        c0346l7.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.l);
                    c0346l7.l = resourceId9;
                    if (resourceId9 == -1) {
                        c0346l7.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.m);
                    c0346l7.m = resourceId10;
                    if (resourceId10 == -1) {
                        c0346l7.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.s);
                    c0346l7.s = resourceId11;
                    if (resourceId11 == -1) {
                        c0346l7.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.t);
                    c0346l7.t = resourceId12;
                    if (resourceId12 == -1) {
                        c0346l7.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.u);
                    c0346l7.u = resourceId13;
                    if (resourceId13 == -1) {
                        c0346l7.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.v);
                    c0346l7.v = resourceId14;
                    if (resourceId14 == -1) {
                        c0346l7.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c0346l7.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.w);
                    break;
                case 22:
                    c0346l7.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.x);
                    break;
                case 23:
                    c0346l7.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.y);
                    break;
                case 24:
                    c0346l7.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.z);
                    break;
                case 25:
                    c0346l7.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.A);
                    break;
                case 26:
                    c0346l7.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.B);
                    break;
                case 27:
                    c0346l7.W = typedArrayObtainStyledAttributes.getBoolean(index, c0346l7.W);
                    break;
                case 28:
                    c0346l7.X = typedArrayObtainStyledAttributes.getBoolean(index, c0346l7.X);
                    break;
                case 29:
                    c0346l7.E = typedArrayObtainStyledAttributes.getFloat(index, c0346l7.E);
                    break;
                case 30:
                    c0346l7.F = typedArrayObtainStyledAttributes.getFloat(index, c0346l7.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0346l7.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0346l7.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c0346l7.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0346l7.N) == -2) {
                            c0346l7.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c0346l7.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0346l7.P) == -2) {
                            c0346l7.P = -2;
                        }
                    }
                    break;
                case 35:
                    c0346l7.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0346l7.R));
                    c0346l7.L = 2;
                    break;
                case 36:
                    try {
                        c0346l7.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0346l7.O) == -2) {
                            c0346l7.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0346l7.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0346l7.Q) == -2) {
                            c0346l7.Q = -2;
                        }
                    }
                    break;
                case 38:
                    c0346l7.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0346l7.S));
                    c0346l7.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C0624u7.k(c0346l7, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0346l7.H = typedArrayObtainStyledAttributes.getFloat(index, c0346l7.H);
                            break;
                        case 46:
                            c0346l7.I = typedArrayObtainStyledAttributes.getFloat(index, c0346l7.I);
                            break;
                        case 47:
                            c0346l7.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0346l7.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0346l7.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0346l7.T);
                            break;
                        case 50:
                            c0346l7.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0346l7.U);
                            break;
                        case 51:
                            c0346l7.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.n);
                            c0346l7.n = resourceId15;
                            if (resourceId15 == -1) {
                                c0346l7.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c0346l7.o);
                            c0346l7.o = resourceId16;
                            if (resourceId16 == -1) {
                                c0346l7.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c0346l7.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.D);
                            break;
                        case 55:
                            c0346l7.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0346l7.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C0624u7.j(c0346l7, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C0624u7.j(c0346l7, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0346l7.Z = typedArrayObtainStyledAttributes.getInt(index, c0346l7.Z);
                                    break;
                                case 67:
                                    c0346l7.d = typedArrayObtainStyledAttributes.getBoolean(index, c0346l7.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0346l7.a();
        return c0346l7;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0686w7 c0686w7 = this.c;
        if (c0686w7.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0686w7.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0686w7.j = "parent";
            }
        }
        if (c0686w7.h0 == null) {
            c0686w7.h0 = c0686w7.j;
            Log.v("ConstraintLayout", " setDebugName " + c0686w7.h0);
        }
        for (C0655v7 c0655v7 : c0686w7.q0) {
            View view = (View) c0655v7.f0;
            if (view != null) {
                if (c0655v7.j == null && (id = view.getId()) != -1) {
                    c0655v7.j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0655v7.h0 == null) {
                    c0655v7.h0 = c0655v7.j;
                    Log.v("ConstraintLayout", " setDebugName " + c0655v7.h0);
                }
            }
        }
        c0686w7.n(sb);
        return sb.toString();
    }

    public final void h(AttributeSet attributeSet, int i) {
        C0686w7 c0686w7 = this.c;
        c0686w7.f0 = this;
        C0377m7 c0377m7 = this.o;
        c0686w7.u0 = c0377m7;
        c0686w7.s0.f = c0377m7;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0422nl.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0624u7 c0624u7 = new C0624u7();
                        this.j = c0624u7;
                        c0624u7.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0686w7.D0 = this.i;
        Qg.p = c0686w7.W(512);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void i(int i) {
        Context context = getContext();
        C0096d2 c0096d2 = new C0096d2(9);
        c0096d2.b = new SparseArray();
        c0096d2.c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0068c5 c0068c5 = null;
            while (true) {
                byte b = 1;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 80204913:
                                if (!name.equals("State")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b = -1;
                                }
                                break;
                            case 1657696882:
                                if (!name.equals("layoutDescription")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case 1901439077:
                                if (!name.equals("Variant")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 2) {
                            c0068c5 = new C0068c5(context, xml);
                            ((SparseArray) c0096d2.b).put(c0068c5.a, c0068c5);
                        } else if (b == 3) {
                            C0408n7 c0408n7 = new C0408n7(context, xml);
                            if (c0068c5 != null) {
                                ((ArrayList) c0068c5.c).add(c0408n7);
                            }
                        } else if (b == 4) {
                            c0096d2.S(context, xml);
                        }
                    }
                    eventType = xml.next();
                }
                this.k = c0096d2;
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x0306  */
    /* JADX WARN: Code duplicated, block: B:163:0x0309  */
    /* JADX WARN: Code duplicated, block: B:168:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0348  */
    /* JADX WARN: Code duplicated, block: B:287:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:404:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x04d5 A[SYNTHETIC] */
    public final void j(C0686w7 c0686w7, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        int i5;
        boolean z;
        C0377m7 c0377m7;
        int i6;
        int i7;
        boolean zT;
        ArrayList arrayList;
        int i8;
        C0377m7 c0377m8;
        C0377m7 c0377m9;
        boolean z2;
        C0693we c0693we;
        C0336ks c0336ks;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        boolean z3;
        Iterator it;
        boolean z4;
        AbstractC0615tt abstractC0615tt;
        C0686w7 c0686w8 = c0686w7;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i15 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C0377m7 c0377m10 = this.o;
        c0377m10.b = iMax3;
        c0377m10.c = iMax4;
        c0377m10.d = paddingWidth;
        c0377m10.e = i15;
        c0377m10.f = i2;
        c0377m10.g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i16 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i17 = size - paddingWidth;
        int i18 = size2 - i15;
        int i19 = c0377m10.e;
        int i20 = c0377m10.d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.d);
                iMin = iMax;
            } else {
                iMin = i17;
            }
            i16 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.d);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i16 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f - i20, i17);
            i16 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
                iMin2 = iMax2;
            } else {
                iMin2 = i18;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.g - i19, i18);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iQ = c0686w7.q();
        W8 w8 = c0686w8.s0;
        int i21 = iMin;
        if (i21 != iQ || iMin2 != c0686w7.k()) {
            w8.c = true;
        }
        c0686w8.Y = 0;
        c0686w8.Z = 0;
        int i22 = this.f - i20;
        int[] iArr2 = c0686w8.C;
        iArr2[0] = i22;
        iArr2[1] = this.g - i19;
        c0686w8.b0 = 0;
        c0686w8.c0 = 0;
        c0686w8.M(i16);
        c0686w8.O(i21);
        c0686w8.N(i4);
        c0686w8.L(iMin2);
        int i23 = this.d - i20;
        if (i23 < 0) {
            c0686w8.b0 = 0;
        } else {
            c0686w8.b0 = i23;
        }
        int i24 = this.e - i19;
        if (i24 < 0) {
            c0686w8.c0 = 0;
        } else {
            c0686w8.c0 = i24;
        }
        c0686w8.x0 = iMax5;
        c0686w8.y0 = iMax3;
        K2 k2 = c0686w8.r0;
        k2.getClass();
        C0377m7 c0377m11 = c0686w8.u0;
        int size3 = c0686w8.q0.size();
        int iQ2 = c0686w7.q();
        int iK = c0686w7.k();
        boolean zP = Tf.p(i, 128);
        boolean z5 = zP || Tf.p(i, 64);
        if (z5) {
            int i25 = 0;
            while (true) {
                if (i25 < size3) {
                    C0655v7 c0655v7 = (C0655v7) c0686w8.q0.get(i25);
                    int[] iArr3 = c0655v7.p0;
                    boolean z6 = (iArr3[0] == 3) && (iArr3[1] == 3) && c0655v7.W > 0.0f;
                    if ((c0655v7.x() && z6) || ((c0655v7.y() && z6) || (c0655v7 instanceof C0075cc) || c0655v7.x() || c0655v7.y())) {
                        i5 = 1073741824;
                        z5 = false;
                    } else {
                        i25++;
                    }
                } else {
                    i5 = 1073741824;
                }
            }
        } else {
            i5 = 1073741824;
        }
        boolean z7 = ((mode == i5 && mode2 == i5) || zP) & z5;
        if (z7) {
            int iMin3 = Math.min(iArr2[0], i17);
            int iMin4 = Math.min(iArr2[1], i18);
            if (mode == 1073741824 && c0686w7.q() != iMin3) {
                c0686w8.O(iMin3);
                c0686w8.s0.b = true;
            }
            if (mode2 == 1073741824 && c0686w7.k() != iMin4) {
                c0686w8.L(iMin4);
                c0686w8.s0.b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z8 = w8.b;
                C0686w7 c0686w9 = w8.a;
                if (z8 || w8.c) {
                    for (C0655v7 c0655v8 : c0686w9.q0) {
                        c0655v8.h();
                        c0655v8.a = false;
                        c0655v8.d.n();
                        c0655v8.e.m();
                    }
                    i11 = 0;
                    c0686w9.h();
                    c0686w9.a = false;
                    c0686w9.d.n();
                    c0686w9.e.m();
                    w8.c = false;
                } else {
                    i11 = 0;
                }
                w8.b(w8.d);
                c0686w9.Y = i11;
                c0686w9.Z = i11;
                int iJ = c0686w9.j(i11);
                int iJ2 = c0686w9.j(1);
                if (w8.b) {
                    w8.c();
                }
                int iR = c0686w9.r();
                int iS = c0686w9.s();
                z = z7;
                c0686w9.d.h.d(iR);
                c0686w9.e.h.d(iS);
                w8.g();
                ArrayList<AbstractC0615tt> arrayList2 = w8.e;
                c0377m7 = c0377m11;
                if (iJ == 2 || iJ2 == 2) {
                    if (zP) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((AbstractC0615tt) it2.next()).k()) {
                                zP = false;
                                break;
                            }
                        }
                    }
                    if (zP && iJ == 2) {
                        c0686w9.M(1);
                        c0686w9.O(w8.d(c0686w9, 0));
                        c0686w9.d.e.d(c0686w9.q());
                    }
                    if (zP && iJ2 == 2) {
                        i12 = 1;
                        c0686w9.N(1);
                        c0686w9.L(w8.d(c0686w9, 1));
                        c0686w9.e.e.d(c0686w9.k());
                    }
                    iArr = c0686w9.p0;
                    i6 = iK;
                    i13 = iArr[0];
                    if (i13 != i12 || i13 == 4) {
                        int iQ3 = c0686w9.q() + iR;
                        c0686w9.d.i.d(iQ3);
                        c0686w9.d.e.d(iQ3 - iR);
                        w8.g();
                        i14 = iArr[1];
                        if (i14 != 1 || i14 == 4) {
                            int iK2 = c0686w9.k() + iS;
                            c0686w9.e.i.d(iK2);
                            c0686w9.e.e.d(iK2 - iS);
                        }
                        w8.g();
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    for (AbstractC0615tt abstractC0615tt2 : arrayList2) {
                        if (abstractC0615tt2.b == c0686w9 || abstractC0615tt2.g) {
                            abstractC0615tt2.e();
                        }
                    }
                    it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z4 = true;
                            break;
                        }
                        abstractC0615tt = (AbstractC0615tt) it.next();
                        if (!z3 || abstractC0615tt.b != c0686w9) {
                            if (abstractC0615tt.h.j || ((!abstractC0615tt.i.j && !(abstractC0615tt instanceof C0169fe)) || (!abstractC0615tt.e.j && !(abstractC0615tt instanceof F5) && !(abstractC0615tt instanceof C0169fe)))) {
                                z4 = false;
                                break;
                            }
                        }
                    }
                    c0686w9.M(iJ);
                    c0686w9.N(iJ2);
                    zT = z4;
                    i10 = 1073741824;
                    i7 = 2;
                } else {
                    iQ2 = iQ2;
                }
                i12 = 1;
                iArr = c0686w9.p0;
                i6 = iK;
                i13 = iArr[0];
                if (i13 != i12) {
                    int iQ4 = c0686w9.q() + iR;
                    c0686w9.d.i.d(iQ4);
                    c0686w9.d.e.d(iQ4 - iR);
                    w8.g();
                    i14 = iArr[1];
                    if (i14 != 1) {
                        int iK3 = c0686w9.k() + iS;
                        c0686w9.e.i.d(iK3);
                        c0686w9.e.e.d(iK3 - iS);
                    } else {
                        int iK4 = c0686w9.k() + iS;
                        c0686w9.e.i.d(iK4);
                        c0686w9.e.e.d(iK4 - iS);
                    }
                    w8.g();
                    z3 = true;
                } else {
                    int iQ5 = c0686w9.q() + iR;
                    c0686w9.d.i.d(iQ5);
                    c0686w9.d.e.d(iQ5 - iR);
                    w8.g();
                    i14 = iArr[1];
                    if (i14 != 1) {
                        int iK5 = c0686w9.k() + iS;
                        c0686w9.e.i.d(iK5);
                        c0686w9.e.e.d(iK5 - iS);
                    } else {
                        int iK6 = c0686w9.k() + iS;
                        c0686w9.e.i.d(iK6);
                        c0686w9.e.e.d(iK6 - iS);
                    }
                    w8.g();
                    z3 = true;
                }
                while (r8.hasNext()) {
                    if (abstractC0615tt2.b == c0686w9) {
                    }
                    abstractC0615tt2.e();
                }
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z4 = true;
                        break;
                    }
                    abstractC0615tt = (AbstractC0615tt) it.next();
                    if (!z3) {
                    }
                    if (abstractC0615tt.h.j) {
                    }
                    z4 = false;
                    break;
                }
                c0686w9.M(iJ);
                c0686w9.N(iJ2);
                zT = z4;
                i10 = 1073741824;
                i7 = 2;
            } else {
                z = z7;
                c0377m7 = c0377m11;
                iQ2 = iQ2;
                i6 = iK;
                boolean z9 = w8.b;
                C0686w7 c0686w10 = w8.a;
                if (z9) {
                    for (C0655v7 c0655v9 : c0686w10.q0) {
                        c0655v9.h();
                        c0655v9.a = false;
                        C0693we c0693we2 = c0655v9.d;
                        c0693we2.e.j = false;
                        c0693we2.g = false;
                        c0693we2.n();
                        C0336ks c0336ks2 = c0655v9.e;
                        c0336ks2.e.j = false;
                        c0336ks2.g = false;
                        c0336ks2.m();
                    }
                    i9 = 0;
                    c0686w10.h();
                    c0686w10.a = false;
                    C0693we c0693we3 = c0686w10.d;
                    c0693we3.e.j = false;
                    c0693we3.g = false;
                    c0693we3.n();
                    C0336ks c0336ks3 = c0686w10.e;
                    c0336ks3.e.j = false;
                    c0336ks3.g = false;
                    c0336ks3.m();
                    w8.c();
                } else {
                    i9 = 0;
                }
                w8.b(w8.d);
                c0686w10.Y = i9;
                c0686w10.Z = i9;
                c0686w10.d.h.d(i9);
                c0686w10.e.h.d(i9);
                i10 = 1073741824;
                if (mode == 1073741824) {
                    zT = c0686w8.T(i9, zP);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= c0686w8.T(1, zP);
                    i7++;
                }
            }
            if (zT) {
                c0686w8.P(mode == i10, mode2 == i10);
            }
        } else {
            z = z7;
            c0377m7 = c0377m11;
            iQ2 = iQ2;
            i6 = iK;
            i7 = 0;
            zT = false;
        }
        if (zT && i7 == 2) {
            return;
        }
        int i26 = c0686w8.D0;
        if (size3 > 0) {
            int size4 = c0686w8.q0.size();
            boolean zW = c0686w8.W(64);
            C0377m7 c0377m12 = c0686w8.u0;
            for (int i27 = 0; i27 < size4; i27++) {
                C0655v7 c0655v10 = (C0655v7) c0686w8.q0.get(i27);
                if (!(c0655v10 instanceof C0138ee) && !(c0655v10 instanceof X3) && !c0655v10.F && (!zW || (c0693we = c0655v10.d) == null || (c0336ks = c0655v10.e) == null || !c0693we.e.j || !c0336ks.e.j)) {
                    int iJ3 = c0655v10.j(0);
                    int iJ4 = c0655v10.j(1);
                    boolean z10 = iJ3 == 3 && c0655v10.r != 1 && iJ4 == 3 && c0655v10.s != 1;
                    if (!z10 && c0686w8.W(1) && !(c0655v10 instanceof C0075cc)) {
                        if (iJ3 == 3 && c0655v10.r == 0 && iJ4 != 3 && !c0655v10.x()) {
                            z10 = true;
                        }
                        if (iJ4 == 3 && c0655v10.s == 0 && iJ3 != 3 && !c0655v10.x()) {
                            z10 = true;
                        }
                        if (iJ3 == 3 || iJ4 == 3) {
                            if (c0655v10.W > 0.0f) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            k2.F(0, c0377m12, c0655v10);
                        }
                    }
                    if (z10) {
                        k2.F(0, c0377m12, c0655v10);
                    }
                }
            }
            ConstraintLayout constraintLayout = c0377m12.a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i28 = 0; i28 < childCount2; i28++) {
                constraintLayout.getChildAt(i28);
            }
            ArrayList arrayList3 = constraintLayout.b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i29 = 0; i29 < size5; i29++) {
                    ((AbstractC0284j7) arrayList3.get(i29)).getClass();
                }
            }
        }
        k2.Q(c0686w8);
        ArrayList arrayList4 = (ArrayList) k2.b;
        int size6 = arrayList4.size();
        int i30 = iQ2;
        int i31 = i6;
        if (size3 > 0) {
            k2.K(c0686w8, 0, i30, i31);
        }
        if (size6 > 0) {
            int[] iArr4 = c0686w8.p0;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iQ6 = c0686w7.q();
            C0686w7 c0686w11 = (C0686w7) k2.d;
            int iMax7 = Math.max(iQ6, c0686w11.b0);
            int iMax8 = Math.max(c0686w7.k(), c0686w11.c0);
            int i32 = 0;
            boolean z13 = false;
            while (i32 < size6) {
                C0655v7 c0655v11 = (C0655v7) arrayList4.get(i32);
                if (c0655v11 instanceof C0075cc) {
                    int iQ7 = c0655v11.q();
                    int iK7 = c0655v11.k();
                    c0377m9 = c0377m7;
                    boolean zF = z13 | k2.F(1, c0377m9, c0655v11);
                    int iQ8 = c0655v11.q();
                    int iK8 = c0655v11.k();
                    if (iQ8 != iQ7) {
                        c0655v11.O(iQ8);
                        if (z11 && c0655v11.r() + c0655v11.U > iMax7) {
                            iMax7 = Math.max(iMax7, c0655v11.i(4).e() + c0655v11.r() + c0655v11.U);
                        }
                        z2 = true;
                    } else {
                        z2 = zF;
                    }
                    if (iK8 != iK7) {
                        c0655v11.L(iK8);
                        if (z12 && c0655v11.s() + c0655v11.V > iMax8) {
                            iMax8 = Math.max(iMax8, c0655v11.i(5).e() + c0655v11.s() + c0655v11.V);
                        }
                        z2 = true;
                    }
                    z13 = ((C0075cc) c0655v11).y0 | z2;
                } else {
                    c0377m9 = c0377m7;
                }
                i32++;
                c0377m7 = c0377m9;
                i26 = i26;
            }
            int i33 = i26;
            C0377m7 c0377m13 = c0377m7;
            int i34 = 0;
            while (i34 < 2) {
                int i35 = 0;
                while (i35 < size6) {
                    C0655v7 c0655v12 = (C0655v7) arrayList4.get(i35);
                    if (((c0655v12 instanceof AbstractC0662ve) && !(c0655v12 instanceof C0075cc)) || (c0655v12 instanceof C0138ee) || c0655v12.g0 == 8 || ((z && c0655v12.d.e.j && c0655v12.e.e.j) || (c0655v12 instanceof C0075cc))) {
                        c0377m8 = c0377m13;
                        arrayList = arrayList4;
                        i8 = size6;
                    } else {
                        int iQ9 = c0655v12.q();
                        int iK9 = c0655v12.k();
                        arrayList = arrayList4;
                        int i36 = c0655v12.a0;
                        i8 = size6;
                        boolean zF2 = k2.F(i34 == 1 ? 2 : 1, c0377m13, c0655v12) | z13;
                        int iQ10 = c0655v12.q();
                        c0377m8 = c0377m13;
                        int iK10 = c0655v12.k();
                        if (iQ10 != iQ9) {
                            c0655v12.O(iQ10);
                            if (z11 && c0655v12.r() + c0655v12.U > iMax7) {
                                iMax7 = Math.max(iMax7, c0655v12.i(4).e() + c0655v12.r() + c0655v12.U);
                            }
                            zF2 = true;
                        }
                        if (iK10 != iK9) {
                            c0655v12.L(iK10);
                            if (z12 && c0655v12.s() + c0655v12.V > iMax8) {
                                iMax8 = Math.max(iMax8, c0655v12.i(5).e() + c0655v12.s() + c0655v12.V);
                            }
                            zF2 = true;
                        }
                        z13 = (!c0655v12.E || i36 == c0655v12.a0) ? zF2 : true;
                    }
                    i35++;
                    arrayList4 = arrayList;
                    size6 = i8;
                    c0377m13 = c0377m8;
                }
                C0377m7 c0377m14 = c0377m13;
                ArrayList arrayList5 = arrayList4;
                int i37 = size6;
                if (!z13) {
                    break;
                }
                i34++;
                k2.K(c0686w7, i34, i30, i31);
                c0377m13 = c0377m14;
                arrayList4 = arrayList5;
                size6 = i37;
                z13 = false;
            }
            c0686w8 = c0686w7;
            i26 = i33;
        }
        c0686w8.D0 = i26;
        Qg.p = c0686w8.W(512);
    }

    public final void k(C0655v7 c0655v7, C0346l7 c0346l7, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        C0655v7 c0655v8 = (C0655v7) sparseArray.get(i);
        if (c0655v8 == null || view == null || !(view.getLayoutParams() instanceof C0346l7)) {
            return;
        }
        c0346l7.c0 = true;
        if (i2 == 6) {
            C0346l7 c0346l8 = (C0346l7) view.getLayoutParams();
            c0346l8.c0 = true;
            c0346l8.p0.E = true;
        }
        c0655v7.i(6).b(c0655v8.i(i2), c0346l7.D, c0346l7.C, true);
        c0655v7.E = true;
        c0655v7.i(3).j();
        c0655v7.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0346l7 c0346l7 = (C0346l7) childAt.getLayoutParams();
            C0655v7 c0655v7 = c0346l7.p0;
            if (childAt.getVisibility() != 8 || c0346l7.d0 || c0346l7.e0 || zIsInEditMode) {
                int iR = c0655v7.r();
                int iS = c0655v7.s();
                childAt.layout(iR, iS, c0655v7.q() + iR, c0655v7.k() + iS);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0284j7) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:161:0x0300  */
    /* JADX WARN: Code duplicated, block: B:162:0x0312  */
    /* JADX WARN: Code duplicated, block: B:168:0x0333  */
    /* JADX WARN: Code duplicated, block: B:170:0x033d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:178:0x0377  */
    /* JADX WARN: Code duplicated, block: B:180:0x0381  */
    /* JADX WARN: Code duplicated, block: B:181:0x0395  */
    /* JADX WARN: Code duplicated, block: B:188:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:190:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:192:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:195:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:198:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:275:0x051a  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        C0655v7 c0655v7;
        int i5;
        int i6;
        C0655v7 c0655v8;
        int i7;
        int i8;
        C0655v7 c0655v9;
        int i9;
        C0346l7 c0346l7;
        int i10;
        int i11;
        float f;
        C0655v7 c0655v10;
        C0655v7 c0655v11;
        C0655v7 c0655v12;
        int i12;
        int i13;
        int i14;
        float fAbs;
        int i15;
        ArrayList arrayList;
        C0655v7 c0655v13;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.p == i) {
            int i16 = constraintLayout.q;
        }
        int i17 = 0;
        if (!constraintLayout.h) {
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                if (constraintLayout.getChildAt(i18).isLayoutRequested()) {
                    constraintLayout.h = true;
                    break;
                }
            }
        }
        constraintLayout.p = i;
        constraintLayout.q = i2;
        boolean z2 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0686w7 c0686w7 = constraintLayout.c;
        c0686w7.v0 = z2;
        if (constraintLayout.h) {
            constraintLayout.h = false;
            int childCount2 = getChildCount();
            int i19 = 0;
            while (true) {
                if (i19 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i19).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i19++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i20 = 0; i20 < childCount3; i20++) {
                    C0655v7 c0655v7G = constraintLayout.g(constraintLayout.getChildAt(i20));
                    if (c0655v7G != null) {
                        c0655v7G.C();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i21 = 0; i21 < childCount3; i21++) {
                        View childAt = constraintLayout.getChildAt(i21);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.m == null) {
                                    constraintLayout.m = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) constraintLayout.a.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                c0655v13 = viewFindViewById == constraintLayout ? c0686w7 : viewFindViewById == null ? null : ((C0346l7) viewFindViewById.getLayoutParams()).p0;
                            }
                            c0655v13.h0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.l != -1) {
                    for (int i22 = 0; i22 < childCount3; i22++) {
                        constraintLayout.getChildAt(i22).getId();
                    }
                }
                C0624u7 c0624u7 = constraintLayout.j;
                if (c0624u7 != null) {
                    c0624u7.a(constraintLayout);
                }
                c0686w7.q0.clear();
                ArrayList arrayList2 = constraintLayout.b;
                int size = arrayList2.size();
                if (size > 0) {
                    int i23 = 0;
                    while (i23 < size) {
                        AbstractC0284j7 abstractC0284j7 = (AbstractC0284j7) arrayList2.get(i23);
                        if (abstractC0284j7.isInEditMode()) {
                            abstractC0284j7.setIds(abstractC0284j7.e);
                        }
                        AbstractC0662ve abstractC0662ve = abstractC0284j7.d;
                        if (abstractC0662ve == null) {
                            arrayList = arrayList2;
                        } else {
                            abstractC0662ve.r0 = i17;
                            Arrays.fill(abstractC0662ve.q0, obj);
                            int i24 = i17;
                            while (i24 < abstractC0284j7.b) {
                                int i25 = abstractC0284j7.a[i24];
                                View view = (View) constraintLayout.a.get(i25);
                                if (view == null) {
                                    Integer numValueOf2 = Integer.valueOf(i25);
                                    HashMap map = abstractC0284j7.g;
                                    String str = (String) map.get(numValueOf2);
                                    int iF = abstractC0284j7.f(constraintLayout, str);
                                    if (iF != 0) {
                                        abstractC0284j7.a[i24] = iF;
                                        map.put(Integer.valueOf(iF), str);
                                        view = (View) constraintLayout.a.get(iF);
                                    }
                                }
                                if (view != null) {
                                    AbstractC0662ve abstractC0662ve2 = abstractC0284j7.d;
                                    C0655v7 c0655v7G2 = constraintLayout.g(view);
                                    abstractC0662ve2.getClass();
                                    if (c0655v7G2 != abstractC0662ve2 && c0655v7G2 != null) {
                                        int i26 = abstractC0662ve2.r0 + 1;
                                        C0655v7[] c0655v7Arr = abstractC0662ve2.q0;
                                        if (i26 > c0655v7Arr.length) {
                                            abstractC0662ve2.q0 = (C0655v7[]) Arrays.copyOf(c0655v7Arr, c0655v7Arr.length * 2);
                                        }
                                        C0655v7[] c0655v7Arr2 = abstractC0662ve2.q0;
                                        int i27 = abstractC0662ve2.r0;
                                        c0655v7Arr2[i27] = c0655v7G2;
                                        abstractC0662ve2.r0 = i27 + 1;
                                    }
                                }
                                i24++;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            abstractC0284j7.d.S();
                        }
                        i23++;
                        arrayList2 = arrayList;
                        obj = null;
                        i17 = 0;
                    }
                }
                for (int i28 = 0; i28 < childCount3; i28++) {
                    constraintLayout.getChildAt(i28);
                }
                SparseArray sparseArray = constraintLayout.n;
                sparseArray.clear();
                sparseArray.put(0, c0686w7);
                sparseArray.put(getId(), c0686w7);
                for (int i29 = 0; i29 < childCount3; i29++) {
                    View childAt2 = constraintLayout.getChildAt(i29);
                    sparseArray.put(childAt2.getId(), constraintLayout.g(childAt2));
                }
                int i30 = 0;
                while (i30 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i30);
                    C0655v7 c0655v7G3 = constraintLayout.g(childAt3);
                    if (c0655v7G3 == null) {
                        i3 = childCount3;
                    } else {
                        C0346l7 c0346l8 = (C0346l7) childAt3.getLayoutParams();
                        c0686w7.q0.add(c0655v7G3);
                        C0655v7 c0655v14 = c0655v7G3.T;
                        if (c0655v14 != null) {
                            ((C0686w7) c0655v14).q0.remove(c0655v7G3);
                            c0655v7G3.C();
                        }
                        c0655v7G3.T = c0686w7;
                        c0346l8.a();
                        c0655v7G3.g0 = childAt3.getVisibility();
                        c0655v7G3.f0 = childAt3;
                        if (childAt3 instanceof AbstractC0284j7) {
                            ((AbstractC0284j7) childAt3).h(c0655v7G3, c0686w7.v0);
                        }
                        if (c0346l8.d0) {
                            C0138ee c0138ee = (C0138ee) c0655v7G3;
                            int i31 = c0346l8.m0;
                            int i32 = c0346l8.n0;
                            float f2 = c0346l8.o0;
                            if (f2 != -1.0f) {
                                if (f2 > -1.0f) {
                                    c0138ee.q0 = f2;
                                    c0138ee.r0 = -1;
                                    c0138ee.s0 = -1;
                                }
                            } else if (i31 != -1) {
                                if (i31 > -1) {
                                    c0138ee.q0 = -1.0f;
                                    c0138ee.r0 = i31;
                                    c0138ee.s0 = -1;
                                }
                            } else if (i32 != -1 && i32 > -1) {
                                c0138ee.q0 = -1.0f;
                                c0138ee.r0 = -1;
                                c0138ee.s0 = i32;
                            }
                            i3 = childCount3;
                        } else {
                            int i33 = c0346l8.f0;
                            int i34 = c0346l8.g0;
                            int i35 = c0346l8.h0;
                            int i36 = c0346l8.i0;
                            int i37 = c0346l8.j0;
                            i3 = childCount3;
                            int i38 = c0346l8.k0;
                            float f3 = c0346l8.l0;
                            int i39 = c0346l8.p;
                            if (i39 != -1) {
                                C0655v7 c0655v15 = (C0655v7) sparseArray.get(i39);
                                if (c0655v15 != null) {
                                    float f4 = c0346l8.r;
                                    c0655v7G3.v(7, 7, c0346l8.q, 0, c0655v15);
                                    c0655v7G3.D = f4;
                                }
                                c0346l7 = c0346l8;
                            } else {
                                if (i33 != -1) {
                                    C0655v7 c0655v16 = (C0655v7) sparseArray.get(i33);
                                    if (c0655v16 != null) {
                                        c0655v7G3.v(2, 2, ((ViewGroup.MarginLayoutParams) c0346l8).leftMargin, i37, c0655v16);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i34 == -1) {
                                        if (i35 != i4) {
                                            c0655v12 = (C0655v7) sparseArray.get(i35);
                                            if (c0655v12 != null) {
                                                c0655v7G3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0346l8).rightMargin, i38, c0655v12);
                                            }
                                        } else if (i36 != i4 && (c0655v7 = (C0655v7) sparseArray.get(i36)) != null) {
                                            c0655v7G3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0346l8).rightMargin, i38, c0655v7);
                                        }
                                        i5 = c0346l8.i;
                                        if (i5 != -1) {
                                            c0655v11 = (C0655v7) sparseArray.get(i5);
                                            if (c0655v11 != null) {
                                                c0655v7G3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0346l8).topMargin, c0346l8.x, c0655v11);
                                            }
                                        } else {
                                            i6 = c0346l8.j;
                                            if (i6 != -1 && (c0655v8 = (C0655v7) sparseArray.get(i6)) != null) {
                                                c0655v7G3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0346l8).topMargin, c0346l8.x, c0655v8);
                                            }
                                        }
                                        i7 = c0346l8.k;
                                        if (i7 != -1) {
                                            c0655v10 = (C0655v7) sparseArray.get(i7);
                                            if (c0655v10 != null) {
                                                c0655v7G3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0346l8).bottomMargin, c0346l8.z, c0655v10);
                                            }
                                        } else {
                                            i8 = c0346l8.l;
                                            if (i8 != -1 && (c0655v9 = (C0655v7) sparseArray.get(i8)) != null) {
                                                c0655v7G3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0346l8).bottomMargin, c0346l8.z, c0655v9);
                                            }
                                        }
                                        i9 = c0346l8.m;
                                        if (i9 != -1) {
                                            c0346l7 = c0346l8;
                                            k(c0655v7G3, c0346l8, sparseArray, i9, 6);
                                        } else {
                                            c0346l7 = c0346l8;
                                            i10 = c0346l7.n;
                                            if (i10 != -1) {
                                                k(c0655v7G3, c0346l7, sparseArray, i10, 3);
                                            } else {
                                                i11 = c0346l7.o;
                                                if (i11 != -1) {
                                                    k(c0655v7G3, c0346l7, sparseArray, i11, 5);
                                                }
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                            c0655v7G3.d0 = f3;
                                        }
                                        f = c0346l7.F;
                                        if (f >= 0.0f) {
                                            c0655v7G3.e0 = f;
                                        }
                                    } else {
                                        C0655v7 c0655v17 = (C0655v7) sparseArray.get(i34);
                                        if (c0655v17 != null) {
                                            c0655v7G3.v(2, 4, ((ViewGroup.MarginLayoutParams) c0346l8).leftMargin, i37, c0655v17);
                                        }
                                    }
                                }
                                i4 = -1;
                                if (i35 != i4) {
                                    c0655v12 = (C0655v7) sparseArray.get(i35);
                                    if (c0655v12 != null) {
                                        c0655v7G3.v(4, 2, ((ViewGroup.MarginLayoutParams) c0346l8).rightMargin, i38, c0655v12);
                                    }
                                } else if (i36 != i4) {
                                    c0655v7G3.v(4, 4, ((ViewGroup.MarginLayoutParams) c0346l8).rightMargin, i38, c0655v7);
                                }
                                i5 = c0346l8.i;
                                if (i5 != -1) {
                                    c0655v11 = (C0655v7) sparseArray.get(i5);
                                    if (c0655v11 != null) {
                                        c0655v7G3.v(3, 3, ((ViewGroup.MarginLayoutParams) c0346l8).topMargin, c0346l8.x, c0655v11);
                                    }
                                } else {
                                    i6 = c0346l8.j;
                                    if (i6 != -1) {
                                        c0655v7G3.v(3, 5, ((ViewGroup.MarginLayoutParams) c0346l8).topMargin, c0346l8.x, c0655v8);
                                    }
                                }
                                i7 = c0346l8.k;
                                if (i7 != -1) {
                                    c0655v10 = (C0655v7) sparseArray.get(i7);
                                    if (c0655v10 != null) {
                                        c0655v7G3.v(5, 3, ((ViewGroup.MarginLayoutParams) c0346l8).bottomMargin, c0346l8.z, c0655v10);
                                    }
                                } else {
                                    i8 = c0346l8.l;
                                    if (i8 != -1) {
                                        c0655v7G3.v(5, 5, ((ViewGroup.MarginLayoutParams) c0346l8).bottomMargin, c0346l8.z, c0655v9);
                                    }
                                }
                                i9 = c0346l8.m;
                                if (i9 != -1) {
                                    c0346l7 = c0346l8;
                                    k(c0655v7G3, c0346l8, sparseArray, i9, 6);
                                } else {
                                    c0346l7 = c0346l8;
                                    i10 = c0346l7.n;
                                    if (i10 != -1) {
                                        k(c0655v7G3, c0346l7, sparseArray, i10, 3);
                                    } else {
                                        i11 = c0346l7.o;
                                        if (i11 != -1) {
                                            k(c0655v7G3, c0346l7, sparseArray, i11, 5);
                                        }
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    c0655v7G3.d0 = f3;
                                }
                                f = c0346l7.F;
                                if (f >= 0.0f) {
                                    c0655v7G3.e0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i15 = c0346l7.T) != -1 || c0346l7.U != -1)) {
                                int i40 = c0346l7.U;
                                c0655v7G3.Y = i15;
                                c0655v7G3.Z = i40;
                            }
                            if (c0346l7.a0) {
                                c0655v7G3.M(1);
                                c0655v7G3.O(((ViewGroup.MarginLayoutParams) c0346l7).width);
                                if (((ViewGroup.MarginLayoutParams) c0346l7).width == -2) {
                                    c0655v7G3.M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c0346l7).width == -1) {
                                if (c0346l7.W) {
                                    c0655v7G3.M(3);
                                } else {
                                    c0655v7G3.M(4);
                                }
                                c0655v7G3.i(2).g = ((ViewGroup.MarginLayoutParams) c0346l7).leftMargin;
                                c0655v7G3.i(4).g = ((ViewGroup.MarginLayoutParams) c0346l7).rightMargin;
                            } else {
                                c0655v7G3.M(3);
                                c0655v7G3.O(0);
                            }
                            if (c0346l7.b0) {
                                i12 = -1;
                                c0655v7G3.N(1);
                                c0655v7G3.L(((ViewGroup.MarginLayoutParams) c0346l7).height);
                                if (((ViewGroup.MarginLayoutParams) c0346l7).height == -2) {
                                    c0655v7G3.N(2);
                                }
                            } else {
                                i12 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0346l7).height == -1) {
                                    if (c0346l7.X) {
                                        c0655v7G3.N(3);
                                    } else {
                                        c0655v7G3.N(4);
                                    }
                                    c0655v7G3.i(3).g = ((ViewGroup.MarginLayoutParams) c0346l7).topMargin;
                                    c0655v7G3.i(5).g = ((ViewGroup.MarginLayoutParams) c0346l7).bottomMargin;
                                } else {
                                    c0655v7G3.N(3);
                                    c0655v7G3.L(0);
                                }
                            }
                            String str2 = c0346l7.G;
                            if (str2 == null || str2.length() == 0) {
                                c0655v7G3.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i13 = i12;
                                    i14 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i13 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i12;
                                    i14 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i14);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i14, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= 0.0f || f6 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i13 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    c0655v7G3.W = fAbs;
                                    c0655v7G3.X = i13;
                                }
                            }
                            float f7 = c0346l7.H;
                            float[] fArr = c0655v7G3.k0;
                            fArr[0] = f7;
                            fArr[1] = c0346l7.I;
                            c0655v7G3.i0 = c0346l7.J;
                            c0655v7G3.j0 = c0346l7.K;
                            int i41 = c0346l7.Z;
                            if (i41 >= 0 && i41 <= 3) {
                                c0655v7G3.q = i41;
                            }
                            int i42 = c0346l7.L;
                            int i43 = c0346l7.N;
                            int i44 = c0346l7.P;
                            float f8 = c0346l7.R;
                            c0655v7G3.r = i42;
                            c0655v7G3.u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            c0655v7G3.v = i44;
                            c0655v7G3.w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                c0655v7G3.r = 2;
                            }
                            int i45 = c0346l7.M;
                            int i46 = c0346l7.O;
                            int i47 = c0346l7.Q;
                            float f9 = c0346l7.S;
                            c0655v7G3.s = i45;
                            c0655v7G3.x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            c0655v7G3.y = i47;
                            c0655v7G3.z = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                c0655v7G3.s = 2;
                            }
                        }
                    }
                    i30++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z) {
                c0686w7.r0.Q(c0686w7);
            }
        }
        j(c0686w7, this.i, i, i2);
        int iQ = c0686w7.q();
        int iK = c0686w7.k();
        boolean z3 = c0686w7.E0;
        boolean z4 = c0686w7.F0;
        C0377m7 c0377m7 = this.o;
        int i48 = c0377m7.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + c0377m7.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i48, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z3) {
            iMin |= 16777216;
        }
        if (z4) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0655v7 c0655v7G = g(view);
        if ((view instanceof Guideline) && !(c0655v7G instanceof C0138ee)) {
            C0346l7 c0346l7 = (C0346l7) view.getLayoutParams();
            C0138ee c0138ee = new C0138ee();
            c0346l7.p0 = c0138ee;
            c0346l7.d0 = true;
            c0138ee.S(c0346l7.V);
        }
        if (view instanceof AbstractC0284j7) {
            AbstractC0284j7 abstractC0284j7 = (AbstractC0284j7) view;
            abstractC0284j7.i();
            ((C0346l7) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(abstractC0284j7)) {
                arrayList.add(abstractC0284j7);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        C0655v7 c0655v7G = g(view);
        this.c.q0.remove(c0655v7G);
        c0655v7G.C();
        this.b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0624u7 c0624u7) {
        this.j = c0624u7;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0717x7 abstractC0717x7) {
        C0096d2 c0096d2 = this.k;
        if (c0096d2 != null) {
            c0096d2.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        C0686w7 c0686w7 = this.c;
        c0686w7.D0 = i;
        Qg.p = c0686w7.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new C0686w7();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new C0377m7(this, this);
        this.p = 0;
        this.q = 0;
        h(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0346l7 c0346l7 = new C0346l7(layoutParams);
        c0346l7.a = -1;
        c0346l7.b = -1;
        c0346l7.c = -1.0f;
        c0346l7.d = true;
        c0346l7.e = -1;
        c0346l7.f = -1;
        c0346l7.g = -1;
        c0346l7.h = -1;
        c0346l7.i = -1;
        c0346l7.j = -1;
        c0346l7.k = -1;
        c0346l7.l = -1;
        c0346l7.m = -1;
        c0346l7.n = -1;
        c0346l7.o = -1;
        c0346l7.p = -1;
        c0346l7.q = 0;
        c0346l7.r = 0.0f;
        c0346l7.s = -1;
        c0346l7.t = -1;
        c0346l7.u = -1;
        c0346l7.v = -1;
        c0346l7.w = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.x = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.z = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.B = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.C = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.D = 0;
        c0346l7.E = 0.5f;
        c0346l7.F = 0.5f;
        c0346l7.G = null;
        c0346l7.H = -1.0f;
        c0346l7.I = -1.0f;
        c0346l7.J = 0;
        c0346l7.K = 0;
        c0346l7.L = 0;
        c0346l7.M = 0;
        c0346l7.N = 0;
        c0346l7.O = 0;
        c0346l7.P = 0;
        c0346l7.Q = 0;
        c0346l7.R = 1.0f;
        c0346l7.S = 1.0f;
        c0346l7.T = -1;
        c0346l7.U = -1;
        c0346l7.V = -1;
        c0346l7.W = false;
        c0346l7.X = false;
        c0346l7.Y = null;
        c0346l7.Z = 0;
        c0346l7.a0 = true;
        c0346l7.b0 = true;
        c0346l7.c0 = false;
        c0346l7.d0 = false;
        c0346l7.e0 = false;
        c0346l7.f0 = -1;
        c0346l7.g0 = -1;
        c0346l7.h0 = -1;
        c0346l7.i0 = -1;
        c0346l7.j0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.k0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0346l7.l0 = 0.5f;
        c0346l7.p0 = new C0655v7();
        return c0346l7;
    }
}
