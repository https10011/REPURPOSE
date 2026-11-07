package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hn3 extends om3 implements mm3 {
    public final Exception i;
    public final boolean v;

    /* JADX WARN: Multi-variable type inference failed */
    public hn3(String str, mm3 mm3Var, sn3 sn3Var, boolean z, zn3 zn3Var) {
        super("<missing root>:".concat(str), (gm3) mm3Var, sn3.a(sn3Var, rn3.f), zn3Var);
        this.i = mm3Var.zzf();
        this.v = z;
    }

    @Override // defpackage.bo3
    public final bo3 E(String str, sn3 sn3Var, zn3 zn3Var) {
        AtomicReference atomicReference = vm3.a;
        return y(str, sn3Var, true, zn3Var);
    }

    @Override // defpackage.mm3
    public final hn3 y(String str, sn3 sn3Var, boolean z, zn3 zn3Var) {
        boolean z2 = this.v;
        if (z && !z2) {
            AtomicReference atomicReference = vm3.a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new hn3(str, this, sn3Var, z3, zn3Var);
    }

    @Override // defpackage.mm3
    public final Exception zzf() {
        return this.i;
    }

    @Override // defpackage.bo3
    public final sn3 zzl() {
        return rn3.e;
    }

    public hn3(UUID uuid, String str, String str2, sn3 sn3Var, Exception exc, zn3 zn3Var) {
        super("<missing root>:".concat(str2), uuid, str, sn3.a(sn3Var, rn3.f), zn3Var);
        this.i = exc;
        this.v = false;
    }
}
