package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.v.d) - clockFaceView.D;
        if (height != clockFaceView.t) {
            clockFaceView.t = height;
            clockFaceView.l();
            int i = clockFaceView.t;
            ClockHandView clockHandView = clockFaceView.v;
            clockHandView.l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
