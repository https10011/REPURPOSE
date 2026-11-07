package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kn3 extends om3 {
    public static final kn3 i;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        i = new kn3("<skip trace>", uuidRandomUUID, gm3.a(uuidRandomUUID), rn3.e, vm3.c());
    }

    @Override // defpackage.bo3
    public final bo3 E(String str, sn3 sn3Var, zn3 zn3Var) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.bo3
    public final sn3 zzl() {
        return rn3.e;
    }
}
