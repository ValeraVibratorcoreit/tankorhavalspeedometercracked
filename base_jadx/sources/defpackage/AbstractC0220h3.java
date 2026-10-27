package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0220h3 implements InterfaceC0009a8 {
    public final /* synthetic */ int a;
    public Object b;
    public final Comparable c;
    public final Object d;

    public /* synthetic */ AbstractC0220h3(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.d = obj;
        this.c = comparable;
    }

    private final void b() {
    }

    private final void f() {
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) {
        switch (this.a) {
            case 0:
                try {
                    Object objH = h((AssetManager) this.d, (String) this.c);
                    this.b = objH;
                    z7.m(objH);
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    z7.h(e);
                    return;
                }
                break;
            default:
                try {
                    Object objI = i((Uri) this.c, (ContentResolver) this.d);
                    this.b = objI;
                    z7.m(objI);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e2);
                    }
                    z7.h(e2);
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);
}
