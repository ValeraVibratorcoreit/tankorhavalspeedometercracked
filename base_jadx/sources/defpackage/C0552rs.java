package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0552rs extends AbstractC0181fq {
    public final /* synthetic */ int e;

    public C0552rs(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.AbstractC0181fq
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(As.d(view));
            case 1:
                return As.b(view);
            case 2:
                return Cs.b(view);
            default:
                return Boolean.valueOf(As.c(view));
        }
    }

    @Override // defpackage.AbstractC0181fq
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                As.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                As.h(view, (CharSequence) obj);
                break;
            case 2:
                Cs.f(view, (CharSequence) obj);
                break;
            default:
                As.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.AbstractC0181fq
    public final boolean f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
