package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hr {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public hr(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(qr qrVar, ah ahVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        if (qrVar == null) {
            return;
        }
        cr crVar = qrVar.J;
        cr crVar2 = qrVar.H;
        if (qrVar.f0 == 8) {
            ahVar.e = 0;
            ahVar.f = 0;
            ahVar.g = 0;
            return;
        }
        if (qrVar.S == null) {
            return;
        }
        int i2 = ahVar.a;
        int i3 = ahVar.b;
        int i4 = ahVar.c;
        int i5 = ahVar.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = qrVar.e0;
        int iV = ts.v(i2);
        if (iV == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iV == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iV == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = qrVar.q == 1;
            int i8 = ahVar.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == qrVar.k();
                if (ahVar.j == 2 || !z2 || ((z2 && z3) || qrVar.x())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(qrVar.n(), 1073741824);
                }
            }
        } else if (iV != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = crVar2 != null ? crVar2.g : 0;
            if (crVar != null) {
                i10 += crVar.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iV2 = ts.v(i3);
        if (iV2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iV2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iV2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = qrVar.r == 1;
            int i11 = ahVar.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == qrVar.n();
                if (ahVar.j == 2 || !z4 || ((z4 && z5) || qrVar.y())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(qrVar.k(), 1073741824);
                }
            }
        } else if (iV2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = crVar2 != null ? qrVar.I.g : 0;
            if (crVar != null) {
                i13 += qrVar.K.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        rr rrVar = (rr) qrVar.S;
        ConstraintLayout constraintLayout = this.h;
        if (rrVar != null && d42.i(constraintLayout.w, 256) && view.getMeasuredWidth() == qrVar.n() && view.getMeasuredWidth() < rrVar.n() && view.getMeasuredHeight() == qrVar.k() && view.getMeasuredHeight() < rrVar.k() && view.getBaseline() == qrVar.Z && !qrVar.w() && a(qrVar.F, iMakeMeasureSpec, qrVar.n()) && a(qrVar.G, iMakeMeasureSpec2, qrVar.k())) {
            ahVar.e = qrVar.n();
            ahVar.f = qrVar.k();
            ahVar.g = qrVar.Z;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && qrVar.V > 0.0f;
        boolean z11 = z7 && qrVar.V > 0.0f;
        if (view == null) {
            return;
        }
        gr grVar = (gr) view.getLayoutParams();
        int i14 = ahVar.j;
        if (i14 != 1 && i14 != 2 && z6 && qrVar.q == 0 && z7 && qrVar.r == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            if ((view instanceof o72) && (qrVar instanceof hd0)) {
                ((o72) view).j((hd0) qrVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            qrVar.F = iMakeMeasureSpec;
            qrVar.G = iMakeMeasureSpec2;
            qrVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = qrVar.t;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = qrVar.u;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = qrVar.w;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = qrVar.x;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!d42.i(constraintLayout.w, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * qrVar.V) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / qrVar.V) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                qrVar.F = iMakeMeasureSpec;
                qrVar.G = iMakeMeasureSpec3;
                z = false;
                qrVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        ahVar.i = (iMax == ahVar.c && iMax2 == ahVar.d) ? z : true;
        boolean z13 = grVar.b0 ? true : z12;
        if (z13 && baseline != -1 && qrVar.Z != baseline) {
            ahVar.i = true;
        }
        ahVar.e = iMax;
        ahVar.f = iMax2;
        ahVar.h = z13;
        ahVar.g = baseline;
    }
}
