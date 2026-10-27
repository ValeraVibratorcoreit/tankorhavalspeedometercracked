package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class K3 extends ArrayAdapter {
    public final int a;
    public final /* synthetic */ L3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3(L3 l3, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = l3;
        this.a = R.layout.item_image;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        F3 f3 = (F3) getItem(i);
        boolean z = false;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(this.a, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.item_image);
        TextView textView = (TextView) view.findViewById(R.id.item_text);
        TextView textView2 = (TextView) view.findViewById(R.id.item_desc);
        ((ImageButton) view.findViewById(R.id.btn_delete)).setVisibility(4);
        Uri uri = f3.a;
        if (uri != null) {
            imageView.setImageURI(uri);
        } else {
            imageView.setImageResource(f3.d);
        }
        textView.setText(f3.b);
        textView2.setText(f3.c);
        L3 l3 = this.b;
        l3.getClass();
        String strP = L3.P(f3);
        if (strP != null && strP.equals(l3.U)) {
            z = true;
        }
        view.setActivated(z);
        return view;
    }
}
