package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768yr {
    public static C0768yr g;
    public static final SimpleDateFormat h;
    public static final SimpleDateFormat i;
    public final Context a;
    public final HandlerThread c;
    public final Handler d;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = 0;

    static {
        Locale locale = Locale.US;
        h = new SimpleDateFormat("yyyy-MM-dd", locale);
        i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
    }

    public C0768yr(Context context) {
        this.a = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("TsLoggerThread");
        this.c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        handler.postDelayed(new RunnableC0737xr(this, 0), 3000L);
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
        C0768yr c0768yr = g;
        if (c0768yr != null) {
            c0768yr.g("ERROR", str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
        if (g != null) {
            String stackTraceString = Log.getStackTraceString(th);
            g.g("ERROR", str, str2 + "\n" + stackTraceString);
        }
    }

    public static File d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "ts_logs");
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.DIRECTORY_DOWNLOADS);
        return new File(externalStorageDirectory, Vo.h(sb, File.separator, "ts_logs"));
    }

    public static void e(String str, String str2) {
        Log.i(str, str2);
        C0768yr c0768yr = g;
        if (c0768yr != null) {
            c0768yr.g("INFO", str, str2);
        }
    }

    public static synchronized void f(Context context) {
        if (g == null) {
            g = new C0768yr(context);
        }
    }

    public final void a(File file) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f > 86400000) {
            this.f = jCurrentTimeMillis;
            File[] fileArrListFiles = file.listFiles(new R3(1));
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - 604800000;
            for (File file2 : fileArrListFiles) {
                try {
                    String name = file2.getName();
                    Date date = h.parse(name.substring(3, name.length() - 4));
                    if (date != null && date.getTime() < jCurrentTimeMillis2) {
                        file2.delete();
                    }
                } catch (Exception unused) {
                    if (file2.lastModified() < jCurrentTimeMillis2) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public final void g(String str, String str2, String str3) {
        boolean z;
        try {
            z = AbstractC0390mk.l(this.a).getBoolean("debugSwitch", false);
        } catch (Exception e) {
            Log.e("T500.TSLOG", "Error reading debug mode: " + e.getMessage());
            z = false;
        }
        if (z) {
            String str4 = i.format(new Date());
            ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
            concurrentLinkedQueue.offer(str4 + " [" + str + "] [" + str2 + "] - " + str3);
            if (concurrentLinkedQueue.size() < 20 || !this.e.compareAndSet(false, true)) {
                return;
            }
            this.d.post(new RunnableC0737xr(this, 1));
        }
    }

    public final void h() {
        RunnableC0737xr runnableC0737xr;
        Handler handler = this.d;
        AtomicBoolean atomicBoolean = this.e;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        try {
            try {
                String str = h.format(new Date());
                File fileD = d();
                if (!fileD.exists() && !fileD.mkdirs()) {
                    Log.e("T500.TSLOG", "Failed to create log directory");
                    atomicBoolean.set(false);
                    if (concurrentLinkedQueue.isEmpty() || !atomicBoolean.compareAndSet(false, true)) {
                        return;
                    }
                    handler.post(new RunnableC0737xr(this, 1));
                    return;
                }
                a(fileD);
                try {
                    FileWriter fileWriter = new FileWriter(new File(fileD, "ts_" + str + ".log"), true);
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (int i2 = 0; i2 < 20; i2++) {
                            try {
                                String str2 = (String) concurrentLinkedQueue.poll();
                                if (str2 == null) {
                                    break;
                                }
                                bufferedWriter.write(str2);
                                bufferedWriter.newLine();
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        if (!concurrentLinkedQueue.isEmpty() && concurrentLinkedQueue.size() < 20) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                bufferedWriter.write((String) it.next());
                                bufferedWriter.newLine();
                            }
                            concurrentLinkedQueue.clear();
                        }
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        fileWriter.close();
                        atomicBoolean.set(false);
                        if (concurrentLinkedQueue.isEmpty() || !atomicBoolean.compareAndSet(false, true)) {
                            return;
                        }
                        runnableC0737xr = new RunnableC0737xr(this, 1);
                        handler.post(runnableC0737xr);
                    } catch (Throwable th3) {
                        try {
                            fileWriter.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    Log.e("T500.TSLOG", "Failed to write log file", e);
                }
            } catch (Throwable th5) {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty() && atomicBoolean.compareAndSet(false, true)) {
                    handler.post(new RunnableC0737xr(this, 1));
                }
                throw th5;
            }
        } catch (Exception e2) {
            Log.e("T500.TSLOG", "Unexpected error", e2);
            atomicBoolean.set(false);
            if (!concurrentLinkedQueue.isEmpty() && atomicBoolean.compareAndSet(false, true)) {
                runnableC0737xr = new RunnableC0737xr(this, 1);
            }
        }
    }
}
