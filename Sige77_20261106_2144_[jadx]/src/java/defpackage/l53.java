package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l53 extends dm2 {
    private static final l53 zzk;
    private static volatile rn2 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private um2 zzj = vn2.e;

    static {
        l53 l53Var = new l53();
        zzk = l53Var;
        dm2.o(l53.class, l53Var);
    }

    public static j53 F() {
        return (j53) zzk.j();
    }

    public final float A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final double C() {
        return this.zzi;
    }

    public final um2 D() {
        return this.zzj;
    }

    public final int E() {
        return this.zzj.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void L(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void N(l53 l53Var) {
        um2 um2Var = this.zzj;
        if (!((xk2) um2Var).a) {
            this.zzj = ck1.v(um2Var);
        }
        this.zzj.add(l53Var);
    }

    public final void O(ArrayList arrayList) {
        um2 um2Var = this.zzj;
        if (!((xk2) um2Var).a) {
            this.zzj = ck1.v(um2Var);
        }
        wk2.d(arrayList, this.zzj);
    }

    public final void P() {
        this.zzj = vn2.e;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", l53.class});
        }
        if (i2 == 3) {
            return new l53();
        }
        if (i2 == 4) {
            return new j53(zzk);
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
        synchronized (l53.class) {
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

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
