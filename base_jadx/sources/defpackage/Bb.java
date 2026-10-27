package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class Bb {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final C0752yb E;
    public static final C0752yb[][] F;
    public static final C0752yb[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final HashSet J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = new byte[]{101, 88, 73, 102};
        w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0752yb[] c0752ybArr = {new C0752yb("NewSubfileType", 254, 4), new C0752yb("SubfileType", 255, 4), new C0752yb("ImageWidth", 256, 3, 4), new C0752yb("ImageLength", 257, 3, 4), new C0752yb("BitsPerSample", 258, 3), new C0752yb("Compression", 259, 3), new C0752yb("PhotometricInterpretation", 262, 3), new C0752yb("ImageDescription", 270, 2), new C0752yb("Make", 271, 2), new C0752yb("Model", 272, 2), new C0752yb("StripOffsets", 273, 3, 4), new C0752yb("Orientation", 274, 3), new C0752yb("SamplesPerPixel", 277, 3), new C0752yb("RowsPerStrip", 278, 3, 4), new C0752yb("StripByteCounts", 279, 3, 4), new C0752yb("XResolution", 282, 5), new C0752yb("YResolution", 283, 5), new C0752yb("PlanarConfiguration", 284, 3), new C0752yb("ResolutionUnit", 296, 3), new C0752yb("TransferFunction", 301, 3), new C0752yb("Software", 305, 2), new C0752yb("DateTime", 306, 2), new C0752yb("Artist", 315, 2), new C0752yb("WhitePoint", 318, 5), new C0752yb("PrimaryChromaticities", 319, 5), new C0752yb("SubIFDPointer", 330, 4), new C0752yb("JPEGInterchangeFormat", 513, 4), new C0752yb("JPEGInterchangeFormatLength", 514, 4), new C0752yb("YCbCrCoefficients", 529, 5), new C0752yb("YCbCrSubSampling", 530, 3), new C0752yb("YCbCrPositioning", 531, 3), new C0752yb("ReferenceBlackWhite", 532, 5), new C0752yb("Copyright", 33432, 2), new C0752yb("ExifIFDPointer", 34665, 4), new C0752yb("GPSInfoIFDPointer", 34853, 4), new C0752yb("SensorTopBorder", 4, 4), new C0752yb("SensorLeftBorder", 5, 4), new C0752yb("SensorBottomBorder", 6, 4), new C0752yb("SensorRightBorder", 7, 4), new C0752yb("ISO", 23, 3), new C0752yb("JpgFromRaw", 46, 7), new C0752yb("Xmp", 700, 1)};
        C0752yb[] c0752ybArr2 = {new C0752yb("ExposureTime", 33434, 5), new C0752yb("FNumber", 33437, 5), new C0752yb("ExposureProgram", 34850, 3), new C0752yb("SpectralSensitivity", 34852, 2), new C0752yb("PhotographicSensitivity", 34855, 3), new C0752yb("OECF", 34856, 7), new C0752yb("SensitivityType", 34864, 3), new C0752yb("StandardOutputSensitivity", 34865, 4), new C0752yb("RecommendedExposureIndex", 34866, 4), new C0752yb("ISOSpeed", 34867, 4), new C0752yb("ISOSpeedLatitudeyyy", 34868, 4), new C0752yb("ISOSpeedLatitudezzz", 34869, 4), new C0752yb("ExifVersion", 36864, 2), new C0752yb("DateTimeOriginal", 36867, 2), new C0752yb("DateTimeDigitized", 36868, 2), new C0752yb("OffsetTime", 36880, 2), new C0752yb("OffsetTimeOriginal", 36881, 2), new C0752yb("OffsetTimeDigitized", 36882, 2), new C0752yb("ComponentsConfiguration", 37121, 7), new C0752yb("CompressedBitsPerPixel", 37122, 5), new C0752yb("ShutterSpeedValue", 37377, 10), new C0752yb("ApertureValue", 37378, 5), new C0752yb("BrightnessValue", 37379, 10), new C0752yb("ExposureBiasValue", 37380, 10), new C0752yb("MaxApertureValue", 37381, 5), new C0752yb("SubjectDistance", 37382, 5), new C0752yb("MeteringMode", 37383, 3), new C0752yb("LightSource", 37384, 3), new C0752yb("Flash", 37385, 3), new C0752yb("FocalLength", 37386, 5), new C0752yb("SubjectArea", 37396, 3), new C0752yb("MakerNote", 37500, 7), new C0752yb("UserComment", 37510, 7), new C0752yb("SubSecTime", 37520, 2), new C0752yb("SubSecTimeOriginal", 37521, 2), new C0752yb("SubSecTimeDigitized", 37522, 2), new C0752yb("FlashpixVersion", 40960, 7), new C0752yb("ColorSpace", 40961, 3), new C0752yb("PixelXDimension", 40962, 3, 4), new C0752yb("PixelYDimension", 40963, 3, 4), new C0752yb("RelatedSoundFile", 40964, 2), new C0752yb("InteroperabilityIFDPointer", 40965, 4), new C0752yb("FlashEnergy", 41483, 5), new C0752yb("SpatialFrequencyResponse", 41484, 7), new C0752yb("FocalPlaneXResolution", 41486, 5), new C0752yb("FocalPlaneYResolution", 41487, 5), new C0752yb("FocalPlaneResolutionUnit", 41488, 3), new C0752yb("SubjectLocation", 41492, 3), new C0752yb("ExposureIndex", 41493, 5), new C0752yb("SensingMethod", 41495, 3), new C0752yb("FileSource", 41728, 7), new C0752yb("SceneType", 41729, 7), new C0752yb("CFAPattern", 41730, 7), new C0752yb("CustomRendered", 41985, 3), new C0752yb("ExposureMode", 41986, 3), new C0752yb("WhiteBalance", 41987, 3), new C0752yb("DigitalZoomRatio", 41988, 5), new C0752yb("FocalLengthIn35mmFilm", 41989, 3), new C0752yb("SceneCaptureType", 41990, 3), new C0752yb("GainControl", 41991, 3), new C0752yb("Contrast", 41992, 3), new C0752yb("Saturation", 41993, 3), new C0752yb("Sharpness", 41994, 3), new C0752yb("DeviceSettingDescription", 41995, 7), new C0752yb("SubjectDistanceRange", 41996, 3), new C0752yb("ImageUniqueID", 42016, 2), new C0752yb("CameraOwnerName", 42032, 2), new C0752yb("BodySerialNumber", 42033, 2), new C0752yb("LensSpecification", 42034, 5), new C0752yb("LensMake", 42035, 2), new C0752yb("LensModel", 42036, 2), new C0752yb("Gamma", 42240, 5), new C0752yb("DNGVersion", 50706, 1), new C0752yb("DefaultCropSize", 50720, 3, 4)};
        C0752yb[] c0752ybArr3 = {new C0752yb("GPSVersionID", 0, 1), new C0752yb("GPSLatitudeRef", 1, 2), new C0752yb("GPSLatitude", 2, 5, 10), new C0752yb("GPSLongitudeRef", 3, 2), new C0752yb("GPSLongitude", 4, 5, 10), new C0752yb("GPSAltitudeRef", 5, 1), new C0752yb("GPSAltitude", 6, 5), new C0752yb("GPSTimeStamp", 7, 5), new C0752yb("GPSSatellites", 8, 2), new C0752yb("GPSStatus", 9, 2), new C0752yb("GPSMeasureMode", 10, 2), new C0752yb("GPSDOP", 11, 5), new C0752yb("GPSSpeedRef", 12, 2), new C0752yb("GPSSpeed", 13, 5), new C0752yb("GPSTrackRef", 14, 2), new C0752yb("GPSTrack", 15, 5), new C0752yb("GPSImgDirectionRef", 16, 2), new C0752yb("GPSImgDirection", 17, 5), new C0752yb("GPSMapDatum", 18, 2), new C0752yb("GPSDestLatitudeRef", 19, 2), new C0752yb("GPSDestLatitude", 20, 5), new C0752yb("GPSDestLongitudeRef", 21, 2), new C0752yb("GPSDestLongitude", 22, 5), new C0752yb("GPSDestBearingRef", 23, 2), new C0752yb("GPSDestBearing", 24, 5), new C0752yb("GPSDestDistanceRef", 25, 2), new C0752yb("GPSDestDistance", 26, 5), new C0752yb("GPSProcessingMethod", 27, 7), new C0752yb("GPSAreaInformation", 28, 7), new C0752yb("GPSDateStamp", 29, 2), new C0752yb("GPSDifferential", 30, 3), new C0752yb("GPSHPositioningError", 31, 5)};
        C0752yb[] c0752ybArr4 = {new C0752yb("InteroperabilityIndex", 1, 2)};
        C0752yb[] c0752ybArr5 = {new C0752yb("NewSubfileType", 254, 4), new C0752yb("SubfileType", 255, 4), new C0752yb("ThumbnailImageWidth", 256, 3, 4), new C0752yb("ThumbnailImageLength", 257, 3, 4), new C0752yb("BitsPerSample", 258, 3), new C0752yb("Compression", 259, 3), new C0752yb("PhotometricInterpretation", 262, 3), new C0752yb("ImageDescription", 270, 2), new C0752yb("Make", 271, 2), new C0752yb("Model", 272, 2), new C0752yb("StripOffsets", 273, 3, 4), new C0752yb("ThumbnailOrientation", 274, 3), new C0752yb("SamplesPerPixel", 277, 3), new C0752yb("RowsPerStrip", 278, 3, 4), new C0752yb("StripByteCounts", 279, 3, 4), new C0752yb("XResolution", 282, 5), new C0752yb("YResolution", 283, 5), new C0752yb("PlanarConfiguration", 284, 3), new C0752yb("ResolutionUnit", 296, 3), new C0752yb("TransferFunction", 301, 3), new C0752yb("Software", 305, 2), new C0752yb("DateTime", 306, 2), new C0752yb("Artist", 315, 2), new C0752yb("WhitePoint", 318, 5), new C0752yb("PrimaryChromaticities", 319, 5), new C0752yb("SubIFDPointer", 330, 4), new C0752yb("JPEGInterchangeFormat", 513, 4), new C0752yb("JPEGInterchangeFormatLength", 514, 4), new C0752yb("YCbCrCoefficients", 529, 5), new C0752yb("YCbCrSubSampling", 530, 3), new C0752yb("YCbCrPositioning", 531, 3), new C0752yb("ReferenceBlackWhite", 532, 5), new C0752yb("Copyright", 33432, 2), new C0752yb("ExifIFDPointer", 34665, 4), new C0752yb("GPSInfoIFDPointer", 34853, 4), new C0752yb("DNGVersion", 50706, 1), new C0752yb("DefaultCropSize", 50720, 3, 4)};
        E = new C0752yb("StripOffsets", 273, 3);
        F = new C0752yb[][]{c0752ybArr, c0752ybArr2, c0752ybArr3, c0752ybArr4, c0752ybArr5, c0752ybArr, new C0752yb[]{new C0752yb("ThumbnailImage", 256, 7), new C0752yb("CameraSettingsIFDPointer", 8224, 4), new C0752yb("ImageProcessingIFDPointer", 8256, 4)}, new C0752yb[]{new C0752yb("PreviewImageStart", 257, 4), new C0752yb("PreviewImageLength", 258, 4)}, new C0752yb[]{new C0752yb("AspectFrame", 4371, 3)}, new C0752yb[]{new C0752yb("ColorSpace", 55, 3)}};
        G = new C0752yb[]{new C0752yb("SubIFDPointer", 330, 4), new C0752yb("ExifIFDPointer", 34665, 4), new C0752yb("GPSInfoIFDPointer", 34853, 4), new C0752yb("InteroperabilityIFDPointer", 40965, 4), new C0752yb("CameraSettingsIFDPointer", 8224, 1), new C0752yb("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        L = charsetForName;
        M = "Exif\u0000\u0000".getBytes(charsetForName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0752yb[][] c0752ybArr6 = F;
            if (i >= c0752ybArr6.length) {
                HashMap map = K;
                C0752yb[] c0752ybArr7 = G;
                map.put(Integer.valueOf(c0752ybArr7[0].a), 5);
                map.put(Integer.valueOf(c0752ybArr7[1].a), 1);
                map.put(Integer.valueOf(c0752ybArr7[2].a), 2);
                map.put(Integer.valueOf(c0752ybArr7[3].a), 3);
                map.put(Integer.valueOf(c0752ybArr7[4].a), 7);
                map.put(Integer.valueOf(c0752ybArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (C0752yb c0752yb : c0752ybArr6[i]) {
                H[i].put(Integer.valueOf(c0752yb.a), c0752yb);
                I[i].put(c0752yb.b, c0752yb);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00da A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0060, blocks: (B:16:0x0051, B:18:0x0054, B:25:0x0069, B:31:0x0086, B:33:0x0091, B:41:0x00a7, B:36:0x0098, B:39:0x00a0, B:40:0x00a4, B:42:0x00b1, B:44:0x00ba, B:46:0x00c0, B:48:0x00c6, B:50:0x00cc, B:55:0x00da), top: B:67:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public Bb(InputStream inputStream) throws IOException {
        C0752yb[][] c0752ybArr = F;
        this.d = new HashMap[c0752ybArr.length];
        this.e = new HashSet(c0752ybArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = l;
        if (z2) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Db.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z3) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        for (int i = 0; i < c0752ybArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            C0690wb c0690wb = new C0690wb(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                e(c0690wb, 0, 0);
            } else if (i2 == 13) {
                h(c0690wb);
            } else if (i2 == 9) {
                i(c0690wb);
            } else if (i2 == 14) {
                l(c0690wb);
            }
        } else {
            Ab ab = new Ab(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12) {
                d(ab);
            } else if (i3 == 7) {
                g(ab);
            } else if (i3 == 10) {
                k(ab);
            } else {
                j(ab);
            }
            ab.w(this.h);
            u(ab);
        }
        a();
        if (!z3) {
            return;
        }
        p();
    }

    public static ByteOrder q(C0690wb c0690wb) throws IOException {
        short s2 = c0690wb.readShort();
        boolean z2 = l;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(L);
            map.put("DateTime", new C0721xb(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C0721xb.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C0721xb.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", C0721xb.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", C0721xb.a(0L, this.f));
        }
    }

    public final String b(String str) {
        C0721xb c0721xbC = c(str);
        if (c0721xbC != null) {
            if (!J.contains(str)) {
                return c0721xbC.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c0721xbC.a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C0783zb[] c0783zbArr = (C0783zb[]) c0721xbC.g(this.f);
                if (c0783zbArr == null || c0783zbArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0783zbArr));
                    return null;
                }
                C0783zb c0783zb = c0783zbArr[0];
                Integer numValueOf = Integer.valueOf((int) (c0783zb.a / c0783zb.b));
                C0783zb c0783zb2 = c0783zbArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c0783zb2.a / c0783zb2.b));
                C0783zb c0783zb3 = c0783zbArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0783zb3.a / c0783zb3.b)));
            }
            try {
                return Double.toString(c0721xbC.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C0721xb c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            C0721xb c0721xb = (C0721xb) this.d[i].get(str);
            if (c0721xb != null) {
                return c0721xb;
            }
        }
        return null;
    }

    public final void d(Ab ab) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                Eb.a(mediaMetadataRetriever, new C0659vb(ab));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C0721xb.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C0721xb.c(Integer.parseInt(strExtractMetadata2), this.f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", C0721xb.c(i, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    ab.w(i3);
                    byte[] bArr = new byte[6];
                    if (ab.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (ab.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i5;
                    r(bArr2, 0);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[LOOP:2: B:69:0x013c->B:74:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d A[LOOP:0: B:10:0x0034->B:82:0x018d, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(defpackage.C0690wb r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Bb.e(wb, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0138  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140 A[LOOP:2: B:108:0x0133->B:113:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x0149  */
    /* JADX WARN: Code duplicated, block: B:121:0x014f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0157 A[LOOP:3: B:119:0x014a->B:124:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0160  */
    /* JADX WARN: Code duplicated, block: B:131:0x016a A[LOOP:4: B:126:0x015b->B:131:0x016a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0155 A[EDGE_INSN: B:165:0x0155->B:123:0x0155 BREAK  A[LOOP:3: B:119:0x014a->B:124:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0155 A[EDGE_INSN: B:166:0x0155->B:123:0x0155 BREAK  A[LOOP:3: B:119:0x014a->B:124:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        ?? r6;
        C0690wb c0690wb;
        C0690wb c0690wb2;
        C0690wb c0690wb3;
        boolean z2;
        C0690wb c0690wb4;
        C0690wb c0690wb5;
        boolean z3;
        int i;
        byte[] bArr;
        boolean z4;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        boolean z5;
        C0690wb c0690wb6;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = o;
            if (i4 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i4] != bArr5[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    byte b = bArr4[i5];
                    ?? r8 = bytes[i5];
                    try {
                        if (b != r8) {
                            try {
                                c0690wb = new C0690wb(bArr4);
                                try {
                                    long j2 = c0690wb.readInt();
                                    byte[] bArr6 = new byte[4];
                                    c0690wb.read(bArr6);
                                    if (Arrays.equals(bArr6, p)) {
                                        if (j2 == 1) {
                                            j2 = c0690wb.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                        } else {
                                            j = 8;
                                        }
                                        long j3 = 5000;
                                        if (j2 > j3) {
                                            j2 = j3;
                                        }
                                        long j4 = j2 - j;
                                        if (j4 >= 8) {
                                            byte[] bArr7 = new byte[4];
                                            boolean z6 = false;
                                            boolean z7 = false;
                                            for (long j5 = 0; j5 < j4 / 4 && c0690wb.read(bArr7) == 4; j5++) {
                                                if (j5 != 1) {
                                                    if (Arrays.equals(bArr7, q)) {
                                                        z6 = true;
                                                    } else if (Arrays.equals(bArr7, r)) {
                                                        z7 = true;
                                                    }
                                                    if (z6 && z7) {
                                                        c0690wb.close();
                                                        return 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (c0690wb != null) {
                                    }
                                    c0690wb3 = new C0690wb(bArr4);
                                    try {
                                        ByteOrder byteOrderQ = q(c0690wb3);
                                        this.f = byteOrderQ;
                                        c0690wb3.b = byteOrderQ;
                                        s2 = c0690wb3.readShort();
                                        if (s2 != 20306) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        c0690wb3.close();
                                    } catch (Exception unused) {
                                        if (c0690wb3 != null) {
                                            c0690wb3.close();
                                        }
                                        z2 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        c0690wb2 = c0690wb3;
                                        if (c0690wb2 != null) {
                                            c0690wb2.close();
                                        }
                                        throw th;
                                    }
                                    if (z2) {
                                        return 7;
                                    }
                                    try {
                                        c0690wb6 = new C0690wb(bArr4);
                                        try {
                                            ByteOrder byteOrderQ2 = q(c0690wb6);
                                            this.f = byteOrderQ2;
                                            c0690wb6.b = byteOrderQ2;
                                            if (c0690wb6.readShort() == 85) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            c0690wb6.close();
                                        } catch (Exception unused2) {
                                            c0690wb5 = c0690wb6;
                                            if (c0690wb5 != null) {
                                                c0690wb5.close();
                                            }
                                            z3 = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0690wb4 = c0690wb6;
                                            if (c0690wb4 != null) {
                                                c0690wb4.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception unused3) {
                                        c0690wb5 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c0690wb4 = null;
                                    }
                                    if (z3) {
                                        return 10;
                                    }
                                    i = 0;
                                    while (true) {
                                        bArr = u;
                                        if (i < bArr.length) {
                                            z4 = true;
                                            break;
                                        }
                                        if (bArr4[i] != bArr[i]) {
                                            z4 = false;
                                            break;
                                        }
                                        i++;
                                    }
                                    if (z4) {
                                        return 13;
                                    }
                                    i2 = 0;
                                    while (true) {
                                        bArr2 = y;
                                        if (i2 < bArr2.length) {
                                            i3 = 0;
                                            while (true) {
                                                bArr3 = z;
                                                if (i3 < bArr3.length) {
                                                    z5 = true;
                                                } else {
                                                    if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                                if (z5) {
                                                    return 14;
                                                }
                                                return 0;
                                            }
                                        }
                                        if (bArr4[i2] != bArr2[i2]) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    z5 = false;
                                    if (z5) {
                                        return 14;
                                    }
                                    return 0;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                c0690wb = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r6 = 0;
                                if (r6 != 0) {
                                    r6.close();
                                }
                                throw th;
                            }
                            c0690wb.close();
                            try {
                                c0690wb3 = new C0690wb(bArr4);
                                ByteOrder byteOrderQ3 = q(c0690wb3);
                                this.f = byteOrderQ3;
                                c0690wb3.b = byteOrderQ3;
                                s2 = c0690wb3.readShort();
                                if (s2 != 20306 || s2 == 21330) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c0690wb3.close();
                            } catch (Exception unused4) {
                                c0690wb3 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                c0690wb2 = null;
                            }
                            if (z2) {
                                return 7;
                            }
                            c0690wb6 = new C0690wb(bArr4);
                            ByteOrder byteOrderQ4 = q(c0690wb6);
                            this.f = byteOrderQ4;
                            c0690wb6.b = byteOrderQ4;
                            if (c0690wb6.readShort() == 85) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c0690wb6.close();
                            if (z3) {
                                return 10;
                            }
                            i = 0;
                            while (true) {
                                bArr = u;
                                if (i < bArr.length) {
                                    z4 = true;
                                    break;
                                }
                                if (bArr4[i] != bArr[i]) {
                                    z4 = false;
                                    break;
                                }
                                i++;
                            }
                            if (z4) {
                                return 13;
                            }
                            i2 = 0;
                            while (true) {
                                bArr2 = y;
                                if (i2 < bArr2.length) {
                                    i3 = 0;
                                    while (true) {
                                        bArr3 = z;
                                        if (i3 < bArr3.length) {
                                            z5 = true;
                                        } else {
                                            if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                                break;
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (z5) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                }
                                if (bArr4[i2] != bArr2[i2]) {
                                    break;
                                    break;
                                }
                                i2++;
                            }
                            z5 = false;
                            if (z5) {
                                return 14;
                            }
                            return 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r6 = r8;
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void g(Ab ab) throws Throwable {
        int i;
        int i2;
        j(ab);
        HashMap[] mapArr = this.d;
        C0721xb c0721xb = (C0721xb) mapArr[1].get("MakerNote");
        if (c0721xb != null) {
            Ab ab2 = new Ab(c0721xb.d);
            ab2.b = this.f;
            byte[] bArr = s;
            byte[] bArr2 = new byte[bArr.length];
            ab2.readFully(bArr2);
            ab2.w(0L);
            byte[] bArr3 = t;
            byte[] bArr4 = new byte[bArr3.length];
            ab2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                ab2.w(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                ab2.w(12L);
            }
            s(ab2, 6);
            C0721xb c0721xb2 = (C0721xb) mapArr[7].get("PreviewImageStart");
            C0721xb c0721xb3 = (C0721xb) mapArr[7].get("PreviewImageLength");
            if (c0721xb2 != null && c0721xb3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c0721xb2);
                mapArr[5].put("JPEGInterchangeFormatLength", c0721xb3);
            }
            C0721xb c0721xb4 = (C0721xb) mapArr[8].get("AspectFrame");
            if (c0721xb4 != null) {
                int[] iArr = (int[]) c0721xb4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C0721xb c0721xbC = C0721xb.c(i5, this.f);
                C0721xb c0721xbC2 = C0721xb.c(i6, this.f);
                mapArr[0].put("ImageWidth", c0721xbC);
                mapArr[0].put("ImageLength", c0721xbC2);
            }
        }
    }

    public final void h(C0690wb c0690wb) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0690wb);
        }
        c0690wb.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = u;
        c0690wb.n(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c0690wb.readInt();
                byte[] bArr2 = new byte[4];
                if (c0690wb.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, x)) {
                    return;
                }
                if (Arrays.equals(bArr2, v)) {
                    byte[] bArr3 = new byte[i];
                    if (c0690wb.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + Td.b(bArr2));
                    }
                    int i3 = c0690wb.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.h = i2;
                        r(bArr3, 0);
                        x();
                        u(new C0690wb(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c0690wb.n(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C0690wb c0690wb) throws Throwable {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0690wb);
        }
        c0690wb.n(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0690wb.read(bArr);
        c0690wb.read(bArr2);
        c0690wb.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0690wb.n(i - c0690wb.c);
        c0690wb.read(bArr4);
        e(new C0690wb(bArr4), i, 5);
        c0690wb.n(i3 - c0690wb.c);
        c0690wb.b = ByteOrder.BIG_ENDIAN;
        int i4 = c0690wb.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c0690wb.readUnsignedShort();
            int unsignedShort2 = c0690wb.readUnsignedShort();
            if (unsignedShort == E.a) {
                short s2 = c0690wb.readShort();
                short s3 = c0690wb.readShort();
                C0721xb c0721xbC = C0721xb.c(s2, this.f);
                C0721xb c0721xbC2 = C0721xb.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", c0721xbC);
                mapArr[0].put("ImageWidth", c0721xbC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            c0690wb.n(unsignedShort2);
        }
    }

    public final void j(Ab ab) throws Throwable {
        o(ab);
        s(ab, 0);
        w(ab, 0);
        w(ab, 5);
        w(ab, 4);
        x();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            C0721xb c0721xb = (C0721xb) mapArr[1].get("MakerNote");
            if (c0721xb != null) {
                Ab ab2 = new Ab(c0721xb.d);
                ab2.b = this.f;
                ab2.n(6);
                s(ab2, 9);
                C0721xb c0721xb2 = (C0721xb) mapArr[9].get("ColorSpace");
                if (c0721xb2 != null) {
                    mapArr[1].put("ColorSpace", c0721xb2);
                }
            }
        }
    }

    public final void k(Ab ab) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + ab);
        }
        j(ab);
        HashMap[] mapArr = this.d;
        C0721xb c0721xb = (C0721xb) mapArr[0].get("JpgFromRaw");
        if (c0721xb != null) {
            e(new C0690wb(c0721xb.d), (int) c0721xb.c, 5);
        }
        C0721xb c0721xb2 = (C0721xb) mapArr[0].get("ISO");
        C0721xb c0721xb3 = (C0721xb) mapArr[1].get("PhotographicSensitivity");
        if (c0721xb2 == null || c0721xb3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c0721xb2);
    }

    public final void l(C0690wb c0690wb) throws Throwable {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0690wb);
        }
        c0690wb.b = ByteOrder.LITTLE_ENDIAN;
        c0690wb.n(y.length);
        int i = c0690wb.readInt() + 8;
        byte[] bArr = z;
        c0690wb.n(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0690wb.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c0690wb.readInt();
                int i3 = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c0690wb.read(bArr3) == i2) {
                        this.h = i3;
                        r(bArr3, 0);
                        u(new C0690wb(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + Td.b(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0690wb.n(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C0690wb c0690wb, HashMap map) throws Throwable {
        C0721xb c0721xb = (C0721xb) map.get("JPEGInterchangeFormat");
        C0721xb c0721xb2 = (C0721xb) map.get("JPEGInterchangeFormatLength");
        if (c0721xb == null || c0721xb2 == null) {
            return;
        }
        int iE = c0721xb.e(this.f);
        int iE2 = c0721xb2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.b == null && this.a == null) {
            c0690wb.skip(iE);
            c0690wb.read(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        C0721xb c0721xb = (C0721xb) map.get("ImageLength");
        C0721xb c0721xb2 = (C0721xb) map.get("ImageWidth");
        if (c0721xb == null || c0721xb2 == null) {
            return false;
        }
        return c0721xb.e(this.f) <= 512 && c0721xb2.e(this.f) <= 512;
    }

    public final void o(C0690wb c0690wb) throws IOException {
        ByteOrder byteOrderQ = q(c0690wb);
        this.f = byteOrderQ;
        c0690wb.b = byteOrderQ;
        int unsignedShort = c0690wb.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c0690wb.readInt();
        if (i2 < 8) {
            throw new IOException(Vo.e(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c0690wb.n(i3);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + mapArr[i].size());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C0721xb c0721xb = (C0721xb) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0721xb.toString() + ", tagValue: '" + c0721xb.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void r(byte[] bArr, int i) throws IOException {
        Ab ab = new Ab(bArr);
        o(ab);
        s(ab, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0202  */
    /* JADX WARN: Code duplicated, block: B:107:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0218  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:111:0x022b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0244  */
    /* JADX WARN: Code duplicated, block: B:116:0x0251  */
    /* JADX WARN: Code duplicated, block: B:118:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0260  */
    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0283  */
    /* JADX WARN: Code duplicated, block: B:124:0x029c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x030e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01db  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x0260, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0283, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x012e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0155, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01db, please report this as an issue */
    public final void s(Ab ab, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        boolean z2;
        int i2;
        Integer num;
        long j2;
        String str;
        int i3;
        int unsignedShort;
        long j3;
        HashSet hashSet;
        int i4;
        Integer numValueOf = Integer.valueOf(ab.c);
        HashSet hashSet2 = this.e;
        hashSet2.add(numValueOf);
        short s2 = ab.readShort();
        boolean z3 = l;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.d;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = ab.readUnsignedShort();
            int unsignedShort3 = ab.readUnsignedShort();
            int i5 = ab.readInt();
            long j4 = ((long) ab.c) + 4;
            C0752yb c0752yb = (C0752yb) H[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c0752yb != null ? c0752yb.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (c0752yb != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = C;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c0752yb.c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c0752yb.d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = ((long) iArr[unsignedShort3]) * ((long) i5);
                            if (j < 0 || j > 2147483647L) {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + B[unsignedShort3] + ") is unexpected for tag: " + c0752yb.b);
                        }
                    } else if (z3) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                    }
                } else if (z3) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                if (z2) {
                    if (j > 4) {
                        i4 = ab.readInt();
                        if (z3) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.c != 7) {
                            if ("MakerNote".equals(c0752yb.b)) {
                                this.i = i4;
                            } else if (i != 6 && "ThumbnailImage".equals(c0752yb.b)) {
                                this.j = i4;
                                this.k = i5;
                                C0721xb c0721xbC = C0721xb.c(6, this.f);
                                C0721xb c0721xbA = C0721xb.a(this.j, this.f);
                                C0721xb c0721xbA2 = C0721xb.a(this.k, this.f);
                                mapArr[4].put("Compression", c0721xbC);
                                mapArr[4].put("JPEGInterchangeFormat", c0721xbA);
                                mapArr[4].put("JPEGInterchangeFormatLength", c0721xbA2);
                            }
                        }
                        ab.w(i4);
                    } else {
                        j4 = j4;
                        unsignedShort3 = unsignedShort3;
                        i5 = i5;
                    }
                    num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                    if (z3) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 != 4) {
                                j3 = ((long) ab.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                unsignedShort = ab.readShort();
                            } else if (i3 != 9 || i3 == 13) {
                                unsignedShort = ab.readInt();
                            } else {
                                j3 = -1;
                            }
                            if (z3) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c0752yb.b));
                            }
                            if (j3 > 0) {
                                hashSet = hashSet2;
                                if (!hashSet.contains(Integer.valueOf((int) j3))) {
                                    ab.w(j3);
                                    s(ab, num.intValue());
                                } else if (z3) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j3);
                                }
                            }
                            ab.w(j4);
                            hashSet2 = hashSet;
                        } else {
                            unsignedShort = ab.readUnsignedShort();
                        }
                        j3 = unsignedShort;
                        if (z3) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c0752yb.b));
                        }
                        if (j3 > 0) {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j3))) {
                                ab.w(j3);
                                s(ab, num.intValue());
                            } else if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j3);
                            }
                        }
                        ab.w(j4);
                        hashSet2 = hashSet;
                    } else {
                        j2 = j4;
                        int i7 = ab.c + this.h;
                        byte[] bArr = new byte[(int) j];
                        ab.readFully(bArr);
                        hashSet2 = hashSet2;
                        C0721xb c0721xb = new C0721xb(unsignedShort3, i5, bArr, i7);
                        mapArr[i].put(c0752yb.b, c0721xb);
                        str = c0752yb.b;
                        if ("DNGVersion".equals(str)) {
                            this.c = 3;
                        }
                        if (((!"Make".equals(str) || "Model".equals(str)) && c0721xb.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && c0721xb.e(this.f) == 65535)) {
                            this.c = 8;
                        }
                        if (ab.c != j2) {
                            ab.w(j2);
                        }
                    }
                } else {
                    ab.w(j4);
                }
                s3 = (short) (s3 + 1);
                s2 = s2;
                hashSet2 = hashSet2;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = 0;
            z2 = false;
            if (z2) {
                ab.w(j4);
            } else {
                if (j > 4) {
                    i4 = ab.readInt();
                    if (z3) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.c != 7) {
                        if ("MakerNote".equals(c0752yb.b)) {
                            this.i = i4;
                        } else if (i != 6) {
                        }
                    }
                    ab.w(i4);
                } else {
                    j4 = j4;
                    unsignedShort3 = unsignedShort3;
                    i5 = i5;
                }
                num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                if (z3) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            j3 = ((long) ab.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = ab.readInt();
                        } else {
                            unsignedShort = ab.readShort();
                        }
                        if (z3) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c0752yb.b));
                        }
                        if (j3 > 0) {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j3))) {
                                ab.w(j3);
                                s(ab, num.intValue());
                            } else if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j3);
                            }
                        }
                        ab.w(j4);
                        hashSet2 = hashSet;
                    } else {
                        unsignedShort = ab.readUnsignedShort();
                    }
                    j3 = unsignedShort;
                    if (z3) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c0752yb.b));
                    }
                    if (j3 > 0) {
                        hashSet = hashSet2;
                        if (!hashSet.contains(Integer.valueOf((int) j3))) {
                            ab.w(j3);
                            s(ab, num.intValue());
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j3);
                        }
                    }
                    ab.w(j4);
                    hashSet2 = hashSet;
                } else {
                    j2 = j4;
                    int i8 = ab.c + this.h;
                    byte[] bArr2 = new byte[(int) j];
                    ab.readFully(bArr2);
                    hashSet2 = hashSet2;
                    C0721xb c0721xb2 = new C0721xb(unsignedShort3, i5, bArr2, i8);
                    mapArr[i].put(c0752yb.b, c0721xb2);
                    str = c0752yb.b;
                    if ("DNGVersion".equals(str)) {
                        this.c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.c = 8;
                    if (ab.c != j2) {
                        ab.w(j2);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            s2 = s2;
            hashSet2 = hashSet2;
        }
        HashSet hashSet3 = hashSet2;
        int i9 = ab.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i9)));
        }
        long j5 = i9;
        if (j5 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i9);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i9))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i9);
                return;
            }
            return;
        }
        ab.w(j5);
        if (mapArr[4].isEmpty()) {
            s(ab, 4);
        } else if (mapArr[5].isEmpty()) {
            s(ab, 5);
        }
    }

    public final void t(String str, int i, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(C0690wb c0690wb) throws Throwable {
        C0721xb c0721xb;
        int iE;
        HashMap map = this.d[4];
        C0721xb c0721xb2 = (C0721xb) map.get("Compression");
        if (c0721xb2 == null) {
            m(c0690wb, map);
            return;
        }
        int iE2 = c0721xb2.e(this.f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(c0690wb, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        C0721xb c0721xb3 = (C0721xb) map.get("BitsPerSample");
        if (c0721xb3 != null) {
            int[] iArr = (int[]) c0721xb3.g(this.f);
            int[] iArr2 = m;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (c0721xb = (C0721xb) map.get("PhotometricInterpretation")) != null && (((iE = c0721xb.e(this.f)) == 1 && Arrays.equals(iArr, n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                C0721xb c0721xb4 = (C0721xb) map.get("StripOffsets");
                C0721xb c0721xb5 = (C0721xb) map.get("StripByteCounts");
                if (c0721xb4 == null || c0721xb5 == null) {
                    return;
                }
                long[] jArrI = Td.i(c0721xb4.g(this.f));
                long[] jArrI2 = Td.i(c0721xb5.g(this.f));
                if (jArrI == null || jArrI.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrI2 == null || jArrI2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrI.length != jArrI2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrI2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrI.length; i3++) {
                    int i4 = (int) jArrI[i3];
                    int i5 = (int) jArrI2[i3];
                    if (i3 < jArrI.length - 1 && i4 + i5 != jArrI[i3 + 1]) {
                        this.g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c0690wb.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c0690wb.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.g) {
                    long j4 = jArrI[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C0721xb c0721xb = (C0721xb) mapArr[i].get("ImageLength");
        C0721xb c0721xb2 = (C0721xb) mapArr[i].get("ImageWidth");
        C0721xb c0721xb3 = (C0721xb) mapArr[i2].get("ImageLength");
        C0721xb c0721xb4 = (C0721xb) mapArr[i2].get("ImageWidth");
        if (c0721xb == null || c0721xb2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c0721xb3 == null || c0721xb4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = c0721xb.e(this.f);
        int iE2 = c0721xb2.e(this.f);
        int iE3 = c0721xb3.e(this.f);
        int iE4 = c0721xb4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(Ab ab, int i) throws Throwable {
        C0721xb c0721xbC;
        C0721xb c0721xbC2;
        HashMap[] mapArr = this.d;
        C0721xb c0721xb = (C0721xb) mapArr[i].get("DefaultCropSize");
        C0721xb c0721xb2 = (C0721xb) mapArr[i].get("SensorTopBorder");
        C0721xb c0721xb3 = (C0721xb) mapArr[i].get("SensorLeftBorder");
        C0721xb c0721xb4 = (C0721xb) mapArr[i].get("SensorBottomBorder");
        C0721xb c0721xb5 = (C0721xb) mapArr[i].get("SensorRightBorder");
        if (c0721xb != null) {
            if (c0721xb.a == 5) {
                C0783zb[] c0783zbArr = (C0783zb[]) c0721xb.g(this.f);
                if (c0783zbArr == null || c0783zbArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0783zbArr));
                    return;
                }
                c0721xbC = C0721xb.b(c0783zbArr[0], this.f);
                c0721xbC2 = C0721xb.b(c0783zbArr[1], this.f);
            } else {
                int[] iArr = (int[]) c0721xb.g(this.f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c0721xbC = C0721xb.c(iArr[0], this.f);
                c0721xbC2 = C0721xb.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", c0721xbC);
            mapArr[i].put("ImageLength", c0721xbC2);
            return;
        }
        if (c0721xb2 != null && c0721xb3 != null && c0721xb4 != null && c0721xb5 != null) {
            int iE = c0721xb2.e(this.f);
            int iE2 = c0721xb4.e(this.f);
            int iE3 = c0721xb5.e(this.f);
            int iE4 = c0721xb3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            C0721xb c0721xbC3 = C0721xb.c(iE2 - iE, this.f);
            C0721xb c0721xbC4 = C0721xb.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", c0721xbC3);
            mapArr[i].put("ImageWidth", c0721xbC4);
            return;
        }
        C0721xb c0721xb6 = (C0721xb) mapArr[i].get("ImageLength");
        C0721xb c0721xb7 = (C0721xb) mapArr[i].get("ImageWidth");
        if (c0721xb6 == null || c0721xb7 == null) {
            C0721xb c0721xb8 = (C0721xb) mapArr[i].get("JPEGInterchangeFormat");
            C0721xb c0721xb9 = (C0721xb) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c0721xb8 == null || c0721xb9 == null) {
                return;
            }
            int iE5 = c0721xb8.e(this.f);
            int iE6 = c0721xb8.e(this.f);
            ab.w(iE5);
            byte[] bArr = new byte[iE6];
            ab.read(bArr);
            e(new C0690wb(bArr), iE5, i);
        }
    }

    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.d;
        C0721xb c0721xb = (C0721xb) mapArr[1].get("PixelXDimension");
        C0721xb c0721xb2 = (C0721xb) mapArr[1].get("PixelYDimension");
        if (c0721xb != null && c0721xb2 != null) {
            mapArr[0].put("ImageWidth", c0721xb);
            mapArr[0].put("ImageLength", c0721xb2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
