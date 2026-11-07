package io.jsonwebtoken.impl.crypto;

import defpackage.sm0;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECKey;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class EllipticCurveSigner extends EllipticCurveProvider implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if ((key instanceof PrivateKey) && (key instanceof ECKey)) {
            return;
        }
        sm0.e(key.getClass().getName(), " is not an EC PrivateKey.", "Elliptic Curve signatures must be computed using an EC PrivateKey.  The specified key of type ");
        throw null;
    }

    public byte[] doSign(byte[] bArr) throws SignatureException, InvalidKeyException, JwtException {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature signatureCreateSignatureInstance = createSignatureInstance();
        signatureCreateSignatureInstance.initSign(privateKey);
        signatureCreateSignatureInstance.update(bArr);
        return EllipticCurveProvider.transcodeSignatureToConcat(signatureCreateSignatureInstance.sign(), EllipticCurveProvider.getSignatureByteArrayLength(this.alg));
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (JwtException e) {
            sm0.r("Unable to convert signature to JOSE format. ", e.getMessage(), e);
            return null;
        } catch (InvalidKeyException e2) {
            sm0.r("Invalid Elliptic Curve PrivateKey. ", e2.getMessage(), e2);
            return null;
        } catch (SignatureException e3) {
            sm0.r("Unable to calculate signature using Elliptic Curve PrivateKey. ", e3.getMessage(), e3);
            return null;
        }
    }
}
