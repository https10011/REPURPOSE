package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kc3 extends dm2 {
    private static final kc3 zzo;
    private static volatile rn2 zzp;
    private int zzb;
    private boolean zzf;
    private um2 zzh;
    private um2 zzi;
    private om2 zzj;
    private oc3 zzk;
    private boolean zzl;
    private boolean zzm;
    private fc3 zzn;
    private hl2 zze = hl2.b;
    private String zzg = BuildConfig.FLAVOR;

    static {
        kc3 kc3Var = new kc3();
        zzo = kc3Var;
        dm2.o(kc3.class, kc3Var);
    }

    public kc3() {
        vn2 vn2Var = vn2.e;
        this.zzh = vn2Var;
        this.zzi = vn2Var;
        this.zzj = fm2.e;
    }

    public static kc3 t() {
        return zzo;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", qk2.b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new kc3();
        }
        if (i2 == 4) {
            return new s03(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzp;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (kc3.class) {
            try {
                cm2Var = zzp;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzo);
                    zzp = cm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cm2Var;
    }
}
