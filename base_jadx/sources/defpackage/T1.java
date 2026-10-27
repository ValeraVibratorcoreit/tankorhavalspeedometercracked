package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class T1 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public final Serializable d;
    public final Object e;
    public final Object f;
    public final Object g;

    public T1(C0201gf c0201gf, String str, C0569se c0569se, C0043bb c0043bb, Map map) {
        this.a = 1;
        Tf.j("url", c0201gf);
        Tf.j("method", str);
        this.c = c0201gf;
        this.d = str;
        this.e = c0569se;
        this.f = c0043bb;
        this.g = map;
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i) {
        int iC = Cq.c(context, R.attr.colorControlHighlight);
        int iB = Cq.b(context, R.attr.colorButtonNormal);
        int[] iArr = Cq.b;
        int[] iArr2 = Cq.d;
        int iB2 = AbstractC0747y6.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, Cq.c, Cq.f}, new int[]{iB, iB2, AbstractC0747y6.b(iC, i), i});
    }

    public static LayerDrawable c(Tm tm, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableE = tm.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = tm.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i) {
        PorterDuffColorFilter porterDuffColorFilterG;
        PorterDuff.Mode mode = U1.b;
        Drawable drawableMutate = drawable.mutate();
        synchronized (U1.class) {
            porterDuffColorFilterG = Tm.g(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public ColorStateList d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return F4.C(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return F4.C(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, Cq.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return b(context, Cq.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return F4.C(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.c, i)) {
                return Cq.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f, i)) {
                return F4.C(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.g, i)) {
                return F4.C(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return F4.C(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = Cq.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = Cq.b;
            iArr2[0] = Cq.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = Cq.e;
            iArr2[1] = Cq.c(context, R.attr.colorControlActivated);
            iArr[2] = Cq.f;
            iArr2[2] = Cq.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = Cq.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = Cq.e;
            iArr2[1] = Cq.c(context, R.attr.colorControlActivated);
            iArr[2] = Cq.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public H0 e() {
        H0 h0 = new H0(false);
        h0.f = new LinkedHashMap();
        h0.b = (C0201gf) this.c;
        h0.c = (String) this.d;
        h0.e = (C0043bb) this.f;
        Map map = (Map) this.g;
        h0.f = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        h0.d = ((C0569se) this.e).c();
        return h0;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.d);
                sb.append(", url=");
                sb.append((C0201gf) this.c);
                C0569se c0569se = (C0569se) this.e;
                if (c0569se.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = c0569se.iterator();
                    int i = 0;
                    while (true) {
                        C0307k c0307k = (C0307k) it;
                        if (c0307k.hasNext()) {
                            Object next = c0307k.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            C0761yk c0761yk = (C0761yk) next;
                            String str = (String) c0761yk.a;
                            String str2 = (String) c0761yk.b;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.g;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String string = sb.toString();
                Tf.i("StringBuilder().apply(builderAction).toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    public T1() {
        this.a = 0;
        this.b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
