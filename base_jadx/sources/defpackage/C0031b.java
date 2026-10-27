package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.File;
import java.nio.file.Files;
import java.util.Locale;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0031b extends AbstractC0067c4 {
    public final TextView c0(String str) {
        TextView textView = new TextView(I());
        if (str != null) {
            textView.setText(str);
        }
        textView.setTextColor(k().getColor(R.color.ts_color_text_secondary));
        textView.setTextSize(0, k().getDimension(R.dimen.ts_text_secondary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = P(8);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Spanned spannedFromHtml;
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        LinearLayout linearLayout = new LinearLayout(I());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.ts_bg_card_single);
        int iP = P(20);
        linearLayout.setPadding(iP, iP, iP, iP);
        String strM = m(R.string.text_version, Tf.s());
        TextView textView = new TextView(I());
        textView.setText(strM);
        textView.setTextColor(k().getColor(R.color.ts_color_text_primary));
        textView.setTextSize(0, k().getDimension(R.dimen.ts_text_primary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = P(8);
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        linearLayout.addView(c0(m(R.string.text_car_model1, Tf.v(H()))));
        linearLayout.addView(c0("VIN: " + Tf.F(H(), "persist.gwm.vehicle.vin")));
        try {
            String string = S().getString("language", "sys");
            Locale locale = k().getConfiguration().locale;
            if (string.equals("sys")) {
                string = locale.getLanguage();
            }
            File file = new File(I().getFilesDir(), "about_" + string + ".txt");
            spannedFromHtml = (file.isFile() && file.exists()) ? Html.fromHtml(String.join("\n", Files.readAllLines(file.toPath())), 0) : null;
        } catch (Exception e) {
            C0768yr.c("T500.ERROR", "ERROR in AboutFragment.readAbout()", e);
        }
        if (spannedFromHtml != null) {
            TextView textViewC0 = c0(null);
            textViewC0.setText(spannedFromHtml);
            ((LinearLayout.LayoutParams) textViewC0.getLayoutParams()).topMargin = P(16);
            linearLayout.addView(textViewC0);
        }
        c0295jiV.addView(linearLayout);
        return scrollViewW;
    }
}
