package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oe {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public oe(BackEvent backEvent) {
        backEvent.getClass();
        h7 h7Var = h7.a;
        float fD = h7Var.d(backEvent);
        float fE = h7Var.e(backEvent);
        float fB = h7Var.b(backEvent);
        int iC = h7Var.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
