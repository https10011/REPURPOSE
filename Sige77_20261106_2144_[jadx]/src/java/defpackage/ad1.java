package defpackage;

import android.os.Handler;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ad1 implements ww0 {
    public static final ad1 w = new ad1();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final a f = new a(this);
    public final y1 i = new y1(this, 21);
    public final kj0 v = new kj0(this, 17);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(kw0.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.i);
            }
        }
    }

    @Override // defpackage.ww0
    public final nw0 getLifecycle() {
        return this.f;
    }
}
