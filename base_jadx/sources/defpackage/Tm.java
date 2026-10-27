package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Tm {
    public static Tm g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public T1 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final Sm h = new Sm(6);

    public static synchronized Tm c() {
        try {
            if (g == null) {
                g = new Tm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        Sm sm = h;
        sm.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) sm.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0511qh c0511qh = (C0511qh) this.b.get(context);
                if (c0511qh == null) {
                    c0511qh = new C0511qh();
                    this.b.put(context, c0511qh);
                }
                c0511qh.e(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i) {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j);
        if (drawableD != null) {
            return drawableD;
        }
        LayerDrawable layerDrawableC = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableC = T1.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = T1.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = T1.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable d(Context context, long j) {
        C0511qh c0511qh = (C0511qh) this.b.get(context);
        if (c0511qh == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0511qh.d(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iG = F4.g(c0511qh.b, c0511qh.d, j);
            if (iG >= 0) {
                Object[] objArr = c0511qh.c;
                Object obj = objArr[iG];
                Object obj2 = C0511qh.e;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    c0511qh.a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i) {
        return f(context, i, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[Catch: all -> 0x00d6, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002c, B:16:0x0032, B:18:0x0039, B:25:0x004e, B:23:0x004a, B:26:0x0053, B:30:0x006a, B:37:0x00a0, B:38:0x00c7, B:43:0x00d2, B:6:0x0006, B:8:0x0012, B:10:0x0016, B:50:0x00db, B:51:0x00e4), top: B:54:0x0001 }] */
    public final synchronized Drawable f(Context context, int i, boolean z) {
        Drawable drawableB;
        if (!this.d) {
            this.d = true;
            Drawable drawableE = e(context, R.drawable.abc_vector_test);
            if (drawableE == null || (!(drawableE instanceof C0091cs) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                this.d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableB = b(context, i);
        if (drawableB == null) {
            drawableB = H7.b(context, i);
        }
        if (drawableB != null) {
            ColorStateList colorStateListH = h(context, i);
            PorterDuff.Mode mode = null;
            if (colorStateListH != null) {
                drawableB = drawableB.mutate();
                O9.h(drawableB, colorStateListH);
                if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    O9.i(drawableB, mode);
                }
            } else if (this.e == null) {
                if (!i(context, i, drawableB) && z) {
                    drawableB = null;
                }
            } else if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawableB;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = Cq.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = U1.b;
                T1.f(drawableFindDrawableByLayerId, iC);
                T1.f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), Cq.c(context, R.attr.colorControlNormal));
                T1.f(layerDrawable.findDrawableByLayerId(android.R.id.progress), Cq.c(context, R.attr.colorControlActivated));
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawableB;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = Cq.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = U1.b;
                T1.f(drawableFindDrawableByLayerId2, iB);
                T1.f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), Cq.c(context, R.attr.colorControlActivated));
                T1.f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), Cq.c(context, R.attr.colorControlActivated));
            } else if (!i(context, i, drawableB)) {
                drawableB = null;
            }
        }
        if (drawableB != null) {
            W9.a(drawableB);
        }
        return drawableB;
    }

    public final synchronized ColorStateList h(Context context, int i) {
        ColorStateList colorStateList;
        C0057bp c0057bp;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateList = (weakHashMap == null || (c0057bp = (C0057bp) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0057bp.c(i, null);
        if (colorStateList == null) {
            T1 t1 = this.e;
            if (t1 != null) {
                colorStateListD = t1.d(context, i);
            }
            if (colorStateListD != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                C0057bp c0057bp2 = (C0057bp) this.a.get(context);
                if (c0057bp2 == null) {
                    c0057bp2 = new C0057bp();
                    this.a.put(context, c0057bp2);
                }
                c0057bp2.a(i, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public final boolean i(Context context, int i, Drawable drawable) {
        int i2;
        boolean z;
        int iRound;
        Drawable drawableMutate;
        int iC;
        T1 t1 = this.e;
        if (t1 == null) {
            return false;
        }
        PorterDuff.Mode mode = U1.b;
        if (T1.a((int[]) t1.b, i)) {
            i2 = R.attr.colorControlNormal;
        } else if (T1.a((int[]) t1.d, i)) {
            i2 = R.attr.colorControlActivated;
        } else {
            if (!T1.a((int[]) t1.e, i)) {
                if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                    z = true;
                    iRound = Math.round(40.8f);
                    i2 = 16842800;
                } else {
                    if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z = false;
                    }
                    iRound = -1;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                iC = Cq.c(context, i2);
                synchronized (U1.class) {
                    PorterDuffColorFilter porterDuffColorFilterG = g(iC, mode);
                }
                drawableMutate.setColorFilter(porterDuffColorFilterG);
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i2 = 16842801;
        }
        z = true;
        iRound = -1;
        if (z) {
            return false;
        }
        drawableMutate = drawable.mutate();
        iC = Cq.c(context, i2);
        synchronized (U1.class) {
            PorterDuffColorFilter porterDuffColorFilterG2 = g(iC, mode);
            drawableMutate.setColorFilter(porterDuffColorFilterG2);
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }
}
