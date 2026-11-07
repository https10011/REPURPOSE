package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lz1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public lz1(z82 z82Var, View view) {
        this.b = z82Var;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((mb) obj2).remove(animator);
                ((pz1) obj).a0.remove(animator);
                break;
            default:
                ((z82) obj2).a.d(1.0f);
                u82.e((View) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((pz1) this.c).a0.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public lz1(pz1 pz1Var, mb mbVar) {
        this.c = pz1Var;
        this.b = mbVar;
    }
}
