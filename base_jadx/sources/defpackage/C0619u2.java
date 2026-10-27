package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0619u2 extends Br {
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ WeakReference l;
    public final /* synthetic */ C0774z2 m;

    public C0619u2(C0774z2 c0774z2, int i, int i2, WeakReference weakReference) {
        this.m = c0774z2;
        this.j = i;
        this.k = i2;
        this.l = weakReference;
    }

    @Override // defpackage.Br
    public final void O(int i) {
    }

    @Override // defpackage.Br
    public final void P(Typeface typeface) {
        int i = this.j;
        if (i != -1) {
            typeface = AbstractC0743y2.a(typeface, i, (this.k & 2) != 0);
        }
        C0774z2 c0774z2 = this.m;
        if (c0774z2.m) {
            c0774z2.l = typeface;
            TextView textView = (TextView) this.l.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0650v2(textView, typeface, c0774z2.j));
                } else {
                    textView.setTypeface(typeface, c0774z2.j);
                }
            }
        }
    }
}
