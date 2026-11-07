package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.xiasuhuei321.loadingdialog.view.LVCircularRing;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21 r21Var = ((BottomSheetBehavior) obj).i;
                if (r21Var != null) {
                    p21 p21Var = r21Var.b;
                    if (p21Var.j != fFloatValue) {
                        p21Var.j = fFloatValue;
                        r21Var.f = true;
                        r21Var.i = true;
                        r21Var.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                x90 x90Var = (x90) obj;
                x90Var.c.setAlpha(iFloatValue);
                x90Var.d.setAlpha(iFloatValue);
                x90Var.s.invalidate();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                LVCircularRing lVCircularRing = (LVCircularRing) obj;
                lVCircularRing.c = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
                lVCircularRing.invalidate();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) obj).j1.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
