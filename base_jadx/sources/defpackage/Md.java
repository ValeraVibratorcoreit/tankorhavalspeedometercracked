package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.jcraft.jsch.SftpATTRS;

/* JADX INFO: loaded from: classes.dex */
public final class Md implements InterfaceC0212gq {
    public final int a;
    public final int b;
    public InterfaceC0732xm c;
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public Md(Handler handler, int i, long j) {
        if (!Qr.i(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.a = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.d = handler;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.InterfaceC0212gq
    public final void a(Qo qo) {
        ((Ho) qo).m(this.a, this.b);
    }

    @Override // defpackage.InterfaceC0212gq
    public final void b(InterfaceC0732xm interfaceC0732xm) {
        this.c = interfaceC0732xm;
    }

    @Override // defpackage.InterfaceC0212gq
    public final void c(Drawable drawable) {
    }

    @Override // defpackage.InterfaceC0212gq
    public final void d(Qo qo) {
    }

    @Override // defpackage.InterfaceC0212gq
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.Bg
    public final void f() {
    }

    @Override // defpackage.InterfaceC0212gq
    public final InterfaceC0732xm g() {
        return this.c;
    }

    @Override // defpackage.InterfaceC0212gq
    public final void h(Drawable drawable) {
        this.g = null;
    }

    @Override // defpackage.InterfaceC0212gq
    public final void i(Object obj) {
        this.g = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }

    @Override // defpackage.Bg
    public final void j() {
    }

    @Override // defpackage.Bg
    public final void k() {
    }
}
