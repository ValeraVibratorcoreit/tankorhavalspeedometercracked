package ru.zinovin.jni;

/* JADX INFO: loaded from: classes.dex */
public abstract class JniUtils {
    static {
        System.loadLibrary("jni");
    }

    public static native String getData(Object obj);
}
