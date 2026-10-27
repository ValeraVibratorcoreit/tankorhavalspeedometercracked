package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503q9 implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0410n9());
    public final CallableC0379m9 n = new CallableC0379m9(this);
    public final int e = 1;
    public final int g = 1;

    public C0503q9(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static C0503q9 C(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                H(file2, file3, false);
            }
        }
        C0503q9 c0503q9 = new C0503q9(file, j);
        if (c0503q9.b.exists()) {
            try {
                c0503q9.E();
                c0503q9.D();
                return c0503q9;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c0503q9.close();
                Sr.a(c0503q9.a);
            }
        }
        file.mkdirs();
        C0503q9 c0503q10 = new C0503q9(file, j);
        c0503q10.G();
        return c0503q10;
    }

    public static void H(File file, File file2, boolean z) throws IOException {
        if (z) {
            x(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void n(C0503q9 c0503q9, C0441o9 c0441o9, boolean z) {
        synchronized (c0503q9) {
            C0472p9 c0472p9 = (C0472p9) c0441o9.b;
            if (c0472p9.f != c0441o9) {
                throw new IllegalStateException();
            }
            if (z && !c0472p9.e) {
                for (int i = 0; i < c0503q9.g; i++) {
                    if (!((boolean[]) c0441o9.c)[i]) {
                        c0441o9.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c0472p9.d[i].exists()) {
                        c0441o9.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c0503q9.g; i2++) {
                File file = c0472p9.d[i2];
                if (!z) {
                    x(file);
                } else if (file.exists()) {
                    File file2 = c0472p9.c[i2];
                    file.renameTo(file2);
                    long j = c0472p9.b[i2];
                    long length = file2.length();
                    c0472p9.b[i2] = length;
                    c0503q9.h = (c0503q9.h - j) + length;
                }
            }
            c0503q9.k++;
            c0472p9.f = null;
            if (c0472p9.e || z) {
                c0472p9.e = true;
                c0503q9.i.append((CharSequence) "CLEAN");
                c0503q9.i.append(' ');
                c0503q9.i.append((CharSequence) c0472p9.a);
                c0503q9.i.append((CharSequence) c0472p9.a());
                c0503q9.i.append('\n');
                if (z) {
                    c0503q9.l++;
                    c0472p9.getClass();
                }
            } else {
                c0503q9.j.remove(c0472p9.a);
                c0503q9.i.append((CharSequence) "REMOVE");
                c0503q9.i.append(' ');
                c0503q9.i.append((CharSequence) c0472p9.a);
                c0503q9.i.append('\n');
            }
            z(c0503q9.i);
            if (c0503q9.h > c0503q9.f || c0503q9.B()) {
                c0503q9.m.submit(c0503q9.n);
            }
        }
    }

    public static void w(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void x(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void z(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized C0308k0 A(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C0472p9 c0472p9 = (C0472p9) this.j.get(str);
        if (c0472p9 == null) {
            return null;
        }
        if (!c0472p9.e) {
            return null;
        }
        for (File file : c0472p9.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (B()) {
            this.m.submit(this.n);
        }
        return new C0308k0(c0472p9.c, 12);
    }

    public final boolean B() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void D() throws IOException {
        x(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            C0472p9 c0472p9 = (C0472p9) it.next();
            C0441o9 c0441o9 = c0472p9.f;
            int i = this.g;
            int i2 = 0;
            if (c0441o9 == null) {
                while (i2 < i) {
                    this.h += c0472p9.b[i2];
                    i2++;
                }
            } else {
                c0472p9.f = null;
                while (i2 < i) {
                    x(c0472p9.c[i2]);
                    x(c0472p9.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void E() {
        File file = this.b;
        FileInputStream fileInputStream = new FileInputStream(file);
        Charset charset = Sr.a;
        Dp dp = new Dp(fileInputStream);
        try {
            String strN = dp.n();
            String strN2 = dp.n();
            String strN3 = dp.n();
            String strN4 = dp.n();
            String strN5 = dp.n();
            if (!"libcore.io.DiskLruCache".equals(strN) || !"1".equals(strN2) || !Integer.toString(this.e).equals(strN3) || !Integer.toString(this.g).equals(strN4) || !"".equals(strN5)) {
                throw new IOException("unexpected journal header: [" + strN + ", " + strN2 + ", " + strN4 + ", " + strN5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    F(dp.n());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (dp.e == -1) {
                        G();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Sr.a));
                    }
                    try {
                        dp.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                dp.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void F(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C0472p9 c0472p9 = (C0472p9) linkedHashMap.get(strSubstring);
        if (c0472p9 == null) {
            c0472p9 = new C0472p9(this, strSubstring);
            linkedHashMap.put(strSubstring, c0472p9);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0472p9.f = new C0441o9(this, c0472p9);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c0472p9.e = true;
        c0472p9.f = null;
        if (strArrSplit.length != c0472p9.g.g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c0472p9.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void G() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                w(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), Sr.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C0472p9 c0472p9 : this.j.values()) {
                    if (c0472p9.f != null) {
                        bufferedWriter2.write("DIRTY " + c0472p9.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c0472p9.a + c0472p9.a() + '\n');
                    }
                }
                w(bufferedWriter2);
                if (this.b.exists()) {
                    H(this.b, this.d, true);
                }
                H(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), Sr.a));
            } catch (Throwable th) {
                w(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void I() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C0472p9 c0472p9 = (C0472p9) this.j.get(str);
                    if (c0472p9 != null && c0472p9.f == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = c0472p9.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = c0472p9.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.j.remove(str);
                        if (B()) {
                            this.m.submit(this.n);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                C0441o9 c0441o9 = ((C0472p9) it.next()).f;
                if (c0441o9 != null) {
                    c0441o9.a();
                }
            }
            I();
            w(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C0441o9 y(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C0472p9 c0472p9 = (C0472p9) this.j.get(str);
                if (c0472p9 == null) {
                    c0472p9 = new C0472p9(this, str);
                    this.j.put(str, c0472p9);
                } else if (c0472p9.f != null) {
                    return null;
                }
                C0441o9 c0441o9 = new C0441o9(this, c0472p9);
                c0472p9.f = c0441o9;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                z(this.i);
                return c0441o9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
