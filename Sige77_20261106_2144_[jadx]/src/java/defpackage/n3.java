package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.checkbox.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public n3(a72 a72Var, View view) {
        this.a = 6;
        this.b = a72Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.m0 = null;
                actionBarOverlayLayout.W = false;
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ((a72) obj).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.m0 = null;
                actionBarOverlayLayout.W = false;
                break;
            case 1:
                z6 z6Var = (z6) obj;
                ArrayList arrayList = new ArrayList(z6Var.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((j21) arrayList.get(i2)).b.e0;
                    if (colorStateList != null) {
                        z6Var.setTintList(colorStateList);
                    }
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                v30 v30Var = (v30) obj;
                v30Var.p();
                v30Var.r.start();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((HideBottomViewOnScrollBehavior) obj).k = null;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ((HideViewOnScrollBehavior) obj).k = null;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ((pz1) obj).o();
                animator.removeListener(this);
                break;
            default:
                ((a72) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                z6 z6Var = (z6) obj;
                ArrayList arrayList = new ArrayList(z6Var.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    b bVar = ((j21) arrayList.get(i2)).b;
                    ColorStateList colorStateList = bVar.e0;
                    if (colorStateList != null) {
                        z6Var.setTint(colorStateList.getColorForState(bVar.i0, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ((a72) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ n3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
