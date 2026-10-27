package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0194g8 implements InterfaceC0009a8 {
    public final /* synthetic */ int a;
    public final Comparable b;
    public final Object c;
    public Object d;

    public /* synthetic */ C0194g8(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
    }

    public static C0194g8 b(Context context, Uri uri, Fq fq) {
        return new C0194g8(2, uri, new C0296jj(a.a(context).c.a().e(), fq, a.a(context).d, context.getContentResolver()));
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
                ((C0225h8) this.c).getClass();
                return InputStream.class;
            case 1:
                return ((C0225h8) this.c).l();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        switch (this.a) {
            case 0:
                try {
                    C0225h8 c0225h8 = (C0225h8) this.c;
                    ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) this.d;
                    c0225h8.getClass();
                    byteArrayInputStream.close();
                } catch (IOException unused) {
                    return;
                }
                break;
            case 1:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        ((C0225h8) this.c).h(obj);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
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
    public final void d(Uk uk, Z7 z7) throws Throwable {
        switch (this.a) {
            case 0:
                try {
                    C0225h8 c0225h8 = (C0225h8) this.c;
                    String str = (String) this.b;
                    c0225h8.getClass();
                    ByteArrayInputStream byteArrayInputStreamJ = C0225h8.j(str);
                    this.d = byteArrayInputStreamJ;
                    z7.m(byteArrayInputStreamJ);
                } catch (IllegalArgumentException e) {
                    z7.h(e);
                    return;
                }
                break;
            case 1:
                try {
                    Object objP = ((C0225h8) this.c).p((File) this.b);
                    this.d = objP;
                    z7.m(objP);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e2);
                    }
                    z7.h(e2);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamI = i();
                    this.d = inputStreamI;
                    z7.m(inputStreamI);
                } catch (FileNotFoundException e3) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e3);
                    }
                    z7.h(e3);
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

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[PHI: r6
      0x0032: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0055, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0046 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #9 {all -> 0x002a, blocks: (B:6:0x001b, B:8:0x0021, B:23:0x0040, B:25:0x0046), top: B:84:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0046, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002b: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:11:0x002b */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public InputStream i() throws Throwable {
        ?? r6;
        SecurityException e;
        Cursor cursorA;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        File file;
        InputStream inputStreamOpenInputStream;
        int iQ;
        Uri uri = (Uri) this.b;
        C0296jj c0296jj = (C0296jj) this.c;
        c0296jj.getClass();
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorA = ((Fq) c0296jj.a).a(uri);
                        if (cursorA != null) {
                            try {
                                if (cursorA.moveToFirst()) {
                                    string = cursorA.getString(0);
                                    cursorA.close();
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                                }
                                if (cursorA != null) {
                                }
                                string = null;
                                zIsEmpty = TextUtils.isEmpty(string);
                                contentResolver = (ContentResolver) c0296jj.c;
                                if (zIsEmpty) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    file = new File(string);
                                    if (file.exists()) {
                                        inputStreamOpenInputStream = null;
                                    } else {
                                        inputStreamOpenInputStream = null;
                                    }
                                }
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        try {
                                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                            iQ = Td.q((ArrayList) ((List) c0296jj.d), inputStreamOpenInputStream2, (C0634uh) c0296jj.b);
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Throwable th) {
                                            if (0 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException | NullPointerException e3) {
                                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e3);
                                        }
                                        if (inputStreamOpenInputStream2 != null) {
                                            try {
                                                inputStreamOpenInputStream2.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        iQ = -1;
                                    }
                                } else {
                                    iQ = -1;
                                }
                                if (iQ != -1) {
                                    return new Fb(inputStreamOpenInputStream, iQ);
                                }
                                return inputStreamOpenInputStream;
                            }
                            zIsEmpty = TextUtils.isEmpty(string);
                            contentResolver = (ContentResolver) c0296jj.c;
                            if (zIsEmpty) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists() || 0 >= file.length()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    Uri uriFromFile = Uri.fromFile(file);
                                    try {
                                        inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                    } catch (NullPointerException e4) {
                                        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
                                    }
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iQ = Td.q((ArrayList) ((List) c0296jj.d), inputStreamOpenInputStream2, (C0634uh) c0296jj.b);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } else {
                                iQ = -1;
                            }
                            if (iQ != -1) {
                                return new Fb(inputStreamOpenInputStream, iQ);
                            }
                            return inputStreamOpenInputStream;
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        cursorA = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        string = null;
                        zIsEmpty = TextUtils.isEmpty(string);
                        contentResolver = (ContentResolver) c0296jj.c;
                        if (zIsEmpty) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iQ = Td.q((ArrayList) ((List) c0296jj.d), inputStreamOpenInputStream2, (C0634uh) c0296jj.b);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iQ = -1;
                        }
                        if (iQ != -1) {
                            return new Fb(inputStreamOpenInputStream, iQ);
                        }
                        return inputStreamOpenInputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SecurityException e6) {
                e = e6;
            }
            string = null;
            zIsEmpty = TextUtils.isEmpty(string);
            contentResolver = (ContentResolver) c0296jj.c;
            if (zIsEmpty) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iQ = Td.q((ArrayList) ((List) c0296jj.d), inputStreamOpenInputStream2, (C0634uh) c0296jj.b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iQ = -1;
            }
            if (iQ != -1) {
                return new Fb(inputStreamOpenInputStream, iQ);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r5 = r6;
        }
    }
}
