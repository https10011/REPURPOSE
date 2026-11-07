package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface ri extends ds1, ReadableByteChannel {
    String G(long j);

    void J(long j);

    long O();

    String P(Charset charset);

    InputStream Q();

    ji c();

    rj k(long j);

    boolean o(long j);

    long r(ji jiVar);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    String u();

    boolean v();

    int z(ca1 ca1Var);
}
