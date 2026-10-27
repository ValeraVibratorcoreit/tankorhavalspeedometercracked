package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class M8 extends AbstractC0093d {
    public boolean c;
    public boolean d;
    public C0096d2 e;

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[Catch: RuntimeException -> 0x00eb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00eb, blocks: (B:78:0x00df, B:80:0x00e5), top: B:91:0x00df }] */
    public final C0096d2 k(Context context) {
        int i;
        C0096d2 c0096d2;
        Animator animatorLoadAnimator;
        int iK;
        if (this.d) {
            return this.e;
        }
        C0118dp c0118dp = (C0118dp) this.a;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = c0118dp.c;
        boolean z = c0118dp.a == 2;
        C0722xc c0722xc = abstractComponentCallbacksC0784zc.H;
        int i2 = c0722xc == null ? 0 : c0722xc.f;
        if (this.c) {
            if (z) {
                if (c0722xc == null) {
                    i = 0;
                } else {
                    i = c0722xc.d;
                }
            } else if (c0722xc == null) {
                i = 0;
            } else {
                i = c0722xc.e;
            }
        } else if (z) {
            if (c0722xc == null) {
                i = 0;
            } else {
                i = c0722xc.b;
            }
        } else if (c0722xc == null) {
            i = 0;
        } else {
            i = c0722xc.c;
        }
        abstractComponentCallbacksC0784zc.K(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0784zc.D;
        C0096d2 c0096d3 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0784zc.D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0784zc.D;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iK = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iK = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iK = z ? AbstractC0390mk.K(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0390mk.K(context, android.R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iK = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iK = -1;
                } else {
                    iK = z ? AbstractC0390mk.K(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0390mk.K(context, android.R.attr.activityOpenExitAnimation);
                }
                i = iK;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            c0096d2 = new C0096d2(animationLoadAnimation);
                            c0096d3 = c0096d2;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                c0096d2 = new C0096d2(animatorLoadAnimator);
                                c0096d3 = c0096d2;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                c0096d3 = new C0096d2(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        c0096d2 = new C0096d2(animatorLoadAnimator);
                        c0096d3 = c0096d2;
                    }
                }
            }
        }
        this.e = c0096d3;
        this.d = true;
        return c0096d3;
    }
}
