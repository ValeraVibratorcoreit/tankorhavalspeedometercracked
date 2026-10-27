package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0326ki implements InterfaceC0009a8 {
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C0326ki(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.InterfaceC0009a8
    public final Class a() {
        switch (this.a) {
            case 0:
                return File.class;
            default:
                return ((S4) this.c).a();
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        int i = this.a;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) {
        switch (this.a) {
            case 0:
                Cursor cursorQuery = ((Context) this.b).getContentResolver().query((Uri) this.c, d, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    z7.m(new File(string));
                    return;
                }
                z7.h(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.c)));
                return;
            default:
                z7.m(((S4) this.c).c((byte[]) this.b));
                return;
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }
}
