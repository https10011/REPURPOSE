package io.jsonwebtoken.impl.crypto;

import defpackage.sm0;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAKey;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class RsaSigner extends RsaProvider implements Signer {
    public RsaSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if ((key instanceof PrivateKey) && (key instanceof RSAKey)) {
            return;
        }
        sm0.e(key.getClass().getName(), " is not an RSA PrivateKey.", "RSA signatures must be computed using an RSA PrivateKey.  The specified key of type ");
        throw null;
    }

    public byte[] doSign(byte[] bArr) throws SignatureException, InvalidKeyException {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature signatureCreateSignatureInstance = createSignatureInstance();
        signatureCreateSignatureInstance.initSign(privateKey);
        signatureCreateSignatureInstance.update(bArr);
        return signatureCreateSignatureInstance.sign();
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (InvalidKeyException e) {
            sm0.r("Invalid RSA PrivateKey. ", e.getMessage(), e);
            return null;
        } catch (SignatureException e2) {
            sm0.r("Unable to calculate signature using RSA PrivateKey. ", e2.getMessage(), e2);
            return null;
        }
    }
}
