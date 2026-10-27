package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends AbstractC0093d {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ R1 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(R1 r1, K2 k2) {
        super(r1);
        this.d = r1;
        this.e = k2;
    }

    @Override // defpackage.AbstractC0093d
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.AbstractC0093d
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        switch (this.c) {
            case 0:
                return I1.a((PowerManager) this.e) ? 2 : 1;
            default:
                K2 k2 = (K2) this.e;
                Ar ar = (Ar) k2.c;
                if (ar.b <= System.currentTimeMillis()) {
                    Context context = (Context) k2.d;
                    int iE = Td.e(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) k2.b;
                    if (iE == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (Td.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C0799zr.d == null) {
                            C0799zr.d = new C0799zr();
                        }
                        C0799zr c0799zr = C0799zr.d;
                        c0799zr.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0799zr.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = c0799zr.c == 1;
                        long j2 = c0799zr.b;
                        long j3 = c0799zr.a;
                        c0799zr.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j4 = c0799zr.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j3) {
                                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        ar.a = z;
                        ar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = ar.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.AbstractC0093d
    public final void i() {
        switch (this.c) {
            case 0:
                this.d.m(true, true);
                break;
            default:
                this.d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(R1 r1, Context context) {
        super(r1);
        this.d = r1;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
