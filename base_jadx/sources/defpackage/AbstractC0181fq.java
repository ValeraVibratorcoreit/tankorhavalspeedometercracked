package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181fq {
    public int a;
    public int b;
    public int c;
    public Object d;

    public AbstractC0181fq() {
        if (C0387mh.b == null) {
            C0387mh.b = new C0387mh(27);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public Object d(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return b(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void e(View view, Object obj) {
        C0740y c0740y;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (f(d(view), obj)) {
            View.AccessibilityDelegate accessibilityDelegateB = Gs.b(view);
            if (accessibilityDelegateB == null) {
                c0740y = null;
            } else {
                c0740y = accessibilityDelegateB instanceof C0709x ? ((C0709x) accessibilityDelegateB).a : new C0740y(accessibilityDelegateB);
            }
            if (c0740y == null) {
                c0740y = new C0740y();
            }
            Gs.j(view, c0740y);
            view.setTag(this.a, obj);
            Gs.e(view, this.c);
        }
    }

    public abstract boolean f(Object obj, Object obj2);
}
