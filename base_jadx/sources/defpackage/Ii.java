package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class Ii extends C0073ca {
    public final int m;
    public final int n;
    public InterfaceC0728xi o;
    public C0759yi p;

    public Ii(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.C0073ca, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0512qi c0512qi;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0512qi = (C0512qi) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0512qi = (C0512qi) adapter;
                headersCount = 0;
            }
            C0759yi c0759yiB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0512qi.getCount()) ? null : c0512qi.getItem(i);
            C0759yi c0759yi = this.p;
            if (c0759yi != c0759yiB) {
                MenuC0604ti menuC0604ti = c0512qi.a;
                if (c0759yi != null) {
                    this.o.t(menuC0604ti, c0759yi);
                }
                this.p = c0759yiB;
                if (c0759yiB != null) {
                    this.o.v(menuC0604ti, c0759yiB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0512qi) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0512qi) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0728xi interfaceC0728xi) {
        this.o = interfaceC0728xi;
    }

    @Override // defpackage.C0073ca, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
