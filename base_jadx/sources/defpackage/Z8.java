package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Z8 {
    public final Executor a;
    public final InterfaceC0053bl b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public C0010a9[] g;
    public byte[] h;

    public Z8(AssetManager assetManager, Executor executor, InterfaceC0053bl interfaceC0053bl, String str, File file) {
        this.a = executor;
        this.b = interfaceC0053bl;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = F4.k;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = F4.j;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.b.c();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new M6(i, this, serializable, 2));
    }
}
