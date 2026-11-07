package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yz extends AnimatorListenerAdapter {
    public final /* synthetic */ a00 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ms1 d;
    public final /* synthetic */ wz e;

    public yz(a00 a00Var, View view, boolean z, ms1 ms1Var, wz wzVar) {
        this.a = a00Var;
        this.b = view;
        this.c = z;
        this.d = ms1Var;
        this.e = wzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        ms1 ms1Var = this.d;
        if (z) {
            int i = ms1Var.a;
            view.getClass();
            ck1.c(view, i);
        }
        this.e.h();
        if (e.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + ms1Var + " has ended.");
        }
    }
}
