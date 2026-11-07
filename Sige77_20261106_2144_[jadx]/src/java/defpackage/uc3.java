package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uc3 extends dm2 {
    private static final uc3 zzg;
    private static volatile rn2 zzh;
    private int zzb;
    private um2 zze = vn2.e;
    private String zzf = BuildConfig.FLAVOR;

    static {
        uc3 uc3Var = new uc3();
        zzg = uc3Var;
        dm2.o(uc3.class, uc3Var);
    }

    public static uc3 u() {
        return zzg;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new uc3();
        }
        if (i2 == 4) {
            return new tc3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzh;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (uc3.class) {
            try {
                cm2Var = zzh;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzg);
                    zzh = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }

    public final List t() {
        return this.zze;
    }

    public final void v(String str) {
        um2 um2Var = this.zze;
        if (!((xk2) um2Var).a) {
            this.zze = ck1.v(um2Var);
        }
        this.zze.add(BuildConfig.FLAVOR);
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 1;
        this.zzf = BuildConfig.FLAVOR;
    }
}
