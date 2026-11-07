package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jj2 {
    public static final kj2 a;

    static {
        kj2 kj2Var;
        try {
            kj2Var = pj2.a;
        } catch (NoClassDefFoundError unused) {
            kj2Var = null;
        }
        if (kj2Var == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = kj2.a[i];
                try {
                    kj2Var = (kj2) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = kj2Var;
    }
}
