package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d53 extends dm2 {
    private static final d53 zzm;
    private static volatile rn2 zzn;
    private int zzb;
    private um2 zze = vn2.e;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        d53 d53Var = new d53();
        zzm = d53Var;
        dm2.o(d53.class, d53Var);
    }

    public static b53 J() {
        return (b53) zzm.j();
    }

    public final long A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final int E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zzb & 32) != 0;
    }

    public final long G() {
        return this.zzk;
    }

    public final boolean H() {
        return (this.zzb & 64) != 0;
    }

    public final long I() {
        return this.zzl;
    }

    public final /* synthetic */ void K(int i, l53 l53Var) {
        u();
        this.zze.set(i, l53Var);
    }

    public final /* synthetic */ void L(l53 l53Var) {
        l53Var.getClass();
        u();
        this.zze.add(l53Var);
    }

    public final /* synthetic */ void M(Iterable iterable) {
        u();
        wk2.d(iterable, this.zze);
    }

    public final void N() {
        this.zze = vn2.e;
    }

    public final /* synthetic */ void O(int i) {
        u();
        this.zze.remove(i);
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zzb |= 32;
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
            return new wn2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", l53.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new d53();
        }
        if (i2 == 4) {
            return new b53(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzn;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (d53.class) {
            try {
                cm2Var = zzn;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzm);
                    zzn = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final /* synthetic */ void t(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void u() {
        um2 um2Var = this.zze;
        if (((xk2) um2Var).a) {
            return;
        }
        this.zze = ck1.v(um2Var);
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final l53 x(int i) {
        return (l53) this.zze.get(i);
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
