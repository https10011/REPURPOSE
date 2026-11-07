package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mp3 extends cs2 {
    private static final mp3 zzc;
    private static volatile ys2 zzd;
    private int zze;
    private int zzf;
    private vp3 zzg;
    private jr2 zzh = jr2.b;

    static {
        mp3 mp3Var = new mp3();
        zzc = mp3Var;
        cs2.j(mp3.class, mp3Var);
    }

    public static mp3 u(jr2 jr2Var, wr2 wr2Var) {
        return (mp3) cs2.h(zzc, jr2Var, wr2Var);
    }

    public static /* synthetic */ void v(mp3 mp3Var, nr2 nr2Var) {
        nr2Var.getClass();
        mp3Var.zzh = nr2Var;
    }

    public static /* synthetic */ void w(mp3 mp3Var, vp3 vp3Var) {
        mp3Var.zzg = vp3Var;
        mp3Var.zze |= 1;
    }

    public static kp3 x() {
        return (kp3) zzc.o();
    }

    @Override // defpackage.cs2
    public final Object d(int i) {
        ys2 as2Var;
        switch (op3.a[i - 1]) {
            case 1:
                return new mp3();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new kp3(zzc);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new bt2(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return zzc;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ys2 ys2Var = zzd;
                if (ys2Var != null) {
                    return ys2Var;
                }
                synchronized (mp3.class) {
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

    public final int t() {
        return this.zzf;
    }

    public final vp3 y() {
        vp3 vp3Var = this.zzg;
        return vp3Var == null ? vp3.w() : vp3Var;
    }

    public final jr2 z() {
        return this.zzh;
    }
}
