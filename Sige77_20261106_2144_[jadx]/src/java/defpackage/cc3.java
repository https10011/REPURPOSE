package defpackage;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cc3 implements cv2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public cc3(String str) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.b = new cc3(str, keyStore);
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @Override // defpackage.cv2
    public final byte[] g(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (bArr.length < 28) {
                    throw new BadPaddingException("ciphertext too short");
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, (SecretKey) obj, gCMParameterSpec);
                cipher.updateAAD(bArr2);
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            default:
                cc3 cc3Var = (cc3) obj;
                try {
                    return cc3Var.g(bArr, bArr2);
                } catch (BadPaddingException e) {
                    throw e;
                } catch (GeneralSecurityException e2) {
                    e = e2;
                    Log.w("cc3", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return cc3Var.g(bArr, bArr2);
                } catch (ProviderException e3) {
                    e = e3;
                    Log.w("cc3", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    Thread.sleep((int) (Math.random() * 100.0d));
                    return cc3Var.g(bArr, bArr2);
                }
        }
    }

    @Override // defpackage.cv2
    public final byte[] h(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (bArr.length > 2147483619) {
                    tv2.f("plaintext too long");
                    return null;
                }
                byte[] bArr3 = new byte[bArr.length + 28];
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, (SecretKey) obj);
                cipher.updateAAD(bArr2);
                if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) != bArr.length + 16) {
                    tv2.f("encryption failed: bytesWritten is wrong");
                    return null;
                }
                byte[] iv = cipher.getIV();
                if (iv.length == 12) {
                    System.arraycopy(iv, 0, bArr3, 0, 12);
                    return bArr3;
                }
                tv2.f("IV has unexpected length");
                return null;
            default:
                cc3 cc3Var = (cc3) obj;
                try {
                    return cc3Var.h(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("cc3", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return cc3Var.h(bArr, bArr2);
                }
        }
    }

    public cc3(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }
}
