package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.bp;
import defpackage.cp;
import defpackage.fs;
import defpackage.ft;
import defpackage.g93;
import defpackage.qt;
import defpackage.uq1;
import defpackage.zi0;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private bp zzc = g93.a();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(Function1 function1, fs fsVar) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (fsVar instanceof zzdv) {
            zzdvVar = (zzdv) fsVar;
            int i = zzdvVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, fsVar);
            }
        } else {
            zzdvVar = new zzdv(this, fsVar);
        }
        Object obj = zzdvVar.zza;
        ft ftVar = ft.a;
        int i2 = zzdvVar.zzc;
        if (i2 == 0) {
            zi0.B(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (function1.invoke(zzdvVar) == ftVar) {
                return ftVar;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzbnVar = zzdvVar.zzd;
            zi0.B(obj);
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:25:0x0062, B:30:0x0075, B:31:0x007e), top: B:52:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzm(long j, fs fsVar) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        Exception e;
        long j2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (fsVar instanceof zzdw) {
            zzdwVar = (zzdw) fsVar;
            int i = zzdwVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, fsVar);
            }
        } else {
            zzdwVar = new zzdw(this, fsVar);
        }
        Object objZzl = zzdwVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzdwVar.zzd;
        try {
            if (i2 == 0) {
                zi0.B(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j;
                zzdwVar.zzd = 1;
                if (zzn(j, zzdwVar) != ftVar) {
                }
                return ftVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = zzdwVar.zza;
                zzecVar = zzdwVar.zze;
                try {
                    zi0.B(objZzl);
                    jLongValue = j2 - ((Number) objZzl).longValue();
                    if (jLongValue >= 500) {
                        return new Long(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e2) {
                    e = e2;
                    zzbdVar = e instanceof zzbd ? (zzbd) e : null;
                    if (zzbdVar == null) {
                        zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
                    }
                    if (Intrinsics.areEqual(zzecVar.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j = zzdwVar.zza;
            this = zzdwVar.zze;
            zi0.B(objZzl);
            zzdy zzdyVar = new zzdy(j, this, null);
            zzdwVar.zze = this;
            zzdwVar.zza = j;
            zzdwVar.zzd = 2;
            objZzl = this.zzl(zzdyVar, zzdwVar);
            if (objZzl != ftVar) {
                zzecVar = this;
                j2 = j;
                jLongValue = j2 - ((Number) objZzl).longValue();
                if (jLongValue >= 500) {
                    return new Long(jLongValue);
                }
                throw new zzbd(zzbb.zzc, zzba.zzar, null);
            }
            return ftVar;
        } catch (Exception e3) {
            zzecVar = this;
            e = e3;
            if (e instanceof zzbd) {
            }
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!Intrinsics.areEqual(zzecVar.zzf, zzcm.zzd) || Intrinsics.areEqual(zzecVar.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j, fs fsVar) {
        if (Intrinsics.areEqual(this.zzf, zzcm.zzb) || Intrinsics.areEqual(this.zzf, zzcm.zzc)) {
            return Unit.a;
        }
        if (Intrinsics.areEqual(this.zzf, zzcm.zzd) && !zzo(this.zzd)) {
            return Unit.a;
        }
        this.zzf = zzcm.zzc;
        cp cpVarA = g93.a();
        this.zzc = cpVarA;
        qt.o(this.zzg.zza(), new zzeb(this, cpVarA, j, null));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzd) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zze) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, fs fsVar) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        RecaptchaAction recaptchaAction3;
        String str3;
        double d;
        zzsc zzscVar;
        String str4;
        zzec zzecVar2;
        zzec zzecVar3 = this;
        if (fsVar instanceof zzdu) {
            zzduVar = (zzdu) fsVar;
            int i = zzduVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(zzecVar3, fsVar);
            }
        } else {
            zzduVar = new zzdu(zzecVar3, fsVar);
        }
        Object objZzm2 = zzduVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzduVar.zzd;
        try {
            if (i2 == 0) {
                zi0.B(objZzm2);
                zzduVar.zze = zzecVar3;
                str2 = str;
                zzduVar.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar.zzg = recaptchaAction2;
                zzduVar.zzd = 1;
                objZzm = zzecVar3.zzm(j, zzduVar);
                if (objZzm == ftVar) {
                }
                return ftVar;
            }
            if (i2 == 1) {
                RecaptchaAction recaptchaAction4 = zzduVar.zzg;
                String str5 = zzduVar.zzf;
                zzec zzecVar4 = zzduVar.zze;
                zi0.B(objZzm2);
                recaptchaAction2 = recaptchaAction4;
                zzecVar3 = zzecVar4;
                objZzm = objZzm2;
                str2 = str5;
            } else {
                if (i2 == 2) {
                    d = zzduVar.zza;
                    recaptchaAction3 = zzduVar.zzg;
                    str3 = zzduVar.zzf;
                    zzecVar = zzduVar.zze;
                    zi0.B(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar.zza;
                    zzscVar = zzecVar.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction3, zzsiVar, zzscVar);
                    zzduVar.zze = zzecVar;
                    zzduVar.zzf = str3;
                    zzduVar.zzg = null;
                    zzduVar.zzd = 3;
                    String str6 = str3;
                    objZzm2 = zzecVar.zza.zzm(zzspVarZzi, str6, (long) d, zzduVar);
                    str4 = str6;
                    if (objZzm2 != ftVar) {
                        zzecVar2 = zzecVar;
                    }
                    return ftVar;
                }
                if (i2 != 3) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = zzduVar.zzf;
                zzecVar2 = zzduVar.zze;
                zi0.B(objZzm2);
            }
            zzsr zzsrVar = (zzsr) objZzm2;
            zzecVar2.zza.zzq(str4, zzsrVar);
            return zzsrVar.zzj();
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar2 = zzecVar3.zza;
            double d2 = 0.45d * dLongValue;
            zzduVar.zze = zzecVar3;
            zzduVar.zzf = str2;
            zzduVar.zzg = recaptchaAction2;
            double d3 = dLongValue * 0.55d;
            zzduVar.zza = d3;
            zzduVar.zzd = 2;
            Object objZzl = zzdtVar2.zzl(str2, (long) d2, zzduVar);
            if (objZzl != ftVar) {
                zzecVar = zzecVar3;
                recaptchaAction3 = recaptchaAction2;
                str3 = str2;
                objZzm2 = objZzl;
                d = d3;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar3 = zzecVar.zza;
                zzscVar = zzecVar.zze;
                if (zzscVar == null) {
                    zzscVar = null;
                }
                zzsp zzspVarZzi2 = zzdtVar3.zzi(recaptchaAction3, zzsiVar2, zzscVar);
                zzduVar.zze = zzecVar;
                zzduVar.zzf = str3;
                zzduVar.zzg = null;
                zzduVar.zzd = 3;
                String str7 = str3;
                objZzm2 = zzecVar.zza.zzm(zzspVarZzi2, str7, (long) d, zzduVar);
                str4 = str7;
                if (objZzm2 != ftVar) {
                    zzecVar2 = zzecVar;
                    zzsr zzsrVar2 = (zzsr) objZzm2;
                    zzecVar2.zza.zzq(str4, zzsrVar2);
                    return zzsrVar2.zzj();
                }
            }
            return ftVar;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e2.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, fs fsVar) {
        Object objZzn = zzn(j, fsVar);
        return objZzn == ft.a ? objZzn : Unit.a;
    }
}
