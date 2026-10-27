package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0330km implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public RunnableC0330km(RecyclerView recyclerView) {
        this.g = recyclerView;
        Ml ml = RecyclerView.u0;
        this.d = ml;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), ml);
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = Gs.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i4 = width / 2;
            float f = width;
            float f2 = i4;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(iRound, 2000);
        }
        int i5 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.u0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i5);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.g;
        if (recyclerView.l == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.m();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.a;
            int i7 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int[] iArr = recyclerView.o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zR = recyclerView.r(i6, i7, iArr, null, 1);
            int[] iArr2 = recyclerView.o0;
            if (zR) {
                i6 -= iArr2[0];
                i7 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i6, i7);
            }
            if (recyclerView.k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.a0(i6, i7, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = i6 - i8;
                int i11 = i7 - i9;
                Pg pg = recyclerView.l.e;
                if (pg != null && !pg.d && pg.e) {
                    int iB = recyclerView.c0.b();
                    if (iB == 0) {
                        pg.i();
                    } else if (pg.a >= iB) {
                        pg.a = iB - 1;
                        pg.g(i8, i9);
                    } else {
                        pg.g(i8, i9);
                    }
                }
                i4 = i8;
                i = i10;
                i2 = i11;
                i3 = i9;
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i3;
            recyclerView.s(i4, i3, i, i2, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i2 - iArr2[1];
            if (i4 != 0 || i12 != 0) {
                recyclerView.t(i4, i12);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
            Pg pg2 = recyclerView.l.e;
            if ((pg2 == null || !pg2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i13 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i13 > 0 ? currVelocity : 0;
                    }
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.v();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.w();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.E.isFinished()) {
                            recyclerView.E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.G.isFinished()) {
                            recyclerView.G.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = Gs.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                Bd bd = recyclerView.b0;
                int[] iArr4 = (int[]) bd.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                bd.c = 0;
            } else {
                a();
                Dd dd = recyclerView.a0;
                if (dd != null) {
                    dd.a(recyclerView, i4, i12);
                }
            }
        }
        Pg pg3 = recyclerView.l.e;
        if (pg3 != null && pg3.d) {
            pg3.g(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.f0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = Gs.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
