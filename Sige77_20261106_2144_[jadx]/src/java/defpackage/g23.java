package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g23 extends dm2 {
    private static final g23 zzi;
    private static volatile rn2 zzj;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        g23 g23Var = new g23();
        zzi = g23Var;
        dm2.o(g23.class, g23Var);
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new g23();
        }
        if (i2 == 4) {
            return new d23(zzi);
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
        synchronized (g23.class) {
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

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final int z() {
        return this.zzh;
    }
}
