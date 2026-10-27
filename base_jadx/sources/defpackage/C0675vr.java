package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0675vr extends AbstractC0787zf {
    public final Lf e;
    public int f;
    public final float g;
    public int h;
    public int i;
    public final int j;

    public C0675vr(Context context, Dg dg, float f) {
        super(context, dg, R.layout.trip_info_fragment);
        this.e = Lf.a();
        this.f = R.string.text_trip_title;
        this.h = -1;
        this.i = -9144711;
        this.j = R.drawable.transparent_background;
        this.g = f;
        a();
    }

    private String getTitle() {
        Context context = this.b;
        String string = AbstractC0390mk.l(context).getString("language", "sys");
        Locale locale = context.getResources().getConfiguration().locale;
        if (string.equals("sys")) {
            string = locale.getLanguage();
        }
        return F4.b0(context, string).getString(getTitleId());
    }

    public void a() {
        C0768yr.e("T500.FR", "TripInfoFragment.init()");
        Context context = this.b;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayout(), this);
        ImageView imageView = (ImageView) findViewById(R.id.info_panel_background);
        if (imageView != null) {
            imageView.setImageDrawable(H7.b(context, this.j));
        }
        float f = this.g;
        float f2 = 1.7f * f * getResources().getDisplayMetrics().scaledDensity;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraint_layout);
        C0624u7 c0624u7 = new C0624u7();
        c0624u7.b(constraintLayout);
        TextView textView = (TextView) findViewById(R.id.title1);
        if (textView != null) {
            c0624u7.d(textView.getId(), (int) f2);
            textView.setText(getTitle());
            textView.setTextSize(f);
            textView.setTextColor(this.i);
        }
        TextView textView2 = (TextView) findViewById(R.id.odoJourney);
        Lf lf = this.e;
        if (textView2 != null) {
            int i = (int) f2;
            textView2.setHeight(i);
            c0624u7.d(textView2.getId(), i);
            textView2.setTextSize(f);
            final int i2 = 0;
            Lf.f(lf.o, this, new Mj(this) { // from class: ur
                public final /* synthetic */ C0675vr b;

                {
                    this.b = this;
                }

                @Override // defpackage.Mj
                public final void w(Object obj) {
                    switch (i2) {
                        case 0:
                            C0675vr c0675vr = this.b;
                            c0675vr.c(R.id.odoJourney, "%.1f", (Float) obj, c0675vr.h);
                            break;
                        case 1:
                            C0675vr c0675vr2 = this.b;
                            c0675vr2.c(R.id.odoAccumulated, "%.1f", (Float) obj, c0675vr2.h);
                            break;
                        case 2:
                            Float f3 = (Float) obj;
                            C0675vr c0675vr3 = this.b;
                            c0675vr3.getClass();
                            if (f3.floatValue() != -1.0f) {
                                c0675vr3.c(R.id.avgFuelCons, "%.1f", f3, c0675vr3.h);
                            } else {
                                c0675vr3.c(R.id.avgFuelCons, "%s", "__._", c0675vr3.h);
                            }
                            break;
                        case 3:
                            Float f4 = (Float) obj;
                            C0675vr c0675vr4 = this.b;
                            c0675vr4.getClass();
                            if (f4.floatValue() != -1.0f) {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%.1f", f4, c0675vr4.h);
                            } else {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%s", "__._", c0675vr4.h);
                            }
                            break;
                        case 4:
                            Float f5 = (Float) obj;
                            C0675vr c0675vr5 = this.b;
                            c0675vr5.getClass();
                            if (f5.floatValue() > 0.0f) {
                                c0675vr5.c(R.id.avgSpeedJourney, "%.0f", f5, c0675vr5.h);
                            } else {
                                c0675vr5.c(R.id.avgSpeedJourney, "%s", "___", c0675vr5.h);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            C0675vr c0675vr6 = this.b;
                            c0675vr6.getClass();
                            if (num.intValue() > 0) {
                                int iIntValue = num.intValue() / 60;
                                int iIntValue2 = num.intValue() % 60;
                                c0675vr6.c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), c0675vr6.h);
                            } else {
                                c0675vr6.c(R.id.driveTimeJourneyH, "%s", "0", c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%s", "00", c0675vr6.h);
                            }
                            break;
                    }
                }
            });
            c(R.id.odoJourney, "%.1f", (Float) lf.o.d(), this.h);
        }
        TextView textView3 = (TextView) findViewById(R.id.odoAccumulated);
        if (textView3 != null) {
            int i3 = (int) f2;
            textView3.setHeight(i3);
            c0624u7.d(textView3.getId(), i3);
            textView3.setTextSize(f);
            final int i4 = 1;
            Lf.f(lf.q, this, new Mj(this) { // from class: ur
                public final /* synthetic */ C0675vr b;

                {
                    this.b = this;
                }

                @Override // defpackage.Mj
                public final void w(Object obj) {
                    switch (i4) {
                        case 0:
                            C0675vr c0675vr = this.b;
                            c0675vr.c(R.id.odoJourney, "%.1f", (Float) obj, c0675vr.h);
                            break;
                        case 1:
                            C0675vr c0675vr2 = this.b;
                            c0675vr2.c(R.id.odoAccumulated, "%.1f", (Float) obj, c0675vr2.h);
                            break;
                        case 2:
                            Float f3 = (Float) obj;
                            C0675vr c0675vr3 = this.b;
                            c0675vr3.getClass();
                            if (f3.floatValue() != -1.0f) {
                                c0675vr3.c(R.id.avgFuelCons, "%.1f", f3, c0675vr3.h);
                            } else {
                                c0675vr3.c(R.id.avgFuelCons, "%s", "__._", c0675vr3.h);
                            }
                            break;
                        case 3:
                            Float f4 = (Float) obj;
                            C0675vr c0675vr4 = this.b;
                            c0675vr4.getClass();
                            if (f4.floatValue() != -1.0f) {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%.1f", f4, c0675vr4.h);
                            } else {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%s", "__._", c0675vr4.h);
                            }
                            break;
                        case 4:
                            Float f5 = (Float) obj;
                            C0675vr c0675vr5 = this.b;
                            c0675vr5.getClass();
                            if (f5.floatValue() > 0.0f) {
                                c0675vr5.c(R.id.avgSpeedJourney, "%.0f", f5, c0675vr5.h);
                            } else {
                                c0675vr5.c(R.id.avgSpeedJourney, "%s", "___", c0675vr5.h);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            C0675vr c0675vr6 = this.b;
                            c0675vr6.getClass();
                            if (num.intValue() > 0) {
                                int iIntValue = num.intValue() / 60;
                                int iIntValue2 = num.intValue() % 60;
                                c0675vr6.c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), c0675vr6.h);
                            } else {
                                c0675vr6.c(R.id.driveTimeJourneyH, "%s", "0", c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%s", "00", c0675vr6.h);
                            }
                            break;
                    }
                }
            });
            c(R.id.odoAccumulated, "%.1f", (Float) lf.q.d(), this.h);
        }
        TextView textView4 = (TextView) findViewById(R.id.avgFuelCons);
        if (textView4 != null) {
            int i5 = (int) f2;
            textView4.setHeight(i5);
            c0624u7.d(textView4.getId(), i5);
            textView4.setTextSize(f);
            final int i6 = 2;
            Lf.f(lf.k, this, new Mj(this) { // from class: ur
                public final /* synthetic */ C0675vr b;

                {
                    this.b = this;
                }

                @Override // defpackage.Mj
                public final void w(Object obj) {
                    switch (i6) {
                        case 0:
                            C0675vr c0675vr = this.b;
                            c0675vr.c(R.id.odoJourney, "%.1f", (Float) obj, c0675vr.h);
                            break;
                        case 1:
                            C0675vr c0675vr2 = this.b;
                            c0675vr2.c(R.id.odoAccumulated, "%.1f", (Float) obj, c0675vr2.h);
                            break;
                        case 2:
                            Float f3 = (Float) obj;
                            C0675vr c0675vr3 = this.b;
                            c0675vr3.getClass();
                            if (f3.floatValue() != -1.0f) {
                                c0675vr3.c(R.id.avgFuelCons, "%.1f", f3, c0675vr3.h);
                            } else {
                                c0675vr3.c(R.id.avgFuelCons, "%s", "__._", c0675vr3.h);
                            }
                            break;
                        case 3:
                            Float f4 = (Float) obj;
                            C0675vr c0675vr4 = this.b;
                            c0675vr4.getClass();
                            if (f4.floatValue() != -1.0f) {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%.1f", f4, c0675vr4.h);
                            } else {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%s", "__._", c0675vr4.h);
                            }
                            break;
                        case 4:
                            Float f5 = (Float) obj;
                            C0675vr c0675vr5 = this.b;
                            c0675vr5.getClass();
                            if (f5.floatValue() > 0.0f) {
                                c0675vr5.c(R.id.avgSpeedJourney, "%.0f", f5, c0675vr5.h);
                            } else {
                                c0675vr5.c(R.id.avgSpeedJourney, "%s", "___", c0675vr5.h);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            C0675vr c0675vr6 = this.b;
                            c0675vr6.getClass();
                            if (num.intValue() > 0) {
                                int iIntValue = num.intValue() / 60;
                                int iIntValue2 = num.intValue() % 60;
                                c0675vr6.c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), c0675vr6.h);
                            } else {
                                c0675vr6.c(R.id.driveTimeJourneyH, "%s", "0", c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%s", "00", c0675vr6.h);
                            }
                            break;
                    }
                }
            });
            Float f3 = (Float) lf.k.d();
            if (f3.floatValue() == -1.0f) {
                c(R.id.avgFuelCons, "%s", "__._", this.h);
            } else {
                c(R.id.avgFuelCons, "%.1f", f3, this.h);
            }
        }
        TextView textView5 = (TextView) findViewById(R.id.avgFuelConsJourney);
        if (textView5 != null) {
            int i7 = (int) f2;
            textView5.setHeight(i7);
            c0624u7.d(textView5.getId(), i7);
            textView5.setTextSize(f);
            final int i8 = 3;
            Lf.f(lf.l, this, new Mj(this) { // from class: ur
                public final /* synthetic */ C0675vr b;

                {
                    this.b = this;
                }

                @Override // defpackage.Mj
                public final void w(Object obj) {
                    switch (i8) {
                        case 0:
                            C0675vr c0675vr = this.b;
                            c0675vr.c(R.id.odoJourney, "%.1f", (Float) obj, c0675vr.h);
                            break;
                        case 1:
                            C0675vr c0675vr2 = this.b;
                            c0675vr2.c(R.id.odoAccumulated, "%.1f", (Float) obj, c0675vr2.h);
                            break;
                        case 2:
                            Float f4 = (Float) obj;
                            C0675vr c0675vr3 = this.b;
                            c0675vr3.getClass();
                            if (f4.floatValue() != -1.0f) {
                                c0675vr3.c(R.id.avgFuelCons, "%.1f", f4, c0675vr3.h);
                            } else {
                                c0675vr3.c(R.id.avgFuelCons, "%s", "__._", c0675vr3.h);
                            }
                            break;
                        case 3:
                            Float f5 = (Float) obj;
                            C0675vr c0675vr4 = this.b;
                            c0675vr4.getClass();
                            if (f5.floatValue() != -1.0f) {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%.1f", f5, c0675vr4.h);
                            } else {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%s", "__._", c0675vr4.h);
                            }
                            break;
                        case 4:
                            Float f6 = (Float) obj;
                            C0675vr c0675vr5 = this.b;
                            c0675vr5.getClass();
                            if (f6.floatValue() > 0.0f) {
                                c0675vr5.c(R.id.avgSpeedJourney, "%.0f", f6, c0675vr5.h);
                            } else {
                                c0675vr5.c(R.id.avgSpeedJourney, "%s", "___", c0675vr5.h);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            C0675vr c0675vr6 = this.b;
                            c0675vr6.getClass();
                            if (num.intValue() > 0) {
                                int iIntValue = num.intValue() / 60;
                                int iIntValue2 = num.intValue() % 60;
                                c0675vr6.c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), c0675vr6.h);
                            } else {
                                c0675vr6.c(R.id.driveTimeJourneyH, "%s", "0", c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%s", "00", c0675vr6.h);
                            }
                            break;
                    }
                }
            });
            Float f4 = (Float) lf.l.d();
            if (f4.floatValue() == -1.0f) {
                c(R.id.avgFuelConsJourney, "%s", "__._", this.h);
            } else {
                c(R.id.avgFuelConsJourney, "%.1f", f4, this.h);
            }
        }
        TextView textView6 = (TextView) findViewById(R.id.avgSpeedJourney);
        if (textView6 != null) {
            int i9 = (int) f2;
            textView6.setHeight(i9);
            c0624u7.d(textView6.getId(), i9);
            textView6.setTextSize(f);
            final int i10 = 4;
            Lf.f(lf.m, this, new Mj(this) { // from class: ur
                public final /* synthetic */ C0675vr b;

                {
                    this.b = this;
                }

                @Override // defpackage.Mj
                public final void w(Object obj) {
                    switch (i10) {
                        case 0:
                            C0675vr c0675vr = this.b;
                            c0675vr.c(R.id.odoJourney, "%.1f", (Float) obj, c0675vr.h);
                            break;
                        case 1:
                            C0675vr c0675vr2 = this.b;
                            c0675vr2.c(R.id.odoAccumulated, "%.1f", (Float) obj, c0675vr2.h);
                            break;
                        case 2:
                            Float f5 = (Float) obj;
                            C0675vr c0675vr3 = this.b;
                            c0675vr3.getClass();
                            if (f5.floatValue() != -1.0f) {
                                c0675vr3.c(R.id.avgFuelCons, "%.1f", f5, c0675vr3.h);
                            } else {
                                c0675vr3.c(R.id.avgFuelCons, "%s", "__._", c0675vr3.h);
                            }
                            break;
                        case 3:
                            Float f6 = (Float) obj;
                            C0675vr c0675vr4 = this.b;
                            c0675vr4.getClass();
                            if (f6.floatValue() != -1.0f) {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%.1f", f6, c0675vr4.h);
                            } else {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%s", "__._", c0675vr4.h);
                            }
                            break;
                        case 4:
                            Float f7 = (Float) obj;
                            C0675vr c0675vr5 = this.b;
                            c0675vr5.getClass();
                            if (f7.floatValue() > 0.0f) {
                                c0675vr5.c(R.id.avgSpeedJourney, "%.0f", f7, c0675vr5.h);
                            } else {
                                c0675vr5.c(R.id.avgSpeedJourney, "%s", "___", c0675vr5.h);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            C0675vr c0675vr6 = this.b;
                            c0675vr6.getClass();
                            if (num.intValue() > 0) {
                                int iIntValue = num.intValue() / 60;
                                int iIntValue2 = num.intValue() % 60;
                                c0675vr6.c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), c0675vr6.h);
                            } else {
                                c0675vr6.c(R.id.driveTimeJourneyH, "%s", "0", c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%s", "00", c0675vr6.h);
                            }
                            break;
                    }
                }
            });
            Float f5 = (Float) lf.m.d();
            if (f5.floatValue() <= 0.0f) {
                c(R.id.avgSpeedJourney, "%s", "___", this.h);
            } else {
                c(R.id.avgSpeedJourney, "%.0f", f5, this.h);
            }
        }
        TextView textView7 = (TextView) findViewById(R.id.driveTimeJourneyH);
        if (textView7 != null) {
            int i11 = (int) f2;
            textView7.setHeight(i11);
            c0624u7.d(textView7.getId(), i11);
            textView7.setTextSize(f);
            TextView textView8 = (TextView) findViewById(R.id.driveTimeJourneyM);
            if (textView8 != null) {
                textView8.setHeight(i11);
                c0624u7.d(textView8.getId(), i11);
                textView8.setTextSize(f);
            }
            final int i12 = 5;
            Lf.f(lf.n, this, new Mj(this) { // from class: ur
                public final /* synthetic */ C0675vr b;

                {
                    this.b = this;
                }

                @Override // defpackage.Mj
                public final void w(Object obj) {
                    switch (i12) {
                        case 0:
                            C0675vr c0675vr = this.b;
                            c0675vr.c(R.id.odoJourney, "%.1f", (Float) obj, c0675vr.h);
                            break;
                        case 1:
                            C0675vr c0675vr2 = this.b;
                            c0675vr2.c(R.id.odoAccumulated, "%.1f", (Float) obj, c0675vr2.h);
                            break;
                        case 2:
                            Float f6 = (Float) obj;
                            C0675vr c0675vr3 = this.b;
                            c0675vr3.getClass();
                            if (f6.floatValue() != -1.0f) {
                                c0675vr3.c(R.id.avgFuelCons, "%.1f", f6, c0675vr3.h);
                            } else {
                                c0675vr3.c(R.id.avgFuelCons, "%s", "__._", c0675vr3.h);
                            }
                            break;
                        case 3:
                            Float f7 = (Float) obj;
                            C0675vr c0675vr4 = this.b;
                            c0675vr4.getClass();
                            if (f7.floatValue() != -1.0f) {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%.1f", f7, c0675vr4.h);
                            } else {
                                c0675vr4.c(R.id.avgFuelConsJourney, "%s", "__._", c0675vr4.h);
                            }
                            break;
                        case 4:
                            Float f8 = (Float) obj;
                            C0675vr c0675vr5 = this.b;
                            c0675vr5.getClass();
                            if (f8.floatValue() > 0.0f) {
                                c0675vr5.c(R.id.avgSpeedJourney, "%.0f", f8, c0675vr5.h);
                            } else {
                                c0675vr5.c(R.id.avgSpeedJourney, "%s", "___", c0675vr5.h);
                            }
                            break;
                        default:
                            Integer num = (Integer) obj;
                            C0675vr c0675vr6 = this.b;
                            c0675vr6.getClass();
                            if (num.intValue() > 0) {
                                int iIntValue = num.intValue() / 60;
                                int iIntValue2 = num.intValue() % 60;
                                c0675vr6.c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), c0675vr6.h);
                            } else {
                                c0675vr6.c(R.id.driveTimeJourneyH, "%s", "0", c0675vr6.h);
                                c0675vr6.c(R.id.driveTimeJourneyM, "%s", "00", c0675vr6.h);
                            }
                            break;
                    }
                }
            });
            Integer num = (Integer) lf.n.d();
            if (num.intValue() <= 0) {
                c(R.id.driveTimeJourneyH, "%s", "0", this.h);
                c(R.id.driveTimeJourneyM, "%s", "00", this.h);
            } else {
                int iIntValue = num.intValue() / 60;
                int iIntValue2 = num.intValue() % 60;
                c(R.id.driveTimeJourneyH, "%d", Integer.valueOf(iIntValue), this.h);
                c(R.id.driveTimeJourneyM, "%02d", Integer.valueOf(iIntValue2), this.h);
            }
        }
        TextView textView9 = (TextView) findViewById(R.id.driveTimeJourneyHTxt);
        if (textView9 != null) {
            int i13 = (int) f2;
            textView9.setHeight(i13);
            c0624u7.d(textView9.getId(), i13);
            textView9.setTextSize(f - 4.0f);
            textView9.setTextColor(this.i);
        }
        TextView textView10 = (TextView) findViewById(R.id.driveTimeJourneyMTxt);
        if (textView10 != null) {
            int i14 = (int) f2;
            textView10.setHeight(i14);
            c0624u7.d(textView10.getId(), i14);
            textView10.setTextSize(f - 4.0f);
            textView10.setTextColor(this.i);
        }
        TextView textView11 = (TextView) findViewById(R.id.firstParamTxt);
        if (textView11 != null) {
            int i15 = (int) f2;
            textView11.setHeight(i15);
            c0624u7.d(textView11.getId(), i15);
            textView11.setTextSize(f - 4.0f);
            textView11.setTextColor(this.i);
        }
        TextView textView12 = (TextView) findViewById(R.id.secondParamTxt);
        if (textView12 != null) {
            int i16 = (int) f2;
            textView12.setHeight(i16);
            c0624u7.d(textView12.getId(), i16);
            textView12.setTextSize(f - 4.0f);
            textView12.setTextColor(this.i);
        }
        c0624u7.a(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(int i, String str, Object obj, int i2) {
        TextView textView = (TextView) findViewById(i);
        if (textView != null) {
            String str2 = String.format(Locale.US, str, obj);
            textView.setTextColor(i2);
            textView.setText(str2);
        }
    }

    public int getColor() {
        return this.h;
    }

    public int getParamColor() {
        return this.i;
    }

    public int getTitleId() {
        return this.f;
    }

    public void setColor(int i) {
        this.h = i;
    }

    public void setParamColor(int i) {
        this.i = i;
    }

    public void setTitleId(int i) {
        this.f = i;
    }

    public C0675vr(Context context, Dg dg, float f, int i) {
        super(context, dg, R.layout.trip_info_fragment);
        this.e = Lf.a();
        this.f = R.string.text_trip_title;
        this.h = -1;
        this.i = -9144711;
        this.g = f;
        this.j = i;
        a();
    }
}
