package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.jni.JniUtils;
import ru.zinovin.tankspeedometer.DownloadActivity2;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0069c6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC0069c6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence[] charSequenceArr;
        int i = 9;
        int i2 = 2;
        Object obj = this.b;
        int i3 = 1;
        switch (this.a) {
            case 0:
                C0192g6 c0192g6 = (C0192g6) obj;
                EditText editText = c0192g6.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0192g6.q();
                return;
            case 1:
                DownloadActivity2 downloadActivity2 = (DownloadActivity2) obj;
                if (downloadActivity2.F.getText().toString().isEmpty()) {
                    downloadActivity2.G(downloadActivity2.getString(R.string.text_not_selected_app_msg));
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Thread thread = new Thread(new RunnableC0688w9(atomicBoolean, i2));
                thread.start();
                try {
                    thread.join();
                    break;
                } catch (InterruptedException e) {
                    downloadActivity2.F(e, "allowAction()");
                }
                if (!atomicBoolean.get()) {
                    downloadActivity2.G(downloadActivity2.getString(R.string.text_no_internet_msg));
                    return;
                }
                if (downloadActivity2.z.getText().toString().isEmpty()) {
                    downloadActivity2.G(downloadActivity2.getString(R.string.text_empty_password_warn));
                    return;
                }
                downloadActivity2.y.setEnabled(false);
                Tf.W("password", downloadActivity2.z.getText().toString().trim());
                Tf.W("authcode", downloadActivity2.A.getText().toString().trim());
                downloadActivity2.C.setVisibility(0);
                downloadActivity2.B.setVisibility(0);
                boolean zIsChecked = downloadActivity2.D.isChecked();
                String string = downloadActivity2.F.getText().toString();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("vin", Tf.F(downloadActivity2, "persist.gwm.vehicle.vin"));
                    jSONObject.put("password", downloadActivity2.z.getText().toString().trim());
                    jSONObject.put("token", downloadActivity2.A.getText().toString().trim());
                    jSONObject.put("beta", zIsChecked);
                    jSONObject.put("appname", string);
                    jSONObject.put("digits", JniUtils.getData(downloadActivity2));
                    jSONObject.put("lang", downloadActivity2.getResources().getConfiguration().locale.getLanguage());
                    break;
                } catch (JSONException e2) {
                    downloadActivity2.F(e2, "downloadAndInstallApk()");
                }
                new Thread(new H9(downloadActivity2, jSONObject, string, 0)).start();
                return;
            case 2:
                K9 k9 = (K9) obj;
                if (k9.Z.getText().toString().isEmpty()) {
                    k9.R(k9.l(R.string.text_not_selected_app_msg));
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                Thread thread2 = new Thread(new RunnableC0688w9(atomicBoolean2, 3));
                thread2.start();
                try {
                    thread2.join();
                    break;
                } catch (InterruptedException e3) {
                    k9.P(e3, "onClick()");
                }
                if (!atomicBoolean2.get()) {
                    k9.R(k9.l(R.string.text_no_internet_msg));
                    return;
                }
                if (k9.U.getText().toString().isEmpty()) {
                    k9.R(k9.l(R.string.text_empty_password_warn));
                    return;
                }
                k9.T.setEnabled(false);
                Tf.W("password", k9.U.getText().toString().trim());
                Tf.W("authcode", k9.V.getText().toString().trim());
                k9.X.setVisibility(0);
                k9.W.setVisibility(0);
                boolean zIsChecked2 = k9.Y.isChecked();
                String string2 = k9.Z.getText().toString();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("vin", k9.b0);
                    jSONObject2.put("password", k9.U.getText().toString().trim());
                    jSONObject2.put("token", k9.V.getText().toString().trim());
                    jSONObject2.put("beta", zIsChecked2);
                    jSONObject2.put("appname", string2);
                    jSONObject2.put("digits", JniUtils.getData(k9.c0));
                    jSONObject2.put("lang", k9.k().getConfiguration().locale.getLanguage());
                    break;
                } catch (JSONException e4) {
                    k9.P(e4, "downloadAndInstallApk()");
                }
                new Thread(new H9(k9, jSONObject2, string2, i3)).start();
                return;
            case 3:
                ((C0227ha) obj).u();
                return;
            case 4:
                ((C0112di) obj).Q();
                throw null;
            case 5:
                Bk bk = (Bk) obj;
                EditText editText2 = bk.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = bk.f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    bk.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    bk.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    bk.f.setSelection(selectionEnd);
                }
                bk.q();
                return;
            case 6:
                Kn kn = (Kn) obj;
                if (kn.f) {
                    Context context = kn.getContext();
                    C0623u6 c0623u6 = new C0623u6();
                    c0623u6.e = true;
                    c0623u6.f = true;
                    c0623u6.g = false;
                    Integer[] numArr = {null, null, null, null, null};
                    int dimension = (int) (context.getResources().getDimension(R.dimen.default_slider_margin) + 0.5f);
                    int dimension2 = (int) (context.getResources().getDimension(R.dimen.default_margin_top) + 0.5f);
                    Q0 q0 = new Q0(context, 0);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(1);
                    linearLayout.setPadding(dimension, dimension2, dimension, 0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                    layoutParams.weight = 1.0f;
                    C0685w6 c0685w6 = new C0685w6(context);
                    c0685w6.f = 8;
                    c0685w6.g = 1.0f;
                    c0685w6.h = 1.0f;
                    c0685w6.i = new Integer[]{null, null, null, null, null};
                    c0685w6.j = 0;
                    Paint paint = (Paint) Br.I().a;
                    paint.setColor(0);
                    c0685w6.m = paint;
                    Paint paint2 = (Paint) Br.I().a;
                    paint2.setColor(0);
                    c0685w6.n = paint2;
                    c0685w6.o = (Paint) Br.I().a;
                    c0685w6.q = new ArrayList();
                    c0685w6.r = new ArrayList();
                    c0685w6.v = new C0654v6(c0685w6);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AbstractC0607tl.b);
                    c0685w6.f = typedArrayObtainStyledAttributes.getInt(3, 10);
                    c0685w6.k = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(4, -1));
                    c0685w6.l = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(10, -1));
                    int i4 = typedArrayObtainStyledAttributes.getInt(12, 0);
                    AbstractC0093d abstractC0093dN = AbstractC0390mk.n((i4 == 0 || i4 != 1) ? 1 : 2);
                    c0685w6.x = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    c0685w6.y = typedArrayObtainStyledAttributes.getResourceId(6, 0);
                    c0685w6.setRenderer(abstractC0093dN);
                    c0685w6.setDensity(c0685w6.f);
                    c0685w6.c(c0685w6.k.intValue(), true);
                    typedArrayObtainStyledAttributes.recycle();
                    c0623u6.a = c0685w6;
                    linearLayout.addView(c0685w6, layoutParams);
                    M0 m0 = (M0) q0.b;
                    m0.r = linearLayout;
                    m0.d = kn.getContext().getString(R.string.text_select_color_title);
                    numArr[0] = Integer.valueOf(kn.j);
                    c0685w6.setRenderer(AbstractC0390mk.n(2));
                    c0685w6.setDensity(6);
                    c0623u6.g = true;
                    c0623u6.e = true;
                    c0623u6.f = false;
                    String string3 = kn.getContext().getString(R.string.text_ok_btn_text);
                    DialogInterfaceOnClickListenerC0592t6 dialogInterfaceOnClickListenerC0592t6 = new DialogInterfaceOnClickListenerC0592t6(c0623u6, new C0098d4(kn, 6));
                    m0.g = string3;
                    m0.h = dialogInterfaceOnClickListenerC0592t6;
                    m0.i = kn.getContext().getString(R.string.text_cancel_btn_text);
                    m0.j = null;
                    Integer numValueOf = 0;
                    int i5 = 0;
                    while (i5 < 5 && numArr[i5] != null) {
                        i5++;
                        numValueOf = Integer.valueOf(i5 / 2);
                    }
                    int iIntValue = numValueOf.intValue();
                    c0685w6.i = numArr;
                    c0685w6.j = iIntValue;
                    Integer num = numArr[iIntValue];
                    if (num == null) {
                        num = -1;
                    }
                    c0685w6.c(num.intValue(), true);
                    c0685w6.setShowBorder(true);
                    boolean z = c0623u6.e;
                    Context context2 = m0.a;
                    if (z) {
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) (context2.getResources().getDimension(R.dimen.default_slider_height) + 0.5f));
                        Ig ig = new Ig(context2);
                        ig.l = (Paint) Br.I().a;
                        ig.m = (Paint) Br.I().a;
                        Vi viI = Br.I();
                        Paint paint3 = (Paint) viI.a;
                        paint3.setColor(-1);
                        ((Paint) viI.a).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        ig.n = paint3;
                        c0623u6.b = ig;
                        ig.setLayoutParams(layoutParams2);
                        linearLayout.addView(c0623u6.b);
                        c0685w6.setLightnessSlider(c0623u6.b);
                        Ig ig2 = c0623u6.b;
                        Integer numValueOf2 = 0;
                        int i6 = 0;
                        while (i6 < 5 && numArr[i6] != null) {
                            i6++;
                            numValueOf2 = Integer.valueOf(i6 / 2);
                        }
                        ig2.setColor(numArr[numValueOf2.intValue()].intValue());
                        c0623u6.b.setShowBorder(true);
                    }
                    if (c0623u6.f) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) (context2.getResources().getDimension(R.dimen.default_slider_height) + 0.5f));
                        T0 t0 = new T0(context2);
                        t0.l = (Paint) Br.I().a;
                        t0.m = (Paint) Br.I().a;
                        t0.n = (Paint) Br.I().a;
                        Vi viI2 = Br.I();
                        Paint paint4 = (Paint) viI2.a;
                        paint4.setColor(-1);
                        ((Paint) viI2.a).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        t0.o = paint4;
                        t0.p = (Paint) Br.I().a;
                        c0623u6.c = t0;
                        t0.setLayoutParams(layoutParams3);
                        linearLayout.addView(c0623u6.c);
                        c0685w6.setAlphaSlider(c0623u6.c);
                        T0 t1 = c0623u6.c;
                        Integer numValueOf3 = 0;
                        int i7 = 0;
                        while (i7 < 5 && numArr[i7] != null) {
                            i7++;
                            numValueOf3 = Integer.valueOf(i7 / 2);
                        }
                        t1.setColor(numArr[numValueOf3.intValue()].intValue());
                        c0623u6.c.setShowBorder(true);
                    }
                    if (c0623u6.g) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                        EditText editText4 = (EditText) View.inflate(context2, R.layout.color_edit, null);
                        c0623u6.d = editText4;
                        editText4.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                        c0623u6.d.setSingleLine();
                        c0623u6.d.setVisibility(8);
                        c0623u6.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(c0623u6.f ? 9 : 7)});
                        linearLayout.addView(c0623u6.d, layoutParams4);
                        EditText editText5 = c0623u6.d;
                        Integer numValueOf4 = 0;
                        int i8 = 0;
                        while (i8 < 5 && numArr[i8] != null) {
                            i8++;
                            numValueOf4 = Integer.valueOf(i8 / 2);
                        }
                        editText5.setText(Tf.C(numArr[numValueOf4.intValue()].intValue(), c0623u6.f));
                        c0685w6.setColorEdit(c0623u6.d);
                    }
                    q0.b().show();
                    return;
                }
                return;
            case 7:
                final Pn pn = (Pn) obj;
                if (pn.f) {
                    Object context3 = pn.getContext();
                    if (context3 instanceof InterfaceC0323kf) {
                        Mn mn = new Mn();
                        CharSequence text2 = pn.b.getText();
                        String str = pn.i;
                        int i9 = pn.j;
                        CharSequence charSequence = pn.k;
                        C0098d4 c0098d4 = new C0098d4(pn, 7);
                        if (text2 == null) {
                            text2 = "";
                        }
                        mn.T = text2;
                        if (str == null) {
                            str = "";
                        }
                        mn.U = str;
                        mn.V = i9;
                        mn.W = charSequence;
                        mn.X = c0098d4;
                        ((MainActivity) ((InterfaceC0323kf) context3)).J(mn);
                        return;
                    }
                    final EditText editText6 = new EditText(pn.getContext());
                    editText6.setInputType(pn.j);
                    editText6.setText(pn.i);
                    editText6.setHint(pn.k);
                    editText6.setSelectAllOnFocus(true);
                    int i10 = (int) (pn.getResources().getDisplayMetrics().density * 20.0f);
                    FrameLayout frameLayout = new FrameLayout(pn.getContext());
                    frameLayout.setPadding(i10, i10 / 2, i10, 0);
                    frameLayout.addView(editText6);
                    Q0 q1 = new Q0(pn.getContext());
                    CharSequence text3 = pn.b.getText();
                    M0 m1 = (M0) q1.b;
                    m1.d = text3;
                    m1.r = frameLayout;
                    q1.e(R.string.text_ok_btn_text, new DialogInterface.OnClickListener() { // from class: Nn
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            Pn pn2 = pn;
                            pn2.getClass();
                            String string4 = editText6.getText().toString();
                            pn2.setValue(string4);
                            On on = pn2.h;
                            if (on != null) {
                                on.a(string4);
                            }
                        }
                    });
                    q1.d(R.string.text_cancel_btn_text, null);
                    q1.g();
                    return;
                }
                return;
            case 8:
                Rn rn = (Rn) obj;
                if (!rn.f || rn.i == null || (charSequenceArr = rn.j) == null) {
                    return;
                }
                String[] strArr = new String[charSequenceArr.length];
                for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
                    strArr[i11] = charSequenceArr[i11].toString();
                }
                int iIndexOf = Arrays.asList(strArr).indexOf(rn.k);
                Q0 q2 = new Q0(rn.getContext());
                CharSequence text4 = rn.b.getText();
                M0 m2 = (M0) q2.b;
                m2.d = text4;
                CharSequence[] charSequenceArr2 = rn.i;
                String[] strArr2 = new String[charSequenceArr2.length];
                for (int i12 = 0; i12 < charSequenceArr2.length; i12++) {
                    strArr2[i12] = charSequenceArr2[i12].toString();
                }
                M3 m3 = new M3(rn, i3);
                m2.o = strArr2;
                m2.q = m3;
                m2.t = iIndexOf;
                m2.s = true;
                q2.d(R.string.text_cancel_btn_text, null);
                q2.g();
                return;
            default:
                Wn wn = (Wn) obj;
                if (wn.f) {
                    C0353le c0353le = wn.g;
                    boolean z2 = !c0353le.e;
                    c0353le.e = z2;
                    float f = z2 ? 1.0f : 0.0f;
                    c0353le.j = c0353le.f;
                    c0353le.k = f;
                    c0353le.i = System.currentTimeMillis();
                    c0353le.h = true;
                    RunnableC0524r0 runnableC0524r0 = c0353le.l;
                    c0353le.removeCallbacks(runnableC0524r0);
                    c0353le.postOnAnimation(runnableC0524r0);
                    if (c0353le.g != null) {
                        c0353le.post(new RunnableC0591t5(c0353le, i));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
