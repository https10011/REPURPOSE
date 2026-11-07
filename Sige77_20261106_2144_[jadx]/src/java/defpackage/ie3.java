package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ie3 {
    public static final ie3 b;
    public final HashMap a = new HashMap();

    static {
        sy2 sy2Var = new sy2(12);
        ie3 ie3Var = new ie3();
        try {
            ie3Var.b(sy2Var, xd3.class);
            b = ie3Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zi0 a(dx2 dx2Var, Integer num) {
        zi0 zi0VarA;
        synchronized (this) {
            sy2 sy2Var = (sy2) this.a.get(dx2Var.getClass());
            if (sy2Var == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(dx2Var) + ": no key creator for this class was registered.");
            }
            zi0VarA = sy2Var.a(dx2Var, num);
        }
        return zi0VarA;
    }

    public final synchronized void b(sy2 sy2Var, Class cls) {
        try {
            sy2 sy2Var2 = (sy2) this.a.get(cls);
            if (sy2Var2 != null && !sy2Var2.equals(sy2Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.a.put(cls, sy2Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
