package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class th3 extends zi0 {
    public final qh3 f;
    public final ox1 g;

    public th3(qh3 qh3Var, ox1 ox1Var) {
        this.f = qh3Var;
        this.g = ox1Var;
    }

    public static th3 H(qh3 qh3Var, ox1 ox1Var) throws GeneralSecurityException {
        if (qh3Var.a == ((tr3) ox1Var.a).a.length) {
            return new th3(qh3Var, ox1Var);
        }
        tv2.f("Key size mismatch");
        return null;
    }

    @Override // defpackage.zi0
    public final dx2 E() {
        return this.f;
    }

    @Override // defpackage.zi0
    public final Integer F() {
        return null;
    }
}
