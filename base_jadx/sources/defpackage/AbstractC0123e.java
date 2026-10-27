package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0123e extends View {
    public Bitmap a;
    public Canvas b;
    public Bitmap c;
    public Canvas d;
    public int e;
    public int f;
    public int g;
    public float h;
    public boolean i;
    public final boolean j;

    public AbstractC0123e(Context context) {
        super(context);
        this.f = 20;
        this.g = 5;
        this.h = 1.0f;
        this.i = false;
        this.j = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC0607tl.a, 0, 0);
        try {
            this.j = typedArrayObtainStyledAttributes.getBoolean(0, this.j);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void a() {
        int width;
        int height;
        if (this.j) {
            width = getHeight();
            height = getWidth();
        } else {
            width = getWidth();
            height = getHeight();
        }
        int iMax = Math.max(width - (this.e * 2), 1);
        int i = this.g;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.c = Bitmap.createBitmap(iMax, i, config);
        this.d = new Canvas(this.c);
        Bitmap bitmap = this.a;
        if (bitmap != null && bitmap.getWidth() == width && this.a.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.a;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.a = Bitmap.createBitmap(width, height, config);
        this.b = new Canvas(this.a);
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas, float f, float f2);

    public abstract void d(float f);

    public final void e() {
        this.f = getResources().getDimensionPixelSize(R.dimen.default_slider_handler_radius);
        this.g = getResources().getDimensionPixelSize(R.dimen.default_slider_bar_height);
        this.e = this.f;
        if (this.c == null) {
            a();
        }
        b(this.d);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int height;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.j) {
            width = getHeight();
            height = getWidth();
            canvas.rotate(-90.0f);
            canvas.translate(-width, 0.0f);
        } else {
            width = getWidth();
            height = getHeight();
        }
        if (this.c == null || (canvas2 = this.b) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        Canvas canvas3 = this.b;
        Bitmap bitmap = this.c;
        canvas3.drawBitmap(bitmap, this.e, (height - bitmap.getHeight()) / 2, (Paint) null);
        int i = this.f;
        c(this.b, (this.h * (width - (i * 2))) + i, height / 2.0f);
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
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
        setMeasuredDimension(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.c != null) {
                if (this.j) {
                    this.h = 1.0f - ((motionEvent.getY() - this.e) / this.c.getWidth());
                } else {
                    this.h = (motionEvent.getX() - this.e) / this.c.getWidth();
                }
                float fMax = Math.max(0.0f, Math.min(this.h, 1.0f));
                this.h = fMax;
                d(fMax);
                invalidate();
            }
        } else if (action == 1) {
            d(this.h);
            invalidate();
        } else if (action == 2) {
            if (this.c != null) {
                if (this.j) {
                    this.h = 1.0f - ((motionEvent.getY() - this.e) / this.c.getWidth());
                } else {
                    this.h = (motionEvent.getX() - this.e) / this.c.getWidth();
                }
                float fMax2 = Math.max(0.0f, Math.min(this.h, 1.0f));
                this.h = fMax2;
                d(fMax2);
                invalidate();
            }
        }
        return true;
    }

    public void setOnValueChangedListener(InterfaceC0328kk interfaceC0328kk) {
    }

    public void setShowBorder(boolean z) {
        this.i = z;
    }
}
