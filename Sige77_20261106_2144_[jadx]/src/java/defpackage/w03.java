package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w03 extends dm2 {
    private static final w03 zzk;
    private static volatile rn2 zzl;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private q03 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        w03 w03Var = new w03();
        zzk = w03Var;
        dm2.o(w03.class, w03Var);
    }

    public static v03 B() {
        return (v03) zzk.j();
    }

    public final boolean A() {
        return this.zzj;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new w03();
        }
        if (i2 == 4) {
            return new v03(zzk);
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
        synchronized (w03.class) {
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

    public final int u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final q03 w() {
        q03 q03Var = this.zzg;
        return q03Var == null ? q03.B() : q03Var;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzb & 32) != 0;
    }
}
