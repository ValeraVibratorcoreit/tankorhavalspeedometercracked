package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.InterfaceC0132e8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0132e8 {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.InterfaceC0132e8
    public final void c() {
    }

    @Override // defpackage.InterfaceC0132e8
    public final Object f() {
        return this.a.rewind();
    }
}
