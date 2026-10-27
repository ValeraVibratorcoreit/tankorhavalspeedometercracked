package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface.OnClickListener h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public CharSequence k;
    public DialogInterface.OnClickListener l;
    public DialogInterface.OnKeyListener n;
    public CharSequence[] o;
    public ListAdapter p;
    public DialogInterface.OnClickListener q;
    public View r;
    public boolean s;
    public int t = -1;
    public boolean m = true;

    public M0(ContextThemeWrapper contextThemeWrapper) {
        this.a = contextThemeWrapper;
        this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
