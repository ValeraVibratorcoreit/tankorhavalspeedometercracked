package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0068c5 implements Rj {
    public final int a;
    public final int b;
    public final Object c;

    public C0068c5(Context context, XmlResourceParser xmlResourceParser) {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0422nl.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0624u7().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.Rj
    public Vt h(View view, Vt vt) {
        int i = vt.a.f(7).b;
        int i2 = this.a;
        View view2 = (View) this.c;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.b + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return vt;
    }

    public C0068c5(int i, int i2, byte[] bArr) {
        this.c = bArr;
        this.a = i;
        this.b = i2;
    }

    public C0068c5() {
        this.c = new C0068c5[256];
        this.a = 0;
        this.b = 0;
    }

    public C0068c5(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public C0068c5(View view, int i, int i2) {
        this.a = i;
        this.c = view;
        this.b = i2;
    }
}
