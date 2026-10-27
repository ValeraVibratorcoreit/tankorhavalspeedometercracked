package defpackage;

import android.os.Handler;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class Q8 extends Td {
    public final Object h = new Object();
    public volatile Handler i;

    public Q8() {
        Executors.newFixedThreadPool(4, new P8());
    }
}
