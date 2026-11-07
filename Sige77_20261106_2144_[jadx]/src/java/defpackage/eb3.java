package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eb3 extends dm2 {
    private static final eb3 zzl;
    private static volatile rn2 zzm;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private hl2 zzf = hl2.b;
    private String zzg = BuildConfig.FLAVOR;
    private um2 zzh;
    private um2 zzi;
    private boolean zzj;
    private long zzk;

    static {
        eb3 eb3Var = new eb3();
        zzl = eb3Var;
        dm2.o(eb3.class, eb3Var);
    }

    public eb3() {
        vn2 vn2Var = vn2.e;
        this.zzh = vn2Var;
        this.zzi = vn2Var;
    }

    public static cb3 z() {
        return (cb3) zzl.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void B(gl2 gl2Var) {
        gl2Var.getClass();
        this.zzb |= 2;
        this.zzf = gl2Var;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void D(ib3 ib3Var) {
        um2 um2Var = this.zzh;
        if (!((xk2) um2Var).a) {
            this.zzh = ck1.v(um2Var);
        }
        this.zzh.add(ib3Var);
    }

    public final void E(String str) {
        str.getClass();
        um2 um2Var = this.zzi;
        if (!((xk2) um2Var).a) {
            this.zzi = ck1.v(um2Var);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", ib3.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new eb3();
        }
        if (i2 == 4) {
            return new cb3(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzm;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (eb3.class) {
            try {
                cm2Var = zzm;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzl);
                    zzm = cm2Var;
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

    public final hl2 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final um2 x() {
        return this.zzh;
    }

    public final long y() {
        return this.zzk;
    }
}
