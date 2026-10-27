package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0308k0 implements Ki, InterfaceC0542ri, InterfaceC0728xi, B7, D7, Rj, Yi, InterfaceC0687w8, Mj, Hb, InterfaceC0132e8, Oh {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0308k0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0687w8
    public long a(long j) throws IOException {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = (InputStream) this.b;
            long jSkip = inputStream.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.Ki
    public void b(MenuC0604ti menuC0604ti, boolean z) {
        if (menuC0604ti instanceof Np) {
            ((Np) menuC0604ti).z.k().c(false);
        }
        Ki ki = ((C0339l0) this.b).e;
        if (ki != null) {
            ki.b(menuC0604ti, z);
        }
    }

    @Override // defpackage.InterfaceC0132e8
    public void c() {
        ((Ll) this.b).w();
    }

    @Override // defpackage.InterfaceC0687w8
    public int d() {
        return (r() << 8) | r();
    }

    @Override // defpackage.D7
    public ClipData e() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.InterfaceC0132e8
    public Object f() {
        Ll ll = (Ll) this.b;
        ll.reset();
        return ll;
    }

    @Override // defpackage.B7
    public E7 g() {
        return new E7(new C0308k0(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.Rj
    public Vt h(View view, Vt vt) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        if (!Objects.equals(coordinatorLayout.n, vt)) {
            coordinatorLayout.n = vt;
            boolean z = vt.d() > 0;
            coordinatorLayout.o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            Tt tt = vt.a;
            if (!tt.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = Gs.a;
                    if (childAt.getFitsSystemWindows() && ((O7) childAt.getLayoutParams()).a != null && tt.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return vt;
    }

    @Override // defpackage.D7
    public int i() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.D7
    public ContentInfo j() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.InterfaceC0542ri
    public void k(MenuC0604ti menuC0604ti) {
        InterfaceC0542ri interfaceC0542ri = ((ActionMenuView) this.b).v;
        if (interfaceC0542ri != null) {
            interfaceC0542ri.k(menuC0604ti);
        }
    }

    @Override // defpackage.B7
    public void l(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    @Override // defpackage.B7
    public void m(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.InterfaceC0542ri
    public boolean n(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        boolean z;
        boolean zOnMenuItemSelected;
        InterfaceC0432o0 interfaceC0432o0 = ((ActionMenuView) this.b).A;
        if (interfaceC0432o0 == null) {
            return false;
        }
        Toolbar toolbar = ((Rq) interfaceC0432o0).a;
        Iterator it = ((CopyOnWriteArrayList) toolbar.G.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((Ic) it.next()).a.o()) {
                z = true;
                break;
            }
        }
        if (z) {
            zOnMenuItemSelected = true;
        } else {
            Vq vq = toolbar.I;
            zOnMenuItemSelected = vq != null ? ((Xq) vq).a.k.onMenuItemSelected(0, menuItem) : false;
        }
        return zOnMenuItemSelected;
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 9:
                return new T4((C0225h8) this.b, 1);
            default:
                return new C0109df((Vi) this.b);
        }
    }

    @Override // defpackage.D7
    public int p() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.InterfaceC0687w8
    public int q(byte[] bArr, int i) throws C0656v8 {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C0656v8();
        }
        return i2;
    }

    @Override // defpackage.InterfaceC0687w8
    public short r() throws IOException {
        int i = ((InputStream) this.b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new C0656v8();
    }

    @Override // defpackage.Hb
    public Object s() {
        switch (this.a) {
            case 15:
                Z1 z1 = (Z1) this.b;
                return new RunnableC0471p8((G7) z1.c, (K2) z1.d);
            default:
                C0135eb c0135eb = (C0135eb) this.b;
                return new C0288jb(c0135eb.a, c0135eb.b, c0135eb.c, c0135eb.d, c0135eb.e, c0135eb.f, c0135eb.g);
        }
    }

    @Override // defpackage.InterfaceC0728xi
    public void t(MenuC0604ti menuC0604ti, C0759yi c0759yi) {
        ((A5) this.b).g.removeCallbacksAndMessages(menuC0604ti);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.Ki
    public boolean u(MenuC0604ti menuC0604ti) {
        C0339l0 c0339l0 = (C0339l0) this.b;
        if (menuC0604ti == c0339l0.c) {
            return false;
        }
        ((Np) menuC0604ti).A.getClass();
        c0339l0.getClass();
        Ki ki = c0339l0.e;
        if (ki != null) {
            return ki.u(menuC0604ti);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0728xi
    public void v(MenuC0604ti menuC0604ti, C0759yi c0759yi) {
        A5 a5 = (A5) this.b;
        a5.g.removeCallbacksAndMessages(null);
        ArrayList arrayList = a5.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0604ti == ((C0777z5) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        a5.g.postAtTime(new RunnableC0746y5(this, i2 < arrayList.size() ? (C0777z5) arrayList.get(i2) : null, c0759yi, menuC0604ti), menuC0604ti, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.Mj
    public void w(Object obj) {
        if (((Dg) obj) != null) {
            DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9 = (DialogInterfaceOnCancelListenerC0133e9) this.b;
            if (dialogInterfaceOnCancelListenerC0133e9.a0) {
                View viewJ = dialogInterfaceOnCancelListenerC0133e9.J();
                if (viewJ.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0133e9.e0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0133e9.e0);
                    }
                    dialogInterfaceOnCancelListenerC0133e9.e0.setContentView(viewJ);
                }
            }
        }
    }

    @Override // defpackage.B7
    public void x(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public void y() {
        ((Bc) this.b).m.L();
    }

    public void z() {
        ((InputContentInfo) this.b).requestPermission();
    }

    public C0308k0(InputStream inputStream, C0634uh c0634uh) {
        this.a = 22;
        Ll ll = new Ll(inputStream, c0634uh);
        this.b = ll;
        ll.mark(5242880);
    }

    public C0308k0(C0163f8 c0163f8) {
        this.a = 18;
        this.b = Collections.unmodifiableMap(new HashMap(c0163f8.a));
    }

    public C0308k0(Context context) {
        this.a = 24;
        this.b = new C0096d2(context, 22);
    }

    public C0308k0(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new C0225h8(0);
                break;
            case 19:
                this.b = new Vi(0);
                break;
            case 23:
                this.b = new Mf();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                Tf.j("timeUnit", timeUnit);
                this.b = new Hl(C0334kq.h, timeUnit);
                break;
        }
    }

    public C0308k0(TextView textView) {
        this.a = 14;
        Tf.h("textView cannot be null", textView);
        this.b = new Ma(textView);
    }

    public C0308k0(EditText editText) {
        this.a = 13;
        Tf.h("editText cannot be null", editText);
        this.b = new C0096d2(editText, 13);
    }

    public C0308k0(Object obj) {
        this.a = 20;
        this.b = (InputContentInfo) obj;
    }

    public C0308k0(ContentInfo contentInfo) {
        this.a = 7;
        contentInfo.getClass();
        this.b = AbstractC0776z4.g(contentInfo);
    }

    public C0308k0(ClipData clipData, int i) {
        this.a = 6;
        this.b = AbstractC0776z4.e(clipData, i);
    }
}
