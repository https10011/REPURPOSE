package io.jsonwebtoken.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandler;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.security.SignatureException;
import java.security.Key;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
class ImmutableJwtParser implements JwtParser {
    private final JwtParser jwtParser;

    public ImmutableJwtParser(JwtParser jwtParser) {
        this.jwtParser = jwtParser;
    }

    private IllegalStateException doNotMutate() {
        return new IllegalStateException("Cannot mutate a JwtParser created from JwtParserBuilder.build(), the mutable methods in JwtParser will be removed before version 1.0");
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> decoder) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public boolean isSigned(String str) {
        return this.jwtParser.isSigned(str);
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt parse(String str) throws MalformedJwtException, ExpiredJwtException, IllegalArgumentException, SignatureException {
        return this.jwtParser.parse(str);
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jws<Claims> parseClaimsJws(String str) throws UnsupportedJwtException, MalformedJwtException, ExpiredJwtException, IllegalArgumentException, SignatureException {
        return this.jwtParser.parseClaimsJws(str);
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt<Header, Claims> parseClaimsJwt(String str) throws UnsupportedJwtException, MalformedJwtException, ExpiredJwtException, IllegalArgumentException, SignatureException {
        return this.jwtParser.parseClaimsJwt(str);
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jws<String> parsePlaintextJws(String str) throws UnsupportedJwtException, MalformedJwtException, IllegalArgumentException, SignatureException {
        return this.jwtParser.parsePlaintextJws(str);
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt<Header, String> parsePlaintextJwt(String str) throws UnsupportedJwtException, MalformedJwtException, IllegalArgumentException, SignatureException {
        return this.jwtParser.parsePlaintextJwt(str);
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser require(String str, Object obj) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireAudience(String str) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireExpiration(Date date) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireId(String str) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireIssuedAt(Date date) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireIssuer(String str) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireNotBefore(Date date) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireSubject(String str) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setAllowedClockSkewSeconds(long j) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setClock(Clock clock) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(byte[] bArr) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(String str) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(Key key) {
        throw doNotMutate();
    }

    @Override // io.jsonwebtoken.JwtParser
    public <T> T parse(String str, JwtHandler<T> jwtHandler) throws UnsupportedJwtException, MalformedJwtException, ExpiredJwtException, IllegalArgumentException, SignatureException {
        return (T) this.jwtParser.parse(str, jwtHandler);
    }
}
