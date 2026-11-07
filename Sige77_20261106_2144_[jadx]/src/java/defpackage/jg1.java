package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.hjq.toast.IToastStrategy;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jg1 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView i;

    public jg1(RecyclerView recyclerView) {
        this.i = recyclerView;
        of1 of1Var = RecyclerView.l1;
        this.d = of1Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), of1Var);
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.i;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = x52.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.i;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), IToastStrategy.SHORT_DURATION_TIMEOUT);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.l1;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.i;
        int[] iArr = recyclerView.c1;
        if (recyclerView.b0 == null) {
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
            int[] iArr2 = recyclerView.c1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i6, i7, 1, iArr2, (int[]) null)) {
                i = i6 - iArr[0];
                i2 = i7 - iArr[1];
            } else {
                i = i6;
                i2 = i7;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i2);
            }
            if (recyclerView.a0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Y(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                yx0 yx0Var = recyclerView.b0.e;
                if (yx0Var != null && !yx0Var.d && yx0Var.e) {
                    int iB = recyclerView.Q0.b();
                    if (iB == 0) {
                        yx0Var.i();
                    } else if (yx0Var.a >= iB) {
                        yx0Var.a = iB - 1;
                        yx0Var.g(i3, i4);
                    } else {
                        yx0Var.g(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.d0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.c1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i3, i4, i, i2, (int[]) null, 1, iArr3);
            int i8 = i - iArr[0];
            int i9 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.t(i3, i4);
            }
            if (!RecyclerView.d(recyclerView)) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
            yx0 yx0Var2 = recyclerView.b0.e;
            if ((yx0Var2 == null || !yx0Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i8 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i8 > 0 ? currVelocity : 0;
                    }
                    if (i9 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i9 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.v();
                        if (recyclerView.u0.isFinished()) {
                            recyclerView.u0.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.w();
                        if (recyclerView.w0.isFinished()) {
                            recyclerView.w0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.v0.isFinished()) {
                            recyclerView.v0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.x0.isFinished()) {
                            recyclerView.x0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = x52.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                we weVar = recyclerView.P0;
                int[] iArr4 = (int[]) weVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                weVar.c = 0;
            } else {
                a();
                lh0 lh0Var = recyclerView.O0;
                if (lh0Var != null) {
                    lh0Var.a(recyclerView, i3, i4);
                }
            }
        }
        yx0 yx0Var3 = recyclerView.b0.e;
        if (yx0Var3 != null && yx0Var3.d) {
            yx0Var3.g(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.d0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = x52.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
