package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes.dex */
public final class G5 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G5(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 6:
                return Float.valueOf(AbstractC0153et.a.D((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                J5 j5 = (J5) obj;
                PointF pointF = (PointF) obj2;
                j5.getClass();
                j5.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                j5.b = iRound;
                int i = j5.f + 1;
                j5.f = i;
                if (i == j5.g) {
                    AbstractC0153et.a(j5.e, j5.a, iRound, j5.c, j5.d);
                    j5.f = 0;
                    j5.g = 0;
                }
                break;
            case 1:
                J5 j6 = (J5) obj;
                PointF pointF2 = (PointF) obj2;
                j6.getClass();
                j6.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                j6.d = iRound2;
                int i2 = j6.g + 1;
                j6.g = i2;
                if (j6.f == i2) {
                    AbstractC0153et.a(j6.e, j6.a, j6.b, j6.c, iRound2);
                    j6.f = 0;
                    j6.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0153et.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0153et.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC0153et.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                AbstractC0153et.a.n0((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
