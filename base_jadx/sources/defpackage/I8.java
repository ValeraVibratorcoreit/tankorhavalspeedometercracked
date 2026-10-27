package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class I8 implements ImageDecoder.OnHeaderDecodedListener {
    public final C0477pe a = C0477pe.a();
    public final int b;
    public final int c;
    public final EnumC0378m8 d;
    public final L9 e;
    public final boolean f;
    public final Tk g;

    public I8(int i, int i2, C0544rk c0544rk) {
        this.b = i;
        this.c = i2;
        this.d = (EnumC0378m8) c0544rk.c(N9.f);
        this.e = (L9) c0544rk.c(L9.g);
        C0483pk c0483pk = N9.i;
        this.f = c0544rk.c(c0483pk) != null && ((Boolean) c0544rk.c(c0483pk)).booleanValue();
        this.g = (Tk) c0544rk.c(N9.g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C0477pe c0477pe = this.a;
        int width = this.b;
        int height = this.c;
        if (c0477pe.c(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == EnumC0378m8.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new H8());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        Tk tk = this.g;
        if (tk != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((tk == Tk.a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
