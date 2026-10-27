package defpackage;

import android.content.Intent;
import android.widget.Toast;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Q3 b;

    public /* synthetic */ O3(Q3 q3, int i) {
        this.a = i;
        this.b = q3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Q3 q3 = this.b;
                q3.getClass();
                new Thread(new O3(q3, 4)).start();
                break;
            case 1:
                Q3 q4 = this.b;
                q4.getClass();
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                try {
                    q4.N(Intent.createChooser(intent, q4.l(R.string.ts_restore_select_title)), 1001);
                } catch (Exception e) {
                    C0768yr.c("T500.Backup", "Error opening file picker", e);
                    Toast.makeText(q4.I(), R.string.ts_restore_no_filemanager_msg, 0).show();
                    return;
                }
                break;
            case 2:
                Q0 q0 = new Q0(this.b.I());
                q0.f(R.string.ts_restore_fail_title);
                M0 m0 = (M0) q0.b;
                m0.f = m0.a.getText(R.string.ts_restore_invalid_msg);
                q0.e(R.string.text_ok_btn_text, null);
                q0.g();
                break;
            case 3:
                Q3 q5 = this.b;
                Q0 q1 = new Q0(q5.I());
                q1.f(R.string.ts_restore_success_title);
                M0 m1 = (M0) q1.b;
                m1.f = m1.a.getText(R.string.ts_restore_success_msg);
                q1.e(R.string.text_ok_btn_text, new M3(q5, 0));
                q1.g();
                break;
            default:
                Q3 q6 = this.b;
                q6.getClass();
                try {
                    String strTrim = q6.V.getValue().trim();
                    if (strTrim.isEmpty()) {
                        strTrim = null;
                    }
                    q6.c0(new B1(q6, 4, q6.U.i(strTrim)));
                } catch (Exception e2) {
                    C0768yr.c("T500.Backup", "Backup creation failed", e2);
                    q6.c0(new P3(q6, e2, 1));
                }
                break;
        }
    }
}
