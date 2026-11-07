package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rf3 extends dm2 {
    private static final rf3 zzl;
    private static volatile rn2 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = BuildConfig.FLAVOR;
    private um2 zzg = vn2.e;

    static {
        rf3 rf3Var = new rf3();
        zzl = rf3Var;
        dm2.o(rf3.class, rf3Var);
    }

    public static rf3 v(InputStream inputStream, vl2 vl2Var) throws xm2 {
        rf3 rf3Var = zzl;
        ll2 ll2VarH = ll2.h(inputStream, 4096);
        dm2 dm2VarI = rf3Var.i();
        try {
            yn2 yn2VarA = un2.c.a(dm2VarI.getClass());
            we weVar = ll2VarH.c;
            if (weVar == null) {
                weVar = new we(ll2VarH);
            }
            yn2VarA.e(dm2VarI, weVar, vl2Var);
            yn2VarA.f(dm2VarI);
            dm2.r(dm2VarI);
            return (rf3) dm2VarI;
        } catch (eo2 e) {
            throw e.a();
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof xm2) {
                throw ((xm2) e2.getCause());
            }
            throw e2;
        } catch (xm2 e3) {
            if (e3.a) {
                throw new xm2(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof xm2) {
                throw ((xm2) e4.getCause());
            }
            throw new xm2(e4.getMessage(), e4);
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
            return new wn2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", qk2.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new rf3();
        }
        if (i2 == 4) {
            return new s03(zzl);
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
        synchronized (rf3.class) {
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
        return this.zzf;
    }
}
