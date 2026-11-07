package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l23 extends dm2 {
    private static final l23 zzw;
    private static volatile rn2 zzx;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private um2 zzh;
    private um2 zzi;
    private um2 zzj;
    private String zzk;
    private boolean zzl;
    private um2 zzm;
    private um2 zzn;
    private String zzo;
    private String zzp;
    private x13 zzq;
    private s23 zzr;
    private e33 zzs;
    private w23 zzt;
    private o23 zzu;
    private om2 zzv;

    static {
        l23 l23Var = new l23();
        zzw = l23Var;
        dm2.o(l23.class, l23Var);
    }

    public l23() {
        vn2 vn2Var = vn2.e;
        this.zzh = vn2Var;
        this.zzi = vn2Var;
        this.zzj = vn2Var;
        this.zzk = BuildConfig.FLAVOR;
        this.zzm = vn2Var;
        this.zzn = vn2Var;
        this.zzo = BuildConfig.FLAVOR;
        this.zzp = BuildConfig.FLAVOR;
        this.zzv = fm2.e;
    }

    public static i23 K() {
        return (i23) zzw.j();
    }

    public static l23 L() {
        return zzw;
    }

    public final List A() {
        return this.zzj;
    }

    public final um2 B() {
        return this.zzm;
    }

    public final int C() {
        return this.zzm.size();
    }

    public final um2 D() {
        return this.zzn;
    }

    public final String E() {
        return this.zzo;
    }

    public final boolean F() {
        return (this.zzb & 128) != 0;
    }

    public final x13 G() {
        x13 x13Var = this.zzq;
        return x13Var == null ? x13.z() : x13Var;
    }

    public final boolean H() {
        return (this.zzb & 512) != 0;
    }

    public final e33 I() {
        e33 e33Var = this.zzs;
        return e33Var == null ? e33.v() : e33Var;
    }

    public final om2 J() {
        return this.zzv;
    }

    public final void M(int i, g23 g23Var) {
        um2 um2Var = this.zzi;
        if (!((xk2) um2Var).a) {
            this.zzi = ck1.v(um2Var);
        }
        this.zzi.set(i, g23Var);
    }

    public final void N() {
        this.zzj = vn2.e;
    }

    public final void O() {
        this.zzm = vn2.e;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", a33.class, "zzi", g23.class, "zzj", k03.class, "zzk", "zzl", "zzm", e73.class, "zzn", b23.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new l23();
        }
        if (i2 == 4) {
            return new i23(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzx;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (l23.class) {
            try {
                cm2Var = zzx;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzw);
                    zzx = cm2Var;
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

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final um2 x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final g23 z(int i) {
        return (g23) this.zzi.get(i);
    }
}
