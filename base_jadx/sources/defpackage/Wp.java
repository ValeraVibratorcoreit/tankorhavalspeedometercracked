package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class Wp extends AbstractC0293jg implements InterfaceC0445od {
    public static final Wp b = new Wp(1);

    @Override // defpackage.InterfaceC0445od
    public final Object c(Object obj) {
        Resources resources = (Resources) obj;
        Tf.j("resources", resources);
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
