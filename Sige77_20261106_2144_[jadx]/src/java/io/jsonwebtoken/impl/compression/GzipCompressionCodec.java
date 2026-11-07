package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class GzipCompressionCodec extends AbstractCompressionCodec implements CompressionCodec {
    private static final String GZIP = "GZIP";
    private static final AbstractCompressionCodec.StreamWrapper WRAPPER = new AbstractCompressionCodec.StreamWrapper() { // from class: io.jsonwebtoken.impl.compression.GzipCompressionCodec.1
        @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec.StreamWrapper
        public OutputStream wrap(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    };

    @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec
    public byte[] doCompress(byte[] bArr) throws IOException {
        return writeAndClose(bArr, WRAPPER);
    }

    @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec
    public byte[] doDecompress(byte[] bArr) throws IOException {
        return readAndClose(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public String getAlgorithmName() {
        return GZIP;
    }
}
