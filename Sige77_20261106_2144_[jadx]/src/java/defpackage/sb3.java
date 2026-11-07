package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sb3 extends dm2 {
    private static final sb3 zzj;
    private static volatile rn2 zzk;
    private int zzb;
    private long zzh;
    private gn2 zzi = gn2.b;
    private String zze = BuildConfig.FLAVOR;
    private hl2 zzf = hl2.b;
    private String zzg = BuildConfig.FLAVOR;

    static {
        sb3 sb3Var = new sb3();
        zzj = sb3Var;
        dm2.o(sb3.class, sb3Var);
    }

    public static sb3 A() {
        return zzj;
    }

    public static sb3 z(ll2 ll2Var, vl2 vl2Var) throws xm2 {
        dm2 dm2VarI = zzj.i();
        try {
            yn2 yn2VarA = un2.c.a(dm2VarI.getClass());
            we weVar = ll2Var.c;
            if (weVar == null) {
                weVar = new we(ll2Var);
            }
            yn2VarA.e(dm2VarI, weVar, vl2Var);
            yn2VarA.f(dm2VarI);
            dm2.r(dm2VarI);
            return (sb3) dm2VarI;
        } catch (eo2 e) {
            throw e.a();
        } catch (xm2 e2) {
            if (e2.a) {
                throw new xm2(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof xm2) {
                throw ((xm2) e3.getCause());
            }
            throw new xm2(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof xm2) {
                throw ((xm2) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", qb3.a});
        }
        if (i2 == 3) {
            return new sb3();
        }
        if (i2 == 4) {
            return new s03(zzj);
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
        synchronized (sb3.class) {
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

    public final int x() {
        return this.zzi.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
