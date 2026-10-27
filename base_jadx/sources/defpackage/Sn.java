package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class Sn extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final FrameLayout d;
    public int e;
    public boolean f;

    public Sn(Context context) {
        super(context);
        this.e = 3;
        this.f = true;
        LayoutInflater.from(getContext()).inflate(R.layout.ts_setting_row, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.ts_row_icon);
        this.b = (TextView) findViewById(R.id.ts_row_title);
        this.c = (TextView) findViewById(R.id.ts_row_subtitle);
        this.d = (FrameLayout) findViewById(R.id.ts_row_widget_slot);
        a();
        setRowEnabled(this.f);
    }

    public final void a() {
        int i = this.e;
        if (i == 0) {
            setBackgroundResource(R.drawable.ts_bg_card_top);
            return;
        }
        if (i == 1) {
            setBackgroundResource(R.drawable.ts_bg_card_middle);
        } else if (i != 2) {
            setBackgroundResource(R.drawable.ts_bg_card_single);
        } else {
            setBackgroundResource(R.drawable.ts_bg_card_bottom);
        }
    }

    public FrameLayout getWidgetSlot() {
        return this.d;
    }

    public void setIcon(int i) {
        if (i == 0) {
            this.a.setVisibility(8);
        } else {
            this.a.setImageResource(i);
            this.a.setVisibility(0);
        }
    }

    public void setPosition(int i) {
        this.e = i;
        a();
    }

    public void setRowEnabled(boolean z) {
        this.f = z;
        setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
        float f = z ? 1.0f : 0.3f;
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = this.d.getChildAt(i);
            childAt.setEnabled(z);
            childAt.setAlpha(f);
        }
        this.a.setAlpha(f);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTitle(int i) {
        this.b.setText(i);
    }

    public void setSubtitle(int i) {
        this.c.setText(i);
        this.c.setVisibility(0);
    }
}
