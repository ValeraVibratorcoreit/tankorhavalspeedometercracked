package defpackage;

import android.content.Context;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0478pf implements Vn, Jn {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC0067c4 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0478pf(AbstractC0067c4 abstractC0067c4, Object obj, int i) {
        this.a = i;
        this.b = abstractC0067c4;
        this.c = obj;
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        switch (this.a) {
            case 0:
                C0509qf c0509qf = (C0509qf) this.b;
                c0509qf.getClass();
                ((Wn) this.c).setSubtitle(z ? R.string.pref_sw_default_color_on : R.string.pref_sw_default_color_off);
                Td.A(c0509qf.I(), c0509qf.T.z, "useDefaultSwitch", z);
                boolean z2 = !z;
                Iterator it = c0509qf.V.iterator();
                while (it.hasNext()) {
                    ((Kn) it.next()).setRowEnabled(z2);
                }
                c0509qf.d0();
                break;
            case 1:
            default:
                Dq dq = (Dq) this.b;
                Context contextI = dq.I();
                String str = dq.T.z;
                String str2 = (String) this.c;
                Td.A(contextI, str, str2, z);
                if (dq.d0()) {
                    dq.X(str2);
                }
                break;
            case 2:
                C0574sj c0574sj = (C0574sj) this.b;
                c0574sj.getClass();
                ((Wn) this.c).setSubtitle(z ? R.string.pref_sw_default_settings_on : R.string.pref_sw_default_settings_off);
                Td.A(c0574sj.I(), c0574sj.T.z, "useDefaultSwitchNavi", z);
                boolean z3 = !z;
                Iterator it2 = c0574sj.V.iterator();
                while (it2.hasNext()) {
                    ((Wn) it2.next()).setRowEnabled(z3);
                }
                if (c0574sj.d0()) {
                    c0574sj.X("ALL");
                }
                break;
            case 3:
                C0574sj c0574sj2 = (C0574sj) this.b;
                Context contextI2 = c0574sj2.I();
                String str3 = c0574sj2.T.z;
                String str4 = (String) this.c;
                Td.A(contextI2, str3, str4, z);
                if (c0574sj2.d0()) {
                    c0574sj2.X(str4);
                }
                break;
            case 4:
                Dq dq2 = (Dq) this.b;
                dq2.getClass();
                ((Wn) this.c).setSubtitle(z ? R.string.pref_sw_default_settings_on : R.string.pref_sw_default_settings_off);
                Td.A(dq2.I(), dq2.T.z, "useDefaultSwitchCommon", z);
                boolean z4 = !z;
                Iterator it3 = dq2.V.iterator();
                while (it3.hasNext()) {
                    ((Wn) it3.next()).setRowEnabled(z4);
                }
                if (dq2.d0()) {
                    dq2.X("ALL");
                }
                break;
        }
    }
}
