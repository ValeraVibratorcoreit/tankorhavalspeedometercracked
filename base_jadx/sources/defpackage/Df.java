package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class Df extends InputConnectionWrapper {
    public final /* synthetic */ C0098d4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Df(InputConnection inputConnection, C0098d4 c0098d4) {
        super(inputConnection, false);
        this.a = c0098d4;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        B7 c0308k0;
        C0308k0 c0308k1 = inputContentInfo == null ? null : new C0308k0(new C0308k0(inputContentInfo), 21);
        C0098d4 c0098d4 = this.a;
        c0098d4.getClass();
        if ((i & 1) != 0) {
            try {
                ((C0308k0) c0308k1.b).z();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0308k0) c0308k1.b).b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((C0308k0) c0308k1.b).b).getDescription();
        C0308k0 c0308k2 = (C0308k0) c0308k1.b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) c0308k2.b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            c0308k0 = new C0308k0(clipData, 2);
        } else {
            C7 c7 = new C7();
            c7.b = clipData;
            c7.c = 2;
            c0308k0 = c7;
        }
        c0308k0.m(((InputContentInfo) c0308k2.b).getLinkUri());
        c0308k0.l(bundle2);
        if (Gs.f((View) c0098d4.b, c0308k0.g()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
