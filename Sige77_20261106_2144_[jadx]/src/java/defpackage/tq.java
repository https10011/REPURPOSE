package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class tq {
    public static final vy2 a = new vy2("CLOSED", 4);

    public static final Object a(zn1 zn1Var, long j, Function2 function2) {
        while (true) {
            if (zn1Var.e >= j && !zn1Var.g()) {
                return zn1Var;
            }
            Object objE = zn1Var.e();
            vy2 vy2Var = a;
            if (objE == vy2Var) {
                return vy2Var;
            }
            zn1 zn1Var2 = (zn1) ((uq) objE);
            if (zn1Var2 == null) {
                zn1Var2 = (zn1) function2.invoke(Long.valueOf(zn1Var.e + 1), zn1Var);
                if (zn1Var.j(zn1Var2)) {
                    if (zn1Var.g()) {
                        zn1Var.i();
                    }
                }
            }
            zn1Var = zn1Var2;
        }
    }
}
