package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class G7 implements InterfaceC0015ae {
    public final Object a;
    public volatile Object b;

    public /* synthetic */ G7(Object obj) {
        this.a = obj;
    }

    public InterfaceC0286j9 a() {
        if (((InterfaceC0286j9) this.b) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0286j9) this.b) == null) {
                        C0096d2 c0096d2 = (C0096d2) ((C0308k0) this.a).b;
                        File cacheDir = ((Context) c0096d2.b).getCacheDir();
                        C0533r9 c0533r9 = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = (String) c0096d2.c;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            c0533r9 = new C0533r9(cacheDir);
                        }
                        this.b = c0533r9;
                    }
                    if (((InterfaceC0286j9) this.b) == null) {
                        this.b = new C0225h8(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC0286j9) this.b;
    }

    @Override // defpackage.InterfaceC0015ae
    public Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = ((InterfaceC0015ae) this.a).get();
                        Ud.l("Argument must not be null", obj);
                        this.b = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public G7() {
        this.a = new CopyOnWriteArraySet();
    }
}
