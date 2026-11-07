package io.jsonwebtoken;

import io.jsonwebtoken.Header;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface Jwt<H extends Header, B> {
    B getBody();

    H getHeader();
}
