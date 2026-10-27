package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0387mh implements Hb, InterfaceC0452ok, InterfaceC0053bl, Yi, InterfaceC0398ms {
    public static C0387mh b;
    public final /* synthetic */ int a;

    public /* synthetic */ C0387mh(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    public static final String f(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != ((byte) 10)) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == ((byte) 10)) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    byte[] bArr4 = Rr.a;
                    int i14 = b2 & 255;
                    z = z2;
                    i3 = i14;
                }
                byte b3 = bArr[i8 + i13];
                byte[] bArr5 = Rr.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z2 = z;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z2 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 < i15) {
                        length = i7;
                    } else if (length2 <= i15) {
                        Charset charset = StandardCharsets.UTF_8;
                        Tf.i("UTF_8", charset);
                        return new String(bArr, i8, i10, charset);
                    }
                }
                i6 = i2 + 1;
            } else {
                length = i7;
            }
            i5 = -1;
        }
        return null;
    }

    public static ArrayList g(List list) {
        Tf.j("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0268il) obj) != EnumC0268il.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0376m6.u0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0268il) it.next()).a);
        }
        return arrayList2;
    }

    public static RectF h(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.E || !(view instanceof C0150eq)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C0150eq c0150eq = (C0150eq) view;
        int contentWidth = c0150eq.getContentWidth();
        int contentHeight = c0150eq.getContentHeight();
        int iN = (int) Tf.n(c0150eq.getContext(), 24);
        if (contentWidth < iN) {
            contentWidth = iN;
        }
        int right = (c0150eq.getRight() + c0150eq.getLeft()) / 2;
        int bottom = (c0150eq.getBottom() + c0150eq.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static byte[] i(List list) {
        Tf.j("protocols", list);
        L4 l4 = new L4();
        for (String str : g(list)) {
            l4.G(str.length());
            l4.K(str);
        }
        return l4.z(l4.b);
    }

    public static Path j(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static boolean l() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private final void n() {
    }

    private final void p(int i, Serializable serializable) {
    }

    @Override // defpackage.InterfaceC0398ms
    public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.a) {
            case 28:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaMetadataRetriever.setDataSource(new C0367ls((ByteBuffer) obj));
                break;
        }
    }

    @Override // defpackage.InterfaceC0053bl
    public void b(int i, Serializable serializable) {
        String str;
        switch (this.a) {
            case 6:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC0053bl
    public void c() {
        switch (this.a) {
            case 6:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.InterfaceC0398ms
    public void d(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.a) {
            case 28:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                break;
            default:
                mediaExtractor.setDataSource(new C0367ls((ByteBuffer) obj));
                break;
        }
    }

    @Override // defpackage.InterfaceC0452ok
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    public int k(Object obj) {
        return ((C0506qc) obj).c;
    }

    public boolean m(Object obj) {
        return ((C0506qc) obj).d;
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 16:
                return new Ep(c0296jj.e(Uri.class, AssetFileDescriptor.class), 0);
            case 17:
                return new Ep(c0296jj.e(Uri.class, ParcelFileDescriptor.class), 0);
            case 18:
                return new Ep(c0296jj.e(Uri.class, InputStream.class), 0);
            case 25:
                return new Ep(c0296jj.e(C0046be.class, InputStream.class), 1);
            default:
                return new Mr(c0296jj.e(C0046be.class, InputStream.class));
        }
    }

    public void q(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFH = h(tabLayout, view);
        RectF rectFH2 = h(tabLayout, view2);
        drawable.setBounds(AbstractC0340l1.c((int) rectFH.left, (int) rectFH2.left, f), drawable.getBounds().top, AbstractC0340l1.c((int) rectFH.right, (int) rectFH2.right, f), drawable.getBounds().bottom);
    }

    @Override // defpackage.Hb
    public Object s() {
        switch (this.a) {
            case 0:
                return new C0418nh();
            default:
                try {
                    return new C0486pn(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "<NULL>";
            default:
                return super.toString();
        }
    }
}
