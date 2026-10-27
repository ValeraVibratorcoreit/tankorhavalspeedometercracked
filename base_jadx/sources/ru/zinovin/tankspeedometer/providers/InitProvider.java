package ru.zinovin.tankspeedometer.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import defpackage.AbstractC0402n1;
import defpackage.C0768yr;

/* JADX INFO: loaded from: classes.dex */
public class InitProvider extends ContentProvider {
    public static Context a;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C0768yr.e("T500.INIT_PROVIDER", "InitProvider.onCreate()");
        Context applicationContext = getContext().getApplicationContext();
        a = applicationContext;
        if (AbstractC0402n1.a == null) {
            AbstractC0402n1.a = applicationContext.getApplicationContext();
        }
        C0768yr.f(a);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
