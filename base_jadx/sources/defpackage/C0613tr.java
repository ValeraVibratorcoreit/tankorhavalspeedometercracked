package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613tr extends AbstractC0787zf {
    public C0613tr(Context context, Dg dg) {
        super(context, dg, R.layout.transparent_fragment);
        C0768yr.e("T500.FR", "TransparentFragment.init()");
        setBackgroundResource(R.drawable.transparent_background);
        LayoutInflater.from(context).inflate(getLayout(), (ViewGroup) this, true);
    }
}
