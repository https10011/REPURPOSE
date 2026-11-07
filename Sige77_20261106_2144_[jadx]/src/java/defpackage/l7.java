package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class l7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ r21 b;

    public /* synthetic */ l7(AppBarLayout appBarLayout, r21 r21Var) {
        this.a = appBarLayout;
        this.b = r21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = AppBarLayout.q0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.b.m(fFloatValue);
        AppBarLayout appBarLayout = this.a;
        Drawable drawable = appBarLayout.m0;
        if (drawable instanceof r21) {
            ((r21) drawable).m(fFloatValue);
        }
        Iterator it = appBarLayout.g0.iterator();
        if (it.hasNext()) {
            throw y00.i(it);
        }
        Iterator it2 = appBarLayout.h0.iterator();
        if (it2.hasNext()) {
            throw y00.i(it2);
        }
    }
}
