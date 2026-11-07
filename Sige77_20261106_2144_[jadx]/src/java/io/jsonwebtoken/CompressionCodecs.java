package io.jsonwebtoken;

import io.jsonwebtoken.lang.Classes;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class CompressionCodecs {
    public static final CompressionCodec DEFLATE = (CompressionCodec) Classes.newInstance("io.jsonwebtoken.impl.compression.DeflateCompressionCodec");
    public static final CompressionCodec GZIP = (CompressionCodec) Classes.newInstance("io.jsonwebtoken.impl.compression.GzipCompressionCodec");

    private CompressionCodecs() {
    }
}
