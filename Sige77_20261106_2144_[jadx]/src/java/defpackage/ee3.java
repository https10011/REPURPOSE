package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ee3 implements Comparable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(ee3.class, Object.class, "b");
    public static final /* synthetic */ long d = fe3.a.objectFieldOffset(ee3.class.getDeclaredField("b"));
    public final String a;
    public volatile Object b;

    public /* synthetic */ ee3(byte[] bArr, String str) {
        this.a = str;
        this.b = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        ee3 ee3Var;
        int i = 0;
        while (true) {
            Object obj = this.b;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = fe3.a;
                long j = d;
                ee3Var = this;
                if (unsafe.compareAndSwapObject(ee3Var, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(ee3Var, j) != obj) {
                    break;
                } else {
                    this = ee3Var;
                }
            }
            this = ee3Var;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
