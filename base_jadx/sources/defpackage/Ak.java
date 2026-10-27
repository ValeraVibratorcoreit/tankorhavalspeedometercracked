package defpackage;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.HashSet;
import java.util.Set;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class Ak extends AbstractC0067c4 {
    public C0056bo U;
    public C0265ii V;
    public ImageView W;
    public Set X;
    public boolean Y;

    public final void c0() {
        if (this.Y && this.X.isEmpty()) {
            this.V.setVisibility(0);
            this.U.setVisibility(8);
        } else {
            this.V.setVisibility(8);
            this.U.setVisibility(0);
        }
    }

    public final void d0() {
        if (this.Y) {
            this.W.setImageResource(R.drawable.ts_ic_heart_filled);
            this.W.clearColorFilter();
        } else {
            this.W.setImageResource(R.drawable.ts_ic_heart_outline);
            this.W.setColorFilter(k().getColor(R.color.ts_color_text_secondary), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0295ji c0295jiV = V();
        ScrollView scrollViewW = W();
        LinearLayout linearLayout = new LinearLayout(I());
        linearLayout.setOrientation(1);
        scrollViewW.addView(linearLayout);
        SharedPreferences sharedPreferencesS = S();
        Set<String> stringSet = sharedPreferencesS.getStringSet("favoriteThemes", null);
        this.X = stringSet;
        if (stringSet == null) {
            this.X = new HashSet();
        }
        this.X = new HashSet(this.X);
        this.Y = sharedPreferencesS.getBoolean("favoriteFilterEnabled", false);
        c0295jiV.addView(a0(R.string.text_panel));
        LinearLayout linearLayout2 = new LinearLayout(I());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        Un un = new Un(I());
        un.setTitleVisible(false);
        un.b(R.array.ip_type_list, R.array.ip_type_values);
        un.setValue(sharedPreferencesS.getString("ipType", "1"));
        un.setOnValueChanged(new N3(sharedPreferencesS, 2));
        linearLayout2.addView(un, new LinearLayout.LayoutParams(0, -2, 1.0f));
        float f = k().getDisplayMetrics().density;
        this.W = new ImageView(I());
        int i = (int) (36.0f * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMarginStart((int) (f * 12.0f));
        this.W.setLayoutParams(layoutParams);
        d0();
        this.W.setOnClickListener(new C3(this, 2, sharedPreferencesS));
        linearLayout2.addView(this.W);
        c0295jiV.addView(linearLayout2);
        O(linearLayout, 16);
        c0295jiV.addView(a0(R.string.text_meters));
        C0056bo c0056bo = new C0056bo(I());
        this.U = c0056bo;
        c0056bo.setFavorites(this.X);
        this.U.setFavoriteFilterEnabled(this.Y);
        this.U.setItems(Br.h(I()));
        this.U.setSelectedValue(sharedPreferencesS.getString("selectedTheme", "Audi Virtual Cockpit"));
        this.U.setOnThemeSelected(new C0792zk(this, sharedPreferencesS));
        this.U.setOnFavoriteToggle(new C0792zk(this, sharedPreferencesS));
        linearLayout.addView(this.U, new LinearLayout.LayoutParams(-1, -2));
        C0265ii c0265iiA0 = a0(R.string.ts_fav_empty_hint);
        this.V = c0265iiA0;
        c0265iiA0.setVisibility(8);
        linearLayout.addView(this.V);
        c0295jiV.addView(scrollViewW, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        View viewZ = Z(R.string.text_start_btn, new E0(1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = P(12);
        viewZ.setLayoutParams(layoutParams2);
        c0295jiV.addView(viewZ);
        c0();
        return c0295jiV;
    }
}
