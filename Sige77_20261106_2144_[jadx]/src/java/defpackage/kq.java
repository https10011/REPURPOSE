package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface kq {
    default Object a(Class cls) {
        return g(je1.a(cls));
    }

    zd1 b(je1 je1Var);

    default Set c(je1 je1Var) {
        return (Set) b(je1Var).get();
    }

    default zd1 e(Class cls) {
        return f(je1.a(cls));
    }

    zd1 f(je1 je1Var);

    default Object g(je1 je1Var) {
        zd1 zd1VarF = f(je1Var);
        if (zd1VarF == null) {
            return null;
        }
        return zd1VarF.get();
    }
}
