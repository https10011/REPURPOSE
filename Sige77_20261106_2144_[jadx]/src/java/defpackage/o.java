package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o extends r {
    public final byte[] a;

    public o(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
    }

    @Override // defpackage.r
    public final boolean b(r rVar) {
        if (rVar instanceof o) {
            return z32.d(this.a, ((o) rVar).a);
        }
        return false;
    }

    @Override // defpackage.r
    public final void c(kj0 kj0Var) throws IOException {
        kj0Var.R(2);
        byte[] bArr = this.a;
        kj0Var.S(bArr.length);
        ((ByteArrayOutputStream) kj0Var.b).write(bArr);
    }

    @Override // defpackage.r
    public final int d() {
        byte[] bArr = this.a;
        return cu1.a(bArr.length) + 1 + bArr.length;
    }

    @Override // defpackage.r, defpackage.p
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    public final String toString() {
        return new BigInteger(this.a).toString();
    }

    public o(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
    }
}
