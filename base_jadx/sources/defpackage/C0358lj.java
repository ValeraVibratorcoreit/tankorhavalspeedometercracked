package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0358lj implements Qn, On, Vn {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0389mj b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ C0358lj(C0389mj c0389mj, SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = c0389mj;
        this.c = sharedPreferences;
    }

    @Override // defpackage.Qn
    public void a(String str) {
        switch (this.a) {
            case 0:
                C0389mj c0389mj = this.b;
                c0389mj.getClass();
                this.c.edit().putString("musicApp", str).apply();
                c0389mj.X("musicApp");
                break;
            case 1:
                C0389mj c0389mj2 = this.b;
                c0389mj2.getClass();
                this.c.edit().putString("musicUserPackage", str).apply();
                c0389mj2.X("musicUserPackage");
                break;
            case 2:
            default:
                C0389mj c0389mj3 = this.b;
                c0389mj3.getClass();
                this.c.edit().putString("ymListId", str).apply();
                c0389mj3.X("ymListId");
                break;
            case 3:
                C0389mj c0389mj4 = this.b;
                c0389mj4.getClass();
                this.c.edit().putString("ymUser", str).apply();
                c0389mj4.X("ymUser");
                break;
            case 4:
                C0389mj c0389mj5 = this.b;
                c0389mj5.getClass();
                this.c.edit().putString("ymPlayMode", str).apply();
                c0389mj5.X("ymPlayMode");
                break;
        }
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        C0389mj c0389mj = this.b;
        c0389mj.getClass();
        this.c.edit().putBoolean("musicAutoPlay", z).apply();
        c0389mj.X("musicAutoPlay");
    }
}
