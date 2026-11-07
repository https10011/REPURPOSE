package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class va3 implements mv2 {
    public static final byte[] g = new byte[0];
    public final yd2 a;
    public final ya3 b;
    public final rz2 c;
    public final pa3 d;
    public final int e;
    public final byte[] f;

    public va3(yd2 yd2Var, ya3 ya3Var, rz2 rz2Var, pa3 pa3Var, int i, tr3 tr3Var) {
        this.a = yd2Var;
        this.b = ya3Var;
        this.c = rz2Var;
        this.d = pa3Var;
        this.e = i;
        this.f = tr3Var.b();
    }

    @Override // defpackage.mv2
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        byte[] bArrC0;
        byte[] bArr3 = this.f;
        int length = bArr3.length + this.e;
        if (bArr.length < length) {
            tv2.f("Ciphertext is too short.");
            return null;
        }
        if (!kg3.b(bArr3, bArr)) {
            tv2.f("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        byte b = 0;
        byte[] bArr4 = new byte[0];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f.length, length);
        yd2 yd2Var = this.a;
        ya3 ya3Var = this.b;
        rz2 rz2Var = this.c;
        pa3 pa3Var = this.d;
        byte[] bArrA = ya3Var.a(bArrCopyOfRange, yd2Var);
        byte[] bArr5 = lb3.a;
        byte[] bArrZza = ya3Var.zza();
        String str = rz2Var.b;
        switch (str.hashCode()) {
            case 984523022:
                if (!str.equals("HmacSha256")) {
                    b = -1;
                }
                break;
            case 984524074:
                b = !str.equals("HmacSha384") ? (byte) -1 : (byte) 1;
                break;
            case 984525777:
                b = !str.equals("HmacSha512") ? (byte) -1 : (byte) 2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                bArr2 = lb3.f;
                break;
            case 1:
                bArr2 = lb3.g;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                bArr2 = lb3.h;
                break;
            default:
                tv2.f("Could not determine HPKE KDF ID");
                return null;
        }
        byte[] bArrD0 = nj2.d0(lb3.n, bArrZza, bArr2, pa3Var.zzc());
        byte[] bArr6 = lb3.l;
        byte[] bArr7 = ac2.a0;
        byte[] bArr8 = lb3.o;
        Charset charset = kg3.a;
        byte[] bArrD1 = nj2.d0(bArr5, rz2Var.b(nj2.d0(bArr8, bArrD0, "psk_id_hash".getBytes(charset), bArr7), bArr6), rz2Var.b(nj2.d0(bArr8, bArrD0, "info_hash".getBytes(charset), bArr4), bArr6));
        byte[] bArrB = rz2Var.b(nj2.d0(bArr8, bArrD0, "secret".getBytes(charset), bArr7), bArrA);
        int iZza = pa3Var.zza();
        byte[] bArrA2 = rz2Var.a(iZza, bArrB, nj2.d0(lb3.b(2, iZza), bArr8, bArrD0, "key".getBytes(charset), bArrD1));
        byte[] bArrA3 = rz2Var.a(12, bArrB, nj2.d0(lb3.b(2, 12), bArr8, bArrD0, "base_nonce".getBytes(charset), bArrD1));
        BigInteger bigInteger = BigInteger.ONE;
        ac2 ac2Var = new ac2(bArrA2, bArrA3, bigInteger.shiftLeft(96).subtract(bigInteger), pa3Var);
        byte[] bArr9 = g;
        synchronized (ac2Var) {
            BigInteger bigInteger2 = (BigInteger) ac2Var.d;
            ((pa3) ac2Var.b).getClass();
            bArrC0 = nj2.c0(bArrA3, xi0.F(12, bigInteger2));
            if (((BigInteger) ac2Var.d).compareTo((BigInteger) ac2Var.c) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            ac2Var.d = ((BigInteger) ac2Var.d).add(bigInteger);
        }
        return ((pa3) ac2Var.b).a(bArrA2, bArrC0, bArr, length, bArr9);
    }
}
