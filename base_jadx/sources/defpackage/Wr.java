package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Wr extends Xr {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public Wr() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    @Override // defpackage.Xr
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((Xr) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.Xr
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((Xr) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public Wr(Wr wr, C0066c3 c0066c3) {
        Yr ur;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = wr.c;
        this.d = wr.d;
        this.e = wr.e;
        this.f = wr.f;
        this.g = wr.g;
        this.h = wr.h;
        this.i = wr.i;
        String str = wr.l;
        this.l = str;
        this.k = wr.k;
        if (str != null) {
            c0066c3.put(str, this);
        }
        matrix.set(wr.j);
        ArrayList arrayList = wr.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof Wr) {
                this.b.add(new Wr((Wr) obj, c0066c3));
            } else {
                if (obj instanceof Vr) {
                    Vr vr = (Vr) obj;
                    Vr vr2 = new Vr(vr);
                    vr2.f = 0.0f;
                    vr2.h = 1.0f;
                    vr2.i = 1.0f;
                    vr2.j = 0.0f;
                    vr2.k = 1.0f;
                    vr2.l = 0.0f;
                    vr2.m = Paint.Cap.BUTT;
                    vr2.n = Paint.Join.MITER;
                    vr2.o = 4.0f;
                    vr2.e = vr.e;
                    vr2.f = vr.f;
                    vr2.h = vr.h;
                    vr2.g = vr.g;
                    vr2.c = vr.c;
                    vr2.i = vr.i;
                    vr2.j = vr.j;
                    vr2.k = vr.k;
                    vr2.l = vr.l;
                    vr2.m = vr.m;
                    vr2.n = vr.n;
                    vr2.o = vr.o;
                    ur = vr2;
                } else if (obj instanceof Ur) {
                    ur = new Ur((Ur) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(ur);
                Object obj2 = ur.b;
                if (obj2 != null) {
                    c0066c3.put(obj2, ur);
                }
            }
        }
    }
}
