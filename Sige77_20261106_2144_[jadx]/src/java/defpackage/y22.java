package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class y22 {
    public static final Unsafe a;

    static {
        Field declaredField;
        try {
            try {
                declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            } catch (NoSuchFieldException unused) {
                declaredField = Unsafe.class.getDeclaredField("THE_ONE");
            }
            declaredField.setAccessible(true);
            a = (Unsafe) declaredField.get(null);
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
