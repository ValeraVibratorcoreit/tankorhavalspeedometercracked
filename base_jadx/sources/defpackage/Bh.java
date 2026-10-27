package defpackage;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import ru.zinovin.tankspeedometer.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Bh implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ Bh(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.b;
        switch (this.a) {
            case 0:
                int i2 = MainActivity.M;
                mainActivity.E();
                break;
            case 1:
                int i3 = MainActivity.M;
                mainActivity.E();
                break;
            case 2:
                int i4 = MainActivity.M;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + mainActivity.getPackageName())));
                break;
            case 3:
                int i5 = MainActivity.M;
                mainActivity.getClass();
                Intent component = new Intent().setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AppAndNotificationDashboardActivity"));
                component.addFlags(268435456);
                mainActivity.startActivity(component);
                break;
            case 4:
                int i6 = MainActivity.M;
                mainActivity.finish();
                break;
            default:
                SharedPreferences.Editor editorEdit = mainActivity.I.edit();
                editorEdit.putString("SHOW_ABOUT", "false");
                editorEdit.apply();
                dialogInterface.dismiss();
                break;
        }
    }
}
