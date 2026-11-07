package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qh3 extends dx2 {
    public final int a;

    public qh3(int i) {
        this.a = i;
    }

    public static qh3 b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new qh3(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i << 3)));
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qh3) && ((qh3) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(qh3.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        return ts.g(this.a, "AesCmac PRF Parameters (", "-byte key)");
    }
}
