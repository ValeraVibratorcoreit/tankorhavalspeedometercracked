package ru.zinovin.tankspeedometer.preferences.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import defpackage.C0363lo;
import defpackage.InterfaceC0394mo;
import defpackage.ViewOnClickListenerC0005a4;
import defpackage.ViewOnClickListenerC0301jo;
import java.util.ArrayList;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: loaded from: classes.dex */
public class SettingsTopBar extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public final ImageButton a;
    public final LinearLayout b;
    public final TextView c;
    public final LinearLayout d;
    public final AutoCompleteTextView e;
    public final LinearLayout f;
    public InterfaceC0394mo g;

    public SettingsTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        setMinimumHeight((int) getResources().getDimension(R.dimen.ts_topbar_height));
        setPadding(getResources().getDimensionPixelSize(R.dimen.ts_content_padding) + getResources().getDimensionPixelSize(R.dimen.ts_sidebar_width), 0, getResources().getDimensionPixelSize(R.dimen.ts_content_padding), 0);
        setBackgroundColor(getResources().getColor(R.color.ts_color_bg_app));
        ImageButton imageButton = new ImageButton(getContext());
        this.a = imageButton;
        imageButton.setImageResource(R.drawable.ts_arrow_back);
        this.a.setBackgroundColor(0);
        int i = (int) (getResources().getDisplayMetrics().density * 40.0f);
        addView(this.a, new LinearLayout.LayoutParams(i, i));
        this.a.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        this.b.setGravity(16);
        addView(this.b, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(getContext());
        this.c = textView;
        textView.setTextColor(getResources().getColor(R.color.ts_color_text_primary));
        this.c.setTextSize(33.0f);
        this.c.setSingleLine(true);
        this.c.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (getResources().getDisplayMetrics().density * 8.0f));
        addView(this.c, layoutParams);
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(16);
        TextView textView2 = new TextView(getContext());
        textView2.setText(R.string.ts_theme_label);
        textView2.setTextColor(getResources().getColor(R.color.ts_color_text_primary));
        textView2.setTextSize(27.0f);
        textView2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd((int) (8.0f * f));
        this.d.addView(textView2, layoutParams2);
        AutoCompleteTextView autoCompleteTextView = new AutoCompleteTextView(getContext());
        this.e = autoCompleteTextView;
        autoCompleteTextView.setInputType(0);
        this.e.setFocusable(false);
        this.e.setSingleLine(true);
        this.e.setTextColor(getResources().getColor(R.color.ts_color_text_secondary));
        this.e.setBackgroundColor(0);
        this.e.setPadding(0, 0, 0, 0);
        this.e.setGravity(8388613);
        this.d.addView(this.e, new LinearLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ts_ic_dropdown);
        int i2 = (int) (28.0f * f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.setMarginStart((int) (4.0f * f));
        imageView.setOnClickListener(new ViewOnClickListenerC0301jo(this, 0));
        this.d.addView(imageView, layoutParams3);
        this.d.setOnClickListener(new ViewOnClickListenerC0301jo(this, 1));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.setMarginEnd((int) (f * 12.0f));
        addView(this.d, layoutParams4);
        this.d.setVisibility(8);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.f = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f.setGravity(16);
        addView(this.f, new LinearLayout.LayoutParams(-2, -2));
        addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 1, 1.0f));
    }

    public final void a(int i, Runnable runnable) {
        Button button = new Button(getContext());
        button.setText(i);
        button.setAllCaps(false);
        button.setTextSize(0, getResources().getDimension(R.dimen.ts_topbar_button_text));
        button.setTextColor(getResources().getColor(R.color.ts_color_text_primary));
        button.setBackgroundResource(R.drawable.ts_bg_button_outline);
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ts_button_min_height);
        button.setMinHeight(dimensionPixelSize);
        button.setMinimumHeight(dimensionPixelSize);
        int i2 = (int) (getResources().getDisplayMetrics().density * 28.0f);
        button.setPadding(i2, 0, i2, 0);
        button.setOnClickListener(new ViewOnClickListenerC0005a4(2, runnable));
        LinearLayout linearLayout = this.f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (getResources().getDisplayMetrics().density * 8.0f));
        linearLayout.addView(button, layoutParams);
    }

    public final void b(ArrayList arrayList, String str) {
        this.e.setAdapter(new C0363lo(this, getContext(), arrayList));
        this.e.setText((CharSequence) str, false);
        this.e.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ko
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                int i2 = SettingsTopBar.h;
                SettingsTopBar settingsTopBar = this.a;
                settingsTopBar.getClass();
                String str2 = (String) adapterView.getItemAtPosition(i);
                InterfaceC0394mo interfaceC0394mo = settingsTopBar.g;
                if (interfaceC0394mo != null) {
                    interfaceC0394mo.b(str2);
                }
            }
        });
        this.e.setOnClickListener(new ViewOnClickListenerC0301jo(this, 2));
        Iterator it = arrayList.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, this.e.getPaint().measureText((String) it.next()));
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.width = ((int) Math.ceil(fMax)) + ((int) (getResources().getDisplayMetrics().density * 4.0f));
        this.e.setLayoutParams(layoutParams);
        this.e.setDropDownWidth(-2);
    }

    public final void c(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public void setOnBackClicked(Runnable runnable) {
        if (runnable == null) {
            this.a.setVisibility(8);
        } else {
            this.a.setVisibility(0);
            this.a.setOnClickListener(new ViewOnClickListenerC0005a4(1, runnable));
        }
    }

    public void setOnThemeSelected(InterfaceC0394mo interfaceC0394mo) {
        this.g = interfaceC0394mo;
    }

    public void setSelectedTheme(String str) {
        this.e.setText((CharSequence) str, false);
    }

    public void setThemeSpinnerEnabled(boolean z) {
        this.e.setEnabled(z);
        this.d.setAlpha(z ? 1.0f : 0.5f);
    }

    public void setTitle(int i) {
        this.c.setText(i);
    }
}
