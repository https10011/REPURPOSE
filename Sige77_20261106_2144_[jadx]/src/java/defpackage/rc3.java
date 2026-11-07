package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rc3 extends dm2 {
    private static final rc3 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private ic3 zze;
    private kc3 zzf;

    static {
        rc3 rc3Var = new rc3();
        zzg = rc3Var;
        dm2.o(rc3.class, rc3Var);
    }

    public static rc3 v(byte[] bArr, vl2 vl2Var) {
        return (rc3) dm2.e(zzg, bArr, vl2Var);
    }

    public static pc3 w() {
        return (pc3) zzg.j();
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new rc3();
        }
        if (i2 == 4) {
            return new pc3(zzg);
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
        synchronized (rc3.class) {
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

    public final ic3 t() {
        ic3 ic3Var = this.zze;
        return ic3Var == null ? ic3.H() : ic3Var;
    }

    public final kc3 u() {
        kc3 kc3Var = this.zzf;
        return kc3Var == null ? kc3.t() : kc3Var;
    }

    public final /* synthetic */ void x(ic3 ic3Var) {
        this.zze = ic3Var;
        this.zzb |= 1;
    }
}
