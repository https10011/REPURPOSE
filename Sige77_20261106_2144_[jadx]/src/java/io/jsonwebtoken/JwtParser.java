package io.jsonwebtoken;

import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Deserializer;
import java.security.Key;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface JwtParser {
    public static final char SEPARATOR_CHAR = '.';

    @Deprecated
    JwtParser base64UrlDecodeWith(Decoder<String, byte[]> decoder);

    @Deprecated
    JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer);

    boolean isSigned(String str);

    Jwt parse(String str) throws MalformedJwtException, ExpiredJwtException, IllegalArgumentException, io.jsonwebtoken.security.SignatureException;

    <T> T parse(String str, JwtHandler<T> jwtHandler) throws UnsupportedJwtException, MalformedJwtException, ExpiredJwtException, IllegalArgumentException, io.jsonwebtoken.security.SignatureException;

    Jws<Claims> parseClaimsJws(String str) throws UnsupportedJwtException, MalformedJwtException, ExpiredJwtException, IllegalArgumentException, io.jsonwebtoken.security.SignatureException;

    Jwt<Header, Claims> parseClaimsJwt(String str) throws UnsupportedJwtException, MalformedJwtException, ExpiredJwtException, IllegalArgumentException, io.jsonwebtoken.security.SignatureException;

    Jws<String> parsePlaintextJws(String str) throws UnsupportedJwtException, MalformedJwtException, IllegalArgumentException, io.jsonwebtoken.security.SignatureException;

    Jwt<Header, String> parsePlaintextJwt(String str) throws UnsupportedJwtException, MalformedJwtException, IllegalArgumentException, io.jsonwebtoken.security.SignatureException;

    @Deprecated
    JwtParser require(String str, Object obj);

    @Deprecated
    JwtParser requireAudience(String str);

    @Deprecated
    JwtParser requireExpiration(Date date);

    @Deprecated
    JwtParser requireId(String str);

    @Deprecated
    JwtParser requireIssuedAt(Date date);

    @Deprecated
    JwtParser requireIssuer(String str);

    @Deprecated
    JwtParser requireNotBefore(Date date);

    @Deprecated
    JwtParser requireSubject(String str);

    @Deprecated
    JwtParser setAllowedClockSkewSeconds(long j);

    @Deprecated
    JwtParser setClock(Clock clock);

    @Deprecated
    JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver);

    @Deprecated
    JwtParser setSigningKey(String str);

    @Deprecated
    JwtParser setSigningKey(Key key);

    @Deprecated
    JwtParser setSigningKey(byte[] bArr);

    @Deprecated
    JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver);
}
