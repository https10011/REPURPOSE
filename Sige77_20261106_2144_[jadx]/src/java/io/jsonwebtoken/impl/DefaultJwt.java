package io.jsonwebtoken.impl;

import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class DefaultJwt<B> implements Jwt<Header, B> {
    private final B body;
    private final Header header;

    public DefaultJwt(Header header, B b) {
        this.header = header;
        this.body = b;
    }

    @Override // io.jsonwebtoken.Jwt
    public B getBody() {
        return this.body;
    }

    @Override // io.jsonwebtoken.Jwt
    public Header getHeader() {
        return this.header;
    }

    public String toString() {
        return "header=" + this.header + ",body=" + this.body;
    }
}
