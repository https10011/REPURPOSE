package io.jsonwebtoken;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface JwtHandler<T> {
    T onClaimsJws(Jws<Claims> jws);

    T onClaimsJwt(Jwt<Header, Claims> jwt);

    T onPlaintextJws(Jws<String> jws);

    T onPlaintextJwt(Jwt<Header, String> jwt);
}
