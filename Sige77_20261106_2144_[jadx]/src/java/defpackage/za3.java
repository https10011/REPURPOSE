package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class za3 extends dm2 {
    private static final za3 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        za3 za3Var = new za3();
        zzg = za3Var;
        dm2.o(za3.class, za3Var);
    }

    public static wa3 t() {
        return (wa3) zzg.j();
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new za3();
        }
        if (i2 == 4) {
            return new wa3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzh;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (za3.class) {
            try {
                cm2Var = zzh;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzg);
                    zzh = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final /* synthetic */ void u(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i) {
        if (i == 1) {
            e.g("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }
}
