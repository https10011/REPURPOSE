package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class we3 {
    public static final tr3 a = tr3.a(new byte[0]);

    public static final tr3 a(int i) {
        return tr3.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final tr3 b(int i) {
        return tr3.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
