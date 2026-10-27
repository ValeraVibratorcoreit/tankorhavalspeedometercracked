package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Yh<S> extends Ek {
    public int U;
    public C0282j5 V;
    public C0020aj W;
    public int X;
    public C0096d2 Y;
    public RecyclerView Z;
    public RecyclerView a0;
    public View b0;
    public View c0;
    public View d0;
    public View e0;

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void B(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.V);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.W);
    }

    public final void O(C0020aj c0020aj) {
        c cVar = (c) this.a0.getAdapter();
        int iD = cVar.c.a.d(c0020aj);
        int iD2 = iD - cVar.c.a.d(this.W);
        boolean z = Math.abs(iD2) > 3;
        boolean z2 = iD2 > 0;
        this.W = c0020aj;
        if (z && z2) {
            this.a0.b0(iD - 3);
            this.a0.post(new RunnableC0375m5(iD, this, 2));
        } else if (!z) {
            this.a0.post(new RunnableC0375m5(iD, this, 2));
        } else {
            this.a0.b0(iD + 3);
            this.a0.post(new RunnableC0375m5(iD, this, 2));
        }
    }

    public final void P(int i) {
        this.X = i;
        if (i == 2) {
            this.Z.getLayoutManager().o0(this.W.c - ((eu) this.Z.getAdapter()).c.V.a.c);
            this.d0.setVisibility(0);
            this.e0.setVisibility(8);
            this.b0.setVisibility(8);
            this.c0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.d0.setVisibility(8);
            this.e0.setVisibility(0);
            this.b0.setVisibility(0);
            this.c0.setVisibility(0);
            O(this.W);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void v(Bundle bundle) {
        super.v(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        Vo.k(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.V = (C0282j5) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        Vo.k(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.W = (C0020aj) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        C0668vk c0668vk;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.U);
        this.Y = new C0096d2(contextThemeWrapper, 7);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0020aj c0020aj = this.V.a;
        if (C0112di.S(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = ru.zinovin.tankspeedometer.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = ru.zinovin.tankspeedometer.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = I().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C0051bj.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.mtrl_calendar_days_of_week);
        Gs.j(gridView, new Uh(0));
        int i4 = this.V.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0347l8(i4) : new C0347l8()));
        gridView.setNumColumns(c0020aj.d);
        gridView.setEnabled(false);
        this.a0 = (RecyclerView) viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.mtrl_calendar_months);
        h();
        this.a0.setLayoutManager(new Vh(this, i2, i2));
        this.a0.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.V, new C0308k0(this, 26));
        this.a0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(ru.zinovin.tankspeedometer.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.mtrl_calendar_year_selector_frame);
        this.Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.Z.setLayoutManager(new GridLayoutManager(integer));
            this.Z.setAdapter(new eu(this));
            this.Z.g(new Wh(this));
        }
        if (viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Gs.j(materialButton, new M5(this, 2));
            View viewFindViewById = viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.month_navigation_previous);
            this.b0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.month_navigation_next);
            this.c0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.d0 = viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.mtrl_calendar_year_selector_frame);
            this.e0 = viewInflate.findViewById(ru.zinovin.tankspeedometer.R.id.mtrl_calendar_day_selector_frame);
            P(1);
            materialButton.setText(this.W.c());
            this.a0.h(new Xh(this, cVar, materialButton));
            materialButton.setOnClickListener(new X(this, 2));
            this.c0.setOnClickListener(new Th(this, cVar, 1));
            this.b0.setOnClickListener(new Th(this, cVar, 0));
        }
        if (!C0112di.S(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0668vk = new C0668vk()).a) != (recyclerView = this.a0)) {
            So so = c0668vk.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.e0;
                if (arrayList != null) {
                    arrayList.remove(so);
                }
                c0668vk.a.setOnFlingListener(null);
            }
            c0668vk.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0668vk.a.h(so);
                c0668vk.a.setOnFlingListener(c0668vk);
                new Scroller(c0668vk.a.getContext(), new DecelerateInterpolator());
                c0668vk.f();
            }
        }
        this.a0.b0(cVar.c.a.d(this.W));
        Gs.j(this.a0, new Uh(1));
        return viewInflate;
    }
}
