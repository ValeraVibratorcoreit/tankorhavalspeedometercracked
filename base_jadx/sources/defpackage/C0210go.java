package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0210go extends Ol {
    public final List c;
    public final C0098d4 d;
    public int e = 0;

    public C0210go(ArrayList arrayList, C0098d4 c0098d4) {
        this.c = arrayList;
        this.d = c0098d4;
    }

    @Override // defpackage.Ol
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.Ol
    public final void c(AbstractC0361lm abstractC0361lm, int i) {
        C0179fo c0179fo = (C0179fo) abstractC0361lm;
        C0148eo c0148eo = (C0148eo) this.c.get(i);
        int i2 = c0148eo.b;
        TextView textView = c0179fo.u;
        textView.setText(i2);
        ImageView imageView = c0179fo.t;
        int i3 = c0148eo.c;
        if (i3 != 0) {
            imageView.setImageResource(i3);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        boolean z = i == this.e;
        View view = c0179fo.a;
        view.setSelected(z);
        textView.setSelected(z);
        imageView.setSelected(z);
        view.setOnClickListener(new C3(this, 5, c0179fo));
    }

    @Override // defpackage.Ol
    public final AbstractC0361lm d(ViewGroup viewGroup) {
        return new C0179fo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.settings_sidebar_item, viewGroup, false));
    }
}
