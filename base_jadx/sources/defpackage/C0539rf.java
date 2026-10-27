package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0539rf implements On, Vn {
    public final /* synthetic */ C0632uf a;
    public final /* synthetic */ SharedPreferences b;

    public /* synthetic */ C0539rf(C0632uf c0632uf, SharedPreferences sharedPreferences) {
        this.a = c0632uf;
        this.b = sharedPreferences;
    }

    @Override // defpackage.On
    public void a(String str) {
        C0632uf c0632uf = this.a;
        c0632uf.getClass();
        this.b.edit().putString("tiresLowValue", str).apply();
        c0632uf.X("tiresLowValue");
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        C0632uf c0632uf = this.a;
        c0632uf.getClass();
        this.b.edit().putBoolean("fuel_tank_fix", z).apply();
        c0632uf.X("fuel_tank_fix");
    }
}
