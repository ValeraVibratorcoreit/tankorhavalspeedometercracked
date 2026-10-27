package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.regex.Pattern;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class K9 extends AbstractComponentCallbacksC0784zc {
    public static final C0388mi d0;
    public Button T;
    public TextInputEditText U;
    public TextInputEditText V;
    public ProgressBar W;
    public TextView X;
    public CheckBox Y;
    public AutoCompleteTextView Z;
    public Handler a0;
    public String b0;
    public Context c0;

    static {
        Pattern pattern = C0388mi.c;
        d0 = Tf.r("application/json; charset=utf-8");
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void E(View view) {
        this.a0 = new Handler(Looper.getMainLooper());
        this.c0 = I().getApplicationContext();
        this.b0 = Tf.F(H(), "persist.gwm.vehicle.vin");
        this.Y = (CheckBox) view.findViewById(R.id.betaDownload);
        this.T = (Button) view.findViewById(R.id.btnDownload);
        ((TextView) view.findViewById(R.id.vin)).setText("VIN: " + this.b0);
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.password);
        this.U = textInputEditText;
        textInputEditText.setText(Tf.H("password"));
        TextInputEditText textInputEditText2 = (TextInputEditText) view.findViewById(R.id.authcode);
        this.V = textInputEditText2;
        textInputEditText2.setText(Tf.H("authcode"));
        this.W = (ProgressBar) view.findViewById(R.id.progressBar);
        this.X = (TextView) view.findViewById(R.id.progressText);
        ((TextView) view.findViewById(R.id.model)).setText(m(R.string.text_car_model1, Tf.v(H())));
        this.Z = (AutoCompleteTextView) view.findViewById(R.id.appList);
        ArrayList arrayList = new ArrayList();
        arrayList.add("NaviOnIP");
        arrayList.add("TouchControl");
        arrayList.add("NaviManager");
        arrayList.add("HiddenControl");
        this.Z.setAdapter(new ArrayAdapter(I(), android.R.layout.simple_dropdown_item_1line, arrayList));
        this.T.setOnClickListener(new ViewOnClickListenerC0069c6(this, 2));
    }

    public final void O() {
        Button button = this.T;
        if (button != null) {
            button.setEnabled(true);
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ProgressBar progressBar = this.W;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public final void P(Exception exc, String str) {
        R("ERROR" + exc);
        C0768yr.c("T500.ERROR", "ERROR in ".concat(str), exc);
    }

    public final void Q(Runnable runnable) {
        Handler handler = this.a0;
        if (handler == null) {
            return;
        }
        handler.post(new B1(this, 8, runnable));
    }

    public final void R(String str) {
        Q(new J9(this, str, 0));
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(I(), R.style.Theme_TankSpeedometer)).inflate(R.layout.download_apps_content, viewGroup, false);
    }
}
