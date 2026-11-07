package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wh0 implements zb0 {
    public final zb0 a;
    public final fh0 b;

    public wh0(zb0 zb0Var, fh0 fh0Var) {
        this.a = zb0Var;
        this.b = fh0Var;
    }

    @Override // defpackage.zb0
    public final int a() {
        int iA = this.a.a();
        int[] iArr = this.b.a;
        return iArr[iArr.length - 1] * iA;
    }

    @Override // defpackage.zb0
    public final BigInteger b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return this.a.equals(wh0Var.a) && this.b.equals(wh0Var.b);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.b.hashCode(), 16) ^ this.a.hashCode();
    }
}
