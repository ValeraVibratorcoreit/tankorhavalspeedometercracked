package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0271io extends AbstractComponentCallbacksC0784zc {
    public int[] T;
    public String[] U;
    public int V = 0;

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void B(Bundle bundle) {
        bundle.putInt("ts_state_tab", this.V);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void E(View view) {
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.ts_tab_layout);
        if (this.T == null || this.U == null) {
            return;
        }
        tabLayout.setSelectedTabIndicatorColor(k().getColor(R.color.ts_color_gwm));
        tabLayout.setTabTextColors(TabLayout.d(k().getColor(R.color.ts_color_text_secondary), k().getColor(R.color.ts_color_text_primary)));
        int[] iArr = this.T;
        int length = iArr.length;
        int i = 0;
        while (true) {
            ArrayList arrayList = tabLayout.b;
            if (i >= length) {
                C0241ho c0241ho = new C0241ho(this);
                ArrayList arrayList2 = tabLayout.L;
                if (!arrayList2.contains(c0241ho)) {
                    arrayList2.add(c0241ho);
                }
                int i2 = this.V;
                if (i2 < 0 || i2 >= this.T.length) {
                    this.V = 0;
                }
                int i3 = this.V;
                C0089cq c0089cq = (i3 < 0 || i3 >= tabLayout.getTabCount()) ? null : (C0089cq) arrayList.get(i3);
                if (c0089cq != null) {
                    c0089cq.a();
                }
                O(this.V);
                return;
            }
            int i4 = iArr[i];
            C0089cq c0089cqF = tabLayout.f();
            TabLayout tabLayout2 = c0089cqF.f;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            CharSequence text = tabLayout2.getResources().getText(i4);
            if (TextUtils.isEmpty(c0089cqF.c) && !TextUtils.isEmpty(text)) {
                c0089cqF.g.setContentDescription(text);
            }
            c0089cqF.b = text;
            C0150eq c0150eq = c0089cqF.g;
            if (c0150eq != null) {
                c0150eq.e();
            }
            boolean zIsEmpty = arrayList.isEmpty();
            int size = arrayList.size();
            if (c0089cqF.f != tabLayout) {
                throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
            }
            c0089cqF.d = size;
            arrayList.add(size, c0089cqF);
            int size2 = arrayList.size();
            int i5 = -1;
            for (int i6 = size + 1; i6 < size2; i6++) {
                if (((C0089cq) arrayList.get(i6)).d == tabLayout.a) {
                    i5 = i6;
                }
                ((C0089cq) arrayList.get(i6)).d = i6;
            }
            tabLayout.a = i5;
            C0150eq c0150eq2 = c0089cqF.g;
            c0150eq2.setSelected(false);
            c0150eq2.setActivated(false);
            int i7 = c0089cqF.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (tabLayout.C == 1 && tabLayout.z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            tabLayout.d.addView(c0150eq2, i7, layoutParams);
            if (zIsEmpty) {
                c0089cqF.a();
            }
            i++;
        }
    }

    public final void O(int i) {
        String[] strArr = this.U;
        if (strArr == null || i < 0 || i >= strArr.length) {
            return;
        }
        this.V = i;
        Jc jcD = g().D();
        I().getClassLoader();
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcA = jcD.a(this.U[i]);
        Oc ocG = g();
        ocG.getClass();
        C0558s3 c0558s3 = new C0558s3(ocG);
        c0558s3.h(R.id.ts_tab_content, abstractComponentCallbacksC0784zcA, null);
        c0558s3.d(false);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void v(Bundle bundle) {
        super.v(bundle);
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            this.T = bundle2.getIntArray("ts_labels");
            this.U = bundle2.getStringArray("ts_classes");
            this.V = bundle2.getInt("ts_initial_tab", 0);
        }
        if (bundle != null) {
            this.V = bundle.getInt("ts_state_tab", this.V);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.settings_tab_container, viewGroup, false);
    }
}
