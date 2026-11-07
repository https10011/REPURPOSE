package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class di extends d42 {
    public final /* synthetic */ int o;
    public final /* synthetic */ ns p;

    public /* synthetic */ di(ns nsVar, int i) {
        this.o = i;
        this.p = nsVar;
    }

    @Override // defpackage.d42
    public final void C(int i) {
        int i2 = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) sideSheetBehavior;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.D(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                    if (sideSheetBehavior2.g) {
                        sideSheetBehavior2.s(1);
                    }
                }
                break;
        }
    }

    @Override // defpackage.d42
    public final void D(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) sideSheetBehavior).v(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                WeakReference weakReference = sideSheetBehavior2.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    dw0 dw0Var = sideSheetBehavior2.a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (dw0Var.a) {
                        case 0:
                            if (left <= dw0Var.b.m) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i4 = dw0Var.b.m;
                            if (left <= i4) {
                                marginLayoutParams.rightMargin = i4 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior2.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                dw0 dw0Var2 = sideSheetBehavior2.a;
                switch (dw0Var2.a) {
                    case 0:
                        dw0Var2.g();
                        dw0Var2.f();
                        break;
                    default:
                        int i5 = dw0Var2.b.m;
                        dw0Var2.f();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw y00.i(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c A[PHI: r2
      0x013c: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:108:0x01c6, B:100:0x01a7, B:92:0x0177, B:95:0x018d, B:77:0x013a, B:75:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    @Override // defpackage.d42
    public final void E(View view, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.o;
        int i2 = 3;
        int i3 = 5;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) sideSheetBehavior;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top > bottomSheetBehavior.E) {
                            i2 = 6;
                        }
                    }
                } else if (!bottomSheetBehavior.I || !bottomSheetBehavior.E(view, f2)) {
                    i3 = 4;
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (!bottomSheetBehavior.b) {
                            int i4 = bottomSheetBehavior.E;
                            if (top2 < i4) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                }
                            } else if (Math.abs(top2 - i4) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                                i2 = i3;
                            }
                            i2 = 6;
                        } else if (Math.abs(top2 - bottomSheetBehavior.D) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            i2 = i3;
                        }
                    } else {
                        if (!bottomSheetBehavior.b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                                i2 = 6;
                            }
                        }
                        i2 = i3;
                    }
                } else if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                    if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.V) / 2) {
                        i2 = i3;
                    } else if (!bottomSheetBehavior.b && Math.abs(view.getTop() - bottomSheetBehavior.y()) >= Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                        i2 = 6;
                    }
                } else {
                    i2 = i3;
                }
                bottomSheetBehavior.F(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                boolean z4 = false;
                switch (sideSheetBehavior2.a.a) {
                    case 0:
                        if (f <= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                    default:
                        if (f >= 0.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        break;
                }
                if (!z) {
                    dw0 dw0Var = sideSheetBehavior2.a;
                    switch (dw0Var.a) {
                        case 0:
                            if (Math.abs((dw0Var.b.k * f) + view.getLeft()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                        default:
                            if (Math.abs((dw0Var.b.k * f) + view.getRight()) <= 0.5f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior2.a.a) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                break;
                        }
                        if (z3) {
                            i2 = 5;
                        } else {
                            dw0 dw0Var2 = sideSheetBehavior2.a;
                            switch (dw0Var2.a) {
                                case 0:
                                    if (view.getRight() < (dw0Var2.f() - dw0Var2.g()) / 2) {
                                        z4 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() > (dw0Var2.f() + dw0Var2.b.m) / 2) {
                                        z4 = true;
                                    }
                                    break;
                            }
                            if (z4) {
                                i2 = 5;
                            }
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior2.a.f()) >= Math.abs(left - sideSheetBehavior2.a.g())) {
                            i2 = 5;
                        }
                    } else {
                        i2 = 5;
                    }
                }
                sideSheetBehavior2.u(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    @Override // defpackage.d42
    public final boolean G(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int i2 = this.o;
        SideSheetBehavior sideSheetBehavior = this.p;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) sideSheetBehavior;
                int i3 = bottomSheetBehavior.N;
                if (i3 != 1 && !bottomSheetBehavior.c0) {
                    if (i3 == 3 && bottomSheetBehavior.a0 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.X;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.W;
                            if (weakReference != null) {
                                return true;
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.W;
                        if (weakReference != null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                return (sideSheetBehavior2.h == 1 || (weakReference2 = sideSheetBehavior2.p) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override // defpackage.d42
    public final int e(View view, int i) {
        int iF;
        int i2;
        switch (this.o) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = this.p;
                dw0 dw0Var = sideSheetBehavior.a;
                switch (dw0Var.a) {
                    case 0:
                        iF = -dw0Var.b.l;
                        break;
                    default:
                        iF = dw0Var.f();
                        break;
                }
                dw0 dw0Var2 = sideSheetBehavior.a;
                switch (dw0Var2.a) {
                    case 0:
                        i2 = dw0Var2.b.o;
                        break;
                    default:
                        i2 = dw0Var2.b.m;
                        break;
                }
                return zi0.f(i, iF, i2);
        }
    }

    @Override // defpackage.d42
    public final int f(View view, int i) {
        switch (this.o) {
            case 0:
                return zi0.f(i, this.p.y(), v());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.d42
    public int u(View view) {
        switch (this.o) {
            case 1:
                SideSheetBehavior sideSheetBehavior = this.p;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.u(view);
        }
    }

    @Override // defpackage.d42
    public int v() {
        switch (this.o) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = this.p;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.v();
        }
    }
}
