package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class vs1 implements m02 {
    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        if (s12Var.a != Timestamp.class) {
            return null;
        }
        uk0Var.getClass();
        return new ws1(uk0Var.b(new s12(Date.class)));
    }
}
