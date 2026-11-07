package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class q52 {
    public static u92 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        u92 u92VarH = u92.h(null, rootWindowInsets);
        r92 r92Var = u92VarH.a;
        r92Var.u(u92VarH);
        View rootView = view.getRootView();
        r92Var.d(rootView);
        r92Var.n(rootView);
        r92Var.o();
        return u92VarH;
    }
}
