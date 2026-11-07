package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class td3 extends k13 {
    public th2 c;
    public boolean d;
    public final ri2 e;
    public final pd3 f;
    public final md2 i;

    public td3(y53 y53Var) {
        super(y53Var);
        this.d = true;
        this.e = new ri2(this);
        this.f = new pd3(this);
        this.i = new md2(this);
    }

    @Override // defpackage.k13
    public final boolean H() {
        return false;
    }

    public final void I() {
        D();
        if (this.c == null) {
            this.c = new th2(Looper.getMainLooper(), 1);
        }
    }
}
