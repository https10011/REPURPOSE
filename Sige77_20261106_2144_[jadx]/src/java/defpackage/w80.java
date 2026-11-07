package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w80 {
    public static volatile w80 b;
    public static final w80 c = new w80();
    public final Map a = Collections.EMPTY_MAP;

    public static w80 a() {
        w80 w80Var;
        td1 td1Var = td1.c;
        w80 w80Var2 = b;
        if (w80Var2 != null) {
            return w80Var2;
        }
        synchronized (w80.class) {
            try {
                w80Var = b;
                if (w80Var == null) {
                    Class cls = v80.a;
                    w80 w80Var3 = null;
                    if (cls != null) {
                        try {
                            w80Var3 = (w80) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    w80Var = w80Var3 != null ? w80Var3 : c;
                    b = w80Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w80Var;
    }
}
