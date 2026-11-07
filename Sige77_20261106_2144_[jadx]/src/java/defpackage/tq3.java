package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tq3 implements mv2 {
    public final ECPrivateKey a;
    public final ik3 b;
    public final String c;
    public final byte[] d;
    public final zq3 e;
    public final ea3 f;
    public final byte[] g;

    public tq3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zq3 zq3Var, ea3 ea3Var, byte[] bArr2) {
        this.a = eCPrivateKey;
        ik3 ik3Var = new ik3();
        ik3Var.a = eCPrivateKey;
        this.b = ik3Var;
        this.d = bArr;
        this.c = str;
        this.e = zq3Var;
        this.f = ea3Var;
        this.g = bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0089  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9 A[LOOP:0: B:22:0x00b7->B:24:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00db  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[SYNTHETIC] */
    @Override // defpackage.mv2
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int i;
        int i2;
        ea3 ea3Var;
        int iZza;
        byte[] bArrD0;
        String str;
        Mac mac;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrDoFinal;
        int length;
        byte[] bArr4 = this.g;
        if (!kg3.b(bArr4, bArr)) {
            tv2.f("Invalid ciphertext (output prefix mismatch)");
            return null;
        }
        int length2 = bArr4.length;
        int iZ = am2.Z(this.a.getParams().getCurve());
        zq3 zq3Var = this.e;
        int iOrdinal = zq3Var.ordinal();
        int i3 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    tv2.f("unknown EC point format");
                    return null;
                }
                i = iZ * 2;
            }
            i2 = i + length2;
            if (bArr.length >= i2) {
                tv2.f("ciphertext too short");
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
            ea3Var = this.f;
            iZza = ea3Var.zza();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) this.b.a;
            ECParameterSpec params = eCPrivateKey.getParams();
            bArrD0 = nj2.d0(bArrCopyOfRange, am2.f0(eCPrivateKey, (ECPublicKey) ((KeyFactory) cr3.f.a.zza("EC")).generatePublic(new ECPublicKeySpec(am2.c0(params.getCurve(), zq3Var, bArrCopyOfRange), params))));
            gr3 gr3Var = cr3.c.a;
            str = this.c;
            mac = (Mac) gr3Var.zza(str);
            if (iZza <= mac.getMacLength() * 255) {
                tv2.f("size too large");
                return null;
            }
            bArr2 = this.d;
            if (bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] bArrDoFinal2 = mac.doFinal(bArrD0);
            bArr3 = new byte[iZza];
            mac.init(new SecretKeySpec(bArrDoFinal2, str));
            bArrDoFinal = new byte[0];
            length = 0;
            while (true) {
                mac.update(bArrDoFinal);
                mac.update((byte[]) null);
                mac.update((byte) i3);
                bArrDoFinal = mac.doFinal();
                if (bArrDoFinal.length + length < iZza) {
                    System.arraycopy(bArrDoFinal, 0, bArr3, length, iZza - length);
                    return ea3Var.c(i2, bArr3, bArr);
                }
                System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
                length += bArrDoFinal.length;
                i3++;
            }
        } else {
            iZ *= 2;
        }
        i = iZ + 1;
        i2 = i + length2;
        if (bArr.length >= i2) {
            tv2.f("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2, i2);
        ea3Var = this.f;
        iZza = ea3Var.zza();
        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) this.b.a;
        ECParameterSpec params2 = eCPrivateKey2.getParams();
        bArrD0 = nj2.d0(bArrCopyOfRange2, am2.f0(eCPrivateKey2, (ECPublicKey) ((KeyFactory) cr3.f.a.zza("EC")).generatePublic(new ECPublicKeySpec(am2.c0(params2.getCurve(), zq3Var, bArrCopyOfRange2), params2))));
        gr3 gr3Var2 = cr3.c.a;
        str = this.c;
        mac = (Mac) gr3Var2.zza(str);
        if (iZza <= mac.getMacLength() * 255) {
            tv2.f("size too large");
            return null;
        }
        bArr2 = this.d;
        if (bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArrDoFinal3 = mac.doFinal(bArrD0);
        bArr3 = new byte[iZza];
        mac.init(new SecretKeySpec(bArrDoFinal3, str));
        bArrDoFinal = new byte[0];
        length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update((byte[]) null);
            mac.update((byte) i3);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length < iZza) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, iZza - length);
                return ea3Var.c(i2, bArr3, bArr);
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i3++;
        }
    }
}
