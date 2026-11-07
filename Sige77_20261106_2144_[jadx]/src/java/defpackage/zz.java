package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zz implements Animation.AnimationListener {
    public final /* synthetic */ ms1 a;
    public final /* synthetic */ a00 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ wz d;

    public zz(ms1 ms1Var, a00 a00Var, View view, wz wzVar) {
        this.a = ms1Var;
        this.b = a00Var;
        this.c = view;
        this.d = wzVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        a00 a00Var = this.b;
        a00Var.a.post(new dg(a00Var, this.c, this.d, 5));
        if (e.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (e.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
