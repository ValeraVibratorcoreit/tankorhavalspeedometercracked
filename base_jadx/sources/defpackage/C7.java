package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class C7 implements B7, D7 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public Object e;
    public Cloneable f;

    public /* synthetic */ C7() {
        this.a = 0;
    }

    public void a(Vt vt, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            It it2 = (It) it.next();
            if ((it2.a.c() & 8) != 0) {
                ((View) this.e).setTranslationY(AbstractC0340l1.c(this.d, 0, it2.a.b()));
                return;
            }
        }
    }

    @Override // defpackage.D7
    public ClipData e() {
        return (ClipData) this.b;
    }

    @Override // defpackage.B7
    public E7 g() {
        return new E7(new C7(this));
    }

    @Override // defpackage.D7
    public int i() {
        return this.d;
    }

    @Override // defpackage.D7
    public ContentInfo j() {
        return null;
    }

    @Override // defpackage.B7
    public void l(Bundle bundle) {
        this.f = bundle;
    }

    @Override // defpackage.B7
    public void m(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.D7
    public int p() {
        return this.c;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.b).getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return Vo.h(sb, ((Bundle) this.f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.B7
    public void x(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C7(View view) {
        this.a = 2;
        this.f = new int[2];
        this.e = view;
    }

    public C7(C7 c7) {
        this.a = 1;
        ClipData clipData = (ClipData) c7.b;
        clipData.getClass();
        this.b = clipData;
        int i = c7.c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.c = i;
            int i2 = c7.d;
            if ((i2 & 1) == i2) {
                this.d = i2;
                this.e = (Uri) c7.e;
                this.f = (Bundle) c7.f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
