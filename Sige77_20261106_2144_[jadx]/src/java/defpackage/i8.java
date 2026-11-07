package defpackage;

import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i8 extends ContentFrameLayout {
    public final /* synthetic */ k8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(k8 k8Var, es esVar) {
        super(esVar, (AttributeSet) null);
        this.w = k8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.w.v(keyEvent) || super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                k8 k8Var = this.w;
                k8Var.t(k8Var.A(0), true);
                return true;
            }
        }
        return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(gu2.u(getContext(), i));
    }
}
