package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ft extends WindowInsetsAnimation$Callback {
    public final C7 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public Ft(C7 c7) {
        super(0);
        this.d = new HashMap();
        this.a = c7;
    }

    public final It a(WindowInsetsAnimation windowInsetsAnimation) {
        It it = (It) this.d.get(windowInsetsAnimation);
        if (it == null) {
            it = new It(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                it.a = new Gt(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, it);
        }
        return it;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C7 c7 = this.a;
        a(windowInsetsAnimation);
        ((View) c7.e).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C7 c7 = this.a;
        a(windowInsetsAnimation);
        View view = (View) c7.e;
        int[] iArr = (int[]) c7.f;
        view.getLocationOnScreen(iArr);
        c7.c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = B.j(list.get(size));
            It itA = a(windowInsetsAnimationJ);
            itA.a.d(windowInsetsAnimationJ.getFraction());
            this.c.add(itA);
        }
        C7 c7 = this.a;
        Vt vtG = Vt.g(null, windowInsets);
        c7.a(vtG, this.b);
        return vtG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C7 c7 = this.a;
        a(windowInsetsAnimation);
        Hf hfC = Hf.c(bounds.getLowerBound());
        Hf hfC2 = Hf.c(bounds.getUpperBound());
        View view = (View) c7.e;
        int[] iArr = (int[]) c7.f;
        view.getLocationOnScreen(iArr);
        int i = c7.c - iArr[1];
        c7.d = i;
        view.setTranslationY(i);
        B.n();
        return B.h(hfC.d(), hfC2.d());
    }
}
