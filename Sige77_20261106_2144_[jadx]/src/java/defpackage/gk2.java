package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gk2 extends sn {
    public final fk2 d;

    public gk2(jr3 jr3Var, int i, fk2 fk2Var) {
        super(jr3Var, i);
        this.d = fk2Var;
        StringBuilder sb = new StringBuilder("%");
        jr3Var.d(sb);
        sb.append(true != jr3Var.c() ? 't' : 'T');
        sb.append(fk2Var.a);
    }

    @Override // defpackage.sn
    public final void I(o50 o50Var, Object obj) {
        jr3 jr3Var = (jr3) this.c;
        StringBuilder sb = (StringBuilder) o50Var.g;
        boolean z = obj instanceof Date;
        fk2 fk2Var = this.d;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            jr3Var.d(sb2);
            sb2.append(true != jr3Var.c() ? 't' : 'T');
            sb2.append(fk2Var.a);
            sb.append(String.format(mr3.a, sb2.toString(), obj));
            return;
        }
        char c = fk2Var.a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 2);
        sb3.append("%t");
        sb3.append(c);
        o50.h(sb, obj, sb3.toString());
    }
}
