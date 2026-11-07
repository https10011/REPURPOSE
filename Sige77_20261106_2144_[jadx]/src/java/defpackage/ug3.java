package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ug3 extends dm2 {
    private static final ug3 zzj;
    private static volatile rn2 zzk;
    private int zzb;
    private long zzh;
    private String zze = BuildConfig.FLAVOR;
    private hl2 zzf = hl2.b;
    private String zzg = BuildConfig.FLAVOR;
    private um2 zzi = vn2.e;

    static {
        ug3 ug3Var = new ug3();
        zzj = ug3Var;
        dm2.o(ug3.class, ug3Var);
    }

    public static ug3 A() {
        return zzj;
    }

    public static sg3 z() {
        return (sg3) zzj.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(hl2 hl2Var) {
        hl2Var.getClass();
        this.zzb |= 2;
        this.zzf = hl2Var;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void F(wg3 wg3Var) {
        um2 um2Var = this.zzi;
        if (!((xk2) um2Var).a) {
            this.zzi = ck1.v(um2Var);
        }
        this.zzi.add(wg3Var);
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", wg3.class});
        }
        if (i2 == 3) {
            return new ug3();
        }
        if (i2 == 4) {
            return new sg3(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzk;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (ug3.class) {
            try {
                cm2Var = zzk;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzj);
                    zzk = cm2Var;
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

    public final hl2 u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final um2 x() {
        return this.zzi;
    }

    public final int y() {
        return this.zzi.size();
    }
}
