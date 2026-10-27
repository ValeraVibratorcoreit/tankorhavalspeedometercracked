package defpackage;

import android.view.View;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0301jo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsTopBar b;

    public /* synthetic */ ViewOnClickListenerC0301jo(SettingsTopBar settingsTopBar, int i) {
        this.a = i;
        this.b = settingsTopBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.e.showDropDown();
                break;
            case 1:
                this.b.e.showDropDown();
                break;
            default:
                this.b.e.showDropDown();
                break;
        }
    }
}
