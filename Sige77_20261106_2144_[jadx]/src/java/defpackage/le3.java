package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class le3 {
    public static final le3 b = new le3();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(uy2 uy2Var, Class cls) throws GeneralSecurityException {
        uy2 uy2Var2 = (uy2) this.a.putIfAbsent(cls, uy2Var);
        if (uy2Var2 == null || uy2Var2.equals(uy2Var)) {
            return;
        }
        tv2.f("Different key creator for parameters class already inserted");
    }
}
