package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class Rr {
    public static final byte[] a;
    public static final C0569se b = Ud.W(new String[0]);
    public static final Jl c;
    public static final C0514qk d;
    public static final TimeZone e;
    public static final C0454om f;
    public static final String g;

    static {
        int i;
        int iCompareTo;
        byte[] bArr = new byte[0];
        a = bArr;
        L4 l4 = new L4();
        l4.E(bArr, 0, 0);
        long j = 0;
        c = new Jl(l4, (C0388mi) null, j);
        c(j, j, j);
        C0129e5 c0129e5 = C0129e5.d;
        C0129e5[] c0129e5Arr = {C0473pa.s("efbbbf"), C0473pa.s("feff"), C0473pa.s("fffe"), C0473pa.s("0000ffff"), C0473pa.s("ffff0000")};
        ArrayList arrayList = new ArrayList(new Y2(c0129e5Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            C0129e5 c0129e6 = c0129e5Arr[i2];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Integer[] numArr = (Integer[]) array;
        Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
        Tf.j("elements", numArr2);
        ArrayList arrayList3 = numArr2.length == 0 ? new ArrayList() : new ArrayList(new Y2(numArr2, true));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            C0129e5 c0129e7 = c0129e5Arr[i3];
            int i5 = i4 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i6 = size - 1;
            int i7 = 0;
            while (true) {
                if (i7 > i6) {
                    i = -(i7 + 1);
                    break;
                }
                i = (i7 + i6) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i);
                if (comparable == c0129e7) {
                    iCompareTo = 0;
                } else if (comparable == null) {
                    iCompareTo = -1;
                } else {
                    iCompareTo = c0129e7 == null ? 1 : comparable.compareTo(c0129e7);
                }
                if (iCompareTo < 0) {
                    i7 = i + 1;
                } else if (iCompareTo <= 0) {
                    break;
                } else {
                    i6 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i4));
            i3++;
            i4 = i5;
        }
        if (((C0129e5) arrayList.get(0)).b() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C0129e5 c0129e8 = (C0129e5) arrayList.get(i8);
            int i9 = i8 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                C0129e5 c0129e9 = (C0129e5) arrayList.get(i10);
                c0129e9.getClass();
                Tf.j("prefix", c0129e8);
                if (!c0129e9.g(c0129e8, c0129e8.b())) {
                    break;
                }
                if (c0129e9.b() == c0129e8.b()) {
                    throw new IllegalArgumentException(("duplicate option: " + c0129e9).toString());
                }
                if (((Number) arrayList3.get(i10)).intValue() > ((Number) arrayList3.get(i8)).intValue()) {
                    arrayList.remove(i10);
                    arrayList3.remove(i10);
                } else {
                    i10++;
                }
            }
            i8 = i9;
        }
        L4 l5 = new L4();
        AbstractC0390mk.a(0L, l5, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (l5.b / ((long) 4))];
        int i11 = 0;
        while (!l5.p()) {
            iArr[i11] = l5.readInt();
            i11++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(c0129e5Arr, 5);
        Tf.i("java.util.Arrays.copyOf(this, size)", objArrCopyOf);
        d = new C0514qk((C0129e5[]) objArrCopyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Tf.f(timeZone);
        e = timeZone;
        f = new C0454om(1);
        String strP0 = Mp.P0(Pj.class.getName(), "okhttp3.");
        if (strP0.endsWith("Client")) {
            strP0 = strP0.substring(0, strP0.length() - "Client".length());
            Tf.i("this as java.lang.String…ing(startIndex, endIndex)", strP0);
        }
        g = strP0;
    }

    public static final boolean a(C0201gf c0201gf, C0201gf c0201gf2) {
        Tf.j("$this$canReuseConnectionFor", c0201gf);
        Tf.j("other", c0201gf2);
        return Tf.b(c0201gf.e, c0201gf2.e) && c0201gf.f == c0201gf2.f && Tf.b(c0201gf.b, c0201gf2.b);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        Tf.j("$this$closeQuietly", closeable);
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        Tf.j("$this$closeQuietly", socket);
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Tf.b(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c2, int i, int i2) {
        Tf.j("$this$delimiterOffset", str);
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, int i, String str2, int i2) {
        Tf.j("$this$delimiterOffset", str);
        while (i < i2) {
            if (Mp.C0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean h(Xo xo, TimeUnit timeUnit) {
        Tf.j("$this$discard", xo);
        Tf.j("timeUnit", timeUnit);
        try {
            return t(xo, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        Tf.j("format", str);
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        Tf.j("$this$hasIntersection", strArr);
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(C0117dn c0117dn) {
        String strA = c0117dn.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        List listAsList;
        Tf.j("elements", objArr);
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Tf.j("elements", objArrCopyOf);
        if (objArrCopyOf.length > 0) {
            listAsList = Arrays.asList(objArrCopyOf);
            Tf.i("asList(this)", listAsList);
        } else {
            listAsList = Sa.a;
        }
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        Tf.i("Collections.unmodifiable…istOf(*elements.clone()))", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Tf.k(cCharAt, 31) <= 0 || Tf.k(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int n(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int o(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        Tf.j("other", strArr2);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final Charset r(P4 p4, Charset charset) {
        Charset charsetForName;
        Tf.j("$this$readBomAsCharset", p4);
        Tf.j("default", charset);
        int iU = p4.u(d);
        if (iU == -1) {
            return charset;
        }
        if (iU == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Tf.i("UTF_8", charset2);
            return charset2;
        }
        if (iU == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Tf.i("UTF_16BE", charset3);
            return charset3;
        }
        if (iU == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Tf.i("UTF_16LE", charset4);
            return charset4;
        }
        if (iU == 3) {
            Charset charset5 = L5.a;
            charsetForName = L5.c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                Tf.i("forName(\"UTF-32BE\")", charsetForName);
                L5.c = charsetForName;
            }
        } else {
            if (iU != 4) {
                throw new AssertionError();
            }
            Charset charset6 = L5.a;
            charsetForName = L5.b;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                Tf.i("forName(\"UTF-32LE\")", charsetForName);
                L5.b = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int s(P4 p4) {
        Tf.j("$this$readMedium", p4);
        return (p4.readByte() & 255) | ((p4.readByte() & 255) << 16) | ((p4.readByte() & 255) << 8);
    }

    public static final boolean t(Xo xo, int i, TimeUnit timeUnit) {
        Tf.j("$this$skipAll", xo);
        Tf.j("timeUnit", timeUnit);
        long jNanoTime = System.nanoTime();
        long jC = xo.b().e() ? xo.b().c() - jNanoTime : Long.MAX_VALUE;
        xo.b().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            L4 l4 = new L4();
            while (xo.f(l4, 8192L) != -1) {
                l4.a(l4.b);
            }
            if (jC == Long.MAX_VALUE) {
                xo.b().a();
            } else {
                xo.b().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                xo.b().a();
            } else {
                xo.b().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                xo.b().a();
            } else {
                xo.b().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final C0569se u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0538re c0538re = (C0538re) it.next();
            String strI = c0538re.b.i();
            String strI2 = c0538re.c.i();
            arrayList.add(strI);
            arrayList.add(Mp.W0(strI2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C0569se((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public static final String v(C0201gf c0201gf, boolean z) {
        int i;
        Tf.j("$this$toHostHeader", c0201gf);
        String str = c0201gf.e;
        if (Mp.D0(str, ":")) {
            str = "[" + str + ']';
        }
        int i2 = c0201gf.f;
        if (!z) {
            String str2 = c0201gf.b;
            Tf.j("scheme", str2);
            int iHashCode = str2.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && str2.equals("https")) {
                    i = 443;
                } else {
                    i = -1;
                }
            } else if (str2.equals("http")) {
                i = 80;
            } else {
                i = -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List w(List list) {
        Tf.j("$this$toImmutableList", list);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        Tf.i("Collections.unmodifiableList(toMutableList())", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final int x(int i, String str) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String y(String str, int i, int i2) {
        int iN = n(str, i, i2);
        String strSubstring = str.substring(iN, o(str, iN, i2));
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static final void z(Exception exc, List list) {
        Tf.j("$this$withSuppressed", exc);
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F4.d(exc, (Exception) it.next());
        }
    }
}
