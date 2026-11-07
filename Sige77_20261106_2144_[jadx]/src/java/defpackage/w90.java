package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w90 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ x90 b;

    public w90(x90 x90Var) {
        this.b = x90Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        x90 x90Var = this.b;
        if (((Float) x90Var.z.getAnimatedValue()).floatValue() == 0.0f) {
            x90Var.A = 0;
            x90Var.f(0);
        } else {
            x90Var.A = 2;
            x90Var.s.invalidate();
        }
    }
}
