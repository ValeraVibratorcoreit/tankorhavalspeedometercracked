package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Q0 implements Um, U {
    public int a;
    public final Object b;

    public /* synthetic */ Q0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.U
    public boolean a(View view) {
        ((BottomSheetBehavior) this.b).B(this.a);
        return true;
    }

    public R0 b() {
        M0 m0 = (M0) this.b;
        R0 r0 = new R0((ContextThemeWrapper) m0.a, this.a);
        View view = m0.e;
        P0 p0 = r0.f;
        if (view != null) {
            p0.C = view;
        } else {
            CharSequence charSequence = m0.d;
            if (charSequence != null) {
                p0.e = charSequence;
                TextView textView = p0.A;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = m0.c;
            if (drawable != null) {
                p0.y = drawable;
                p0.x = 0;
                ImageView imageView = p0.z;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    p0.z.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = m0.f;
        if (charSequence2 != null) {
            p0.f = charSequence2;
            TextView textView2 = p0.B;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = m0.g;
        if (charSequence3 != null) {
            p0.c(-1, charSequence3, m0.h);
        }
        CharSequence charSequence4 = m0.i;
        if (charSequence4 != null) {
            p0.c(-2, charSequence4, m0.j);
        }
        CharSequence charSequence5 = m0.k;
        if (charSequence5 != null) {
            p0.c(-3, charSequence5, m0.l);
        }
        if (m0.o != null || m0.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) m0.b.inflate(p0.G, (ViewGroup) null);
            int i = m0.s ? p0.H : p0.I;
            ListAdapter o0 = m0.p;
            if (o0 == null) {
                o0 = new O0(m0.a, i, R.id.text1, m0.o);
            }
            p0.D = o0;
            p0.E = m0.t;
            if (m0.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new L0(m0, p0));
            }
            if (m0.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            p0.g = alertController$RecycleListView;
        }
        View view2 = m0.r;
        if (view2 != null) {
            p0.h = view2;
            p0.i = 0;
            p0.j = false;
        }
        r0.setCancelable(m0.m);
        if (m0.m) {
            r0.setCanceledOnTouchOutside(true);
        }
        r0.setOnCancelListener(null);
        r0.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = m0.n;
        if (onKeyListener != null) {
            r0.setOnKeyListener(onKeyListener);
        }
        return r0;
    }

    public boolean c() {
        return this.a < ((List) this.b).size();
    }

    public Q0 d(int i, DialogInterface.OnClickListener onClickListener) {
        M0 m0 = (M0) this.b;
        m0.i = m0.a.getText(i);
        m0.j = onClickListener;
        return this;
    }

    public Q0 e(int i, DialogInterface.OnClickListener onClickListener) {
        M0 m0 = (M0) this.b;
        m0.g = m0.a.getText(i);
        m0.h = onClickListener;
        return this;
    }

    public Q0 f(int i) {
        M0 m0 = (M0) this.b;
        m0.d = m0.a.getText(i);
        return this;
    }

    public void g() {
        b().show();
    }

    @Override // defpackage.Um
    public Im m(Im im, C0544rk c0544rk) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) im.get()).compress((Bitmap.CompressFormat) this.b, this.a, byteArrayOutputStream);
        im.e();
        return new C0156f1(byteArrayOutputStream.toByteArray());
    }

    public /* synthetic */ Q0(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public Q0() {
        this.b = Bitmap.CompressFormat.JPEG;
        this.a = 100;
    }

    public Q0(ArrayList arrayList) {
        this.b = arrayList;
    }

    public Q0(Context context) {
        this(context, R0.h(context, 0));
    }

    public Q0(Context context, int i) {
        this.b = new M0(new ContextThemeWrapper(context, R0.h(context, i)));
        this.a = i;
    }
}
