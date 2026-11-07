package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xc2 implements Cloneable {
    public final long a;
    public final ArrayList b = new ArrayList();

    public xc2(long j) {
        this.a = j;
    }

    public final long c() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        long length = 32;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            length += (long) ((byte[]) ((wc2) obj).b.a).length;
        }
        return length;
    }

    public final ByteBuffer[] d() {
        ArrayList arrayList = this.b;
        ByteBuffer[] byteBufferArr = new ByteBuffer[arrayList.size() + 2];
        long jC = c() - 8;
        int i = 0;
        byteBufferArr[0] = (ByteBuffer) ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(jC).flip();
        int size = arrayList.size();
        int i2 = 1;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            byteBufferArr[i2] = ByteBuffer.wrap((byte[]) ((wc2) obj).b.a);
            i2++;
        }
        byteBufferArr[i2] = (ByteBuffer) ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN).putLong(jC).putLong(2334950737559900225L).putLong(3617552046287187010L).flip();
        return byteBufferArr;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final xc2 clone() {
        xc2 xc2Var = new xc2(this.a);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wc2 wc2Var = (wc2) obj;
            xc2Var.b.add(new wc2(wc2Var.a, wc2Var.b));
        }
        return xc2Var;
    }
}
