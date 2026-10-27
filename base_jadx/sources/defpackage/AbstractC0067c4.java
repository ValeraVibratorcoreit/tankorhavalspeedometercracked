package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0067c4 extends AbstractComponentCallbacksC0784zc {
    public MainActivity T;

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void A() {
        this.C = true;
        MainActivity mainActivity = this.T;
        if (mainActivity != null) {
            SettingsTopBar settingsTopBar = mainActivity.A;
            if (settingsTopBar != null) {
                settingsTopBar.f.removeAllViews();
                settingsTopBar.b.removeAllViews();
                mainActivity.A.c(false);
                mainActivity.A.setThemeSpinnerEnabled(true);
                mainActivity.A.setOnThemeSelected(null);
                mainActivity.A.setOnBackClicked(null);
            }
            Y(this.T.A);
        }
    }

    public final void O(LinearLayout linearLayout, int i) {
        linearLayout.addView(new View(I()), new LinearLayout.LayoutParams(-1, P(i)));
    }

    public final int P(int i) {
        return (int) (k().getDisplayMetrics().density * i);
    }

    public final Pn Q(int i, String str, int i2, On on) {
        Pn pn = new Pn(I());
        pn.setTitle(i);
        pn.setInputTypeFlags(i2);
        pn.setValue(str);
        pn.setOnValueChanged(on);
        return pn;
    }

    public final String R() {
        return this.T.y.getString("selectedTheme", "Audi Virtual Cockpit");
    }

    public final SharedPreferences S() {
        MainActivity mainActivity = this.T;
        if (mainActivity.y == null) {
            mainActivity.y = AbstractC0390mk.l(mainActivity);
        }
        return mainActivity.y;
    }

    public final SharedPreferences T() {
        MainActivity mainActivity = this.T;
        return mainActivity.G(mainActivity.z);
    }

    public final Rn U(int i, int i2, int i3, String str, Qn qn) {
        Rn rn = new Rn(I());
        rn.setTitle(i);
        rn.i = rn.getResources().getTextArray(i2);
        rn.j = rn.getResources().getTextArray(i3);
        rn.setValue(str);
        rn.setOnValueChanged(qn);
        return rn;
    }

    public final C0295ji V() {
        C0295ji c0295ji = new C0295ji(I());
        c0295ji.setOrientation(1);
        int iP = P(16);
        c0295ji.setPadding(iP, iP, iP, iP);
        return c0295ji;
    }

    public final ScrollView W() {
        ScrollView scrollView = new ScrollView(I());
        scrollView.setFillViewport(true);
        return scrollView;
    }

    public final void X(String str) {
        Context contextH = h();
        if (contextH == null) {
            return;
        }
        Intent intent = new Intent("ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED");
        intent.putExtra("pref_key", str);
        contextH.sendBroadcast(intent);
    }

    public void Y(SettingsTopBar settingsTopBar) {
    }

    public final Button Z(int i, Runnable runnable) {
        Button button = new Button(I());
        button.setText(i);
        button.setAllCaps(false);
        button.setTextSize(0, k().getDimension(R.dimen.ts_button_text));
        button.setTextColor(k().getColor(R.color.ts_color_text_primary));
        button.setBackgroundResource(R.drawable.ts_bg_button_outline);
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        int dimensionPixelSize = k().getDimensionPixelSize(R.dimen.ts_button_min_height);
        button.setMinHeight(dimensionPixelSize);
        button.setMinimumHeight(dimensionPixelSize);
        int iP = P(28);
        button.setPadding(iP, 0, iP, 0);
        if (runnable != null) {
            button.setOnClickListener(new ViewOnClickListenerC0005a4(0, runnable));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = P(12);
        button.setLayoutParams(layoutParams);
        return button;
    }

    public final C0265ii a0(int i) {
        C0265ii c0265ii = new C0265ii(I(), null);
        c0265ii.setTextColor(c0265ii.getResources().getColor(R.color.ts_color_text_secondary));
        c0265ii.setTextSize(0, c0265ii.getResources().getDimension(R.dimen.ts_text_caption));
        c0265ii.setAllCaps(true);
        int i2 = (int) (c0265ii.getResources().getDisplayMetrics().density * 8.0f);
        int i3 = (int) (c0265ii.getResources().getDisplayMetrics().density * 6.0f);
        c0265ii.setPadding(i2, i3, i2, i3);
        c0265ii.setText(i);
        return c0265ii;
    }

    public final Wn b0(int i, final int i2, final int i3, boolean z, final Vn vn) {
        final Wn wn = new Wn(I());
        wn.setTitle(i);
        if (i2 != 0 && i3 != 0) {
            wn.setSubtitle(z ? i2 : i3);
        }
        wn.setChecked(z);
        wn.setOnCheckedChange(new Vn() { // from class: b4
            @Override // defpackage.Vn
            public final void c(boolean z2) {
                int i4;
                int i5 = i2;
                if (i5 != 0 && (i4 = i3) != 0) {
                    if (!z2) {
                        i5 = i4;
                    }
                    wn.setSubtitle(i5);
                }
                Vn vn2 = vn;
                if (vn2 != null) {
                    vn2.c(z2);
                }
            }
        });
        return wn;
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void u(Context context) {
        super.u(context);
        if (context instanceof MainActivity) {
            this.T = (MainActivity) context;
        }
    }
}
