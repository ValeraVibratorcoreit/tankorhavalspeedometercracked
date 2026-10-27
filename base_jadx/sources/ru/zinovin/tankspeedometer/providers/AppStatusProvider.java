package ru.zinovin.tankspeedometer.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class AppStatusProvider extends ContentProvider {
    public static final Uri a = Uri.parse("content://ru.zinovin.tankspeedometer.provider/status");

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "vnd.android.cursor.dir/vnd.tankspeedometer.status";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri.equals(a)) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"isRunning", "serviceStatus"});
            matrixCursor.addRow(new Object[]{1, "Service is running"});
            return matrixCursor;
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported");
    }
}
