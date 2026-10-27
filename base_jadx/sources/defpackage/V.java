package defpackage;

import android.content.Context;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class V extends C0675vr {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Context context, Dg dg, float f, int i) {
        super(context, dg, f);
        this.k = i;
    }

    @Override // defpackage.C0675vr
    public final void a() {
        switch (this.k) {
            case 0:
                this.d = R.layout.accumulated_trip_info_fragment;
                setTitleId(R.string.text_accumulated_trip_title);
                super.a();
                break;
            case 1:
                this.d = R.layout.journey_average_info_fragment;
                setTitleId(R.string.text_trip_title);
                super.a();
                break;
            case 2:
                this.d = R.layout.journey_trip_info_fragment;
                setTitleId(R.string.text_journey_trip_title);
                super.a();
                break;
            case 3:
                this.d = R.layout.accumulated_trip_info_fragment_night;
                setTitleId(R.string.text_accumulated_trip_title);
                super.a();
                break;
            case 4:
                this.d = R.layout.journey_average_info_fragment_night;
                setTitleId(R.string.text_trip_title);
                super.a();
                break;
            case 5:
                this.d = R.layout.journey_trip_info_fragment_night;
                setTitleId(R.string.text_journey_trip_title);
                super.a();
                break;
            default:
                this.d = R.layout.trip_info_fragment_night;
                setTitleId(R.string.text_trip_title);
                super.a();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(Context context, Dg dg, float f, int i, int i2) {
        super(context, dg, f, i);
        this.k = i2;
    }
}
