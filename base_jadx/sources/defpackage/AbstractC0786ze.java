package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0786ze {
    public static final C0538re[] a;
    public static final Map b;

    static {
        C0538re c0538re = new C0538re(C0538re.i, "");
        C0129e5 c0129e5 = C0538re.f;
        C0538re c0538re2 = new C0538re(c0129e5, "GET");
        C0538re c0538re3 = new C0538re(c0129e5, "POST");
        C0129e5 c0129e6 = C0538re.g;
        C0538re c0538re4 = new C0538re(c0129e6, "/");
        C0538re c0538re5 = new C0538re(c0129e6, "/index.html");
        C0129e5 c0129e7 = C0538re.h;
        C0538re c0538re6 = new C0538re(c0129e7, "http");
        C0538re c0538re7 = new C0538re(c0129e7, "https");
        C0129e5 c0129e8 = C0538re.e;
        C0538re[] c0538reArr = {c0538re, c0538re2, c0538re3, c0538re4, c0538re5, c0538re6, c0538re7, new C0538re(c0129e8, "200"), new C0538re(c0129e8, "204"), new C0538re(c0129e8, "206"), new C0538re(c0129e8, "304"), new C0538re(c0129e8, "400"), new C0538re(c0129e8, "404"), new C0538re(c0129e8, "500"), new C0538re("accept-charset", ""), new C0538re("accept-encoding", "gzip, deflate"), new C0538re("accept-language", ""), new C0538re("accept-ranges", ""), new C0538re("accept", ""), new C0538re("access-control-allow-origin", ""), new C0538re("age", ""), new C0538re("allow", ""), new C0538re("authorization", ""), new C0538re("cache-control", ""), new C0538re("content-disposition", ""), new C0538re("content-encoding", ""), new C0538re("content-language", ""), new C0538re("content-length", ""), new C0538re("content-location", ""), new C0538re("content-range", ""), new C0538re("content-type", ""), new C0538re("cookie", ""), new C0538re("date", ""), new C0538re("etag", ""), new C0538re("expect", ""), new C0538re("expires", ""), new C0538re("from", ""), new C0538re("host", ""), new C0538re("if-match", ""), new C0538re("if-modified-since", ""), new C0538re("if-none-match", ""), new C0538re("if-range", ""), new C0538re("if-unmodified-since", ""), new C0538re("last-modified", ""), new C0538re("link", ""), new C0538re("location", ""), new C0538re("max-forwards", ""), new C0538re("proxy-authenticate", ""), new C0538re("proxy-authorization", ""), new C0538re("range", ""), new C0538re("referer", ""), new C0538re("refresh", ""), new C0538re("retry-after", ""), new C0538re("server", ""), new C0538re("set-cookie", ""), new C0538re("strict-transport-security", ""), new C0538re("transfer-encoding", ""), new C0538re("user-agent", ""), new C0538re("vary", ""), new C0538re("via", ""), new C0538re("www-authenticate", "")};
        a = c0538reArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c0538reArr[i].b)) {
                linkedHashMap.put(c0538reArr[i].b, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Tf.i("Collections.unmodifiableMap(result)", mapUnmodifiableMap);
        b = mapUnmodifiableMap;
    }

    public static void a(C0129e5 c0129e5) {
        Tf.j("name", c0129e5);
        int iB = c0129e5.b();
        for (int i = 0; i < iB; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bE = c0129e5.e(i);
            if (b2 <= bE && b3 >= bE) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0129e5.i()));
            }
        }
    }
}
