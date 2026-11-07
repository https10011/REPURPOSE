package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ kg1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ mz e;

    public hz(mz mzVar, kg1 kg1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = mzVar;
        this.b = kg1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        kg1 kg1Var = this.b;
        mz mzVar = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                mzVar.c(kg1Var);
                mzVar.q.remove(kg1Var);
                mzVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                mzVar.c(kg1Var);
                mzVar.o.remove(kg1Var);
                mzVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public hz(mz mzVar, kg1 kg1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = mzVar;
        this.b = kg1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
