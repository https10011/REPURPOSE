package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vl2 {
    public static volatile vl2 b;
    public static final vl2 c = new vl2();
    public final Map a = Collections.EMPTY_MAP;

    public static vl2 a() {
        vl2 vl2Var = b;
        if (vl2Var != null) {
            return vl2Var;
        }
        synchronized (vl2.class) {
            try {
                vl2 vl2Var2 = b;
                if (vl2Var2 != null) {
                    return vl2Var2;
                }
                int i = yk2.a;
                vl2 vl2VarH0 = am2.h0();
                b = vl2VarH0;
                return vl2VarH0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
