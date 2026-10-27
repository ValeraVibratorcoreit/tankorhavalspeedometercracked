package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0329kl implements InterfaceC0009a8 {
    public static final String[] k = {"_data"};
    public final Context a;
    public final Xi b;
    public final Xi c;
    public final Uri d;
    public final int e;
    public final int f;
    public final C0544rk g;
    public final Class h;
    public volatile boolean i;
    public volatile InterfaceC0009a8 j;

    public C0329kl(Context context, Xi xi, Xi xi2, Uri uri, int i, int i2, C0544rk c0544rk, Class cls) {
        this.a = context.getApplicationContext();
        this.b = xi;
        this.c = xi2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = c0544rk;
        this.h = cls;
    }

    @Override // defpackage.InterfaceC0009a8
    public final Class a() {
        return this.h;
    }

    public final InterfaceC0009a8 b() throws Throwable {
        Wi wiB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.a;
        C0544rk c0544rk = this.g;
        int i = this.f;
        int i2 = this.e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            wiB = this.b.b(file, i2, i, c0544rk);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.d;
            boolean zO = Ud.O(requireOriginal);
            Xi xi = this.c;
            if (zO && requireOriginal.getPathSegments().contains("picker")) {
                wiB = xi.b(requireOriginal, i2, i, c0544rk);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                wiB = xi.b(requireOriginal, i2, i, c0544rk);
            }
        }
        if (wiB != null) {
            return wiB.c;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        InterfaceC0009a8 interfaceC0009a8 = this.j;
        if (interfaceC0009a8 != null) {
            interfaceC0009a8.c();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
        this.i = true;
        InterfaceC0009a8 interfaceC0009a8 = this.j;
        if (interfaceC0009a8 != null) {
            interfaceC0009a8.cancel();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) throws Throwable {
        try {
            InterfaceC0009a8 interfaceC0009a8B = b();
            if (interfaceC0009a8B == null) {
                z7.h(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = interfaceC0009a8B;
                if (this.i) {
                    cancel();
                } else {
                    interfaceC0009a8B.d(uk, z7);
                }
            }
        } catch (FileNotFoundException e) {
            z7.h(e);
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        return 1;
    }
}
