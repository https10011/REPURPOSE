package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ll extends pz1 {
    public static final String[] n0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final hl o0 = new hl(PointF.class, "topLeft", 0);
    public static final hl p0 = new hl(PointF.class, "bottomRight", 1);
    public static final hl q0 = new hl(PointF.class, "bottomRight", 2);
    public static final hl r0 = new hl(PointF.class, "topLeft", 3);
    public static final hl s0 = new hl(PointF.class, "position", 4);

    public static void M(zz1 zz1Var) {
        View view = zz1Var.b;
        HashMap map = zz1Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.pz1
    public final void f(zz1 zz1Var) {
        M(zz1Var);
    }

    @Override // defpackage.pz1
    public final void i(zz1 zz1Var) {
        M(zz1Var);
    }

    @Override // defpackage.pz1
    public final Animator m(ViewGroup viewGroup, zz1 zz1Var, zz1 zz1Var2) {
        int i;
        ll llVar;
        Animator animatorA;
        if (zz1Var == null) {
            return null;
        }
        HashMap map = zz1Var.a;
        if (zz1Var2 == null) {
            return null;
        }
        HashMap map2 = zz1Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = zz1Var2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        e72.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            llVar = this;
            if (i2 == i3 && i4 == i5) {
                llVar.i0.getClass();
                animatorA = u71.a(view, q0, mo1.m(i6, i8, i7, i9));
            } else {
                llVar.i0.getClass();
                animatorA = u71.a(view, r0, mo1.m(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            llVar = this;
            llVar.i0.getClass();
            animatorA = u71.a(view, s0, mo1.m(i2, i4, i3, i5));
        } else {
            llVar = this;
            kl klVar = new kl(view);
            llVar.i0.getClass();
            ObjectAnimator objectAnimatorA = u71.a(klVar, o0, mo1.m(i2, i4, i3, i5));
            llVar.i0.getClass();
            ObjectAnimator objectAnimatorA2 = u71.a(klVar, p0, mo1.m(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
            animatorSet.addListener(new il(klVar));
            animatorA = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ea.A(viewGroup4, true);
            llVar.q().c(new jl(viewGroup4));
        }
        return animatorA;
    }

    @Override // defpackage.pz1
    public final String[] t() {
        return n0;
    }
}
