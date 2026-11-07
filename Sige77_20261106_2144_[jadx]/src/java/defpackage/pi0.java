package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pi0 extends ov {
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap i;

    public pi0(Handler handler, int i, long j) {
        this.d = handler;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.kw1
    public final void d(Object obj, oz1 oz1Var) {
        this.i = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }

    @Override // defpackage.kw1
    public final void i(Drawable drawable) {
        this.i = null;
    }
}
