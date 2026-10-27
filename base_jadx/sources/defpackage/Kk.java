package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class Kk extends AbstractC0431o {
    @Override // defpackage.AbstractC0431o
    public final Random b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Tf.i("current()", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
