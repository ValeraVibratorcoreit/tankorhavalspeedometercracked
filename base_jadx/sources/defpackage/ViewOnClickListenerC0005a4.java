package defpackage;

import android.view.View;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0005a4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ViewOnClickListenerC0005a4(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable = this.b;
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                int i = SettingsTopBar.h;
                runnable.run();
                break;
            default:
                int i2 = SettingsTopBar.h;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
