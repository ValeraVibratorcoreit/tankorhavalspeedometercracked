package ru.zinovin.tankspeedometer.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import defpackage.AbstractC0390mk;
import defpackage.C0768yr;

/* JADX INFO: loaded from: classes.dex */
public class PrefsProvider extends ContentProvider {
    public static final Uri a = Uri.parse("content://ru.zinovin.tankspeedometer.prefsprovider/prefs");

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd.tankspeedometer.prefs";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C0768yr.e("T500.PP", "query received=" + str);
        if (!uri.equals(a)) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"value"});
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(getContext());
        String string = sharedPreferencesL.getString(str, null);
        if (str.equals("naviPackage") && "userapp".equals(string)) {
            string = sharedPreferencesL.getString("naviUserPackage", null);
        }
        matrixCursor.addRow(new Object[]{string});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
