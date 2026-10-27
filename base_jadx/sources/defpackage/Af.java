package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Af {
    public static final List h = Arrays.asList("speedometer_default", "speedometer_default_big", "Digital", "Digital_micro", "Digital_big", "Digital_oldfw", "Digital_micro_oldfw", "Digital_big_oldfw", "Tank 500", "Tank 500_big", "KIA", "KIA_big", "KIA mini", "KIA mini_big", "speedometer_default_oldfw", "speedometer_default_big_oldfw", "Tank 500_oldfw", "Tank 500_big_oldfw", "KIA_oldfw", "KIA_big_oldfw", "KIA mini_oldfw", "KIA mini_big_oldfw", "Night center", "Night center_big", "Night center_oldfw", "Night center_big_oldfw", "speedometer_default_micro", "speedometer_default_micro_oldfw", "KIA mini_micro", "KIA mini_micro_oldfw", "Tank 500_micro", "Tank 500_micro_oldfw", "Night_micro", "Night_micro_oldfw");
    public final HashMap a;
    public Bq b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public final Dg g;

    public Af(Context context, Dg dg) {
        HashMap map = new HashMap();
        this.a = map;
        this.g = dg;
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(context);
        this.f = Br.s("infoInCenter", false);
        boolean z = sharedPreferencesL.getBoolean("extFirmware", true);
        Context contextA = AbstractC0402n1.a();
        C0211gp c0211gp = new C0211gp(contextA, dg, 120.0f, 36.0f);
        C0240hn c0240hn = new C0240hn(contextA, dg, 120.0f, 36.0f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c0211gp.c = 2;
        arrayList.add(c0211gp);
        V v = new V(contextA, dg, 29.0f, 2);
        v.c = 2;
        arrayList.add(v);
        V v2 = new V(contextA, dg, 29.0f, 0);
        v2.c = 2;
        arrayList.add(v2);
        c0240hn.c = 2;
        arrayList2.add(c0240hn);
        V v3 = new V(contextA, dg, 29.0f, 1);
        v3.c = 2;
        arrayList2.add(v3);
        Oq oq = new Oq(contextA, dg, R.layout.tires_fragment);
        oq.c = 2;
        arrayList2.add(oq);
        K2 k2 = new K2(16, false);
        k2.b = new ArrayList(arrayList);
        k2.c = new ArrayList(arrayList2);
        k2.d = new ArrayList(arrayList3);
        boolean zS = Br.s("transparentBackgroundInCenter", false);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        c0211gp.c = 2;
        arrayList4.add(c0211gp);
        c0240hn.c = 2;
        arrayList5.add(c0240hn);
        arrayList6.add(new C0613tr(contextA, dg));
        arrayList6.add(new V(contextA, dg, 48.0f, zS ? R.drawable.transparent_background : R.drawable.center_panel_default, 2));
        arrayList6.add(new V(contextA, dg, 48.0f, zS ? R.drawable.transparent_background : R.drawable.center_panel_default, 1));
        arrayList6.add(new V(contextA, dg, 48.0f, zS ? R.drawable.transparent_background : R.drawable.center_panel_default, 0));
        arrayList6.add(new Oq(contextA, dg, R.layout.tires_big_fragment, zS ? R.drawable.transparent_background : R.drawable.center_panel_default));
        K2 k3 = new K2(16, false);
        k3.b = new ArrayList(arrayList4);
        k3.c = new ArrayList(arrayList5);
        k3.d = new ArrayList(arrayList6);
        map.put("speedometer_default", new Bq(k2, k3));
        Context contextA2 = AbstractC0402n1.a();
        String string = contextA2.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA2).getString("selectedTheme", "Audi Virtual Cockpit"), 0).getString("INFO_PANEL", "speedometer_default");
        Bq bqA = a(string, true);
        this.b = bqA;
        K2 k4 = this.f ? bqA.b : bqA.a;
        this.c = Math.min(k4.w().length - 1, b("INFO_INDEX_L"));
        this.d = Math.min(k4.y().length - 1, b("INFO_INDEX_R"));
        this.e = Math.min(k4.l().length - 1, b("INFO_INDEX_C"));
        C0768yr.e("T500.INFO_PANEL", "theme=" + string);
        C0768yr.e("T500.INFO_PANEL", "centralMode=" + this.f);
        C0768yr.e("T500.INFO_PANEL", "extFirmware=" + z);
        C0768yr.e("T500.INFO_PANEL", "indexL=" + this.c);
        C0768yr.e("T500.INFO_PANEL", "indexR=" + this.d);
        C0768yr.e("T500.INFO_PANEL", "indexC=" + this.e);
    }

    public static int b(String str) {
        Context contextA = AbstractC0402n1.a();
        return contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0).getInt(str, 0);
    }

    public final Bq a(String str, boolean z) {
        Bq bq;
        byte b;
        C0768yr.e("T500.INFO_PANEL", "getInfoPanel()=" + str);
        boolean zContains = h.contains(str);
        HashMap map = this.a;
        if (zContains) {
            C0768yr.e("T500.INFO_PANEL", "preconfigured infopanels " + str);
            bq = (Bq) map.get(str);
            if (bq == null) {
                C0768yr.e("T500.INFO_PANEL", "infopanels not initialized " + str);
                str.getClass();
                Dg dg = this.g;
                byte b2 = -1;
                switch (str.hashCode()) {
                    case -2127013966:
                        if (str.equals("Digital_big_oldfw")) {
                            b2 = 0;
                        }
                        break;
                    case -1864619399:
                        if (str.equals("KIA mini_micro")) {
                            b2 = 1;
                        }
                        break;
                    case -1862682387:
                        if (str.equals("KIA mini_oldfw")) {
                            b2 = 2;
                        }
                        break;
                    case -1634746211:
                        if (str.equals("Tank 500_micro_oldfw")) {
                            b = 3;
                            b2 = b;
                        }
                        break;
                    case -1514506695:
                        if (str.equals("Digital_big")) {
                            b = 4;
                            b2 = b;
                        }
                        break;
                    case -1195513290:
                        if (str.equals("Night_micro_oldfw")) {
                            b = 5;
                            b2 = b;
                        }
                        break;
                    case -1186758850:
                        if (str.equals("Night center_big")) {
                            b = 6;
                            b2 = b;
                        }
                        break;
                    case -1186664127:
                        if (str.equals("speedometer_default_micro_oldfw")) {
                            b = 7;
                            b2 = b;
                        }
                        break;
                    case -969832968:
                        if (str.equals("Digital")) {
                            b = 8;
                            b2 = b;
                        }
                        break;
                    case -705144163:
                        if (str.equals("KIA_big_oldfw")) {
                            b = 9;
                            b2 = b;
                        }
                        break;
                    case -490246945:
                        if (str.equals("Tank 500")) {
                            b = 10;
                            b2 = b;
                        }
                        break;
                    case -355345422:
                        if (str.equals("KIA mini_micro_oldfw")) {
                            b = 11;
                            b2 = b;
                        }
                        break;
                    case -194129419:
                        if (str.equals("KIA mini_big")) {
                            b = 12;
                            b2 = b;
                        }
                        break;
                    case -176152652:
                        if (str.equals("KIA mini")) {
                            b = 13;
                            b2 = b;
                        }
                        break;
                    case -3816092:
                        if (str.equals("KIA_big")) {
                            b = 14;
                            b2 = b;
                        }
                        break;
                    case 74403:
                        if (str.equals("KIA")) {
                            b = 15;
                            b2 = b;
                        }
                        break;
                    case 89461629:
                        if (str.equals("speedometer_default_big_oldfw")) {
                            b2 = 16;
                        }
                        break;
                    case 175072693:
                        if (str.equals("Digitral_micro")) {
                            b = 17;
                            b2 = b;
                        }
                        break;
                    case 532855342:
                        if (str.equals("Digitral_micro_oldfw")) {
                            b = 18;
                            b2 = b;
                        }
                        break;
                    case 565074993:
                        if (str.equals("Digital_oldfw")) {
                            b = 19;
                            b2 = b;
                        }
                        break;
                    case 593569544:
                        if (str.equals("speedometer_default_micro")) {
                            b = 20;
                            b2 = b;
                        }
                        break;
                    case 595506556:
                        if (str.equals("speedometer_default_oldfw")) {
                            b = 21;
                            b2 = b;
                        }
                        break;
                    case 631542176:
                        if (str.equals("Tank 500_big")) {
                            b = 22;
                            b2 = b;
                        }
                        break;
                    case 639798428:
                        if (str.equals("KIA_oldfw")) {
                            b = 23;
                            b2 = b;
                        }
                        break;
                    case 714459383:
                        if (str.equals("Night center_big_oldfw")) {
                            b = 24;
                            b2 = b;
                        }
                        break;
                    case 1037477444:
                        if (str.equals("speedometer_default_big")) {
                            b = 25;
                            b2 = b;
                        }
                        break;
                    case 1288296829:
                        if (str.equals("Night center")) {
                            b = 26;
                            b2 = b;
                        }
                        break;
                    case 1331800932:
                        if (str.equals("Tank 500_micro")) {
                            b = 27;
                            b2 = b;
                        }
                        break;
                    case 1333737944:
                        if (str.equals("Tank 500_oldfw")) {
                            b = 28;
                            b2 = b;
                        }
                        break;
                    case 1842280046:
                        if (str.equals("KIA mini_big_oldfw")) {
                            b = 29;
                            b2 = b;
                        }
                        break;
                    case 1998141430:
                        if (str.equals("Night center_oldfw")) {
                            b = 30;
                            b2 = b;
                        }
                        break;
                    case 2055473625:
                        if (str.equals("Tank 500_big_oldfw")) {
                            b = 31;
                            b2 = b;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                    case 9:
                    case 19:
                    case 23:
                        map.put(str, Ud.w(dg));
                        break;
                    case 1:
                    case 17:
                    case 27:
                        Context contextA = AbstractC0402n1.a();
                        boolean zS = Br.s("speedInCenter", false);
                        boolean zS2 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (zS) {
                            arrayList3.add(new C0613tr(contextA, dg));
                            arrayList3.add(new C0211gp(contextA, dg, zS2 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList3.add(new C0613tr(contextA, dg));
                        }
                        arrayList3.add(new V(contextA, dg, 48.0f, zS2 ? R.drawable.transparent_background : R.drawable.center_panel_default, 2));
                        arrayList3.add(new V(contextA, dg, 48.0f, zS2 ? R.drawable.transparent_background : R.drawable.center_panel_default, 1));
                        arrayList3.add(new V(contextA, dg, 48.0f, zS2 ? R.drawable.transparent_background : R.drawable.center_panel_default, 0));
                        arrayList3.add(new Oq(contextA, dg, R.layout.tires_big_fragment, zS2 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k2 = new K2(16, false);
                        k2.b = new ArrayList(arrayList);
                        k2.c = new ArrayList(arrayList2);
                        k2.d = new ArrayList(arrayList3);
                        map.put(str, new Bq(k2, k2));
                        break;
                    case 2:
                    case 29:
                        map.put(str, Ud.w(dg));
                        break;
                    case 3:
                    case 5:
                    case 11:
                    case 18:
                        Context contextA2 = AbstractC0402n1.a();
                        boolean zS3 = Br.s("speedInCenter", false);
                        boolean zS4 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (zS3) {
                            arrayList6.add(new C0613tr(contextA2, dg));
                            arrayList6.add(new C0211gp(contextA2, dg, zS4 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList6.add(new C0613tr(contextA2, dg));
                        }
                        arrayList6.add(new C0675vr(contextA2, dg, 48.0f, zS4 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        arrayList6.add(new Oq(contextA2, dg, R.layout.tires_big_fragment, zS4 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k3 = new K2(16, false);
                        k3.b = new ArrayList(arrayList4);
                        k3.c = new ArrayList(arrayList5);
                        k3.d = new ArrayList(arrayList6);
                        map.put(str, new Bq(k3, k3));
                        break;
                    case 4:
                    case 8:
                    case 14:
                    case 15:
                        map.put(str, Ud.v(dg));
                        break;
                    case 6:
                    case 26:
                        Context contextA3 = AbstractC0402n1.a();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(new V(contextA3, dg, 38.0f, R.drawable.center_panel_night_center, 5));
                        arrayList9.add(new V(contextA3, dg, 38.0f, R.drawable.center_panel_night_center, 4));
                        arrayList9.add(new V(contextA3, dg, 38.0f, R.drawable.center_panel_night_center, 3));
                        arrayList9.add(new Oq(contextA3, dg, R.layout.tires_big_fragment_night, R.drawable.center_panel_night_center));
                        K2 k4 = new K2(16, false);
                        k4.b = new ArrayList(arrayList7);
                        k4.c = new ArrayList(arrayList8);
                        k4.d = new ArrayList(arrayList9);
                        map.put(str, new Bq(k4, k4));
                        break;
                    case 7:
                        Context contextA4 = AbstractC0402n1.a();
                        C0211gp c0211gp = new C0211gp(contextA4, dg, 86.0f, 24.0f);
                        C0240hn c0240hn = new C0240hn(contextA4, dg, 86.0f, 24.0f);
                        boolean zS5 = Br.s("speedInCenter", false);
                        boolean zS6 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        ArrayList arrayList12 = new ArrayList();
                        if (zS5) {
                            arrayList12.add(new C0613tr(contextA4, dg));
                            arrayList12.add(new C0211gp(contextA4, dg, zS6 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList12.add(new C0613tr(contextA4, dg));
                        }
                        c0211gp.c = 2;
                        arrayList10.add(c0211gp);
                        c0240hn.c = 2;
                        arrayList11.add(c0240hn);
                        arrayList12.add(new C0675vr(contextA4, dg, 48.0f, zS6 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        arrayList12.add(new Oq(contextA4, dg, R.layout.tires_big_fragment, zS6 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k5 = new K2(16, false);
                        k5.b = new ArrayList(arrayList10);
                        k5.c = new ArrayList(arrayList11);
                        k5.d = new ArrayList(arrayList12);
                        map.put(str, new Bq(k5, k5));
                        break;
                    case 10:
                        Context contextA5 = AbstractC0402n1.a();
                        C0211gp c0211gp2 = new C0211gp(contextA5, dg, 93.0f, 27.0f);
                        C0240hn c0240hn2 = new C0240hn(contextA5, dg, 93.0f, 27.0f);
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = new ArrayList();
                        arrayList13.add(new C0613tr(contextA5, dg));
                        arrayList13.add(c0211gp2);
                        V v = new V(contextA5, dg, 25.0f, 2);
                        v.c = 2;
                        arrayList13.add(v);
                        V v2 = new V(contextA5, dg, 25.0f, 0);
                        v2.c = 2;
                        arrayList13.add(v2);
                        arrayList14.add(new C0613tr(contextA5, dg));
                        c0240hn2.c = 2;
                        arrayList14.add(c0240hn2);
                        V v3 = new V(contextA5, dg, 25.0f, 1);
                        v3.c = 2;
                        arrayList14.add(v3);
                        arrayList14.add(new Oq(contextA5, dg, R.layout.tires_fragment));
                        K2 k6 = new K2(16, false);
                        k6.b = new ArrayList(arrayList13);
                        k6.c = new ArrayList(arrayList14);
                        k6.d = new ArrayList(arrayList15);
                        boolean zS7 = Br.s("speedInCenter", false);
                        boolean zS8 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList arrayList17 = new ArrayList();
                        ArrayList arrayList18 = new ArrayList();
                        if (zS7) {
                            arrayList16.add(new C0613tr(contextA5, dg));
                            arrayList17.add(new C0613tr(contextA5, dg));
                            arrayList18.add(new C0613tr(contextA5, dg));
                            arrayList18.add(new C0211gp(contextA5, dg, zS8 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList16.add(c0211gp2);
                            arrayList17.add(c0240hn2);
                            arrayList18.add(new C0613tr(contextA5, dg));
                        }
                        arrayList18.add(new V(contextA5, dg, 48.0f, zS8 ? R.drawable.transparent_background : R.drawable.center_panel_default, 2));
                        arrayList18.add(new V(contextA5, dg, 48.0f, zS8 ? R.drawable.transparent_background : R.drawable.center_panel_default, 1));
                        arrayList18.add(new V(contextA5, dg, 48.0f, zS8 ? R.drawable.transparent_background : R.drawable.center_panel_default, 0));
                        arrayList18.add(new Oq(contextA5, dg, R.layout.tires_big_fragment, zS8 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k7 = new K2(16, false);
                        k7.b = new ArrayList(arrayList16);
                        k7.c = new ArrayList(arrayList17);
                        k7.d = new ArrayList(arrayList18);
                        map.put(str, new Bq(k6, k7));
                        break;
                    case 12:
                    case 13:
                        map.put(str, Ud.v(dg));
                        break;
                    case 16:
                        Context contextA6 = AbstractC0402n1.a();
                        C0211gp c0211gp3 = new C0211gp(contextA6, dg, 144.0f, 36.0f);
                        C0240hn c0240hn3 = new C0240hn(contextA6, dg, 144.0f, 36.0f);
                        ArrayList arrayList19 = new ArrayList();
                        ArrayList arrayList20 = new ArrayList();
                        ArrayList arrayList21 = new ArrayList();
                        c0211gp3.c = 2;
                        arrayList19.add(c0211gp3);
                        C0675vr c0675vr = new C0675vr(contextA6, dg, 37.0f);
                        c0675vr.c = 2;
                        arrayList19.add(c0675vr);
                        c0240hn3.c = 2;
                        arrayList20.add(c0240hn3);
                        Oq oq = new Oq(contextA6, dg, R.layout.tires_big_fragment);
                        oq.c = 2;
                        arrayList20.add(oq);
                        K2 k8 = new K2(16, false);
                        k8.b = new ArrayList(arrayList19);
                        k8.c = new ArrayList(arrayList20);
                        k8.d = new ArrayList(arrayList21);
                        boolean zS9 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList22 = new ArrayList();
                        ArrayList arrayList23 = new ArrayList();
                        ArrayList arrayList24 = new ArrayList();
                        c0211gp3.c = 2;
                        arrayList22.add(c0211gp3);
                        c0240hn3.c = 2;
                        arrayList23.add(c0240hn3);
                        arrayList24.add(new C0613tr(contextA6, dg));
                        arrayList24.add(new C0675vr(contextA6, dg, 48.0f, zS9 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        arrayList24.add(new Oq(contextA6, dg, R.layout.tires_big_fragment, zS9 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k9 = new K2(16, false);
                        k9.b = new ArrayList(arrayList22);
                        k9.c = new ArrayList(arrayList23);
                        k9.d = new ArrayList(arrayList24);
                        map.put(str, new Bq(k8, k9));
                        break;
                    case 20:
                        Context contextA7 = AbstractC0402n1.a();
                        C0211gp c0211gp4 = new C0211gp(contextA7, dg, 86.0f, 24.0f);
                        C0240hn c0240hn4 = new C0240hn(contextA7, dg, 86.0f, 24.0f);
                        boolean zS10 = Br.s("speedInCenter", false);
                        boolean zS11 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList25 = new ArrayList();
                        ArrayList arrayList26 = new ArrayList();
                        ArrayList arrayList27 = new ArrayList();
                        if (zS10) {
                            arrayList27.add(new C0613tr(contextA7, dg));
                            arrayList27.add(new C0211gp(contextA7, dg, zS11 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList27.add(new C0613tr(contextA7, dg));
                        }
                        c0211gp4.c = 2;
                        arrayList25.add(c0211gp4);
                        c0240hn4.c = 2;
                        arrayList26.add(c0240hn4);
                        arrayList27.add(new V(contextA7, dg, 48.0f, zS11 ? R.drawable.transparent_background : R.drawable.center_panel_default, 2));
                        arrayList27.add(new V(contextA7, dg, 48.0f, zS11 ? R.drawable.transparent_background : R.drawable.center_panel_default, 1));
                        arrayList27.add(new V(contextA7, dg, 48.0f, zS11 ? R.drawable.transparent_background : R.drawable.center_panel_default, 0));
                        arrayList27.add(new Oq(contextA7, dg, R.layout.tires_big_fragment, zS11 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k10 = new K2(16, false);
                        k10.b = new ArrayList(arrayList25);
                        k10.c = new ArrayList(arrayList26);
                        k10.d = new ArrayList(arrayList27);
                        map.put(str, new Bq(k10, k10));
                        break;
                    case 21:
                        Context contextA8 = AbstractC0402n1.a();
                        C0211gp c0211gp5 = new C0211gp(contextA8, dg, 120.0f, 36.0f);
                        C0240hn c0240hn5 = new C0240hn(contextA8, dg, 120.0f, 36.0f);
                        ArrayList arrayList28 = new ArrayList();
                        ArrayList arrayList29 = new ArrayList();
                        ArrayList arrayList30 = new ArrayList();
                        c0211gp5.c = 2;
                        arrayList28.add(c0211gp5);
                        C0675vr c0675vr2 = new C0675vr(contextA8, dg, 29.0f);
                        c0675vr2.c = 2;
                        arrayList28.add(c0675vr2);
                        c0240hn5.c = 2;
                        arrayList29.add(c0240hn5);
                        Oq oq2 = new Oq(contextA8, dg, R.layout.tires_fragment);
                        oq2.c = 2;
                        arrayList29.add(oq2);
                        K2 k11 = new K2(16, false);
                        k11.b = new ArrayList(arrayList28);
                        k11.c = new ArrayList(arrayList29);
                        k11.d = new ArrayList(arrayList30);
                        boolean zS12 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList31 = new ArrayList();
                        ArrayList arrayList32 = new ArrayList();
                        ArrayList arrayList33 = new ArrayList();
                        c0211gp5.c = 2;
                        arrayList31.add(c0211gp5);
                        c0240hn5.c = 2;
                        arrayList32.add(c0240hn5);
                        arrayList33.add(new C0613tr(contextA8, dg));
                        arrayList33.add(new C0675vr(contextA8, dg, 48.0f, zS12 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        arrayList33.add(new Oq(contextA8, dg, R.layout.tires_big_fragment, zS12 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k12 = new K2(16, false);
                        k12.b = new ArrayList(arrayList31);
                        k12.c = new ArrayList(arrayList32);
                        k12.d = new ArrayList(arrayList33);
                        map.put(str, new Bq(k11, k12));
                        break;
                    case 22:
                        Context contextA9 = AbstractC0402n1.a();
                        C0211gp c0211gp6 = new C0211gp(contextA9, dg, 120.0f, 36.0f);
                        C0240hn c0240hn6 = new C0240hn(contextA9, dg, 120.0f, 36.0f);
                        ArrayList arrayList34 = new ArrayList();
                        ArrayList arrayList35 = new ArrayList();
                        ArrayList arrayList36 = new ArrayList();
                        arrayList34.add(new C0613tr(contextA9, dg));
                        arrayList34.add(c0211gp6);
                        V v4 = new V(contextA9, dg, 30.0f, 2);
                        v4.c = 2;
                        arrayList34.add(v4);
                        V v5 = new V(contextA9, dg, 30.0f, 0);
                        v5.c = 2;
                        arrayList34.add(v5);
                        arrayList35.add(new C0613tr(contextA9, dg));
                        arrayList35.add(c0240hn6);
                        V v6 = new V(contextA9, dg, 30.0f, 1);
                        v6.c = 2;
                        arrayList35.add(v6);
                        arrayList35.add(new Oq(contextA9, dg, R.layout.tires_big_fragment));
                        K2 k13 = new K2(16, false);
                        k13.b = new ArrayList(arrayList34);
                        k13.c = new ArrayList(arrayList35);
                        k13.d = new ArrayList(arrayList36);
                        boolean zS13 = Br.s("speedInCenter", false);
                        boolean zS14 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList37 = new ArrayList();
                        ArrayList arrayList38 = new ArrayList();
                        ArrayList arrayList39 = new ArrayList();
                        if (zS13) {
                            arrayList37.add(new C0613tr(contextA9, dg));
                            arrayList38.add(new C0613tr(contextA9, dg));
                            arrayList39.add(new C0613tr(contextA9, dg));
                            arrayList39.add(new C0211gp(contextA9, dg, zS14 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList37.add(c0211gp6);
                            arrayList38.add(c0240hn6);
                            arrayList39.add(new C0613tr(contextA9, dg));
                        }
                        arrayList39.add(new V(contextA9, dg, 48.0f, zS14 ? R.drawable.transparent_background : R.drawable.center_panel_default, 2));
                        arrayList39.add(new V(contextA9, dg, 48.0f, zS14 ? R.drawable.transparent_background : R.drawable.center_panel_default, 1));
                        arrayList39.add(new V(contextA9, dg, 48.0f, zS14 ? R.drawable.transparent_background : R.drawable.center_panel_default, 0));
                        arrayList39.add(new Oq(contextA9, dg, R.layout.tires_big_fragment, zS14 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k14 = new K2(16, false);
                        k14.b = new ArrayList(arrayList37);
                        k14.c = new ArrayList(arrayList38);
                        k14.d = new ArrayList(arrayList39);
                        map.put(str, new Bq(k13, k14));
                        break;
                    case 24:
                    case 30:
                        Context contextA10 = AbstractC0402n1.a();
                        ArrayList arrayList40 = new ArrayList();
                        ArrayList arrayList41 = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        arrayList42.add(new V(contextA10, dg, 38.0f, R.drawable.center_panel_night_center, 6));
                        arrayList42.add(new Oq(contextA10, dg, R.layout.tires_big_fragment_night, R.drawable.center_panel_night_center));
                        K2 k15 = new K2(16, false);
                        k15.b = new ArrayList(arrayList40);
                        k15.c = new ArrayList(arrayList41);
                        k15.d = new ArrayList(arrayList42);
                        map.put(str, new Bq(k15, k15));
                        break;
                    case 25:
                        Context contextA11 = AbstractC0402n1.a();
                        C0211gp c0211gp7 = new C0211gp(contextA11, dg, 144.0f, 36.0f);
                        C0240hn c0240hn7 = new C0240hn(contextA11, dg, 144.0f, 36.0f);
                        ArrayList arrayList43 = new ArrayList();
                        ArrayList arrayList44 = new ArrayList();
                        ArrayList arrayList45 = new ArrayList();
                        c0211gp7.c = 2;
                        arrayList43.add(c0211gp7);
                        V v7 = new V(contextA11, dg, 37.0f, 2);
                        v7.c = 2;
                        arrayList43.add(v7);
                        V v8 = new V(contextA11, dg, 37.0f, 0);
                        v8.c = 2;
                        arrayList43.add(v8);
                        c0240hn7.c = 2;
                        arrayList44.add(c0240hn7);
                        V v9 = new V(contextA11, dg, 37.0f, 1);
                        v9.c = 2;
                        arrayList44.add(v9);
                        Oq oq3 = new Oq(contextA11, dg, R.layout.tires_big_fragment);
                        oq3.c = 2;
                        arrayList44.add(oq3);
                        K2 k16 = new K2(16, false);
                        k16.b = new ArrayList(arrayList43);
                        k16.c = new ArrayList(arrayList44);
                        k16.d = new ArrayList(arrayList45);
                        boolean zS15 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList46 = new ArrayList();
                        ArrayList arrayList47 = new ArrayList();
                        ArrayList arrayList48 = new ArrayList();
                        c0211gp7.c = 2;
                        arrayList46.add(c0211gp7);
                        c0240hn7.c = 2;
                        arrayList47.add(c0240hn7);
                        arrayList48.add(new C0613tr(contextA11, dg));
                        arrayList48.add(new V(contextA11, dg, 48.0f, zS15 ? R.drawable.transparent_background : R.drawable.center_panel_default, 2));
                        arrayList48.add(new V(contextA11, dg, 48.0f, zS15 ? R.drawable.transparent_background : R.drawable.center_panel_default, 1));
                        arrayList48.add(new V(contextA11, dg, 48.0f, zS15 ? R.drawable.transparent_background : R.drawable.center_panel_default, 0));
                        arrayList48.add(new Oq(contextA11, dg, R.layout.tires_big_fragment, zS15 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k17 = new K2(16, false);
                        k17.b = new ArrayList(arrayList46);
                        k17.c = new ArrayList(arrayList47);
                        k17.d = new ArrayList(arrayList48);
                        map.put(str, new Bq(k16, k17));
                        break;
                    case 28:
                        Context contextA12 = AbstractC0402n1.a();
                        C0211gp c0211gp8 = new C0211gp(contextA12, dg, 93.0f, 27.0f);
                        C0240hn c0240hn8 = new C0240hn(contextA12, dg, 93.0f, 27.0f);
                        ArrayList arrayList49 = new ArrayList();
                        ArrayList arrayList50 = new ArrayList();
                        ArrayList arrayList51 = new ArrayList();
                        arrayList49.add(new C0613tr(contextA12, dg));
                        arrayList49.add(c0211gp8);
                        arrayList49.add(new C0675vr(contextA12, dg, 25.0f));
                        arrayList50.add(new C0613tr(contextA12, dg));
                        arrayList50.add(c0240hn8);
                        arrayList50.add(new Oq(contextA12, dg, R.layout.tires_fragment));
                        K2 k18 = new K2(16, false);
                        k18.b = new ArrayList(arrayList49);
                        k18.c = new ArrayList(arrayList50);
                        k18.d = new ArrayList(arrayList51);
                        boolean zS16 = Br.s("speedInCenter", false);
                        boolean zS17 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList52 = new ArrayList();
                        ArrayList arrayList53 = new ArrayList();
                        ArrayList arrayList54 = new ArrayList();
                        if (zS16) {
                            arrayList52.add(new C0613tr(contextA12, dg));
                            arrayList53.add(new C0613tr(contextA12, dg));
                            arrayList54.add(new C0613tr(contextA12, dg));
                            arrayList54.add(new C0211gp(contextA12, dg, zS17 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList52.add(c0211gp8);
                            arrayList53.add(c0240hn8);
                            arrayList54.add(new C0613tr(contextA12, dg));
                        }
                        arrayList54.add(new C0675vr(contextA12, dg, 48.0f, zS17 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        arrayList54.add(new Oq(contextA12, dg, R.layout.tires_big_fragment, zS17 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k19 = new K2(16, false);
                        k19.b = new ArrayList(arrayList52);
                        k19.c = new ArrayList(arrayList53);
                        k19.d = new ArrayList(arrayList54);
                        map.put(str, new Bq(k18, k19));
                        break;
                    case 31:
                        Context contextA13 = AbstractC0402n1.a();
                        C0211gp c0211gp9 = new C0211gp(contextA13, dg, 120.0f, 36.0f);
                        C0240hn c0240hn9 = new C0240hn(contextA13, dg, 120.0f, 36.0f);
                        ArrayList arrayList55 = new ArrayList();
                        ArrayList arrayList56 = new ArrayList();
                        ArrayList arrayList57 = new ArrayList();
                        arrayList55.add(new C0613tr(contextA13, dg));
                        arrayList55.add(c0211gp9);
                        arrayList55.add(new C0675vr(contextA13, dg, 32.0f));
                        arrayList56.add(new C0613tr(contextA13, dg));
                        arrayList56.add(c0240hn9);
                        arrayList56.add(new Oq(contextA13, dg, R.layout.tires_big_fragment));
                        K2 k20 = new K2(16, false);
                        k20.b = new ArrayList(arrayList55);
                        k20.c = new ArrayList(arrayList56);
                        k20.d = new ArrayList(arrayList57);
                        boolean zS18 = Br.s("speedInCenter", false);
                        boolean zS19 = Br.s("transparentBackgroundInCenter", false);
                        ArrayList arrayList58 = new ArrayList();
                        ArrayList arrayList59 = new ArrayList();
                        ArrayList arrayList60 = new ArrayList();
                        if (zS18) {
                            arrayList58.add(new C0613tr(contextA13, dg));
                            arrayList59.add(new C0613tr(contextA13, dg));
                            arrayList60.add(new C0613tr(contextA13, dg));
                            arrayList60.add(new C0211gp(contextA13, dg, zS19 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        } else {
                            arrayList58.add(c0211gp9);
                            arrayList59.add(c0240hn9);
                            arrayList60.add(new C0613tr(contextA13, dg));
                        }
                        arrayList60.add(new C0675vr(contextA13, dg, 48.0f, zS19 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        arrayList60.add(new Oq(contextA13, dg, R.layout.tires_big_fragment, zS19 ? R.drawable.transparent_background : R.drawable.center_panel_default));
                        K2 k21 = new K2(16, false);
                        k21.b = new ArrayList(arrayList58);
                        k21.c = new ArrayList(arrayList59);
                        k21.d = new ArrayList(arrayList60);
                        map.put(str, new Bq(k20, k21));
                        break;
                }
                bq = (Bq) map.get(str);
                C0768yr.e("T500.INFO_PANEL", "infopanels =" + bq);
            }
        } else {
            bq = null;
        }
        if (bq != null || !z) {
            return bq;
        }
        C0768yr.e("T500.INFO_PANEL", "geting default infopanel for " + str);
        return (Bq) map.get("speedometer_default");
    }

    public final AbstractC0787zf c() {
        K2 k2 = this.f ? this.b.b : this.b.a;
        if (this.c == -1) {
            return null;
        }
        return k2.w()[this.c];
    }

    public final AbstractC0787zf d() {
        K2 k2 = this.f ? this.b.b : this.b.a;
        if (this.d == -1) {
            return null;
        }
        return k2.y()[this.d];
    }

    public final void e() {
        K2 k2 = this.f ? this.b.b : this.b.a;
        int length = k2.w().length;
        if (length > 0) {
            this.c = (this.c + 1) % length;
        }
        int length2 = k2.y().length;
        if (length2 > 0) {
            this.d = (this.d + 1) % length2;
        }
        int length3 = k2.l().length;
        if (length3 > 0) {
            this.e = (this.e + 1) % length3;
        }
        f();
        C0768yr.e("T500.INFO_PANEL", "next()");
        C0768yr.e("T500.INFO_PANEL", "indexL=" + this.c);
        C0768yr.e("T500.INFO_PANEL", "indexR=" + this.d);
        C0768yr.e("T500.INFO_PANEL", "indexC=" + this.e);
    }

    public final void f() {
        Context contextA = AbstractC0402n1.a();
        SharedPreferences.Editor editorEdit = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0).edit();
        editorEdit.putInt("INFO_INDEX_L", this.c);
        editorEdit.putInt("INFO_INDEX_R", this.d);
        editorEdit.putInt("INFO_INDEX_C", this.e);
        editorEdit.apply();
    }
}
