package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s33 extends dm2 {
    private static final s33 zzp;
    private static volatile rn2 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private gn2 zzm;
    private gn2 zzn;
    private String zzo;

    static {
        s33 s33Var = new s33();
        zzp = s33Var;
        dm2.o(s33.class, s33Var);
    }

    public s33() {
        gn2 gn2Var = gn2.b;
        this.zzm = gn2Var;
        this.zzn = gn2Var;
        this.zze = BuildConfig.FLAVOR;
        this.zzf = BuildConfig.FLAVOR;
        this.zzg = BuildConfig.FLAVOR;
        this.zzi = BuildConfig.FLAVOR;
        this.zzj = BuildConfig.FLAVOR;
        this.zzk = BuildConfig.FLAVOR;
        this.zzo = BuildConfig.FLAVOR;
    }

    public static k33 Y() {
        return (k33) zzp.j();
    }

    public static s33 Z() {
        return zzp;
    }

    public final /* synthetic */ void A() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    public final gn2 C() {
        gn2 gn2Var = this.zzm;
        if (!gn2Var.a) {
            this.zzm = gn2Var.c();
        }
        return this.zzm;
    }

    public final gn2 D() {
        gn2 gn2Var = this.zzn;
        if (!gn2Var.a) {
            this.zzn = gn2Var.c();
        }
        return this.zzn;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean G() {
        return (this.zzb & 1) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 2) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 8) != 0;
    }

    public final long N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zzb & 16) != 0;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        return (this.zzb & 32) != 0;
    }

    public final String R() {
        return this.zzj;
    }

    public final boolean S() {
        return (this.zzb & 64) != 0;
    }

    public final String T() {
        return this.zzk;
    }

    public final boolean U() {
        return (this.zzb & 128) != 0;
    }

    public final long V() {
        return this.zzl;
    }

    public final boolean W() {
        return (this.zzb & 256) != 0;
    }

    public final String X() {
        return this.zzo;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void d0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void e0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", l33.a, "zzn", n33.a, "zzo"});
        }
        if (i2 == 3) {
            return new s33();
        }
        if (i2 == 4) {
            return new k33(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzq;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (s33.class) {
            try {
                cm2Var = zzq;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzp);
                    zzq = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final /* synthetic */ void t() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }
}
