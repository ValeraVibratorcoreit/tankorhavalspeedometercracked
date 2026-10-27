package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0291je {
    public static final String[] j = {"car.basic.vehicle_speed", "car.basic.chief_deputy_oil_box_setting.state", "car.basic.remain_fuel_percentage", "car.basic.coolant_temp", "car.basic.battery_voltage", "car.basic.master.oil.tank.level", "car.basic.auxiliary.oil.tank.level", "car.basic.avg_fuel_consumption", "car.basic.cur_journey_avg_fuel_consumption_a", "car.basic.cur_journey_avg_speed_a", "car.basic.cur_journey_drivetime", "car.basic.cur_journey_odometer", "car.basic.accumulated_odometer", "car.basic.total_odometer", "car.basic.battery_voltage", "car.basic.remain_odometer", "car.basic.main_tank_remain_odometer", "car.basic.sub_tank_remain_odometer", "car.ev_info.electric_mode_remain_odometer", "car.basic.outside_temp", "car.basic.tpms_status", "car.basic.tpms_units", "car.basic.tire_temp_unit", "car.unit_setting.temperature", "sys.settings.language", "sys.basic.ivi_power_mode", "sys.other.keyevent_notify", "car.ev_info.cur_battery_power_percentage", "car.basic.inside_temp", "car.basic.battery_power_level", "car.basic.current_gear", "car.basic.gear_status"};
    public static final List k = Arrays.asList("sys.other.keyevent_notify");
    public final Context a;
    public IBinder b;
    public BinderC0200ge c;
    public boolean d;
    public final HandlerThread e;
    public final Handler f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public C0262ie h;
    public final C0096d2 i;

    public C0291je(Context context, C0096d2 c0096d2) {
        this.a = context;
        this.i = c0096d2;
        HandlerThread handlerThread = new HandlerThread("GwmAdapter");
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        try {
            Object objInvoke = Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "gwm_adapter");
            IBinder iBinder = objInvoke instanceof IBinder ? (IBinder) objInvoke : null;
            if (iBinder != null && iBinder.isBinderAlive()) {
                this.b = iBinder;
                C0768yr.e("T500.GwmReader", "Сервис gwm_adapter найден");
                this.c = new BinderC0200ge(this);
                C0262ie c0262ie = new C0262ie(this);
                this.h = c0262ie;
                try {
                    iBinder.linkToDeath(c0262ie, 0);
                } catch (Exception e) {
                    C0768yr.b("T500.GwmReader", "linkToDeath error: " + e.getMessage());
                }
                c();
                d(iBinder);
                this.d = true;
                if (this.i != null) {
                    C0096d2.P(true);
                }
                C0768yr.e("T500.GwmReader", "Подключено. Источник: GWM_ADAPTER");
                return;
            }
            C0768yr.e("T500.GwmReader", "Сервис gwm_adapter не найден или не активен");
        } catch (Exception e2) {
            C0768yr.c("T500.GwmReader", "Ошибка подключения: " + e2.getMessage(), e2);
        }
    }

    public final void b(String str, String str2) {
        if (str2.isEmpty()) {
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 == null || !str3.equals(str2)) {
            concurrentHashMap.put(str, str2);
            C0096d2 c0096d2 = this.i;
            if (c0096d2 != null) {
                str.getClass();
                Lf lf = (Lf) c0096d2.b;
                switch (str) {
                    case "car.basic.vehicle_speed":
                        lf.a.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.tire_temp_unit":
                        lf.C.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "sys.other.keyevent_notify":
                        C0768yr.e("T500.SERVICE", "keyevent_notify=".concat(str2));
                        switch (str2) {
                            case "[2000,0]":
                            case "[2000,2]":
                            case "[2001,0]":
                            case "[2001,2]":
                            case "[2002,0]":
                            case "[2002,2]":
                            case "[2003,0]":
                            case "[2003,2]":
                                if (lf.d().booleanValue()) {
                                    lf.h(Boolean.FALSE);
                                    break;
                                }
                                break;
                            case "[2004,3]":
                            case "[1006,3]":
                                lf.h(Boolean.valueOf(!lf.d().booleanValue()));
                                break;
                            case "[2006,1]":
                                if (!lf.d().booleanValue()) {
                                    lf.h(Boolean.TRUE);
                                    break;
                                } else {
                                    lf.e(1);
                                    break;
                                }
                                break;
                            case "[2006,3]":
                                lf.e(2);
                                break;
                            case "[2006,4]":
                                Tf.q("MicroMode.class", new Object[0]);
                                break;
                            case "[2007,1]":
                            case "[1007,1]":
                                lf.e(7);
                                break;
                            case "[2007,3]":
                            case "[1007,3]":
                                lf.e(8);
                                break;
                            case "[2007,4]":
                            case "[1007,4]":
                                lf.e(9);
                                break;
                            case "[1006,1]":
                                lf.e(4);
                                break;
                            case "[1006,4]":
                                lf.e(6);
                                break;
                        }
                        break;
                    case "car.basic.cur_journey_drivetime":
                        lf.n.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.basic.gear_status":
                        lf.c.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.basic.outside_temp":
                        if (Math.round(C0096d2.G(str2)) > -1000) {
                            lf.s.f(Float.valueOf(C0096d2.G(str2)));
                            break;
                        }
                        break;
                    case "car.basic.cur_journey_avg_fuel_consumption_a":
                        lf.l.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.remain_fuel_percentage":
                        lf.g(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.sub_tank_remain_odometer":
                        lf.j.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.master.oil.tank.level":
                        if (!((SharedPreferences) c0096d2.c).getBoolean("fuel_tank_fix", false)) {
                            lf.g(Float.valueOf(C0096d2.G(str2) / 10.0f));
                            break;
                        } else {
                            lf.g(Float.valueOf(C0096d2.G(str2)));
                            break;
                        }
                        break;
                    case "car.basic.battery_voltage":
                        lf.e.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.coolant_temp":
                        lf.r.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.cur_journey_odometer":
                        lf.o.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.tpms_status":
                        if (!str2.equals("[0.0,-50.0,0.0,-50.0,0.0,-50.0,0.0,-50.0]")) {
                            lf.z.f(str2);
                            break;
                        }
                        break;
                    case "car.basic.avg_fuel_consumption":
                        lf.k.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.main_tank_remain_odometer":
                        if (((Integer) lf.H.d()).intValue() > -1) {
                            lf.i.f(Float.valueOf(C0096d2.G(str2)));
                            break;
                        }
                        break;
                    case "car.basic.tpms_units":
                        lf.A.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.basic.cur_journey_avg_speed_a":
                        lf.m.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "sys.settings.language":
                        lf.D.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.ev_info.electric_mode_remain_odometer":
                        lf.F.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.remain_odometer":
                        lf.i.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.accumulated_odometer":
                        lf.q.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.basic.chief_deputy_oil_box_setting.state":
                        lf.H.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.basic.total_odometer":
                        lf.p.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "car.ev_info.cur_battery_power_percentage":
                        if (Math.round(C0096d2.G(str2)) != -1) {
                            lf.f.f(Float.valueOf(C0096d2.G(str2)));
                            break;
                        }
                        break;
                    case "car.unit_setting.temperature":
                        lf.B.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.basic.auxiliary.oil.tank.level":
                        float fG = C0096d2.G(str2);
                        if (fG != lf.c().floatValue()) {
                            lf.h.f(Float.valueOf(fG));
                            break;
                        }
                        break;
                    case "car.basic.engine_speed":
                        lf.b.f(Float.valueOf(C0096d2.G(str2)));
                        break;
                    case "sys.basic.ivi_power_mode":
                        lf.G.f(Integer.valueOf(C0096d2.H(str2)));
                        break;
                    case "car.basic.current_gear":
                        int iH = C0096d2.H(str2);
                        if (iH > 8) {
                            iH--;
                        }
                        lf.d.f(Integer.valueOf(iH));
                        break;
                }
            }
        }
    }

    public final void c() {
        String str;
        if (this.b != null) {
            StringBuilder sb = new StringBuilder("Запрос параметров: ");
            String[] strArr = j;
            sb.append(Arrays.toString(strArr));
            C0768yr.e("T500.GwmReader", sb.toString());
            IBinder iBinder = this.b;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            String[] strArrCreateStringArray = null;
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.gwm.android.adapter.IGwmAdapterService");
                    parcelObtain.writeInt(1);
                    String packageName = this.a.getPackageName();
                    if (packageName == null) {
                        packageName = "ru.zinovin.tankspeedometer";
                    }
                    parcelObtain.writeString(packageName);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeStringArray(null);
                    parcelObtain.writeInt(1);
                    if (iBinder.transact(1, parcelObtain, parcelObtain2, 0) && parcelObtain2.readInt() == 0) {
                        strArrCreateStringArray = parcelObtain2.createStringArray();
                    }
                } catch (Exception e) {
                    C0768yr.b("T500.GwmReader", "transactGetValues error: " + e.getMessage());
                }
                parcelObtain.recycle();
                parcelObtain2.recycle();
                if (strArrCreateStringArray != null) {
                    C0768yr.e("T500.GwmReader", "Начальные значения: " + Arrays.toString(strArrCreateStringArray));
                    for (int i = 0; i < strArrCreateStringArray.length && i < 32; i++) {
                        if (!k.contains(strArr[i]) && (str = strArrCreateStringArray[i]) != null && !str.isEmpty()) {
                            b(strArr[i], str);
                        }
                    }
                }
            } catch (Throwable th) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th;
            }
        }
    }

    public final void d(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("com.gwm.android.adapter.IGwmAdapterService");
                String packageName = this.a.getPackageName();
                if (packageName == null) {
                    packageName = "ru.zinovin.tankspeedometer";
                }
                parcelObtain.writeString(packageName);
                parcelObtain.writeStringArray(j);
                parcelObtain.writeStrongBinder(this.c);
                if (iBinder.transact(3, parcelObtain, parcelObtain2, 0) && parcelObtain2.readInt() == 0) {
                    parcelObtain2.readInt();
                }
            } catch (Exception e) {
                C0768yr.b("T500.GwmReader", "transactRegister error: " + e.getMessage());
            }
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
