package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0345l6 extends Ud {
    public static int s0(List list) {
        Tf.j("<this>", list);
        return list.size() - 1;
    }

    public static List t0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : Ud.R(arrayList.get(0));
        }
        return Sa.a;
    }
}
