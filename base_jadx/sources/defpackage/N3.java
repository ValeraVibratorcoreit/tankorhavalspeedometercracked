package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N3 implements Vn, Tn {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharedPreferences b;

    public /* synthetic */ N3(SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = sharedPreferences;
    }

    @Override // defpackage.Tn
    public void a(String str) {
        this.b.edit().putString("ipType", str).apply();
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        switch (this.a) {
            case 0:
                this.b.edit().putBoolean("pswBackupSwitch", z).apply();
                break;
            default:
                this.b.edit().putBoolean("debugSwitch", z).apply();
                break;
        }
    }
}
