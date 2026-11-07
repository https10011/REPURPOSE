package io.jsonwebtoken.impl;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Deprecated
public class AndroidBase64Codec extends AbstractTextCodec {
    @Override // io.jsonwebtoken.impl.TextCodec
    public byte[] decode(String str) {
        return Decoders.BASE64.decode(str);
    }

    @Override // io.jsonwebtoken.impl.TextCodec
    public String encode(byte[] bArr) {
        return Encoders.BASE64.encode(bArr);
    }
}
