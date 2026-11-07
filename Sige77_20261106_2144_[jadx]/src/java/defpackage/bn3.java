package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bn3 extends cs2 {
    private static final bn3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        bn3 bn3Var = new bn3();
        zzc = bn3Var;
        cs2.j(bn3.class, bn3Var);
    }

    public static bn3 A() {
        return zzc;
    }

    public static an3 z() {
        return (an3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (xm3.a[i - 1]) {
            case 1:
                return new bn3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new an3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (bn3.class) {
                    try {
                        as2Var = zzd;
                        if (as2Var == null) {
                            as2Var = new as2();
                            zzd = as2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return as2Var;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final nm3 t() {
        nm3 nm3Var;
        int i = this.zzg;
        if (i == 0) {
            nm3Var = nm3.AEAD_UNKNOWN;
        } else if (i == 1) {
            nm3Var = nm3.AES_128_GCM;
        } else if (i != 2) {
            nm3Var = i != 3 ? null : nm3.CHACHA20_POLY1305;
        } else {
            nm3Var = nm3.AES_256_GCM;
        }
        return nm3Var == null ? nm3.UNRECOGNIZED : nm3Var;
    }

    public final rm3 x() {
        rm3 rm3Var;
        int i = this.zzf;
        if (i == 0) {
            rm3Var = rm3.KDF_UNKNOWN;
        } else if (i == 1) {
            rm3Var = rm3.HKDF_SHA256;
        } else if (i != 2) {
            rm3Var = i != 3 ? null : rm3.HKDF_SHA512;
        } else {
            rm3Var = rm3.HKDF_SHA384;
        }
        return rm3Var == null ? rm3.UNRECOGNIZED : rm3Var;
    }

    public final qm3 y() {
        qm3 qm3Var;
        switch (this.zze) {
            case 0:
                qm3Var = qm3.KEM_UNKNOWN;
                break;
            case 1:
                qm3Var = qm3.DHKEM_X25519_HKDF_SHA256;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                qm3Var = qm3.DHKEM_P256_HKDF_SHA256;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                qm3Var = qm3.DHKEM_P384_HKDF_SHA384;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                qm3Var = qm3.DHKEM_P521_HKDF_SHA512;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                qm3Var = qm3.X_WING;
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                qm3Var = qm3.ML_KEM768;
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                qm3Var = qm3.ML_KEM1024;
                break;
            default:
                qm3Var = null;
                break;
        }
        return qm3Var == null ? qm3.UNRECOGNIZED : qm3Var;
    }
}
