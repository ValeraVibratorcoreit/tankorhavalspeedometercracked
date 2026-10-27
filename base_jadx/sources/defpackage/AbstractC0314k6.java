package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0314k6 extends AbstractC0500q6 {
    public static final void w0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC0445od interfaceC0445od) {
        Tf.j("<this>", iterable);
        Tf.j("separator", charSequence);
        Tf.j("prefix", charSequence2);
        Tf.j("postfix", charSequence3);
        Tf.j("truncated", charSequence4);
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                Br.c(sb, obj, interfaceC0445od);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static List x0(List list) {
        Tf.j("<this>", list);
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new ArrayList(list) : Ud.R(list.get(0));
        }
        return Sa.a;
    }
}
