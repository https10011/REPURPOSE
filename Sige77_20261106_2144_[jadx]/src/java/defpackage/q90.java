package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q90 extends AnimatorListenerAdapter implements nz1 {
    public final View a;
    public boolean b = false;

    public q90(View view) {
        this.a = view;
    }

    @Override // defpackage.nz1
    public final void b() {
        View view = this.a;
        view.setTag(2131296836, Float.valueOf(view.getVisibility() == 0 ? e72.a.n(view) : 0.0f));
    }

    @Override // defpackage.nz1
    public final void c() {
        this.a.setTag(2131296836, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        e72.a.w(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        k72 k72Var = e72.a;
        k72Var.w(view, 1.0f);
        k72Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.nz1
    public final void a(pz1 pz1Var) {
    }

    @Override // defpackage.nz1
    public final void d(pz1 pz1Var) {
    }

    @Override // defpackage.nz1
    public final void e(pz1 pz1Var) {
    }

    @Override // defpackage.nz1
    public final void f(pz1 pz1Var) {
    }
}
