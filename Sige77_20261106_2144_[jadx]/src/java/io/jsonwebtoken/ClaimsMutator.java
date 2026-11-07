package io.jsonwebtoken;

import io.jsonwebtoken.ClaimsMutator;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface ClaimsMutator<T extends ClaimsMutator> {
    T setAudience(String str);

    T setExpiration(Date date);

    T setId(String str);

    T setIssuedAt(Date date);

    T setIssuer(String str);

    T setNotBefore(Date date);

    T setSubject(String str);
}
