package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225h8 implements InterfaceC0286j9, InterfaceC0045bd, M9, Hb, Um, Qm {
    public static C0225h8 b;
    public static C0225h8 c;
    public final /* synthetic */ int a;

    public /* synthetic */ C0225h8(int i) {
        this.a = i;
    }

    public static String g(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) == 0 ? z4 : false;
        Tf.j("$this$canonicalize", str);
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            int i6 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || Mp.C0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !o(str, iCharCount, length)))) || (iCodePointAt == 43 && z7)))) {
                L4 l4 = new L4();
                l4.L(str, i4, iCharCount);
                L4 l5 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            l4.K(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i5 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z8) || Mp.C0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !o(str, iCharCount, length)))))) {
                            if (l5 == null) {
                                l5 = new L4();
                            }
                            l5.M(iCodePointAt2);
                            while (!l5.p()) {
                                byte b2 = l5.readByte();
                                l4.G(37);
                                char[] cArr = C0201gf.j;
                                l4.G(cArr[((b2 & 255) >> 4) & 15]);
                                l4.G(cArr[b2 & 15]);
                            }
                        } else {
                            l4.M(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                    i6 = 128;
                }
                return l4.A(l4.b, L5.a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static ByteArrayInputStream j(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public static int k(String str) {
        Tf.j("scheme", str);
        int iHashCode = str.hashCode();
        if (iHashCode != 3213448) {
            if (iHashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals("http")) {
            return 80;
        }
        return -1;
    }

    public static boolean n(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable == null || inputConnection == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z) {
            int iMax = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z2 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z2) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z2) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z2 = true;
                        }
                        selectionStart = -1;
                        break;
                    }
                }
            }
            selectionStart = -1;
            break;
            int iMax2 = Math.max(i2, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z3) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z3) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z3 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            iMin = Math.min(selectionEnd + i2, editable.length());
        }
        Gr[] grArr = (Gr[]) editable.getSpans(selectionStart, iMin, Gr.class);
        if (grArr == null || grArr.length <= 0) {
            return false;
        }
        for (Gr gr : grArr) {
            int spanStart = editable.getSpanStart(gr);
            int spanEnd = editable.getSpanEnd(gr);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static boolean o(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && Rr.q(str.charAt(i + 1)) != -1 && Rr.q(str.charAt(i3)) != -1;
    }

    public static String q(String str, int i, int i2, boolean z, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        Tf.j("$this$percentDecode", str);
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                L4 l4 = new L4();
                l4.L(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = Rr.q(str.charAt(iCharCount + 1));
                        int iQ2 = Rr.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            l4.M(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            l4.G((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        l4.G(32);
                        iCharCount++;
                    } else {
                        l4.M(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return l4.A(l4.b, L5.a);
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    private final void u(Object obj) {
    }

    public static ArrayList v(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iI0 = Mp.I0(str, '&', i, false, 4);
            if (iI0 == -1) {
                iI0 = str.length();
            }
            int iI1 = Mp.I0(str, '=', i, false, 4);
            if (iI1 == -1 || iI1 > iI0) {
                String strSubstring = str.substring(i, iI0);
                Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iI1);
                Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring2);
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iI1 + 1, iI0);
                Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring3);
                arrayList.add(strSubstring3);
            }
            i = iI0 + 1;
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC0045bd
    public void a(Activity activity) {
    }

    @Override // defpackage.InterfaceC0286j9
    public void b(InterfaceC0171fg interfaceC0171fg, K2 k2) {
    }

    @Override // defpackage.InterfaceC0286j9
    public File c(InterfaceC0171fg interfaceC0171fg) {
        return null;
    }

    @Override // defpackage.Wa
    public boolean d(Object obj, File file, C0544rk c0544rk) throws Throwable {
        try {
            AbstractC0099d5.d(((Pd) ((Id) ((Im) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // defpackage.M9
    public void e(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap) {
    }

    @Override // defpackage.M9
    public void f() {
    }

    public void h(Object obj) throws IOException {
        switch (this.a) {
            case 17:
                ((ParcelFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // defpackage.Qm
    public int i(C0544rk c0544rk) {
        return 1;
    }

    public Class l() {
        switch (this.a) {
            case 17:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    @Override // defpackage.Um
    public Im m(Im im, C0544rk c0544rk) {
        C0068c5 c0068c5;
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((Pd) ((Id) im.get()).a.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC0099d5.a;
        if (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) {
            c0068c5 = null;
        } else {
            c0068c5 = new C0068c5(byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit(), byteBufferAsReadOnlyBuffer.array());
        }
        if (c0068c5 == null || c0068c5.a != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (c0068c5.b == ((byte[]) c0068c5.c).length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new C0156f1(bArrArray);
    }

    public Object p(File file) {
        switch (this.a) {
            case 17:
                return ParcelFileDescriptor.open(file, 268435456);
            default:
                return new FileInputStream(file);
        }
    }

    public CharSequence r(Preference preference) {
        switch (this.a) {
            case 5:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                editTextPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.a.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                listPreference.getClass();
                if (TextUtils.isEmpty(null)) {
                    return listPreference.a.getString(R.string.not_set);
                }
                return null;
        }
    }

    @Override // defpackage.Hb
    public Object s() {
        return new ArrayList();
    }

    public void t(Object obj) {
        switch (this.a) {
            case 14:
                break;
            default:
                ((List) obj).clear();
                break;
        }
    }

    public C0225h8(C0096d2 c0096d2, Oc oc) {
        this.a = 28;
    }
}
