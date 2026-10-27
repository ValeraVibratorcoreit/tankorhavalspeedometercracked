package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0729xj extends AbstractC0067c4 {
    public Wn U;
    public Pn V;
    public Pn W;
    public Pn X;
    public Pn Y;
    public Pn Z;
    public Pn a0;
    public Pn b0;
    public Pn c0;

    public static int e0(Pn pn) {
        return Integer.parseInt(pn.getValue().trim());
    }

    @Override // defpackage.AbstractC0067c4
    public final void Y(SettingsTopBar settingsTopBar) {
        settingsTopBar.c(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Default");
        for (String str : k().getStringArray(R.array.Themes)) {
            arrayList.add(str);
        }
        settingsTopBar.b(arrayList, this.T.z);
        settingsTopBar.setOnThemeSelected(new C0667vj(this));
        final int i = 0;
        settingsTopBar.a(R.string.text_restore_btn_text, new Runnable(this) { // from class: wj
            public final /* synthetic */ C0729xj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        C0729xj c0729xj = this.b;
                        c0729xj.c0(c0729xj.T.z);
                        c0729xj.h0();
                        break;
                    default:
                        C0729xj c0729xj2 = this.b;
                        c0729xj2.f0(c0729xj2.T.z);
                        boolean zP = Td.p("naviFullscreen");
                        if (Ud.A() != -1) {
                            Ud.p0(false);
                            Ud.n0(zP);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        settingsTopBar.a(R.string.text_save_btn_text, new Runnable(this) { // from class: wj
            public final /* synthetic */ C0729xj b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        C0729xj c0729xj = this.b;
                        c0729xj.c0(c0729xj.T.z);
                        c0729xj.h0();
                        break;
                    default:
                        C0729xj c0729xj2 = this.b;
                        c0729xj2.f0(c0729xj2.T.z);
                        boolean zP = Td.p("naviFullscreen");
                        if (Ud.A() != -1) {
                            Ud.p0(false);
                            Ud.n0(zP);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void c0(String str) {
        File file = new File(I().getExternalFilesDir(null), "navi");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, Vo.g("navi_config_", str, ".json"));
        if (!file2.exists()) {
            g0();
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb.append(line);
                }
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString());
            if (jSONObject.has("useDefault")) {
                this.U.setChecked(jSONObject.getBoolean("useDefault"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("fullscreen");
            JSONObject jSONObject3 = jSONObject.getJSONObject("windowed");
            this.V.setValue(String.valueOf(jSONObject2.getInt("left")));
            this.W.setValue(String.valueOf(jSONObject2.getInt("top")));
            this.X.setValue(String.valueOf(jSONObject2.getInt("right")));
            this.Y.setValue(String.valueOf(jSONObject2.getInt("bottom")));
            this.Z.setValue(String.valueOf(jSONObject3.getInt("left")));
            this.a0.setValue(String.valueOf(jSONObject3.getInt("top")));
            this.b0.setValue(String.valueOf(jSONObject3.getInt("right")));
            this.c0.setValue(String.valueOf(jSONObject3.getInt("bottom")));
        } catch (IOException e) {
            C0768yr.c("T500.ERROR", "ERROR in NaviWindowsFragment.loadConfiguration() - IO", e);
            g0();
        } catch (JSONException e2) {
            C0768yr.c("T500.ERROR", "ERROR in NaviWindowsFragment.loadConfiguration() - JSON", e2);
            g0();
        }
    }

    public final Pn d0(int i) {
        Pn pn = new Pn(I());
        pn.setTitle(i);
        pn.setInputTypeFlags(4098);
        pn.setOnValueChanged(new C0164f9(2));
        return pn;
    }

    public final void f0(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("useDefault", this.U.g.e);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", e0(this.V));
            jSONObject2.put("top", e0(this.W));
            jSONObject2.put("right", e0(this.X));
            jSONObject2.put("bottom", e0(this.Y));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("left", e0(this.Z));
            jSONObject3.put("top", e0(this.a0));
            jSONObject3.put("right", e0(this.b0));
            jSONObject3.put("bottom", e0(this.c0));
            jSONObject.put("fullscreen", jSONObject2);
            jSONObject.put("windowed", jSONObject3);
            File file = new File(I().getExternalFilesDir(null), "navi");
            if (!file.exists()) {
                file.mkdirs();
            }
            FileWriter fileWriter = new FileWriter(new File(file, "navi_config_" + str + ".json"));
            fileWriter.write(jSONObject.toString());
            fileWriter.flush();
            fileWriter.close();
            Toast.makeText(I(), m(R.string.text_navi_settings_save_msg, str), 1).show();
        } catch (IOException e) {
            C0768yr.c("T500.ERROR", "ERROR in NaviWindowsFragment.saveConfiguration() - IO", e);
        } catch (NumberFormatException e2) {
            C0768yr.c("T500.ERROR", "ERROR in NaviWindowsFragment.saveConfiguration() - NumberFormat", e2);
        } catch (JSONException e3) {
            C0768yr.c("T500.ERROR", "ERROR in NaviWindowsFragment.saveConfiguration() - JSON", e3);
        }
    }

    public final void g0() {
        this.V.setValue(String.valueOf(0));
        this.W.setValue(String.valueOf(40));
        this.X.setValue(String.valueOf(1920));
        this.Y.setValue(String.valueOf(740));
        this.Z.setValue(String.valueOf(550));
        this.a0.setValue(String.valueOf(80));
        this.b0.setValue(String.valueOf(1370));
        this.c0.setValue(String.valueOf(680));
        this.U.setChecked(false);
        f0(this.T.z);
    }

    public final void h0() {
        boolean z = !this.U.g.e || this.T.z.equals("Default");
        this.V.setRowEnabled(z);
        this.W.setRowEnabled(z);
        this.X.setRowEnabled(z);
        this.Y.setRowEnabled(z);
        this.Z.setRowEnabled(z);
        this.a0.setRowEnabled(z);
        this.b0.setRowEnabled(z);
        this.c0.setRowEnabled(z);
        if (this.T.z.equals("Default")) {
            this.U.setChecked(false);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        Wn wnB0 = b0(R.string.use_default_text, 0, 0, false, new C0667vj(this));
        this.U = wnB0;
        c0295jiV.addView(wnB0);
        O(c0295jiV, 12);
        c0295jiV.addView(a0(R.string.fullscreen_mode_text));
        In in = new In(I());
        this.V = d0(R.string.pref_in_navileft_title);
        this.W = d0(R.string.pref_in_navitop_title);
        this.X = d0(R.string.pref_in_naviright_title);
        this.Y = d0(R.string.pref_in_navibottom_title);
        in.addView(this.V);
        in.addView(this.W);
        in.addView(this.X);
        in.addView(this.Y);
        c0295jiV.addView(in);
        O(c0295jiV, 12);
        c0295jiV.addView(a0(R.string.windowed_mode_text));
        In in2 = new In(I());
        this.Z = d0(R.string.pref_in_navileft_title);
        this.a0 = d0(R.string.pref_in_navitop_title);
        this.b0 = d0(R.string.pref_in_naviright_title);
        this.c0 = d0(R.string.pref_in_navibottom_title);
        in2.addView(this.Z);
        in2.addView(this.a0);
        in2.addView(this.b0);
        in2.addView(this.c0);
        c0295jiV.addView(in2);
        c0(this.T.z);
        this.U.setRowEnabled(!this.T.z.equals("Default"));
        h0();
        return scrollViewW;
    }
}
