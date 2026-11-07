package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s82 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ z82 a;
    public final /* synthetic */ u92 b;
    public final /* synthetic */ u92 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public s82(z82 z82Var, u92 u92Var, u92 u92Var2, int i, View view) {
        this.a = z82Var;
        this.b = u92Var;
        this.c = u92Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h92 b92Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        z82 z82Var = this.a;
        y82 y82Var = z82Var.a;
        y82Var.d(animatedFraction);
        float fB = y82Var.b();
        PathInterpolator pathInterpolator = u82.e;
        int i = Build.VERSION.SDK_INT;
        u92 u92Var = this.b;
        if (i >= 36) {
            b92Var = new g92(u92Var);
        } else if (i >= 35) {
            b92Var = new f92(u92Var);
        } else if (i >= 34) {
            b92Var = new e92(u92Var);
        } else if (i >= 31) {
            b92Var = new d92(u92Var);
        } else if (i >= 30) {
            b92Var = new c92(u92Var);
        } else {
            b92Var = i >= 29 ? new b92(u92Var) : new a92(u92Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            r92 r92Var = u92Var.a;
            if (i3 == 0) {
                b92Var.d(i2, r92Var.h(i2));
            } else {
                nq0 nq0VarH = r92Var.h(i2);
                nq0 nq0VarH2 = this.c.a.h(i2);
                float f = 1.0f - fB;
                b92Var.d(i2, u92.e(nq0VarH, (int) (((double) ((nq0VarH.a - nq0VarH2.a) * f)) + 0.5d), (int) (((double) ((nq0VarH.b - nq0VarH2.b) * f)) + 0.5d), (int) (((double) ((nq0VarH.c - nq0VarH2.c) * f)) + 0.5d), (int) (((double) ((nq0VarH.d - nq0VarH2.d) * f)) + 0.5d)));
            }
        }
        u82.g(this.e, b92Var.b(), Collections.singletonList(z82Var));
    }
}
