package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.jcraft.jsch.SftpATTRS;
import defpackage.C0051bj;
import defpackage.C0112di;
import defpackage.Gs;
import defpackage.Nr;
import defpackage.Uh;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Nr.d(null);
        if (C0112di.S(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(ru.zinovin.tankspeedometer.R.id.cancel_button);
            setNextFocusRightId(ru.zinovin.tankspeedometer.R.id.confirm_button);
        }
        this.a = C0112di.S(getContext(), ru.zinovin.tankspeedometer.R.attr.nestedScrollable);
        Gs.j(this, new Uh(2));
    }

    public final C0051bj a() {
        return (C0051bj) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0051bj) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0051bj) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0051bj c0051bj = (C0051bj) super.getAdapter();
        c0051bj.getClass();
        int iMax = Math.max(c0051bj.a(), getFirstVisiblePosition());
        int iMin = Math.min(c0051bj.c(), getLastVisiblePosition());
        c0051bj.getItem(iMax);
        c0051bj.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C0051bj) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((C0051bj) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0051bj) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C0051bj) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C0051bj) super.getAdapter()).a()) {
            super.setSelection(((C0051bj) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0051bj) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0051bj)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0051bj.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
