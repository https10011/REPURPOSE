package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nv1 extends d42 {
    public int o;
    public int p = -1;
    public final /* synthetic */ SwipeDismissBehavior q;

    public nv1(SwipeDismissBehavior swipeDismissBehavior) {
        this.q = swipeDismissBehavior;
    }

    @Override // defpackage.d42
    public final void B(View view, int i) {
        this.p = i;
        this.o = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.q;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.d42
    public final void D(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.q;
        float f = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i - this.o);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // defpackage.d42
    public final void E(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.p = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.q;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.o;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.o;
                    if (left < i2) {
                        i = this.o - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.o - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.o) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.o;
                    if (left < i2) {
                        i = this.o - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.o - width;
                }
                z = true;
            } else {
                i = this.o;
            }
        }
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
            view.postOnAnimation(new bh0(swipeDismissBehavior, view, z));
        }
    }

    @Override // defpackage.d42
    public final boolean G(View view, int i) {
        int i2 = this.p;
        return (i2 == -1 || i2 == i) && this.q.s(view);
    }

    @Override // defpackage.d42
    public final int e(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.q.d;
        if (i2 == 0) {
            width = this.o;
            if (z) {
                width -= view.getWidth();
                width2 = this.o;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.o;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.o + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.o;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.d42
    public final int f(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.d42
    public final int u(View view) {
        return view.getWidth();
    }

    @Override // defpackage.d42
    public final void C(int i) {
    }
}
