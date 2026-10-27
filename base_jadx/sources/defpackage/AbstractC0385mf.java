package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: renamed from: mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0385mf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
