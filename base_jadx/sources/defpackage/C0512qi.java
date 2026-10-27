package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0512qi extends BaseAdapter {
    public final MenuC0604ti a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public C0512qi(MenuC0604ti menuC0604ti, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = menuC0604ti;
        this.f = i;
        a();
    }

    public final void a() {
        MenuC0604ti menuC0604ti = this.a;
        C0759yi c0759yi = menuC0604ti.v;
        if (c0759yi != null) {
            menuC0604ti.i();
            ArrayList arrayList = menuC0604ti.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0759yi) arrayList.get(i)) == c0759yi) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0759yi getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        MenuC0604ti menuC0604ti = this.a;
        if (z) {
            menuC0604ti.i();
            arrayListL = menuC0604ti.j;
        } else {
            arrayListL = menuC0604ti.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0759yi) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        MenuC0604ti menuC0604ti = this.a;
        if (z) {
            menuC0604ti.i();
            arrayListL = menuC0604ti.j;
        } else {
            arrayListL = menuC0604ti.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        Mi mi = (Mi) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        mi.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
