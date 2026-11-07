package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class o92 extends n92 {
    public static final u92 w = u92.h(null, WindowInsets.CONSUMED);

    public o92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var, windowInsets);
    }

    @Override // defpackage.m92, defpackage.i92
    public nq0 E(int i) {
        return nq0.c(this.c.getInsetsIgnoringVisibility(t92.a(i)));
    }

    @Override // defpackage.m92, defpackage.i92, defpackage.r92
    public nq0 h(int i) {
        return nq0.c(this.c.getInsets(t92.a(i)));
    }

    @Override // defpackage.i92, defpackage.r92
    public void n(View view) {
    }
}
