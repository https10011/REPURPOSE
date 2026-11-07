package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.security.SignatureException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface Signer {
    byte[] sign(byte[] bArr) throws SignatureException;
}
