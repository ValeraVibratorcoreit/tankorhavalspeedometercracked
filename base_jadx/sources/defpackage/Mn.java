package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class Mn extends AbstractComponentCallbacksC0784zc {
    public CharSequence T = "";
    public String U = "";
    public int V = 1;
    public CharSequence W;
    public C0098d4 X;
    public EditText Y;

    public final void O() {
        InputMethodManager inputMethodManager;
        if (this.Y != null && (inputMethodManager = (InputMethodManager) I().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(this.Y.getWindowToken(), 0);
        }
        Object objH = h();
        if (objH instanceof InterfaceC0323kf) {
            ((MainActivity) ((InterfaceC0323kf) objH)).F();
        }
    }

    public final int P(int i) {
        return (int) (k().getDisplayMetrics().density * i);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(I());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(k().getColor(R.color.ts_color_bg_app));
        linearLayout.setClickable(true);
        linearLayout.setFocusableInTouchMode(true);
        LinearLayout linearLayout2 = new LinearLayout(I());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setBackgroundColor(k().getColor(R.color.ts_color_bg_sidebar));
        linearLayout2.setMinimumHeight((int) k().getDimension(R.dimen.ts_topbar_height));
        int iP = P(12);
        linearLayout2.setPadding(iP, 0, iP, 0);
        ImageButton imageButton = new ImageButton(I());
        imageButton.setImageResource(R.drawable.ts_arrow_back);
        imageButton.setBackgroundColor(0);
        final int i = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: Ln
            public final /* synthetic */ Mn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.b.O();
                        break;
                    case 1:
                        this.b.Y.setText("");
                        break;
                    default:
                        Mn mn = this.b;
                        String string = mn.Y.getText().toString();
                        C0098d4 c0098d4 = mn.X;
                        if (c0098d4 != null) {
                            Pn pn = (Pn) c0098d4.b;
                            pn.setValue(string);
                            On on = pn.h;
                            if (on != null) {
                                on.a(string);
                            }
                        }
                        mn.O();
                        break;
                }
            }
        });
        int iP2 = P(40);
        linearLayout2.addView(imageButton, new LinearLayout.LayoutParams(iP2, iP2));
        TextView textView = new TextView(I());
        textView.setText(this.T);
        textView.setTextColor(k().getColor(R.color.ts_color_text_primary));
        textView.setTextSize(33.0f);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(P(8));
        linearLayout2.addView(textView, layoutParams);
        linearLayout.addView(linearLayout2);
        C0295ji c0295ji = new C0295ji(I());
        c0295ji.setOrientation(0);
        c0295ji.setGravity(16);
        int iP3 = P(16);
        c0295ji.setPadding(iP3, iP3, iP3, iP3);
        FrameLayout frameLayout = new FrameLayout(I());
        EditText editText = new EditText(I());
        this.Y = editText;
        editText.setInputType(this.V);
        this.Y.setText(this.U);
        this.Y.setHint(this.W);
        this.Y.setSingleLine(true);
        this.Y.setTextColor(k().getColor(R.color.ts_color_text_primary));
        this.Y.setTextSize(27.0f);
        this.Y.setBackgroundResource(R.drawable.ts_bg_edit_field);
        this.Y.setSelectAllOnFocus(true);
        this.Y.setPadding(P(14), P(12), P(44), P(12));
        this.Y.setMinHeight(P(52));
        frameLayout.addView(this.Y, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(I());
        imageView.setImageResource(R.drawable.ts_ic_clear);
        final int i2 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: Ln
            public final /* synthetic */ Mn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.b.O();
                        break;
                    case 1:
                        this.b.Y.setText("");
                        break;
                    default:
                        Mn mn = this.b;
                        String string = mn.Y.getText().toString();
                        C0098d4 c0098d4 = mn.X;
                        if (c0098d4 != null) {
                            Pn pn = (Pn) c0098d4.b;
                            pn.setValue(string);
                            On on = pn.h;
                            if (on != null) {
                                on.a(string);
                            }
                        }
                        mn.O();
                        break;
                }
            }
        });
        int iP4 = P(24);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iP4, iP4);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(P(12));
        frameLayout.addView(imageView, layoutParams2);
        c0295ji.addView(frameLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(I());
        textView2.setText(R.string.text_save_btn_text);
        textView2.setGravity(17);
        textView2.setTextColor(k().getColor(R.color.ts_color_bg_app));
        textView2.setTextSize(0, k().getDimension(R.dimen.ts_button_text));
        textView2.setBackgroundResource(R.drawable.ts_bg_button_accent);
        int iP5 = P(28);
        textView2.setPadding(iP5, 0, iP5, 0);
        textView2.setMinHeight(k().getDimensionPixelSize(R.dimen.ts_button_min_height));
        final int i3 = 2;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: Ln
            public final /* synthetic */ Mn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.O();
                        break;
                    case 1:
                        this.b.Y.setText("");
                        break;
                    default:
                        Mn mn = this.b;
                        String string = mn.Y.getText().toString();
                        C0098d4 c0098d4 = mn.X;
                        if (c0098d4 != null) {
                            Pn pn = (Pn) c0098d4.b;
                            pn.setValue(string);
                            On on = pn.h;
                            if (on != null) {
                                on.a(string);
                            }
                        }
                        mn.O();
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, P(52));
        layoutParams3.setMarginStart(P(12));
        textView2.setLayoutParams(layoutParams3);
        c0295ji.addView(textView2);
        this.Y.requestFocus();
        this.Y.post(new RunnableC0591t5(this, 18));
        linearLayout.addView(c0295ji);
        return linearLayout;
    }
}
