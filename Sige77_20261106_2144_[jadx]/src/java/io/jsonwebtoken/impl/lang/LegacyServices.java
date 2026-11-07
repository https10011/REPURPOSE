package io.jsonwebtoken.impl.lang;

import io.jsonwebtoken.lang.UnknownClassException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Deprecated
public final class LegacyServices {
    public static <T> T loadFirst(Class<T> cls) {
        try {
            return (T) Services.loadFirst(cls);
        } catch (UnavailableImplementationException e) {
            throw new UnknownClassException(e.getMessage(), e);
        }
    }
}
