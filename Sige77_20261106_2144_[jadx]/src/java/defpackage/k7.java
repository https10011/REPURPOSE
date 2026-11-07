package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class k7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ ColorStateList b;
    public final /* synthetic */ r21 c;
    public final /* synthetic */ Integer d;

    public /* synthetic */ k7(AppBarLayout appBarLayout, ColorStateList colorStateList, r21 r21Var, Integer num) {
        this.a = appBarLayout;
        this.b = colorStateList;
        this.c = r21Var;
        this.d = num;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        AppBarLayout appBarLayout = this.a;
        LinkedHashSet linkedHashSet = appBarLayout.h0;
        ArrayList arrayList = appBarLayout.g0;
        int iP = qt.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.l0, this.b.getDefaultColor());
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
        r21 r21Var = this.c;
        r21Var.n(colorStateListValueOf);
        if (appBarLayout.m0 != null && (num = appBarLayout.n0) != null && num.equals(this.d)) {
            appBarLayout.m0.setTint(iP);
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    ur.a();
                    return;
                } else if (r21Var.b.d != null) {
                    throw null;
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            throw y00.i(it);
        }
    }
}
