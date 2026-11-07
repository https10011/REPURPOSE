package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e43 extends dm2 {
    private static final e43 zzi;
    private static volatile rn2 zzj;
    private int zzb;
    private int zze;
    private i63 zzf;
    private i63 zzg;
    private boolean zzh;

    static {
        e43 e43Var = new e43();
        zzi = e43Var;
        dm2.o(e43.class, e43Var);
    }

    public static d43 A() {
        return (d43) zzi.j();
    }

    public final /* synthetic */ void B(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void C(i63 i63Var) {
        this.zzf = i63Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void D(i63 i63Var) {
        this.zzg = i63Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new e43();
        }
        if (i2 == 4) {
            return new d43(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzj;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (e43.class) {
            try {
                cm2Var = zzj;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzi);
                    zzj = cm2Var;
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

    public final i63 v() {
        i63 i63Var = this.zzf;
        return i63Var == null ? i63.C() : i63Var;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final i63 x() {
        i63 i63Var = this.zzg;
        return i63Var == null ? i63.C() : i63Var;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final boolean z() {
        return this.zzh;
    }
}
