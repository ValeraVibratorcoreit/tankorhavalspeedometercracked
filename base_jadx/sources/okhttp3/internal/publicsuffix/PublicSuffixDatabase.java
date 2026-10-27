package okhttp3.internal.publicsuffix;

import defpackage.AbstractC0314k6;
import defpackage.AbstractC0345l6;
import defpackage.Bl;
import defpackage.Br;
import defpackage.C0104da;
import defpackage.C0373m3;
import defpackage.C0384me;
import defpackage.C0387mh;
import defpackage.C0530r6;
import defpackage.Fn;
import defpackage.Gk;
import defpackage.Jq;
import defpackage.Mp;
import defpackage.Qj;
import defpackage.Sa;
import defpackage.Td;
import defpackage.Tf;
import defpackage.Ud;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {(byte) 42};
    public static final List f = Ud.R("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        int i = 0;
        List listS0 = Mp.S0(str, new char[]{'.'});
        if (listS0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!Tf.b((String) listS0.get(AbstractC0345l6.s0(listS0)), "")) {
            return listS0;
        }
        int size = listS0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        if (size == 0) {
            return Sa.a;
        }
        if (size >= listS0.size()) {
            return AbstractC0314k6.x0(listS0);
        }
        if (size == 1) {
            if (listS0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return Ud.R(listS0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        return AbstractC0345l6.t0(arrayList);
    }

    public final String a(String str) {
        String strF;
        String strF2;
        String strF3;
        List listS0;
        int size;
        int size2;
        int i = 0;
        String unicode = IDN.toUnicode(str);
        Tf.i("unicodeDomain", unicode);
        List listC = c(unicode);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        Gk gk = Gk.a;
                        Gk.a.getClass();
                        Gk.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str2 = (String) listC.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            Tf.i("UTF_8", charset);
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str2.getBytes(charset);
            Tf.i("(this as java.lang.String).getBytes(charset)", bytes);
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strF = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                Tf.a0("publicSuffixListBytes");
                throw null;
            }
            strF = C0387mh.f(bArr2, bArr, i3);
            if (strF != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strF2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strF2 = null;
                break;
            }
            bArr3[i4] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                Tf.a0("publicSuffixListBytes");
                throw null;
            }
            strF2 = C0387mh.f(bArr4, bArr3, i4);
            if (strF2 != null) {
                break;
            }
            i4++;
        }
        if (strF2 == null) {
            strF3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strF3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                Tf.a0("publicSuffixExceptionListBytes");
                throw null;
            }
            strF3 = C0387mh.f(bArr5, bArr, i6);
            if (strF3 != null) {
                break;
            }
            i6++;
        }
        if (strF3 != null) {
            listS0 = Mp.S0("!".concat(strF3), new char[]{'.'});
        } else if (strF == null && strF2 == null) {
            listS0 = f;
        } else {
            List listS1 = Sa.a;
            List listS2 = strF != null ? Mp.S0(strF, new char[]{'.'}) : listS1;
            if (strF2 != null) {
                listS1 = Mp.S0(strF2, new char[]{'.'});
            }
            listS0 = listS2.size() > listS1.size() ? listS2 : listS1;
        }
        if (listC.size() == listS0.size() && ((String) listS0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listS0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listS0.size();
        } else {
            size = listC.size();
            size2 = listS0.size() + 1;
        }
        int i7 = size - size2;
        Fn c0530r6 = new C0530r6(c(str));
        if (i7 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        }
        if (i7 != 0) {
            c0530r6 = new C0104da(c0530r6, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c0530r6) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            Br.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        Tf.i("joinTo(StringBuilder(), …ed, transform).toString()", string);
        return string;
    }

    public final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            Logger logger = Qj.a;
            Bl bl = new Bl(new C0384me(new C0373m3(resourceAsStream, 1, new Jq())));
            try {
                long j = bl.readInt();
                bl.l(j);
                byte[] bArrZ = bl.a.z(j);
                long j2 = bl.readInt();
                bl.l(j2);
                byte[] bArrZ2 = bl.a.z(j2);
                Td.g(bl, null);
                synchronized (this) {
                    this.c = bArrZ;
                    this.d = bArrZ2;
                }
                this.b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Td.g(bl, th);
                    throw th2;
                }
            }
        }
    }
}
