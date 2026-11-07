package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z03 extends dm2 {
    private static final z03 zzi;
    private static volatile rn2 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = BuildConfig.FLAVOR;
    private um2 zzh = vn2.e;

    static {
        z03 z03Var = new z03();
        zzi = z03Var;
        dm2.o(z03.class, z03Var);
    }

    public static z03 A() {
        return zzi;
    }

    public final int B() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                i = 3;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                i = 4;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                i = 5;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                i = 6;
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.dm2
    public final Object s(int i) {
        rn2 cm2Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wn2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", qk2.d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new z03();
        }
        if (i2 == 4) {
            return new s03(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        rn2 rn2Var = zzj;
        if (rn2Var != null) {
            return rn2Var;
        }
        synchronized (z03.class) {
            try {
                cm2Var = zzj;
                if (cm2Var == null) {
                    cm2Var = new cm2(zzi);
                    zzj = cm2Var;
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

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final um2 y() {
        return this.zzh;
    }

    public final int z() {
        return this.zzh.size();
    }
}
