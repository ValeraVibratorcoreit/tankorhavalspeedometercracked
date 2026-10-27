package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public final class Zg implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Zg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0065c2 c0065c2;
        switch (this.a) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                C0018ah c0018ah = (C0018ah) this.b;
                if (action == 0 && (c0065c2 = c0018ah.z) != null && c0065c2.isShowing() && x >= 0 && x < c0018ah.z.getWidth() && y >= 0 && y < c0018ah.z.getHeight()) {
                    c0018ah.v.postDelayed(c0018ah.r, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                c0018ah.v.removeCallbacks(c0018ah.r);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.b).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
