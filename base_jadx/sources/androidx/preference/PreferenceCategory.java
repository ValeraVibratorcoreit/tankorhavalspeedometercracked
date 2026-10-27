package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.Br;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, Br.r(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }
}
