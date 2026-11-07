package io.jsonwebtoken.io;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface Encoder<T, R> {
    R encode(T t) throws EncodingException;
}
