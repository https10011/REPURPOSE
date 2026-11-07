package io.jsonwebtoken.io;

import io.jsonwebtoken.lang.Assert;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
class Base64Encoder extends Base64Support implements Encoder<byte[], String> {
    public Base64Encoder() {
        super(Base64.DEFAULT);
    }

    @Override // io.jsonwebtoken.io.Encoder
    public String encode(byte[] bArr) throws EncodingException {
        Assert.notNull(bArr, "byte array argument cannot be null");
        return this.base64.encodeToString(bArr, false);
    }

    public Base64Encoder(Base64 base64) {
        super(base64);
    }
}
