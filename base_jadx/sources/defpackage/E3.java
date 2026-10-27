package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: loaded from: classes.dex */
public class E3 extends AbstractC0067c4 {
    public final ArrayList U = new ArrayList();
    public H3 V;
    public ListView W;
    public Wn X;
    public Button Y;
    public Un Z;
    public LinearLayout a0;
    public LinearLayout b0;
    public LinearLayout c0;
    public String d0;
    public boolean e0;

    public static ImageView f0(View view, String str) {
        if ((view instanceof ImageView) && str.equals(view.getTag())) {
            return (ImageView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            ImageView imageViewF0 = f0(viewGroup.getChildAt(i), str);
            if (imageViewF0 != null) {
                return imageViewF0;
            }
        }
        return null;
    }

    public static TextView g0(View view, String str) {
        if ((view instanceof TextView) && str.equals(view.getTag())) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            TextView textViewG0 = g0(viewGroup.getChildAt(i), str);
            if (textViewG0 != null) {
                return textViewG0;
            }
        }
        return null;
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
        settingsTopBar.setOnThemeSelected(new A3(this, 0));
    }

    public final void c0() {
        String strR = R();
        boolean z = this.T.G(strR).getBoolean("useDefaultSwitchBack", true);
        String str = this.T.z;
        if (str.equals(strR) || (z && str.equals("Default"))) {
            X("selectedBackground");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0092  */
    public final LinearLayout d0(String str, final String str2, final boolean z) {
        float f = k().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(I());
        byte b = 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumHeight(P(56));
        int iP = P(12);
        linearLayout.setPadding(iP, P(4), iP, P(4));
        TextView textView = new TextView(I());
        textView.setText(str);
        textView.setTextColor(k().getColor(R.color.ts_color_text_primary));
        textView.setTextSize(33.0f);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(P(130), -2));
        final String strG = z ? Vo.g("bg_sun_", str2, "_time") : Vo.g("bg_time_", str2, "_time");
        SharedPreferences sharedPreferencesT = T();
        String str3 = "18:00";
        if (!z) {
            str2.getClass();
            switch (str2.hashCode()) {
                case -1376511864:
                    if (!str2.equals("evening")) {
                        b = -1;
                    }
                    break;
                case 99228:
                    b = !str2.equals("day") ? (byte) -1 : (byte) 1;
                    break;
                case 104817688:
                    b = !str2.equals("night") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    break;
                case 1:
                    str3 = "10:00";
                    break;
                case 2:
                    str3 = "22:00";
                    break;
                default:
                    str3 = "06:00";
                    break;
            }
        } else if ("day".equals(str2)) {
            str3 = "06:00";
        }
        String string = sharedPreferencesT.getString(strG, str3);
        final TextView textView2 = new TextView(I());
        textView2.setText(string);
        textView2.setTextColor(k().getColor(R.color.ts_color_text_secondary));
        textView2.setTextSize(27.0f);
        textView2.setGravity(17);
        textView2.setBackgroundResource(R.drawable.ts_bg_card_single);
        int iP2 = P(85);
        textView2.setPadding(P(8), P(6), P(8), P(6));
        textView2.setTag(str2 + "_" + strG);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: w3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final E3 e3 = this.a;
                e3.getClass();
                final TextView textView3 = textView2;
                int i = 6;
                int i2 = 0;
                try {
                    String[] strArrSplit = textView3.getText().toString().split(":");
                    i = Integer.parseInt(strArrSplit[0]);
                    i2 = Integer.parseInt(strArrSplit[1]);
                } catch (Exception unused) {
                }
                final TimePicker timePicker = new TimePicker(e3.I());
                timePicker.setIs24HourView(Boolean.TRUE);
                timePicker.setHour(i);
                timePicker.setMinute(i2);
                Q0 q0 = new Q0(e3.I());
                ((M0) q0.b).r = timePicker;
                final boolean z2 = z;
                final String str4 = strG;
                final String str5 = str2;
                q0.e(R.string.text_ok_btn_text, new DialogInterface.OnClickListener() { // from class: z3
                    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        StringBuilder sb;
                        String str6;
                        E3 e4 = e3;
                        e4.getClass();
                        TimePicker timePicker2 = timePicker;
                        String str7 = String.format("%02d:%02d", Integer.valueOf(timePicker2.getHour()), Integer.valueOf(timePicker2.getMinute()));
                        boolean z3 = z2;
                        String[] stringArray = z3 ? e4.k().getStringArray(R.array.bg_sun_period_keys) : e4.k().getStringArray(R.array.bg_period_keys);
                        int length = stringArray.length;
                        String[] strArr = new String[length];
                        for (int i4 = 0; i4 < stringArray.length; i4++) {
                            if (stringArray[i4].equals(str5)) {
                                strArr[i4] = str7;
                            } else {
                                if (z3) {
                                    sb = new StringBuilder("bg_sun_");
                                    str6 = stringArray[i4];
                                } else {
                                    sb = new StringBuilder("bg_time_");
                                    str6 = stringArray[i4];
                                }
                                String strH = Vo.h(sb, str6, "_time");
                                SharedPreferences sharedPreferencesT2 = e4.T();
                                String str8 = "18:00";
                                if (!z3) {
                                    String str9 = stringArray[i4];
                                    str9.getClass();
                                    switch (str9) {
                                        case "evening":
                                            break;
                                        case "day":
                                            str8 = "10:00";
                                            break;
                                        case "night":
                                            str8 = "22:00";
                                            break;
                                        default:
                                            str8 = "06:00";
                                            break;
                                    }
                                } else if ("day".equals(stringArray[i4])) {
                                    str8 = "06:00";
                                }
                                strArr[i4] = sharedPreferencesT2.getString(strH, str8);
                            }
                        }
                        for (int i5 = 1; i5 < length; i5++) {
                            if (strArr[i5].compareTo(strArr[i5 - 1]) <= 0) {
                                Toast.makeText(e4.I(), R.string.bg_time_sequence_error, 1).show();
                                return;
                            }
                        }
                        textView3.setText(str7);
                        e4.T().edit().putString(str4, str7).apply();
                        e4.k0();
                    }
                });
                q0.d(R.string.text_cancel_btn_text, null);
                q0.g();
            }
        });
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(iP2, -2));
        String strG2 = z ? Vo.g("bg_sun_", str2, "_img") : Vo.g("bg_time_", str2, "_img");
        final String string2 = T().getString(strG2, "BUILD_IN_NONE");
        ImageView imageView = new ImageView(I());
        int iP3 = P(80);
        int iP4 = P(45);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setBackgroundColor(Color.argb(255, 40, 40, 40));
        imageView.setTag(str2 + "_" + strG2 + "_" + z);
        o0(imageView, string2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iP3, iP4);
        layoutParams.setMarginStart(P(16));
        linearLayout.addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(I());
        imageView2.setImageResource(R.drawable.ts_ic_edit);
        imageView2.setColorFilter(k().getColor(R.color.ts_color_text_secondary), PorterDuff.Mode.SRC_IN);
        int iP5 = P(22);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iP5, iP5);
        layoutParams2.setMarginStart(P(6));
        linearLayout.addView(imageView2, layoutParams2);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: x3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E3 e3 = this.a;
                e3.d0 = str2;
                e3.e0 = z;
                L3 l3 = new L3();
                Bundle bundle = new Bundle();
                bundle.putString("current", string2);
                l3.L(bundle);
                l3.T = new C0308k0(e3, 2);
                e3.T.J(l3);
            }
        });
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void e0(Uri uri, File file) throws IOException {
        InputStream inputStreamOpenInputStream = I().getContentResolver().openInputStream(uri);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i <= -1) {
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            throw th4;
        }
    }

    public final String h0(Uri uri) {
        Cursor cursorQuery;
        int columnIndex;
        String string = null;
        if (uri.getScheme() != null && uri.getScheme().equals("content") && (cursorQuery = I().getContentResolver().query(uri, null, null, null, null)) != null) {
            if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) != -1) {
                string = cursorQuery.getString(columnIndex);
            }
            cursorQuery.close();
        }
        return string == null ? uri.getLastPathSegment() : string;
    }

    public final void i0() {
        ArrayList arrayList = this.U;
        arrayList.clear();
        arrayList.add(new F3(l(R.string.text_def_back_text), R.color.primary_dark, l(R.string.text_def_back_descr_text)));
        arrayList.add(new F3(l(R.string.text_transparent_back_text), R.drawable.transparent_ip_background, l(R.string.text_transparent_back_descr_text)));
        arrayList.add(new F3(l(R.string.text_kia_back_text), R.drawable.kia_background, l(R.string.text_kia_back_descr_text)));
        arrayList.add(new F3(l(R.string.text_brabus_back_text), R.drawable.brabus_background, l(R.string.text_brabus_descr_text)));
        arrayList.add(new F3(l(R.string.text_night_back_text), R.drawable.night_background, l(R.string.text_night_descr_text)));
        arrayList.add(new F3(l(R.string.text_trx_back_text), R.drawable.trx_background_03, l(R.string.text_trx_descr_text)));
        j0(I().getExternalFilesDir(null), false);
        j0(I().getFilesDir(), true);
        H3 h3 = this.V;
        if (h3 != null) {
            h3.notifyDataSetChanged();
        }
    }

    public final void j0(File file, boolean z) {
        File[] fileArrListFiles;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(".json")) {
                try {
                    JSONObject jSONObject = new JSONObject(new Scanner(file2).useDelimiter("\\Z").next());
                    String string = jSONObject.getString("shortDesc");
                    String strOptString = jSONObject.optString("longDesc", string);
                    String string2 = jSONObject.getString("imageFileName");
                    boolean zOptBoolean = jSONObject.optBoolean("protected", z);
                    File file3 = zOptBoolean ? new File(I().getFilesDir(), string2) : new File(I().getExternalFilesDir(null), string2);
                    if (file3.exists()) {
                        arrayList.add(new F3(Uri.fromFile(file3), string, strOptString, zOptBoolean));
                    }
                } catch (IOException e) {
                    e = e;
                    C0768yr.c("T500.Images", "Error in loadBackgroundItems()", e);
                } catch (JSONException e2) {
                    e = e2;
                    C0768yr.c("T500.Images", "Error in loadBackgroundItems()", e);
                }
            }
        }
        Collections.sort(arrayList, new D3(0));
        this.U.addAll(arrayList);
    }

    public final void k0() {
        String strR = R();
        boolean z = this.T.G(strR).getBoolean("useDefaultSwitchBack", true);
        String str = this.T.z;
        if (str.equals(strR) || (z && str.equals("Default"))) {
            X("bgMode");
        }
    }

    public final void l0(View view, boolean z) {
        for (String str : z ? k().getStringArray(R.array.bg_sun_period_keys) : k().getStringArray(R.array.bg_period_keys)) {
            String strG = Vo.g(z ? "bg_sun_" : "bg_time_", str, "_img");
            String string = T().getString(strG, "BUILD_IN_NONE");
            ImageView imageViewF0 = f0(view, str + "_" + strG + "_" + z);
            if (imageViewF0 != null) {
                o0(imageViewF0, string);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final void m0(View view, boolean z) {
        for (String str : z ? k().getStringArray(R.array.bg_sun_period_keys) : k().getStringArray(R.array.bg_period_keys)) {
            String strG = Vo.g(z ? "bg_sun_" : "bg_time_", str, "_time");
            SharedPreferences sharedPreferencesT = T();
            String str2 = "18:00";
            if (!z) {
                str.getClass();
                switch (str) {
                    case "evening":
                        break;
                    case "day":
                        str2 = "10:00";
                        break;
                    case "night":
                        str2 = "22:00";
                        break;
                    default:
                        str2 = "06:00";
                        break;
                }
            } else if ("day".equals(str)) {
                str2 = "06:00";
            }
            String string = sharedPreferencesT.getString(strG, str2);
            TextView textViewG0 = g0(view, str + "_" + strG);
            if (textViewG0 != null) {
                textViewG0.setText(string);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    public final void n0() {
        byte b;
        boolean zEquals = this.T.z.equals("Default");
        boolean z = !(this.X.g.e && !zEquals);
        String string = T().getString("bgMode", "static");
        this.Z.setValue(string);
        this.W.setVisibility(8);
        Button button = this.Y;
        if (button != null) {
            button.setVisibility(8);
        }
        this.a0.setVisibility(8);
        this.b0.setVisibility(8);
        this.c0.setVisibility(8);
        this.X.setVisibility(!zEquals ? 0 : 8);
        this.Z.setVisibility(z ? 0 : 8);
        if (z) {
            int iHashCode = string.hashCode();
            if (iHashCode != -892481938) {
                if (iHashCode != 114252) {
                    if (iHashCode == 3560141 && string.equals("time")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (string.equals("sun")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (string.equals("static")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                this.b0.setVisibility(0);
                l0(this.b0, false);
                m0(this.b0, false);
            } else if (b == 1) {
                this.c0.setVisibility(0);
                l0(this.c0, true);
                m0(this.c0, true);
            } else {
                this.a0.setVisibility(0);
                this.W.setVisibility(0);
                Button button2 = this.Y;
                if (button2 != null) {
                    button2.setVisibility(0);
                }
            }
        }
    }

    public final void o0(ImageView imageView, String str) {
        int i;
        if (str == null || str.equals("BUILD_IN_NONE")) {
            imageView.setImageDrawable(null);
            imageView.setBackgroundColor(Color.argb(255, 40, 40, 40));
            return;
        }
        try {
            if (str.startsWith("BUILD_IN")) {
                switch (str) {
                    case "BUILD_IN_BRABUS":
                        i = R.drawable.brabus_background;
                        break;
                    case "BUILD_IN_KIA":
                        i = R.drawable.kia_background;
                        break;
                    case "BUILD_IN_TRX":
                        i = R.drawable.trx_background_03;
                        break;
                    case "BUILD_IN_NIGHT":
                        i = R.drawable.night_background;
                        break;
                    case "BUILD_IN_TRANSPARENT":
                        i = R.drawable.transparent_ip_background;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i != -1) {
                    imageView.setImageResource(i);
                    return;
                }
            }
            File fileD0 = Ud.d0(I(), str);
            if (fileD0 != null) {
                FileInputStream fileInputStream = new FileInputStream(fileD0);
                try {
                    imageView.setImageDrawable(Drawable.createFromStream(fileInputStream, null));
                    fileInputStream.close();
                    return;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e) {
            C0768yr.c("T500.Images", "Error loading thumbnail", e);
        }
        imageView.setImageDrawable(null);
        imageView.setBackgroundColor(Color.argb(255, 40, 40, 40));
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void t(int i, int i2, Intent intent) {
        final Uri data;
        super.t(i, i2, intent);
        if (i2 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        if (i == 1) {
            View viewInflate = LayoutInflater.from(I()).inflate(R.layout.dialog_add_image, (ViewGroup) null);
            final EditText editText = (EditText) viewInflate.findViewById(R.id.edit_text_short_desc);
            final EditText editText2 = (EditText) viewInflate.findViewById(R.id.edit_text_long_desc);
            Q0 q0 = new Q0(I());
            M0 m0 = (M0) q0.b;
            m0.r = viewInflate;
            m0.d = l(R.string.text_add_desc_title);
            String strL = l(R.string.text_save_btn_text);
            final int i3 = 1;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: v3
                public final /* synthetic */ E3 b;

                {
                    this.b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    StringBuilder sb;
                    switch (i3) {
                        case 0:
                            Uri uri = data;
                            E3 e3 = this.b;
                            e3.getClass();
                            String string = editText.getText().toString();
                            String string2 = editText2.getText().toString();
                            try {
                                String strH0 = e3.h0(uri);
                                if (strH0 != null) {
                                    int iLastIndexOf = strH0.lastIndexOf(46);
                                    String str = "image_" + System.currentTimeMillis() + "." + (iLastIndexOf != -1 ? strH0.substring(iLastIndexOf + 1) : "");
                                    File externalFilesDir = e3.I().getExternalFilesDir(null);
                                    if (externalFilesDir != null) {
                                        e3.e0(uri, new File(externalFilesDir, str));
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("shortDesc", string);
                                        jSONObject.put("longDesc", string2);
                                        jSONObject.put("imageFileName", str);
                                        FileOutputStream fileOutputStream = new FileOutputStream(new File(externalFilesDir, Ud.u(str)));
                                        fileOutputStream.write(jSONObject.toString().getBytes());
                                        fileOutputStream.close();
                                        if (e3.d0 != null) {
                                            if (e3.e0) {
                                                sb = new StringBuilder("bg_sun_");
                                                sb.append(e3.d0);
                                                sb.append("_img");
                                            } else {
                                                sb = new StringBuilder("bg_time_");
                                                sb.append(e3.d0);
                                                sb.append("_img");
                                            }
                                            e3.T().edit().putString(sb.toString(), str).apply();
                                            boolean z = e3.e0;
                                            e3.l0(z ? e3.c0 : e3.b0, z);
                                            e3.c0();
                                        }
                                    }
                                    e3.i0();
                                }
                            } catch (IOException e) {
                                e = e;
                                C0768yr.c("T500.Images", "Error in savePeriodImageAndDescription()", e);
                                return;
                            } catch (JSONException e2) {
                                e = e2;
                                C0768yr.c("T500.Images", "Error in savePeriodImageAndDescription()", e);
                                return;
                            }
                            break;
                        default:
                            Uri uri2 = data;
                            E3 e4 = this.b;
                            e4.getClass();
                            String string3 = editText.getText().toString();
                            String string4 = editText2.getText().toString();
                            try {
                                String strH1 = e4.h0(uri2);
                                if (strH1 != null) {
                                    int iLastIndexOf2 = strH1.lastIndexOf(46);
                                    String str2 = "image_" + System.currentTimeMillis() + "." + (iLastIndexOf2 != -1 ? strH1.substring(iLastIndexOf2 + 1) : "");
                                    File externalFilesDir2 = e4.I().getExternalFilesDir(null);
                                    if (externalFilesDir2 != null) {
                                        e4.e0(uri2, new File(externalFilesDir2, str2));
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("shortDesc", string3);
                                        jSONObject2.put("longDesc", string4);
                                        jSONObject2.put("imageFileName", str2);
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(externalFilesDir2, Ud.u(str2)));
                                        fileOutputStream2.write(jSONObject2.toString().getBytes());
                                        fileOutputStream2.close();
                                    }
                                    e4.i0();
                                }
                            } catch (IOException e5) {
                                e = e5;
                                C0768yr.c("T500.Images", "Error in saveImageAndDescription()", e);
                            } catch (JSONException e6) {
                                e = e6;
                                C0768yr.c("T500.Images", "Error in saveImageAndDescription()", e);
                            }
                            break;
                    }
                }
            };
            m0.g = strL;
            m0.h = onClickListener;
            m0.i = l(R.string.text_cancel_btn_text);
            m0.j = null;
            q0.g();
            return;
        }
        if (i == 2) {
            View viewInflate2 = LayoutInflater.from(I()).inflate(R.layout.dialog_add_image, (ViewGroup) null);
            final EditText editText3 = (EditText) viewInflate2.findViewById(R.id.edit_text_short_desc);
            final EditText editText4 = (EditText) viewInflate2.findViewById(R.id.edit_text_long_desc);
            Q0 q1 = new Q0(I());
            M0 m1 = (M0) q1.b;
            m1.r = viewInflate2;
            m1.d = l(R.string.text_add_desc_title);
            String strL2 = l(R.string.text_save_btn_text);
            final int i4 = 0;
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: v3
                public final /* synthetic */ E3 b;

                {
                    this.b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    StringBuilder sb;
                    switch (i4) {
                        case 0:
                            Uri uri = data;
                            E3 e3 = this.b;
                            e3.getClass();
                            String string = editText3.getText().toString();
                            String string2 = editText4.getText().toString();
                            try {
                                String strH0 = e3.h0(uri);
                                if (strH0 != null) {
                                    int iLastIndexOf = strH0.lastIndexOf(46);
                                    String str = "image_" + System.currentTimeMillis() + "." + (iLastIndexOf != -1 ? strH0.substring(iLastIndexOf + 1) : "");
                                    File externalFilesDir = e3.I().getExternalFilesDir(null);
                                    if (externalFilesDir != null) {
                                        e3.e0(uri, new File(externalFilesDir, str));
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("shortDesc", string);
                                        jSONObject.put("longDesc", string2);
                                        jSONObject.put("imageFileName", str);
                                        FileOutputStream fileOutputStream = new FileOutputStream(new File(externalFilesDir, Ud.u(str)));
                                        fileOutputStream.write(jSONObject.toString().getBytes());
                                        fileOutputStream.close();
                                        if (e3.d0 != null) {
                                            if (e3.e0) {
                                                sb = new StringBuilder("bg_sun_");
                                                sb.append(e3.d0);
                                                sb.append("_img");
                                            } else {
                                                sb = new StringBuilder("bg_time_");
                                                sb.append(e3.d0);
                                                sb.append("_img");
                                            }
                                            e3.T().edit().putString(sb.toString(), str).apply();
                                            boolean z = e3.e0;
                                            e3.l0(z ? e3.c0 : e3.b0, z);
                                            e3.c0();
                                        }
                                    }
                                    e3.i0();
                                }
                            } catch (IOException e) {
                                e = e;
                                C0768yr.c("T500.Images", "Error in savePeriodImageAndDescription()", e);
                                return;
                            } catch (JSONException e2) {
                                e = e2;
                                C0768yr.c("T500.Images", "Error in savePeriodImageAndDescription()", e);
                                return;
                            }
                            break;
                        default:
                            Uri uri2 = data;
                            E3 e4 = this.b;
                            e4.getClass();
                            String string3 = editText3.getText().toString();
                            String string4 = editText4.getText().toString();
                            try {
                                String strH1 = e4.h0(uri2);
                                if (strH1 != null) {
                                    int iLastIndexOf2 = strH1.lastIndexOf(46);
                                    String str2 = "image_" + System.currentTimeMillis() + "." + (iLastIndexOf2 != -1 ? strH1.substring(iLastIndexOf2 + 1) : "");
                                    File externalFilesDir2 = e4.I().getExternalFilesDir(null);
                                    if (externalFilesDir2 != null) {
                                        e4.e0(uri2, new File(externalFilesDir2, str2));
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("shortDesc", string3);
                                        jSONObject2.put("longDesc", string4);
                                        jSONObject2.put("imageFileName", str2);
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(externalFilesDir2, Ud.u(str2)));
                                        fileOutputStream2.write(jSONObject2.toString().getBytes());
                                        fileOutputStream2.close();
                                    }
                                    e4.i0();
                                }
                            } catch (IOException e5) {
                                e = e5;
                                C0768yr.c("T500.Images", "Error in saveImageAndDescription()", e);
                            } catch (JSONException e6) {
                                e = e6;
                                C0768yr.c("T500.Images", "Error in saveImageAndDescription()", e);
                            }
                            break;
                    }
                }
            };
            m1.g = strL2;
            m1.h = onClickListener2;
            m1.i = l(R.string.text_cancel_btn_text);
            m1.j = null;
            q1.g();
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0295ji c0295jiV = V();
        Wn wnB0 = b0(R.string.ts_back_default_title, 0, 0, !this.T.z.equals("Default") && T().getBoolean("useDefaultSwitchBack", true), new A3(this, 1));
        this.X = wnB0;
        c0295jiV.addView(wnB0);
        O(c0295jiV, 12);
        Un un = new Un(I());
        this.Z = un;
        un.setTitleVisible(false);
        this.Z.b(R.array.bg_mode_entries, R.array.bg_mode_values);
        this.Z.setValue(T().getString("bgMode", "static"));
        this.Z.setOnValueChanged(new A3(this, 2));
        c0295jiV.addView(this.Z);
        O(c0295jiV, 12);
        LinearLayout linearLayout = new LinearLayout(I());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ListView listView = new ListView(I());
        this.W = listView;
        listView.setDivider(null);
        H3 h3 = new H3(I(), this, this.U);
        this.V = h3;
        this.W.setAdapter((ListAdapter) h3);
        linearLayout.addView(this.W, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        O(linearLayout, 12);
        final int i = 1;
        this.Y = Z(R.string.ts_add_image_btn, new Runnable(this) { // from class: B3
            public final /* synthetic */ E3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                switch (i) {
                    case 0:
                        E3 e3 = this.b;
                        e3.getClass();
                        String upperCase = AbstractC0390mk.l(AbstractC0402n1.a()).getString("carModel", "tank_500").replace("_", "").toUpperCase(Locale.US);
                        String[] strArr = Ud.a;
                        Toast.makeText(e3.I(), R.string.bg_downloading_msg, 0).show();
                        new Thread(new B1(e3, strArr, upperCase)).start();
                        break;
                    default:
                        E3 e4 = this.b;
                        e4.getClass();
                        e4.N(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1);
                        break;
                }
            }
        });
        this.Y.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(this.Y);
        this.a0 = linearLayout;
        float f = k().getDisplayMetrics().density;
        LinearLayout linearLayout2 = new LinearLayout(I());
        linearLayout2.setOrientation(1);
        String[] stringArray = k().getStringArray(R.array.bg_period_names);
        String[] stringArray2 = k().getStringArray(R.array.bg_period_keys);
        In in = new In(I());
        for (int i2 = 0; i2 < stringArray2.length; i2++) {
            in.addView(d0(stringArray[i2], stringArray2[i2], false));
        }
        linearLayout2.addView(in);
        O(linearLayout2, 12);
        String upperCase = AbstractC0390mk.l(AbstractC0402n1.a()).getString("carModel", "tank_500").replace("_", "").toUpperCase(Locale.US);
        final int i3 = 0;
        Button buttonZ = Z(R.string.bg_download_btn, new Runnable(this) { // from class: B3
            public final /* synthetic */ E3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Exception {
                switch (i3) {
                    case 0:
                        E3 e3 = this.b;
                        e3.getClass();
                        String upperCase2 = AbstractC0390mk.l(AbstractC0402n1.a()).getString("carModel", "tank_500").replace("_", "").toUpperCase(Locale.US);
                        String[] strArr = Ud.a;
                        Toast.makeText(e3.I(), R.string.bg_downloading_msg, 0).show();
                        new Thread(new B1(e3, strArr, upperCase2)).start();
                        break;
                    default:
                        E3 e4 = this.b;
                        e4.getClass();
                        e4.N(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1);
                        break;
                }
            }
        });
        buttonZ.setText(m(R.string.bg_download_btn, upperCase));
        buttonZ.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(buttonZ);
        this.b0 = linearLayout2;
        float f2 = k().getDisplayMetrics().density;
        LinearLayout linearLayout3 = new LinearLayout(I());
        linearLayout3.setOrientation(1);
        linearLayout3.addView(b0(R.string.bg_sun_auto_update, 0, 0, T().getBoolean("bg_sun_auto_update", true), new A3(this, 3)));
        O(linearLayout3, 8);
        String[] stringArray3 = k().getStringArray(R.array.bg_sun_period_names);
        String[] stringArray4 = k().getStringArray(R.array.bg_sun_period_keys);
        In in2 = new In(I());
        for (int i4 = 0; i4 < stringArray4.length; i4++) {
            in2.addView(d0(stringArray3[i4], stringArray4[i4], true));
        }
        linearLayout3.addView(in2);
        O(linearLayout3, 12);
        View viewZ = Z(R.string.bg_sun_refresh_btn, null);
        viewZ.setOnClickListener(new C3(this, 0, viewZ));
        viewZ.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(viewZ);
        this.c0 = linearLayout3;
        c0295jiV.addView(this.a0);
        c0295jiV.addView(this.b0);
        c0295jiV.addView(this.c0);
        i0();
        n0();
        return c0295jiV;
    }
}
