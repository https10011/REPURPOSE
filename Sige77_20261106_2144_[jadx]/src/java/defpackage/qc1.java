package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qc1 extends ov {
    public static final Handler e = new Handler(Looper.getMainLooper(), new of(1));
    public final ii1 d;

    public qc1(ii1 ii1Var) {
        this.d = ii1Var;
    }

    @Override // defpackage.kw1
    public final void d(Object obj, oz1 oz1Var) {
        xh1 xh1Var = this.c;
        if (xh1Var == null || !xh1Var.k()) {
            return;
        }
        e.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.kw1
    public final void i(Drawable drawable) {
    }
}
