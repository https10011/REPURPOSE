package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z31 extends vy0 implements n31 {
    public static final Method q0;
    public pv2 p0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                q0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.n31
    public final void e(i31 i31Var, MenuItem menuItem) {
        pv2 pv2Var = this.p0;
        if (pv2Var != null) {
            pv2Var.e(i31Var, menuItem);
        }
    }

    @Override // defpackage.n31
    public final void j(i31 i31Var, o31 o31Var) {
        pv2 pv2Var = this.p0;
        if (pv2Var != null) {
            pv2Var.j(i31Var, o31Var);
        }
    }

    @Override // defpackage.vy0
    public final o30 q(boolean z, Context context) {
        y31 y31Var = new y31(z, context);
        y31Var.setHoverListener(this);
        return y31Var;
    }
}
