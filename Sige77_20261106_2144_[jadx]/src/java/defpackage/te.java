package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class te implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue b;

    public te(ue ueVar, int i) {
        this.b = ueVar;
        this.a = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ue ueVar = this.b;
        ueVar.v[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ueVar.invalidateSelf();
    }
}
