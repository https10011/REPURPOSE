package io.jsonwebtoken.io;

import io.jsonwebtoken.lang.Assert;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
class Base64Support {
    protected final Base64 base64;

    public Base64Support(Base64 base64) {
        Assert.notNull(base64, "Base64 argument cannot be null");
        this.base64 = base64;
    }
}
