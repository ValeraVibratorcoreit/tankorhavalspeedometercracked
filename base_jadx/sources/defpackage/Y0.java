package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends Handler {
    public static final Y0 a = new Y0();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        Tf.j("record", logRecord);
        CopyOnWriteArraySet copyOnWriteArraySet = X0.a;
        String loggerName = logRecord.getLoggerName();
        Tf.i("record.loggerName", loggerName);
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Tf.i("record.message", message);
        Throwable thrown = logRecord.getThrown();
        String strSubstring = (String) X0.b.get(loggerName);
        if (strSubstring == null) {
            int length = loggerName.length();
            if (23 <= length) {
                length = 23;
            }
            strSubstring = loggerName.substring(0, length);
            Tf.i("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        }
        if (Log.isLoggable(strSubstring, i)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length2 = message.length();
            int i2 = 0;
            while (i2 < length2) {
                int iI0 = Mp.I0(message, '\n', i2, false, 4);
                if (iI0 == -1) {
                    iI0 = length2;
                }
                while (true) {
                    iMin = Math.min(iI0, i2 + 4000);
                    String strSubstring2 = message.substring(i2, iMin);
                    Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring2);
                    Log.println(i, strSubstring, strSubstring2);
                    if (iMin >= iI0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
