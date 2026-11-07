package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.fs;
import defpackage.ft;
import defpackage.uq1;
import defpackage.zi0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, fs fsVar) throws zzbd {
        zzed zzedVar;
        RecaptchaAction recaptchaAction2;
        double d;
        zzef zzefVar;
        String str2;
        zzef zzefVar2 = this;
        String str3 = str;
        if (fsVar instanceof zzed) {
            zzedVar = (zzed) fsVar;
            int i = zzedVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzedVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzedVar = new zzed(zzefVar2, fsVar);
            }
        } else {
            zzedVar = new zzed(zzefVar2, fsVar);
        }
        Object objZzl = zzedVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzedVar.zzd;
        try {
            if (i2 == 0) {
                zi0.B(objZzl);
                if (!Intrinsics.areEqual(zzefVar2.zzb, zzcm.zzb)) {
                    throw new zzbd(zzbb.zzb, zzba.zzar, null);
                }
                double d2 = j;
                zzdt zzdtVar = zzefVar2.zza;
                double d3 = 0.45d * d2;
                zzedVar.zze = zzefVar2;
                zzedVar.zzf = str3;
                recaptchaAction2 = recaptchaAction;
                zzedVar.zzg = recaptchaAction2;
                d = d2 * 0.55d;
                zzedVar.zza = d;
                zzedVar.zzd = 1;
                objZzl = zzdtVar.zzl(str3, (long) d3, zzedVar);
                if (objZzl != ftVar) {
                }
                return ftVar;
            }
            if (i2 == 1) {
                double d4 = zzedVar.zza;
                recaptchaAction2 = zzedVar.zzg;
                String str4 = zzedVar.zzf;
                zzef zzefVar3 = zzedVar.zze;
                zi0.B(objZzl);
                zzefVar2 = zzefVar3;
                d = d4;
                str3 = str4;
            } else {
                if (i2 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = zzedVar.zzf;
                zzefVar = zzedVar.zze;
                zi0.B(objZzl);
            }
            zzsr zzsrVar = (zzsr) objZzl;
            zzefVar.zza.zzq(str2, zzsrVar);
            return zzsrVar.zzj();
            zzsi zzsiVar = (zzsi) objZzl;
            zzdt zzdtVar2 = zzefVar2.zza;
            zzsc zzscVar = zzefVar2.zzc;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzsp zzspVarZzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
            zzedVar.zze = zzefVar2;
            zzedVar.zzf = str3;
            zzedVar.zzg = null;
            zzedVar.zzd = 2;
            String str5 = str3;
            objZzl = zzefVar2.zza.zzm(zzspVarZzi, str5, (long) d, zzedVar);
            if (objZzl != ftVar) {
                zzefVar = zzefVar2;
                str2 = str5;
                zzsr zzsrVar2 = (zzsr) objZzl;
                zzefVar.zza.zzq(str2, zzsrVar2);
                return zzsrVar2.zzj();
            }
            return ftVar;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r11.zza.zzn(r14, (long) r12, r0) != r1) goto L34;
     */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r12, defpackage.fs r14) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            ft r1 = defpackage.ft.a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            com.google.android.recaptcha.internal.zzef r11 = r0.zze
            defpackage.zi0.B(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            goto L93
        L2c:
            r12 = move-exception
            goto L9d
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r11)
            r11 = 0
            return r11
        L36:
            double r11 = r0.zza
            com.google.android.recaptcha.internal.zzef r13 = r0.zze
            defpackage.zi0.B(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L41
            r9 = r11
            r11 = r13
            r12 = r9
            goto L82
        L41:
            r12 = move-exception
            r11 = r13
            goto L9d
        L44:
            defpackage.zi0.B(r14)
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r2)
            if (r14 != 0) goto La4
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r2)
            if (r14 == 0) goto L60
            goto La4
        L60:
            com.google.android.recaptcha.internal.zzck r14 = com.google.android.recaptcha.internal.zzcm.zzc()
            r11.zzb = r14
            double r12 = (double) r12
            com.google.android.recaptcha.internal.zzdt r14 = r11.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r5 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r5 = r5 * r12
            r0.zze = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r7 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r12 = r12 * r7
            r0.zza = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            long r4 = (long) r5     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            java.lang.Object r14 = r14.zzo(r4, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            if (r14 == r1) goto L9c
        L82:
            com.google.android.recaptcha.internal.zzsc r14 = (com.google.android.recaptcha.internal.zzsc) r14     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r11.zzc = r14     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            com.google.android.recaptcha.internal.zzdt r2 = r11.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            long r12 = (long) r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r0.zze = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r0.zzd = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            java.lang.Object r12 = r2.zzn(r14, r12, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            if (r12 == r1) goto L9c
        L93:
            com.google.android.recaptcha.internal.zzcj r12 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            r11.zzb = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2c
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L9c:
            return r1
        L9d:
            com.google.android.recaptcha.internal.zzci r13 = com.google.android.recaptcha.internal.zzcm.zza()
            r11.zzb = r13
            throw r12
        La4:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, fs):java.lang.Object");
    }
}
