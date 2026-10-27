package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0718x8 implements InterfaceC0416nf {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(InterfaceC0687w8 interfaceC0687w8, C0634uh c0634uh) {
        try {
            int iD = interfaceC0687w8.d();
            if ((iD & 65496) != 65496 && iD != 19789 && iD != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iD);
                }
                return -1;
            }
            int iG = g(interfaceC0687w8);
            if (iG == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) c0634uh.c(byte[].class, iG);
            try {
                return h(interfaceC0687w8, bArr, iG);
            } finally {
                c0634uh.g(bArr);
            }
        } catch (C0656v8 unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(InterfaceC0687w8 interfaceC0687w8) {
        try {
            int iD = interfaceC0687w8.d();
            if (iD == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iR = (iD << 8) | interfaceC0687w8.r();
            if (iR == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iR2 = (iR << 8) | interfaceC0687w8.r();
            if (iR2 == -1991225785) {
                interfaceC0687w8.a(21L);
                try {
                    return interfaceC0687w8.r() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0656v8 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iR2 == 1380533830) {
                interfaceC0687w8.a(4L);
                if (((interfaceC0687w8.d() << 16) | interfaceC0687w8.d()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iD2 = (interfaceC0687w8.d() << 16) | interfaceC0687w8.d();
                if ((iD2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iD2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC0687w8.a(4L);
                    return (interfaceC0687w8.r() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0687w8.a(4L);
                short sR = interfaceC0687w8.r();
                if ((sR & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sR & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0687w8.d() << 16) | interfaceC0687w8.d()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iD3 = (interfaceC0687w8.d() << 16) | interfaceC0687w8.d();
            if (iD3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iD3 == 1635150182;
            interfaceC0687w8.a(4L);
            int i3 = iR2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iD4 = (interfaceC0687w8.d() << 16) | interfaceC0687w8.d();
                    if (iD4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iD4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0656v8 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(InterfaceC0687w8 interfaceC0687w8) {
        short sR;
        int iD;
        long j;
        long jA;
        do {
            short sR2 = interfaceC0687w8.r();
            if (sR2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sR2));
                }
                return -1;
            }
            sR = interfaceC0687w8.r();
            if (sR == 218) {
                return -1;
            }
            if (sR == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iD = interfaceC0687w8.d() - 2;
            if (sR == 225) {
                return iD;
            }
            j = iD;
            jA = interfaceC0687w8.a(j);
        } while (jA == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sR) + ", wanted to skip: " + iD + ", but actually skipped: " + jA);
        }
        return -1;
    }

    public static int h(InterfaceC0687w8 interfaceC0687w8, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iQ = interfaceC0687w8.q(bArr, i);
        if (iQ != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iQ);
            }
            return -1;
        }
        short s = 1;
        int i2 = 0;
        byte[] bArr2 = a;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        C0006a5 c0006a5 = new C0006a5(bArr, i);
        short sB = c0006a5.b(6);
        if (sB != 18761) {
            if (sB != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sB));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        ByteBuffer byteBuffer = c0006a5.b;
        byteBuffer.order(byteOrder);
        int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sB2 = c0006a5.b(i4 + 6);
        while (i2 < sB2) {
            int i5 = (i2 * 12) + i4 + 8;
            short sB3 = c0006a5.b(i5);
            if (sB3 == 274) {
                short sB4 = c0006a5.b(i5 + 2);
                if (sB4 >= s && sB4 <= 12) {
                    int i6 = i5 + 4;
                    int i7 = byteBuffer.remaining() - i6 >= 4 ? byteBuffer.getInt(i6) : -1;
                    if (i7 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i2 + " tagType=" + ((int) sB3) + " formatCode=" + ((int) sB4) + " componentCount=" + i7);
                        }
                        int i8 = i7 + b[sB4];
                        if (i8 <= 4) {
                            int i9 = i5 + 8;
                            if (i9 >= 0 && i9 <= byteBuffer.remaining()) {
                                if (i8 >= 0 && i8 + i9 <= byteBuffer.remaining()) {
                                    return c0006a5.b(i9);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sB3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i9 + " tagType=" + ((int) sB3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sB4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sB4));
                }
            }
            i2++;
            s = 1;
        }
        return -1;
    }

    @Override // defpackage.InterfaceC0416nf
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        Ud.l("Argument must not be null", byteBuffer);
        return f(new C0006a5(byteBuffer, 1));
    }

    @Override // defpackage.InterfaceC0416nf
    public final int b(InputStream inputStream, C0634uh c0634uh) {
        Ud.l("Argument must not be null", inputStream);
        C0308k0 c0308k0 = new C0308k0(inputStream, 10);
        Ud.l("Argument must not be null", c0634uh);
        return e(c0308k0, c0634uh);
    }

    @Override // defpackage.InterfaceC0416nf
    public final int c(ByteBuffer byteBuffer, C0634uh c0634uh) {
        Ud.l("Argument must not be null", byteBuffer);
        C0006a5 c0006a5 = new C0006a5(byteBuffer, 1);
        Ud.l("Argument must not be null", c0634uh);
        return e(c0006a5, c0634uh);
    }

    @Override // defpackage.InterfaceC0416nf
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        Ud.l("Argument must not be null", inputStream);
        return f(new C0308k0(inputStream, 10));
    }
}
