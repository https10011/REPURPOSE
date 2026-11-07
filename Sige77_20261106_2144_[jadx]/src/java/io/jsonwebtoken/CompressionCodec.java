package io.jsonwebtoken;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface CompressionCodec {
    byte[] compress(byte[] bArr) throws CompressionException;

    byte[] decompress(byte[] bArr) throws CompressionException;

    String getAlgorithmName();
}
