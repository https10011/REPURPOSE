package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z43 extends dm2 {
    private static final z43 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        z43 z43Var = new z43();
        zzg = z43Var;
        dm2.o(z43.class, z43Var);
    }

    public static w43 x() {
        return (w43) zzg.j();
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new z43();
        }
        if (i2 == 4) {
            return new w43(zzg);
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
        synchronized (z43.class) {
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

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final int u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final long w() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }
}
