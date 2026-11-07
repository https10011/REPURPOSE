package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ui3 extends cs2 {
    private static final ui3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private cj3 zzf;
    private fm3 zzg;

    static {
        ui3 ui3Var = new ui3();
        zzc = ui3Var;
        cs2.j(ui3.class, ui3Var);
    }

    public static si3 t() {
        return (si3) zzc.o();
    }

    public static ui3 u(jr2 jr2Var, wr2 wr2Var) {
        return (ui3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(ui3 ui3Var, cj3 cj3Var) {
        ui3Var.zzf = cj3Var;
        ui3Var.zze |= 1;
    }

    public static /* synthetic */ void w(ui3 ui3Var, fm3 fm3Var) {
        ui3Var.zzg = fm3Var;
        ui3Var.zze |= 2;
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (ri3.a[i - 1]) {
            case 1:
                return new ui3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new si3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (ui3.class) {
                    try {
                        as2Var = zzd;
                        if (as2Var == null) {
                            as2Var = new as2();
                            zzd = as2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return as2Var;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final cj3 x() {
        cj3 cj3Var = this.zzf;
        return cj3Var == null ? cj3.x() : cj3Var;
    }

    public final fm3 y() {
        fm3 fm3Var = this.zzg;
        return fm3Var == null ? fm3.z() : fm3Var;
    }
}
