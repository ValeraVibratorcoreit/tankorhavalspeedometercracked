package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0363lo extends ArrayAdapter {
    public final /* synthetic */ SettingsTopBar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363lo(SettingsTopBar settingsTopBar, Context context, ArrayList arrayList) {
        super(context, R.layout.simple_dropdown_item_1line, arrayList);
        this.a = settingsTopBar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            SettingsTopBar settingsTopBar = this.a;
            textView.setTextSize(0, settingsTopBar.e.getTextSize());
            textView.setTextColor(settingsTopBar.getResources().getColor(ru.zinovin.tankspeedometer.R.color.ts_color_text_primary));
        }
        return view2;
    }
}
