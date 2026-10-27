package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0293jg implements Ad, Serializable {
    public final int a;

    public AbstractC0293jg(int i) {
        this.a = i;
    }

    @Override // defpackage.Ad
    public final int b() {
        return this.a;
    }

    public final String toString() {
        AbstractC0485pm.a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        Tf.i("renderLambdaToString(this)", string);
        return string;
    }
}
