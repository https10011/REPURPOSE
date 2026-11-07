package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t6 extends Animatable2.AnimationCallback {
    public final /* synthetic */ j21 a;

    public t6(j21 j21Var) {
        this.a = j21Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.e0;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        b bVar = this.a.b;
        ColorStateList colorStateList = bVar.e0;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(bVar.i0, colorStateList.getDefaultColor()));
        }
    }
}
