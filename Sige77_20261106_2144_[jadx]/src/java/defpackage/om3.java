package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class om3 extends gm3 {
    public final sn3 f;

    public om3(String str, gm3 gm3Var, sn3 sn3Var, zn3 zn3Var) {
        super(str, gm3Var, zn3Var);
        yv2.h(sn3Var.c);
        this.f = sn3Var;
    }

    @Override // defpackage.bo3
    public final sn3 zzh() {
        return sn3.a(this.f, zzl());
    }

    public om3(String str, UUID uuid, String str2, sn3 sn3Var, zn3 zn3Var) {
        super(str, uuid, str2, zn3Var);
        yv2.h(sn3Var.c);
        this.f = sn3Var;
    }
}
