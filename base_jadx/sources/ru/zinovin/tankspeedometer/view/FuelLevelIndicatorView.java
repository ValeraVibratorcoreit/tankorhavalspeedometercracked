package ru.zinovin.tankspeedometer.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import defpackage.B6;
import defpackage.Tf;
import defpackage.U2;

/* JADX INFO: loaded from: classes.dex */
public class FuelLevelIndicatorView extends B6 {
    public static final /* synthetic */ int n = 0;
    public U2 m;

    public FuelLevelIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.AbstractC0510qg
    public final void a() {
        c();
        invalidate();
    }

    @Override // defpackage.B6
    public final void b() {
        U2 u2 = new U2(this, 4);
        this.m = u2;
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.registerOnSharedPreferenceChangeListener(u2);
        c();
        setNormalLevel(Float.parseFloat(sharedPreferences.getString("fuel_low_level", "20.0")));
        setWarnLevel(Float.parseFloat(sharedPreferences.getString("fuel_critical_level", "12.5")));
    }

    public final void c() {
        setColor(Tf.w("fuel_color"));
        setBackColor(Tf.w("fuel_background_color"));
        setLowColor(Tf.w("fuel_low_color"));
        setCriticalColor(Tf.w("fuel_critical_color"));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        U2 u2 = this.m;
        if (u2 != null) {
            this.a.unregisterOnSharedPreferenceChangeListener(u2);
        }
    }
}
