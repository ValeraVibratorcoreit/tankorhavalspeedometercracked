package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class L5 {
    public static final Charset a;
    public static volatile Charset b;
    public static volatile Charset c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Tf.i("forName(\"UTF-8\")", charsetForName);
        a = charsetForName;
        Tf.i("forName(\"UTF-16\")", Charset.forName("UTF-16"));
        Tf.i("forName(\"UTF-16BE\")", Charset.forName("UTF-16BE"));
        Tf.i("forName(\"UTF-16LE\")", Charset.forName("UTF-16LE"));
        Tf.i("forName(\"US-ASCII\")", Charset.forName("US-ASCII"));
        Tf.i("forName(\"ISO-8859-1\")", Charset.forName("ISO-8859-1"));
    }
}
