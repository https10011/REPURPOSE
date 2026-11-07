package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u63 extends dm2 {
    private static final u63 zzk;
    private static volatile rn2 zzl;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        u63 u63Var = new u63();
        zzk = u63Var;
        dm2.o(u63.class, u63Var);
    }

    public static s63 E() {
        return (s63) zzk.j();
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final float B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zzb & 32) != 0;
    }

    public final double D() {
        return this.zzj;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void L(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new u63();
        }
        if (i2 == 4) {
            return new s63(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzl;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (u63.class) {
            try {
                cm2Var = zzl;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzk);
                    zzl = cm2Var;
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

    public final long u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final long z() {
        return this.zzh;
    }
}
