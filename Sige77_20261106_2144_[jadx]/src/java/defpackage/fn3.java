package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fn3 extends gm3 implements mm3 {
    public static final nc0 i = new nc0(7);
    public final Exception f;

    public fn3(UUID uuid, String str, Exception exc, zn3 zn3Var) {
        super("<missing root>", uuid, str, zn3Var);
        this.f = exc;
    }

    @Override // defpackage.bo3
    public final bo3 E(String str, sn3 sn3Var, zn3 zn3Var) {
        AtomicReference atomicReference = vm3.a;
        return y(str, sn3Var, true, zn3Var);
    }

    @Override // defpackage.mm3
    public final hn3 y(String str, sn3 sn3Var, boolean z, zn3 zn3Var) {
        if (z) {
            AtomicReference atomicReference = vm3.a;
        }
        return new hn3(str, this, sn3Var, z, zn3Var);
    }

    @Override // defpackage.mm3
    public final Exception zzf() {
        return this.f;
    }

    @Override // defpackage.bo3
    public final sn3 zzh() {
        return rn3.e;
    }
}
