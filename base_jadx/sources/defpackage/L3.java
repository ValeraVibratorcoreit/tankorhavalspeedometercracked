package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class L3 extends AbstractComponentCallbacksC0784zc {
    public C0308k0 T;
    public String U;

    public static String P(F3 f3) {
        if (f3.a != null) {
            return new File(f3.a.getPath()).getName();
        }
        switch (f3.d) {
            case R.drawable.brabus_background /* 2131230855 */:
                return "BUILD_IN_BRABUS";
            case R.drawable.kia_background /* 2131230948 */:
                return "BUILD_IN_KIA";
            case R.drawable.night_background /* 2131231020 */:
                return "BUILD_IN_NIGHT";
            case R.drawable.transparent_ip_background /* 2131231059 */:
                return "BUILD_IN_TRANSPARENT";
            case R.drawable.trx_background_03 /* 2131231062 */:
                return "BUILD_IN_TRX";
            default:
                return "BUILD_IN_NONE";
        }
    }

    public static void Q(Context context, File file, boolean z, ArrayList arrayList) {
        File[] fileArrListFiles;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(".json")) {
                try {
                    JSONObject jSONObject = new JSONObject(new Scanner(file2).useDelimiter("\\Z").next());
                    String string = jSONObject.getString("shortDesc");
                    String strOptString = jSONObject.optString("longDesc", string);
                    String string2 = jSONObject.getString("imageFileName");
                    boolean zOptBoolean = jSONObject.optBoolean("protected", z);
                    File file3 = zOptBoolean ? new File(context.getFilesDir(), string2) : new File(context.getExternalFilesDir(null), string2);
                    if (file3.exists()) {
                        arrayList2.add(new F3(Uri.fromFile(file3), string, strOptString, zOptBoolean));
                    }
                } catch (Exception e) {
                    C0768yr.c("T500.BgPicker", "Error loading background item", e);
                }
            }
        }
        Collections.sort(arrayList2, new D3(1));
        arrayList.addAll(arrayList2);
    }

    public final void O() {
        if (f() instanceof InterfaceC0323kf) {
            ((MainActivity) ((InterfaceC0323kf) f())).F();
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void v(Bundle bundle) {
        super.v(bundle);
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            this.U = bundle2.getString("current");
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context contextI = I();
        float f = contextI.getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(contextI);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(contextI.getResources().getColor(R.color.ts_color_bg_app));
        linearLayout.setClickable(true);
        linearLayout.setFocusableInTouchMode(true);
        Context contextI2 = I();
        float f2 = contextI2.getResources().getDisplayMetrics().density;
        LinearLayout linearLayout2 = new LinearLayout(contextI2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setBackgroundColor(contextI2.getResources().getColor(R.color.ts_color_bg_sidebar));
        linearLayout2.setMinimumHeight(contextI2.getResources().getDimensionPixelSize(R.dimen.ts_topbar_height));
        int i = (int) (k().getDisplayMetrics().density * 12);
        linearLayout2.setPadding(i, 0, i, 0);
        ImageButton imageButton = new ImageButton(contextI2);
        imageButton.setImageResource(R.drawable.ts_arrow_back);
        imageButton.setBackgroundColor(0);
        final int i2 = 1;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: J3
            public final /* synthetic */ L3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                switch (i2) {
                    case 0:
                        L3 l3 = this.b;
                        C0308k0 c0308k0 = l3.T;
                        if (c0308k0 != null) {
                            E3 e3 = (E3) c0308k0.b;
                            e3.getClass();
                            e3.N(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 2);
                        }
                        l3.O();
                        break;
                    default:
                        this.b.O();
                        break;
                }
            }
        });
        int i3 = (int) (k().getDisplayMetrics().density * 40);
        linearLayout2.addView(imageButton, new LinearLayout.LayoutParams(i3, i3));
        TextView textView = new TextView(contextI2);
        textView.setText(R.string.bg_pick_title);
        textView.setTextColor(contextI2.getResources().getColor(R.color.ts_color_text_primary));
        textView.setTextSize(33.0f);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (k().getDisplayMetrics().density * 8));
        linearLayout2.addView(textView, layoutParams);
        linearLayout.addView(linearLayout2);
        C0295ji c0295ji = new C0295ji(contextI);
        c0295ji.setOrientation(1);
        int i4 = (int) (16.0f * f);
        c0295ji.setPadding(i4, i4, i4, i4);
        c0295ji.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new F3(l(R.string.text_def_back_text), R.color.primary_dark, l(R.string.text_def_back_descr_text)));
        arrayList.add(new F3(l(R.string.text_transparent_back_text), R.drawable.transparent_ip_background, l(R.string.text_transparent_back_descr_text)));
        arrayList.add(new F3(l(R.string.text_kia_back_text), R.drawable.kia_background, l(R.string.text_kia_back_descr_text)));
        arrayList.add(new F3(l(R.string.text_brabus_back_text), R.drawable.brabus_background, l(R.string.text_brabus_descr_text)));
        arrayList.add(new F3(l(R.string.text_night_back_text), R.drawable.night_background, l(R.string.text_night_descr_text)));
        arrayList.add(new F3(l(R.string.text_trx_back_text), R.drawable.trx_background_03, l(R.string.text_trx_descr_text)));
        Q(contextI, contextI.getExternalFilesDir(null), false, arrayList);
        Q(contextI, contextI.getFilesDir(), true, arrayList);
        ListView listView = new ListView(contextI);
        listView.setDivider(null);
        listView.setAdapter((ListAdapter) new K3(this, contextI, arrayList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: I3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
                L3 l3 = this.a;
                l3.getClass();
                String strP = L3.P((F3) arrayList.get(i5));
                C0308k0 c0308k0 = l3.T;
                if (c0308k0 != null) {
                    E3 e3 = (E3) c0308k0.b;
                    e3.T().edit().putString(Vo.h(e3.e0 ? new StringBuilder("bg_sun_") : new StringBuilder("bg_time_"), e3.d0, "_img"), strP).apply();
                    boolean z = e3.e0;
                    e3.l0(z ? e3.c0 : e3.b0, z);
                    e3.k0();
                }
                l3.O();
            }
        });
        c0295ji.addView(listView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        c0295ji.addView(new View(contextI), new LinearLayout.LayoutParams(-1, (int) (12.0f * f)));
        Button button = new Button(contextI);
        button.setText(R.string.text_add_image_btn);
        button.setAllCaps(false);
        button.setTextColor(contextI.getResources().getColor(R.color.ts_color_text_primary));
        button.setTextSize(0, contextI.getResources().getDimension(R.dimen.ts_button_text));
        button.setBackgroundResource(R.drawable.ts_bg_button_outline);
        int dimensionPixelSize = contextI.getResources().getDimensionPixelSize(R.dimen.ts_button_min_height);
        button.setMinHeight(dimensionPixelSize);
        button.setMinimumHeight(dimensionPixelSize);
        int i5 = (int) (f * 28.0f);
        button.setPadding(i5, 0, i5, 0);
        final int i6 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: J3
            public final /* synthetic */ L3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                switch (i6) {
                    case 0:
                        L3 l3 = this.b;
                        C0308k0 c0308k0 = l3.T;
                        if (c0308k0 != null) {
                            E3 e3 = (E3) c0308k0.b;
                            e3.getClass();
                            e3.N(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 2);
                        }
                        l3.O();
                        break;
                    default:
                        this.b.O();
                        break;
                }
            }
        });
        c0295ji.addView(button, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(c0295ji);
        return linearLayout;
    }
}
