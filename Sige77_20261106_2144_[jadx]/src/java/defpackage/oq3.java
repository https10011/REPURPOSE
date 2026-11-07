package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oq3 {
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final xv1 f = new xv1(12);
    public final uh3 a;
    public final byte[] b;
    public final byte[] c;

    public oq3(byte[] bArr, tr3 tr3Var) throws GeneralSecurityException {
        if (!ck1.i(1)) {
            tv2.f("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32 && bArr.length != 64) {
            throw new InvalidKeyException(ts.g(bArr.length, "invalid key size: ", " bytes; key must have 32 or 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = z32.J(th3.H(qh3.b(bArrCopyOfRange.length), new ox1(tr3.a(bArrCopyOfRange))));
        this.c = tr3Var.b();
    }
}
