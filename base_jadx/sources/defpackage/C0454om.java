package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0454om implements Serializable {
    public final /* synthetic */ int a;
    public Object b;

    public C0454om(int i) {
        this.a = i;
        switch (i) {
            case 1:
                Pattern patternCompile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                Tf.i("compile(pattern)", patternCompile);
                this.b = patternCompile;
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.valueOf(this.b);
            default:
                String string = ((Pattern) this.b).toString();
                Tf.i("nativePattern.toString()", string);
                return string;
        }
    }
}
