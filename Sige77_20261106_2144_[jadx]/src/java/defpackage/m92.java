package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class m92 extends l92 {
    public static final u92 v = u92.h(null, WindowInsets.CONSUMED);

    public m92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var, windowInsets);
    }

    @Override // defpackage.i92
    public nq0 E(int i) {
        return nq0.c(this.c.getInsetsIgnoringVisibility(s92.a(i)));
    }

    @Override // defpackage.i92, defpackage.r92
    public nq0 h(int i) {
        return nq0.c(this.c.getInsets(s92.a(i)));
    }

    @Override // defpackage.i92, defpackage.r92
    public final void d(View view) {
    }
}
