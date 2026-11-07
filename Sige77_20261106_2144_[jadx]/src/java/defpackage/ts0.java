package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ts0 extends l02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l02 b;
    public final /* synthetic */ l02 c;

    public /* synthetic */ ts0(l02 l02Var, l02 l02Var2, int i) {
        this.a = i;
        this.b = l02Var;
        this.c = l02Var2;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        int i = this.a;
        l02 l02Var = this.c;
        l02 l02Var2 = this.b;
        Serializable serializableE = null;
        switch (i) {
            case 0:
                au0Var.b();
                LocalTime localTimeZ = null;
                while (au0Var.R() != 4) {
                    String strB = au0Var.B();
                    if (strB.equals("date")) {
                        serializableE = ss0.e(l02Var2.b(au0Var));
                    } else if (strB.equals("time")) {
                        localTimeZ = ss0.z(l02Var.b(au0Var));
                    } else {
                        au0Var.X();
                    }
                }
                au0Var.l();
                qs0.a(serializableE, "date", au0Var);
                LocalDate localDateI = ps0.i(serializableE);
                qs0.a(localTimeZ, "time", au0Var);
                return LocalDateTime.of(localDateI, ss0.i(localTimeZ));
            default:
                au0Var.b();
                ZoneOffset zoneOffsetN = null;
                while (au0Var.R() != 4) {
                    String strB2 = au0Var.B();
                    if (strB2.equals("offset")) {
                        zoneOffsetN = ps0.n(l02Var.b(au0Var));
                    } else if (strB2.equals("time")) {
                        serializableE = ss0.z(l02Var2.b(au0Var));
                    } else {
                        au0Var.X();
                    }
                }
                au0Var.l();
                qs0.a(serializableE, "time", au0Var);
                LocalTime localTimeI = ss0.i(serializableE);
                qs0.a(zoneOffsetN, "offset", au0Var);
                return OffsetTime.of(localTimeI, ps0.v(zoneOffsetN));
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        int i = this.a;
        l02 l02Var = this.c;
        l02 l02Var2 = this.b;
        switch (i) {
            case 0:
                LocalDateTime localDateTimeJ = ps0.j(obj);
                eu0Var.e();
                eu0Var.m("date");
                l02Var2.c(eu0Var, localDateTimeJ.toLocalDate());
                eu0Var.m("time");
                l02Var.c(eu0Var, localDateTimeJ.toLocalTime());
                eu0Var.l();
                break;
            default:
                OffsetTime offsetTimeP = ss0.p(obj);
                eu0Var.e();
                eu0Var.m("time");
                l02Var2.c(eu0Var, offsetTimeP.toLocalTime());
                eu0Var.m("offset");
                l02Var.c(eu0Var, offsetTimeP.getOffset());
                eu0Var.l();
                break;
        }
    }
}
