package io.jsonwebtoken.impl;

import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class DefaultJws<B> implements Jws<B> {
    private final B body;
    private final JwsHeader header;
    private final String signature;

    public DefaultJws(JwsHeader jwsHeader, B b, String str) {
        this.header = jwsHeader;
        this.body = b;
        this.signature = str;
    }

    @Override // io.jsonwebtoken.Jwt
    public B getBody() {
        return this.body;
    }

    @Override // io.jsonwebtoken.Jws
    public String getSignature() {
        return this.signature;
    }

    public String toString() {
        return "header=" + this.header + ",body=" + this.body + ",signature=" + this.signature;
    }

    @Override // io.jsonwebtoken.Jwt
    public JwsHeader getHeader() {
        return this.header;
    }
}
