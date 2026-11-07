package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vn implements View.OnClickListener {
    public n70 a;
    public WeakReference b;
    public WeakReference c;
    public View.OnClickListener d;
    public boolean e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.c.get();
            View view3 = (View) this.b.get();
            if (view2 == null || view3 == null) {
                return;
            }
            n70 n70Var = this.a;
            n70Var.getClass();
            xn.r(n70Var, view2, view3);
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
