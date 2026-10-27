package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class Lb extends AbstractC0431o {
    public final C0285j8 c = new C0285j8(1);

    @Override // defpackage.AbstractC0431o
    public final Random b() {
        Object obj = this.c.get();
        Tf.i("implStorage.get()", obj);
        return (Random) obj;
    }
}
