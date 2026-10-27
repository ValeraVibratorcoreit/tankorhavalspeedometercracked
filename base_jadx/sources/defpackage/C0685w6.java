package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0685w6 extends View {
    public Bitmap a;
    public Canvas b;
    public Bitmap c;
    public Canvas d;
    public boolean e;
    public int f;
    public float g;
    public float h;
    public Integer[] i;
    public int j;
    public Integer k;
    public Integer l;
    public Paint m;
    public Paint n;
    public Paint o;
    public C0561s6 p;
    public ArrayList q;
    public ArrayList r;
    public Ig s;
    public T0 t;
    public EditText u;
    public C0654v6 v;
    public A6 w;
    public int x;
    public int y;

    private void setColorPreviewColor(int i) {
    }

    private void setColorText(int i) {
        EditText editText = this.u;
        if (editText == null) {
            return;
        }
        editText.setText(Tf.C(i, this.t != null));
    }

    private void setColorToSliders(int i) {
        Ig ig = this.s;
        if (ig != null) {
            ig.setColor(i);
        }
        T0 t0 = this.t;
        if (t0 != null) {
            t0.setColor(i);
        }
    }

    private void setHighlightedColor(int i) {
        throw null;
    }

    public final void a(int i, int i2) {
        ArrayList arrayList = this.q;
        if (arrayList == null || i == i2) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Vo.l(it.next());
            try {
                throw null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final C0561s6 b(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        char c = 1;
        char c2 = 0;
        double dCos = Math.cos((((double) fArr[0]) * 3.141592653589793d) / 180.0d) * ((double) fArr[1]);
        double dSin = Math.sin((((double) fArr[0]) * 3.141592653589793d) / 180.0d) * ((double) fArr[1]);
        Iterator it = ((ArrayList) ((AbstractC0093d) this.w).b).iterator();
        C0561s6 c0561s6 = null;
        double d = Double.MAX_VALUE;
        while (it.hasNext()) {
            C0561s6 c0561s7 = (C0561s6) it.next();
            float[] fArr2 = c0561s7.c;
            Iterator it2 = it;
            double d2 = dCos;
            double dCos2 = Math.cos((((double) fArr2[c2]) * 3.141592653589793d) / 180.0d) * ((double) fArr2[c]);
            double d3 = d2 - dCos2;
            double dSin2 = dSin - (Math.sin((((double) fArr2[0]) * 3.141592653589793d) / 180.0d) * ((double) fArr2[1]));
            double d4 = (dSin2 * dSin2) + (d3 * d3);
            if (d4 < d) {
                d = d4;
                c0561s6 = c0561s7;
            }
            c2 = 0;
            it = it2;
            dCos = d2;
            c = 1;
        }
        return c0561s6;
    }

    public final void c(int i, boolean z) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.h = Color.alpha(i) / 255.0f;
        this.g = fArr[2];
        this.i[this.j] = Integer.valueOf(i);
        this.k = Integer.valueOf(i);
        setColorPreviewColor(i);
        setColorToSliders(i);
        if (this.u != null && z) {
            setColorText(i);
        }
        this.p = b(i);
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            this.a = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.b = new Canvas(this.a);
            this.o.setShader(Br.m(26));
        }
        Bitmap bitmap2 = this.c;
        if (bitmap2 == null || bitmap2.getWidth() != measuredWidth) {
            this.c = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.c);
        }
        Canvas canvas = this.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        this.d.drawColor(0, mode);
        if (this.w != null) {
            float width = this.b.getWidth() / 2.0f;
            int i = this.f;
            float f = (width - 1.5374999f) - (width / i);
            float f2 = (f / (i - 1)) / 2.0f;
            AbstractC0093d abstractC0093d = (AbstractC0093d) this.w;
            if (((C0778z6) abstractC0093d.a) == null) {
                abstractC0093d.a = new C0778z6();
            }
            C0778z6 c0778z6 = (C0778z6) abstractC0093d.a;
            c0778z6.a = i;
            c0778z6.b = f;
            c0778z6.c = f2;
            c0778z6.d = 1.5374999f;
            c0778z6.e = this.h;
            c0778z6.f = this.g;
            c0778z6.g = this.b;
            abstractC0093d.a = c0778z6;
            ((ArrayList) abstractC0093d.b).clear();
            this.w.c();
        }
        invalidate();
    }

    public Integer[] getAllColors() {
        return this.i;
    }

    public int getSelectedColor() {
        int iHSVToColor;
        C0561s6 c0561s6 = this.p;
        if (c0561s6 != null) {
            int i = c0561s6.e;
            float[] fArr = {0.0f, 0.0f, this.g};
            Color.colorToHSV(i, fArr);
            iHSVToColor = Color.HSVToColor(fArr);
        } else {
            iHSVToColor = 0;
        }
        return (iHSVToColor & 16777215) | (Math.round(this.h * 255.0f) << 24);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0561s6 c0561s6;
        super.onDraw(canvas);
        canvas.drawColor(0);
        float width = ((canvas.getWidth() / 1.025f) / this.f) / 2.0f;
        if (this.a == null || (c0561s6 = this.p) == null) {
            return;
        }
        Paint paint = this.m;
        paint.setColor(Color.HSVToColor(c0561s6.a(this.g)));
        paint.setAlpha((int) (this.h * 255.0f));
        Canvas canvas2 = this.d;
        C0561s6 c0561s7 = this.p;
        float f = 4.0f + width;
        canvas2.drawCircle(c0561s7.a, c0561s7.b, f, this.o);
        Canvas canvas3 = this.d;
        C0561s6 c0561s8 = this.p;
        canvas3.drawCircle(c0561s8.a, c0561s8.b, f, paint);
        Vi viI = Br.I();
        Paint paint2 = (Paint) viI.a;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(0.5f * width);
        ((Paint) viI.a).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.n = paint2;
        if (this.e) {
            Canvas canvas4 = this.b;
            C0561s6 c0561s9 = this.p;
            canvas4.drawCircle(c0561s9.a, c0561s9.b, (paint2.getStrokeWidth() / 2.0f) + width, this.n);
        }
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
        Canvas canvas5 = this.d;
        C0561s6 c0561s10 = this.p;
        canvas5.drawCircle(c0561s10.a, c0561s10.b, (this.n.getStrokeWidth() / 2.0f) + width, this.n);
        canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.x != 0) {
            setAlphaSlider((T0) getRootView().findViewById(this.x));
        }
        if (this.y != 0) {
            setLightnessSlider((Ig) getRootView().findViewById(this.y));
        }
        d();
        this.p = b(this.k.intValue());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            i = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i2 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i2) : 0;
        }
        if (i2 < i) {
            i = i2;
        }
        setMeasuredDimension(i, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0059 A[SYNTHETIC] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x;
        float y;
        double d;
        double d2;
        int action = motionEvent.getAction();
        C0561s6 c0561s6 = null;
        if (action == 0) {
            int selectedColor = getSelectedColor();
            x = motionEvent.getX();
            y = motionEvent.getY();
            d = Double.MAX_VALUE;
            for (C0561s6 c0561s7 : (ArrayList) ((AbstractC0093d) this.w).b) {
                double d3 = c0561s7.a - x;
                double d4 = c0561s7.b - y;
                d2 = (d4 * d4) + (d3 * d3);
                if (d > d2) {
                    c0561s6 = c0561s7;
                    d = d2;
                }
            }
            this.p = c0561s6;
            int selectedColor2 = getSelectedColor();
            a(selectedColor, selectedColor2);
            this.k = Integer.valueOf(selectedColor2);
            setColorToSliders(selectedColor2);
            d();
            invalidate();
        } else if (action == 1) {
            int selectedColor3 = getSelectedColor();
            ArrayList arrayList = this.r;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Vo.l(it.next());
                    try {
                        throw null;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            setColorToSliders(selectedColor3);
            setColorText(selectedColor3);
            setColorPreviewColor(selectedColor3);
            invalidate();
        } else if (action == 2) {
            int selectedColor4 = getSelectedColor();
            x = motionEvent.getX();
            y = motionEvent.getY();
            d = Double.MAX_VALUE;
            while (r4.hasNext()) {
                double d5 = c0561s7.a - x;
                double d6 = c0561s7.b - y;
                d2 = (d6 * d6) + (d5 * d5);
                if (d > d2) {
                    c0561s6 = c0561s7;
                    d = d2;
                }
            }
            this.p = c0561s6;
            int selectedColor5 = getSelectedColor();
            a(selectedColor4, selectedColor5);
            this.k = Integer.valueOf(selectedColor5);
            setColorToSliders(selectedColor5);
            d();
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        d();
        this.p = b(this.k.intValue());
    }

    public void setAlphaSlider(T0 t0) {
        this.t = t0;
        if (t0 != null) {
            t0.setColorPicker(this);
            this.t.setColor(getSelectedColor());
        }
    }

    public void setAlphaValue(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.h = f;
        int iHSVToColor = Color.HSVToColor(Math.round(f * 255.0f), this.p.a(this.g));
        this.k = Integer.valueOf(iHSVToColor);
        EditText editText = this.u;
        if (editText != null) {
            editText.setText(Tf.C(iHSVToColor, this.t != null));
        }
        Ig ig = this.s;
        if (ig != null && (num = this.k) != null) {
            ig.setColor(num.intValue());
        }
        a(selectedColor, this.k.intValue());
        d();
        invalidate();
    }

    public void setColorEdit(EditText editText) {
        this.u = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.u.addTextChangedListener(this.v);
            setColorEditTextColor(this.l.intValue());
        }
    }

    public void setColorEditTextColor(int i) {
        this.l = Integer.valueOf(i);
        EditText editText = this.u;
        if (editText != null) {
            editText.setTextColor(i);
        }
    }

    public void setDensity(int i) {
        this.f = Math.max(2, i);
        invalidate();
    }

    public void setLightness(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.g = f;
        if (this.p != null) {
            int iHSVToColor = Color.HSVToColor(Math.round(this.h * 255.0f), this.p.a(f));
            this.k = Integer.valueOf(iHSVToColor);
            EditText editText = this.u;
            if (editText != null) {
                editText.setText(Tf.C(iHSVToColor, this.t != null));
            }
            T0 t0 = this.t;
            if (t0 != null && (num = this.k) != null) {
                t0.setColor(num.intValue());
            }
            a(selectedColor, this.k.intValue());
            d();
            invalidate();
        }
    }

    public void setLightnessSlider(Ig ig) {
        this.s = ig;
        if (ig != null) {
            ig.setColorPicker(this);
            this.s.setColor(getSelectedColor());
        }
    }

    public void setRenderer(A6 a6) {
        this.w = a6;
        invalidate();
    }

    public void setSelectedColor(int i) {
        Integer[] numArr = this.i;
        if (numArr == null || numArr.length < i) {
            return;
        }
        this.j = i;
        setHighlightedColor(i);
        Integer num = this.i[i];
        if (num == null) {
            return;
        }
        c(num.intValue(), true);
        d();
        invalidate();
    }

    public void setShowBorder(boolean z) {
        this.e = z;
    }
}
