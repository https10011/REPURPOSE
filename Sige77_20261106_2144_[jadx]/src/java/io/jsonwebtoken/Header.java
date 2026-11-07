package io.jsonwebtoken;

import io.jsonwebtoken.Header;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface Header<T extends Header<T>> extends Map<String, Object> {
    public static final String COMPRESSION_ALGORITHM = "zip";
    public static final String CONTENT_TYPE = "cty";

    @Deprecated
    public static final String DEPRECATED_COMPRESSION_ALGORITHM = "calg";
    public static final String JWT_TYPE = "JWT";
    public static final String TYPE = "typ";

    String getCompressionAlgorithm();

    String getContentType();

    String getType();

    T setCompressionAlgorithm(String str);

    T setContentType(String str);

    T setType(String str);
}
