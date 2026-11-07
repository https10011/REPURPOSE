package io.jsonwebtoken.impl;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Deprecated
public interface TextCodec {

    @Deprecated
    public static final TextCodec BASE64 = new Base64Codec();

    @Deprecated
    public static final TextCodec BASE64URL = new Base64UrlCodec();

    byte[] decode(String str);

    String decodeToString(String str);

    String encode(String str);

    String encode(byte[] bArr);
}
