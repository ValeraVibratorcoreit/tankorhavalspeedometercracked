package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;

/* JADX INFO: renamed from: pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0488pp {
    public final ArrayList a = new ArrayList();
    public int b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    public int c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public C0488pp(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public final void a() {
        ArrayList arrayList = this.a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C0364lp c0364lp = (C0364lp) view.getLayoutParams();
        this.c = this.f.r.b(view);
        c0364lp.getClass();
    }

    public final void b() {
        this.a.clear();
        this.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.d = 0;
    }

    public final int c() {
        boolean z = this.f.w;
        ArrayList arrayList = this.a;
        return z ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public final int d() {
        boolean z = this.f.w;
        ArrayList arrayList = this.a;
        return z ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iK = staggeredGridLayoutManager.r.k();
        int iG = staggeredGridLayoutManager.r.g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int iE = staggeredGridLayoutManager.r.e(view);
            int iB = staggeredGridLayoutManager.r.b(view);
            boolean z = iE <= iG;
            boolean z2 = iB >= iK;
            if (z && z2 && (iE < iK || iB > iG)) {
                return Wl.H(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && Wl.H(view2) >= i) || ((!staggeredGridLayoutManager.w && Wl.H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && Wl.H(view3) <= i) || ((!staggeredGridLayoutManager.w && Wl.H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        View view = (View) this.a.get(0);
        C0364lp c0364lp = (C0364lp) view.getLayoutParams();
        this.b = this.f.r.e(view);
        c0364lp.getClass();
        return this.b;
    }
}
