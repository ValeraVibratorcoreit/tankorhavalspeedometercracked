package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Package r2 = Pj.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap2.put(name, "OkHttp");
        }
        linkedHashMap2.put(Pj.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap2.put(He.class.getName(), "okhttp.Http2");
        linkedHashMap2.put(C0334kq.class.getName(), "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap2.size();
        if (size != 0) {
            linkedHashMap = size != 1 ? new LinkedHashMap(linkedHashMap2) : Jh.u0(linkedHashMap2);
        } else {
            linkedHashMap = Ta.a;
        }
        b = linkedHashMap;
    }
}
