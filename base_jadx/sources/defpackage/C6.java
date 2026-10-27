package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6 implements Vn, Qn {
    public final /* synthetic */ int a;
    public final /* synthetic */ D6 b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ C6(D6 d6, SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = d6;
        this.c = sharedPreferences;
    }

    @Override // defpackage.Qn
    public void a(String str) {
        switch (this.a) {
            case 1:
                D6 d6 = this.b;
                d6.getClass();
                this.c.edit().putString("language", str).apply();
                d6.X("language");
                break;
            default:
                D6 d7 = this.b;
                d7.getClass();
                this.c.edit().putString("carModel", str).apply();
                d7.X("carModel");
                break;
        }
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        switch (this.a) {
            case 0:
                D6 d6 = this.b;
                d6.getClass();
                this.c.edit().putBoolean("autoStart", z).apply();
                d6.X("autoStart");
                break;
            default:
                D6 d7 = this.b;
                d7.getClass();
                this.c.edit().putBoolean("extFirmware", z).apply();
                d7.X("extFirmware");
                break;
        }
    }
}
