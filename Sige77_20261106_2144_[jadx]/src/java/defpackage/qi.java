package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface qi extends kr1, WritableByteChannel {
    qi H(byte[] bArr, int i);

    qi K(String str);

    qi L(long j);

    ji c();

    @Override // defpackage.kr1, java.io.Flushable
    void flush();

    qi g(rj rjVar);

    qi h(long j);

    qi write(byte[] bArr);

    qi writeByte(int i);

    qi writeInt(int i);

    qi writeShort(int i);
}
