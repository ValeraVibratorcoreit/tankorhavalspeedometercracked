package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0510qg extends View {
    public final SharedPreferences a;

    public AbstractC0510qg(Context context) {
        super(context);
        this.a = AbstractC0390mk.l(context);
    }

    public abstract void a();

    public abstract void setLevelValue(float f);

    public AbstractC0510qg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = AbstractC0390mk.l(context);
    }
}
