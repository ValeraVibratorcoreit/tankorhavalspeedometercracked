package defpackage;

import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import ru.zinovin.tankspeedometer.service.InternetMonitorService;
import ru.zinovin.tankspeedometer.service.LogcatService;
import ru.zinovin.tankspeedometer.service.TboxMonitorService;
import ru.zinovin.tankspeedometer.service.YnActivatingService;

/* JADX INFO: loaded from: classes.dex */
public final class Sf extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Sf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    private final void a() throws Throwable {
        String str;
        IOException iOException;
        Throwable th;
        String str2;
        boolean z;
        Sf sf = this;
        String str3 = "ERROR in logReadingTask()";
        LogcatService logcatService = (LogcatService) sf.b;
        C0768yr.e("T500.SERVICE", "START reading logcat");
        try {
            Process processExec = Runtime.getRuntime().exec("logcat");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 8192);
            System.currentTimeMillis();
            SharedPreferences sharedPreferencesL = AbstractC0390mk.l(AbstractC0402n1.a());
            int i = 0;
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                try {
                    if (!logcatService.a) {
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null || logcatService.a) {
                                    break;
                                }
                                i++;
                                if (logcatService.c > 0) {
                                    LogcatService.c(logcatService);
                                    if (logcatService.c == 0) {
                                        str3 = str3;
                                        try {
                                            logcatService.b.e(0);
                                        } catch (IOException e) {
                                            e = e;
                                            iOException = e;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            th = th;
                                            str = str3;
                                            try {
                                                bufferedReader.close();
                                                processExec.destroy();
                                                throw th;
                                            } catch (IOException e2) {
                                                C0768yr.c("T500.ERROR", str, e2);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        str3 = str3;
                                    }
                                } else {
                                    str3 = str3;
                                }
                                if (line.contains("GA-server: setData")) {
                                    System.currentTimeMillis();
                                    if (line.contains("car.basic.engine_speed")) {
                                        try {
                                            logcatService.b.b.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                            sharedPreferencesL = sharedPreferencesL;
                                            z = z5;
                                            z5 = z;
                                        } catch (IOException e3) {
                                            e = e3;
                                            iOException = e;
                                            str = str3;
                                            throw new RuntimeException(iOException);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            str = str3;
                                            bufferedReader.close();
                                            processExec.destroy();
                                            throw th;
                                        }
                                    } else if (line.contains("car.basic.vehicle_speed")) {
                                        try {
                                            logcatService.b.a.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                            sharedPreferencesL = sharedPreferencesL;
                                            z = z5;
                                            z5 = z;
                                        } catch (IOException e4) {
                                            e = e4;
                                            iOException = e;
                                            str = str3;
                                            throw new RuntimeException(iOException);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            str = str3;
                                            bufferedReader.close();
                                            processExec.destroy();
                                            throw th;
                                        }
                                    } else if (line.contains("car.basic.gear_status")) {
                                        try {
                                            logcatService.b.c.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                            sharedPreferencesL = sharedPreferencesL;
                                            z = z5;
                                            z5 = z;
                                        } catch (IOException e5) {
                                            e = e5;
                                            iOException = e;
                                            str = str3;
                                            throw new RuntimeException(iOException);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            str = str3;
                                            bufferedReader.close();
                                            processExec.destroy();
                                            throw th;
                                        }
                                    } else if (line.contains("car.basic.current_gear")) {
                                        int iG = LogcatService.g(logcatService, line);
                                        Lf lf = logcatService.b;
                                        if (iG > 8) {
                                            iG--;
                                        }
                                        try {
                                            lf.d.f(Integer.valueOf(iG));
                                            sharedPreferencesL = sharedPreferencesL;
                                            z = z5;
                                            z5 = z;
                                        } catch (IOException e6) {
                                            e = e6;
                                            iOException = e;
                                            str = str3;
                                            throw new RuntimeException(iOException);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th = th;
                                            str = str3;
                                            bufferedReader.close();
                                            processExec.destroy();
                                            throw th;
                                        }
                                    } else {
                                        if (!line.contains("car.basic.remain_fuel_percentage")) {
                                            if (!line.contains("car.basic.master.oil.tank.level")) {
                                                if (line.contains("car.basic.auxiliary.oil.tank.level")) {
                                                    float f = LogcatService.f(logcatService, line);
                                                    if (f != logcatService.b.c().floatValue()) {
                                                        try {
                                                            logcatService.b.h.f(Float.valueOf(f));
                                                        } catch (IOException e7) {
                                                            e = e7;
                                                            iOException = e;
                                                            str = str3;
                                                            throw new RuntimeException(iOException);
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            th = th;
                                                            str = str3;
                                                            bufferedReader.close();
                                                            processExec.destroy();
                                                            throw th;
                                                        }
                                                    }
                                                } else if (line.contains("car.basic.avg_fuel_consumption")) {
                                                    try {
                                                        logcatService.b.k.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e8) {
                                                        e = e8;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.cur_journey_avg_fuel_consumption_a")) {
                                                    try {
                                                        logcatService.b.l.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e9) {
                                                        e = e9;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.cur_journey_avg_speed_a")) {
                                                    try {
                                                        logcatService.b.m.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.cur_journey_drivetime")) {
                                                    try {
                                                        logcatService.b.n.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                    } catch (IOException e11) {
                                                        e = e11;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.cur_journey_odometer")) {
                                                    try {
                                                        logcatService.b.o.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e12) {
                                                        e = e12;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.accumulated_odometer")) {
                                                    try {
                                                        logcatService.b.q.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e13) {
                                                        e = e13;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.total_odometer")) {
                                                    try {
                                                        logcatService.b.p.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e14) {
                                                        e = e14;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.battery_voltage")) {
                                                    try {
                                                        logcatService.b.e.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e15) {
                                                        e = e15;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.remain_odometer")) {
                                                    if (!z5) {
                                                        try {
                                                            logcatService.b.i.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                        } catch (IOException e16) {
                                                            e = e16;
                                                            iOException = e;
                                                            str = str3;
                                                            throw new RuntimeException(iOException);
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                            th = th;
                                                            str = str3;
                                                            bufferedReader.close();
                                                            processExec.destroy();
                                                            throw th;
                                                        }
                                                    }
                                                } else if (line.contains("car.basic.main_tank_remain_odometer")) {
                                                    try {
                                                        logcatService.b.i.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e17) {
                                                        e = e17;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.sub_tank_remain_odometer")) {
                                                    try {
                                                        logcatService.b.j.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e18) {
                                                        e = e18;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.ev_info.electric_mode_remain_odometer")) {
                                                    try {
                                                        logcatService.b.F.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e19) {
                                                        e = e19;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.basic.coolant_temp")) {
                                                    try {
                                                        logcatService.b.r.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                    } catch (IOException e20) {
                                                        e = e20;
                                                        iOException = e;
                                                        str = str3;
                                                        throw new RuntimeException(iOException);
                                                    } catch (Throwable th20) {
                                                        th = th20;
                                                        th = th;
                                                        str = str3;
                                                        bufferedReader.close();
                                                        processExec.destroy();
                                                        throw th;
                                                    }
                                                } else if (line.contains("car.ev_info.cur_battery_power_percentage")) {
                                                    if (Math.round(LogcatService.f(logcatService, line)) != -1) {
                                                        try {
                                                            logcatService.b.f.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                        } catch (IOException e21) {
                                                            e = e21;
                                                            iOException = e;
                                                            str = str3;
                                                            throw new RuntimeException(iOException);
                                                        } catch (Throwable th21) {
                                                            th = th21;
                                                            th = th;
                                                            str = str3;
                                                            bufferedReader.close();
                                                            processExec.destroy();
                                                            throw th;
                                                        }
                                                    }
                                                } else if (line.contains("car.basic.outside_temp")) {
                                                    C0768yr.e("T500.SERVICE", "outside_temp=" + LogcatService.f(logcatService, line));
                                                    if (Math.round(LogcatService.f(logcatService, line)) != -1001) {
                                                        try {
                                                            logcatService.b.s.f(Float.valueOf(LogcatService.f(logcatService, line)));
                                                        } catch (IOException e22) {
                                                            e = e22;
                                                            iOException = e;
                                                            str = str3;
                                                            throw new RuntimeException(iOException);
                                                        } catch (Throwable th22) {
                                                            th = th22;
                                                            th = th;
                                                            str = str3;
                                                            bufferedReader.close();
                                                            processExec.destroy();
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    if (line.contains("car.basic.tpms_status")) {
                                                        if (!line.contains("0.0,-50.0,0.0,-50.0,0.0,-50.0,0.0,-50.0")) {
                                                            Lf lf2 = logcatService.b;
                                                            try {
                                                                String[] strArrSplit = line.split("=");
                                                                sharedPreferencesL = sharedPreferencesL;
                                                                try {
                                                                    lf2.z.f(strArrSplit.length > 1 ? strArrSplit[1] : "");
                                                                } catch (IOException e23) {
                                                                    e = e23;
                                                                    iOException = e;
                                                                    str = str3;
                                                                    throw new RuntimeException(iOException);
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                    th = th;
                                                                    str = str3;
                                                                    bufferedReader.close();
                                                                    processExec.destroy();
                                                                    throw th;
                                                                }
                                                            } catch (IOException e24) {
                                                                e = e24;
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                            }
                                                        }
                                                        z = z5;
                                                        z5 = z;
                                                    } else {
                                                        sharedPreferencesL = sharedPreferencesL;
                                                        if (line.contains("car.basic.tpms_units")) {
                                                            try {
                                                                logcatService.b.A.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                                z = z5;
                                                                z5 = z;
                                                            } catch (IOException e25) {
                                                                e = e25;
                                                                iOException = e;
                                                                str = str3;
                                                                throw new RuntimeException(iOException);
                                                            } catch (Throwable th25) {
                                                                th = th25;
                                                                th = th;
                                                                str = str3;
                                                                bufferedReader.close();
                                                                processExec.destroy();
                                                                throw th;
                                                            }
                                                        } else if (line.contains("car.basic.tire_temp_unit")) {
                                                            try {
                                                                logcatService.b.C.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                                z = z5;
                                                                z5 = z;
                                                            } catch (IOException e26) {
                                                                e = e26;
                                                                iOException = e;
                                                                str = str3;
                                                                throw new RuntimeException(iOException);
                                                            } catch (Throwable th26) {
                                                                th = th26;
                                                                th = th;
                                                                str = str3;
                                                                bufferedReader.close();
                                                                processExec.destroy();
                                                                throw th;
                                                            }
                                                        } else if (line.contains("car.unit_setting.temperature")) {
                                                            try {
                                                                logcatService.b.B.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                                z = z5;
                                                                z5 = z;
                                                            } catch (IOException e27) {
                                                                e = e27;
                                                                iOException = e;
                                                                str = str3;
                                                                throw new RuntimeException(iOException);
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                                th = th;
                                                                str = str3;
                                                                bufferedReader.close();
                                                                processExec.destroy();
                                                                throw th;
                                                            }
                                                        } else if (line.contains("sys.settings.language")) {
                                                            try {
                                                                logcatService.b.D.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                                z = z5;
                                                                z5 = z;
                                                            } catch (IOException e28) {
                                                                e = e28;
                                                                iOException = e;
                                                                str = str3;
                                                                throw new RuntimeException(iOException);
                                                            } catch (Throwable th28) {
                                                                th = th28;
                                                                th = th;
                                                                str = str3;
                                                                bufferedReader.close();
                                                                processExec.destroy();
                                                                throw th;
                                                            }
                                                        } else if (line.contains("sys.basic.ivi_power_mode")) {
                                                            try {
                                                                logcatService.b.G.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                                z = z5;
                                                                z5 = z;
                                                            } catch (IOException e29) {
                                                                e = e29;
                                                                iOException = e;
                                                                str = str3;
                                                                throw new RuntimeException(iOException);
                                                            } catch (Throwable th29) {
                                                                th = th29;
                                                                th = th;
                                                                str = str3;
                                                                bufferedReader.close();
                                                                processExec.destroy();
                                                                throw th;
                                                            }
                                                        } else if (line.contains("car.basic.chief_deputy_oil_box_setting.state")) {
                                                            try {
                                                                logcatService.b.H.f(Integer.valueOf(LogcatService.g(logcatService, line)));
                                                                z = z5;
                                                                z5 = z;
                                                            } catch (IOException e30) {
                                                                e = e30;
                                                                iOException = e;
                                                                str = str3;
                                                                throw new RuntimeException(iOException);
                                                            } catch (Throwable th30) {
                                                                th = th30;
                                                                th = th;
                                                                str = str3;
                                                                bufferedReader.close();
                                                                processExec.destroy();
                                                                throw th;
                                                            }
                                                        } else {
                                                            if (line.contains("sys.other.keyevent_notify")) {
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append("keyevent_notify=");
                                                                try {
                                                                    String[] strArrSplit2 = line.split("=");
                                                                    z = z5;
                                                                    sb.append(strArrSplit2.length > 1 ? strArrSplit2[1] : "");
                                                                    C0768yr.e("T500.SERVICE", sb.toString());
                                                                    if (line.contains("2006,1")) {
                                                                        if (logcatService.b.d().booleanValue()) {
                                                                            logcatService.b.e(1);
                                                                        }
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("2006,3")) {
                                                                        logcatService.b.e(2);
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("2006,4")) {
                                                                        LogcatService.h();
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("1006,1")) {
                                                                        logcatService.b.e(4);
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("1006,4")) {
                                                                        logcatService.b.e(6);
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("2007,1") || line.contains("1007,1")) {
                                                                        logcatService.b.e(7);
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("2007,3") || line.contains("1007,3")) {
                                                                        logcatService.b.e(8);
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("2007,4") || line.contains("1007,4")) {
                                                                        logcatService.b.e(9);
                                                                        logcatService.c = 50;
                                                                    } else if (line.contains("2003,0") || line.contains("2003,2")) {
                                                                        logcatService.c = 50;
                                                                        z5 = z;
                                                                        z2 = true;
                                                                    } else if (line.contains("2002,0") || line.contains("2002,2")) {
                                                                        logcatService.c = 50;
                                                                        z5 = z;
                                                                        z3 = true;
                                                                    } else if (line.contains("2004,0")) {
                                                                        logcatService.c = 50;
                                                                        z5 = z;
                                                                        z4 = true;
                                                                    } else if (line.contains("2004,3") || line.contains("1006,3")) {
                                                                        logcatService.b.h(Boolean.FALSE);
                                                                    }
                                                                } catch (IOException e31) {
                                                                    e = e31;
                                                                    iOException = e;
                                                                    str = str3;
                                                                    throw new RuntimeException(iOException);
                                                                } catch (Throwable th31) {
                                                                    th = th31;
                                                                    th = th;
                                                                    str = str3;
                                                                    bufferedReader.close();
                                                                    processExec.destroy();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                z = z5;
                                                            }
                                                            z5 = z;
                                                        }
                                                    }
                                                }
                                                th = th;
                                            } else if (sharedPreferencesL.getBoolean("fuel_tank_fix", false)) {
                                                logcatService.b.g(Float.valueOf(LogcatService.f(logcatService, line)));
                                            } else {
                                                logcatService.b.g(Float.valueOf(LogcatService.f(logcatService, line) / 10.0f));
                                            }
                                            sharedPreferencesL = sharedPreferencesL;
                                            z5 = true;
                                        } else if (!z5) {
                                            logcatService.b.g(Float.valueOf(LogcatService.f(logcatService, line)));
                                        }
                                        sharedPreferencesL = sharedPreferencesL;
                                        z = z5;
                                        z5 = z;
                                    }
                                    bufferedReader.close();
                                    processExec.destroy();
                                    throw th;
                                }
                                sharedPreferencesL = sharedPreferencesL;
                                z = z5;
                                if (!line.contains("GW_MultiDisplay::") || !line.contains("PageView{updateContentOnly=false") || line.endsWith("PageView{updateContentOnly=false, cnt=1, cur=0, oriPage=null, curPage=null}")) {
                                    z5 = z;
                                } else if (z2) {
                                    if (LogcatService.i(logcatService, line)) {
                                        logcatService.b.h(Boolean.FALSE);
                                    } else {
                                        if (LogcatService.j(logcatService, line)) {
                                            logcatService.b.h(Boolean.TRUE);
                                        }
                                        z5 = z;
                                        z2 = false;
                                    }
                                    z3 = false;
                                    z5 = z;
                                    z2 = false;
                                } else if (z3) {
                                    if (LogcatService.k(logcatService, line)) {
                                        logcatService.b.h(Boolean.TRUE);
                                    } else if (LogcatService.a(logcatService, line)) {
                                        logcatService.b.h(Boolean.FALSE);
                                    }
                                    z5 = z;
                                    z3 = false;
                                } else {
                                    if (!z4 && line.contains("oriPage=Page{packageName") && line.endsWith("curPage=null}") && !line.contains("type=21") && !line.contains("com.gwm.navi.app")) {
                                        logcatService.b.h(Boolean.TRUE);
                                    }
                                    z5 = z;
                                    z4 = false;
                                }
                                if (i > 1000) {
                                    LogcatService.d(logcatService);
                                    i = 0;
                                }
                            } catch (IOException e32) {
                                e = e32;
                                str3 = str3;
                            } catch (Throwable th32) {
                                th = th32;
                                str3 = str3;
                            }
                            iOException = e;
                            str = str3;
                            try {
                                throw new RuntimeException(iOException);
                            } catch (Throwable th33) {
                                th = th33;
                            }
                        }
                        str2 = str3;
                        SharedPreferences sharedPreferences = sharedPreferencesL;
                        boolean z6 = z5;
                        i2++;
                        C0768yr.e("T500.SERVICE", "exit from while");
                        C0768yr.e("T500.SERVICE", "isServiceStopped=[" + logcatService.a + "]");
                        if (i2 > 2) {
                            break;
                        }
                        sf = this;
                        str3 = str2;
                        sharedPreferencesL = sharedPreferences;
                        z5 = z6;
                    } else {
                        str2 = str3;
                        break;
                    }
                } catch (IOException e33) {
                    str = str3;
                    iOException = e33;
                } catch (Throwable th34) {
                    th = th34;
                    str = str3;
                    th = th;
                }
            }
            try {
                bufferedReader.close();
                processExec.destroy();
            } catch (IOException e34) {
                C0768yr.c("T500.ERROR", str2, e34);
            }
            if (logcatService.a) {
                C0768yr.e("T500.SERVICE", "STOP reading logcat");
            } else {
                C0768yr.e("T500.SERVICE", "RESTART reading logcat");
                new Timer().schedule(new Sf(this, 1), 0L);
            }
        } catch (IOException e35) {
            throw new RuntimeException(e35);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                new Thread(((InternetMonitorService) this.b).c).start();
                break;
            case 1:
                new Thread(((LogcatService) ((Sf) this.b).b).d).start();
                break;
            case 2:
                a();
                break;
            case 3:
                new Thread(((TboxMonitorService) this.b).c).start();
                break;
            default:
                new Thread(((YnActivatingService) this.b).c).start();
                break;
        }
    }
}
