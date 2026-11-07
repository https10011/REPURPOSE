package com.google.android.recaptcha.internal;

import defpackage.ck1;
import defpackage.sm0;
import defpackage.uq1;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzpm {
    private static final zzpm zza = new zzpm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzpm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzpm zzc() {
        return zza;
    }

    public static zzpm zze(zzpm zzpmVar, zzpm zzpmVar2) {
        int i = zzpmVar.zzb + zzpmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzpmVar.zzc, i);
        System.arraycopy(zzpmVar2.zzc, 0, iArrCopyOf, zzpmVar.zzb, zzpmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzpmVar.zzd, i);
        System.arraycopy(zzpmVar2.zzd, 0, objArrCopyOf, zzpmVar.zzb, zzpmVar2.zzb);
        return new zzpm(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzpm zzf() {
        return new zzpm(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int i = this.zzb;
        if (i == zzpmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzpmVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzpmVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        zzle zzleVar = (zzle) this.zzd[i2];
                        int iZzA4 = zzln.zzA(i6);
                        int iZzd = zzleVar.zzd();
                        iZzA3 = zzln.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                    } else if (i5 == 3) {
                        int iZzA5 = zzln.zzA(i4 << 3);
                        iZzA = iZzA5 + iZzA5;
                        iZzB = ((zzpm) this.zzd[i2]).zza();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new zznm("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i2]).getClass();
                        iZzA2 = zzln.zzA(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i2]).getClass();
                    iZzA2 = zzln.zzA(i4 << 3) + 8;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzA = zzln.zzA(i7);
                iZzB = zzln.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iX = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzle zzleVar = (zzle) this.zzd[i2];
            int iZzA = zzln.zzA(8);
            int iZzA2 = zzln.zzA(i3) + zzln.zzA(16);
            int iZzA3 = zzln.zzA(24);
            int iZzd = zzleVar.zzd();
            iX += iZzA + iZzA + iZzA2 + ck1.x(iZzd, iZzd, iZzA3);
        }
        this.zze = iX;
        return iX;
    }

    public final zzpm zzd(zzpm zzpmVar) {
        if (zzpmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzpmVar.zzb;
        zzm(i);
        System.arraycopy(zzpmVar.zzc, 0, this.zzc, this.zzb, zzpmVar.zzb);
        System.arraycopy(zzpmVar.zzd, 0, this.zzd, this.zzb, zzpmVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        uq1.k();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzok.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzpy zzpyVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzpyVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzpy zzpyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzpyVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzpyVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzpyVar.zzd(i4, (zzle) obj);
                } else if (i3 == 3) {
                    zzpyVar.zzF(i4);
                    ((zzpm) obj).zzl(zzpyVar);
                    zzpyVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        sm0.n(new zznm("Protocol message tag had invalid wire type."));
                        return;
                    }
                    zzpyVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzpm() {
        this(0, new int[8], new Object[8], true);
    }
}
