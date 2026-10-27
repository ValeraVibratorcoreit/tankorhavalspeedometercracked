package defpackage;

import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Q3 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ P3(Q3 q3, Exception exc, int i) {
        this.a = i;
        this.b = q3;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Q3 q3 = this.b;
                Q0 q0 = new Q0(q3.I());
                q0.f(R.string.ts_restore_fail_title);
                ((M0) q0.b).f = q3.m(R.string.ts_backup_error_msg, this.c.getMessage());
                q0.e(R.string.text_ok_btn_text, null);
                q0.g();
                break;
            default:
                Q3 q4 = this.b;
                Q0 q1 = new Q0(q4.I());
                q1.f(R.string.ts_backup_fail_title);
                ((M0) q1.b).f = q4.m(R.string.ts_backup_error_msg, this.c.getMessage());
                q1.e(R.string.text_ok_btn_text, null);
                q1.g();
                break;
        }
    }
}
