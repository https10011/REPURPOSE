package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ic3 extends dm2 {
    private static final qm2 zzl = new sh1(22);
    private static final ic3 zzq;
    private static volatile rn2 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private um2 zzi;
    private um2 zzj;
    private om2 zzk;
    private oc3 zzm;
    private boolean zzn;
    private boolean zzo;
    private fc3 zzp;
    private hl2 zze = hl2.b;
    private String zzg = BuildConfig.FLAVOR;

    static {
        ic3 ic3Var = new ic3();
        zzq = ic3Var;
        dm2.o(ic3.class, ic3Var);
    }

    public ic3() {
        vn2 vn2Var = vn2.e;
        this.zzi = vn2Var;
        this.zzj = vn2Var;
        this.zzk = fm2.e;
    }

    public static hc3 G() {
        return (hc3) zzq.j();
    }

    public static ic3 H() {
        return zzq;
    }

    public final List A() {
        return new rm2(this.zzk, zzl);
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final oc3 C() {
        oc3 oc3Var = this.zzm;
        return oc3Var == null ? oc3.v() : oc3Var;
    }

    public final boolean D() {
        return this.zzn;
    }

    public final boolean E() {
        return this.zzo;
    }

    public final fc3 F() {
        fc3 fc3Var = this.zzp;
        return fc3Var == null ? fc3.u() : fc3Var;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", qk2.b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new ic3();
        }
        if (i2 == 4) {
            return new hc3(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzr;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (ic3.class) {
            try {
                cm2Var = zzr;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzq);
                    zzr = cm2Var;
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

    public final hl2 u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final um2 y() {
        return this.zzi;
    }

    public final um2 z() {
        return this.zzj;
    }
}
