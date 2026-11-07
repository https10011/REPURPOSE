package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tc1 implements zb0 {
    public final BigInteger a;

    public tc1(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.zb0
    public final int a() {
        return 1;
    }

    @Override // defpackage.zb0
    public final BigInteger b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tc1) {
            return this.a.equals(((tc1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
