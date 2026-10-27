package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0509qf extends AbstractC0067c4 {
    public static final String[] W = {"fuel_background_color", "fuel_color", "fuel_low_color", "fuel_critical_color"};
    public static final int[] X = {R.string.pref_fuel_background_color_title, R.string.pref_fuel_color_title, R.string.pref_fuel_low_color_title, R.string.pref_fuel_critical_color_title};
    public static final String[] Y = {"battery_background_color", "battery_color", "battery_low_color", "battery_critical_color"};
    public static final int[] Z = {R.string.pref_battery_background_color_title, R.string.pref_battery_color_title, R.string.pref_battery_low_color_title, R.string.pref_battery_critical_color_title};
    public static final String[] a0 = {"coolant_background_color", "coolant_color", "coolant_warn_color", "coolant_critical_color"};
    public static final int[] b0 = {R.string.pref_coolant_background_color_title, R.string.pref_coolant_color_title, R.string.pref_coolant_warn_color_title, R.string.pref_coolant_critical_color_title};
    public C0295ji U;
    public final ArrayList V = new ArrayList();

    @Override // defpackage.AbstractC0067c4
    public final void Y(SettingsTopBar settingsTopBar) {
        settingsTopBar.c(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Default");
        for (String str : k().getStringArray(R.array.Themes)) {
            arrayList.add(str);
        }
        settingsTopBar.b(arrayList, this.T.z);
        settingsTopBar.setOnThemeSelected(new C0098d4(this, 2));
        settingsTopBar.a(R.string.text_restore_btn_text, new RunnableC0591t5(this, 10));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c0(int i, String[] strArr, int[] iArr, SharedPreferences sharedPreferences, String str) {
        O(this.U, 16);
        this.U.addView(a0(i));
        In in = new In(I());
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            int iY = Tf.y(str2, str);
            Kn kn = new Kn(I());
            kn.j = -7829368;
            kn.g = new View(kn.getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            kn.h = gradientDrawable;
            gradientDrawable.setShape(0);
            kn.h.setCornerRadius(kn.getResources().getDisplayMetrics().density * 6.0f);
            kn.h.setStroke((int) kn.getResources().getDisplayMetrics().density, kn.getResources().getColor(R.color.ts_color_text_secondary));
            kn.h.setColor(kn.j);
            kn.g.setBackground(kn.h);
            int i3 = (int) (kn.getResources().getDisplayMetrics().density * 32.0f);
            kn.d.addView(kn.g, new FrameLayout.LayoutParams(i3, i3));
            kn.setOnClickListener(new ViewOnClickListenerC0069c6(kn, 6));
            kn.setTitle(iArr[i2]);
            kn.setColor(sharedPreferences.getInt(str2, iY));
            kn.setOnColorChanged(new C0478pf(this, str2, 1));
            this.V.add(kn);
            in.addView(kn);
        }
        this.U.addView(in);
    }

    public final void d0() {
        String strR = R();
        boolean z = this.T.G(strR).getBoolean("useDefaultSwitch", false);
        String str = this.T.z;
        if (str.equals(strR) || (z && str.equals("Default"))) {
            Intent intent = new Intent();
            intent.setAction("ru.zinovin.tankspeedometer.T500_INDICATOR_COLOR_CHANGED");
            I().sendBroadcast(intent);
        }
    }

    public final void e0() {
        this.U.removeAllViews();
        ArrayList arrayList = this.V;
        arrayList.clear();
        String str = this.T.z;
        boolean zEquals = str.equals("Default");
        SharedPreferences sharedPreferencesT = T();
        boolean z = !zEquals && sharedPreferencesT.getBoolean("useDefaultSwitch", false);
        In in = new In(I());
        Wn wnB0 = b0(R.string.pref_sw_default_color_title, R.string.pref_sw_default_color_on, R.string.pref_sw_default_color_off, z, null);
        wnB0.setOnCheckedChange(new C0478pf(this, wnB0, 0));
        wnB0.setRowEnabled(!zEquals);
        in.addView(wnB0);
        this.U.addView(in);
        c0(R.string.pref_cat_fuel_indicator_color_title, W, X, sharedPreferencesT, str);
        c0(R.string.pref_cat_battery_indicator_color_title, Y, Z, sharedPreferencesT, str);
        c0(R.string.pref_cat_coolant_indicator_color_title, a0, b0, sharedPreferencesT, str);
        boolean z2 = !z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Kn) it.next()).setRowEnabled(z2);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        this.U = c0295jiV;
        scrollViewW.addView(c0295jiV);
        e0();
        return scrollViewW;
    }
}
