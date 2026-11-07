package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class td2 implements Cloneable {
    public static final byte[] w = new byte[0];
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public byte[] i;
    public long v;

    public final ByteBuffer c(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.i.length + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(101010256);
        byteBufferAllocate.putShort((short) this.a);
        byteBufferAllocate.putShort((short) this.b);
        byteBufferAllocate.putShort((short) this.c);
        byteBufferAllocate.putShort((short) this.d);
        byteBufferAllocate.putInt((int) this.e);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.putShort((short) this.i.length);
        byteBufferAllocate.put(this.i);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final td2 clone() {
        try {
            return (td2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }
}
