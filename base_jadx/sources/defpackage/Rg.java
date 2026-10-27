package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Rg extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ Sg b;

    public Rg(Sg sg) {
        this.b = sg;
        a();
    }

    public final void a() {
        MenuC0604ti menuC0604ti = this.b.c;
        C0759yi c0759yi = menuC0604ti.v;
        if (c0759yi != null) {
            menuC0604ti.i();
            ArrayList arrayList = menuC0604ti.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0759yi) arrayList.get(i)) == c0759yi) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0759yi getItem(int i) {
        Sg sg = this.b;
        MenuC0604ti menuC0604ti = sg.c;
        menuC0604ti.i();
        ArrayList arrayList = menuC0604ti.j;
        sg.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0759yi) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Sg sg = this.b;
        MenuC0604ti menuC0604ti = sg.c;
        menuC0604ti.i();
        int size = menuC0604ti.j.size();
        sg.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((Mi) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
