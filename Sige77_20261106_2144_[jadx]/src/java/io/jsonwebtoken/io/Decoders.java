package io.jsonwebtoken.io;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class Decoders {
    public static final Decoder<String, byte[]> BASE64 = new ExceptionPropagatingDecoder(new Base64Decoder());
    public static final Decoder<String, byte[]> BASE64URL = new ExceptionPropagatingDecoder(new Base64UrlDecoder());

    private Decoders() {
    }
}
