package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class eu extends Ol {
    public final Yh c;

    public eu(Yh yh) {
        this.c = yh;
    }

    @Override // defpackage.Ol
    public final int a() {
        return this.c.V.f;
    }

    @Override // defpackage.Ol
    public final void c(AbstractC0361lm abstractC0361lm, int i) {
        Yh yh = this.c;
        int i2 = yh.V.a.c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((du) abstractC0361lm).t;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(Nr.c().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0096d2 c0096d2 = yh.Y;
        if (Nr.c().get(1) == i2) {
            Object obj = c0096d2.c;
        } else {
            Object obj2 = c0096d2.b;
        }
        throw null;
    }

    @Override // defpackage.Ol
    public final AbstractC0361lm d(ViewGroup viewGroup) {
        return new du((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
