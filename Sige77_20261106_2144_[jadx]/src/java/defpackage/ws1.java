package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ws1 extends l02 {
    public static final vs1 b = new vs1();
    public final l02 a;

    public ws1(l02 l02Var) {
        this.a = l02Var;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) {
        Date date = (Date) this.a.b(au0Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) {
        this.a.c(eu0Var, (Timestamp) obj);
    }
}
