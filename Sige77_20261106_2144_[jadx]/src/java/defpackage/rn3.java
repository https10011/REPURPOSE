package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rn3 extends sn3 {
    public static final sn3 e;
    public static final sn3 f;

    static {
        sn3 sn3VarB = new rn3(null, new wq1(0)).b();
        e = sn3VarB;
        rn3 rn3Var = new rn3(sn3VarB, new wq1(0));
        boolean z = !rn3Var.c;
        Boolean bool = Boolean.TRUE;
        yv2.o("Can't mutate after handing to trace", z);
        yv2.o("Key already present", !rn3Var.c());
        rn3Var.b.put(sn3.d, bool);
        f = rn3Var.b();
    }
}
