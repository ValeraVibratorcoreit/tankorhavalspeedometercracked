package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0550rq {
    public float c;
    public float d;
    public final WeakReference f;
    public C0458oq g;
    public final TextPaint a = new TextPaint(1);
    public final Q5 b = new Q5(this, 1);
    public boolean e = true;

    public C0550rq(InterfaceC0520qq interfaceC0520qq) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(interfaceC0520qq);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(C0458oq c0458oq, Context context) {
        if (this.g != c0458oq) {
            this.g = c0458oq;
            if (c0458oq != null) {
                TextPaint textPaint = this.a;
                Q5 q5 = this.b;
                c0458oq.f(context, textPaint, q5);
                InterfaceC0520qq interfaceC0520qq = (InterfaceC0520qq) this.f.get();
                if (interfaceC0520qq != null) {
                    textPaint.drawableState = interfaceC0520qq.getState();
                }
                c0458oq.e(context, textPaint, q5);
                this.e = true;
            }
            InterfaceC0520qq interfaceC0520qq2 = (InterfaceC0520qq) this.f.get();
            if (interfaceC0520qq2 != null) {
                interfaceC0520qq2.a();
                interfaceC0520qq2.onStateChange(interfaceC0520qq2.getState());
            }
        }
    }
}
