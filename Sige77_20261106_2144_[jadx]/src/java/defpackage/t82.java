package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t82 implements View.OnApplyWindowInsetsListener {
    public final e2 a;
    public u92 b;

    public t82(View view, e2 e2Var) {
        u92 u92VarB;
        this.a = e2Var;
        WeakHashMap weakHashMap = x52.a;
        u92 u92VarA = q52.a(view);
        if (u92VarA != null) {
            int i = Build.VERSION.SDK_INT;
            u92VarB = (i >= 36 ? new g92(u92VarA) : i >= 35 ? new f92(u92VarA) : i >= 34 ? new e92(u92VarA) : i >= 31 ? new d92(u92VarA) : i >= 30 ? new c92(u92VarA) : i >= 29 ? new b92(u92VarA) : new a92(u92VarA)).b();
        } else {
            u92VarB = null;
        }
        this.b = u92VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = u92.h(view, windowInsets);
            return u82.i(view, windowInsets);
        }
        u92 u92VarH = u92.h(view, windowInsets);
        r92 r92Var = u92VarH.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = x52.a;
            this.b = q52.a(view);
        }
        if (this.b == null) {
            this.b = u92VarH;
            return u82.i(view, windowInsets);
        }
        e2 e2VarJ = u82.j(view);
        if (e2VarJ != null && Objects.equals((u92) e2VarJ.c, u92VarH)) {
            return u82.i(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        u92 u92Var = this.b;
        int i = 1;
        while (i <= 512) {
            nq0 nq0VarH = r92Var.h(i);
            nq0 nq0VarH2 = u92Var.a.h(i);
            int i2 = nq0VarH.a;
            int i3 = nq0VarH.d;
            int i4 = nq0VarH.c;
            int i5 = nq0VarH.b;
            int i6 = nq0VarH2.a;
            int i7 = nq0VarH2.d;
            int i8 = nq0VarH2.c;
            int i9 = nq0VarH2.b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        boolean z2 = false;
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = u92VarH;
            return u82.i(view, windowInsets);
        }
        u92 u92Var2 = this.b;
        if ((i10 & 8) != 0) {
            interpolator = u82.e;
        } else if ((i11 & 8) != 0) {
            interpolator = u82.f;
        } else if ((i10 & 519) != 0) {
            interpolator = u82.g;
        } else {
            interpolator = (i11 & 519) != 0 ? u82.h : null;
        }
        z82 z82Var = new z82(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        z82Var.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(z82Var.a.a());
        nq0 nq0VarH3 = r92Var.h(i12);
        nq0 nq0VarH4 = u92Var2.a.h(i12);
        int iMin = Math.min(nq0VarH3.a, nq0VarH4.a);
        int i13 = nq0VarH3.b;
        int i14 = nq0VarH4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = nq0VarH3.c;
        int i16 = nq0VarH4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = nq0VarH3.d;
        int i18 = nq0VarH4.d;
        vf3 vf3Var = new vf3(7, nq0.b(iMin, iMin2, iMin3, Math.min(i17, i18)), nq0.b(Math.max(nq0VarH3.a, nq0VarH4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), z2);
        u82.f(view, u92VarH, false);
        duration.addUpdateListener(new s82(z82Var, u92VarH, u92Var2, i12, view));
        duration.addListener(new lz1(z82Var, view));
        g91.a(view, new gc(view, z82Var, vf3Var, duration));
        this.b = u92VarH;
        return u82.i(view, windowInsets);
    }
}
