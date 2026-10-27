package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0056bo extends LinearLayout {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public HashSet d;
    public boolean e;
    public String f;
    public InterfaceC0025ao g;
    public Zn h;

    public C0056bo(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.f = "";
        setOrientation(1);
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = this.b;
            if (i >= arrayList2.size()) {
                return;
            }
            ((View) arrayList2.get(i)).setSelected(((Yn) arrayList.get(i)).a.equals(this.f));
            i++;
        }
    }

    public void setFavoriteFilterEnabled(boolean z) {
        this.e = z;
    }

    public void setFavorites(Set<String> set) {
        this.d = set != null ? new HashSet(set) : new HashSet();
    }

    public void setItems(List<Yn> list) {
        ArrayList<Yn> arrayList = this.a;
        arrayList.clear();
        arrayList.addAll(list);
        removeAllViews();
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        ArrayList arrayList3 = this.c;
        arrayList3.clear();
        float f = getResources().getDisplayMetrics().density;
        for (final Yn yn : arrayList) {
            final LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            int i = (int) (14.0f * f);
            linearLayout.setPadding(i, i, i, i);
            linearLayout.setBackgroundResource(R.drawable.ts_bg_theme_card);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i2 = (int) (6.0f * f);
            layoutParams.setMargins(0, i2, 0, i2);
            linearLayout.setLayoutParams(layoutParams);
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(yn.c);
            linearLayout.addView(imageView, new LinearLayout.LayoutParams((int) (180.0f * f), (int) (110.0f * f)));
            TextView textView = new TextView(getContext());
            textView.setTextColor(getResources().getColor(R.color.ts_color_text_primary));
            textView.setTextSize(27.0f);
            textView.setGravity(16);
            textView.setSingleLine(true);
            textView.setText(yn.b);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.setMarginStart((int) (16.0f * f));
            linearLayout.addView(textView, layoutParams2);
            HashSet hashSet = this.d;
            String str = yn.a;
            boolean zContains = hashSet.contains(str);
            final ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(zContains ? R.drawable.ts_ic_heart_filled : R.drawable.ts_ic_heart_outline);
            if (!zContains) {
                imageView2.setColorFilter(getResources().getColor(R.color.ts_color_text_secondary), PorterDuff.Mode.SRC_IN);
            }
            int i3 = (int) (28.0f * f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i3, i3);
            layoutParams3.setMarginStart((int) (8.0f * f));
            imageView2.setLayoutParams(layoutParams3);
            imageView2.setClickable(true);
            imageView2.setFocusable(true);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: Xn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0056bo c0056bo = this.a;
                    HashSet hashSet2 = c0056bo.d;
                    Yn yn2 = yn;
                    boolean z = !hashSet2.contains(yn2.a);
                    ImageView imageView3 = imageView2;
                    String str2 = yn2.a;
                    if (z) {
                        c0056bo.d.add(str2);
                        imageView3.setImageResource(R.drawable.ts_ic_heart_filled);
                        imageView3.clearColorFilter();
                    } else {
                        c0056bo.d.remove(str2);
                        imageView3.setImageResource(R.drawable.ts_ic_heart_outline);
                        imageView3.setColorFilter(c0056bo.getResources().getColor(R.color.ts_color_text_secondary), PorterDuff.Mode.SRC_IN);
                    }
                    Zn zn = c0056bo.h;
                    if (zn != null) {
                        C0792zk c0792zk = (C0792zk) zn;
                        Ak ak = c0792zk.a;
                        if (z) {
                            ak.X.add(str2);
                        } else {
                            ak.X.remove(str2);
                        }
                        c0792zk.b.edit().putStringSet("favoriteThemes", new HashSet(ak.X)).apply();
                        ak.U.setFavorites(ak.X);
                        C0056bo c0056bo2 = ak.U;
                        float f2 = c0056bo2.getResources().getDisplayMetrics().density;
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList4 = c0056bo2.a;
                            if (i4 >= arrayList4.size()) {
                                break;
                            }
                            ArrayList arrayList5 = c0056bo2.c;
                            if (i4 >= arrayList5.size()) {
                                break;
                            }
                            boolean zContains2 = c0056bo2.d.contains(((Yn) arrayList4.get(i4)).a);
                            ((ImageView) arrayList5.get(i4)).setImageResource(zContains2 ? R.drawable.ts_ic_heart_filled : R.drawable.ts_ic_heart_outline);
                            ((ImageView) arrayList5.get(i4)).setColorFilter((ColorFilter) null);
                            if (!zContains2) {
                                ((ImageView) arrayList5.get(i4)).setColorFilter(c0056bo2.getResources().getColor(R.color.ts_color_text_secondary), PorterDuff.Mode.SRC_IN);
                            }
                            i4++;
                        }
                        ak.c0();
                    }
                    if (!c0056bo.e || z) {
                        return;
                    }
                    LinearLayout linearLayout2 = linearLayout;
                    linearLayout2.setVisibility(8);
                    linearLayout2.getLayoutParams().height = 0;
                }
            });
            linearLayout.addView(imageView2);
            linearLayout.setSelected(str.equals(this.f));
            linearLayout.setOnClickListener(new C3(this, 4, yn));
            if (this.e && !zContains) {
                linearLayout.setVisibility(8);
                linearLayout.getLayoutParams().height = 0;
            }
            addView(linearLayout);
            arrayList2.add(linearLayout);
            arrayList3.add(imageView2);
        }
    }

    public void setOnFavoriteToggle(Zn zn) {
        this.h = zn;
    }

    public void setOnThemeSelected(InterfaceC0025ao interfaceC0025ao) {
        this.g = interfaceC0025ao;
    }

    public void setSelectedValue(String str) {
        if (str == null) {
            str = "";
        }
        this.f = str;
        a();
    }
}
