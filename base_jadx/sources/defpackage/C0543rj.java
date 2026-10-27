package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0543rj implements Qn, On, Vn {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0574sj b;
    public final /* synthetic */ SharedPreferences c;

    public /* synthetic */ C0543rj(C0574sj c0574sj, SharedPreferences sharedPreferences, int i) {
        this.a = i;
        this.b = c0574sj;
        this.c = sharedPreferences;
    }

    @Override // defpackage.Qn
    public void a(String str) {
        switch (this.a) {
            case 0:
                C0574sj c0574sj = this.b;
                c0574sj.getClass();
                this.c.edit().putString("naviPackage", str).apply();
                c0574sj.X("naviPackage");
                break;
            case 1:
                C0574sj c0574sj2 = this.b;
                c0574sj2.getClass();
                this.c.edit().putString("naviUserPackage", str).apply();
                c0574sj2.X("naviUserPackage");
                break;
            default:
                C0574sj c0574sj3 = this.b;
                c0574sj3.getClass();
                this.c.edit().putString("naviStartDelay", str).apply();
                c0574sj3.X("naviStartDelay");
                break;
        }
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        switch (this.a) {
            case 3:
                C0574sj c0574sj = this.b;
                c0574sj.getClass();
                this.c.edit().putBoolean("useNaviActivation", z).apply();
                c0574sj.X("useNaviActivation");
                break;
            case 4:
                C0574sj c0574sj2 = this.b;
                c0574sj2.getClass();
                this.c.edit().putBoolean("showNaviBorder", z).apply();
                c0574sj2.X("showNaviBorder");
                break;
            default:
                C0574sj c0574sj3 = this.b;
                c0574sj3.getClass();
                this.c.edit().putBoolean("useHud", z).apply();
                c0574sj3.X("useHud");
                break;
        }
    }
}
