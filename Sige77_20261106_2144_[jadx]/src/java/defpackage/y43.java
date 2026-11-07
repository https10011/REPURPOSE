package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class y43 implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static y43 d(byte... bArr) {
        bArr.getClass();
        e53 e53Var = new e53(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return g93.L(e53Var);
        } finally {
            try {
                e53Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final y43 b(Class cls) throws v43 {
        if (cls.isInstance(this)) {
            return (y43) cls.cast(this);
        }
        throw new v43("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    public abstract int zza();
}
