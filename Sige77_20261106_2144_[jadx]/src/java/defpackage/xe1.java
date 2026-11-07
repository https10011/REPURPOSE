package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xe1 implements View.OnTouchListener {
    public final n70 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View.OnTouchListener d;
    public final boolean e = true;

    public xe1(n70 n70Var, View view, View view2) {
        this.a = n70Var;
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        this.d = g62.g(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        View view2 = (View) this.c.get();
        View view3 = (View) this.b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            xn.r(this.a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
