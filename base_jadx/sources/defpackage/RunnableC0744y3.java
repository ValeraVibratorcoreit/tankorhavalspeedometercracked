package defpackage;

import android.content.SharedPreferences;
import android.widget.Button;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;

/* JADX INFO: renamed from: y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0744y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0744y3(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                E3 e3 = (E3) obj2;
                e3.getClass();
                Button button = (Button) obj;
                button.setEnabled(true);
                if (!z) {
                    button.setText(R.string.bg_sun_refresh_failed);
                } else {
                    button.setText(R.string.bg_sun_refreshed);
                    e3.m0(e3.c0, true);
                }
                break;
            default:
                int i = SpedometerPanel.s0;
                SpedometerPanel spedometerPanel = (SpedometerPanel) obj2;
                spedometerPanel.getClass();
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.putBoolean("usePreferences", true);
                editor.commit();
                spedometerPanel.s(z);
                break;
        }
    }
}
