package defpackage;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0601tf implements On, Vn {
    public final /* synthetic */ SharedPreferences a;
    public final /* synthetic */ AbstractC0067c4 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0601tf(C0632uf c0632uf, SharedPreferences sharedPreferences, String str) {
        this.b = c0632uf;
        this.a = sharedPreferences;
        this.c = str;
    }

    @Override // defpackage.On
    public void a(String str) {
        C0632uf c0632uf = (C0632uf) this.b;
        c0632uf.getClass();
        SharedPreferences.Editor editorEdit = this.a.edit();
        String str2 = (String) this.c;
        editorEdit.putString(str2, str).apply();
        c0632uf.X(str2);
    }

    @Override // defpackage.Vn
    public void c(final boolean z) {
        final Eh eh = (Eh) this.b;
        eh.getClass();
        final Wn wn = (Wn) this.c;
        wn.setRowEnabled(false);
        CompletableFuture completableFutureSupplyAsync = z ? CompletableFuture.supplyAsync(new C0272ip("iptables -I FORWARD -o ccinet+ -j REJECT")) : CompletableFuture.supplyAsync(new C0272ip("iptables -D FORWARD -o ccinet+ -j REJECT"));
        final SharedPreferences sharedPreferences = this.a;
        completableFutureSupplyAsync.thenAccept(new Consumer() { // from class: Ch
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final C0302jp c0302jp = (C0302jp) obj;
                final Eh eh2 = eh;
                eh2.getClass();
                final SharedPreferences sharedPreferences2 = sharedPreferences;
                final boolean z2 = z;
                final Wn wn2 = wn;
                Runnable runnable = new Runnable() { // from class: Dh
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z3;
                        Eh eh3 = eh2;
                        eh3.getClass();
                        StringBuilder sb = new StringBuilder("stdout=");
                        C0302jp c0302jp2 = c0302jp;
                        sb.append(c0302jp2.b);
                        C0768yr.e("T500.TBOX", sb.toString());
                        StringBuilder sb2 = new StringBuilder("stderr=");
                        String str = c0302jp2.c;
                        sb2.append(str);
                        C0768yr.e("T500.TBOX", sb2.toString());
                        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                        boolean z4 = z2;
                        boolean z5 = c0302jp2.a;
                        if (z5) {
                            z3 = z4;
                        } else {
                            z3 = !z4;
                        }
                        editorEdit.putBoolean("tboxSwitch", z3).apply();
                        Wn wn3 = wn2;
                        if (z5) {
                            Toast.makeText(eh3.I(), z4 ? R.string.ts_tbox_blocked_msg : R.string.ts_tbox_enabled_msg, 1).show();
                        } else {
                            wn3.setChecked(!z4);
                            Toast.makeText(eh3.I(), eh3.m(R.string.ts_tbox_error_msg, str), 1).show();
                        }
                        wn3.setRowEnabled(true);
                    }
                };
                if (!eh2.p() || eh2.f() == null) {
                    return;
                }
                eh2.H().runOnUiThread(runnable);
            }
        });
    }

    public /* synthetic */ C0601tf(Eh eh, Wn wn, SharedPreferences sharedPreferences) {
        this.b = eh;
        this.c = wn;
        this.a = sharedPreferences;
    }
}
